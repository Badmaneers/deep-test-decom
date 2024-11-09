package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomAppBar.java */
/* renamed from: com.google.android.material.bottomappbar.i */
/* loaded from: classes.dex */
public final class C2079i extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ BottomAppBar f9186a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2079i(BottomAppBar bottomAppBar) {
        this.f9186a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        FloatingActionButton m6424n;
        float fabTranslationX;
        this.f9186a.f9148e.onAnimationStart(animator);
        m6424n = this.f9186a.m6424n();
        if (m6424n != null) {
            fabTranslationX = this.f9186a.getFabTranslationX();
            m6424n.setTranslationX(fabTranslationX);
        }
    }
}
