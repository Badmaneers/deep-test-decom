package androidx.vectordrawable.p039a.p040a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import androidx.core.content.p020a.C0422b;
import androidx.p011b.C0318a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.s */
/* loaded from: classes.dex */
public final class C1087s {

    /* renamed from: n */
    private static final Matrix f4328n = new Matrix();

    /* renamed from: a */
    Paint f4329a;

    /* renamed from: b */
    Paint f4330b;

    /* renamed from: c */
    final C1084p f4331c;

    /* renamed from: d */
    float f4332d;

    /* renamed from: e */
    float f4333e;

    /* renamed from: f */
    float f4334f;

    /* renamed from: g */
    float f4335g;

    /* renamed from: h */
    int f4336h;

    /* renamed from: i */
    String f4337i;

    /* renamed from: j */
    Boolean f4338j;

    /* renamed from: k */
    final C0318a<String, Object> f4339k;

    /* renamed from: l */
    private final Path f4340l;

    /* renamed from: m */
    private final Path f4341m;

    /* renamed from: o */
    private final Matrix f4342o;

    /* renamed from: p */
    private PathMeasure f4343p;

    /* renamed from: q */
    private int f4344q;

    public C1087s() {
        this.f4342o = new Matrix();
        this.f4332d = 0.0f;
        this.f4333e = 0.0f;
        this.f4334f = 0.0f;
        this.f4335g = 0.0f;
        this.f4336h = 255;
        this.f4337i = null;
        this.f4338j = null;
        this.f4339k = new C0318a<>();
        this.f4331c = new C1084p();
        this.f4340l = new Path();
        this.f4341m = new Path();
    }

    public final void setRootAlpha(int i) {
        this.f4336h = i;
    }

    public final int getRootAlpha() {
        return this.f4336h;
    }

    public final void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public final float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public C1087s(C1087s c1087s) {
        this.f4342o = new Matrix();
        this.f4332d = 0.0f;
        this.f4333e = 0.0f;
        this.f4334f = 0.0f;
        this.f4335g = 0.0f;
        this.f4336h = 255;
        this.f4337i = null;
        this.f4338j = null;
        this.f4339k = new C0318a<>();
        this.f4331c = new C1084p(c1087s.f4331c, this.f4339k);
        this.f4340l = new Path(c1087s.f4340l);
        this.f4341m = new Path(c1087s.f4341m);
        this.f4332d = c1087s.f4332d;
        this.f4333e = c1087s.f4333e;
        this.f4334f = c1087s.f4334f;
        this.f4335g = c1087s.f4335g;
        this.f4344q = c1087s.f4344q;
        this.f4336h = c1087s.f4336h;
        this.f4337i = c1087s.f4337i;
        if (c1087s.f4337i != null) {
            this.f4339k.put(c1087s.f4337i, this);
        }
        this.f4338j = c1087s.f4338j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* renamed from: a */
    private void m3616a(C1084p c1084p, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        C1087s c1087s;
        float f;
        C1087s c1087s2 = this;
        c1084p.f4311a.set(matrix);
        c1084p.f4311a.preConcat(c1084p.f4314d);
        canvas.save();
        ?? r11 = 0;
        int i3 = 0;
        while (i3 < c1084p.f4312b.size()) {
            AbstractC1085q abstractC1085q = c1084p.f4312b.get(i3);
            if (abstractC1085q instanceof C1084p) {
                m3616a((C1084p) abstractC1085q, c1084p.f4311a, canvas, i, i2, colorFilter);
            } else if (abstractC1085q instanceof AbstractC1086r) {
                AbstractC1086r abstractC1086r = (AbstractC1086r) abstractC1085q;
                float f2 = i / c1087s2.f4334f;
                float f3 = i2 / c1087s2.f4335g;
                float min = Math.min(f2, f3);
                Matrix matrix2 = c1084p.f4311a;
                c1087s2.f4342o.set(matrix2);
                c1087s2.f4342o.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[1]);
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f4 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                if (abs != 0.0f) {
                    c1087s = this;
                    abstractC1086r.m3615a(c1087s.f4340l);
                    Path path = c1087s.f4340l;
                    c1087s.f4341m.reset();
                    if (abstractC1086r.mo3609a()) {
                        c1087s.f4341m.setFillType(abstractC1086r.f4326n == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        c1087s.f4341m.addPath(path, c1087s.f4342o);
                        canvas.clipPath(c1087s.f4341m);
                    } else {
                        C1083o c1083o = (C1083o) abstractC1086r;
                        if (c1083o.f4304f != 0.0f || c1083o.f4305g != 1.0f) {
                            float f5 = (c1083o.f4304f + c1083o.f4306h) % 1.0f;
                            float f6 = (c1083o.f4305g + c1083o.f4306h) % 1.0f;
                            if (c1087s.f4343p == null) {
                                c1087s.f4343p = new PathMeasure();
                            }
                            c1087s.f4343p.setPath(c1087s.f4340l, r11);
                            float length = c1087s.f4343p.getLength();
                            float f7 = f5 * length;
                            float f8 = f6 * length;
                            path.reset();
                            if (f7 > f8) {
                                c1087s.f4343p.getSegment(f7, length, path, true);
                                f = 0.0f;
                                c1087s.f4343p.getSegment(0.0f, f8, path, true);
                            } else {
                                f = 0.0f;
                                c1087s.f4343p.getSegment(f7, f8, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        c1087s.f4341m.addPath(path, c1087s.f4342o);
                        if (c1083o.f4301c.m1502e()) {
                            C0422b c0422b = c1083o.f4301c;
                            if (c1087s.f4330b == null) {
                                c1087s.f4330b = new Paint(1);
                                c1087s.f4330b.setStyle(Paint.Style.FILL);
                            }
                            Paint paint = c1087s.f4330b;
                            if (c0422b.m1500c()) {
                                Shader m1496a = c0422b.m1496a();
                                m1496a.setLocalMatrix(c1087s.f4342o);
                                paint.setShader(m1496a);
                                paint.setAlpha(Math.round(c1083o.f4303e * 255.0f));
                            } else {
                                paint.setShader(null);
                                paint.setAlpha(255);
                                paint.setColor(C1081m.m3601a(c0422b.m1498b(), c1083o.f4303e));
                            }
                            paint.setColorFilter(colorFilter);
                            c1087s.f4341m.setFillType(c1083o.f4326n == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(c1087s.f4341m, paint);
                        }
                        if (c1083o.f4299a.m1502e()) {
                            C0422b c0422b2 = c1083o.f4299a;
                            if (c1087s.f4329a == null) {
                                c1087s.f4329a = new Paint(1);
                                c1087s.f4329a.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint2 = c1087s.f4329a;
                            if (c1083o.f4308j != null) {
                                paint2.setStrokeJoin(c1083o.f4308j);
                            }
                            if (c1083o.f4307i != null) {
                                paint2.setStrokeCap(c1083o.f4307i);
                            }
                            paint2.setStrokeMiter(c1083o.f4309k);
                            if (c0422b2.m1500c()) {
                                Shader m1496a2 = c0422b2.m1496a();
                                m1496a2.setLocalMatrix(c1087s.f4342o);
                                paint2.setShader(m1496a2);
                                paint2.setAlpha(Math.round(c1083o.f4302d * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(C1081m.m3601a(c0422b2.m1498b(), c1083o.f4302d));
                            }
                            paint2.setColorFilter(colorFilter);
                            paint2.setStrokeWidth(c1083o.f4300b * abs * min);
                            canvas.drawPath(c1087s.f4341m, paint2);
                        }
                    }
                } else {
                    c1087s = this;
                }
                i3++;
                c1087s2 = c1087s;
                r11 = 0;
            }
            c1087s = c1087s2;
            i3++;
            c1087s2 = c1087s;
            r11 = 0;
        }
        canvas.restore();
    }

    /* renamed from: a */
    public final void m3617a(Canvas canvas, int i, int i2) {
        m3616a(this.f4331c, f4328n, canvas, i, i2, null);
    }

    /* renamed from: a */
    public final boolean m3618a() {
        if (this.f4338j == null) {
            this.f4338j = Boolean.valueOf(this.f4331c.mo3612b());
        }
        return this.f4338j.booleanValue();
    }
}
