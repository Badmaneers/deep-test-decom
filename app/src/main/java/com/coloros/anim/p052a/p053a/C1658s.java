package com.coloros.anim.p052a.p053a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.coloros.anim.C1698b;
import com.coloros.anim.InterfaceC1828t;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1677p;
import com.coloros.anim.p052a.p054b.InterfaceC1663b;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.p058b.C1731n;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p063g.C1814b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* renamed from: com.coloros.anim.a.a.s */
/* loaded from: classes.dex */
public final class C1658s implements InterfaceC1645f, InterfaceC1650k, InterfaceC1651l, InterfaceC1654o, InterfaceC1663b {

    /* renamed from: a */
    private final Matrix f7953a = new Matrix();

    /* renamed from: b */
    private final Path f7954b = new Path();

    /* renamed from: c */
    private final C1698b f7955c;

    /* renamed from: d */
    private final AbstractC1743a f7956d;

    /* renamed from: e */
    private final String f7957e;

    /* renamed from: f */
    private final boolean f7958f;

    /* renamed from: g */
    private final AbstractC1662a<Float, Float> f7959g;

    /* renamed from: h */
    private final AbstractC1662a<Float, Float> f7960h;

    /* renamed from: i */
    private final C1677p f7961i;

    /* renamed from: j */
    private C1644e f7962j;

    public C1658s(C1698b c1698b, AbstractC1743a abstractC1743a, C1731n c1731n) {
        this.f7955c = c1698b;
        this.f7956d = abstractC1743a;
        this.f7957e = c1731n.m5698a();
        this.f7958f = c1731n.m5702e();
        this.f7959g = c1731n.m5699b().mo5628a();
        abstractC1743a.m5748a(this.f7959g);
        this.f7959g.m5510a(this);
        this.f7960h = c1731n.m5700c().mo5628a();
        abstractC1743a.m5748a(this.f7960h);
        this.f7960h.m5510a(this);
        this.f7961i = c1731n.m5701d().m5642j();
        this.f7961i.m5534a(abstractC1743a);
        this.f7961i.m5533a(this);
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1650k
    /* renamed from: a */
    public final void mo5498a(ListIterator<InterfaceC1643d> listIterator) {
        if (this.f7962j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f7962j = new C1644e(this.f7955c, this.f7956d, "Repeater", this.f7958f, arrayList, null);
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7957e;
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
        this.f7962j.mo5485a(list, list2);
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1654o
    /* renamed from: e */
    public final Path mo5495e() {
        Path mo5495e = this.f7962j.mo5495e();
        this.f7954b.reset();
        float floatValue = this.f7959g.mo5517g().floatValue();
        float floatValue2 = this.f7960h.mo5517g().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f7953a.set(this.f7961i.m5536b(i + floatValue2));
            this.f7954b.addPath(mo5495e, this.f7953a);
        }
        return this.f7954b;
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5481a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f7959g.mo5517g().floatValue();
        float floatValue2 = this.f7960h.mo5517g().floatValue();
        float floatValue3 = this.f7961i.m5537b().mo5517g().floatValue() / 100.0f;
        float floatValue4 = this.f7961i.m5538c().mo5517g().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f7953a.set(matrix);
            float f = i2;
            this.f7953a.preConcat(this.f7961i.m5536b(f + floatValue2));
            this.f7962j.mo5481a(canvas, this.f7953a, (int) (i * C1810f.m5892a(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5482a(RectF rectF, Matrix matrix, boolean z) {
        this.f7962j.mo5482a(rectF, matrix, z);
    }

    @Override // com.coloros.anim.p052a.p054b.InterfaceC1663b
    /* renamed from: a */
    public final void mo5480a() {
        this.f7955c.invalidateSelf();
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final void mo5483a(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
        C1810f.m5898a(c1762g, i, list, c1762g2, this);
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
        if (this.f7961i.m5535a(t, c1814b)) {
            return;
        }
        if (t == InterfaceC1828t.f8470o) {
            this.f7959g.m5511a((C1814b<Float>) c1814b);
        } else if (t == InterfaceC1828t.f8471p) {
            this.f7960h.m5511a((C1814b<Float>) c1814b);
        }
    }
}
