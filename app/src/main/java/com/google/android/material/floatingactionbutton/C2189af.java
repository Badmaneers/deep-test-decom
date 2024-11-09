package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.content.C0420a;
import androidx.core.p023f.C0478i;
import com.google.android.material.R;
import com.google.android.material.p080i.C2229c;
import com.google.android.material.p081j.InterfaceC2283b;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2303p;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImplLollipop.java */
/* renamed from: com.google.android.material.floatingactionbutton.af */
/* loaded from: classes.dex */
public final class C2189af extends C2209s {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: f */
    public final void mo6971f() {
    }

    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: n */
    final boolean mo6974n() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: s */
    final void mo6976s() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2189af(FloatingActionButton floatingActionButton, InterfaceC2283b interfaceC2283b) {
        super(floatingActionButton, interfaceC2283b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: a */
    public final void mo6968a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.f9785c = mo6975p();
        this.f9785c.setTintList(colorStateList);
        if (mode != null) {
            this.f9785c.setTintMode(mode);
        }
        this.f9785c.m7276a(this.f9795s.getContext());
        if (i <= 0) {
            this.f9787e = null;
            drawable = this.f9785c;
        } else {
            Context context = this.f9795s.getContext();
            C2193c c2193c = new C2193c((C2303p) C0478i.m1620a(this.f9784b));
            c2193c.m6991a(C0420a.m1488c(context, R.color.design_fab_stroke_top_outer_color), C0420a.m1488c(context, R.color.design_fab_stroke_top_inner_color), C0420a.m1488c(context, R.color.design_fab_stroke_end_inner_color), C0420a.m1488c(context, R.color.design_fab_stroke_end_outer_color));
            c2193c.m6990a(i);
            c2193c.m6992a(colorStateList);
            this.f9787e = c2193c;
            drawable = new LayerDrawable(new Drawable[]{(Drawable) C0478i.m1620a(this.f9787e), (Drawable) C0478i.m1620a(this.f9785c)});
        }
        this.f9786d = new RippleDrawable(C2229c.m7066b(colorStateList2), drawable, null);
        this.f9788f = this.f9786d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: a */
    public final void mo6967a(ColorStateList colorStateList) {
        if (this.f9786d instanceof RippleDrawable) {
            ((RippleDrawable) this.f9786d).setColor(C2229c.m7066b(colorStateList));
        } else {
            super.mo6967a(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: a */
    final void mo6966a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f9795s.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f9766m, m6964a(f, f3));
            stateListAnimator.addState(f9767n, m6964a(f, f2));
            stateListAnimator.addState(f9768o, m6964a(f, f2));
            stateListAnimator.addState(f9769p, m6964a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f9795s, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.f9795s, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, this.f9795s.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f9795s, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f9765a);
            stateListAnimator.addState(f9770q, animatorSet);
            stateListAnimator.addState(f9771r, m6964a(0.0f, 0.0f));
            this.f9795s.setStateListAnimator(stateListAnimator);
        }
        if (mo6973k()) {
            m7029j();
        }
    }

    /* renamed from: a */
    private Animator m6964a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f9795s, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f9795s, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(f9765a);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: a */
    public final float mo6965a() {
        return this.f9795s.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: i */
    public final void mo6972i() {
        m7029j();
    }

    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: k */
    final boolean mo6973k() {
        return this.f9796t.mo6999a() || !m7026e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: a */
    public final void mo6970a(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f9795s.isEnabled()) {
                this.f9795s.setElevation(this.f9791i);
                if (this.f9795s.isPressed()) {
                    this.f9795s.setTranslationZ(this.f9793k);
                    return;
                } else if (this.f9795s.isFocused() || this.f9795s.isHovered()) {
                    this.f9795s.setTranslationZ(this.f9792j);
                    return;
                } else {
                    this.f9795s.setTranslationZ(0.0f);
                    return;
                }
            }
            this.f9795s.setElevation(0.0f);
            this.f9795s.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: p */
    final C2295h mo6975p() {
        return new C2190ag((C2303p) C0478i.m1620a(this.f9784b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C2209s
    /* renamed from: a */
    public final void mo6969a(Rect rect) {
        if (this.f9796t.mo6999a()) {
            super.mo6969a(rect);
        } else if (!m7026e()) {
            int sizeDimension = (this.f9794l - this.f9795s.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
