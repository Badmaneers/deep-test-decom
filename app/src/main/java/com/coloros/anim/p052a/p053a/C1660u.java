package com.coloros.anim.p052a.p053a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.coloros.anim.C1698b;
import com.coloros.anim.InterfaceC1828t;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1664c;
import com.coloros.anim.p052a.p054b.C1678q;
import com.coloros.anim.p056c.p058b.C1736s;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p063g.C1814b;

/* compiled from: StrokeContent.java */
/* renamed from: com.coloros.anim.a.a.u */
/* loaded from: classes.dex */
public final class C1660u extends AbstractC1640a {

    /* renamed from: b */
    private final AbstractC1743a f7970b;

    /* renamed from: c */
    private final String f7971c;

    /* renamed from: d */
    private final boolean f7972d;

    /* renamed from: e */
    private final AbstractC1662a<Integer, Integer> f7973e;

    /* renamed from: f */
    private AbstractC1662a<ColorFilter, ColorFilter> f7974f;

    public C1660u(C1698b c1698b, AbstractC1743a abstractC1743a, C1736s c1736s) {
        super(c1698b, abstractC1743a, c1736s.m5724g().m5728a(), c1736s.m5725h().m5729a(), c1736s.m5726i(), c1736s.m5720c(), c1736s.m5721d(), c1736s.m5722e(), c1736s.m5723f());
        this.f7970b = abstractC1743a;
        this.f7971c = c1736s.m5718a();
        this.f7972d = c1736s.m5727j();
        this.f7973e = c1736s.m5719b().mo5628a();
        this.f7973e.m5510a(this);
        abstractC1743a.m5748a(this.f7973e);
    }

    @Override // com.coloros.anim.p052a.p053a.AbstractC1640a, com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5481a(Canvas canvas, Matrix matrix, int i) {
        if (this.f7972d) {
            return;
        }
        this.f7849a.setColor(((C1664c) this.f7973e).m5520i());
        if (this.f7974f != null) {
            this.f7849a.setColorFilter(this.f7974f.mo5517g());
        }
        super.mo5481a(canvas, matrix, i);
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7971c;
    }

    @Override // com.coloros.anim.p052a.p053a.AbstractC1640a, com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
        super.mo5484a((C1660u) t, (C1814b<C1660u>) c1814b);
        if (t == InterfaceC1828t.f8457b) {
            this.f7973e.m5511a((C1814b<Integer>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8481z) {
            if (c1814b == null) {
                this.f7974f = null;
                return;
            }
            this.f7974f = new C1678q(c1814b);
            this.f7974f.m5510a(this);
            this.f7970b.m5748a(this.f7973e);
        }
    }
}
