package com.google.android.material.p082k;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: ShapePath.java */
/* renamed from: com.google.android.material.k.z */
/* loaded from: classes.dex */
public final class C2313z extends AbstractC2286ab {

    /* renamed from: h */
    private static final RectF f10173h = new RectF();

    /* renamed from: a */
    @Deprecated
    public float f10174a;

    /* renamed from: b */
    @Deprecated
    public float f10175b;

    /* renamed from: c */
    @Deprecated
    public float f10176c;

    /* renamed from: d */
    @Deprecated
    public float f10177d;

    /* renamed from: e */
    @Deprecated
    public float f10178e;

    /* renamed from: f */
    @Deprecated
    public float f10179f;

    public C2313z(float f, float f2, float f3, float f4) {
        this.f10174a = f;
        this.f10175b = f2;
        this.f10176c = f3;
        this.f10177d = f4;
    }

    @Override // com.google.android.material.p082k.AbstractC2286ab
    /* renamed from: a */
    public final void mo7230a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f10058g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        f10173h.set(this.f10174a, this.f10175b, this.f10176c, this.f10177d);
        path.arcTo(f10173h, this.f10178e, this.f10179f, false);
        path.transform(matrix);
    }
}
