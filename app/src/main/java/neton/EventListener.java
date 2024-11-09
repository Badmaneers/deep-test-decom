package neton;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* loaded from: classes.dex */
public abstract class EventListener {
    public static final EventListener NONE = new EventListener() { // from class: neton.EventListener.1
    };

    /* loaded from: classes.dex */
    public interface Factory {
        EventListener create(Call call);
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, Throwable th) {
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void connectionAcquired(Call call, Connection connection) {
    }

    public void connectionReleased(Call call, Connection connection) {
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list, Throwable th) {
    }

    public void dnsStart(Call call, String str) {
    }

    public void fetchEnd(Call call, Throwable th) {
    }

    public void fetchStart(Call call) {
    }

    public void requestBodyEnd(Call call, Throwable th) {
    }

    public void requestBodyStart(Call call) {
    }

    public void requestHeadersEnd(Call call, Throwable th) {
    }

    public void requestHeadersStart(Call call) {
    }

    public void responseBodyEnd(Call call, Throwable th) {
    }

    public void responseBodyStart(Call call) {
    }

    public void responseHeadersEnd(Call call, Throwable th) {
    }

    public void responseHeadersStart(Call call) {
    }

    public void secureConnectEnd(Call call, Handshake handshake, Throwable th) {
    }

    public void secureConnectStart(Call call) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Factory factory(EventListener eventListener) {
        return new Factory() { // from class: neton.EventListener.2
            @Override // neton.EventListener.Factory
            public final EventListener create(Call call) {
                return EventListener.this;
            }
        };
    }
}
