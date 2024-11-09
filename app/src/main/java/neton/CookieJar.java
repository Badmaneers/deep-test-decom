package neton;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface CookieJar {
    public static final CookieJar NO_COOKIES = new CookieJar() { // from class: neton.CookieJar.1
        @Override // neton.CookieJar
        public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        }

        @Override // neton.CookieJar
        public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
            return Collections.emptyList();
        }
    };

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
