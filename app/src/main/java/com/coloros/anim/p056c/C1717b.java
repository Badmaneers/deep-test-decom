package com.coloros.anim.p056c;

/* compiled from: DocumentData.java */
/* renamed from: com.coloros.anim.c.b */
/* loaded from: classes.dex */
public final class C1717b {

    /* renamed from: a */
    public final String f8112a;

    /* renamed from: b */
    public final String f8113b;

    /* renamed from: c */
    public final double f8114c;

    /* renamed from: d */
    public final int f8115d;

    /* renamed from: e */
    public final int f8116e;

    /* renamed from: f */
    public final double f8117f;

    /* renamed from: g */
    public final double f8118g;

    /* renamed from: h */
    public final int f8119h;

    /* renamed from: i */
    public final int f8120i;

    /* renamed from: j */
    public final double f8121j;

    /* renamed from: k */
    public final boolean f8122k;

    public C1717b(String str, String str2, double d, int i, int i2, double d2, double d3, int i3, int i4, double d4, boolean z) {
        this.f8112a = str;
        this.f8113b = str2;
        this.f8114c = d;
        this.f8115d = i;
        this.f8116e = i2;
        this.f8117f = d2;
        this.f8118g = d3;
        this.f8119h = i3;
        this.f8120i = i4;
        this.f8121j = d4;
        this.f8122k = z;
    }

    public final int hashCode() {
        int hashCode = (((((int) ((((this.f8112a.hashCode() * 31) + this.f8113b.hashCode()) * 31) + this.f8114c)) * 31) + (this.f8115d - 1)) * 31) + this.f8116e;
        long doubleToLongBits = Double.doubleToLongBits(this.f8117f);
        return (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f8119h;
    }
}
