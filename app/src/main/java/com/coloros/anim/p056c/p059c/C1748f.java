package com.coloros.anim.p056c.p059c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.coloros.anim.C1692an;
import com.coloros.anim.C1698b;
import com.coloros.anim.InterfaceC1828t;
import com.coloros.anim.p052a.C1639a;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1678q;
import com.coloros.anim.p062f.C1811g;
import com.coloros.anim.p063g.C1814b;

/* compiled from: ImageLayer.java */
/* renamed from: com.coloros.anim.c.c.f */
/* loaded from: classes.dex */
public final class C1748f extends AbstractC1743a {

    /* renamed from: e */
    private final Paint f8277e;

    /* renamed from: f */
    private final Rect f8278f;

    /* renamed from: g */
    private final Rect f8279g;

    /* renamed from: h */
    private AbstractC1662a<ColorFilter, ColorFilter> f8280h;

    public C1748f(C1698b c1698b, C1749g c1749g) {
        super(c1698b, c1749g);
        this.f8277e = new C1639a(3);
        this.f8278f = new Rect();
        this.f8279g = new Rect();
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a
    /* renamed from: b */
    public final void mo5751b(Canvas canvas, Matrix matrix, int i) {
        Bitmap m5754c = m5754c();
        if (m5754c == null || m5754c.isRecycled()) {
            return;
        }
        float m5901a = C1811g.m5901a();
        C1692an.m5564c("ImageLayer#draw");
        this.f8277e.setAlpha(i);
        if (this.f8280h != null) {
            this.f8277e.setColorFilter(this.f8280h.mo5517g());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f8278f.set(0, 0, m5754c.getWidth(), m5754c.getHeight());
        this.f8279g.set(0, 0, (int) (m5754c.getWidth() * m5901a), (int) (m5754c.getHeight() * m5901a));
        canvas.drawBitmap(m5754c, this.f8278f, this.f8279g, this.f8277e);
        canvas.restore();
        C1692an.m5565d("ImageLayer#draw");
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a, com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5482a(RectF rectF, Matrix matrix, boolean z) {
        super.mo5482a(rectF, matrix, z);
        if (m5754c() != null) {
            rectF.set(0.0f, 0.0f, r3.getWidth() * C1811g.m5901a(), r3.getHeight() * C1811g.m5901a());
            this.f8246a.mapRect(rectF);
        }
    }

    /* renamed from: c */
    private Bitmap m5754c() {
        return this.f8247b.m5597e(this.f8248c.m5762g());
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a, com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
        super.mo5484a((C1748f) t, (C1814b<C1748f>) c1814b);
        if (t == InterfaceC1828t.f8481z) {
            if (c1814b == null) {
                this.f8280h = null;
            } else {
                this.f8280h = new C1678q(c1814b);
            }
        }
    }
}
