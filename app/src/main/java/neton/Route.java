package neton;

import com.coloros.neton.NetonException;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class Route {
    final Address address;
    final InetSocketAddress inetSocketAddress;
    final Proxy proxy;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (address == null) {
            throw new NetonException(new NullPointerException("address == null"));
        }
        if (proxy == null) {
            throw new NetonException(new NullPointerException("proxy == null"));
        }
        if (inetSocketAddress == null) {
            throw new NetonException(new NullPointerException("inetSocketAddress == null"));
        }
        this.address = address;
        this.proxy = proxy;
        this.inetSocketAddress = inetSocketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final InetSocketAddress socketAddress() {
        return this.inetSocketAddress;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return route.address.equals(this.address) && route.proxy.equals(this.proxy) && route.inetSocketAddress.equals(this.inetSocketAddress);
    }

    public final int hashCode() {
        return ((((this.address.hashCode() + 527) * 31) + this.proxy.hashCode()) * 31) + this.inetSocketAddress.hashCode();
    }

    public final String toString() {
        return "Route{" + this.inetSocketAddress + "}";
    }
}
