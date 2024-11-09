package com.google.android.material.p082k;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: ShapeAppearancePathProvider.java */
/* renamed from: com.google.android.material.k.s */
/* loaded from: classes.dex */
public final class C2306s {

    /* renamed from: a */
    private final C2309v[] f10142a = new C2309v[4];

    /* renamed from: b */
    private final Matrix[] f10143b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f10144c = new Matrix[4];

    /* renamed from: d */
    private final PointF f10145d = new PointF();

    /* renamed from: e */
    private final Path f10146e = new Path();

    /* renamed from: f */
    private final Path f10147f = new Path();

    /* renamed from: g */
    private final C2309v f10148g = new C2309v();

    /* renamed from: h */
    private final float[] f10149h = new float[2];

    /* renamed from: i */
    private final float[] f10150i = new float[2];

    /* renamed from: j */
    private boolean f10151j = true;

    public C2306s() {
        for (int i = 0; i < 4; i++) {
            this.f10142a[i] = new C2309v();
            this.f10143b[i] = new Matrix();
            this.f10144c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    public final void m7355a(C2303p c2303p, float f, RectF rectF, Path path) {
        m7356a(c2303p, f, rectF, null, path);
    }

    /* renamed from: a */
    public final void m7356a(C2303p c2303p, float f, RectF rectF, InterfaceC2307t interfaceC2307t, Path path) {
        path.rewind();
        this.f10146e.rewind();
        this.f10147f.rewind();
        this.f10147f.addRect(rectF, Path.Direction.CW);
        C2308u c2308u = new C2308u(c2303p, f, rectF, interfaceC2307t, path);
        for (int i = 0; i < 4; i++) {
            m7349a(c2308u, i);
            m7347a(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m7352b(c2308u, i2);
            m7354c(c2308u, i2);
        }
        path.close();
        this.f10146e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f10146e.isEmpty()) {
            return;
        }
        path.op(this.f10146e, Path.Op.UNION);
    }

    /* renamed from: a */
    private void m7349a(C2308u c2308u, int i) {
        m7346a(i, c2308u.f10152a).m7234a(this.f10142a[i], c2308u.f10156e, c2308u.f10154c, m7351b(i, c2308u.f10152a));
        this.f10143b[i].reset();
        m7348a(i, c2308u.f10154c, this.f10145d);
        this.f10143b[i].setTranslate(this.f10145d.x, this.f10145d.y);
        this.f10143b[i].preRotate((i + 1) * 90);
    }

    /* renamed from: a */
    private void m7347a(int i) {
        this.f10149h[0] = this.f10142a[i].f10159c;
        this.f10149h[1] = this.f10142a[i].f10160d;
        this.f10143b[i].mapPoints(this.f10149h);
        this.f10144c[i].reset();
        this.f10144c[i].setTranslate(this.f10149h[0], this.f10149h[1]);
        this.f10144c[i].preRotate((i + 1) * 90);
    }

    /* renamed from: b */
    private void m7352b(C2308u c2308u, int i) {
        this.f10149h[0] = this.f10142a[i].f10157a;
        this.f10149h[1] = this.f10142a[i].f10158b;
        this.f10143b[i].mapPoints(this.f10149h);
        if (i == 0) {
            c2308u.f10153b.moveTo(this.f10149h[0], this.f10149h[1]);
        } else {
            c2308u.f10153b.lineTo(this.f10149h[0], this.f10149h[1]);
        }
        this.f10142a[i].m7363a(this.f10143b[i], c2308u.f10153b);
        if (c2308u.f10155d != null) {
            c2308u.f10155d.mo7289a(this.f10142a[i], this.f10143b[i], i);
        }
    }

    /* renamed from: c */
    private void m7354c(C2308u c2308u, int i) {
        int i2 = (i + 1) % 4;
        this.f10149h[0] = this.f10142a[i].f10159c;
        this.f10149h[1] = this.f10142a[i].f10160d;
        this.f10143b[i].mapPoints(this.f10149h);
        this.f10150i[0] = this.f10142a[i2].f10157a;
        this.f10150i[1] = this.f10142a[i2].f10158b;
        this.f10143b[i2].mapPoints(this.f10150i);
        float max = Math.max(((float) Math.hypot(this.f10149h[0] - this.f10150i[0], this.f10149h[1] - this.f10150i[1])) - 0.001f, 0.0f);
        float m7345a = m7345a(c2308u.f10154c, i);
        this.f10148g.m7360a(0.0f, 0.0f);
        C2293f m7353c = m7353c(i, c2308u.f10152a);
        m7353c.mo6448a(max, m7345a, c2308u.f10156e, this.f10148g);
        Path path = new Path();
        this.f10148g.m7363a(this.f10144c[i], path);
        if (this.f10151j && Build.VERSION.SDK_INT >= 19 && (m7353c.mo7235f() || m7350a(path, i) || m7350a(path, i2))) {
            path.op(path, this.f10147f, Path.Op.DIFFERENCE);
            this.f10149h[0] = this.f10148g.f10157a;
            this.f10149h[1] = this.f10148g.f10158b;
            this.f10144c[i].mapPoints(this.f10149h);
            this.f10146e.moveTo(this.f10149h[0], this.f10149h[1]);
            this.f10148g.m7363a(this.f10144c[i], this.f10146e);
        } else {
            this.f10148g.m7363a(this.f10144c[i], c2308u.f10153b);
        }
        if (c2308u.f10155d != null) {
            c2308u.f10155d.mo7290b(this.f10148g, this.f10144c[i], i);
        }
    }

    /* renamed from: a */
    private boolean m7350a(Path path, int i) {
        Path path2 = new Path();
        this.f10142a[i].m7363a(this.f10143b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* renamed from: a */
    private float m7345a(RectF rectF, int i) {
        this.f10149h[0] = this.f10142a[i].f10159c;
        this.f10149h[1] = this.f10142a[i].f10160d;
        this.f10143b[i].mapPoints(this.f10149h);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f10149h[0]);
        }
        return Math.abs(rectF.centerY() - this.f10149h[1]);
    }

    /* renamed from: a */
    private static void m7348a(int i, RectF rectF, PointF pointF) {
        switch (i) {
            case 1:
                pointF.set(rectF.right, rectF.bottom);
                return;
            case 2:
                pointF.set(rectF.left, rectF.bottom);
                return;
            case 3:
                pointF.set(rectF.left, rectF.top);
                return;
            default:
                pointF.set(rectF.right, rectF.top);
                return;
        }
    }

    /* renamed from: a */
    private static C2291d m7346a(int i, C2303p c2303p) {
        switch (i) {
            case 1:
                return c2303p.f10120d;
            case 2:
                return c2303p.f10121e;
            case 3:
                return c2303p.f10118b;
            default:
                return c2303p.f10119c;
        }
    }

    /* renamed from: b */
    private static InterfaceC2290c m7351b(int i, C2303p c2303p) {
        switch (i) {
            case 1:
                return c2303p.f10124h;
            case 2:
                return c2303p.f10125i;
            case 3:
                return c2303p.f10122f;
            default:
                return c2303p.f10123g;
        }
    }

    /* renamed from: c */
    private static C2293f m7353c(int i, C2303p c2303p) {
        switch (i) {
            case 1:
                return c2303p.f10128l;
            case 2:
                return c2303p.f10129m;
            case 3:
                return c2303p.f10126j;
            default:
                return c2303p.f10127k;
        }
    }
}
