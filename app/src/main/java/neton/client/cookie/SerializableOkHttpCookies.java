package neton.client.cookie;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import neton.Cookie;

/* loaded from: classes.dex */
public class SerializableOkHttpCookies implements Serializable {
    private transient Cookie clientCookies;
    private final transient Cookie cookies;

    public SerializableOkHttpCookies(Cookie cookie) {
        this.cookies = cookie;
    }

    public Cookie getCookies() {
        return this.clientCookies != null ? this.clientCookies : this.cookies;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.cookies.name());
        objectOutputStream.writeObject(this.cookies.value());
        objectOutputStream.writeLong(this.cookies.expiresAt());
        objectOutputStream.writeObject(this.cookies.domain());
        objectOutputStream.writeObject(this.cookies.path());
        objectOutputStream.writeBoolean(this.cookies.secure());
        objectOutputStream.writeBoolean(this.cookies.httpOnly());
        objectOutputStream.writeBoolean(this.cookies.hostOnly());
        objectOutputStream.writeBoolean(this.cookies.persistent());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        String str = (String) objectInputStream.readObject();
        String str2 = (String) objectInputStream.readObject();
        long readLong = objectInputStream.readLong();
        String str3 = (String) objectInputStream.readObject();
        String str4 = (String) objectInputStream.readObject();
        boolean readBoolean = objectInputStream.readBoolean();
        boolean readBoolean2 = objectInputStream.readBoolean();
        boolean readBoolean3 = objectInputStream.readBoolean();
        objectInputStream.readBoolean();
        Cookie.Builder expiresAt = new Cookie.Builder().name(str).value(str2).expiresAt(readLong);
        Cookie.Builder path = (readBoolean3 ? expiresAt.hostOnlyDomain(str3) : expiresAt.domain(str3)).path(str4);
        if (readBoolean) {
            path = path.secure();
        }
        if (readBoolean2) {
            path = path.httpOnly();
        }
        this.clientCookies = path.build();
    }
}
