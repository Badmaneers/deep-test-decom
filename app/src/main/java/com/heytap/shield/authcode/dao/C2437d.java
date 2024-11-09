package com.heytap.shield.authcode.dao;

import androidx.room.AbstractC0942ak;
import androidx.room.AbstractC0969z;

/* compiled from: AuthenticationDao_Impl.java */
/* renamed from: com.heytap.shield.authcode.dao.d */
/* loaded from: classes.dex */
public final class C2437d extends AbstractC0942ak {

    /* renamed from: a */
    final /* synthetic */ C2435b f10704a;

    @Override // androidx.room.AbstractC0942ak
    /* renamed from: a */
    public final String mo3368a() {
        return "DELETE from a_e WHERE a_e.uid = (?)AND a_e.capability_name = (?)AND a_e.auth_code = (?)";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2437d(C2435b c2435b, AbstractC0969z abstractC0969z) {
        super(abstractC0969z);
        this.f10704a = c2435b;
    }
}
