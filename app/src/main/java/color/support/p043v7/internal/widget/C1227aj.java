package color.support.p043v7.internal.widget;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListView;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.aj */
/* loaded from: classes.dex */
final class C1227aj implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ListView f5221a;

    /* renamed from: b */
    final /* synthetic */ Drawable f5222b;

    /* renamed from: c */
    final /* synthetic */ C1256w f5223c;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1227aj(C1256w c1256w, ListView listView, Drawable drawable) {
        this.f5223c = c1256w;
        this.f5221a = listView;
        this.f5222b = drawable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        InterfaceC1255v interfaceC1255v;
        InterfaceC1255v unused;
        this.f5221a.setTranslationY(-C1256w.m4095a((View) this.f5221a));
        this.f5222b.setAlpha(0);
        interfaceC1255v = this.f5223c.f5279b.f5194ag;
        if (interfaceC1255v != null) {
            unused = this.f5223c.f5279b.f5194ag;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC1255v interfaceC1255v;
        InterfaceC1255v unused;
        interfaceC1255v = this.f5223c.f5279b.f5194ag;
        if (interfaceC1255v != null) {
            unused = this.f5223c.f5279b.f5194ag;
        }
    }
}
