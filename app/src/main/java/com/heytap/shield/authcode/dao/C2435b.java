package com.heytap.shield.authcode.dao;

import android.database.Cursor;
import androidx.room.AbstractC0942ak;
import androidx.room.AbstractC0945b;
import androidx.room.AbstractC0969z;
import androidx.room.C0939ah;
import androidx.room.p038a.C0924b;

/* compiled from: AuthenticationDao_Impl.java */
/* renamed from: com.heytap.shield.authcode.dao.b */
/* loaded from: classes.dex */
public final class C2435b implements InterfaceC2434a {

    /* renamed from: a */
    private final AbstractC0969z f10699a;

    /* renamed from: b */
    private final AbstractC0945b<C2439f> f10700b;

    /* renamed from: c */
    private final AbstractC0942ak f10701c;

    /* renamed from: d */
    private final AbstractC0942ak f10702d;

    public C2435b(AbstractC0969z abstractC0969z) {
        this.f10699a = abstractC0969z;
        this.f10700b = new C2436c(this, abstractC0969z);
        this.f10701c = new C2437d(this, abstractC0969z);
        this.f10702d = new C2438e(this, abstractC0969z);
    }

    @Override // com.heytap.shield.authcode.dao.InterfaceC2434a
    /* renamed from: a */
    public final void mo7763a(C2439f c2439f) {
        this.f10699a.m3411f();
        this.f10699a.m3412g();
        try {
            this.f10700b.m3373a((AbstractC0945b<C2439f>) c2439f);
            this.f10699a.m3415j();
        } finally {
            this.f10699a.m3413h();
        }
    }

    @Override // com.heytap.shield.authcode.dao.InterfaceC2434a
    /* renamed from: a */
    public final C2439f mo7762a(int i, String str, String str2, String str3) {
        C2439f c2439f;
        C0939ah m3362a = C0939ah.m3362a("SELECT * FROM a_e WHERE a_e.uid = (?)AND a_e.packageName = (?)AND a_e.capability_name = (?)AND a_e.auth_code = (?)");
        m3362a.mo2228a(1, i);
        if (str == null) {
            m3362a.mo2226a(2);
        } else {
            m3362a.mo2229a(2, str);
        }
        m3362a.mo2229a(3, str2);
        if (str3 == null) {
            m3362a.mo2226a(4);
        } else {
            m3362a.mo2229a(4, str3);
        }
        this.f10699a.m3411f();
        Cursor m3401a = this.f10699a.m3401a(m3362a);
        try {
            int m3337a = C0924b.m3337a(m3401a, "id");
            int m3337a2 = C0924b.m3337a(m3401a, "auth_code");
            int m3337a3 = C0924b.m3337a(m3401a, "is_enable");
            int m3337a4 = C0924b.m3337a(m3401a, "uid");
            int m3337a5 = C0924b.m3337a(m3401a, "packageName");
            int m3337a6 = C0924b.m3337a(m3401a, "capability_name");
            int m3337a7 = C0924b.m3337a(m3401a, "expiration");
            int m3337a8 = C0924b.m3337a(m3401a, "permission");
            int m3337a9 = C0924b.m3337a(m3401a, "last_update_time");
            int m3337a10 = C0924b.m3337a(m3401a, "cache_time");
            if (m3401a.moveToFirst()) {
                c2439f = new C2439f(m3401a.getString(m3337a2), m3401a.getInt(m3337a3) != 0, m3401a.getInt(m3337a4), m3401a.getString(m3337a5), m3401a.getString(m3337a6), m3401a.getLong(m3337a7), m3401a.getBlob(m3337a8), m3401a.getLong(m3337a9), m3401a.getLong(m3337a10));
                c2439f.m7765a(m3401a.getInt(m3337a));
            } else {
                c2439f = null;
            }
            return c2439f;
        } finally {
            m3401a.close();
            m3362a.m3364a();
        }
    }
}
