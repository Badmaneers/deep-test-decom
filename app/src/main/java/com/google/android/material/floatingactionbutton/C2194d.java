package com.google.android.material.floatingactionbutton;

import android.graphics.drawable.Drawable;

/* compiled from: BorderDrawable.java */
/* renamed from: com.google.android.material.floatingactionbutton.d */
/* loaded from: classes.dex */
final class C2194d extends Drawable.ConstantState {

    /* renamed from: a */
    final /* synthetic */ C2193c f9747a;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    private C2194d(C2193c c2193c) {
        this.f9747a = c2193c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2194d(C2193c c2193c, byte b) {
        this(c2193c);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.f9747a;
    }
}
