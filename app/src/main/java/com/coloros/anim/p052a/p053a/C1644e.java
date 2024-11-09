package com.coloros.anim.p052a.p053a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.coloros.anim.C1692an;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p054b.C1677p;
import com.coloros.anim.p052a.p054b.InterfaceC1663b;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.InterfaceC1763h;
import com.coloros.anim.p056c.p057a.C1714l;
import com.coloros.anim.p056c.p058b.C1734q;
import com.coloros.anim.p056c.p058b.InterfaceC1719b;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;
import com.coloros.anim.p063g.C1814b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup.java */
/* renamed from: com.coloros.anim.a.a.e */
/* loaded from: classes.dex */
public final class C1644e implements InterfaceC1645f, InterfaceC1654o, InterfaceC1663b, InterfaceC1763h {

    /* renamed from: a */
    private final Matrix f7866a;

    /* renamed from: b */
    private final Path f7867b;

    /* renamed from: c */
    private final RectF f7868c;

    /* renamed from: d */
    private final String f7869d;

    /* renamed from: e */
    private final boolean f7870e;

    /* renamed from: f */
    private final List<InterfaceC1643d> f7871f;

    /* renamed from: g */
    private final C1698b f7872g;

    /* renamed from: h */
    private List<InterfaceC1654o> f7873h;

    /* renamed from: i */
    private C1677p f7874i;

    public C1644e(C1698b c1698b, AbstractC1743a abstractC1743a, C1734q c1734q) {
        this(c1698b, abstractC1743a, c1734q.m5712a(), c1734q.m5714c(), m5492a(c1698b, abstractC1743a, c1734q.m5713b()), m5491a(c1734q.m5713b()));
    }

    public C1644e(C1698b c1698b, AbstractC1743a abstractC1743a, String str, boolean z, List<InterfaceC1643d> list, C1714l c1714l) {
        this.f7866a = new Matrix();
        this.f7867b = new Path();
        this.f7868c = new RectF();
        this.f7869d = str;
        this.f7872g = c1698b;
        this.f7870e = z;
        this.f7871f = list;
        if (C1806b.f8391d) {
            C1806b.m5866b("ContentGroup::name = " + str + this);
        }
        if (c1714l != null) {
            this.f7874i = c1714l.m5642j();
            this.f7874i.m5534a(abstractC1743a);
            this.f7874i.m5533a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC1643d interfaceC1643d = list.get(size);
            if (interfaceC1643d instanceof InterfaceC1650k) {
                arrayList.add((InterfaceC1650k) interfaceC1643d);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC1650k) arrayList.get(size2)).mo5498a(list.listIterator(list.size()));
        }
    }

    /* renamed from: a */
    private static List<InterfaceC1643d> m5492a(C1698b c1698b, AbstractC1743a abstractC1743a, List<InterfaceC1719b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (C1806b.f8391d) {
            C1806b.m5866b("ContentGroup::contentsFromModels()::contentModels.size() = " + list.size());
        }
        for (int i = 0; i < list.size(); i++) {
            InterfaceC1643d mo5632a = list.get(i).mo5632a(c1698b, abstractC1743a);
            if (C1806b.f8391d) {
                C1806b.m5866b("ContentGroup::contentsFromModels()::content + ".concat(String.valueOf(i)));
            }
            if (mo5632a != null) {
                if (C1806b.f8391d) {
                    C1806b.m5866b("ContentGroup::contentsFromModels()::content = " + mo5632a.toString());
                }
                arrayList.add(mo5632a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static C1714l m5491a(List<InterfaceC1719b> list) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC1719b interfaceC1719b = list.get(i);
            if (interfaceC1719b instanceof C1714l) {
                if (C1806b.f8391d) {
                    C1806b.m5866b("ContentGroup::findTransform()::contentModel = ".concat(String.valueOf(interfaceC1719b)));
                }
                return (C1714l) interfaceC1719b;
            }
        }
        return null;
    }

    @Override // com.coloros.anim.p052a.p054b.InterfaceC1663b
    /* renamed from: a */
    public final void mo5480a() {
        this.f7872g.invalidateSelf();
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7869d;
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f7871f.size());
        arrayList.addAll(list);
        for (int size = this.f7871f.size() - 1; size >= 0; size--) {
            InterfaceC1643d interfaceC1643d = this.f7871f.get(size);
            interfaceC1643d.mo5485a(arrayList, this.f7871f.subList(0, size));
            arrayList.add(interfaceC1643d);
        }
    }

    /* renamed from: c */
    public final List<InterfaceC1654o> m5493c() {
        if (this.f7873h == null) {
            this.f7873h = new ArrayList();
            for (int i = 0; i < this.f7871f.size(); i++) {
                InterfaceC1643d interfaceC1643d = this.f7871f.get(i);
                if (interfaceC1643d instanceof InterfaceC1654o) {
                    this.f7873h.add((InterfaceC1654o) interfaceC1643d);
                }
            }
        }
        return this.f7873h;
    }

    /* renamed from: d */
    public final Matrix m5494d() {
        if (this.f7874i != null) {
            return this.f7874i.m5539d();
        }
        this.f7866a.reset();
        return this.f7866a;
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1654o
    /* renamed from: e */
    public final Path mo5495e() {
        this.f7866a.reset();
        if (this.f7874i != null) {
            this.f7866a.set(this.f7874i.m5539d());
        }
        this.f7867b.reset();
        if (this.f7870e) {
            return this.f7867b;
        }
        for (int size = this.f7871f.size() - 1; size >= 0; size--) {
            InterfaceC1643d interfaceC1643d = this.f7871f.get(size);
            if (interfaceC1643d instanceof InterfaceC1654o) {
                this.f7867b.addPath(((InterfaceC1654o) interfaceC1643d).mo5495e(), this.f7866a);
            }
        }
        return this.f7867b;
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5481a(Canvas canvas, Matrix matrix, int i) {
        if (this.f7870e) {
            return;
        }
        C1692an.m5564c("ContentGroup#draw");
        this.f7866a.set(matrix);
        if (this.f7874i != null) {
            this.f7866a.preConcat(this.f7874i.m5539d());
            i = (int) (((((this.f7874i.m5531a() == null ? 100 : this.f7874i.m5531a().mo5517g().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        for (int size = this.f7871f.size() - 1; size >= 0; size--) {
            InterfaceC1643d interfaceC1643d = this.f7871f.get(size);
            if (interfaceC1643d instanceof InterfaceC1645f) {
                if (C1806b.f8388a) {
                    C1806b.m5866b("ContentGroup::draw() content = " + ((InterfaceC1645f) interfaceC1643d).mo5490b());
                }
                ((InterfaceC1645f) interfaceC1643d).mo5481a(canvas, this.f7866a, i);
            }
        }
        C1692an.m5565d("ContentGroup#draw");
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5482a(RectF rectF, Matrix matrix, boolean z) {
        this.f7866a.set(matrix);
        if (this.f7874i != null) {
            this.f7866a.preConcat(this.f7874i.m5539d());
        }
        this.f7868c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f7871f.size() - 1; size >= 0; size--) {
            InterfaceC1643d interfaceC1643d = this.f7871f.get(size);
            if (interfaceC1643d instanceof InterfaceC1645f) {
                ((InterfaceC1645f) interfaceC1643d).mo5482a(this.f7868c, this.f7866a, z);
                rectF.union(this.f7868c);
            }
        }
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final void mo5483a(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
        if (C1806b.f8390c) {
            C1806b.m5866b("ContentGroup::resolveChildKeyPath()");
        }
        if (c1762g.m5796a(this.f7869d, i)) {
            if (!"__container".equals(this.f7869d)) {
                c1762g2 = c1762g2.m5794a(this.f7869d);
                if (c1762g.m5798c(this.f7869d, i)) {
                    if (C1806b.f8390c) {
                        C1806b.m5866b("ContentGroup::resolveChildKeyPath():name = " + this.f7869d);
                    }
                    list.add(c1762g2.m5793a(this));
                }
            }
            if (c1762g.m5799d(this.f7869d, i)) {
                int m5797b = i + c1762g.m5797b(this.f7869d, i);
                for (int i2 = 0; i2 < this.f7871f.size(); i2++) {
                    InterfaceC1643d interfaceC1643d = this.f7871f.get(i2);
                    if (C1806b.f8390c) {
                        C1806b.m5866b("ContentGroup::resolveChildKeyPath()");
                    }
                    if (interfaceC1643d instanceof InterfaceC1763h) {
                        InterfaceC1763h interfaceC1763h = (InterfaceC1763h) interfaceC1643d;
                        if (C1806b.f8390c) {
                            C1806b.m5866b("ContentGroup::resolveChildKeyPath()");
                        }
                        interfaceC1763h.mo5483a(c1762g, m5797b, list, c1762g2);
                    }
                }
            }
        }
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
        if (this.f7874i != null) {
            this.f7874i.m5535a(t, c1814b);
        }
    }
}
