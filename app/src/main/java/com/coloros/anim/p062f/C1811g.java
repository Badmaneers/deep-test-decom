package com.coloros.anim.p062f;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.coloros.anim.C1692an;
import com.coloros.anim.p052a.p053a.C1661v;
import com.coloros.anim.p052a.p054b.C1665d;
import java.io.Closeable;

/* compiled from: Utils.java */
/* renamed from: com.coloros.anim.f.g */
/* loaded from: classes.dex */
public final class C1811g {

    /* renamed from: a */
    private static final PathMeasure f8404a = new PathMeasure();

    /* renamed from: b */
    private static final Path f8405b = new Path();

    /* renamed from: c */
    private static final Path f8406c = new Path();

    /* renamed from: d */
    private static final float[] f8407d = new float[4];

    /* renamed from: e */
    private static final float f8408e = (float) Math.sqrt(2.0d);

    /* renamed from: f */
    private static float f8409f = -1.0f;

    /* renamed from: a */
    public static int m5903a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    /* renamed from: a */
    public static boolean m5908a(int i, int i2, int i3) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        return i2 > 4 || i3 >= 0;
    }

    /* renamed from: a */
    public static Path m5904a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: a */
    public static void m5907a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m5902a(Matrix matrix) {
        f8407d[0] = 0.0f;
        f8407d[1] = 0.0f;
        f8407d[2] = f8408e;
        f8407d[3] = f8408e;
        matrix.mapPoints(f8407d);
        return ((float) Math.hypot(f8407d[2] - f8407d[0], f8407d[3] - f8407d[1])) / 2.0f;
    }

    /* renamed from: a */
    public static void m5906a(Path path, C1661v c1661v) {
        if (c1661v == null || c1661v.m5505g()) {
            return;
        }
        m5905a(path, ((C1665d) c1661v.m5502d()).m5522i() / 100.0f, ((C1665d) c1661v.m5503e()).m5522i() / 100.0f, ((C1665d) c1661v.m5504f()).m5522i() / 360.0f);
    }

    /* renamed from: a */
    public static void m5905a(Path path, float f, float f2, float f3) {
        C1692an.m5564c("applyTrimPathIfNeeded");
        f8404a.setPath(path, false);
        float length = f8404a.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C1692an.m5565d("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            C1692an.m5565d("applyTrimPathIfNeeded");
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float min = Math.min(f4, f5) + f6;
        float max = Math.max(f4, f5) + f6;
        if (min >= length && max >= length) {
            min = C1810f.m5893a(min, length);
            max = C1810f.m5893a(max, length);
        }
        if (min < 0.0f) {
            min = C1810f.m5893a(min, length);
        }
        if (max < 0.0f) {
            max = C1810f.m5893a(max, length);
        }
        if (min == max) {
            path.reset();
            C1692an.m5565d("applyTrimPathIfNeeded");
            return;
        }
        if (min >= max) {
            min -= length;
        }
        f8405b.reset();
        f8404a.getSegment(min, max, f8405b, true);
        if (max > length) {
            f8406c.reset();
            f8404a.getSegment(0.0f, max % length, f8406c, true);
            f8405b.addPath(f8406c);
        } else if (min < 0.0f) {
            f8406c.reset();
            f8404a.getSegment(min + length, length, f8406c, true);
            f8405b.addPath(f8406c);
        }
        path.set(f8405b);
        C1692an.m5565d("applyTrimPathIfNeeded");
    }

    /* renamed from: a */
    public static float m5901a() {
        if (f8409f == -1.0f) {
            f8409f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f8409f;
    }
}
