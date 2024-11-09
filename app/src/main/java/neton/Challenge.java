package neton;

import com.coloros.neton.NetonException;

/* loaded from: classes.dex */
public final class Challenge {
    private final String realm;
    private final String scheme;

    public Challenge(String str, String str2) {
        if (str == null) {
            throw new NetonException(new NullPointerException("scheme == null"));
        }
        if (str2 == null) {
            throw new NetonException(new NullPointerException("realm == null"));
        }
        this.scheme = str;
        this.realm = str2;
    }

    public final String scheme() {
        return this.scheme;
    }

    public final String realm() {
        return this.realm;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return challenge.scheme.equals(this.scheme) && challenge.realm.equals(this.realm);
    }

    public final int hashCode() {
        return ((this.realm.hashCode() + 899) * 31) + this.scheme.hashCode();
    }

    public final String toString() {
        return this.scheme + " realm=\"" + this.realm + "\"";
    }
}
