package com.google.android.material.p080i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.InterfaceC0547b;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.InterfaceC2288ad;

/* compiled from: RippleDrawableCompat.java */
/* renamed from: com.google.android.material.i.a */
/* loaded from: classes.dex */
public final class C2227a extends Drawable implements InterfaceC0547b, InterfaceC2288ad {

    /* renamed from: a */
    private C2228b f9840a;

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2227a(C2228b c2228b, byte b) {
        this(c2228b);
    }

    public C2227a(C2303p c2303p) {
        this(new C2228b(new C2295h(c2303p)));
    }

    private C2227a(C2228b c2228b) {
        this.f9840a = c2228b;
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTint(int i) {
        this.f9840a.f9841a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f9840a.f9841a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTintList(ColorStateList colorStateList) {
        this.f9840a.f9841a.setTintList(colorStateList);
    }

    @Override // com.google.android.material.p082k.InterfaceC2288ad
    public final void setShapeAppearanceModel(C2303p c2303p) {
        this.f9840a.f9841a.setShapeAppearanceModel(c2303p);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f9840a.f9841a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m7065a = C2229c.m7065a(iArr);
        if (this.f9840a.f9842b == m7065a) {
            return onStateChange;
        }
        this.f9840a.f9842b = m7065a;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f9840a.f9842b) {
            this.f9840a.f9841a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9840a.f9841a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f9840a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f9840a.f9841a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9840a.f9841a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f9840a.f9841a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final /* synthetic */ Drawable mutate() {
        this.f9840a = new C2228b(this.f9840a);
        return this;
    }
}
