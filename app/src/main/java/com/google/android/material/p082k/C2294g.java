package com.google.android.material.p082k;

/* compiled from: MarkerEdgeTreatment.java */
/* renamed from: com.google.android.material.k.g */
/* loaded from: classes.dex */
public final class C2294g extends C2293f {

    /* renamed from: a */
    private final float f10063a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.p082k.C2293f
    /* renamed from: f */
    public final boolean mo7235f() {
        return true;
    }

    public C2294g(float f) {
        this.f10063a = f - 0.001f;
    }

    @Override // com.google.android.material.p082k.C2293f
    /* renamed from: a */
    public final void mo6448a(float f, float f2, float f3, C2309v c2309v) {
        float sqrt = (float) ((this.f10063a * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.f10063a, 2.0d) - Math.pow(sqrt, 2.0d));
        c2309v.m7360a(f2 - sqrt, ((float) (-((this.f10063a * Math.sqrt(2.0d)) - this.f10063a))) + sqrt2);
        c2309v.m7365b(f2, (float) (-((this.f10063a * Math.sqrt(2.0d)) - this.f10063a)));
        c2309v.m7365b(f2 + sqrt, ((float) (-((this.f10063a * Math.sqrt(2.0d)) - this.f10063a))) + sqrt2);
    }
}
