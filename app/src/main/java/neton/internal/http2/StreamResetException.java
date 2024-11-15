package neton.internal.http2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: ".concat(String.valueOf(errorCode)));
        this.errorCode = errorCode;
    }
}
