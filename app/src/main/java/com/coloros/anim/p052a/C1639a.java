package com.coloros.anim.p052a;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* compiled from: LPaint.java */
/* renamed from: com.coloros.anim.a.a */
/* loaded from: classes.dex */
public final class C1639a extends Paint {
    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public C1639a() {
    }

    public C1639a(int i) {
        super(i);
    }

    public C1639a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C1639a(PorterDuff.Mode mode, byte b) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
