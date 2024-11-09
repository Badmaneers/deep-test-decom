package neton.internal.connection;

import com.coloros.neton.BuildConfig;
import com.coloros.neton.NetonException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import neton.Address;
import neton.Call;
import neton.EventListener;
import neton.HttpUrl;
import neton.Route;
import neton.internal.Util;

/* loaded from: classes.dex */
public final class RouteSelector {
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private int nextProxyIndex;
    private final RouteDatabase routeDatabase;
    private List<Proxy> proxies = Collections.emptyList();
    private List<InetSocketAddress> inetSocketAddresses = Collections.emptyList();
    private final List<Route> postponedRoutes = new ArrayList();

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        resetNextProxy(address.url(), address.proxy());
    }

    public final boolean hasNext() {
        return hasNextProxy() || !this.postponedRoutes.isEmpty();
    }

    public final Selection next() {
        if (!hasNext()) {
            throw new NetonException(new NoSuchElementException());
        }
        ArrayList arrayList = new ArrayList();
        while (hasNextProxy()) {
            Proxy nextProxy = nextProxy();
            int size = this.inetSocketAddresses.size();
            for (int i = 0; i < size; i++) {
                Route route = new Route(this.address, nextProxy, this.inetSocketAddresses.get(i));
                if (this.routeDatabase.shouldPostpone(route)) {
                    this.postponedRoutes.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new Selection(arrayList);
    }

    public final void connectFailed(Route route, IOException iOException) {
        if (route.proxy().type() != Proxy.Type.DIRECT && this.address.proxySelector() != null) {
            this.address.proxySelector().connectFailed(this.address.url().uri(), route.proxy().address(), iOException);
        }
        this.routeDatabase.failed(route);
    }

    private void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        List<Proxy> immutableList;
        if (proxy != null) {
            immutableList = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.address.proxySelector().select(httpUrl.uri());
            if (select != null && !select.isEmpty()) {
                immutableList = Util.immutableList(select);
            } else {
                immutableList = Util.immutableList(Proxy.NO_PROXY);
            }
        }
        this.proxies = immutableList;
        this.nextProxyIndex = 0;
    }

    private boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private Proxy nextProxy() {
        if (!hasNextProxy()) {
            throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
        }
        List<Proxy> list = this.proxies;
        int i = this.nextProxyIndex;
        this.nextProxyIndex = i + 1;
        Proxy proxy = list.get(i);
        resetNextInetSocketAddress(proxy);
        return proxy;
    }

    private void resetNextInetSocketAddress(Proxy proxy) {
        String host;
        int port;
        this.inetSocketAddresses = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            host = this.address.url().host();
            port = this.address.url().port();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new NetonException(new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass()));
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            host = getHostString(inetSocketAddress);
            port = inetSocketAddress.getPort();
        }
        if (port <= 0 || port > 65535) {
            throw new SocketException("No route to " + host + ":" + port + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.inetSocketAddresses.add(InetSocketAddress.createUnresolved(host, port));
            return;
        }
        if (proxy.type() == Proxy.Type.DIRECT && this.address.url().m7842ip() != null && BuildConfig.FLAVOR != this.address.url().m7842ip()) {
            this.inetSocketAddresses.add(new InetSocketAddress(this.address.url().m7842ip(), port));
            return;
        }
        this.eventListener.dnsStart(this.call, host);
        try {
            List<InetAddress> lookup = this.address.dns().lookup(host);
            if (lookup.isEmpty()) {
                UnknownHostException unknownHostException = new UnknownHostException(this.address.dns() + " returned no addresses for " + host);
                this.eventListener.dnsEnd(this.call, host, null, unknownHostException);
                throw unknownHostException;
            }
            this.eventListener.dnsEnd(this.call, host, lookup, null);
            int size = lookup.size();
            for (int i = 0; i < size; i++) {
                this.inetSocketAddresses.add(new InetSocketAddress(lookup.get(i), port));
            }
        } catch (Exception e) {
            this.eventListener.dnsEnd(this.call, host, null, e);
            throw e;
        }
    }

    static String getHostString(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    /* loaded from: classes.dex */
    public final class Selection {
        private int nextRouteIndex = 0;
        private final List<Route> routes;

        Selection(List<Route> list) {
            this.routes = list;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final Route next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            List<Route> list = this.routes;
            int i = this.nextRouteIndex;
            this.nextRouteIndex = i + 1;
            return list.get(i);
        }

        public final List<Route> getAll() {
            return new ArrayList(this.routes);
        }
    }
}
