package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* renamed from: com.google.android.material.internal.ab */
/* loaded from: classes.dex */
public final class C2233ab {

    /* renamed from: b */
    private final ArrayList<C2235ad> f9904b = new ArrayList<>();

    /* renamed from: c */
    private C2235ad f9905c = null;

    /* renamed from: a */
    ValueAnimator f9903a = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f9906d = new C2234ac(this);

    /* renamed from: a */
    public final void m7078a(int[] iArr, ValueAnimator valueAnimator) {
        C2235ad c2235ad = new C2235ad(iArr, valueAnimator);
        valueAnimator.addListener(this.f9906d);
        this.f9904b.add(c2235ad);
    }

    /* renamed from: a */
    public final void m7077a(int[] iArr) {
        C2235ad c2235ad;
        int size = this.f9904b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c2235ad = null;
                break;
            }
            c2235ad = this.f9904b.get(i);
            if (StateSet.stateSetMatches(c2235ad.f9908a, iArr)) {
                break;
            } else {
                i++;
            }
        }
        if (c2235ad == this.f9905c) {
            return;
        }
        if (this.f9905c != null && this.f9903a != null) {
            this.f9903a.cancel();
            this.f9903a = null;
        }
        this.f9905c = c2235ad;
        if (c2235ad != null) {
            this.f9903a = c2235ad.f9909b;
            this.f9903a.start();
        }
    }

    /* renamed from: a */
    public final void m7076a() {
        if (this.f9903a != null) {
            this.f9903a.end();
            this.f9903a = null;
        }
    }
}
