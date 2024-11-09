package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.AbstractC1001ad;
import androidx.transition.C1017at;
import java.util.Map;

/* compiled from: TextScale.java */
/* renamed from: com.google.android.material.internal.aj */
/* loaded from: classes.dex */
public final class C2241aj extends AbstractC1001ad {
    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final void mo3492a(C1017at c1017at) {
        m7094d(c1017at);
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: b */
    public final void mo3503b(C1017at c1017at) {
        m7094d(c1017at);
    }

    /* renamed from: d */
    private static void m7094d(C1017at c1017at) {
        if (c1017at.f4150b instanceof TextView) {
            c1017at.f4149a.put("android:textscale:scale", Float.valueOf(((TextView) c1017at.f4150b).getScaleX()));
        }
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final Animator mo3481a(ViewGroup viewGroup, C1017at c1017at, C1017at c1017at2) {
        if (c1017at == null || c1017at2 == null || !(c1017at.f4150b instanceof TextView) || !(c1017at2.f4150b instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) c1017at2.f4150b;
        Map<String, Object> map = c1017at.f4149a;
        Map<String, Object> map2 = c1017at2.f4149a;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new C2242ak(this, textView));
        return ofFloat;
    }
}
