package com.heytap.shield.authcode;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.heytap.shield.C2425a;
import com.heytap.shield.authcode.dao.AuthenticationDb;
import com.heytap.shield.authcode.dao.C2439f;
import com.heytap.shield.authcode.p087a.C2430a;
import com.heytap.shield.p088b.C2442a;
import com.heytap.shield.p088b.C2444c;
import com.heytap.shield.p088b.C2445d;
import com.heytap.shield.p088b.C2448g;
import java.util.Arrays;
import java.util.Base64;

/* compiled from: AuthCache.java */
/* renamed from: com.heytap.shield.authcode.a */
/* loaded from: classes.dex */
public final class C2429a {

    /* renamed from: a */
    private LruCache<String, C2430a> f10686a = new LruCache<>(C2425a.f10680b);

    /* renamed from: b */
    private Context f10687b;

    public C2429a(Context context) {
        this.f10687b = context;
    }

    /* renamed from: a */
    public final boolean m7732a(String str) {
        String m7796a = C2444c.m7796a(this.f10687b, str, "AppPlatformKey");
        String m7786b = C2442a.m7786b(this.f10687b, str);
        Context context = this.f10687b;
        C2439f mo7762a = AuthenticationDb.m7749a(context).mo7750l().mo7762a(C2444c.m7793a(context, str), str, "APP_PLATFORM_CLIENT", m7796a);
        C2430a c2430a = mo7762a != null ? new C2430a(str, 1001, mo7762a.m7772h()) : null;
        C2430a c2430a2 = this.f10686a.get(str);
        if (c2430a == null || c2430a2 == null || c2430a2.m7740e() || !TextUtils.equals(m7786b, c2430a2.m7739d())) {
            return false;
        }
        byte[] decode = Base64.getDecoder().decode(m7796a);
        return Arrays.equals(C2445d.m7798a(decode, C2448g.m7803a(C2445d.m7797a(decode))), c2430a2.m7736a());
    }

    /* renamed from: a */
    public final void m7731a(String str, C2430a c2430a) {
        c2430a.m7741f();
        c2430a.m7738c();
        c2430a.m7734a(C2442a.m7786b(this.f10687b, str));
        this.f10686a.put(str, c2430a);
    }

    /* renamed from: a */
    public final boolean m7733a(String str, String str2) {
        C2430a c2430a = this.f10686a.get(str2);
        if (c2430a != null) {
            return c2430a.m7735a("tingle", str);
        }
        return false;
    }
}
