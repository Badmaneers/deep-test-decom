package neton.internal.http;

import neton.Headers;
import neton.MediaType;
import neton.ResponseBody;
import okio.BufferedSource;

/* loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {
    private final Headers headers;
    private final BufferedSource source;

    public RealResponseBody(Headers headers, BufferedSource bufferedSource) {
        this.headers = headers;
        this.source = bufferedSource;
    }

    @Override // neton.ResponseBody
    public final MediaType contentType() {
        String str = this.headers.get("Content-Type");
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // neton.ResponseBody
    public final long contentLength() {
        return HttpHeaders.contentLength(this.headers);
    }

    @Override // neton.ResponseBody
    public final BufferedSource source() {
        return this.source;
    }
}
