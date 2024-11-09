package com.coloros.neton;

import neton.Interceptor;
import neton.Request;
import neton.Response;
import neton.client.Utils.LogUtil;

/* loaded from: classes.dex */
public class LoggingInterceptor implements Interceptor {
    @Override // neton.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        long nanoTime = System.nanoTime();
        if (LogUtil.isDebugs()) {
            LogUtil.m7844d(String.format("LoggingInterceptor--send request: [%s] %s%n%s", request, chain.connection(), request.headers()));
        }
        Response proceed = chain.proceed(request);
        long nanoTime2 = System.nanoTime();
        if (LogUtil.isDebugs()) {
            LogUtil.m7844d(String.format("LoggingInterceptor--receive response: [%s] %.1fms%n%s", proceed, Double.valueOf((nanoTime2 - nanoTime) / 1000000.0d), proceed.headers()));
        }
        return proceed;
    }
}
