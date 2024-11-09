package com.coloros.anim;

import android.animation.ValueAnimator;
import com.coloros.anim.p056c.p059c.C1746d;
import com.coloros.anim.p062f.ChoreographerFrameCallbackC1807c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EffectiveAnimationDrawable.java */
/* renamed from: com.coloros.anim.c */
/* loaded from: classes.dex */
public final class C1701c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1698b f8091a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1701c(C1698b c1698b) {
        this.f8091a = c1698b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C1746d c1746d;
        C1746d c1746d2;
        ChoreographerFrameCallbackC1807c choreographerFrameCallbackC1807c;
        c1746d = this.f8091a.f8076o;
        if (c1746d != null) {
            c1746d2 = this.f8091a.f8076o;
            choreographerFrameCallbackC1807c = this.f8091a.f8066e;
            c1746d2.mo5747a(choreographerFrameCallbackC1807c.m5877d());
        }
    }
}
