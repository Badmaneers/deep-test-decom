package com.heytap.shield.authcode.dao;

import androidx.p032e.p033a.C0649e;
import androidx.p032e.p033a.InterfaceC0647c;
import androidx.room.C0922a;
import androidx.room.C0936ae;
import androidx.room.C0953j;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class AuthenticationDb_Impl extends AuthenticationDb {

    /* renamed from: d */
    private volatile InterfaceC2434a f10698d;

    @Override // androidx.room.AbstractC0969z
    /* renamed from: b */
    protected final InterfaceC0647c mo3407b(C0922a c0922a) {
        return c0922a.f3784a.mo2225a(C0649e.m2239a(c0922a.f3785b).m2242a(c0922a.f3786c).m2241a(new C0936ae(c0922a, new C2440g(this), "4900734c010240a846af4887983ab420", "bcb6b006fd96cb6cf4245dc2a4b99c48")).m2240a());
    }

    @Override // androidx.room.AbstractC0969z
    /* renamed from: c */
    protected final C0953j mo3408c() {
        return new C0953j(this, new HashMap(0), new HashMap(0), "a_e");
    }

    @Override // com.heytap.shield.authcode.dao.AuthenticationDb
    /* renamed from: l */
    public final InterfaceC2434a mo7750l() {
        InterfaceC2434a interfaceC2434a;
        if (this.f10698d != null) {
            return this.f10698d;
        }
        synchronized (this) {
            if (this.f10698d == null) {
                this.f10698d = new C2435b(this);
            }
            interfaceC2434a = this.f10698d;
        }
        return interfaceC2434a;
    }
}
