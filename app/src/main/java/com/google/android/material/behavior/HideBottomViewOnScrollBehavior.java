package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.AbstractC0391c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.p072a.C2032a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0391c<V> {

    /* renamed from: a */
    private int f9125a;

    /* renamed from: b */
    private int f9126b;

    /* renamed from: c */
    private int f9127c;

    /* renamed from: d */
    private ViewPropertyAnimator f9128d;

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public boolean mo1421a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ ViewPropertyAnimator m6385a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        hideBottomViewOnScrollBehavior.f9128d = null;
        return null;
    }

    public HideBottomViewOnScrollBehavior() {
        this.f9125a = 0;
        this.f9126b = 2;
        this.f9127c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9125a = 0;
        this.f9126b = 2;
        this.f9127c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public boolean mo1414a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f9125a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo1414a(coordinatorLayout, (CoordinatorLayout) v, i);
    }

    /* renamed from: a */
    public final void m6387a(V v, int i) {
        this.f9127c = i;
        if (this.f9126b == 1) {
            v.setTranslationY(this.f9125a + this.f9127c);
        }
    }

    /* renamed from: a */
    private void m6386a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f9128d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C2066a(this));
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1410a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.f9126b != 1) {
                if (this.f9128d != null) {
                    this.f9128d.cancel();
                    v.clearAnimation();
                }
                this.f9126b = 1;
                m6386a((HideBottomViewOnScrollBehavior<V>) v, this.f9125a + this.f9127c, 175L, C2032a.f8975c);
                return;
            }
            return;
        }
        if (i2 >= 0 || this.f9126b == 2) {
            return;
        }
        if (this.f9128d != null) {
            this.f9128d.cancel();
            v.clearAnimation();
        }
        this.f9126b = 2;
        m6386a((HideBottomViewOnScrollBehavior<V>) v, 0, 225L, C2032a.f8976d);
    }
}
