package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableState.java */
/* renamed from: androidx.core.graphics.drawable.f */
/* loaded from: classes.dex */
public final class C0551f extends Drawable.ConstantState {

    /* renamed from: a */
    int f2421a;

    /* renamed from: b */
    Drawable.ConstantState f2422b;

    /* renamed from: c */
    ColorStateList f2423c;

    /* renamed from: d */
    PorterDuff.Mode f2424d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0551f(C0551f c0551f) {
        this.f2423c = null;
        this.f2424d = C0549d.f2413a;
        if (c0551f != null) {
            this.f2421a = c0551f.f2421a;
            this.f2422b = c0551f.f2422b;
            this.f2423c = c0551f.f2423c;
            this.f2424d = c0551f.f2424d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0550e(this, resources);
        }
        return new C0549d(this, resources);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return (this.f2422b != null ? this.f2422b.getChangingConfigurations() : 0) | this.f2421a;
    }
}
