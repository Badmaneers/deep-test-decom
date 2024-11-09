package neton.internal.http2;

import com.coloros.neton.NetonException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class Ping {
    private final CountDownLatch latch = new CountDownLatch(1);
    private long sent = -1;
    private long received = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void send() {
        if (this.sent != -1) {
            throw new NetonException(new IllegalStateException());
        }
        this.sent = System.nanoTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void receive() {
        if (this.received != -1 || this.sent == -1) {
            throw new NetonException(new IllegalStateException());
        }
        this.received = System.nanoTime();
        this.latch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void cancel() {
        if (this.received != -1 || this.sent == -1) {
            throw new NetonException(new IllegalStateException());
        }
        this.received = this.sent - 1;
        this.latch.countDown();
    }

    public final long roundTripTime() {
        this.latch.await();
        return this.received - this.sent;
    }

    public final long roundTripTime(long j, TimeUnit timeUnit) {
        if (this.latch.await(j, timeUnit)) {
            return this.received - this.sent;
        }
        return -2L;
    }
}
