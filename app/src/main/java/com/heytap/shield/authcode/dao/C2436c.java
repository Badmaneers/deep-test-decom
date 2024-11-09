package com.heytap.shield.authcode.dao;

import androidx.p032e.p033a.InterfaceC0654j;
import androidx.room.AbstractC0945b;
import androidx.room.AbstractC0969z;

/* compiled from: AuthenticationDao_Impl.java */
/* renamed from: com.heytap.shield.authcode.dao.c */
/* loaded from: classes.dex */
public final class C2436c extends AbstractC0945b<C2439f> {

    /* renamed from: a */
    final /* synthetic */ C2435b f10703a;

    @Override // androidx.room.AbstractC0942ak
    /* renamed from: a */
    public final String mo3368a() {
        return "INSERT OR REPLACE INTO `a_e` (`id`,`auth_code`,`is_enable`,`uid`,`packageName`,`capability_name`,`expiration`,`permission`,`last_update_time`,`cache_time`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2436c(C2435b c2435b, AbstractC0969z abstractC0969z) {
        super(abstractC0969z);
        this.f10703a = c2435b;
    }

    @Override // androidx.room.AbstractC0945b
    /* renamed from: a */
    public final /* synthetic */ void mo3372a(InterfaceC0654j interfaceC0654j, C2439f c2439f) {
        C2439f c2439f2 = c2439f;
        interfaceC0654j.mo2228a(1, c2439f2.m7764a());
        if (c2439f2.m7766b() == null) {
            interfaceC0654j.mo2226a(2);
        } else {
            interfaceC0654j.mo2229a(2, c2439f2.m7766b());
        }
        interfaceC0654j.mo2228a(3, c2439f2.m7767c() ? 1L : 0L);
        interfaceC0654j.mo2228a(4, c2439f2.m7768d());
        if (c2439f2.m7769e() == null) {
            interfaceC0654j.mo2226a(5);
        } else {
            interfaceC0654j.mo2229a(5, c2439f2.m7769e());
        }
        if (c2439f2.m7770f() == null) {
            interfaceC0654j.mo2226a(6);
        } else {
            interfaceC0654j.mo2229a(6, c2439f2.m7770f());
        }
        interfaceC0654j.mo2228a(7, c2439f2.m7771g());
        if (c2439f2.m7772h() == null) {
            interfaceC0654j.mo2226a(8);
        } else {
            interfaceC0654j.mo2230a(8, c2439f2.m7772h());
        }
        interfaceC0654j.mo2228a(9, c2439f2.m7773i());
        interfaceC0654j.mo2228a(10, c2439f2.m7774j());
    }
}
