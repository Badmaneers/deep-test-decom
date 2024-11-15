package neton.client.cookie;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import neton.Cookie;
import neton.HttpUrl;
import neton.client.Utils.LogUtil;

/* loaded from: classes.dex */
public class PersistentCookieStore {
    private static final String COOKIE_PREFS = "Cookies_Prefs";
    private static final String LOG_TAG = "PersistentCookieStore";
    private final SharedPreferences cookiePrefs;
    private final Map<String, ConcurrentHashMap<String, Cookie>> cookies = new HashMap();

    public PersistentCookieStore(Context context) {
        Cookie decodeCookie;
        this.cookiePrefs = context.getSharedPreferences(COOKIE_PREFS, 0);
        for (Map.Entry<String, ?> entry : this.cookiePrefs.getAll().entrySet()) {
            for (String str : TextUtils.split((String) entry.getValue(), ",")) {
                String string = this.cookiePrefs.getString(str, null);
                if (string != null && (decodeCookie = decodeCookie(string)) != null) {
                    if (!this.cookies.containsKey(entry.getKey())) {
                        this.cookies.put(entry.getKey(), new ConcurrentHashMap<>());
                    }
                    this.cookies.get(entry.getKey()).put(str, decodeCookie);
                }
            }
        }
    }

    protected String getCookieToken(Cookie cookie) {
        return cookie.name() + "@" + cookie.domain();
    }

    public void add(HttpUrl httpUrl, Cookie cookie) {
        String cookieToken = getCookieToken(cookie);
        LogUtil.m7844d("PersistentCookieStore-add--url:" + httpUrl + ",cookie.persistent():" + cookie.persistent());
        if (cookie.persistent()) {
            if (!this.cookies.containsKey(httpUrl.host())) {
                this.cookies.put(httpUrl.host(), new ConcurrentHashMap<>());
            }
            this.cookies.get(httpUrl.host()).put(cookieToken, cookie);
            SharedPreferences.Editor edit = this.cookiePrefs.edit();
            edit.putString(httpUrl.host(), TextUtils.join(",", this.cookies.get(httpUrl.host()).keySet()));
            edit.putString(cookieToken, encodeCookie(new SerializableOkHttpCookies(cookie)));
            edit.apply();
            return;
        }
        if (this.cookies.containsKey(httpUrl.host())) {
            this.cookies.get(httpUrl.host()).remove(cookieToken);
        }
    }

    public List<Cookie> get(HttpUrl httpUrl) {
        ArrayList arrayList = new ArrayList();
        if (this.cookies.containsKey(httpUrl.host())) {
            arrayList.addAll(this.cookies.get(httpUrl.host()).values());
        }
        return arrayList;
    }

    public boolean removeAll() {
        SharedPreferences.Editor edit = this.cookiePrefs.edit();
        edit.clear();
        edit.apply();
        this.cookies.clear();
        return true;
    }

    public boolean remove(HttpUrl httpUrl, Cookie cookie) {
        String cookieToken = getCookieToken(cookie);
        if (!this.cookies.containsKey(httpUrl.host()) || !this.cookies.get(httpUrl.host()).containsKey(cookieToken)) {
            return false;
        }
        this.cookies.get(httpUrl.host()).remove(cookieToken);
        SharedPreferences.Editor edit = this.cookiePrefs.edit();
        if (this.cookiePrefs.contains(cookieToken)) {
            edit.remove(cookieToken);
        }
        edit.putString(httpUrl.host(), TextUtils.join(",", this.cookies.get(httpUrl.host()).keySet()));
        edit.apply();
        return true;
    }

    public List<Cookie> getCookies() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.cookies.keySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(this.cookies.get(it.next()).values());
        }
        return arrayList;
    }

    protected String encodeCookie(SerializableOkHttpCookies serializableOkHttpCookies) {
        if (serializableOkHttpCookies == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(serializableOkHttpCookies);
            return byteArrayToHexString(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            Log.d(LOG_TAG, "IOException in encodeCookie", e);
            return null;
        }
    }

    protected Cookie decodeCookie(String str) {
        try {
            return ((SerializableOkHttpCookies) new ObjectInputStream(new ByteArrayInputStream(hexStringToByteArray(str))).readObject()).getCookies();
        } catch (IOException e) {
            Log.d(LOG_TAG, "IOException in decodeCookie", e);
            return null;
        } catch (ClassNotFoundException e2) {
            Log.d(LOG_TAG, "ClassNotFoundException in decodeCookie", e2);
            return null;
        }
    }

    protected String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    protected byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
