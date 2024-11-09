package com.heytap.shield.authcode.p087a;

import android.text.TextUtils;
import com.heytap.shield.C2425a;
import com.heytap.shield.authcode.C2433c;
import com.heytap.shield.p088b.C2443b;
import com.heytap.shield.p088b.C2448g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import neton.client.config.Constants;

/* compiled from: AuthResult.java */
/* renamed from: com.heytap.shield.authcode.a.a */
/* loaded from: classes.dex */
public final class C2430a {

    /* renamed from: a */
    private String f10688a;

    /* renamed from: b */
    private int f10689b;

    /* renamed from: c */
    private byte[] f10690c;

    /* renamed from: d */
    private long f10691d;

    /* renamed from: e */
    private Map<String, C2433c> f10692e;

    /* renamed from: f */
    private String f10693f;

    public C2430a(String str, int i, byte[] bArr) {
        this.f10688a = str;
        this.f10689b = i;
        this.f10690c = bArr;
    }

    /* renamed from: a */
    public final byte[] m7736a() {
        return this.f10690c;
    }

    /* renamed from: b */
    public final int m7737b() {
        return this.f10689b;
    }

    /* renamed from: c */
    public final void m7738c() {
        this.f10691d = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void m7734a(String str) {
        this.f10693f = str;
    }

    /* renamed from: d */
    public final String m7739d() {
        return this.f10693f;
    }

    /* renamed from: e */
    public final boolean m7740e() {
        return System.currentTimeMillis() - this.f10691d > C2425a.f10679a;
    }

    /* renamed from: f */
    public final void m7741f() {
        this.f10692e = new ConcurrentHashMap();
        for (String str : C2448g.m7804a(new String(this.f10690c), Constants.SPLITER)) {
            int indexOf = str.indexOf(",");
            if (indexOf != -1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (TextUtils.equals(substring, "epona") || TextUtils.equals(substring, "tingle")) {
                    this.f10692e.put(substring, new C2433c(substring2));
                    if (C2443b.m7790a()) {
                        C2443b.m7789a("Package : " + this.f10688a + " Permission : type [" + substring + "] -" + C2448g.m7804a(substring2, ","));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean m7735a(String str, String str2) {
        C2433c c2433c = this.f10692e.get(str);
        if (c2433c != null) {
            return c2433c.m7748a(str2);
        }
        return false;
    }
}
