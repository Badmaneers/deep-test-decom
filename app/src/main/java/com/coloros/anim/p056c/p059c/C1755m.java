package com.coloros.anim.p056c.p059c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.coloros.anim.C1638a;
import com.coloros.anim.C1692an;
import com.coloros.anim.C1697as;
import com.coloros.anim.C1698b;
import com.coloros.anim.InterfaceC1828t;
import com.coloros.anim.p052a.p053a.C1644e;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1676o;
import com.coloros.anim.p056c.C1717b;
import com.coloros.anim.p056c.C1760e;
import com.coloros.anim.p056c.C1761f;
import com.coloros.anim.p056c.p057a.C1713k;
import com.coloros.anim.p056c.p058b.C1734q;
import com.coloros.anim.p062f.C1811g;
import com.coloros.anim.p063g.C1814b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TextLayer.java */
/* renamed from: com.coloros.anim.c.c.m */
/* loaded from: classes.dex */
public final class C1755m extends AbstractC1743a {

    /* renamed from: e */
    private final char[] f8323e;

    /* renamed from: f */
    private final RectF f8324f;

    /* renamed from: g */
    private final Matrix f8325g;

    /* renamed from: h */
    private final Paint f8326h;

    /* renamed from: i */
    private final Paint f8327i;

    /* renamed from: j */
    private final Map<C1761f, List<C1644e>> f8328j;

    /* renamed from: k */
    private final C1676o f8329k;

    /* renamed from: l */
    private final C1698b f8330l;

    /* renamed from: m */
    private final C1638a f8331m;

    /* renamed from: n */
    private AbstractC1662a<Integer, Integer> f8332n;

    /* renamed from: o */
    private AbstractC1662a<Integer, Integer> f8333o;

    /* renamed from: p */
    private AbstractC1662a<Float, Float> f8334p;

    /* renamed from: q */
    private AbstractC1662a<Float, Float> f8335q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1755m(C1698b c1698b, C1749g c1749g) {
        super(c1698b, c1749g);
        this.f8323e = new char[1];
        this.f8324f = new RectF();
        this.f8325g = new Matrix();
        this.f8326h = new C1756n(this);
        this.f8327i = new C1757o(this);
        this.f8328j = new HashMap();
        this.f8330l = c1698b;
        this.f8331m = c1749g.m5755a();
        this.f8329k = c1749g.m5774s().mo5628a();
        this.f8329k.m5510a(this);
        m5748a(this.f8329k);
        C1713k m5775t = c1749g.m5775t();
        if (m5775t != null && m5775t.f8098a != null) {
            this.f8332n = m5775t.f8098a.mo5628a();
            this.f8332n.m5510a(this);
            m5748a(this.f8332n);
        }
        if (m5775t != null && m5775t.f8099b != null) {
            this.f8333o = m5775t.f8099b.mo5628a();
            this.f8333o.m5510a(this);
            m5748a(this.f8333o);
        }
        if (m5775t != null && m5775t.f8100c != null) {
            this.f8334p = m5775t.f8100c.mo5628a();
            this.f8334p.m5510a(this);
            m5748a(this.f8334p);
        }
        if (m5775t == null || m5775t.f8101d == null) {
            return;
        }
        this.f8335q = m5775t.f8101d.mo5628a();
        this.f8335q.m5510a(this);
        m5748a(this.f8335q);
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a, com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5482a(RectF rectF, Matrix matrix, boolean z) {
        super.mo5482a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f8331m.m5469e().width(), this.f8331m.m5469e().height());
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a
    /* renamed from: b */
    final void mo5751b(Canvas canvas, Matrix matrix, int i) {
        float f;
        int i2;
        String str;
        List<C1644e> list;
        int i3;
        String str2;
        C1692an.m5564c("TextLayer#draw");
        canvas.save();
        if (!this.f8330l.m5610o()) {
            canvas.setMatrix(matrix);
        }
        C1717b g = this.f8329k.mo5517g();
        C1760e c1760e = this.f8331m.m5476l().get(g.f8113b);
        if (c1760e == null) {
            canvas.restore();
            return;
        }
        if (this.f8332n != null) {
            this.f8326h.setColor(this.f8332n.mo5517g().intValue());
        } else {
            this.f8326h.setColor(g.f8119h);
        }
        if (this.f8333o != null) {
            this.f8327i.setColor(this.f8333o.mo5517g().intValue());
        } else {
            this.f8327i.setColor(g.f8120i);
        }
        int intValue = ((this.f8249d.m5531a() == null ? 100 : this.f8249d.m5531a().mo5517g().intValue()) * 255) / 100;
        this.f8326h.setAlpha(intValue);
        this.f8327i.setAlpha(intValue);
        if (this.f8334p != null) {
            this.f8327i.setStrokeWidth(this.f8334p.mo5517g().floatValue());
        } else {
            this.f8327i.setStrokeWidth((float) (g.f8121j * C1811g.m5901a() * C1811g.m5902a(matrix)));
        }
        if (!this.f8330l.m5610o()) {
            m5781a(g, c1760e, matrix, canvas);
        } else {
            float f2 = ((float) g.f8114c) / 100.0f;
            float m5902a = C1811g.m5902a(matrix);
            String str3 = g.f8112a;
            float m5901a = ((float) g.f8117f) * C1811g.m5901a();
            List<String> m5778a = m5778a(str3);
            int size = m5778a.size();
            int i4 = 0;
            while (i4 < size) {
                String str4 = m5778a.get(i4);
                int i5 = 0;
                float f3 = 0.0f;
                while (i5 < str4.length()) {
                    List<String> list2 = m5778a;
                    C1761f m1067a = this.f8331m.m5475k().m1067a(C1761f.m5789a(str4.charAt(i5), c1760e.m5786a(), c1760e.m5788c()));
                    if (m1067a != null) {
                        str2 = str4;
                        i3 = i4;
                        f3 = (float) (f3 + (m1067a.m5791b() * f2 * C1811g.m5901a() * m5902a));
                    } else {
                        i3 = i4;
                        str2 = str4;
                    }
                    i5++;
                    m5778a = list2;
                    str4 = str2;
                    i4 = i3;
                }
                List<String> list3 = m5778a;
                int i6 = i4;
                String str5 = str4;
                canvas.save();
                m5779a(g.f8115d, canvas, f3);
                canvas.translate(0.0f, (i6 * m5901a) - (((size - 1) * m5901a) / 2.0f));
                int i7 = 0;
                while (i7 < str5.length()) {
                    String str6 = str5;
                    C1761f m1067a2 = this.f8331m.m5475k().m1067a(C1761f.m5789a(str6.charAt(i7), c1760e.m5786a(), c1760e.m5788c()));
                    if (m1067a2 != null) {
                        if (this.f8328j.containsKey(m1067a2)) {
                            list = this.f8328j.get(m1067a2);
                            f = m5901a;
                            i2 = size;
                            str = str6;
                        } else {
                            List<C1734q> m5790a = m1067a2.m5790a();
                            int size2 = m5790a.size();
                            ArrayList arrayList = new ArrayList(size2);
                            f = m5901a;
                            int i8 = 0;
                            while (i8 < size2) {
                                arrayList.add(new C1644e(this.f8330l, this, m5790a.get(i8)));
                                i8++;
                                size = size;
                                str6 = str6;
                                m5790a = m5790a;
                            }
                            i2 = size;
                            str = str6;
                            this.f8328j.put(m1067a2, arrayList);
                            list = arrayList;
                        }
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            Path mo5495e = list.get(i9).mo5495e();
                            mo5495e.computeBounds(this.f8324f, false);
                            this.f8325g.set(matrix);
                            this.f8325g.preTranslate(0.0f, ((float) (-g.f8118g)) * C1811g.m5901a());
                            this.f8325g.preScale(f2, f2);
                            mo5495e.transform(this.f8325g);
                            if (g.f8122k) {
                                m5780a(mo5495e, this.f8326h, canvas);
                                m5780a(mo5495e, this.f8327i, canvas);
                            } else {
                                m5780a(mo5495e, this.f8327i, canvas);
                                m5780a(mo5495e, this.f8326h, canvas);
                            }
                        }
                        float m5791b = ((float) m1067a2.m5791b()) * f2 * C1811g.m5901a() * m5902a;
                        float f4 = g.f8116e / 10.0f;
                        if (this.f8335q != null) {
                            f4 += this.f8335q.mo5517g().floatValue();
                        }
                        canvas.translate(m5791b + (f4 * m5902a), 0.0f);
                    } else {
                        f = m5901a;
                        i2 = size;
                        str = str6;
                    }
                    i7++;
                    m5901a = f;
                    size = i2;
                    str5 = str;
                }
                canvas.restore();
                i4 = i6 + 1;
                m5778a = list3;
            }
        }
        canvas.restore();
        C1692an.m5565d("TextLayer#draw");
    }

    /* renamed from: a */
    private void m5781a(C1717b c1717b, C1760e c1760e, Matrix matrix, Canvas canvas) {
        float m5902a = C1811g.m5902a(matrix);
        Typeface m5573a = this.f8330l.m5573a(c1760e.m5786a(), c1760e.m5788c());
        if (m5573a == null) {
            return;
        }
        String str = c1717b.f8112a;
        C1697as m5609n = this.f8330l.m5609n();
        if (m5609n != null) {
            str = m5609n.m5568a(str);
        }
        this.f8326h.setTypeface(m5573a);
        this.f8326h.setTextSize((float) (c1717b.f8114c * C1811g.m5901a()));
        this.f8327i.setTypeface(this.f8326h.getTypeface());
        this.f8327i.setTextSize(this.f8326h.getTextSize());
        float m5901a = ((float) c1717b.f8117f) * C1811g.m5901a();
        List<String> m5778a = m5778a(str);
        int size = m5778a.size();
        for (int i = 0; i < size; i++) {
            String str2 = m5778a.get(i);
            m5779a(c1717b.f8115d, canvas, this.f8327i.measureText(str2));
            canvas.translate(0.0f, (i * m5901a) - (((size - 1) * m5901a) / 2.0f));
            for (int i2 = 0; i2 < str2.length(); i2++) {
                char charAt = str2.charAt(i2);
                this.f8323e[0] = charAt;
                if (c1717b.f8122k) {
                    m5782a(this.f8323e, this.f8326h, canvas);
                    m5782a(this.f8323e, this.f8327i, canvas);
                } else {
                    m5782a(this.f8323e, this.f8327i, canvas);
                    m5782a(this.f8323e, this.f8326h, canvas);
                }
                this.f8323e[0] = charAt;
                float measureText = this.f8326h.measureText(this.f8323e, 0, 1);
                float f = c1717b.f8116e / 10.0f;
                if (this.f8335q != null) {
                    f += this.f8335q.mo5517g().floatValue();
                }
                canvas.translate(measureText + (f * m5902a), 0.0f);
            }
            canvas.setMatrix(matrix);
        }
    }

    /* renamed from: a */
    private static List<String> m5778a(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: a */
    private static void m5779a(int i, Canvas canvas, float f) {
        switch (C1758p.f8338a[i - 1]) {
            case 1:
                return;
            case 2:
                canvas.translate(-f, 0.0f);
                return;
            case 3:
                canvas.translate((-f) / 2.0f, 0.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private static void m5780a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: a */
    private static void m5782a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a, com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
        super.mo5484a((C1755m) t, (C1814b<C1755m>) c1814b);
        if (t == InterfaceC1828t.f8456a && this.f8332n != null) {
            this.f8332n.m5511a((C1814b<Integer>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8457b && this.f8333o != null) {
            this.f8333o.m5511a((C1814b<Integer>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8468m && this.f8334p != null) {
            this.f8334p.m5511a((C1814b<Float>) c1814b);
        } else {
            if (t != InterfaceC1828t.f8469n || this.f8335q == null) {
                return;
            }
            this.f8335q.m5511a((C1814b<Float>) c1814b);
        }
    }
}
