package neton.internal.tls;

import android.annotation.SuppressLint;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class TrustAllCertification {

    /* loaded from: classes.dex */
    public class TrustAllHostnameVerifier implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    @SuppressLint({"TrulyRandom"})
    public static SSLSocketFactory createSSLSocketFactory() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new TrustAllManager()}, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* loaded from: classes.dex */
    class TrustAllManager implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        private TrustAllManager() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }
}
