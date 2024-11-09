package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import androidx.core.p024g.C0538w;

/* compiled from: ChangeBounds.java */
/* renamed from: androidx.transition.m */
/* loaded from: classes.dex */
final class C1056m extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f4223a;

    /* renamed from: b */
    final /* synthetic */ Rect f4224b;

    /* renamed from: c */
    final /* synthetic */ int f4225c;

    /* renamed from: d */
    final /* synthetic */ int f4226d;

    /* renamed from: e */
    final /* synthetic */ int f4227e;

    /* renamed from: f */
    final /* synthetic */ int f4228f;

    /* renamed from: g */
    final /* synthetic */ C1047d f4229g;

    /* renamed from: h */
    private boolean f4230h;

    public C1056m(C1047d c1047d, View view, Rect rect, int i, int i2, int i3, int i4) {
        this.f4229g = c1047d;
        this.f4223a = view;
        this.f4224b = rect;
        this.f4225c = i;
        this.f4226d = i2;
        this.f4227e = i3;
        this.f4228f = i4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4230h = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f4230h) {
            return;
        }
        C0538w.m1845a(this.f4223a, this.f4224b);
        C1030bf.m3555a(this.f4223a, this.f4225c, this.f4226d, this.f4227e, this.f4228f);
    }
}
