package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Visibility.java */
/* renamed from: androidx.transition.bq */
/* loaded from: classes.dex */
final class C1041bq extends AnimatorListenerAdapter implements InterfaceC1007aj, InterfaceC1024b {

    /* renamed from: b */
    private final View f4191b;

    /* renamed from: c */
    private final int f4192c;

    /* renamed from: d */
    private final ViewGroup f4193d;

    /* renamed from: f */
    private boolean f4195f;

    /* renamed from: a */
    boolean f4190a = false;

    /* renamed from: e */
    private final boolean f4194e = true;

    @Override // androidx.transition.InterfaceC1007aj
    /* renamed from: a */
    public final void mo3519a() {
    }

    @Override // androidx.transition.InterfaceC1007aj
    /* renamed from: d */
    public final void mo3523d() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1041bq(View view, int i) {
        this.f4191b = view;
        this.f4192c = i;
        this.f4193d = (ViewGroup) view.getParent();
        m3575a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.InterfaceC1024b
    public final void onAnimationPause(Animator animator) {
        if (this.f4190a) {
            return;
        }
        C1030bf.m3554a(this.f4191b, this.f4192c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.InterfaceC1024b
    public final void onAnimationResume(Animator animator) {
        if (this.f4190a) {
            return;
        }
        C1030bf.m3554a(this.f4191b, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4190a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m3576e();
    }

    @Override // androidx.transition.InterfaceC1007aj
    /* renamed from: a */
    public final void mo3520a(AbstractC1001ad abstractC1001ad) {
        m3576e();
        abstractC1001ad.mo3501b(this);
    }

    @Override // androidx.transition.InterfaceC1007aj
    /* renamed from: b */
    public final void mo3521b() {
        m3575a(false);
    }

    @Override // androidx.transition.InterfaceC1007aj
    /* renamed from: c */
    public final void mo3522c() {
        m3575a(true);
    }

    /* renamed from: e */
    private void m3576e() {
        if (!this.f4190a) {
            C1030bf.m3554a(this.f4191b, this.f4192c);
            if (this.f4193d != null) {
                this.f4193d.invalidate();
            }
        }
        m3575a(false);
    }

    /* renamed from: a */
    private void m3575a(boolean z) {
        if (!this.f4194e || this.f4195f == z || this.f4193d == null) {
            return;
        }
        this.f4195f = z;
        C1022ay.m3543a(this.f4193d, z);
    }
}
