package neton;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface Interceptor {

    /* loaded from: classes.dex */
    public interface Chain {
        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request);

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    Response intercept(Chain chain);
}
