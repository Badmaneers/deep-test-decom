package com.google.android.material.p080i;

import android.graphics.drawable.Drawable;
import com.google.android.material.p082k.C2295h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RippleDrawableCompat.java */
/* renamed from: com.google.android.material.i.b */
/* loaded from: classes.dex */
public final class C2228b extends Drawable.ConstantState {

    /* renamed from: a */
    C2295h f9841a;

    /* renamed from: b */
    boolean f9842b;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public C2228b(C2295h c2295h) {
        this.f9841a = c2295h;
        this.f9842b = false;
    }

    public C2228b(C2228b c2228b) {
        this.f9841a = (C2295h) c2228b.f9841a.getConstantState().newDrawable();
        this.f9842b = c2228b.f9842b;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final /* synthetic */ Drawable newDrawable() {
        return new C2227a(new C2228b(this), (byte) 0);
    }
}
