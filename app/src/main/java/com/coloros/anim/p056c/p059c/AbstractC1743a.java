package com.coloros.anim.p056c.p059c;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.coloros.anim.C1692an;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.C1639a;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p052a.p053a.InterfaceC1645f;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1665d;
import com.coloros.anim.p052a.p054b.C1669h;
import com.coloros.anim.p052a.p054b.C1677p;
import com.coloros.anim.p052a.p054b.InterfaceC1663b;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.InterfaceC1763h;
import com.coloros.anim.p056c.p058b.C1724g;
import com.coloros.anim.p056c.p058b.C1732o;
import com.coloros.anim.p062f.C1806b;
import com.coloros.anim.p063g.C1814b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseLayer.java */
/* renamed from: com.coloros.anim.c.c.a */
/* loaded from: classes.dex */
public abstract class AbstractC1743a implements InterfaceC1645f, InterfaceC1663b, InterfaceC1763h {

    /* renamed from: b */
    final C1698b f8247b;

    /* renamed from: c */
    final C1749g f8248c;

    /* renamed from: d */
    final C1677p f8249d;

    /* renamed from: p */
    private final String f8261p;

    /* renamed from: r */
    private C1669h f8263r;

    /* renamed from: s */
    private AbstractC1743a f8264s;

    /* renamed from: t */
    private AbstractC1743a f8265t;

    /* renamed from: u */
    private List<AbstractC1743a> f8266u;

    /* renamed from: a */
    final Matrix f8246a = new Matrix();

    /* renamed from: e */
    private final Path f8250e = new Path();

    /* renamed from: f */
    private final Matrix f8251f = new Matrix();

    /* renamed from: g */
    private final Paint f8252g = new C1639a(1);

    /* renamed from: h */
    private final Paint f8253h = new C1639a(PorterDuff.Mode.DST_IN, (byte) 0);

    /* renamed from: i */
    private final Paint f8254i = new C1639a(PorterDuff.Mode.DST_OUT, (byte) 0);

    /* renamed from: j */
    private final Paint f8255j = new C1639a(1);

    /* renamed from: k */
    private final Paint f8256k = new C1639a(PorterDuff.Mode.CLEAR);

    /* renamed from: l */
    private final RectF f8257l = new RectF();

    /* renamed from: m */
    private final RectF f8258m = new RectF();

    /* renamed from: n */
    private final RectF f8259n = new RectF();

    /* renamed from: o */
    private final RectF f8260o = new RectF();

    /* renamed from: q */
    private final List<AbstractC1662a<?, ?>> f8262q = new ArrayList();

    /* renamed from: v */
    private boolean f8267v = true;

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
    }

    /* renamed from: b */
    abstract void mo5751b(Canvas canvas, Matrix matrix, int i);

    /* renamed from: b */
    void mo5753b(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
    }

    public AbstractC1743a(C1698b c1698b, C1749g c1749g) {
        this.f8247b = c1698b;
        this.f8248c = c1749g;
        this.f8261p = c1749g.m5761f() + "#draw";
        if (C1806b.f8391d) {
            C1806b.m5866b("BaseLayer::name = " + c1749g.m5761f() + ";layerModel.getMatteType() = " + c1749g.m5767l() + "; this = " + this);
        }
        if (c1749g.m5767l() == EnumC1751i.INVERT) {
            this.f8255j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.f8255j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        this.f8249d = c1749g.m5770o().m5642j();
        this.f8249d.m5533a((InterfaceC1663b) this);
        if (C1806b.f8391d) {
            StringBuilder sb = new StringBuilder("BaseLayer::layerModel.getMasks() ? ");
            sb.append(c1749g.m5765j() == null);
            C1806b.m5866b(sb.toString());
        }
        if (c1749g.m5765j() != null && !c1749g.m5765j().isEmpty()) {
            this.f8263r = new C1669h(c1749g.m5765j());
            Iterator<AbstractC1662a<C1732o, Path>> it = this.f8263r.m5526b().iterator();
            while (it.hasNext()) {
                it.next().m5510a(this);
            }
            for (AbstractC1662a<Integer, Integer> abstractC1662a : this.f8263r.m5527c()) {
                m5748a(abstractC1662a);
                abstractC1662a.m5510a(this);
            }
        }
        m5744d();
    }

    /* renamed from: a */
    public final void m5749a(AbstractC1743a abstractC1743a) {
        this.f8264s = abstractC1743a;
    }

    /* renamed from: c */
    private boolean m5743c() {
        return this.f8264s != null;
    }

    /* renamed from: b */
    public final void m5752b(AbstractC1743a abstractC1743a) {
        this.f8265t = abstractC1743a;
    }

    /* renamed from: d */
    private void m5744d() {
        if (!this.f8248c.m5759d().isEmpty()) {
            C1665d c1665d = new C1665d(this.f8248c.m5759d());
            if (C1806b.f8391d) {
                for (int i = 0; i < this.f8248c.m5759d().size(); i++) {
                    C1806b.m5866b("BaseLayer::create InOutAnimations, " + this.f8248c.m5759d().get(i).toString());
                }
            }
            c1665d.m5508a();
            c1665d.m5510a(new C1744b(this, c1665d));
            m5750a(c1665d.mo5517g().floatValue() == 1.0f);
            m5748a(c1665d);
            return;
        }
        m5750a(true);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    private static void m5740a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, z ? 31 : 19);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    /* renamed from: a */
    public final void m5748a(AbstractC1662a<?, ?> abstractC1662a) {
        if (abstractC1662a == null) {
            return;
        }
        this.f8262q.add(abstractC1662a);
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public void mo5482a(RectF rectF, Matrix matrix, boolean z) {
        this.f8257l.set(0.0f, 0.0f, 0.0f, 0.0f);
        m5746f();
        this.f8246a.set(matrix);
        if (z) {
            if (this.f8266u != null) {
                for (int size = this.f8266u.size() - 1; size >= 0; size--) {
                    this.f8246a.preConcat(this.f8266u.get(size).f8249d.m5539d());
                }
            } else if (this.f8265t != null) {
                this.f8246a.preConcat(this.f8265t.f8249d.m5539d());
            }
        }
        this.f8246a.preConcat(this.f8249d.m5539d());
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5481a(Canvas canvas, Matrix matrix, int i) {
        C1692an.m5564c(this.f8261p);
        if (!this.f8267v || this.f8248c.m5777v()) {
            C1692an.m5565d(this.f8261p);
            return;
        }
        m5746f();
        C1692an.m5564c("Layer#parentMatrix");
        this.f8251f.reset();
        this.f8251f.set(matrix);
        for (int size = this.f8266u.size() - 1; size >= 0; size--) {
            this.f8251f.preConcat(this.f8266u.get(size).f8249d.m5539d());
        }
        C1692an.m5565d("Layer#parentMatrix");
        int intValue = (int) ((((i / 255.0f) * (this.f8249d.m5531a() == null ? 100 : this.f8249d.m5531a().mo5517g().intValue())) / 100.0f) * 255.0f);
        if (!m5743c() && !m5745e()) {
            this.f8251f.preConcat(this.f8249d.m5539d());
            C1692an.m5564c("Layer#drawLayer");
            mo5751b(canvas, this.f8251f, intValue);
            C1692an.m5565d("Layer#drawLayer");
            float m5565d = C1692an.m5565d(this.f8261p);
            C1692an.m5562a(this.f8261p + " draw end time = " + m5565d);
            m5742b(m5565d);
            return;
        }
        C1692an.m5564c("Layer#computeBounds");
        mo5482a(this.f8257l, this.f8251f, false);
        RectF rectF = this.f8257l;
        if (m5743c() && this.f8248c.m5767l() != EnumC1751i.INVERT) {
            this.f8259n.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f8264s.mo5482a(this.f8259n, matrix, true);
            if (!rectF.intersect(this.f8259n)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        this.f8251f.preConcat(this.f8249d.m5539d());
        m5741a(this.f8257l, this.f8251f);
        C1692an.m5565d("Layer#computeBounds");
        if (!this.f8257l.isEmpty()) {
            C1692an.m5564c("Layer#saveLayer");
            m5740a(canvas, this.f8257l, this.f8252g, true);
            C1692an.m5565d("Layer#saveLayer");
            m5738a(canvas);
            C1692an.m5564c("Layer#drawLayer");
            mo5751b(canvas, this.f8251f, intValue);
            C1692an.m5565d("Layer#drawLayer");
            if (m5745e()) {
                m5739a(canvas, this.f8251f);
            }
            if (m5743c()) {
                C1692an.m5564c("Layer#drawMatte");
                C1692an.m5564c("Layer#saveLayer");
                m5740a(canvas, this.f8257l, this.f8255j, false);
                C1692an.m5565d("Layer#saveLayer");
                m5738a(canvas);
                this.f8264s.mo5481a(canvas, matrix, intValue);
                C1692an.m5564c("Layer#restoreLayer");
                canvas.restore();
                C1692an.m5565d("Layer#restoreLayer");
                C1692an.m5565d("Layer#drawMatte");
            }
            C1692an.m5564c("Layer#restoreLayer");
            canvas.restore();
            C1692an.m5565d("Layer#restoreLayer");
        }
        float m5565d2 = C1692an.m5565d(this.f8261p);
        C1692an.m5562a(this.f8261p + " draw end,time = " + m5565d2);
        m5742b(m5565d2);
    }

    /* renamed from: b */
    private void m5742b(float f) {
        this.f8247b.m5612q().m5468d().m5566a(this.f8248c.m5761f(), f);
    }

    /* renamed from: a */
    private void m5738a(Canvas canvas) {
        C1692an.m5564c("Layer#clearLayer");
        canvas.drawRect(this.f8257l.left - 1.0f, this.f8257l.top - 1.0f, this.f8257l.right + 1.0f, this.f8257l.bottom + 1.0f, this.f8256k);
        C1692an.m5565d("Layer#clearLayer");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x004d. Please report as an issue. */
    /* renamed from: a */
    private void m5741a(RectF rectF, Matrix matrix) {
        this.f8258m.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m5745e()) {
            int size = this.f8263r.m5525a().size();
            for (int i = 0; i < size; i++) {
                C1724g c1724g = this.f8263r.m5525a().get(i);
                this.f8250e.set(this.f8263r.m5526b().get(i).mo5517g());
                this.f8250e.transform(matrix);
                switch (C1745c.f8271b[c1724g.m5673a() - 1]) {
                    case 1:
                        return;
                    case 2:
                    case 3:
                        if (c1724g.m5676d()) {
                            return;
                        }
                    default:
                        this.f8250e.computeBounds(this.f8260o, false);
                        if (i == 0) {
                            this.f8258m.set(this.f8260o);
                        } else {
                            this.f8258m.set(Math.min(this.f8258m.left, this.f8260o.left), Math.min(this.f8258m.top, this.f8260o.top), Math.max(this.f8258m.right, this.f8260o.right), Math.max(this.f8258m.bottom, this.f8260o.bottom));
                        }
                }
            }
            if (rectF.intersect(this.f8258m)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: a */
    private void m5739a(Canvas canvas, Matrix matrix) {
        C1692an.m5564c("Layer#saveLayer");
        m5740a(canvas, this.f8257l, this.f8253h, false);
        C1692an.m5565d("Layer#saveLayer");
        for (int i = 0; i < this.f8263r.m5525a().size(); i++) {
            C1724g c1724g = this.f8263r.m5525a().get(i);
            AbstractC1662a<C1732o, Path> abstractC1662a = this.f8263r.m5526b().get(i);
            AbstractC1662a<Integer, Integer> abstractC1662a2 = this.f8263r.m5527c().get(i);
            switch (C1745c.f8271b[c1724g.m5673a() - 1]) {
                case 1:
                    if (i == 0) {
                        Paint paint = new Paint();
                        paint.setColor(-16777216);
                        canvas.drawRect(this.f8257l, paint);
                    }
                    if (c1724g.m5676d()) {
                        m5740a(canvas, this.f8257l, this.f8254i, true);
                        canvas.drawRect(this.f8257l, this.f8252g);
                        this.f8254i.setAlpha((int) (abstractC1662a2.mo5517g().intValue() * 2.55f));
                        this.f8250e.set(abstractC1662a.mo5517g());
                        this.f8250e.transform(matrix);
                        canvas.drawPath(this.f8250e, this.f8254i);
                        canvas.restore();
                        break;
                    } else {
                        this.f8250e.set(abstractC1662a.mo5517g());
                        this.f8250e.transform(matrix);
                        canvas.drawPath(this.f8250e, this.f8254i);
                        break;
                    }
                case 2:
                    if (c1724g.m5676d()) {
                        m5740a(canvas, this.f8257l, this.f8253h, true);
                        canvas.drawRect(this.f8257l, this.f8252g);
                        this.f8254i.setAlpha((int) (abstractC1662a2.mo5517g().intValue() * 2.55f));
                        this.f8250e.set(abstractC1662a.mo5517g());
                        this.f8250e.transform(matrix);
                        canvas.drawPath(this.f8250e, this.f8254i);
                        canvas.restore();
                        break;
                    } else {
                        m5740a(canvas, this.f8257l, this.f8253h, true);
                        this.f8250e.set(abstractC1662a.mo5517g());
                        this.f8250e.transform(matrix);
                        this.f8252g.setAlpha((int) (abstractC1662a2.mo5517g().intValue() * 2.55f));
                        canvas.drawPath(this.f8250e, this.f8252g);
                        canvas.restore();
                        break;
                    }
                case 3:
                    if (c1724g.m5676d()) {
                        m5740a(canvas, this.f8257l, this.f8252g, true);
                        canvas.drawRect(this.f8257l, this.f8252g);
                        this.f8250e.set(abstractC1662a.mo5517g());
                        this.f8250e.transform(matrix);
                        this.f8252g.setAlpha((int) (abstractC1662a2.mo5517g().intValue() * 2.55f));
                        canvas.drawPath(this.f8250e, this.f8254i);
                        canvas.restore();
                        break;
                    } else {
                        this.f8250e.set(abstractC1662a.mo5517g());
                        this.f8250e.transform(matrix);
                        this.f8252g.setAlpha((int) (abstractC1662a2.mo5517g().intValue() * 2.55f));
                        canvas.drawPath(this.f8250e, this.f8252g);
                        break;
                    }
            }
        }
        C1692an.m5564c("Layer#restoreLayer");
        canvas.restore();
        C1692an.m5565d("Layer#restoreLayer");
    }

    /* renamed from: e */
    private boolean m5745e() {
        return (this.f8263r == null || this.f8263r.m5526b().isEmpty()) ? false : true;
    }

    /* renamed from: a */
    public final void m5750a(boolean z) {
        if (z != this.f8267v) {
            this.f8267v = z;
            this.f8247b.invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo5747a(float f) {
        this.f8249d.m5532a(f);
        if (this.f8263r != null) {
            for (int i = 0; i < this.f8263r.m5526b().size(); i++) {
                this.f8263r.m5526b().get(i).mo5509a(f);
            }
        }
        if (this.f8248c.m5757b() != 0.0f) {
            f /= this.f8248c.m5757b();
        }
        if (this.f8264s != null) {
            this.f8264s.mo5747a(this.f8264s.f8248c.m5757b() * f);
        }
        for (int i2 = 0; i2 < this.f8262q.size(); i2++) {
            this.f8262q.get(i2).mo5509a(f);
        }
    }

    /* renamed from: f */
    private void m5746f() {
        if (this.f8266u != null) {
            return;
        }
        if (this.f8265t == null) {
            this.f8266u = Collections.emptyList();
            return;
        }
        this.f8266u = new ArrayList();
        for (AbstractC1743a abstractC1743a = this.f8265t; abstractC1743a != null; abstractC1743a = abstractC1743a.f8265t) {
            this.f8266u.add(abstractC1743a);
        }
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f8248c.m5761f();
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final void mo5483a(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
        if (C1806b.f8390c) {
            C1806b.m5866b("BaseLayer::resolveKeyPath()::this = " + this.f8248c.m5761f() + "; keyPath = " + c1762g.toString());
        }
        if (c1762g.m5796a(this.f8248c.m5761f(), i)) {
            if (!"__container".equals(this.f8248c.m5761f())) {
                c1762g2 = c1762g2.m5794a(this.f8248c.m5761f());
                if (c1762g.m5798c(this.f8248c.m5761f(), i)) {
                    if (C1806b.f8390c) {
                        C1806b.m5866b("BaseLayer::resolveKeyPath()::name = " + this.f8248c.m5761f());
                    }
                    list.add(c1762g2.m5793a(this));
                }
            }
            if (c1762g.m5799d(this.f8248c.m5761f(), i)) {
                int m5797b = i + c1762g.m5797b(this.f8248c.m5761f(), i);
                if (C1806b.f8390c) {
                    C1806b.m5866b("BaseLayer::resolveKeyPath()::newDepth = ".concat(String.valueOf(m5797b)));
                }
                mo5753b(c1762g, m5797b, list, c1762g2);
            }
        }
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public <T> void mo5484a(T t, C1814b<T> c1814b) {
        this.f8249d.m5535a(t, c1814b);
    }

    @Override // com.coloros.anim.p052a.p054b.InterfaceC1663b
    /* renamed from: a */
    public final void mo5480a() {
        this.f8247b.invalidateSelf();
    }
}
