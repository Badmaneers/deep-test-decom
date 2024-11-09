package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class AsyncTimeout extends Timeout {
    private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @Nullable
    static AsyncTimeout head;
    private boolean inQueue;

    @Nullable
    private AsyncTimeout next;
    private long timeoutAt;

    protected void timedOut() {
    }

    public final void enter() {
        if (this.inQueue) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            this.inQueue = true;
            scheduleTimeout(this, timeoutNanos, hasDeadline);
        }
    }

    private static synchronized void scheduleTimeout(AsyncTimeout asyncTimeout, long j, boolean z) {
        synchronized (AsyncTimeout.class) {
            if (head == null) {
                head = new AsyncTimeout();
                new Watchdog().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                asyncTimeout.timeoutAt = Math.min(j, asyncTimeout.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (j != 0) {
                asyncTimeout.timeoutAt = j + nanoTime;
            } else if (z) {
                asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = asyncTimeout.remainingNanos(nanoTime);
            AsyncTimeout asyncTimeout2 = head;
            while (asyncTimeout2.next != null && remainingNanos >= asyncTimeout2.next.remainingNanos(nanoTime)) {
                asyncTimeout2 = asyncTimeout2.next;
            }
            asyncTimeout.next = asyncTimeout2.next;
            asyncTimeout2.next = asyncTimeout;
            if (asyncTimeout2 == head) {
                AsyncTimeout.class.notify();
            }
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    private static synchronized boolean cancelScheduledTimeout(AsyncTimeout asyncTimeout) {
        synchronized (AsyncTimeout.class) {
            for (AsyncTimeout asyncTimeout2 = head; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.next) {
                if (asyncTimeout2.next == asyncTimeout) {
                    asyncTimeout2.next = asyncTimeout.next;
                    asyncTimeout.next = null;
                    return false;
                }
            }
            return true;
        }
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: okio.AsyncTimeout$1 */
    /* loaded from: classes.dex */
    public class C25291 implements Sink {
        final /* synthetic */ Sink val$sink;

        C25291(Sink sink) {
            r2 = sink;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            Util.checkOffsetAndCount(buffer.size, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                while (true) {
                    if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j2 += buffer.head.limit - buffer.head.pos;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                }
                AsyncTimeout.this.enter();
                try {
                    try {
                        r2.write(buffer, j2);
                        j -= j2;
                        AsyncTimeout.this.exit(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            AsyncTimeout.this.enter();
            try {
                try {
                    r2.flush();
                    AsyncTimeout.this.exit(true);
                } catch (IOException e) {
                    throw AsyncTimeout.this.exit(e);
                }
            } catch (Throwable th) {
                AsyncTimeout.this.exit(false);
                throw th;
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            AsyncTimeout.this.enter();
            try {
                try {
                    r2.close();
                    AsyncTimeout.this.exit(true);
                } catch (IOException e) {
                    throw AsyncTimeout.this.exit(e);
                }
            } catch (Throwable th) {
                AsyncTimeout.this.exit(false);
                throw th;
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return AsyncTimeout.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + r2 + ")";
        }
    }

    public final Sink sink(Sink sink) {
        return new Sink() { // from class: okio.AsyncTimeout.1
            final /* synthetic */ Sink val$sink;

            C25291(Sink sink2) {
                r2 = sink2;
            }

            @Override // okio.Sink
            public void write(Buffer buffer, long j) {
                Util.checkOffsetAndCount(buffer.size, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    while (true) {
                        if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                            break;
                        }
                        j2 += buffer.head.limit - buffer.head.pos;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                    }
                    AsyncTimeout.this.enter();
                    try {
                        try {
                            r2.write(buffer, j2);
                            j -= j2;
                            AsyncTimeout.this.exit(true);
                        } catch (IOException e) {
                            throw AsyncTimeout.this.exit(e);
                        }
                    } catch (Throwable th) {
                        AsyncTimeout.this.exit(false);
                        throw th;
                    }
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                AsyncTimeout.this.enter();
                try {
                    try {
                        r2.flush();
                        AsyncTimeout.this.exit(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                AsyncTimeout.this.enter();
                try {
                    try {
                        r2.close();
                        AsyncTimeout.this.exit(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.Sink
            public Timeout timeout() {
                return AsyncTimeout.this;
            }

            public String toString() {
                return "AsyncTimeout.sink(" + r2 + ")";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: okio.AsyncTimeout$2 */
    /* loaded from: classes.dex */
    public class C25302 implements Source {
        final /* synthetic */ Source val$source;

        C25302(Source source) {
            r2 = source;
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            AsyncTimeout.this.enter();
            try {
                try {
                    long read = r2.read(buffer, j);
                    AsyncTimeout.this.exit(true);
                    return read;
                } catch (IOException e) {
                    throw AsyncTimeout.this.exit(e);
                }
            } catch (Throwable th) {
                AsyncTimeout.this.exit(false);
                throw th;
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                try {
                    r2.close();
                    AsyncTimeout.this.exit(true);
                } catch (IOException e) {
                    throw AsyncTimeout.this.exit(e);
                }
            } catch (Throwable th) {
                AsyncTimeout.this.exit(false);
                throw th;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return AsyncTimeout.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + r2 + ")";
        }
    }

    public final Source source(Source source) {
        return new Source() { // from class: okio.AsyncTimeout.2
            final /* synthetic */ Source val$source;

            C25302(Source source2) {
                r2 = source2;
            }

            @Override // okio.Source
            public long read(Buffer buffer, long j) {
                AsyncTimeout.this.enter();
                try {
                    try {
                        long read = r2.read(buffer, j);
                        AsyncTimeout.this.exit(true);
                        return read;
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    try {
                        r2.close();
                        AsyncTimeout.this.exit(true);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit(e);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.Source
            public Timeout timeout() {
                return AsyncTimeout.this;
            }

            public String toString() {
                return "AsyncTimeout.source(" + r2 + ")";
            }
        };
    }

    final void exit(boolean z) {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    final IOException exit(IOException iOException) {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    protected IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* loaded from: classes.dex */
    public final class Watchdog extends Thread {
        Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:            r0.timedOut();     */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r2 = this;
            L0:
                java.lang.Class<okio.AsyncTimeout> r2 = okio.AsyncTimeout.class
                monitor-enter(r2)     // Catch: java.lang.InterruptedException -> L0
                okio.AsyncTimeout r0 = okio.AsyncTimeout.awaitTimeout()     // Catch: java.lang.Throwable -> L19
                if (r0 != 0) goto Lb
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                okio.AsyncTimeout r1 = okio.AsyncTimeout.head     // Catch: java.lang.Throwable -> L19
                if (r0 != r1) goto L14
                r0 = 0
                okio.AsyncTimeout.head = r0     // Catch: java.lang.Throwable -> L19
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                r0.timedOut()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                throw r0     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.AsyncTimeout.Watchdog.run():void");
        }
    }

    @Nullable
    static AsyncTimeout awaitTimeout() {
        AsyncTimeout asyncTimeout = head.next;
        if (asyncTimeout == null) {
            long nanoTime = System.nanoTime();
            AsyncTimeout.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long remainingNanos = asyncTimeout.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            AsyncTimeout.class.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = asyncTimeout.next;
        asyncTimeout.next = null;
        return asyncTimeout;
    }
}
