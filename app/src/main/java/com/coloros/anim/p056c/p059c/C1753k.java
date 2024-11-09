package com.coloros.anim.p056c.p059c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.coloros.anim.C1692an;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1644e;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.p058b.C1734q;
import com.coloros.anim.p062f.C1806b;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeLayer.java */
/* renamed from: com.coloros.anim.c.c.k */
/* loaded from: classes.dex */
public final class C1753k extends AbstractC1743a {

    /* renamed from: e */
    private final C1644e f8316e;

    public C1753k(C1698b c1698b, C1749g c1749g) {
        super(c1698b, c1749g);
        C1734q c1734q = new C1734q("__container", c1749g.m5769n(), false);
        if (C1806b.f8391d) {
            C1806b.m5866b("ShapeLayer::shapeGroup = " + c1734q.toString());
        }
        this.f8316e = new C1644e(c1698b, this, c1734q);
        this.f8316e.mo5485a(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a
    /* renamed from: b */
    final void mo5751b(Canvas canvas, Matrix matrix, int i) {
        C1692an.m5564c("ShapeLayer#draw");
        this.f8316e.mo5481a(canvas, matrix, i);
        C1692an.m5565d("ShapeLayer#draw");
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a, com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5482a(RectF rectF, Matrix matrix, boolean z) {
        super.mo5482a(rectF, matrix, z);
        this.f8316e.mo5482a(rectF, this.f8246a, z);
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a
    /* renamed from: b */
    protected final void mo5753b(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
        this.f8316e.mo5483a(c1762g, i, list, c1762g2);
    }
}
