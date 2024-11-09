package neton;

import com.coloros.neton.NetonException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import neton.internal.Util;
import neton.internal.connection.RealConnection;
import neton.internal.connection.RouteDatabase;
import neton.internal.connection.StreamAllocation;
import neton.internal.platform.Platform;

/* loaded from: classes.dex */
public final class ConnectionPool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Executor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
    private final Runnable cleanupRunnable;
    boolean cleanupRunning;
    private final Deque<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    final RouteDatabase routeDatabase;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: neton.ConnectionPool$1 */
    /* loaded from: classes.dex */
    public class RunnableC24791 implements Runnable {
        RunnableC24791() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long cleanup = ConnectionPool.this.cleanup(System.nanoTime());
                if (cleanup == -1) {
                    return;
                }
                if (cleanup > 0) {
                    long j = cleanup / 1000000;
                    long j2 = cleanup - (1000000 * j);
                    synchronized (ConnectionPool.this) {
                        try {
                            ConnectionPool.this.wait(j, (int) j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public ConnectionPool(int i, long j, TimeUnit timeUnit) {
        this.cleanupRunnable = new Runnable() { // from class: neton.ConnectionPool.1
            RunnableC24791() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    long cleanup = ConnectionPool.this.cleanup(System.nanoTime());
                    if (cleanup == -1) {
                        return;
                    }
                    if (cleanup > 0) {
                        long j2 = cleanup / 1000000;
                        long j22 = cleanup - (1000000 * j2);
                        synchronized (ConnectionPool.this) {
                            try {
                                ConnectionPool.this.wait(j2, (int) j22);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        };
        this.connections = new ArrayDeque();
        this.routeDatabase = new RouteDatabase();
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new NetonException(new IllegalArgumentException("keepAliveDuration <= 0: ".concat(String.valueOf(j))));
        }
    }

    public final synchronized int idleConnectionCount() {
        int i;
        i = 0;
        Iterator<RealConnection> it = this.connections.iterator();
        while (it.hasNext()) {
            if (it.next().allocations.isEmpty()) {
                i++;
            }
        }
        return i;
    }

    public final synchronized int connectionCount() {
        return this.connections.size();
    }

    public final RealConnection get(Address address, StreamAllocation streamAllocation, Route route) {
        for (RealConnection realConnection : this.connections) {
            if (realConnection.isEligible(address, route)) {
                streamAllocation.acquire(realConnection);
                return realConnection;
            }
        }
        return null;
    }

    public final Socket deduplicate(Address address, StreamAllocation streamAllocation) {
        for (RealConnection realConnection : this.connections) {
            if (realConnection.isEligible(address, null) && realConnection.isMultiplexed() && realConnection != streamAllocation.connection()) {
                return streamAllocation.releaseAndAcquire(realConnection);
            }
        }
        return null;
    }

    public final void put(RealConnection realConnection) {
        if (!this.cleanupRunning) {
            this.cleanupRunning = true;
            executor.execute(this.cleanupRunnable);
        }
        this.connections.add(realConnection);
    }

    public final boolean connectionBecameIdle(RealConnection realConnection) {
        if (realConnection.noNewStreams || this.maxIdleConnections == 0) {
            this.connections.remove(realConnection);
            return true;
        }
        notifyAll();
        return false;
    }

    public final void evictAll() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealConnection> it = this.connections.iterator();
            while (it.hasNext()) {
                RealConnection next = it.next();
                if (next.allocations.isEmpty()) {
                    next.noNewStreams = true;
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Util.closeQuietly(((RealConnection) it2.next()).socket());
        }
    }

    final long cleanup(long j) {
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            int i = 0;
            RealConnection realConnection = null;
            int i2 = 0;
            for (RealConnection realConnection2 : this.connections) {
                if (pruneAndGetAllocationCount(realConnection2, j) > 0) {
                    i++;
                } else {
                    i2++;
                    long j3 = j - realConnection2.idleAtNanos;
                    if (j3 > j2) {
                        realConnection = realConnection2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.keepAliveDurationNs && i2 <= this.maxIdleConnections) {
                if (i2 > 0) {
                    return this.keepAliveDurationNs - j2;
                }
                if (i > 0) {
                    return this.keepAliveDurationNs;
                }
                this.cleanupRunning = false;
                return -1L;
            }
            this.connections.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            return 0L;
        }
    }

    private int pruneAndGetAllocationCount(RealConnection realConnection, long j) {
        List<Reference<StreamAllocation>> list = realConnection.allocations;
        int i = 0;
        while (i < list.size()) {
            Reference<StreamAllocation> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Platform.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((StreamAllocation.StreamAllocationReference) reference).callStackTrace);
                list.remove(i);
                realConnection.noNewStreams = true;
                if (list.isEmpty()) {
                    realConnection.idleAtNanos = j - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return list.size();
    }
}