package androidx.p028d.p029a.p030a;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator.java */
/* renamed from: androidx.d.a.a.d */
/* loaded from: classes.dex */
abstract class AbstractInterpolatorC0599d implements Interpolator {

    /* renamed from: a */
    private final float[] f2578a;

    /* renamed from: b */
    private final float f2579b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractInterpolatorC0599d(float[] fArr) {
        this.f2578a = fArr;
        this.f2579b = 1.0f / (this.f2578a.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) ((this.f2578a.length - 1) * f), this.f2578a.length - 2);
        return this.f2578a[min] + (((f - (min * this.f2579b)) / this.f2579b) * (this.f2578a[min + 1] - this.f2578a[min]));
    }
}
