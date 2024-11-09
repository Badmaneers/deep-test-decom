package androidx.vectordrawable.p039a.p040a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.f */
/* loaded from: classes.dex */
final class C1074f extends Drawable.ConstantState {

    /* renamed from: a */
    private final Drawable.ConstantState f4283a;

    public C1074f(Drawable.ConstantState constantState) {
        this.f4283a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1071c c1071c = new C1071c();
        c1071c.f4288c = this.f4283a.newDrawable();
        c1071c.f4288c.setCallback(c1071c.f4272b);
        return c1071c;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1071c c1071c = new C1071c();
        c1071c.f4288c = this.f4283a.newDrawable(resources);
        c1071c.f4288c.setCallback(c1071c.f4272b);
        return c1071c;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1071c c1071c = new C1071c();
        c1071c.f4288c = this.f4283a.newDrawable(resources, theme);
        c1071c.f4288c.setCallback(c1071c.f4272b);
        return c1071c;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4283a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4283a.getChangingConfigurations();
    }
}
