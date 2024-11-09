package androidx.core.p024g.p026b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* compiled from: PathInterpolatorApi14.java */
/* renamed from: androidx.core.g.b.a */
/* loaded from: classes.dex */
final class InterpolatorC0516a implements Interpolator {

    /* renamed from: a */
    private final float[] f2359a;

    /* renamed from: b */
    private final float[] f2360b;

    private InterpolatorC0516a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f2359a = new float[i];
        this.f2360b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
            this.f2359a[i2] = fArr[0];
            this.f2360b[i2] = fArr[1];
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f2359a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f2359a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f2359a[length] - this.f2359a[i];
        if (f2 == 0.0f) {
            return this.f2360b[i];
        }
        float f3 = (f - this.f2359a[i]) / f2;
        float f4 = this.f2360b[i];
        return f4 + (f3 * (this.f2360b[length] - f4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InterpolatorC0516a(float r9, float r10, float r11, float r12) {
        /*
            r8 = this;
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r0 = 0
            r7.moveTo(r0, r0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.cubicTo(r1, r2, r3, r4, r5, r6)
            r8.<init>(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p024g.p026b.InterpolatorC0516a.<init>(float, float, float, float):void");
    }
}
