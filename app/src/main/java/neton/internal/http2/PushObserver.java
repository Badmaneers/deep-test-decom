package neton.internal.http2;

import java.util.List;
import okio.BufferedSource;

/* loaded from: classes.dex */
public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() { // from class: neton.internal.http2.PushObserver.1
        @Override // neton.internal.http2.PushObserver
        public final boolean onHeaders(int i, List<Header> list, boolean z) {
            return true;
        }

        @Override // neton.internal.http2.PushObserver
        public final boolean onRequest(int i, List<Header> list) {
            return true;
        }

        @Override // neton.internal.http2.PushObserver
        public final void onReset(int i, ErrorCode errorCode) {
        }

        @Override // neton.internal.http2.PushObserver
        public final boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) {
            bufferedSource.skip(i2);
            return true;
        }
    };

    boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z);

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
