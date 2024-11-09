package com.heytap.shield;

import android.app.Application;
import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.heytap.shield.authcode.C2429a;
import com.heytap.shield.authcode.C2432b;
import com.heytap.shield.authcode.p087a.C2430a;
import com.heytap.shield.p086a.C2427b;
import com.heytap.shield.p088b.C2443b;
import com.heytap.shield.p088b.C2444c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PermissionCheck.java */
/* renamed from: com.heytap.shield.b */
/* loaded from: classes.dex */
public final class C2441b {

    /* renamed from: b */
    private static C2441b f10718b;

    /* renamed from: d */
    private boolean f10720d = false;

    /* renamed from: e */
    private List<String> f10721e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private Context f10722f;

    /* renamed from: g */
    private C2429a f10723g;

    /* renamed from: a */
    private static final Object f10717a = new Object();

    /* renamed from: c */
    private static boolean f10719c = true;

    /* renamed from: a */
    public final synchronized void m7777a(Context context) {
        if (this.f10720d) {
            return;
        }
        this.f10720d = true;
        this.f10722f = context instanceof Application ? context : context.getApplicationContext();
        this.f10723g = new C2429a(context);
        C2427b.m7729a();
    }

    /* renamed from: a */
    public final boolean m7779a(String str, int i) {
        String str2;
        if (Binder.getCallingUid() == 1000) {
            return true;
        }
        String m7795a = C2444c.m7795a(this.f10722f, Binder.getCallingUid(), Binder.getCallingPid());
        if (!this.f10721e.contains(m7795a)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            C2443b.m7791b("Tingle Authentication Failed Cause Descriptor Empty");
            return false;
        }
        if (C2443b.m7790a()) {
            C2443b.m7789a("Start tingle verity descriptor : [" + str + "] method : [" + C2427b.m7728a(str, i) + "] caller package : [" + C2444c.m7795a(this.f10722f, Binder.getCallingUid(), Binder.getCallingPid()) + "]");
        }
        if (this.f10723g.m7732a(m7795a)) {
            boolean m7733a = this.f10723g.m7733a(C2427b.m7728a(str, i), m7795a);
            if (C2443b.m7790a()) {
                StringBuilder sb = new StringBuilder("Tingle verity ");
                sb.append(m7733a ? "SUCCESS" : "FAILED");
                sb.append(" Caller : [");
                sb.append(m7795a);
                sb.append("] Descriptor : [");
                sb.append(str);
                sb.append("] Method : [");
                sb.append(C2427b.m7728a(str, i));
                sb.append("]");
                C2443b.m7789a(sb.toString());
            }
            return m7733a;
        }
        C2430a m7746a = C2432b.m7746a(this.f10722f, m7795a);
        int m7737b = m7746a.m7737b();
        if (m7737b != 1001) {
            StringBuilder sb2 = new StringBuilder("Tingle Authentication Failed ");
            switch (m7737b) {
                case 1001:
                    str2 = "AUTHENTICATE_SUCCESS";
                    break;
                case 1002:
                    str2 = "AUTHENTICATE_FAIL";
                    break;
                case 1003:
                    str2 = "TIME_EXPIRED";
                    break;
                case 1004:
                    str2 = "AUTHCODE_EXPECTED";
                    break;
                case 1005:
                    str2 = "VERSION_INCOMPATIBLE";
                    break;
                case 1006:
                    str2 = "AUTHCODE_RECYCLE";
                    break;
                case 1007:
                    str2 = "AUTHCODE_INVALID";
                    break;
                case 1008:
                    str2 = "CAPABILITY_EXCEPTION";
                    break;
                case 1009:
                    str2 = "INTERNAL_EXCEPTION";
                    break;
                case 1010:
                    str2 = "NONE_PERMISSION";
                    break;
                default:
                    str2 = "unknown status code: ".concat(String.valueOf(m7737b));
                    break;
            }
            sb2.append(str2);
            C2443b.m7791b(sb2.toString());
            return false;
        }
        this.f10723g.m7731a(m7795a, m7746a);
        boolean m7733a2 = this.f10723g.m7733a(C2427b.m7728a(str, i), m7795a);
        if (C2443b.m7790a()) {
            StringBuilder sb3 = new StringBuilder("Tingle verity ");
            sb3.append(m7733a2 ? "SUCCESS" : "FAILED");
            sb3.append(" Caller : [");
            sb3.append(m7795a);
            sb3.append("] Descriptor : [");
            sb3.append(str);
            sb3.append("] Method : [");
            sb3.append(C2427b.m7728a(str, i));
            sb3.append("]");
            C2443b.m7789a(sb3.toString());
        }
        return m7733a2;
    }

    /* renamed from: a */
    public static boolean m7775a() {
        return f10719c;
    }

    /* renamed from: b */
    public static C2441b m7776b() {
        synchronized (f10717a) {
            if (f10718b == null) {
                f10718b = new C2441b();
            }
        }
        return f10718b;
    }

    /* renamed from: a */
    public final void m7778a(String str) {
        if (this.f10721e.contains(str)) {
            return;
        }
        this.f10721e.add(str);
    }

    /* renamed from: b */
    public final void m7780b(String str) {
        this.f10721e.remove(str);
    }
}
