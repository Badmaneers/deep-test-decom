package com.google.android.material.p072a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: MatrixEvaluator.java */
/* renamed from: com.google.android.material.a.g */
/* loaded from: classes.dex */
public class C2038g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f8983a = new float[9];

    /* renamed from: b */
    private final float[] f8984b = new float[9];

    /* renamed from: c */
    private final Matrix f8985c = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f8983a);
        matrix2.getValues(this.f8984b);
        for (int i = 0; i < 9; i++) {
            this.f8984b[i] = this.f8983a[i] + ((this.f8984b[i] - this.f8983a[i]) * f);
        }
        this.f8985c.setValues(this.f8984b);
        return this.f8985c;
    }
}
