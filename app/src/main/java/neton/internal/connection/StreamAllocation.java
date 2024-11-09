package neton.internal.connection;

import com.coloros.neton.NetonException;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import neton.Address;
import neton.Call;
import neton.ConnectionPool;
import neton.EventListener;
import neton.Interceptor;
import neton.OkHttpClient;
import neton.Route;
import neton.internal.Internal;
import neton.internal.Util;
import neton.internal.connection.RouteSelector;
import neton.internal.http.HttpCodec;
import neton.internal.http2.ConnectionShutdownException;
import neton.internal.http2.ErrorCode;
import neton.internal.http2.StreamResetException;

/* loaded from: classes.dex */
public final class StreamAllocation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final Address address;
    public final Call call;
    private final Object callStackTrace;
    private boolean canceled;
    private HttpCodec codec;
    private RealConnection connection;
    private final ConnectionPool connectionPool;
    public final EventListener eventListener;
    private int refusedStreamCount;
    private boolean released;
    private Route route;
    private RouteSelector.Selection routeSelection;
    private final RouteSelector routeSelector;

    public StreamAllocation(ConnectionPool connectionPool, Address address, Call call, EventListener eventListener, Object obj) {
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
        this.routeSelector = new RouteSelector(address, routeDatabase(), call, eventListener);
        this.callStackTrace = obj;
    }

    public final HttpCodec newStream(OkHttpClient okHttpClient, Interceptor.Chain chain, boolean z) {
        try {
            HttpCodec newCodec = findHealthyConnection(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.retryOnConnectionFailure(), z).newCodec(okHttpClient, chain, this);
            synchronized (this.connectionPool) {
                this.codec = newCodec;
            }
            return newCodec;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    private RealConnection findHealthyConnection(int i, int i2, int i3, boolean z, boolean z2) {
        while (true) {
            RealConnection findConnection = findConnection(i, i2, i3, z);
            synchronized (this.connectionPool) {
                if (findConnection.successCount == 0) {
                    return findConnection;
                }
                if (findConnection.isHealthy(z2)) {
                    return findConnection;
                }
                noNewStreams();
            }
        }
    }

    private RealConnection findConnection(int i, int i2, int i3, boolean z) {
        Route route;
        boolean z2;
        RealConnection realConnection;
        boolean z3;
        synchronized (this.connectionPool) {
            if (this.released) {
                throw new NetonException(new IllegalStateException("released"));
            }
            if (this.codec != null) {
                throw new NetonException(new IllegalStateException("codec != null"));
            }
            if (this.canceled) {
                throw new IOException("Canceled");
            }
            RealConnection realConnection2 = this.connection;
            if (realConnection2 != null && !realConnection2.noNewStreams) {
                return realConnection2;
            }
            Socket socket = null;
            Internal.instance.get(this.connectionPool, this.address, this, null);
            if (this.connection != null) {
                realConnection = this.connection;
                z2 = true;
                route = null;
            } else {
                route = this.route;
                z2 = false;
                realConnection = null;
            }
            if (z2) {
                this.eventListener.connectionAcquired(this.call, realConnection);
                return realConnection;
            }
            if (route != null || (this.routeSelection != null && this.routeSelection.hasNext())) {
                z3 = false;
            } else {
                this.routeSelection = this.routeSelector.next();
                z3 = true;
            }
            synchronized (this.connectionPool) {
                if (this.canceled) {
                    throw new IOException("Canceled");
                }
                if (z3) {
                    List<Route> all = this.routeSelection.getAll();
                    int size = all.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        Route route2 = all.get(i4);
                        Internal.instance.get(this.connectionPool, this.address, this, route2);
                        if (this.connection != null) {
                            realConnection = this.connection;
                            this.route = route2;
                            z2 = true;
                            break;
                        }
                        i4++;
                    }
                }
                if (!z2) {
                    if (route == null) {
                        route = this.routeSelection.next();
                    }
                    this.route = route;
                    this.refusedStreamCount = 0;
                    realConnection = new RealConnection(this.connectionPool, route);
                    acquire(realConnection);
                }
            }
            this.eventListener.connectionAcquired(this.call, realConnection);
            if (z2) {
                return realConnection;
            }
            realConnection.connect(i, i2, i3, z, this.call, this.eventListener);
            routeDatabase().connected(realConnection.route());
            synchronized (this.connectionPool) {
                Internal.instance.put(this.connectionPool, realConnection);
                if (realConnection.isMultiplexed()) {
                    socket = Internal.instance.deduplicate(this.connectionPool, this.address, this);
                    realConnection = this.connection;
                }
            }
            Util.closeQuietly(socket);
            return realConnection;
        }
    }

    public final void streamFinished(boolean z, HttpCodec httpCodec) {
        RealConnection realConnection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            if (httpCodec != null) {
                if (httpCodec == this.codec) {
                    if (!z) {
                        this.connection.successCount++;
                    }
                    realConnection = this.connection;
                    deallocate = deallocate(z, false, true);
                    if (this.connection != null) {
                        realConnection = null;
                    }
                }
            }
            throw new NetonException(new IllegalStateException("expected " + this.codec + " but was " + httpCodec));
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public final HttpCodec codec() {
        HttpCodec httpCodec;
        synchronized (this.connectionPool) {
            httpCodec = this.codec;
        }
        return httpCodec;
    }

    private RouteDatabase routeDatabase() {
        return Internal.instance.routeDatabase(this.connectionPool);
    }

    public final synchronized RealConnection connection() {
        return this.connection;
    }

    public final void release() {
        RealConnection realConnection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            realConnection = this.connection;
            deallocate = deallocate(false, true, false);
            if (this.connection != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public final void noNewStreams() {
        RealConnection realConnection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            realConnection = this.connection;
            deallocate = deallocate(true, false, false);
            if (this.connection != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    private Socket deallocate(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.codec = null;
        }
        if (z2) {
            this.released = true;
        }
        if (this.connection != null) {
            if (z) {
                this.connection.noNewStreams = true;
            }
            if (this.codec == null && (this.released || this.connection.noNewStreams)) {
                release(this.connection);
                if (this.connection.allocations.isEmpty()) {
                    this.connection.idleAtNanos = System.nanoTime();
                    if (Internal.instance.connectionBecameIdle(this.connectionPool, this.connection)) {
                        socket = this.connection.socket();
                        this.connection = null;
                        return socket;
                    }
                }
                socket = null;
                this.connection = null;
                return socket;
            }
        }
        return null;
    }

    public final void cancel() {
        HttpCodec httpCodec;
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            this.canceled = true;
            httpCodec = this.codec;
            realConnection = this.connection;
        }
        if (httpCodec != null) {
            httpCodec.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public final void streamFailed(IOException iOException) {
        boolean z;
        RealConnection realConnection;
        Socket deallocate;
        synchronized (this.connectionPool) {
            if (iOException instanceof StreamResetException) {
                StreamResetException streamResetException = (StreamResetException) iOException;
                if (streamResetException.errorCode == ErrorCode.REFUSED_STREAM) {
                    this.refusedStreamCount++;
                }
                if (streamResetException.errorCode != ErrorCode.REFUSED_STREAM || this.refusedStreamCount > 1) {
                    this.route = null;
                    z = true;
                }
                z = false;
            } else {
                if (this.connection != null && (!this.connection.isMultiplexed() || (iOException instanceof ConnectionShutdownException))) {
                    if (this.connection.successCount == 0) {
                        if (this.route != null && iOException != null) {
                            this.routeSelector.connectFailed(this.route, iOException);
                        }
                        this.route = null;
                    }
                    z = true;
                }
                z = false;
            }
            realConnection = this.connection;
            deallocate = deallocate(z, false, true);
            if (this.connection != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public final void acquire(RealConnection realConnection) {
        if (this.connection != null) {
            throw new NetonException(new IllegalStateException());
        }
        this.connection = realConnection;
        realConnection.allocations.add(new StreamAllocationReference(this, this.callStackTrace));
    }

    private void release(RealConnection realConnection) {
        int size = realConnection.allocations.size();
        for (int i = 0; i < size; i++) {
            if (realConnection.allocations.get(i).get() == this) {
                realConnection.allocations.remove(i);
                return;
            }
        }
        throw new NetonException(new IllegalStateException());
    }

    public final Socket releaseAndAcquire(RealConnection realConnection) {
        if (this.codec != null || this.connection.allocations.size() != 1) {
            throw new NetonException(new IllegalStateException());
        }
        Reference<StreamAllocation> reference = this.connection.allocations.get(0);
        Socket deallocate = deallocate(true, false, false);
        this.connection = realConnection;
        realConnection.allocations.add(reference);
        return deallocate;
    }

    public final boolean hasMoreRoutes() {
        if (this.route == null) {
            return (this.routeSelection != null && this.routeSelection.hasNext()) || this.routeSelector.hasNext();
        }
        return true;
    }

    public final String toString() {
        RealConnection connection = connection();
        return connection != null ? connection.toString() : this.address.toString();
    }

    /* loaded from: classes.dex */
    public final class StreamAllocationReference extends WeakReference<StreamAllocation> {
        public final Object callStackTrace;

        StreamAllocationReference(StreamAllocation streamAllocation, Object obj) {
            super(streamAllocation);
            this.callStackTrace = obj;
        }
    }
}
