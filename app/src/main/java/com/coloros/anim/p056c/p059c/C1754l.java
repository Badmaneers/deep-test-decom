package com.coloros.anim.p056c.p059c;

import android.graphics.Canvas;
import android.graphics.Color;
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
import com.coloros.anim.p052a.p054b.C1678q;
import com.coloros.anim.p063g.C1814b;

/* compiled from: SolidLayer.java */
/* renamed from: com.coloros.anim.c.c.l */
/* loaded from: classes.dex */
public final class C1754l extends AbstractC1743a {

    /* renamed from: e */
    private final RectF f8317e;

    /* renamed from: f */
    private final Paint f8318f;

    /* renamed from: g */
    private final float[] f8319g;

    /* renamed from: h */
    private final Path f8320h;

    /* renamed from: i */
    private final C1749g f8321i;

    /* renamed from: j */
    private AbstractC1662a<ColorFilter, ColorFilter> f8322j;

    public C1754l(C1698b c1698b, C1749g c1749g) {
        super(c1698b, c1749g);
        this.f8317e = new RectF();
        this.f8318f = new C1639a();
        this.f8319g = new float[8];
        this.f8320h = new Path();
        this.f8321i = c1749g;
        this.f8318f.setAlpha(0);
        this.f8318f.setStyle(Paint.Style.FILL);
        this.f8318f.setColor(c1749g.m5771p());
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a
    /* renamed from: b */
    public final void mo5751b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f8321i.m5771p());
        if (alpha == 0) {
            return;
        }
        C1692an.m5564c("SolidLayer#draw");
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.f8249d.m5531a() == null ? 100 : this.f8249d.m5531a().mo5517g().intValue())) / 100.0f) * 255.0f);
        this.f8318f.setAlpha(intValue);
        if (this.f8322j != null) {
            this.f8318f.setColorFilter(this.f8322j.mo5517g());
        }
        if (intValue > 0) {
            this.f8319g[0] = 0.0f;
            this.f8319g[1] = 0.0f;
            this.f8319g[2] = this.f8321i.m5773r();
            this.f8319g[3] = 0.0f;
            this.f8319g[4] = this.f8321i.m5773r();
            this.f8319g[5] = this.f8321i.m5772q();
            this.f8319g[6] = 0.0f;
            this.f8319g[7] = this.f8321i.m5772q();
            matrix.mapPoints(this.f8319g);
            this.f8320h.reset();
            this.f8320h.moveTo(this.f8319g[0], this.f8319g[1]);
            this.f8320h.lineTo(this.f8319g[2], this.f8319g[3]);
            this.f8320h.lineTo(this.f8319g[4], this.f8319g[5]);
            this.f8320h.lineTo(this.f8319g[6], this.f8319g[7]);
            this.f8320h.lineTo(this.f8319g[0], this.f8319g[1]);
            this.f8320h.close();
            canvas.drawPath(this.f8320h, this.f8318f);
        }
        C1692an.m5565d("SolidLayer#draw");
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a, com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5482a(RectF rectF, Matrix matrix, boolean z) {
        super.mo5482a(rectF, matrix, z);
        this.f8317e.set(0.0f, 0.0f, this.f8321i.m5773r(), this.f8321i.m5772q());
        this.f8246a.mapRect(this.f8317e);
        rectF.set(this.f8317e);
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a, com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
        super.mo5484a((C1754l) t, (C1814b<C1754l>) c1814b);
        if (t == InterfaceC1828t.f8481z) {
            if (c1814b == null) {
                this.f8322j = null;
            } else {
                this.f8322j = new C1678q(c1814b);
            }
        }
    }
}
