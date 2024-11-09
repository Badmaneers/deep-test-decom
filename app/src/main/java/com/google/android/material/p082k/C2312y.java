package com.google.android.material.p082k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.material.p081j.C2282a;

/* compiled from: ShapePath.java */
/* renamed from: com.google.android.material.k.y */
/* loaded from: classes.dex */
final class C2312y extends AbstractC2287ac {

    /* renamed from: a */
    private final C2285aa f10170a;

    /* renamed from: b */
    private final float f10171b;

    /* renamed from: c */
    private final float f10172c;

    public C2312y(C2285aa c2285aa, float f, float f2) {
        this.f10170a = c2285aa;
        this.f10171b = f;
        this.f10172c = f2;
    }

    @Override // com.google.android.material.p082k.AbstractC2287ac
    /* renamed from: a */
    public final void mo7231a(Matrix matrix, C2282a c2282a, int i, Canvas canvas) {
        float f;
        float f2;
        f = this.f10170a.f10057b;
        float f3 = f - this.f10172c;
        f2 = this.f10170a.f10056a;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f3, f2 - this.f10171b), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(this.f10171b, this.f10172c);
        matrix2.preRotate(m7366a());
        c2282a.m7223a(canvas, matrix2, rectF, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final float m7366a() {
        float f;
        float f2;
        f = this.f10170a.f10057b;
        float f3 = f - this.f10172c;
        f2 = this.f10170a.f10056a;
        return (float) Math.toDegrees(Math.atan(f3 / (f2 - this.f10171b)));
    }
}
