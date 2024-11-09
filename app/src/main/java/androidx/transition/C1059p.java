package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: Fade.java */
/* renamed from: androidx.transition.p */
/* loaded from: classes.dex */
public final class C1059p extends AbstractC1039bo {
    public C1059p(int i) {
        m3573a(i);
    }

    public C1059p() {
    }

    @Override // androidx.transition.AbstractC1039bo, androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final void mo3492a(C1017at c1017at) {
        super.mo3492a(c1017at);
        c1017at.f4149a.put("android:fade:transitionAlpha", Float.valueOf(C1030bf.m3559c(c1017at.f4150b)));
    }

    /* renamed from: a */
    private Animator m3582a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1030bf.m3553a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1030bf.f4171a, f2);
        ofFloat.addListener(new C1061s(view));
        mo3484a(new C1060q(this, view));
        return ofFloat;
    }

    @Override // androidx.transition.AbstractC1039bo
    /* renamed from: a */
    public final Animator mo3572a(View view, C1017at c1017at) {
        float m3581a = m3581a(c1017at, 0.0f);
        if (m3581a == 1.0f) {
            m3581a = 0.0f;
        }
        return m3582a(view, m3581a, 1.0f);
    }

    @Override // androidx.transition.AbstractC1039bo
    /* renamed from: b */
    public final Animator mo3574b(View view, C1017at c1017at) {
        C1030bf.m3560d(view);
        return m3582a(view, m3581a(c1017at, 1.0f), 0.0f);
    }

    /* renamed from: a */
    private static float m3581a(C1017at c1017at, float f) {
        Float f2;
        return (c1017at == null || (f2 = (Float) c1017at.f4149a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }
}
