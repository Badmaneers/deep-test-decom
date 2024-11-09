package com.coloros.neton;

import neton.Interceptor;
import neton.Request;
import neton.Response;
import neton.client.Utils.LogUtil;

/* loaded from: classes.dex */
public class NetworkInterceptor implements Interceptor {
    @Override // neton.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        long nanoTime = System.nanoTime();
        LogUtil.m7844d(String.format("NetworkInterceptor--send request: [%s] %s%n%s", request.url(), chain.connection(), request.headers()));
        Response proceed = chain.proceed(request);
        long nanoTime2 = System.nanoTime();
        LogUtil.m7844d(String.format("NetworkInterceptor--receive response: [%s] %.1fms%n%s", proceed.request().url(), Double.valueOf((nanoTime2 - nanoTime) / 1000000.0d), proceed.code() + "-" + proceed.message()));
        return proceed;
    }
}
