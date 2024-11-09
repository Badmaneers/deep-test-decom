package com.color.support.widget;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: ErrorEditTextHelper.java */
/* renamed from: com.color.support.widget.fd */
/* loaded from: classes.dex */
final class InterpolatorC1497fd implements Interpolator {

    /* renamed from: a */
    static final int f7158a;

    /* renamed from: b */
    private static final float[] f7159b = {0.0f, -1.0f, 0.5f, -0.5f, 0.0f};

    /* renamed from: c */
    private static final int[] f7160c;

    /* renamed from: d */
    private static final float[] f7161d;

    /* renamed from: e */
    private final Interpolator f7162e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ InterpolatorC1497fd(byte b) {
        this();
    }

    static {
        int[] iArr = {83, 133, 117, 117};
        f7160c = iArr;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 += iArr[i3];
        }
        f7158a = i2;
        f7161d = new float[f7160c.length + 1];
        int i4 = 0;
        while (i < f7160c.length) {
            i4 += f7160c[i];
            i++;
            f7161d[i] = i4 / f7158a;
        }
    }

    private InterpolatorC1497fd() {
        this.f7162e = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        for (int i = 1; i < f7161d.length; i++) {
            if (f <= f7161d[i]) {
                int i2 = i - 1;
                float interpolation = this.f7162e.getInterpolation((f - f7161d[i2]) / (f7161d[i] - f7161d[i2]));
                return (f7159b[i2] * (1.0f - interpolation)) + (f7159b[i] * interpolation);
            }
        }
        return 0.0f;
    }
}
