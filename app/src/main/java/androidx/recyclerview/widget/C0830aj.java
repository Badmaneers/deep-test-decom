package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: LinearSmoothScroller.java */
/* renamed from: androidx.recyclerview.widget.aj */
/* loaded from: classes.dex */
public class C0830aj extends AbstractC0872by {

    /* renamed from: c */
    protected PointF f3493c;

    /* renamed from: f */
    private final DisplayMetrics f3496f;

    /* renamed from: h */
    private float f3498h;

    /* renamed from: a */
    protected final LinearInterpolator f3491a = new LinearInterpolator();

    /* renamed from: b */
    protected final DecelerateInterpolator f3492b = new DecelerateInterpolator();

    /* renamed from: g */
    private boolean f3497g = false;

    /* renamed from: d */
    protected int f3494d = 0;

    /* renamed from: e */
    protected int f3495e = 0;

    /* renamed from: b */
    private static int m2949b(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public C0830aj(Context context) {
        this.f3496f = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.AbstractC0872by
    /* renamed from: a */
    protected final void mo2953a(int i, int i2, C0873bz c0873bz) {
        if (m3185g() == 0) {
            m3179c();
            return;
        }
        this.f3494d = m2949b(this.f3494d, i);
        this.f3495e = m2949b(this.f3495e, i2);
        if (this.f3494d == 0 && this.f3495e == 0) {
            PointF d = m3181d(m3184f());
            if (d == null || (d.x == 0.0f && d.y == 0.0f)) {
                c0873bz.m3186a(m3184f());
                m3179c();
                return;
            }
            float sqrt = (float) Math.sqrt((d.x * d.x) + (d.y * d.y));
            d.x /= sqrt;
            d.y /= sqrt;
            this.f3493c = d;
            this.f3494d = (int) (d.x * 10000.0f);
            this.f3495e = (int) (d.y * 10000.0f);
            c0873bz.m3187a((int) (this.f3494d * 1.2f), (int) (this.f3495e * 1.2f), (int) (mo2955b(10000) * 1.2f), this.f3491a);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0872by
    /* renamed from: a */
    protected final void mo2952a() {
        this.f3495e = 0;
        this.f3494d = 0;
        this.f3493c = null;
    }

    /* renamed from: a */
    protected float mo2950a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final int m2951a(int i) {
        return (int) Math.ceil(mo2955b(i) / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int mo2955b(int i) {
        float abs = Math.abs(i);
        if (!this.f3497g) {
            this.f3498h = mo2950a(this.f3496f);
            this.f3497g = true;
        }
        return (int) Math.ceil(abs * this.f3498h);
    }

    /* renamed from: a */
    private static int m2948a(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case -1:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 > 0) {
                    return i6;
                }
                int i7 = i4 - i2;
                if (i7 < 0) {
                    return i7;
                }
                return 0;
            case 1:
                return i4 - i2;
            default:
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0872by
    /* renamed from: a */
    protected void mo2954a(View view, C0873bz c0873bz) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = (this.f3493c == null || this.f3493c.x == 0.0f) ? 0 : this.f3493c.x > 0.0f ? 1 : -1;
        AbstractC0856bi b = m3178b();
        if (b == null || !b.mo2842g()) {
            i = 0;
        } else {
            C0861bn c0861bn = (C0861bn) view.getLayoutParams();
            i = m2948a(AbstractC0856bi.m3072i(view) - c0861bn.leftMargin, AbstractC0856bi.m3075k(view) + c0861bn.rightMargin, b.m3081A(), b.m3124y() - b.m3083C(), i4);
        }
        if (this.f3493c == null || this.f3493c.y == 0.0f) {
            i2 = 0;
        } else if (this.f3493c.y > 0.0f) {
            i2 = 1;
        }
        AbstractC0856bi b2 = m3178b();
        if (b2 != null && b2.mo2843h()) {
            C0861bn c0861bn2 = (C0861bn) view.getLayoutParams();
            i3 = m2948a(AbstractC0856bi.m3074j(view) - c0861bn2.topMargin, AbstractC0856bi.m3076l(view) + c0861bn2.bottomMargin, b2.m3082B(), b2.m3125z() - b2.m3084D(), i2);
        }
        int m2951a = m2951a((int) Math.sqrt((i * i) + (i3 * i3)));
        if (m2951a > 0) {
            c0873bz.m3187a(-i, -i3, m2951a, this.f3492b);
        }
    }
}
