package com.coloros.anim.p063g;

/* compiled from: ScaleXY.java */
/* renamed from: com.coloros.anim.g.d */
/* loaded from: classes.dex */
public final class C1816d {

    /* renamed from: a */
    private float f8436a;

    /* renamed from: b */
    private float f8437b;

    public C1816d(float f, float f2) {
        this.f8436a = f;
        this.f8437b = f2;
    }

    public C1816d() {
        this(1.0f, 1.0f);
    }

    /* renamed from: a */
    public final float m5920a() {
        return this.f8436a;
    }

    /* renamed from: b */
    public final float m5922b() {
        return this.f8437b;
    }

    /* renamed from: a */
    public final void m5921a(float f, float f2) {
        this.f8436a = f;
        this.f8437b = f2;
    }

    /* renamed from: c */
    public final boolean m5923c() {
        return this.f8436a == 1.0f && this.f8437b == 1.0f;
    }

    public final String toString() {
        return this.f8436a + "x" + this.f8437b;
    }
}
