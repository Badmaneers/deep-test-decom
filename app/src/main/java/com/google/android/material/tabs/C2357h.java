package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabLayout.java */
/* renamed from: com.google.android.material.tabs.h */
/* loaded from: classes.dex */
public final class C2357h extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f10415a;

    /* renamed from: b */
    final /* synthetic */ C2355f f10416b;

    public C2357h(C2355f c2355f, int i) {
        this.f10416b = c2355f;
        this.f10415a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10416b.f10400a = this.f10415a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10416b.f10400a = this.f10415a;
        this.f10416b.f10401b = 0.0f;
    }
}
