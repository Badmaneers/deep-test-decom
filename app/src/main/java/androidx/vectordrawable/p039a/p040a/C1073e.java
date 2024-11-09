package androidx.vectordrawable.p039a.p040a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.p011b.C0318a;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedVectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.e */
/* loaded from: classes.dex */
public final class C1073e extends Drawable.ConstantState {

    /* renamed from: a */
    int f4278a;

    /* renamed from: b */
    C1081m f4279b;

    /* renamed from: c */
    AnimatorSet f4280c;

    /* renamed from: d */
    ArrayList<Animator> f4281d;

    /* renamed from: e */
    C0318a<Animator, String> f4282e;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4278a;
    }
}
