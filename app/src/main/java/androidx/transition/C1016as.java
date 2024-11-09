package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Build;

/* compiled from: TransitionUtils.java */
/* renamed from: androidx.transition.as */
/* loaded from: classes.dex */
final class C1016as {

    /* renamed from: a */
    private static final boolean f4146a;

    /* renamed from: b */
    private static final boolean f4147b;

    /* renamed from: c */
    private static final boolean f4148c;

    static {
        f4146a = Build.VERSION.SDK_INT >= 19;
        f4147b = Build.VERSION.SDK_INT >= 18;
        f4148c = Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0102  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.View m3537a(android.view.ViewGroup r16, android.view.View r17, android.view.View r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1016as.m3537a(android.view.ViewGroup, android.view.View, android.view.View):android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Animator m3536a(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
