package com.coloros.anim.p052a.p053a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1665d;
import com.coloros.anim.p052a.p054b.InterfaceC1663b;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.p058b.C1730m;
import com.coloros.anim.p056c.p058b.C1741x;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p063g.C1814b;
import java.util.List;

/* compiled from: RectangleContent.java */
/* renamed from: com.coloros.anim.a.a.r */
/* loaded from: classes.dex */
public final class C1657r implements InterfaceC1651l, InterfaceC1654o, InterfaceC1663b {

    /* renamed from: c */
    private final String f7945c;

    /* renamed from: d */
    private final boolean f7946d;

    /* renamed from: e */
    private final C1698b f7947e;

    /* renamed from: f */
    private final AbstractC1662a<?, PointF> f7948f;

    /* renamed from: g */
    private final AbstractC1662a<?, PointF> f7949g;

    /* renamed from: h */
    private final AbstractC1662a<?, Float> f7950h;

    /* renamed from: j */
    private boolean f7952j;

    /* renamed from: a */
    private final Path f7943a = new Path();

    /* renamed from: b */
    private final RectF f7944b = new RectF();

    /* renamed from: i */
    private C1642c f7951i = new C1642c();

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
    }

    public C1657r(C1698b c1698b, AbstractC1743a abstractC1743a, C1730m c1730m) {
        this.f7945c = c1730m.m5693a();
        this.f7946d = c1730m.m5697e();
        this.f7947e = c1698b;
        this.f7948f = c1730m.m5696d().mo5628a();
        this.f7949g = c1730m.m5695c().mo5628a();
        this.f7950h = c1730m.m5694b().mo5628a();
        abstractC1743a.m5748a(this.f7948f);
        abstractC1743a.m5748a(this.f7949g);
        abstractC1743a.m5748a(this.f7950h);
        this.f7948f.m5510a(this);
        this.f7949g.m5510a(this);
        this.f7950h.m5510a(this);
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7945c;
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC1643d interfaceC1643d = list.get(i);
            if (interfaceC1643d instanceof C1661v) {
                C1661v c1661v = (C1661v) interfaceC1643d;
                if (c1661v.m5501c() == C1741x.f8239a) {
                    this.f7951i.m5489a(c1661v);
                    c1661v.m5500a(this);
                }
            }
        }
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1654o
    /* renamed from: e */
    public final Path mo5495e() {
        if (this.f7952j) {
            return this.f7943a;
        }
        this.f7943a.reset();
        if (this.f7946d) {
            this.f7952j = true;
            return this.f7943a;
        }
        PointF mo5517g = this.f7949g.mo5517g();
        float f = mo5517g.x / 2.0f;
        float f2 = mo5517g.y / 2.0f;
        float m5522i = this.f7950h == null ? 0.0f : ((C1665d) this.f7950h).m5522i();
        float min = Math.min(f, f2);
        if (m5522i > min) {
            m5522i = min;
        }
        PointF mo5517g2 = this.f7948f.mo5517g();
        this.f7943a.moveTo(mo5517g2.x + f, (mo5517g2.y - f2) + m5522i);
        this.f7943a.lineTo(mo5517g2.x + f, (mo5517g2.y + f2) - m5522i);
        if (m5522i > 0.0f) {
            float f3 = m5522i * 2.0f;
            this.f7944b.set((mo5517g2.x + f) - f3, (mo5517g2.y + f2) - f3, mo5517g2.x + f, mo5517g2.y + f2);
            this.f7943a.arcTo(this.f7944b, 0.0f, 90.0f, false);
        }
        this.f7943a.lineTo((mo5517g2.x - f) + m5522i, mo5517g2.y + f2);
        if (m5522i > 0.0f) {
            float f4 = m5522i * 2.0f;
            this.f7944b.set(mo5517g2.x - f, (mo5517g2.y + f2) - f4, (mo5517g2.x - f) + f4, mo5517g2.y + f2);
            this.f7943a.arcTo(this.f7944b, 90.0f, 90.0f, false);
        }
        this.f7943a.lineTo(mo5517g2.x - f, (mo5517g2.y - f2) + m5522i);
        if (m5522i > 0.0f) {
            float f5 = m5522i * 2.0f;
            this.f7944b.set(mo5517g2.x - f, mo5517g2.y - f2, (mo5517g2.x - f) + f5, (mo5517g2.y - f2) + f5);
            this.f7943a.arcTo(this.f7944b, 180.0f, 90.0f, false);
        }
        this.f7943a.lineTo((mo5517g2.x + f) - m5522i, mo5517g2.y - f2);
        if (m5522i > 0.0f) {
            float f6 = m5522i * 2.0f;
            this.f7944b.set((mo5517g2.x + f) - f6, mo5517g2.y - f2, mo5517g2.x + f, (mo5517g2.y - f2) + f6);
            this.f7943a.arcTo(this.f7944b, 270.0f, 90.0f, false);
        }
        this.f7943a.close();
        this.f7951i.m5488a(this.f7943a);
        this.f7952j = true;
        return this.f7943a;
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final void mo5483a(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
        C1810f.m5898a(c1762g, i, list, c1762g2, this);
    }

    @Override // com.coloros.anim.p052a.p054b.InterfaceC1663b
    /* renamed from: a */
    public final void mo5480a() {
        this.f7952j = false;
        this.f7947e.invalidateSelf();
    }
}
