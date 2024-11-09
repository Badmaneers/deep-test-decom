package com.google.android.material.p082k;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: ShapePath.java */
/* renamed from: com.google.android.material.k.aa */
/* loaded from: classes.dex */
public final class C2285aa extends AbstractC2286ab {

    /* renamed from: a */
    private float f10056a;

    /* renamed from: b */
    private float f10057b;

    @Override // com.google.android.material.p082k.AbstractC2286ab
    /* renamed from: a */
    public final void mo7230a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f10058g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f10056a, this.f10057b);
        path.transform(matrix);
    }
}
