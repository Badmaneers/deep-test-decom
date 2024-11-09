package color.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ColorTabLayout.java */
/* renamed from: color.support.design.widget.j */
/* loaded from: classes.dex */
public final class C1181j extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f4799a;

    /* renamed from: b */
    final /* synthetic */ C1179h f4800b;

    public C1181j(C1179h c1179h, int i) {
        this.f4800b = c1179h;
        this.f4799a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4800b.f4773a = this.f4799a;
        this.f4800b.f4774b = 0.0f;
    }
}
