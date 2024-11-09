package neton;

import java.net.Socket;

/* loaded from: classes.dex */
public interface Connection {
    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}
