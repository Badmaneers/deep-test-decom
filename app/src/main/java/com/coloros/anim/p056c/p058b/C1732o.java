package com.coloros.anim.p056c.p058b;

import android.graphics.PointF;
import com.coloros.anim.C1692an;
import com.coloros.anim.p056c.C1702a;
import com.coloros.anim.p062f.C1810f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* renamed from: com.coloros.anim.c.b.o */
/* loaded from: classes.dex */
public final class C1732o {

    /* renamed from: a */
    private final List<C1702a> f8197a;

    /* renamed from: b */
    private PointF f8198b;

    /* renamed from: c */
    private boolean f8199c;

    public C1732o(PointF pointF, boolean z, List<C1702a> list) {
        this.f8198b = pointF;
        this.f8199c = z;
        this.f8197a = new ArrayList(list);
    }

    public C1732o() {
        this.f8197a = new ArrayList();
    }

    /* renamed from: a */
    public final PointF m5703a() {
        return this.f8198b;
    }

    /* renamed from: b */
    public final boolean m5705b() {
        return this.f8199c;
    }

    /* renamed from: c */
    public final List<C1702a> m5706c() {
        return this.f8197a;
    }

    /* renamed from: a */
    public final void m5704a(C1732o c1732o, C1732o c1732o2, float f) {
        if (this.f8198b == null) {
            this.f8198b = new PointF();
        }
        this.f8199c = c1732o.f8199c || c1732o2.f8199c;
        if (c1732o.f8197a.size() != c1732o2.f8197a.size()) {
            C1692an.m5563b("Curves must have the same number of control points. Shape 1: " + c1732o.f8197a.size() + "\tShape 2: " + c1732o2.f8197a.size());
        }
        int min = Math.min(c1732o.f8197a.size(), c1732o2.f8197a.size());
        if (this.f8197a.size() < min) {
            for (int size = this.f8197a.size(); size < min; size++) {
                this.f8197a.add(new C1702a());
            }
        } else if (this.f8197a.size() > min) {
            for (int size2 = this.f8197a.size() - 1; size2 >= min; size2--) {
                this.f8197a.remove(this.f8197a.size() - 1);
            }
        }
        PointF pointF = c1732o.f8198b;
        PointF pointF2 = c1732o2.f8198b;
        float m5892a = C1810f.m5892a(pointF.x, pointF2.x, f);
        float m5892a2 = C1810f.m5892a(pointF.y, pointF2.y, f);
        if (this.f8198b == null) {
            this.f8198b = new PointF();
        }
        this.f8198b.set(m5892a, m5892a2);
        for (int size3 = this.f8197a.size() - 1; size3 >= 0; size3--) {
            C1702a c1702a = c1732o.f8197a.get(size3);
            C1702a c1702a2 = c1732o2.f8197a.get(size3);
            PointF m5622a = c1702a.m5622a();
            PointF m5624b = c1702a.m5624b();
            PointF m5626c = c1702a.m5626c();
            PointF m5622a2 = c1702a2.m5622a();
            PointF m5624b2 = c1702a2.m5624b();
            PointF m5626c2 = c1702a2.m5626c();
            this.f8197a.get(size3).m5623a(C1810f.m5892a(m5622a.x, m5622a2.x, f), C1810f.m5892a(m5622a.y, m5622a2.y, f));
            this.f8197a.get(size3).m5625b(C1810f.m5892a(m5624b.x, m5624b2.x, f), C1810f.m5892a(m5624b.y, m5624b2.y, f));
            this.f8197a.get(size3).m5627c(C1810f.m5892a(m5626c.x, m5626c2.x, f), C1810f.m5892a(m5626c.y, m5626c2.y, f));
        }
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f8197a.size() + "closed=" + this.f8199c + '}';
    }
}
