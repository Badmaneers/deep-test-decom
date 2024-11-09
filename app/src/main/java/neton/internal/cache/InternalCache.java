package neton.internal.cache;

import neton.Request;
import neton.Response;

/* loaded from: classes.dex */
public interface InternalCache {
    Response get(Request request);

    CacheRequest put(Response response);

    void remove(Request request);

    void trackConditionalCacheHit();

    void trackResponse(CacheStrategy cacheStrategy);

    void update(Response response, Response response2);
}
