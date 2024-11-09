package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.p072a.C2033b;
import com.google.android.material.p072a.C2040i;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: a */
    private final C2040i f10615a;

    /* renamed from: b */
    private final C2040i f10616b;

    public FabTransformationScrimBehavior() {
        this.f10615a = new C2040i(75L);
        this.f10616b = new C2040i(0L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10615a = new C2040i(75L);
        this.f10616b = new C2040i(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1413a(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: b */
    public final boolean mo1423b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo1423b(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: b */
    protected final AnimatorSet mo7696b(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        C2040i c2040i = z ? this.f10615a : this.f10616b;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c2040i.m6259a((Animator) ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C2033b.m6242a(animatorSet, arrayList);
        animatorSet.addListener(new C2410h(this, z, view2));
        return animatorSet;
    }
}
