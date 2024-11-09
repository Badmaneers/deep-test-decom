package androidx.appcompat.p008b.p009a;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;

/* compiled from: AnimatedStateListDrawableCompat.java */
/* renamed from: androidx.appcompat.b.a.e */
/* loaded from: classes.dex */
final class C0116e extends AbstractC0118g {

    /* renamed from: a */
    private final ObjectAnimator f381a;

    /* renamed from: b */
    private final boolean f382b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0116e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        super((byte) 0);
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C0117f c0117f = new C0117f(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        if (Build.VERSION.SDK_INT >= 18) {
            ofInt.setAutoCancel(true);
        }
        ofInt.setDuration(c0117f.m273a());
        ofInt.setInterpolator(c0117f);
        this.f382b = z2;
        this.f381a = ofInt;
    }

    @Override // androidx.appcompat.p008b.p009a.AbstractC0118g
    /* renamed from: c */
    public final boolean mo270c() {
        return this.f382b;
    }

    @Override // androidx.appcompat.p008b.p009a.AbstractC0118g
    /* renamed from: a */
    public final void mo260a() {
        this.f381a.start();
    }

    @Override // androidx.appcompat.p008b.p009a.AbstractC0118g
    /* renamed from: d */
    public final void mo271d() {
        this.f381a.reverse();
    }

    @Override // androidx.appcompat.p008b.p009a.AbstractC0118g
    /* renamed from: b */
    public final void mo261b() {
        this.f381a.cancel();
    }
}
