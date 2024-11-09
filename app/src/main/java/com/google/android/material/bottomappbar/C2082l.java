package com.google.android.material.bottomappbar;

import com.google.android.material.p082k.C2293f;
import com.google.android.material.p082k.C2309v;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* renamed from: com.google.android.material.bottomappbar.l */
/* loaded from: classes.dex */
public final class C2082l extends C2293f implements Cloneable {

    /* renamed from: a */
    private float f9188a;

    /* renamed from: b */
    private float f9189b;

    /* renamed from: c */
    private float f9190c;

    /* renamed from: d */
    private float f9191d;

    /* renamed from: e */
    private float f9192e;

    public C2082l(float f, float f2, float f3) {
        this.f9189b = f;
        this.f9188a = f2;
        m6452c(f3);
        this.f9192e = 0.0f;
    }

    @Override // com.google.android.material.p082k.C2293f
    /* renamed from: a */
    public final void mo6448a(float f, float f2, float f3, C2309v c2309v) {
        if (this.f9190c == 0.0f) {
            c2309v.m7365b(f, 0.0f);
            return;
        }
        float f4 = ((this.f9189b * 2.0f) + this.f9190c) / 2.0f;
        float f5 = f3 * this.f9188a;
        float f6 = f2 + this.f9192e;
        float f7 = (this.f9191d * f3) + ((1.0f - f3) * f4);
        if (f7 / f4 >= 1.0f) {
            c2309v.m7365b(f, 0.0f);
            return;
        }
        float f8 = f4 + f5;
        float f9 = f7 + f5;
        float sqrt = (float) Math.sqrt((f8 * f8) - (f9 * f9));
        float f10 = f6 - sqrt;
        float f11 = f6 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f9));
        float f12 = 90.0f - degrees;
        c2309v.m7365b(f10, 0.0f);
        float f13 = f5 * 2.0f;
        c2309v.m7362a(f10 - f5, 0.0f, f10 + f5, f13, 270.0f, degrees);
        c2309v.m7362a(f6 - f4, (-f4) - f7, f6 + f4, f4 - f7, 180.0f - f12, (f12 * 2.0f) - 180.0f);
        c2309v.m7362a(f11 - f5, 0.0f, f11 + f5, f13, 270.0f - degrees, degrees);
        c2309v.m7365b(f, 0.0f);
    }

    /* renamed from: a */
    public final float m6446a() {
        return this.f9190c;
    }

    /* renamed from: a */
    public final void m6447a(float f) {
        this.f9190c = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m6450b(float f) {
        this.f9192e = f;
    }

    /* renamed from: b */
    public final float m6449b() {
        return this.f9192e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final float m6451c() {
        return this.f9191d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m6452c(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f9191d = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final float m6453d() {
        return this.f9189b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m6454d(float f) {
        this.f9189b = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final float m6455e() {
        return this.f9188a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m6456e(float f) {
        this.f9188a = f;
    }
}
