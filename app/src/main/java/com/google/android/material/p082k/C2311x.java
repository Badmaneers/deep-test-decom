package com.google.android.material.p082k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.material.p081j.C2282a;

/* compiled from: ShapePath.java */
/* renamed from: com.google.android.material.k.x */
/* loaded from: classes.dex */
final class C2311x extends AbstractC2287ac {

    /* renamed from: a */
    private final C2313z f10169a;

    public C2311x(C2313z c2313z) {
        this.f10169a = c2313z;
    }

    @Override // com.google.android.material.p082k.AbstractC2287ac
    /* renamed from: a */
    public final void mo7231a(Matrix matrix, C2282a c2282a, int i, Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        f = this.f10169a.f10178e;
        f2 = this.f10169a.f10179f;
        f3 = this.f10169a.f10174a;
        f4 = this.f10169a.f10175b;
        f5 = this.f10169a.f10176c;
        f6 = this.f10169a.f10177d;
        c2282a.m7224a(canvas, matrix, new RectF(f3, f4, f5, f6), i, f, f2);
    }
}
