package com.color.support.widget;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.p024g.C0521f;
import com.color.support.util.C1336a;
import java.util.Locale;

/* compiled from: ColorCutoutDrawable.java */
/* renamed from: com.color.support.widget.j */
/* loaded from: classes.dex */
public final class C1563j {

    /* renamed from: a */
    private static final boolean f7402a;

    /* renamed from: b */
    private static final Paint f7403b;

    /* renamed from: A */
    private float f7404A;

    /* renamed from: B */
    private float f7405B;

    /* renamed from: C */
    private float f7406C;

    /* renamed from: D */
    private float f7407D;

    /* renamed from: E */
    private int[] f7408E;

    /* renamed from: F */
    private boolean f7409F;

    /* renamed from: I */
    private Interpolator f7412I;

    /* renamed from: J */
    private Interpolator f7413J;

    /* renamed from: c */
    private final View f7414c;

    /* renamed from: d */
    private boolean f7415d;

    /* renamed from: e */
    private float f7416e;

    /* renamed from: m */
    private ColorStateList f7424m;

    /* renamed from: n */
    private ColorStateList f7425n;

    /* renamed from: o */
    private float f7426o;

    /* renamed from: p */
    private float f7427p;

    /* renamed from: q */
    private float f7428q;

    /* renamed from: r */
    private float f7429r;

    /* renamed from: s */
    private float f7430s;

    /* renamed from: t */
    private float f7431t;

    /* renamed from: u */
    private CharSequence f7432u;

    /* renamed from: v */
    private CharSequence f7433v;

    /* renamed from: w */
    private boolean f7434w;

    /* renamed from: x */
    private boolean f7435x;

    /* renamed from: y */
    private Bitmap f7436y;

    /* renamed from: z */
    private Paint f7437z;

    /* renamed from: i */
    private int f7420i = 16;

    /* renamed from: j */
    private int f7421j = 16;

    /* renamed from: k */
    private float f7422k = 30.0f;

    /* renamed from: l */
    private float f7423l = 30.0f;

    /* renamed from: G */
    private final TextPaint f7410G = new TextPaint(129);

    /* renamed from: H */
    private final TextPaint f7411H = new TextPaint(this.f7410G);

    /* renamed from: g */
    private final Rect f7418g = new Rect();

    /* renamed from: f */
    private final Rect f7417f = new Rect();

    /* renamed from: h */
    private final RectF f7419h = new RectF();

    static {
        f7402a = Build.VERSION.SDK_INT < 18;
        f7403b = null;
    }

    public C1563j(View view) {
        this.f7414c = view;
    }

    /* renamed from: a */
    public final void m5252a(Interpolator interpolator) {
        this.f7413J = interpolator;
        m5269k();
    }

    /* renamed from: b */
    public final void m5260b(Interpolator interpolator) {
        this.f7412I = interpolator;
        m5269k();
    }

    /* renamed from: a */
    public final void m5245a(float f) {
        if (this.f7422k != f) {
            this.f7422k = f;
            m5269k();
        }
    }

    /* renamed from: a */
    public final void m5249a(ColorStateList colorStateList) {
        if (this.f7425n != colorStateList) {
            this.f7425n = colorStateList;
            m5269k();
        }
    }

    /* renamed from: b */
    public final void m5259b(ColorStateList colorStateList) {
        if (this.f7424m != colorStateList) {
            this.f7424m = colorStateList;
            m5269k();
        }
    }

    /* renamed from: a */
    public final Rect m5244a() {
        return this.f7417f;
    }

    /* renamed from: a */
    public final void m5247a(int i, int i2, int i3, int i4) {
        if (m5230a(this.f7417f, i, i2, i3, i4)) {
            return;
        }
        this.f7417f.set(i, i2, i3, i4);
        this.f7409F = true;
        m5236p();
        Log.d("ColorCollapseTextHelper", "setExpandedBounds: " + this.f7417f);
    }

    /* renamed from: b */
    public final Rect m5255b() {
        return this.f7418g;
    }

    /* renamed from: b */
    public final void m5258b(int i, int i2, int i3, int i4) {
        if (m5230a(this.f7418g, i, i2, i3, i4)) {
            return;
        }
        this.f7418g.set(i, i2, i3, i4);
        this.f7409F = true;
        m5236p();
        Log.d("ColorCollapseTextHelper", "setCollapsedBounds: " + this.f7418g);
    }

    /* renamed from: o */
    private float m5235o() {
        if (this.f7432u == null) {
            return 0.0f;
        }
        m5228a(this.f7411H);
        return this.f7411H.measureText(this.f7432u, 0, this.f7432u.length());
    }

    /* renamed from: c */
    public final float m5261c() {
        m5228a(this.f7411H);
        if (Locale.getDefault().getLanguage().equals("my")) {
            return (-this.f7411H.ascent()) * 1.3f;
        }
        return -this.f7411H.ascent();
    }

    /* renamed from: d */
    public final float m5262d() {
        m5228a(this.f7411H);
        float descent = this.f7411H.descent() - this.f7411H.ascent();
        return Locale.getDefault().getLanguage().equals("my") ? descent * 1.3f : descent;
    }

    /* renamed from: a */
    private void m5228a(TextPaint textPaint) {
        textPaint.setTextSize(this.f7423l);
    }

    /* renamed from: p */
    private void m5236p() {
        this.f7415d = this.f7418g.width() > 0 && this.f7418g.height() > 0 && this.f7417f.width() > 0 && this.f7417f.height() > 0;
    }

    /* renamed from: e */
    public final int m5263e() {
        return this.f7420i;
    }

    /* renamed from: a */
    public final void m5246a(int i) {
        if (this.f7420i != i) {
            this.f7420i = i;
            m5269k();
        }
    }

    /* renamed from: f */
    public final int m5264f() {
        return this.f7421j;
    }

    /* renamed from: b */
    public final void m5257b(int i) {
        if (this.f7421j != i) {
            this.f7421j = i;
            m5269k();
        }
    }

    /* renamed from: a */
    public final void m5248a(int i, ColorStateList colorStateList) {
        this.f7425n = colorStateList;
        this.f7423l = i;
        m5269k();
    }

    /* renamed from: g */
    public final void m5265g() {
        C1336a.m4371a(this.f7410G);
        C1336a.m4371a(this.f7411H);
        m5269k();
    }

    /* renamed from: h */
    public final float m5266h() {
        return this.f7416e;
    }

    /* renamed from: b */
    public final void m5256b(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f7416e) {
            this.f7416e = f;
            m5237q();
        }
    }

    /* renamed from: a */
    public final boolean m5254a(int[] iArr) {
        this.f7408E = iArr;
        if (!((this.f7425n != null && this.f7425n.isStateful()) || (this.f7424m != null && this.f7424m.isStateful()))) {
            return false;
        }
        m5269k();
        return true;
    }

    /* renamed from: i */
    public final float m5267i() {
        return this.f7416e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final float m5268j() {
        return this.f7422k;
    }

    /* renamed from: q */
    private void m5237q() {
        m5231c(this.f7416e);
    }

    /* renamed from: c */
    private void m5231c(float f) {
        m5232d(f);
        this.f7430s = m5226a(this.f7428q, this.f7429r, f, this.f7412I);
        this.f7431t = m5226a(this.f7426o, this.f7427p, f, this.f7412I);
        m5233e(m5226a(this.f7422k, this.f7423l, f, this.f7413J));
        if (this.f7425n != this.f7424m) {
            this.f7410G.setColor(m5227a(m5238r(), m5239s(), f));
        } else {
            this.f7410G.setColor(m5239s());
        }
        this.f7414c.postInvalidate();
    }

    /* renamed from: r */
    private int m5238r() {
        if (this.f7408E != null) {
            return this.f7424m.getColorForState(this.f7408E, 0);
        }
        return this.f7424m.getDefaultColor();
    }

    /* renamed from: s */
    private int m5239s() {
        if (this.f7408E != null) {
            return this.f7425n.getColorForState(this.f7408E, 0);
        }
        return this.f7425n.getDefaultColor();
    }

    /* renamed from: t */
    private void m5240t() {
        float f = this.f7407D;
        m5234f(this.f7423l);
        float measureText = this.f7433v != null ? this.f7410G.measureText(this.f7433v, 0, this.f7433v.length()) : 0.0f;
        int m1777a = C0521f.m1777a(this.f7421j, this.f7434w ? 1 : 0);
        int i = m1777a & 112;
        if (i != 48) {
            if (i == 80) {
                this.f7427p = this.f7418g.bottom;
            } else {
                this.f7427p = this.f7418g.centerY() + (((this.f7410G.descent() - this.f7410G.ascent()) / 2.0f) - this.f7410G.descent());
            }
        } else if (Locale.getDefault().getLanguage().equals("my")) {
            this.f7427p = this.f7418g.top - (this.f7410G.ascent() * 1.3f);
        } else {
            this.f7427p = this.f7418g.top - this.f7410G.ascent();
        }
        int i2 = m1777a & 8388615;
        if (i2 == 1) {
            this.f7429r = this.f7418g.centerX() - (measureText / 2.0f);
        } else if (i2 == 5) {
            this.f7429r = this.f7418g.right - measureText;
        } else {
            this.f7429r = this.f7418g.left;
        }
        m5234f(this.f7422k);
        float measureText2 = this.f7433v != null ? this.f7410G.measureText(this.f7433v, 0, this.f7433v.length()) : 0.0f;
        int m1777a2 = C0521f.m1777a(this.f7420i, this.f7434w ? 1 : 0);
        int i3 = m1777a2 & 112;
        if (i3 == 48) {
            this.f7426o = this.f7417f.top - this.f7410G.ascent();
        } else if (i3 == 80) {
            this.f7426o = this.f7417f.bottom;
        } else {
            this.f7426o = this.f7417f.centerY() + (((this.f7410G.descent() - this.f7410G.ascent()) / 2.0f) - this.f7410G.descent());
        }
        int i4 = m1777a2 & 8388615;
        if (i4 == 1) {
            this.f7428q = this.f7417f.centerX() - (measureText2 / 2.0f);
        } else if (i4 == 5) {
            this.f7428q = this.f7417f.right - measureText2;
        } else {
            this.f7428q = this.f7417f.left;
        }
        m5242v();
        m5233e(f);
    }

    /* renamed from: d */
    private void m5232d(float f) {
        this.f7419h.left = m5226a(this.f7417f.left, this.f7418g.left, f, this.f7412I);
        this.f7419h.top = m5226a(this.f7426o, this.f7427p, f, this.f7412I);
        this.f7419h.right = m5226a(this.f7417f.right, this.f7418g.right, f, this.f7412I);
        this.f7419h.bottom = m5226a(this.f7417f.bottom, this.f7418g.bottom, f, this.f7412I);
    }

    /* renamed from: a */
    public final void m5250a(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f7433v != null && this.f7415d) {
            float f2 = this.f7430s;
            float f3 = this.f7431t;
            boolean z = this.f7435x && this.f7436y != null;
            if (z) {
                f = this.f7404A * this.f7406C;
            } else {
                this.f7410G.ascent();
                f = 0.0f;
                this.f7410G.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            if (this.f7406C != 1.0f) {
                canvas.scale(this.f7406C, this.f7406C, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.f7436y, f2, f4, this.f7437z);
            } else {
                canvas.drawText(this.f7433v, 0, this.f7433v.length(), f2, f4, this.f7410G);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: e */
    private void m5233e(float f) {
        m5234f(f);
        this.f7435x = f7402a && this.f7406C != 1.0f;
        if (this.f7435x) {
            m5241u();
        }
        this.f7414c.postInvalidate();
    }

    /* renamed from: f */
    private void m5234f(float f) {
        float f2;
        boolean z;
        if (this.f7432u == null) {
            return;
        }
        float width = this.f7418g.width();
        float width2 = this.f7417f.width();
        if (m5229a(f, this.f7423l)) {
            float f3 = this.f7423l;
            this.f7406C = 1.0f;
            f2 = f3;
        } else {
            f2 = this.f7422k;
            if (m5229a(f, this.f7422k)) {
                this.f7406C = 1.0f;
            } else {
                this.f7406C = f / this.f7422k;
            }
            float f4 = this.f7423l / this.f7422k;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
        }
        if (width > 0.0f) {
            z = this.f7407D != f2 || this.f7409F;
            this.f7407D = f2;
            this.f7409F = false;
        } else {
            z = false;
        }
        if (this.f7433v == null || z) {
            this.f7410G.setTextSize(this.f7407D);
            this.f7410G.setLinearText(this.f7406C != 1.0f);
            CharSequence ellipsize = TextUtils.ellipsize(this.f7432u, this.f7410G, width, TextUtils.TruncateAt.END);
            if (!TextUtils.equals(ellipsize, this.f7433v)) {
                this.f7433v = ellipsize;
            }
        }
        this.f7434w = m5243w();
    }

    /* renamed from: u */
    private void m5241u() {
        if (this.f7436y != null || this.f7417f.isEmpty() || TextUtils.isEmpty(this.f7433v)) {
            return;
        }
        m5231c(0.0f);
        this.f7404A = this.f7410G.ascent();
        this.f7405B = this.f7410G.descent();
        int round = Math.round(this.f7410G.measureText(this.f7433v, 0, this.f7433v.length()));
        int round2 = Math.round(this.f7405B - this.f7404A);
        if (round <= 0 || round2 <= 0) {
            return;
        }
        this.f7436y = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        new Canvas(this.f7436y).drawText(this.f7433v, 0, this.f7433v.length(), 0.0f, round2 - this.f7410G.descent(), this.f7410G);
        if (this.f7437z == null) {
            this.f7437z = new Paint(3);
        }
    }

    /* renamed from: k */
    public final void m5269k() {
        if (this.f7414c.getHeight() <= 0 || this.f7414c.getWidth() <= 0) {
            return;
        }
        m5240t();
        m5237q();
    }

    /* renamed from: a */
    public final void m5253a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f7432u)) {
            this.f7432u = charSequence;
            this.f7433v = null;
            m5242v();
            m5269k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final CharSequence m5270l() {
        return this.f7432u;
    }

    /* renamed from: v */
    private void m5242v() {
        if (this.f7436y != null) {
            this.f7436y.recycle();
            this.f7436y = null;
        }
    }

    /* renamed from: a */
    private static boolean m5229a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final ColorStateList m5271m() {
        return this.f7424m;
    }

    /* renamed from: n */
    public final ColorStateList m5272n() {
        return this.f7425n;
    }

    /* renamed from: a */
    private static int m5227a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: a */
    private static float m5226a(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    private static boolean m5230a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: w */
    private boolean m5243w() {
        return Build.VERSION.SDK_INT > 16 && this.f7414c.getLayoutDirection() == 1;
    }

    /* renamed from: a */
    public final void m5251a(RectF rectF) {
        float m5235o;
        boolean m5243w = m5243w();
        if (!m5243w) {
            m5235o = this.f7418g.left;
        } else {
            m5235o = this.f7418g.right - m5235o();
        }
        rectF.left = m5235o;
        rectF.top = this.f7418g.top;
        rectF.right = !m5243w ? rectF.left + m5235o() : this.f7418g.right;
        rectF.bottom = this.f7418g.top + m5261c();
    }
}
