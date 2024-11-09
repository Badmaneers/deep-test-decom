package androidx.swiperefreshlayout.widget;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CircularProgressDrawable.java */
/* renamed from: androidx.swiperefreshlayout.widget.e */
/* loaded from: classes.dex */
public final class C0985e implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ C0986f f4045a;

    /* renamed from: b */
    final /* synthetic */ C0983c f4046b;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    public C0985e(C0983c c0983c, C0986f c0986f) {
        this.f4046b = c0983c;
        this.f4045a = c0986f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4046b.f4037a = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.f4046b.m3459a(1.0f, this.f4045a, true);
        this.f4045a.m3471c();
        C0986f c0986f = this.f4045a;
        c0986f.m3467a(c0986f.m3465a());
        if (this.f4046b.f4038b) {
            this.f4046b.f4038b = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f4045a.m3468a(false);
            return;
        }
        this.f4046b.f4037a += 1.0f;
    }
}
