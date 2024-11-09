package androidx.vectordrawable.p039a.p040a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.u */
/* loaded from: classes.dex */
public final class C1089u extends Drawable.ConstantState {

    /* renamed from: a */
    private final Drawable.ConstantState f4357a;

    public C1089u(Drawable.ConstantState constantState) {
        this.f4357a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1081m c1081m = new C1081m();
        c1081m.f4288c = (VectorDrawable) this.f4357a.newDrawable();
        return c1081m;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1081m c1081m = new C1081m();
        c1081m.f4288c = (VectorDrawable) this.f4357a.newDrawable(resources);
        return c1081m;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1081m c1081m = new C1081m();
        c1081m.f4288c = (VectorDrawable) this.f4357a.newDrawable(resources, theme);
        return c1081m;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4357a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4357a.getChangingConfigurations();
    }
}
