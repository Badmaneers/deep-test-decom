package androidx.appcompat.p008b.p009a;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: AnimatedStateListDrawableCompat.java */
/* renamed from: androidx.appcompat.b.a.f */
/* loaded from: classes.dex */
final class C0117f implements TimeInterpolator {

    /* renamed from: a */
    private int[] f383a;

    /* renamed from: b */
    private int f384b;

    /* renamed from: c */
    private int f385c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0117f(AnimationDrawable animationDrawable, boolean z) {
        m272a(animationDrawable, z);
    }

    /* renamed from: a */
    private int m272a(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.f384b = numberOfFrames;
        if (this.f383a == null || this.f383a.length < numberOfFrames) {
            this.f383a = new int[numberOfFrames];
        }
        int[] iArr = this.f383a;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr[i2] = duration;
            i += duration;
        }
        this.f385c = i;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m273a() {
        return this.f385c;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = (int) ((f * this.f385c) + 0.5f);
        int i2 = this.f384b;
        int[] iArr = this.f383a;
        int i3 = 0;
        while (i3 < i2 && i >= iArr[i3]) {
            i -= iArr[i3];
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.f385c : 0.0f);
    }
}
