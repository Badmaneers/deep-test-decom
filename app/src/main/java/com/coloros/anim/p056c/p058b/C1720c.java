package com.coloros.anim.p056c.p058b;

import com.coloros.anim.p062f.C1808d;
import com.coloros.anim.p062f.C1810f;

/* compiled from: GradientColor.java */
/* renamed from: com.coloros.anim.c.b.c */
/* loaded from: classes.dex */
public final class C1720c {

    /* renamed from: a */
    private final float[] f8128a;

    /* renamed from: b */
    private final int[] f8129b;

    public C1720c(float[] fArr, int[] iArr) {
        this.f8128a = fArr;
        this.f8129b = iArr;
    }

    /* renamed from: a */
    public final float[] m5649a() {
        return this.f8128a;
    }

    /* renamed from: b */
    public final int[] m5650b() {
        return this.f8129b;
    }

    /* renamed from: c */
    public final int m5651c() {
        return this.f8129b.length;
    }

    /* renamed from: a */
    public final void m5648a(C1720c c1720c, C1720c c1720c2, float f) {
        if (c1720c.f8129b.length != c1720c2.f8129b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c1720c.f8129b.length + " vs " + c1720c2.f8129b.length + ")");
        }
        for (int i = 0; i < c1720c.f8129b.length; i++) {
            this.f8128a[i] = C1810f.m5892a(c1720c.f8128a[i], c1720c2.f8128a[i], f);
            this.f8129b[i] = C1808d.m5888a(f, c1720c.f8129b[i], c1720c2.f8129b[i]);
        }
    }
}
