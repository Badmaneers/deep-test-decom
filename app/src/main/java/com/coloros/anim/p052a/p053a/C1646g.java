package com.coloros.anim.p052a.p053a;

import android.graphics.Path;
import android.graphics.PointF;
import com.coloros.anim.C1698b;
import com.coloros.anim.InterfaceC1828t;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.InterfaceC1663b;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.p058b.C1718a;
import com.coloros.anim.p056c.p058b.C1741x;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p063g.C1814b;
import java.util.List;

/* compiled from: EllipseContent.java */
/* renamed from: com.coloros.anim.a.a.g */
/* loaded from: classes.dex */
public final class C1646g implements InterfaceC1651l, InterfaceC1654o, InterfaceC1663b {

    /* renamed from: b */
    private final String f7876b;

    /* renamed from: c */
    private final C1698b f7877c;

    /* renamed from: d */
    private final AbstractC1662a<?, PointF> f7878d;

    /* renamed from: e */
    private final AbstractC1662a<?, PointF> f7879e;

    /* renamed from: f */
    private final C1718a f7880f;

    /* renamed from: h */
    private boolean f7882h;

    /* renamed from: a */
    private final Path f7875a = new Path();

    /* renamed from: g */
    private C1642c f7881g = new C1642c();

    public C1646g(C1698b c1698b, AbstractC1743a abstractC1743a, C1718a c1718a) {
        this.f7876b = c1718a.m5643a();
        this.f7877c = c1698b;
        this.f7878d = c1718a.m5645c().mo5628a();
        this.f7879e = c1718a.m5644b().mo5628a();
        this.f7880f = c1718a;
        abstractC1743a.m5748a(this.f7878d);
        abstractC1743a.m5748a(this.f7879e);
        this.f7878d.m5510a(this);
        this.f7879e.m5510a(this);
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC1643d interfaceC1643d = list.get(i);
            if (interfaceC1643d instanceof C1661v) {
                C1661v c1661v = (C1661v) interfaceC1643d;
                if (c1661v.m5501c() == C1741x.f8239a) {
                    this.f7881g.m5489a(c1661v);
                    c1661v.m5500a(this);
                }
            }
        }
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7876b;
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1654o
    /* renamed from: e */
    public final Path mo5495e() {
        if (this.f7882h) {
            return this.f7875a;
        }
        this.f7875a.reset();
        if (this.f7880f.m5647e()) {
            this.f7882h = true;
            return this.f7875a;
        }
        PointF mo5517g = this.f7878d.mo5517g();
        float f = mo5517g.x / 2.0f;
        float f2 = mo5517g.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f7875a.reset();
        if (this.f7880f.m5646d()) {
            float f5 = -f2;
            this.f7875a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f7875a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f7875a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f7875a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f7875a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f7875a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f7875a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f7875a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f7875a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f7875a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF mo5517g2 = this.f7879e.mo5517g();
        this.f7875a.offset(mo5517g2.x, mo5517g2.y);
        this.f7875a.close();
        this.f7881g.m5488a(this.f7875a);
        this.f7882h = true;
        return this.f7875a;
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final void mo5483a(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
        C1810f.m5898a(c1762g, i, list, c1762g2, this);
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
        if (t == InterfaceC1828t.f8462g) {
            this.f7878d.m5511a((C1814b<PointF>) c1814b);
        } else if (t == InterfaceC1828t.f8463h) {
            this.f7879e.m5511a((C1814b<PointF>) c1814b);
        }
    }

    @Override // com.coloros.anim.p052a.p054b.InterfaceC1663b
    /* renamed from: a */
    public final void mo5480a() {
        this.f7882h = false;
        this.f7877c.invalidateSelf();
    }
}
