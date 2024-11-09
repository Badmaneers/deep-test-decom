package com.coloros.anim.p052a.p053a;

import android.graphics.Path;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.InterfaceC1663b;
import com.coloros.anim.p056c.p058b.C1735r;
import com.coloros.anim.p056c.p058b.C1741x;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import java.util.List;

/* compiled from: ShapeContent.java */
/* renamed from: com.coloros.anim.a.a.t */
/* loaded from: classes.dex */
public final class C1659t implements InterfaceC1654o, InterfaceC1663b {

    /* renamed from: b */
    private final String f7964b;

    /* renamed from: c */
    private final boolean f7965c;

    /* renamed from: d */
    private final C1698b f7966d;

    /* renamed from: e */
    private final AbstractC1662a<?, Path> f7967e;

    /* renamed from: f */
    private boolean f7968f;

    /* renamed from: a */
    private final Path f7963a = new Path();

    /* renamed from: g */
    private C1642c f7969g = new C1642c();

    public C1659t(C1698b c1698b, AbstractC1743a abstractC1743a, C1735r c1735r) {
        this.f7964b = c1735r.m5715a();
        this.f7965c = c1735r.m5717c();
        this.f7966d = c1698b;
        this.f7967e = c1735r.m5716b().mo5628a();
        abstractC1743a.m5748a(this.f7967e);
        this.f7967e.m5510a(this);
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC1643d interfaceC1643d = list.get(i);
            if (interfaceC1643d instanceof C1661v) {
                C1661v c1661v = (C1661v) interfaceC1643d;
                if (c1661v.m5501c() == C1741x.f8239a) {
                    this.f7969g.m5489a(c1661v);
                    c1661v.m5500a(this);
                }
            }
        }
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1654o
    /* renamed from: e */
    public final Path mo5495e() {
        if (this.f7968f) {
            return this.f7963a;
        }
        this.f7963a.reset();
        if (this.f7965c) {
            this.f7968f = true;
            return this.f7963a;
        }
        this.f7963a.set(this.f7967e.mo5517g());
        this.f7963a.setFillType(Path.FillType.EVEN_ODD);
        this.f7969g.m5488a(this.f7963a);
        this.f7968f = true;
        return this.f7963a;
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7964b;
    }

    @Override // com.coloros.anim.p052a.p054b.InterfaceC1663b
    /* renamed from: a */
    public final void mo5480a() {
        this.f7968f = false;
        this.f7966d.invalidateSelf();
    }
}
