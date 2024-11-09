package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import com.google.android.material.p072a.C2032a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabLayout.java */
/* renamed from: com.google.android.material.tabs.g */
/* loaded from: classes.dex */
public final class C2356g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ int f10412a;

    /* renamed from: b */
    final /* synthetic */ int f10413b;

    /* renamed from: c */
    final /* synthetic */ C2355f f10414c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2356g(C2355f c2355f, int i, int i2) {
        this.f10414c = c2355f;
        this.f10412a = i;
        this.f10413b = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C2355f c2355f = this.f10414c;
        i = this.f10414c.f10410k;
        int m6241a = C2032a.m6241a(i, this.f10412a, animatedFraction);
        i2 = this.f10414c.f10411l;
        c2355f.m7529a(m6241a, C2032a.m6241a(i2, this.f10413b, animatedFraction));
    }
}
