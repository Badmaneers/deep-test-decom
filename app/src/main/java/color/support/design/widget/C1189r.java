package color.support.design.widget;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: ViewUtilsLollipop.java */
/* renamed from: color.support.design.widget.r */
/* loaded from: classes.dex */
final class C1189r {

    /* renamed from: a */
    private static final int[] f4844a = {R.attr.stateListAnimator};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3945a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3947a(View view, AttributeSet attributeSet, int i) {
        Context context = view.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4844a, 0, i);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, obtainStyledAttributes.getResourceId(0, 0)));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3946a(View view, float f) {
        int integer = view.getResources().getInteger(color.support.p043v7.appcompat.R.integer.colorAppBarElevationAnimDuration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, color.support.p043v7.appcompat.R.attr.colorStateCollapsible, -color.support.p043v7.appcompat.R.attr.colorStateCollapsed}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
