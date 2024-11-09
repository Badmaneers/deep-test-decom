package com.coloros.anim.p062f;

/* compiled from: MeanCalculator.java */
/* renamed from: com.coloros.anim.f.e */
/* loaded from: classes.dex */
public final class C1809e {

    /* renamed from: a */
    private float f8401a;

    /* renamed from: b */
    private int f8402b;

    /* renamed from: a */
    public final void m5890a(float f) {
        this.f8401a += f;
        this.f8402b++;
        if (this.f8402b == Integer.MAX_VALUE) {
            this.f8401a /= 2.0f;
            this.f8402b /= 2;
        }
    }
}
