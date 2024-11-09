package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ChangeBounds.java */
/* renamed from: androidx.transition.f */
/* loaded from: classes.dex */
final class C1049f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f4216a;

    /* renamed from: b */
    final /* synthetic */ BitmapDrawable f4217b;

    /* renamed from: c */
    final /* synthetic */ View f4218c;

    /* renamed from: d */
    final /* synthetic */ float f4219d;

    /* renamed from: e */
    final /* synthetic */ C1047d f4220e;

    public C1049f(C1047d c1047d, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
        this.f4220e = c1047d;
        this.f4216a = viewGroup;
        this.f4217b = bitmapDrawable;
        this.f4218c = view;
        this.f4219d = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1030bf.m3552a(this.f4216a).mo3541b(this.f4217b);
        C1030bf.m3553a(this.f4218c, this.f4219d);
    }
}
