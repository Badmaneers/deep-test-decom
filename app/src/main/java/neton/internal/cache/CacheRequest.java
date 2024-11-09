package neton.internal.cache;

import okio.Sink;

/* loaded from: classes.dex */
public interface CacheRequest {
    void abort();

    Sink body();
}
