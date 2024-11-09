package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

/* compiled from: FragmentManagerImpl.java */
/* renamed from: androidx.fragment.app.aa */
/* loaded from: classes.dex */
final class C0657aa {

    /* renamed from: a */
    public final Animation f2824a;

    /* renamed from: b */
    public final Animator f2825b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0657aa(Animation animation) {
        this.f2824a = animation;
        this.f2825b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0657aa(Animator animator) {
        this.f2824a = null;
        this.f2825b = animator;
        if (animator == null) {
            throw new IllegalStateException("Animator cannot be null");
        }
    }
}
