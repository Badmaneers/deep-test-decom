package com.coloros.anim.p052a.p053a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.coloros.anim.C1692an;
import com.coloros.anim.C1698b;
import com.coloros.anim.InterfaceC1828t;
import com.coloros.anim.p052a.C1639a;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1664c;
import com.coloros.anim.p052a.p054b.C1678q;
import com.coloros.anim.p052a.p054b.InterfaceC1663b;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.p058b.C1733p;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p063g.C1814b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent.java */
/* renamed from: com.coloros.anim.a.a.h */
/* loaded from: classes.dex */
public final class C1647h implements InterfaceC1645f, InterfaceC1651l, InterfaceC1663b {

    /* renamed from: c */
    private final AbstractC1743a f7885c;

    /* renamed from: d */
    private final String f7886d;

    /* renamed from: e */
    private final boolean f7887e;

    /* renamed from: g */
    private final AbstractC1662a<Integer, Integer> f7889g;

    /* renamed from: h */
    private final AbstractC1662a<Integer, Integer> f7890h;

    /* renamed from: i */
    private final C1698b f7891i;

    /* renamed from: j */
    private AbstractC1662a<ColorFilter, ColorFilter> f7892j;

    /* renamed from: a */
    private final Path f7883a = new Path();

    /* renamed from: b */
    private final Paint f7884b = new C1639a(1);

    /* renamed from: f */
    private final List<InterfaceC1654o> f7888f = new ArrayList();

    public C1647h(C1698b c1698b, AbstractC1743a abstractC1743a, C1733p c1733p) {
        this.f7885c = abstractC1743a;
        this.f7886d = c1733p.m5707a();
        this.f7887e = c1733p.m5711e();
        this.f7891i = c1698b;
        if (c1733p.m5708b() == null || c1733p.m5709c() == null) {
            this.f7889g = null;
            this.f7890h = null;
            return;
        }
        this.f7883a.setFillType(c1733p.m5710d());
        this.f7889g = c1733p.m5708b().mo5628a();
        this.f7889g.m5510a(this);
        abstractC1743a.m5748a(this.f7889g);
        this.f7890h = c1733p.m5709c().mo5628a();
        this.f7890h.m5510a(this);
        abstractC1743a.m5748a(this.f7890h);
    }

    @Override // com.coloros.anim.p052a.p054b.InterfaceC1663b
    /* renamed from: a */
    public final void mo5480a() {
        this.f7891i.invalidateSelf();
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC1643d interfaceC1643d = list2.get(i);
            if (interfaceC1643d instanceof InterfaceC1654o) {
                this.f7888f.add((InterfaceC1654o) interfaceC1643d);
            }
        }
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7886d;
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5481a(Canvas canvas, Matrix matrix, int i) {
        if (this.f7887e) {
            return;
        }
        C1692an.m5564c("FillContent#draw");
        this.f7884b.setColor(((C1664c) this.f7889g).m5520i());
        this.f7884b.setAlpha(C1810f.m5894a((int) ((((i / 255.0f) * this.f7890h.mo5517g().intValue()) / 100.0f) * 255.0f)));
        if (this.f7892j != null) {
            this.f7884b.setColorFilter(this.f7892j.mo5517g());
        }
        this.f7883a.reset();
        for (int i2 = 0; i2 < this.f7888f.size(); i2++) {
            this.f7883a.addPath(this.f7888f.get(i2).mo5495e(), matrix);
        }
        canvas.drawPath(this.f7883a, this.f7884b);
        C1692an.m5565d("FillContent#draw");
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5482a(RectF rectF, Matrix matrix, boolean z) {
        this.f7883a.reset();
        for (int i = 0; i < this.f7888f.size(); i++) {
            this.f7883a.addPath(this.f7888f.get(i).mo5495e(), matrix);
        }
        this.f7883a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final void mo5483a(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
        C1810f.m5898a(c1762g, i, list, c1762g2, this);
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
        if (t == InterfaceC1828t.f8456a) {
            this.f7889g.m5511a((C1814b<Integer>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8459d) {
            this.f7890h.m5511a((C1814b<Integer>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8481z) {
            if (c1814b == null) {
                this.f7892j = null;
                return;
            }
            this.f7892j = new C1678q(c1814b);
            this.f7892j.m5510a(this);
            this.f7885c.m5748a(this.f7892j);
        }
    }
}
