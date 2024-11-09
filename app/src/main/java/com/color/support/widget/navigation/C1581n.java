package com.color.support.widget.navigation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* compiled from: ColorTextScale.java */
@TargetApi(19)
/* renamed from: com.color.support.widget.navigation.n */
/* loaded from: classes.dex */
public final class C1581n extends Transition {
    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        m5322a(transitionValues);
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        m5322a(transitionValues);
    }

    /* renamed from: a */
    private static void m5322a(TransitionValues transitionValues) {
        if (transitionValues.view instanceof TextView) {
            transitionValues.values.put("android:textscale:scale", Float.valueOf(((TextView) transitionValues.view).getScaleX()));
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !(transitionValues.view instanceof TextView) || !(transitionValues2.view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) transitionValues2.view;
        Map map = transitionValues.values;
        Map map2 = transitionValues2.values;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new C1582o(this, textView));
        return ofFloat;
    }
}
