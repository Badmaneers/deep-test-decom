package com.heytap.epona;

import android.app.Application;
import android.content.Context;
import com.heytap.epona.internal.C2419a;
import com.heytap.epona.internal.C2421c;
import com.heytap.epona.internal.C2422d;
import com.heytap.epona.internal.InterfaceC2423e;
import com.heytap.epona.p085a.C2412a;
import com.heytap.shield.C2441b;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Epona.java */
/* renamed from: com.heytap.epona.a */
/* loaded from: classes.dex */
public final class C2411a {

    /* renamed from: b */
    private static C2411a f10652b;

    /* renamed from: f */
    private Application f10656f;

    /* renamed from: i */
    private Context f10659i;

    /* renamed from: a */
    private static final Object f10651a = new Object();

    /* renamed from: c */
    private static AtomicBoolean f10653c = new AtomicBoolean(false);

    /* renamed from: e */
    private InterfaceC2415c f10655e = new C2422d();

    /* renamed from: d */
    private C2418f f10654d = new C2418f();

    /* renamed from: h */
    private InterfaceC2423e f10658h = new C2421c();

    /* renamed from: g */
    private C2419a f10657g = new C2419a();

    private C2411a() {
    }

    /* renamed from: a */
    public static void m7707a(Context context) {
        if (f10653c.getAndSet(true)) {
            return;
        }
        C2411a m7706a = m7706a();
        m7706a.f10659i = context;
        if (context instanceof Application) {
            m7706a.f10656f = (Application) context;
        } else {
            m7706a.f10656f = (Application) context.getApplicationContext();
        }
        m7706a.f10657g.m7719a(m7706a.f10656f);
        C2412a.m7709a(context);
        C2441b.m7776b().m7777a(context);
    }

    /* renamed from: a */
    private static C2411a m7706a() {
        synchronized (f10651a) {
            if (f10652b == null) {
                f10652b = new C2411a();
            }
        }
        return f10652b;
    }
}
