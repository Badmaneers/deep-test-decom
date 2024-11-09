package neton.internal.http2;

import com.coloros.neton.NetonException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import neton.Protocol;
import neton.internal.NamedRunnable;
import neton.internal.Util;
import neton.internal.http2.Http2Reader;
import neton.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* loaded from: classes.dex */
public final class Http2Connection implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    static final ExecutorService executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Http2Connection", true));
    long bytesLeftInWriteWindow;
    final boolean client;
    final String hostname;
    int lastGoodStreamId;
    final Listener listener;
    private int nextPingId;
    int nextStreamId;
    private Map<Integer, Ping> pings;
    private final ExecutorService pushExecutor;
    final PushObserver pushObserver;
    final ReaderRunnable readerRunnable;
    boolean shutdown;
    final Socket socket;
    final Http2Writer writer;
    final Map<Integer, Http2Stream> streams = new LinkedHashMap();
    long unacknowledgedBytesRead = 0;
    Settings okHttpSettings = new Settings();
    final Settings peerSettings = new Settings();
    boolean receivedInitialPeerSettings = false;
    final Set<Integer> currentPushRequests = new LinkedHashSet();

    /* loaded from: classes.dex */
    public abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: neton.internal.http2.Http2Connection.Listener.1
            @Override // neton.internal.http2.Http2Connection.Listener
            public final void onStream(Http2Stream http2Stream) {
                http2Stream.close(ErrorCode.REFUSED_STREAM);
            }
        };

        public void onSettings(Http2Connection http2Connection) {
        }

        public abstract void onStream(Http2Stream http2Stream);
    }

    final boolean pushedStream(int i) {
        return i != 0 && (i & 1) == 0;
    }

    Http2Connection(Builder builder) {
        this.pushObserver = builder.pushObserver;
        this.client = builder.client;
        this.listener = builder.listener;
        this.nextStreamId = builder.client ? 1 : 2;
        if (builder.client) {
            this.nextStreamId += 2;
        }
        this.nextPingId = builder.client ? 1 : 2;
        if (builder.client) {
            this.okHttpSettings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.hostname = builder.hostname;
        this.pushExecutor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(Util.format("OkHttp %s Push Observer", this.hostname), true));
        this.peerSettings.set(7, 65535);
        this.peerSettings.set(5, 16384);
        this.bytesLeftInWriteWindow = this.peerSettings.getInitialWindowSize();
        this.socket = builder.socket;
        this.writer = new Http2Writer(builder.sink, this.client);
        this.readerRunnable = new ReaderRunnable(new Http2Reader(builder.source, this.client));
    }

    public final Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    final synchronized Http2Stream getStream(int i) {
        return this.streams.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Http2Stream removeStream(int i) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final synchronized int maxConcurrentStreams() {
        return this.peerSettings.getMaxConcurrentStreams(Integer.MAX_VALUE);
    }

    public final Http2Stream pushStream(int i, List<Header> list, boolean z) {
        if (this.client) {
            throw new NetonException(new IllegalStateException("Client cannot push requests."));
        }
        return newStream(i, list, z);
    }

    public final Http2Stream newStream(List<Header> list, boolean z) {
        return newStream(0, list, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: all -> 0x006e, TryCatch #1 {, blocks: (B:6:0x0006, B:8:0x000a, B:10:0x001f, B:12:0x0027, B:16:0x0031, B:18:0x0037, B:19:0x0040, B:33:0x0068, B:34:0x006d), top: B:5:0x0006, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private neton.internal.http2.Http2Stream newStream(int r11, java.util.List<neton.internal.http2.Header> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            neton.internal.http2.Http2Writer r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L71
            boolean r0 = r10.shutdown     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L68
            int r8 = r10.nextStreamId     // Catch: java.lang.Throwable -> L6e
            int r0 = r10.nextStreamId     // Catch: java.lang.Throwable -> L6e
            int r0 = r0 + 2
            r10.nextStreamId = r0     // Catch: java.lang.Throwable -> L6e
            neton.internal.http2.Http2Stream r9 = new neton.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L6e
            r4 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6e
            if (r13 == 0) goto L30
            long r0 = r10.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L30
            long r0 = r9.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L6e
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L2e
            goto L30
        L2e:
            r13 = 0
            goto L31
        L30:
            r13 = 1
        L31:
            boolean r0 = r9.isOpen()     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L40
            java.util.Map<java.lang.Integer, neton.internal.http2.Http2Stream> r0 = r10.streams     // Catch: java.lang.Throwable -> L6e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L6e
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L6e
        L40:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6e
            if (r11 != 0) goto L49
            neton.internal.http2.Http2Writer r0 = r10.writer     // Catch: java.lang.Throwable -> L71
            r0.synStream(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L71
            goto L52
        L49:
            boolean r0 = r10.client     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L5b
            neton.internal.http2.Http2Writer r0 = r10.writer     // Catch: java.lang.Throwable -> L71
            r0.pushPromise(r11, r8, r12)     // Catch: java.lang.Throwable -> L71
        L52:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L71
            if (r13 == 0) goto L5a
            neton.internal.http2.Http2Writer r10 = r10.writer
            r10.flush()
        L5a:
            return r9
        L5b:
            com.coloros.neton.NetonException r10 = new com.coloros.neton.NetonException     // Catch: java.lang.Throwable -> L71
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L71
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L71
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L71
            throw r10     // Catch: java.lang.Throwable -> L71
        L68:
            neton.internal.http2.ConnectionShutdownException r11 = new neton.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L6e
            r11.<init>()     // Catch: java.lang.Throwable -> L6e
            throw r11     // Catch: java.lang.Throwable -> L6e
        L6e:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6e
            throw r11     // Catch: java.lang.Throwable -> L71
        L71:
            r10 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L71
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: neton.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):neton.internal.http2.Http2Stream");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeSynReply(int i, boolean z, List<Header> list) {
        this.writer.synReply(z, i, list);
    }

    public final void writeData(int i, boolean z, Buffer buffer, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.writer.data(z, i, buffer, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (this.bytesLeftInWriteWindow <= 0) {
                    try {
                        if (!this.streams.containsKey(Integer.valueOf(i))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, this.bytesLeftInWriteWindow), this.writer.maxDataLength());
                j2 = min;
                this.bytesLeftInWriteWindow -= j2;
            }
            j -= j2;
            this.writer.data(z && j == 0, i, buffer, min);
        }
    }

    final void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeSynResetLater(final int i, final ErrorCode errorCode) {
        executor.execute(new NamedRunnable("OkHttp %s stream %d", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: neton.internal.http2.Http2Connection.1
            @Override // neton.internal.NamedRunnable
            public void execute() {
                try {
                    Http2Connection.this.writeSynReset(i, errorCode);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeSynReset(int i, ErrorCode errorCode) {
        this.writer.rstStream(i, errorCode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeWindowUpdateLater(final int i, final long j) {
        executor.execute(new NamedRunnable("OkHttp Window Update %s stream %d", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: neton.internal.http2.Http2Connection.2
            @Override // neton.internal.NamedRunnable
            public void execute() {
                try {
                    Http2Connection.this.writer.windowUpdate(i, j);
                } catch (IOException unused) {
                }
            }
        });
    }

    public final Ping ping() {
        int i;
        Ping ping = new Ping();
        synchronized (this) {
            if (this.shutdown) {
                throw new ConnectionShutdownException();
            }
            i = this.nextPingId;
            this.nextPingId += 2;
            if (this.pings == null) {
                this.pings = new LinkedHashMap();
            }
            this.pings.put(Integer.valueOf(i), ping);
        }
        writePing(false, i, 1330343787, ping);
        return ping;
    }

    final void writePingLater(final boolean z, final int i, final int i2, final Ping ping) {
        executor.execute(new NamedRunnable("OkHttp %s ping %08x%08x", new Object[]{this.hostname, Integer.valueOf(i), Integer.valueOf(i2)}) { // from class: neton.internal.http2.Http2Connection.3
            @Override // neton.internal.NamedRunnable
            public void execute() {
                try {
                    Http2Connection.this.writePing(z, i, i2, ping);
                } catch (IOException unused) {
                }
            }
        });
    }

    final void writePing(boolean z, int i, int i2, Ping ping) {
        synchronized (this.writer) {
            if (ping != null) {
                try {
                    ping.send();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.writer.ping(z, i, i2);
        }
    }

    final synchronized Ping removePing(int i) {
        if (this.pings == null) {
            return null;
        }
        return this.pings.remove(Integer.valueOf(i));
    }

    public final void flush() {
        this.writer.flush();
    }

    public final void shutdown(ErrorCode errorCode) {
        synchronized (this.writer) {
            synchronized (this) {
                if (this.shutdown) {
                    return;
                }
                this.shutdown = true;
                this.writer.goAway(this.lastGoodStreamId, errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    final void close(ErrorCode errorCode, ErrorCode errorCode2) {
        Http2Stream[] http2StreamArr;
        Ping[] pingArr = null;
        try {
            shutdown(errorCode);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (this.streams.isEmpty()) {
                http2StreamArr = null;
            } else {
                http2StreamArr = (Http2Stream[]) this.streams.values().toArray(new Http2Stream[this.streams.size()]);
                this.streams.clear();
            }
            if (this.pings != null) {
                Ping[] pingArr2 = (Ping[]) this.pings.values().toArray(new Ping[this.pings.size()]);
                this.pings = null;
                pingArr = pingArr2;
            }
        }
        if (http2StreamArr != null) {
            IOException iOException = e;
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2);
                } catch (IOException e2) {
                    if (iOException != null) {
                        iOException = e2;
                    }
                }
            }
            e = iOException;
        }
        if (pingArr != null) {
            for (Ping ping : pingArr) {
                ping.cancel();
            }
        }
        try {
            this.writer.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.socket.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    public final void start() {
        start(true);
    }

    final void start(boolean z) {
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r6 - 65535);
            }
        }
        new Thread(this.readerRunnable).start();
    }

    public final void setSettings(Settings settings) {
        synchronized (this.writer) {
            synchronized (this) {
                if (this.shutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                this.writer.settings(settings);
            }
        }
    }

    public final synchronized boolean isShutdown() {
        return this.shutdown;
    }

    /* loaded from: classes.dex */
    public class Builder {
        boolean client;
        String hostname;
        Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        PushObserver pushObserver = PushObserver.CANCEL;
        BufferedSink sink;
        Socket socket;
        BufferedSource source;

        public Builder(boolean z) {
            this.client = z;
        }

        public Builder socket(Socket socket) {
            return socket(socket, ((InetSocketAddress) socket.getRemoteSocketAddress()).getHostName(), Okio.buffer(Okio.source(socket)), Okio.buffer(Okio.sink(socket)));
        }

        public Builder socket(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.socket = socket;
            this.hostname = str;
            this.source = bufferedSource;
            this.sink = bufferedSink;
            return this;
        }

        public Builder listener(Listener listener) {
            this.listener = listener;
            return this;
        }

        public Builder pushObserver(PushObserver pushObserver) {
            this.pushObserver = pushObserver;
            return this;
        }

        public Http2Connection build() {
            return new Http2Connection(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ReaderRunnable extends NamedRunnable implements Http2Reader.Handler {
        final Http2Reader reader;

        @Override // neton.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // neton.internal.http2.Http2Reader.Handler
        public void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j) {
        }

        @Override // neton.internal.http2.Http2Reader.Handler
        public void priority(int i, int i2, int i3, boolean z) {
        }

        ReaderRunnable(Http2Reader http2Reader) {
            super("OkHttp %s", Http2Connection.this.hostname);
            this.reader = http2Reader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [neton.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v4, types: [neton.internal.http2.Http2Connection] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // neton.internal.NamedRunnable
        protected void execute() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    do {
                    } while (this.reader.nextFrame(false, this));
                    errorCode = ErrorCode.NO_ERROR;
                    try {
                        try {
                            errorCode2 = ErrorCode.CANCEL;
                            errorCode3 = Http2Connection.this;
                        } catch (Throwable th) {
                            ErrorCode errorCode4 = errorCode;
                            th = th;
                            errorCode2 = errorCode4;
                            try {
                                Http2Connection.this.close(errorCode2, errorCode3);
                            } catch (IOException unused) {
                            }
                            Util.closeQuietly(this.reader);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        errorCode = ErrorCode.PROTOCOL_ERROR;
                        errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        errorCode3 = Http2Connection.this;
                        errorCode3.close(errorCode, errorCode2);
                        Util.closeQuietly(this.reader);
                    }
                } catch (IOException unused3) {
                }
                errorCode3.close(errorCode, errorCode2);
                Util.closeQuietly(this.reader);
            } catch (Throwable th2) {
                th = th2;
                Http2Connection.this.close(errorCode2, errorCode3);
                Util.closeQuietly(this.reader);
                throw th;
            }
        }

        @Override // neton.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i, BufferedSource bufferedSource, int i2) {
            if (Http2Connection.this.pushedStream(i)) {
                Http2Connection.this.pushDataLater(i, bufferedSource, i2, z);
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i);
            if (stream == null) {
                Http2Connection.this.writeSynResetLater(i, ErrorCode.PROTOCOL_ERROR);
                bufferedSource.skip(i2);
            } else {
                stream.receiveData(bufferedSource, i2);
                if (z) {
                    stream.receiveFin();
                }
            }
        }

        @Override // neton.internal.http2.Http2Reader.Handler
        public void headers(boolean z, int i, int i2, List<Header> list) {
            if (Http2Connection.this.pushedStream(i)) {
                Http2Connection.this.pushHeadersLater(i, list, z);
                return;
            }
            synchronized (Http2Connection.this) {
                if (Http2Connection.this.shutdown) {
                    return;
                }
                Http2Stream stream = Http2Connection.this.getStream(i);
                if (stream == null) {
                    if (i <= Http2Connection.this.lastGoodStreamId) {
                        return;
                    }
                    if (i % 2 == Http2Connection.this.nextStreamId % 2) {
                        return;
                    }
                    final Http2Stream http2Stream = new Http2Stream(i, Http2Connection.this, false, z, list);
                    Http2Connection.this.lastGoodStreamId = i;
                    Http2Connection.this.streams.put(Integer.valueOf(i), http2Stream);
                    Http2Connection.executor.execute(new NamedRunnable("OkHttp %s stream %d", new Object[]{Http2Connection.this.hostname, Integer.valueOf(i)}) { // from class: neton.internal.http2.Http2Connection.ReaderRunnable.1
                        @Override // neton.internal.NamedRunnable
                        public void execute() {
                            try {
                                Http2Connection.this.listener.onStream(http2Stream);
                            } catch (IOException e) {
                                Platform.get().log(4, "Http2Connection.Listener failure for " + Http2Connection.this.hostname, e);
                                try {
                                    http2Stream.close(ErrorCode.PROTOCOL_ERROR);
                                } catch (IOException unused) {
                                }
                            }
                        }
                    });
                    return;
                }
                stream.receiveHeaders(list);
                if (z) {
                    stream.receiveFin();
                }
            }
        }

        @Override // neton.internal.http2.Http2Reader.Handler
        public void rstStream(int i, ErrorCode errorCode) {
            if (Http2Connection.this.pushedStream(i)) {
                Http2Connection.this.pushResetLater(i, errorCode);
                return;
            }
            Http2Stream removeStream = Http2Connection.this.removeStream(i);
            if (removeStream != null) {
                removeStream.receiveRstStream(errorCode);
            }
        }

        @Override // neton.internal.http2.Http2Reader.Handler
        public void settings(boolean z, Settings settings) {
            Http2Stream[] http2StreamArr;
            long j;
            int i;
            synchronized (Http2Connection.this) {
                int initialWindowSize = Http2Connection.this.peerSettings.getInitialWindowSize();
                if (z) {
                    Http2Connection.this.peerSettings.clear();
                }
                Http2Connection.this.peerSettings.merge(settings);
                applyAndAckSettings(settings);
                int initialWindowSize2 = Http2Connection.this.peerSettings.getInitialWindowSize();
                http2StreamArr = null;
                if (initialWindowSize2 == -1 || initialWindowSize2 == initialWindowSize) {
                    j = 0;
                } else {
                    j = initialWindowSize2 - initialWindowSize;
                    if (!Http2Connection.this.receivedInitialPeerSettings) {
                        Http2Connection.this.addBytesToWriteWindow(j);
                        Http2Connection.this.receivedInitialPeerSettings = true;
                    }
                    if (!Http2Connection.this.streams.isEmpty()) {
                        http2StreamArr = (Http2Stream[]) Http2Connection.this.streams.values().toArray(new Http2Stream[Http2Connection.this.streams.size()]);
                    }
                }
                Http2Connection.executor.execute(new NamedRunnable("OkHttp %s settings", Http2Connection.this.hostname) { // from class: neton.internal.http2.Http2Connection.ReaderRunnable.2
                    @Override // neton.internal.NamedRunnable
                    public void execute() {
                        Http2Connection.this.listener.onSettings(Http2Connection.this);
                    }
                });
            }
            if (http2StreamArr == null || j == 0) {
                return;
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                synchronized (http2Stream) {
                    http2Stream.addBytesToWriteWindow(j);
                }
            }
        }

        private void applyAndAckSettings(final Settings settings) {
            Http2Connection.executor.execute(new NamedRunnable("OkHttp %s ACK Settings", new Object[]{Http2Connection.this.hostname}) { // from class: neton.internal.http2.Http2Connection.ReaderRunnable.3
                @Override // neton.internal.NamedRunnable
                public void execute() {
                    try {
                        Http2Connection.this.writer.applyAndAckSettings(settings);
                    } catch (IOException unused) {
                    }
                }
            });
        }

        @Override // neton.internal.http2.Http2Reader.Handler
        public void ping(boolean z, int i, int i2) {
            if (z) {
                Ping removePing = Http2Connection.this.removePing(i);
                if (removePing != null) {
                    removePing.receive();
                    return;
                }
                return;
            }
            Http2Connection.this.writePingLater(true, i, i2, null);
        }

        @Override // neton.internal.http2.Http2Reader.Handler
        public void goAway(int i, ErrorCode errorCode, ByteString byteString) {
            Http2Stream[] http2StreamArr;
            byteString.size();
            synchronized (Http2Connection.this) {
                http2StreamArr = (Http2Stream[]) Http2Connection.this.streams.values().toArray(new Http2Stream[Http2Connection.this.streams.size()]);
                Http2Connection.this.shutdown = true;
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    Http2Connection.this.removeStream(http2Stream.getId());
                }
            }
        }

        @Override // neton.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (Http2Connection.this) {
                    Http2Connection.this.bytesLeftInWriteWindow += j;
                    Http2Connection.this.notifyAll();
                }
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                }
            }
        }

        @Override // neton.internal.http2.Http2Reader.Handler
        public void pushPromise(int i, int i2, List<Header> list) {
            Http2Connection.this.pushRequestLater(i2, list);
        }
    }

    final void pushRequestLater(final int i, final List<Header> list) {
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater(i, ErrorCode.PROTOCOL_ERROR);
            } else {
                this.currentPushRequests.add(Integer.valueOf(i));
                this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Request[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: neton.internal.http2.Http2Connection.4
                    @Override // neton.internal.NamedRunnable
                    public void execute() {
                        if (Http2Connection.this.pushObserver.onRequest(i, list)) {
                            try {
                                Http2Connection.this.writer.rstStream(i, ErrorCode.CANCEL);
                                synchronized (Http2Connection.this) {
                                    Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    final void pushHeadersLater(final int i, final List<Header> list, final boolean z) {
        this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Headers[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: neton.internal.http2.Http2Connection.5
            @Override // neton.internal.NamedRunnable
            public void execute() {
                boolean onHeaders = Http2Connection.this.pushObserver.onHeaders(i, list, z);
                if (onHeaders) {
                    try {
                        Http2Connection.this.writer.rstStream(i, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return;
                    }
                }
                if (!onHeaders && !z) {
                    return;
                }
                synchronized (Http2Connection.this) {
                    Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                }
            }
        });
    }

    final void pushDataLater(final int i, BufferedSource bufferedSource, final int i2, final boolean z) {
        final Buffer buffer = new Buffer();
        long j = i2;
        bufferedSource.require(j);
        bufferedSource.read(buffer, j);
        if (buffer.size() != j) {
            throw new IOException(buffer.size() + " != " + i2);
        }
        this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Data[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: neton.internal.http2.Http2Connection.6
            @Override // neton.internal.NamedRunnable
            public void execute() {
                try {
                    boolean onData = Http2Connection.this.pushObserver.onData(i, buffer, i2, z);
                    if (onData) {
                        Http2Connection.this.writer.rstStream(i, ErrorCode.CANCEL);
                    }
                    if (!onData && !z) {
                        return;
                    }
                    synchronized (Http2Connection.this) {
                        Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
            }
        });
    }

    final void pushResetLater(final int i, final ErrorCode errorCode) {
        this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Reset[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) { // from class: neton.internal.http2.Http2Connection.7
            @Override // neton.internal.NamedRunnable
            public void execute() {
                Http2Connection.this.pushObserver.onReset(i, errorCode);
                synchronized (Http2Connection.this) {
                    Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                }
            }
        });
    }
}