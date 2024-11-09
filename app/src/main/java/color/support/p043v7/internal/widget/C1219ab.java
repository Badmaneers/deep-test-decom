package color.support.p043v7.internal.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.ab */
/* loaded from: classes.dex */
final class C1219ab extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1256w f5208a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1219ab(C1256w c1256w) {
        this.f5208a = c1256w;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC1255v interfaceC1255v;
        InterfaceC1255v unused;
        super.onAnimationEnd(animator);
        interfaceC1255v = this.f5208a.f5279b.f5194ag;
        if (interfaceC1255v != null) {
            unused = this.f5208a.f5279b.f5194ag;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        InterfaceC1255v interfaceC1255v;
        InterfaceC1255v unused;
        super.onAnimationStart(animator);
        interfaceC1255v = this.f5208a.f5279b.f5194ag;
        if (interfaceC1255v != null) {
            unused = this.f5208a.f5279b.f5194ag;
        }
    }
}
