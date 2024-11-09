package com.coloros.anim.p062f;

import android.graphics.Path;
import android.graphics.PointF;
import com.coloros.anim.p052a.p053a.InterfaceC1651l;
import com.coloros.anim.p056c.C1702a;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.p058b.C1732o;
import java.util.List;

/* compiled from: MiscUtils.java */
/* renamed from: com.coloros.anim.f.f */
/* loaded from: classes.dex */
public final class C1810f {

    /* renamed from: a */
    private static PointF f8403a = new PointF();

    /* renamed from: a */
    public static double m5891a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: a */
    public static float m5892a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m5895a(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    /* renamed from: c */
    public static boolean m5900c(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: a */
    public static PointF m5896a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: a */
    public static void m5897a(C1732o c1732o, Path path) {
        path.reset();
        PointF m5703a = c1732o.m5703a();
        path.moveTo(m5703a.x, m5703a.y);
        f8403a.set(m5703a.x, m5703a.y);
        for (int i = 0; i < c1732o.m5706c().size(); i++) {
            C1702a c1702a = c1732o.m5706c().get(i);
            PointF m5622a = c1702a.m5622a();
            PointF m5624b = c1702a.m5624b();
            PointF m5626c = c1702a.m5626c();
            if (m5622a.equals(f8403a) && m5624b.equals(m5626c)) {
                path.lineTo(m5626c.x, m5626c.y);
            } else {
                path.cubicTo(m5622a.x, m5622a.y, m5624b.x, m5624b.y, m5626c.x, m5626c.y);
            }
            f8403a.set(m5626c.x, m5626c.y);
        }
        if (c1732o.m5705b()) {
            path.close();
        }
    }

    /* renamed from: a */
    public static int m5894a(int i) {
        return Math.max(0, Math.min(255, i));
    }

    /* renamed from: b */
    public static float m5899b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: a */
    public static void m5898a(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2, InterfaceC1651l interfaceC1651l) {
        if (c1762g.m5798c(interfaceC1651l.mo5490b(), i)) {
            C1762g m5794a = c1762g2.m5794a(interfaceC1651l.mo5490b());
            if (C1806b.f8390c) {
                C1806b.m5866b("MiscUtils::resolveKeyPath():currentPartialKeyPath = " + m5794a.toString() + "; content:" + interfaceC1651l.mo5490b());
            }
            list.add(m5794a.m5793a(interfaceC1651l));
        }
    }

    /* renamed from: a */
    public static int m5893a(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }
}
