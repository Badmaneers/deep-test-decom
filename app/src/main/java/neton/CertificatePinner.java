package neton;

import com.coloros.neton.NetonException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import neton.internal.Util;
import neton.internal.tls.CertificateChainCleaner;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return Util.equal(this.certificateChainCleaner, certificatePinner.certificateChainCleaner) && this.pins.equals(certificatePinner.pins);
    }

    public final int hashCode() {
        return ((this.certificateChainCleaner != null ? this.certificateChainCleaner.hashCode() : 0) * 31) + this.pins.hashCode();
    }

    public final void check(String str, List<Certificate> list) {
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        if (this.certificateChainCleaner != null) {
            list = this.certificateChainCleaner.clean(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = findMatchingPins.size();
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                Pin pin = findMatchingPins.get(i2);
                if (pin.hashAlgorithm.equals("sha256/")) {
                    if (byteString == null) {
                        byteString = sha256(x509Certificate);
                    }
                    if (pin.hash.equals(byteString)) {
                        return;
                    }
                } else if (pin.hashAlgorithm.equals("sha1/")) {
                    if (byteString2 == null) {
                        byteString2 = sha1(x509Certificate);
                    }
                    if (pin.hash.equals(byteString2)) {
                        return;
                    }
                } else {
                    throw new AssertionError();
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = findMatchingPins.size();
        for (int i4 = 0; i4 < size4; i4++) {
            Pin pin2 = findMatchingPins.get(i4);
            sb.append("\n    ");
            sb.append(pin2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public final void check(String str, Certificate... certificateArr) {
        check(str, Arrays.asList(certificateArr));
    }

    final List<Pin> findMatchingPins(String str) {
        List<Pin> emptyList = Collections.emptyList();
        for (Pin pin : this.pins) {
            if (pin.matches(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(pin);
            }
        }
        return emptyList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CertificatePinner withCertificateChainCleaner(CertificateChainCleaner certificateChainCleaner) {
        return Util.equal(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public static String pin(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new NetonException(new IllegalArgumentException("Certificate pinning requires X509 certificates"));
        }
        return "sha256/" + sha256((X509Certificate) certificate).base64();
    }

    static ByteString sha1(X509Certificate x509Certificate) {
        return ByteString.m7858of(x509Certificate.getPublicKey().getEncoded()).sha1();
    }

    static ByteString sha256(X509Certificate x509Certificate) {
        return ByteString.m7858of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class Pin {
        private static final String WILDCARD = "*.";
        final String canonicalHostname;
        final ByteString hash;
        final String hashAlgorithm;
        final String pattern;

        Pin(String str, String str2) {
            String host;
            this.pattern = str;
            if (str.startsWith(WILDCARD)) {
                host = HttpUrl.parse("http://" + str.substring(2)).host();
            } else {
                host = HttpUrl.parse("http://".concat(String.valueOf(str))).host();
            }
            this.canonicalHostname = host;
            if (str2.startsWith("sha1/")) {
                this.hashAlgorithm = "sha1/";
                this.hash = ByteString.decodeBase64(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.hashAlgorithm = "sha256/";
                this.hash = ByteString.decodeBase64(str2.substring(7));
            } else {
                throw new NetonException(new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(String.valueOf(str2))));
            }
            if (this.hash == null) {
                throw new NetonException(new IllegalArgumentException("pins must be base64: ".concat(String.valueOf(str2))));
            }
        }

        final boolean matches(String str) {
            if (this.pattern.startsWith(WILDCARD)) {
                int indexOf = str.indexOf(46);
                return (str.length() - indexOf) - 1 == this.canonicalHostname.length() && str.regionMatches(false, indexOf + 1, this.canonicalHostname, 0, this.canonicalHostname.length());
            }
            return str.equals(this.canonicalHostname);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return this.pattern.equals(pin.pattern) && this.hashAlgorithm.equals(pin.hashAlgorithm) && this.hash.equals(pin.hash);
        }

        public final int hashCode() {
            return ((((this.pattern.hashCode() + 527) * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final String toString() {
            return this.hashAlgorithm + this.hash.base64();
        }
    }

    /* loaded from: classes.dex */
    public final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            if (str == null) {
                throw new NetonException(new NullPointerException("pattern == null"));
            }
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(new LinkedHashSet(this.pins), null);
        }
    }
}
