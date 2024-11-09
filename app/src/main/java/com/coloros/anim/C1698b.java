package com.coloros.anim;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.coloros.anim.p055b.C1699a;
import com.coloros.anim.p055b.C1700b;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.C1764i;
import com.coloros.anim.p056c.p059c.C1746d;
import com.coloros.anim.p061e.C1796s;
import com.coloros.anim.p062f.C1806b;
import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p062f.ChoreographerFrameCallbackC1807c;
import com.coloros.anim.p063g.C1814b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: EffectiveAnimationDrawable.java */
/* renamed from: com.coloros.anim.b */
/* loaded from: classes.dex */
public class C1698b extends Drawable implements Animatable, Drawable.Callback {

    /* renamed from: c */
    private static final String f8062c = "b";

    /* renamed from: a */
    C1690al f8063a;

    /* renamed from: b */
    C1697as f8064b;

    /* renamed from: h */
    private C1638a f8069h;

    /* renamed from: j */
    private C1700b f8071j;

    /* renamed from: k */
    private String f8072k;

    /* renamed from: l */
    private InterfaceC1691am f8073l;

    /* renamed from: m */
    private C1699a f8074m;

    /* renamed from: n */
    private boolean f8075n;

    /* renamed from: o */
    private C1746d f8076o;

    /* renamed from: q */
    private boolean f8078q;

    /* renamed from: d */
    private final Matrix f8065d = new Matrix();

    /* renamed from: e */
    private final ChoreographerFrameCallbackC1807c f8066e = new ChoreographerFrameCallbackC1807c();

    /* renamed from: f */
    private final Set<Object> f8067f = new HashSet();

    /* renamed from: g */
    private final ArrayList<InterfaceC1826q> f8068g = new ArrayList<>();

    /* renamed from: i */
    private float f8070i = 1.0f;

    /* renamed from: p */
    private int f8077p = 255;

    /* renamed from: r */
    private boolean f8079r = false;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C1698b() {
        this.f8066e.addUpdateListener(new C1701c(this));
    }

    /* renamed from: a */
    public final boolean m5582a() {
        return this.f8075n;
    }

    /* renamed from: a */
    public final void m5581a(boolean z) {
        if (this.f8075n == z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            Log.w(f8062c, "Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.f8075n = z;
        if (this.f8069h != null) {
            m5571u();
        }
    }

    /* renamed from: a */
    public final void m5580a(String str) {
        this.f8072k = str;
    }

    /* renamed from: b */
    public final String m5584b() {
        return this.f8072k;
    }

    /* renamed from: a */
    public final boolean m5583a(C1638a c1638a) {
        if (this.f8069h == c1638a) {
            return false;
        }
        if (C1806b.f8389b) {
            C1806b.m5866b("EffectiveAnimationDrawable::setComposition:composition = " + c1638a.toString());
        }
        C1806b.m5866b("EffectiveAnimationDrawable::setComposition");
        this.f8079r = false;
        m5593d();
        this.f8069h = c1638a;
        m5571u();
        this.f8066e.m5874a(c1638a);
        m5599e(this.f8066e.getAnimatedFraction());
        m5594d(this.f8070i);
        m5572v();
        Iterator it = new ArrayList(this.f8068g).iterator();
        while (it.hasNext()) {
            ((InterfaceC1826q) it.next()).mo5802a();
            it.remove();
        }
        this.f8068g.clear();
        c1638a.m5463a(this.f8078q);
        return true;
    }

    /* renamed from: b */
    public final void m5588b(boolean z) {
        this.f8078q = z;
        if (this.f8069h != null) {
            this.f8069h.m5463a(z);
        }
    }

    /* renamed from: c */
    public final C1693ao m5589c() {
        if (this.f8069h != null) {
            return this.f8069h.m5468d();
        }
        return null;
    }

    /* renamed from: u */
    private void m5571u() {
        this.f8076o = new C1746d(this, C1796s.m5854a(this.f8069h), this.f8069h.m5474j(), this.f8069h);
    }

    /* renamed from: d */
    public final void m5593d() {
        if (this.f8066e.isRunning()) {
            this.f8066e.cancel();
        }
        this.f8069h = null;
        this.f8076o = null;
        this.f8071j = null;
        this.f8066e.m5879f();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f8079r) {
            return;
        }
        this.f8079r = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8077p;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f8077p = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Log.w("EffectiveAnimation", "Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        this.f8079r = false;
        C1692an.m5562a("Drawable#draw#start");
        C1692an.m5564c("Drawable#draw");
        if (this.f8076o == null) {
            return;
        }
        float f2 = this.f8070i;
        float min = Math.min(canvas.getWidth() / this.f8069h.m5469e().width(), canvas.getHeight() / this.f8069h.m5469e().height());
        if (f2 > min) {
            f = this.f8070i / min;
        } else {
            min = f2;
            f = 1.0f;
        }
        int i = -1;
        if (f > 1.0f) {
            i = canvas.save();
            float width = this.f8069h.m5469e().width() / 2.0f;
            float height = this.f8069h.m5469e().height() / 2.0f;
            float f3 = width * min;
            float f4 = height * min;
            canvas.translate((this.f8070i * width) - f3, (this.f8070i * height) - f4);
            canvas.scale(f, f, f3, f4);
        }
        this.f8065d.reset();
        this.f8065d.preScale(min, min);
        this.f8076o.mo5481a(canvas, this.f8065d, this.f8077p);
        C1692an.m5562a("Drawable#draw#end time = ".concat(String.valueOf(C1692an.m5565d("Drawable#draw"))));
        if (i > 0) {
            canvas.restoreToCount(i);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        m5598e();
    }

    /* renamed from: e */
    public final void m5598e() {
        if (this.f8076o == null) {
            this.f8068g.add(new C1818i(this));
        } else {
            this.f8066e.m5881h();
        }
    }

    /* renamed from: f */
    public final void m5601f() {
        if (this.f8076o == null) {
            this.f8068g.add(new C1819j(this));
        } else {
            this.f8066e.m5884k();
        }
    }

    /* renamed from: a */
    public final void m5575a(int i) {
        if (this.f8069h == null) {
            this.f8068g.add(new C1820k(this, i));
        } else {
            this.f8066e.m5876b(i);
        }
    }

    /* renamed from: g */
    public final float m5602g() {
        return this.f8066e.m5885l();
    }

    /* renamed from: b */
    public final void m5587b(String str) {
        if (this.f8069h == null) {
            this.f8068g.add(new C1821l(this, str));
            return;
        }
        C1764i m5467c = this.f8069h.m5467c(str);
        if (m5467c == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        m5575a((int) m5467c.f8354b);
    }

    /* renamed from: a */
    public final void m5574a(float f) {
        if (this.f8069h == null) {
            this.f8068g.add(new C1822m(this, f));
        } else {
            m5575a((int) C1810f.m5892a(this.f8069h.m5471g(), this.f8069h.m5472h(), f));
        }
    }

    /* renamed from: b */
    public final void m5586b(int i) {
        if (this.f8069h == null) {
            this.f8068g.add(new C1823n(this, i));
        } else {
            this.f8066e.m5875b(i + 0.99f);
        }
    }

    /* renamed from: h */
    public final float m5603h() {
        return this.f8066e.m5886m();
    }

    /* renamed from: c */
    public final void m5592c(String str) {
        if (this.f8069h == null) {
            this.f8068g.add(new C1824o(this, str));
            return;
        }
        C1764i m5467c = this.f8069h.m5467c(str);
        if (m5467c == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        m5586b((int) (m5467c.f8354b + m5467c.f8355c));
    }

    /* renamed from: b */
    public final void m5585b(float f) {
        if (this.f8069h == null) {
            this.f8068g.add(new C1825p(this, f));
        } else {
            m5586b((int) C1810f.m5892a(this.f8069h.m5471g(), this.f8069h.m5472h(), f));
        }
    }

    /* renamed from: d */
    public final void m5596d(String str) {
        if (this.f8069h == null) {
            this.f8068g.add(new C1766d(this, str));
            return;
        }
        C1764i m5467c = this.f8069h.m5467c(str);
        if (m5467c == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) m5467c.f8354b;
        m5576a(i, ((int) m5467c.f8355c) + i);
    }

    /* renamed from: a */
    public final void m5576a(int i, int i2) {
        if (this.f8069h == null) {
            this.f8068g.add(new C1770e(this, i, i2));
        } else {
            this.f8066e.m5872a(i, i2 + 0.99f);
        }
    }

    /* renamed from: i */
    public final float m5604i() {
        return this.f8066e.m5880g();
    }

    /* renamed from: c */
    public final void m5590c(float f) {
        this.f8066e.m5871a(f);
    }

    /* renamed from: j */
    public final int m5605j() {
        return (int) this.f8066e.m5878e();
    }

    /* renamed from: c */
    public final void m5591c(int i) {
        if (this.f8069h == null) {
            this.f8068g.add(new C1804f(this, i));
        } else {
            this.f8066e.m5873a(i);
        }
    }

    /* renamed from: k */
    public final int m5606k() {
        return this.f8066e.getRepeatMode();
    }

    /* renamed from: d */
    public final void m5595d(int i) {
        this.f8066e.setRepeatMode(i);
    }

    /* renamed from: l */
    public final int m5607l() {
        return this.f8066e.getRepeatCount();
    }

    /* renamed from: e */
    public final void m5600e(int i) {
        this.f8066e.setRepeatCount(i);
    }

    /* renamed from: m */
    public final boolean m5608m() {
        return this.f8066e.isRunning();
    }

    /* renamed from: a */
    public final void m5578a(InterfaceC1691am interfaceC1691am) {
        this.f8073l = interfaceC1691am;
        if (this.f8071j != null) {
            this.f8071j.m5620a(interfaceC1691am);
        }
    }

    /* renamed from: a */
    public final void m5577a(C1690al c1690al) {
        this.f8063a = c1690al;
        if (this.f8074m != null) {
            this.f8074m.m5617a(c1690al);
        }
    }

    /* renamed from: n */
    public final C1697as m5609n() {
        return this.f8064b;
    }

    /* renamed from: o */
    public final boolean m5610o() {
        return this.f8064b == null && this.f8069h.m5475k().m1069b() > 0;
    }

    /* renamed from: p */
    public final float m5611p() {
        return this.f8070i;
    }

    /* renamed from: d */
    public final void m5594d(float f) {
        this.f8070i = f;
        m5572v();
    }

    /* renamed from: q */
    public final C1638a m5612q() {
        return this.f8069h;
    }

    /* renamed from: v */
    private void m5572v() {
        if (this.f8069h == null) {
            return;
        }
        float f = this.f8070i;
        setBounds(0, 0, (int) (this.f8069h.m5469e().width() * f), (int) (this.f8069h.m5469e().height() * f));
    }

    /* renamed from: r */
    public final void m5613r() {
        this.f8068g.clear();
        this.f8066e.cancel();
    }

    /* renamed from: s */
    public final void m5614s() {
        this.f8068g.clear();
        this.f8066e.m5883j();
    }

    /* renamed from: t */
    public final float m5615t() {
        return this.f8066e.m5877d();
    }

    /* renamed from: e */
    public final void m5599e(float f) {
        if (this.f8069h == null) {
            this.f8068g.add(new C1812g(this, f));
        } else {
            m5591c((int) C1810f.m5892a(this.f8069h.m5471g(), this.f8069h.m5472h(), f));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f8069h == null) {
            return -1;
        }
        return (int) (this.f8069h.m5469e().width() * this.f8070i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f8069h == null) {
            return -1;
        }
        return (int) (this.f8069h.m5469e().height() * this.f8070i);
    }

    /* renamed from: a */
    public final <T> void m5579a(C1762g c1762g, T t, C1814b<T> c1814b) {
        List list;
        if (this.f8076o == null) {
            this.f8068g.add(new C1817h(this, c1762g, t, c1814b));
            return;
        }
        boolean z = true;
        if (c1762g.m5795a() != null) {
            c1762g.m5795a().mo5484a(t, c1814b);
        } else {
            if (this.f8076o == null) {
                Log.w("EffectiveAnimation", "Cannot resolve KeyPath. Composition is not set yet.");
                list = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                this.f8076o.mo5483a(c1762g, 0, arrayList, new C1762g(new String[0]));
                list = arrayList;
            }
            for (int i = 0; i < list.size(); i++) {
                if (C1806b.f8390c) {
                    C1806b.m5865a("EffectiveAnimationDrawable::KeyPath = " + list.get(i));
                }
                ((C1762g) list.get(i)).m5795a().mo5484a(t, c1814b);
            }
            if (list.isEmpty()) {
                z = false;
            }
        }
        if (z) {
            invalidateSelf();
            if (t == InterfaceC1828t.f8480y) {
                m5599e(this.f8066e.m5877d());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f8068g.clear();
        this.f8066e.m5882i();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f8066e.isRunning();
    }

    /* renamed from: e */
    public final Bitmap m5597e(String str) {
        C1700b c1700b;
        if (getCallback() == null) {
            c1700b = null;
        } else {
            if (this.f8071j != null) {
                C1700b c1700b2 = this.f8071j;
                Drawable.Callback callback = getCallback();
                if (!c1700b2.m5621a((callback == null || !(callback instanceof View)) ? null : ((View) callback).getContext())) {
                    this.f8071j = null;
                }
            }
            if (this.f8071j == null) {
                this.f8071j = new C1700b(getCallback(), this.f8072k, this.f8073l, this.f8069h.m5477m());
            }
            c1700b = this.f8071j;
        }
        if (c1700b != null) {
            return c1700b.m5619a(str);
        }
        return null;
    }

    /* renamed from: a */
    public final Typeface m5573a(String str, String str2) {
        C1699a c1699a;
        if (getCallback() == null) {
            c1699a = null;
        } else {
            if (this.f8074m == null) {
                this.f8074m = new C1699a(getCallback(), this.f8063a);
            }
            c1699a = this.f8074m;
        }
        if (c1699a != null) {
            return c1699a.m5616a(str, str2);
        }
        return null;
    }
}
