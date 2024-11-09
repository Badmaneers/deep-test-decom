package androidx.fragment.app;

import android.view.View;

/* compiled from: FragmentManagerImpl.java */
/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
final class RunnableC0711w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AnimationAnimationListenerC0710v f3025a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0711w(AnimationAnimationListenerC0710v animationAnimationListenerC0710v) {
        this.f3025a = animationAnimationListenerC0710v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3025a.f3023b.m2271Y() != null) {
            this.f3025a.f3023b.m2281a((View) null);
            this.f3025a.f3024c.m2541a(this.f3025a.f3023b, this.f3025a.f3023b.m2287aa(), 0, 0, false);
        }
    }
}
