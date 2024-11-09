package com.coloros.anim.p056c.p057a;

import android.graphics.PointF;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p052a.p054b.C1677p;
import com.coloros.anim.p056c.p058b.InterfaceC1719b;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;

/* compiled from: AnimatableTransform.java */
/* renamed from: com.coloros.anim.c.a.l */
/* loaded from: classes.dex */
public final class C1714l implements InterfaceC1719b {

    /* renamed from: a */
    private final C1707e f8102a;

    /* renamed from: b */
    private final InterfaceC1715m<PointF, PointF> f8103b;

    /* renamed from: c */
    private final C1709g f8104c;

    /* renamed from: d */
    private final C1704b f8105d;

    /* renamed from: e */
    private final C1706d f8106e;

    /* renamed from: f */
    private final C1704b f8107f;

    /* renamed from: g */
    private final C1704b f8108g;

    /* renamed from: h */
    private final C1704b f8109h;

    /* renamed from: i */
    private final C1704b f8110i;

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        return null;
    }

    public C1714l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public C1714l(C1707e c1707e, InterfaceC1715m<PointF, PointF> interfaceC1715m, C1709g c1709g, C1704b c1704b, C1706d c1706d, C1704b c1704b2, C1704b c1704b3, C1704b c1704b4, C1704b c1704b5) {
        this.f8102a = c1707e;
        this.f8103b = interfaceC1715m;
        this.f8104c = c1709g;
        this.f8105d = c1704b;
        this.f8106e = c1706d;
        this.f8109h = c1704b2;
        this.f8110i = c1704b3;
        this.f8107f = c1704b4;
        this.f8108g = c1704b5;
    }

    /* renamed from: a */
    public final C1707e m5633a() {
        return this.f8102a;
    }

    /* renamed from: b */
    public final InterfaceC1715m<PointF, PointF> m5634b() {
        return this.f8103b;
    }

    /* renamed from: c */
    public final C1709g m5635c() {
        return this.f8104c;
    }

    /* renamed from: d */
    public final C1704b m5636d() {
        return this.f8105d;
    }

    /* renamed from: e */
    public final C1706d m5637e() {
        return this.f8106e;
    }

    /* renamed from: f */
    public final C1704b m5638f() {
        return this.f8109h;
    }

    /* renamed from: g */
    public final C1704b m5639g() {
        return this.f8110i;
    }

    /* renamed from: h */
    public final C1704b m5640h() {
        return this.f8107f;
    }

    /* renamed from: i */
    public final C1704b m5641i() {
        return this.f8108g;
    }

    /* renamed from: j */
    public final C1677p m5642j() {
        if (C1806b.f8391d) {
            StringBuilder sb = new StringBuilder("AnimatableTransform create TransformKeyframeAnimation, ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AnimatableTransform:{");
            if (this.f8102a != null) {
                sb2.append("anchorPoint = ");
                sb2.append(this.f8102a.toString());
            }
            if (this.f8104c != null) {
                sb2.append("scale = ");
                sb2.append(this.f8104c.toString());
            }
            if (this.f8105d != null) {
                sb2.append("rotation = ");
                sb2.append(this.f8105d.toString());
            }
            if (this.f8106e != null) {
                sb2.append("opacity = ");
                sb2.append(this.f8106e.toString());
            }
            if (this.f8107f != null) {
                sb2.append("skew = ");
                sb2.append(this.f8107f.toString());
            }
            if (this.f8108g != null) {
                sb2.append("skewAngle = ");
                sb2.append(this.f8108g.toString());
            }
            if (this.f8109h != null) {
                sb2.append("startOpacity = ");
                sb2.append(this.f8109h.toString());
            }
            if (this.f8110i != null) {
                sb2.append("endOpacity = ");
                sb2.append(this.f8110i.toString());
            }
            sb2.append("}");
            sb.append(sb2.toString());
            C1806b.m5866b(sb.toString());
        }
        return new C1677p(this);
    }
}
