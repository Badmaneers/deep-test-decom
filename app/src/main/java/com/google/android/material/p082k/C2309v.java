package com.google.android.material.p082k;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapePath.java */
/* renamed from: com.google.android.material.k.v */
/* loaded from: classes.dex */
public final class C2309v {

    /* renamed from: a */
    @Deprecated
    public float f10157a;

    /* renamed from: b */
    @Deprecated
    public float f10158b;

    /* renamed from: c */
    @Deprecated
    public float f10159c;

    /* renamed from: d */
    @Deprecated
    public float f10160d;

    /* renamed from: e */
    @Deprecated
    public float f10161e;

    /* renamed from: f */
    @Deprecated
    public float f10162f;

    /* renamed from: g */
    private final List<AbstractC2286ab> f10163g = new ArrayList();

    /* renamed from: h */
    private final List<AbstractC2287ac> f10164h = new ArrayList();

    /* renamed from: i */
    private boolean f10165i;

    public C2309v() {
        m7360a(0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m7360a(float f, float f2) {
        m7361a(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: b */
    public final void m7365b(float f, float f2) {
        C2285aa c2285aa = new C2285aa();
        c2285aa.f10056a = f;
        c2285aa.f10057b = f2;
        this.f10163g.add(c2285aa);
        C2312y c2312y = new C2312y(c2285aa, this.f10159c, this.f10160d);
        m7358a(c2312y, c2312y.m7366a() + 270.0f, c2312y.m7366a() + 270.0f);
        this.f10159c = f;
        this.f10160d = f2;
    }

    /* renamed from: a */
    public final void m7362a(float f, float f2, float f3, float f4, float f5, float f6) {
        C2313z c2313z = new C2313z(f, f2, f3, f4);
        c2313z.f10178e = f5;
        c2313z.f10179f = f6;
        this.f10163g.add(c2313z);
        C2311x c2311x = new C2311x(c2313z);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m7358a(c2311x, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        this.f10159c = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.f10160d = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }

    /* renamed from: a */
    public final void m7363a(Matrix matrix, Path path) {
        int size = this.f10163g.size();
        for (int i = 0; i < size; i++) {
            this.f10163g.get(i).mo7230a(matrix, path);
        }
    }

    /* renamed from: a */
    private void m7358a(AbstractC2287ac abstractC2287ac, float f, float f2) {
        m7357a(f);
        this.f10164h.add(abstractC2287ac);
        this.f10161e = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m7364a() {
        return this.f10165i;
    }

    /* renamed from: a */
    public final void m7361a(float f, float f2, float f3, float f4) {
        this.f10157a = f;
        this.f10158b = f2;
        this.f10159c = f;
        this.f10160d = f2;
        this.f10161e = f3;
        this.f10162f = (f3 + f4) % 360.0f;
        this.f10163g.clear();
        this.f10164h.clear();
        this.f10165i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC2287ac m7359a(Matrix matrix) {
        m7357a(this.f10162f);
        return new C2310w(this, new ArrayList(this.f10164h), matrix);
    }

    /* renamed from: a */
    private void m7357a(float f) {
        if (this.f10161e == f) {
            return;
        }
        float f2 = ((f - this.f10161e) + 360.0f) % 360.0f;
        if (f2 > 180.0f) {
            return;
        }
        C2313z c2313z = new C2313z(this.f10159c, this.f10160d, this.f10159c, this.f10160d);
        c2313z.f10178e = this.f10161e;
        c2313z.f10179f = f2;
        this.f10164h.add(new C2311x(c2313z));
        this.f10161e = f;
    }
}
