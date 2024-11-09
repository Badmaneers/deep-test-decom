package neton;

import com.coloros.neton.NetonException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import neton.HttpUrl;
import neton.client.statistics.RequestStatistic;
import neton.internal.Util;

/* loaded from: classes.dex */
public final class Address {
    final CertificatePinner certificatePinner;
    final List<ConnectionSpec> connectionSpecs;
    final Dns dns;
    final HostnameVerifier hostnameVerifier;
    final List<Protocol> protocols;
    final Proxy proxy;
    final Authenticator proxyAuthenticator;
    final ProxySelector proxySelector;
    final RequestStatistic requestStatistic;
    final SocketFactory socketFactory;
    final SSLSocketFactory sslSocketFactory;
    final HttpUrl url;

    public Address(RequestStatistic requestStatistic, String str, String str2, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str2).m7843ip(str).port(i).build();
        this.requestStatistic = requestStatistic;
        if (dns == null) {
            throw new NetonException(new NullPointerException("dns == null"));
        }
        this.dns = dns;
        if (socketFactory == null) {
            throw new NetonException(new NullPointerException("socketFactory == null"));
        }
        this.socketFactory = socketFactory;
        if (authenticator == null) {
            throw new NetonException(new NullPointerException("proxyAuthenticator == null"));
        }
        this.proxyAuthenticator = authenticator;
        if (list == null) {
            throw new NetonException(new NullPointerException("protocols == null"));
        }
        this.protocols = Util.immutableList(list);
        if (list2 == null) {
            throw new NetonException(new NullPointerException("connectionSpecs == null"));
        }
        this.connectionSpecs = Util.immutableList(list2);
        if (proxySelector == null) {
            throw new NetonException(new NullPointerException("proxySelector == null"));
        }
        this.proxySelector = proxySelector;
        this.proxy = proxy;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
    }

    public final RequestStatistic requestStatistic() {
        return this.requestStatistic;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return this.url.equals(address.url) && equalsNonHost(address);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.url.hashCode() + 527) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + (this.proxy != null ? this.proxy.hashCode() : 0)) * 31) + (this.sslSocketFactory != null ? this.sslSocketFactory.hashCode() : 0)) * 31) + (this.hostnameVerifier != null ? this.hostnameVerifier.hashCode() : 0)) * 31) + (this.certificatePinner != null ? this.certificatePinner.hashCode() : 0);
    }

    public final boolean equalsNonHost(Address address) {
        return this.dns.equals(address.dns) && this.proxyAuthenticator.equals(address.proxyAuthenticator) && this.protocols.equals(address.protocols) && this.connectionSpecs.equals(address.connectionSpecs) && this.proxySelector.equals(address.proxySelector) && Util.equal(this.proxy, address.proxy) && Util.equal(this.sslSocketFactory, address.sslSocketFactory) && Util.equal(this.hostnameVerifier, address.hostnameVerifier) && Util.equal(this.certificatePinner, address.certificatePinner) && url().port() == address.url().port();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.url.host());
        sb.append(":");
        sb.append(this.url.port());
        if (this.proxy != null) {
            sb.append(", proxy=");
            sb.append(this.proxy);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.proxySelector);
        }
        sb.append("}");
        return sb.toString();
    }
}
