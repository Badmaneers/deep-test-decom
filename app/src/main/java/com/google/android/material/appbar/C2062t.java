package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C2243al;

/* compiled from: ViewUtilsLollipop.java */
/* renamed from: com.google.android.material.appbar.t */
/* loaded from: classes.dex */
final class C2062t {

    /* renamed from: a */
    private static final int[] f9095a = {R.attr.stateListAnimator};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6336a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6338a(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray m7095a = C2243al.m7095a(context, attributeSet, f9095a, i, i2, new int[0]);
        try {
            if (m7095a.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, m7095a.getResourceId(0, 0)));
            }
        } finally {
            m7095a.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6337a(View view, float f) {
        int integer = view.getResources().getInteger(com.google.android.material.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, com.google.android.material.R.attr.state_liftable, -com.google.android.material.R.attr.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
