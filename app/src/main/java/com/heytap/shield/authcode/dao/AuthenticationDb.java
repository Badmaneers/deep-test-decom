package com.heytap.shield.authcode.dao;

import android.content.Context;
import androidx.room.AbstractC0969z;
import androidx.room.C0968y;

/* loaded from: classes.dex */
public abstract class AuthenticationDb extends AbstractC0969z {

    /* renamed from: d */
    private static volatile AuthenticationDb f10697d;

    /* renamed from: l */
    public abstract InterfaceC2434a mo7750l();

    /* renamed from: a */
    public static AuthenticationDb m7749a(Context context) {
        if (f10697d == null) {
            synchronized (AuthenticationDb.class) {
                if (f10697d == null) {
                    f10697d = (AuthenticationDb) C0968y.m3399a(context.getApplicationContext(), AuthenticationDb.class, "authentication.db").m3347a().m3348b();
                }
            }
        }
        return f10697d;
    }
}
