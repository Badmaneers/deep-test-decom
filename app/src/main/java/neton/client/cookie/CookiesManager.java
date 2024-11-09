package neton.client.cookie;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import neton.Cookie;
import neton.CookieJar;
import neton.HttpUrl;
import neton.client.Utils.LogUtil;

/* loaded from: classes.dex */
public class CookiesManager implements CookieJar {
    private static PersistentCookieStore cookieStore;

    public CookiesManager(Context context) {
        cookieStore = new PersistentCookieStore(context);
    }

    @Override // neton.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        LogUtil.m7844d("CookiesManager--saveFromResponse--url:" + httpUrl + ",cookies:" + list);
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<Cookie> it = list.iterator();
        while (it.hasNext()) {
            cookieStore.add(httpUrl, it.next());
        }
    }

    @Override // neton.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        List<Cookie> list = cookieStore.get(httpUrl);
        LogUtil.m7844d("CookiesManager--loadForRequest--url:" + httpUrl + ",cookies:" + list);
        return list;
    }
}
