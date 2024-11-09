package com.coloros.anim.p052a.p053a;

import android.graphics.Path;
import android.graphics.PointF;
import com.coloros.anim.C1698b;
import com.coloros.anim.InterfaceC1828t;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.InterfaceC1663b;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.p058b.C1728k;
import com.coloros.anim.p056c.p058b.C1741x;
import com.coloros.anim.p056c.p058b.EnumC1729l;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p063g.C1814b;
import java.util.List;

/* compiled from: PolystarContent.java */
/* renamed from: com.coloros.anim.a.a.p */
/* loaded from: classes.dex */
public final class C1655p implements InterfaceC1651l, InterfaceC1654o, InterfaceC1663b {

    /* renamed from: b */
    private final String f7929b;

    /* renamed from: c */
    private final C1698b f7930c;

    /* renamed from: d */
    private final EnumC1729l f7931d;

    /* renamed from: e */
    private final boolean f7932e;

    /* renamed from: f */
    private final AbstractC1662a<?, Float> f7933f;

    /* renamed from: g */
    private final AbstractC1662a<?, PointF> f7934g;

    /* renamed from: h */
    private final AbstractC1662a<?, Float> f7935h;

    /* renamed from: i */
    private final AbstractC1662a<?, Float> f7936i;

    /* renamed from: j */
    private final AbstractC1662a<?, Float> f7937j;

    /* renamed from: k */
    private final AbstractC1662a<?, Float> f7938k;

    /* renamed from: l */
    private final AbstractC1662a<?, Float> f7939l;

    /* renamed from: n */
    private boolean f7941n;

    /* renamed from: a */
    private final Path f7928a = new Path();

    /* renamed from: m */
    private C1642c f7940m = new C1642c();

    public C1655p(C1698b c1698b, AbstractC1743a abstractC1743a, C1728k c1728k) {
        this.f7930c = c1698b;
        this.f7929b = c1728k.m5682a();
        this.f7931d = c1728k.m5683b();
        this.f7932e = c1728k.m5691j();
        this.f7933f = c1728k.m5684c().mo5628a();
        this.f7934g = c1728k.m5685d().mo5628a();
        this.f7935h = c1728k.m5686e().mo5628a();
        this.f7937j = c1728k.m5688g().mo5628a();
        this.f7939l = c1728k.m5690i().mo5628a();
        if (this.f7931d == EnumC1729l.STAR) {
            this.f7936i = c1728k.m5687f().mo5628a();
            this.f7938k = c1728k.m5689h().mo5628a();
        } else {
            this.f7936i = null;
            this.f7938k = null;
        }
        abstractC1743a.m5748a(this.f7933f);
        abstractC1743a.m5748a(this.f7934g);
        abstractC1743a.m5748a(this.f7935h);
        abstractC1743a.m5748a(this.f7937j);
        abstractC1743a.m5748a(this.f7939l);
        if (this.f7931d == EnumC1729l.STAR) {
            abstractC1743a.m5748a(this.f7936i);
            abstractC1743a.m5748a(this.f7938k);
        }
        this.f7933f.m5510a(this);
        this.f7934g.m5510a(this);
        this.f7935h.m5510a(this);
        this.f7937j.m5510a(this);
        this.f7939l.m5510a(this);
        if (this.f7931d == EnumC1729l.STAR) {
            this.f7936i.m5510a(this);
            this.f7938k.m5510a(this);
        }
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC1643d interfaceC1643d = list.get(i);
            if (interfaceC1643d instanceof C1661v) {
                C1661v c1661v = (C1661v) interfaceC1643d;
                if (c1661v.m5501c() == C1741x.f8239a) {
                    this.f7940m.m5489a(c1661v);
                    c1661v.m5500a(this);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a6  */
    @Override // com.coloros.anim.p052a.p053a.InterfaceC1654o
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Path mo5495e() {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coloros.anim.p052a.p053a.C1655p.mo5495e():android.graphics.Path");
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7929b;
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final void mo5483a(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
        C1810f.m5898a(c1762g, i, list, c1762g2, this);
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
        if (t == InterfaceC1828t.f8472q) {
            this.f7933f.m5511a((C1814b<Float>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8473r) {
            this.f7935h.m5511a((C1814b<Float>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8463h) {
            this.f7934g.m5511a((C1814b<PointF>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8474s && this.f7936i != null) {
            this.f7936i.m5511a((C1814b<Float>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8475t) {
            this.f7937j.m5511a((C1814b<Float>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8476u && this.f7938k != null) {
            this.f7938k.m5511a((C1814b<Float>) c1814b);
        } else if (t == InterfaceC1828t.f8477v) {
            this.f7939l.m5511a((C1814b<Float>) c1814b);
        }
    }

    @Override // com.coloros.anim.p052a.p054b.InterfaceC1663b
    /* renamed from: a */
    public final void mo5480a() {
        this.f7941n = false;
        this.f7930c.invalidateSelf();
    }
}
