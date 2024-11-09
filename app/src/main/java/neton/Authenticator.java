package neton;

/* loaded from: classes.dex */
public interface Authenticator {
    public static final Authenticator NONE = new Authenticator() { // from class: neton.Authenticator.1
        @Override // neton.Authenticator
        public final Request authenticate(Route route, Response response) {
            return null;
        }
    };

    Request authenticate(Route route, Response response);
}
