package neton.internal.tls;

import android.net.SSLSessionCache;
import android.os.Build;
import com.coloros.neton.NetonException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import neton.client.config.ConfigManager;
import neton.client.config.Constants;

/* loaded from: classes.dex */
public class NetonSslSocketFactory {
    public static SSLSocketFactory createNetonSslSocketFactory(TrustManager trustManager, SSLSessionCache sSLSessionCache) {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, new TrustManager[]{trustManager}, null);
        sSLContext.getClientSessionContext().setSessionCacheSize(ConfigManager.getInstance().getIntData(Constants.KEY_SESSION_CACHE_SIZE, 0));
        sSLContext.getClientSessionContext().setSessionTimeout(ConfigManager.getInstance().getIntData(Constants.KEY_SESSION_TIMEOUT, Constants.DEFAULT_SESSION_TIMEOUT));
        if (sSLSessionCache != null && Build.VERSION.SDK_INT > 19) {
            try {
                SSLSessionCache.install(sSLSessionCache, sSLContext);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sSLContext.getSocketFactory();
    }

    public static X509TrustManager systemDefaultTrustManager() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new NetonException(new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers)));
            }
            return (X509TrustManager) trustManagers[0];
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }
}
