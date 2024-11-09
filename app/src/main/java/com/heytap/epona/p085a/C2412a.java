package com.heytap.epona.p085a;

import android.content.Context;
import android.os.SystemProperties;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.p001a.C0000a;
import p000a.p001a.C0002c;

/* compiled from: Logger.java */
/* renamed from: com.heytap.epona.a.a */
/* loaded from: classes.dex */
public final class C2412a {

    /* renamed from: a */
    private static boolean f10660a;

    /* renamed from: b */
    private static AtomicBoolean f10661b = new AtomicBoolean(false);

    /* renamed from: c */
    private static volatile C0002c f10662c;

    /* renamed from: a */
    public static void m7709a(Context context) {
        if (f10661b.getAndSet(true)) {
            return;
        }
        if (context != null && context.getContentResolver() != null) {
            f10660a = SystemProperties.getBoolean("persist.sys.assert.panic", false);
            context.getContentResolver().registerContentObserver(Settings.System.getUriFor("log_switch_type"), false, new C2413b((byte) 0));
        } else {
            f10660a = false;
        }
        m7712b();
    }

    /* renamed from: b */
    public static void m7712b() {
        if (f10660a) {
            if (f10662c == null) {
                C0002c c0002c = new C0002c();
                f10662c = c0002c;
                C0000a.m2a(c0002c);
                return;
            }
            return;
        }
        C0000a.m1a();
        f10662c = null;
    }

    /* renamed from: a */
    public static void m7710a(String str, Throwable th) {
        if (f10660a) {
            C0000a.m0a("epona->".concat(String.valueOf(str))).mo6a(th);
        }
    }
}
