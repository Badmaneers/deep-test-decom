package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.p018b.C0418a;
import androidx.core.p022e.C0462i;
import androidx.core.p023f.C0478i;
import androidx.core.p024g.C0521f;
import androidx.core.p024g.C0538w;
import com.google.android.material.p072a.C2032a;
import com.google.android.material.p079h.C2218a;
import com.google.android.material.p079h.C2222e;

/* compiled from: CollapsingTextHelper.java */
/* renamed from: com.google.android.material.internal.c */
/* loaded from: classes.dex */
public final class C2258c {

    /* renamed from: a */
    private static final boolean f9953a;

    /* renamed from: b */
    private static final Paint f9954b;

    /* renamed from: A */
    private CharSequence f9955A;

    /* renamed from: B */
    private boolean f9956B;

    /* renamed from: C */
    private boolean f9957C;

    /* renamed from: D */
    private Bitmap f9958D;

    /* renamed from: E */
    private Paint f9959E;

    /* renamed from: F */
    private float f9960F;

    /* renamed from: G */
    private float f9961G;

    /* renamed from: H */
    private int[] f9962H;

    /* renamed from: I */
    private boolean f9963I;

    /* renamed from: L */
    private TimeInterpolator f9966L;

    /* renamed from: M */
    private TimeInterpolator f9967M;

    /* renamed from: N */
    private float f9968N;

    /* renamed from: O */
    private float f9969O;

    /* renamed from: P */
    private float f9970P;

    /* renamed from: Q */
    private ColorStateList f9971Q;

    /* renamed from: R */
    private float f9972R;

    /* renamed from: S */
    private float f9973S;

    /* renamed from: T */
    private float f9974T;

    /* renamed from: U */
    private ColorStateList f9975U;

    /* renamed from: V */
    private StaticLayout f9976V;

    /* renamed from: W */
    private float f9977W;

    /* renamed from: X */
    private float f9978X;

    /* renamed from: Y */
    private float f9979Y;

    /* renamed from: Z */
    private CharSequence f9980Z;

    /* renamed from: c */
    private final View f9982c;

    /* renamed from: d */
    private boolean f9983d;

    /* renamed from: e */
    private float f9984e;

    /* renamed from: m */
    private ColorStateList f9992m;

    /* renamed from: n */
    private ColorStateList f9993n;

    /* renamed from: o */
    private float f9994o;

    /* renamed from: p */
    private float f9995p;

    /* renamed from: q */
    private float f9996q;

    /* renamed from: r */
    private float f9997r;

    /* renamed from: s */
    private float f9998s;

    /* renamed from: t */
    private float f9999t;

    /* renamed from: u */
    private Typeface f10000u;

    /* renamed from: v */
    private Typeface f10001v;

    /* renamed from: w */
    private Typeface f10002w;

    /* renamed from: x */
    private C2218a f10003x;

    /* renamed from: y */
    private C2218a f10004y;

    /* renamed from: z */
    private CharSequence f10005z;

    /* renamed from: i */
    private int f9988i = 16;

    /* renamed from: j */
    private int f9989j = 16;

    /* renamed from: k */
    private float f9990k = 15.0f;

    /* renamed from: l */
    private float f9991l = 15.0f;

    /* renamed from: aa */
    private int f9981aa = 1;

    /* renamed from: J */
    private final TextPaint f9964J = new TextPaint(129);

    /* renamed from: K */
    private final TextPaint f9965K = new TextPaint(this.f9964J);

    /* renamed from: g */
    private final Rect f9986g = new Rect();

    /* renamed from: f */
    private final Rect f9985f = new Rect();

    /* renamed from: h */
    private final RectF f9987h = new RectF();

    static {
        f9953a = Build.VERSION.SDK_INT < 18;
        f9954b = null;
    }

    public C2258c(View view) {
        this.f9982c = view;
    }

    /* renamed from: a */
    public final void m7148a(TimeInterpolator timeInterpolator) {
        this.f9967M = timeInterpolator;
        m7174i();
    }

    /* renamed from: b */
    public final void m7160b(TimeInterpolator timeInterpolator) {
        this.f9966L = timeInterpolator;
        m7174i();
    }

    /* renamed from: a */
    public final void m7145a(float f) {
        if (this.f9990k != f) {
            this.f9990k = f;
            m7174i();
        }
    }

    /* renamed from: a */
    public final void m7149a(ColorStateList colorStateList) {
        if (this.f9993n != colorStateList) {
            this.f9993n = colorStateList;
            m7174i();
        }
    }

    /* renamed from: b */
    public final void m7161b(ColorStateList colorStateList) {
        if (this.f9992m != colorStateList) {
            this.f9992m = colorStateList;
            m7174i();
        }
    }

    /* renamed from: a */
    public final void m7147a(int i, int i2, int i3, int i4) {
        if (m7124a(this.f9985f, i, i2, i3, i4)) {
            return;
        }
        this.f9985f.set(i, i2, i3, i4);
        this.f9963I = true;
        m7136n();
    }

    /* renamed from: a */
    public final void m7151a(Rect rect) {
        m7147a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    public final void m7159b(int i, int i2, int i3, int i4) {
        if (m7124a(this.f9986g, i, i2, i3, i4)) {
            return;
        }
        this.f9986g.set(i, i2, i3, i4);
        this.f9963I = true;
        m7136n();
    }

    /* renamed from: b */
    public final void m7162b(Rect rect) {
        m7159b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    public final void m7152a(RectF rectF, int i, int i2) {
        float m7135m;
        float m7135m2;
        this.f9956B = m7125b(this.f10005z);
        if (i2 == 17 || (i2 & 7) == 1) {
            m7135m = (i / 2.0f) - (m7135m() / 2.0f);
        } else if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (!this.f9956B) {
                m7135m = this.f9986g.right - m7135m();
            }
            m7135m = this.f9986g.left;
        } else {
            if (this.f9956B) {
                m7135m = this.f9986g.right - m7135m();
            }
            m7135m = this.f9986g.left;
        }
        rectF.left = m7135m;
        rectF.top = this.f9986g.top;
        if (i2 == 17 || (i2 & 7) == 1) {
            m7135m2 = (i / 2.0f) + (m7135m() / 2.0f);
        } else if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (!this.f9956B) {
                m7135m2 = this.f9986g.right;
            }
            m7135m2 = rectF.left + m7135m();
        } else {
            if (this.f9956B) {
                m7135m2 = this.f9986g.right;
            }
            m7135m2 = rectF.left + m7135m();
        }
        rectF.right = m7135m2;
        rectF.bottom = this.f9986g.top + m7156b();
    }

    /* renamed from: m */
    private float m7135m() {
        if (this.f10005z == null) {
            return 0.0f;
        }
        m7122a(this.f9965K);
        return this.f9965K.measureText(this.f10005z, 0, this.f10005z.length());
    }

    /* renamed from: a */
    public final float m7144a() {
        TextPaint textPaint = this.f9965K;
        textPaint.setTextSize(this.f9990k);
        textPaint.setTypeface(this.f10001v);
        return -this.f9965K.ascent();
    }

    /* renamed from: b */
    public final float m7156b() {
        m7122a(this.f9965K);
        return -this.f9965K.ascent();
    }

    /* renamed from: a */
    private void m7122a(TextPaint textPaint) {
        textPaint.setTextSize(this.f9991l);
        textPaint.setTypeface(this.f10000u);
    }

    /* renamed from: n */
    private void m7136n() {
        this.f9983d = this.f9986g.width() > 0 && this.f9986g.height() > 0 && this.f9985f.width() > 0 && this.f9985f.height() > 0;
    }

    /* renamed from: a */
    public final void m7146a(int i) {
        if (this.f9988i != i) {
            this.f9988i = i;
            m7174i();
        }
    }

    /* renamed from: c */
    public final int m7164c() {
        return this.f9988i;
    }

    /* renamed from: b */
    public final void m7158b(int i) {
        if (this.f9989j != i) {
            this.f9989j = i;
            m7174i();
        }
    }

    /* renamed from: d */
    public final int m7167d() {
        return this.f9989j;
    }

    /* renamed from: c */
    public final void m7165c(int i) {
        C2222e c2222e = new C2222e(this.f9982c.getContext(), i);
        if (c2222e.f9820b != null) {
            this.f9993n = c2222e.f9820b;
        }
        if (c2222e.f9819a != 0.0f) {
            this.f9991l = c2222e.f9819a;
        }
        if (c2222e.f9827i != null) {
            this.f9971Q = c2222e.f9827i;
        }
        this.f9969O = c2222e.f9828j;
        this.f9970P = c2222e.f9829k;
        this.f9968N = c2222e.f9830l;
        if (this.f10004y != null) {
            this.f10004y.m7039a();
        }
        this.f10004y = new C2218a(new C2259d(this), c2222e.m7056a());
        c2222e.m7058a(this.f9982c.getContext(), this.f10004y);
        m7174i();
    }

    /* renamed from: d */
    public final void m7168d(int i) {
        C2222e c2222e = new C2222e(this.f9982c.getContext(), i);
        if (c2222e.f9820b != null) {
            this.f9992m = c2222e.f9820b;
        }
        if (c2222e.f9819a != 0.0f) {
            this.f9990k = c2222e.f9819a;
        }
        if (c2222e.f9827i != null) {
            this.f9975U = c2222e.f9827i;
        }
        this.f9973S = c2222e.f9828j;
        this.f9974T = c2222e.f9829k;
        this.f9972R = c2222e.f9830l;
        if (this.f10003x != null) {
            this.f10003x.m7039a();
        }
        this.f10003x = new C2218a(new C2260e(this), c2222e.m7056a());
        c2222e.m7058a(this.f9982c.getContext(), this.f10003x);
        m7174i();
    }

    /* renamed from: a */
    public final void m7153a(Typeface typeface) {
        if (m7129d(typeface)) {
            m7174i();
        }
    }

    /* renamed from: b */
    public final void m7163b(Typeface typeface) {
        if (m7131e(typeface)) {
            m7174i();
        }
    }

    /* renamed from: c */
    public final void m7166c(Typeface typeface) {
        boolean m7129d = m7129d(typeface);
        boolean m7131e = m7131e(typeface);
        if (m7129d || m7131e) {
            m7174i();
        }
    }

    /* renamed from: d */
    private boolean m7129d(Typeface typeface) {
        if (this.f10004y != null) {
            this.f10004y.m7039a();
        }
        if (this.f10000u == typeface) {
            return false;
        }
        this.f10000u = typeface;
        return true;
    }

    /* renamed from: e */
    private boolean m7131e(Typeface typeface) {
        if (this.f10003x != null) {
            this.f10003x.m7039a();
        }
        if (this.f10001v == typeface) {
            return false;
        }
        this.f10001v = typeface;
        return true;
    }

    /* renamed from: e */
    public final Typeface m7169e() {
        return this.f10000u != null ? this.f10000u : Typeface.DEFAULT;
    }

    /* renamed from: f */
    public final Typeface m7171f() {
        return this.f10001v != null ? this.f10001v : Typeface.DEFAULT;
    }

    /* renamed from: b */
    public final void m7157b(float f) {
        float m1477a = C0418a.m1477a(f, 0.0f, 1.0f);
        if (m1477a != this.f9984e) {
            this.f9984e = m1477a;
            m7137o();
        }
    }

    /* renamed from: a */
    public final boolean m7155a(int[] iArr) {
        this.f9962H = iArr;
        if (!((this.f9993n != null && this.f9993n.isStateful()) || (this.f9992m != null && this.f9992m.isStateful()))) {
            return false;
        }
        m7174i();
        return true;
    }

    /* renamed from: g */
    public final float m7172g() {
        return this.f9984e;
    }

    /* renamed from: o */
    private void m7137o() {
        m7127c(this.f9984e);
    }

    /* renamed from: c */
    private void m7127c(float f) {
        m7128d(f);
        this.f9998s = m7119a(this.f9996q, this.f9997r, f, this.f9966L);
        this.f9999t = m7119a(this.f9994o, this.f9995p, f, this.f9966L);
        m7133g(m7119a(this.f9990k, this.f9991l, f, this.f9967M));
        m7130e(1.0f - m7119a(0.0f, 1.0f, 1.0f - f, C2032a.f8974b));
        m7132f(m7119a(1.0f, 0.0f, f, C2032a.f8974b));
        if (this.f9993n != this.f9992m) {
            this.f9964J.setColor(m7120a(m7138p(), m7173h(), f));
        } else {
            this.f9964J.setColor(m7173h());
        }
        this.f9964J.setShadowLayer(m7119a(this.f9972R, this.f9968N, f, (TimeInterpolator) null), m7119a(this.f9973S, this.f9969O, f, (TimeInterpolator) null), m7119a(this.f9974T, this.f9970P, f, (TimeInterpolator) null), m7120a(m7126c(this.f9975U), m7126c(this.f9971Q), f));
        C0538w.m1874f(this.f9982c);
    }

    /* renamed from: p */
    private int m7138p() {
        return m7126c(this.f9992m);
    }

    /* renamed from: h */
    public final int m7173h() {
        return m7126c(this.f9993n);
    }

    /* renamed from: c */
    private int m7126c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        if (this.f9962H != null) {
            return colorStateList.getColorForState(this.f9962H, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: q */
    private void m7139q() {
        float ascent;
        float ascent2;
        float f = this.f9961G;
        m7134h(this.f9991l);
        if (this.f9955A != null && this.f9976V != null) {
            this.f9980Z = TextUtils.ellipsize(this.f9955A, this.f9964J, this.f9976V.getWidth(), TextUtils.TruncateAt.END);
        }
        float measureText = this.f9980Z != null ? this.f9964J.measureText(this.f9980Z, 0, this.f9980Z.length()) : 0.0f;
        int m1777a = C0521f.m1777a(this.f9989j, this.f9956B ? 1 : 0);
        float height = this.f9976V != null ? this.f9976V.getHeight() : 0.0f;
        int i = m1777a & 112;
        if (i == 48) {
            ascent = this.f9986g.top - this.f9964J.ascent();
        } else if (i == 80) {
            ascent = this.f9986g.bottom;
        } else {
            float descent = (this.f9964J.descent() - this.f9964J.ascent()) / 2.0f;
            float descent2 = descent - this.f9964J.descent();
            if (m7140r()) {
                ascent = this.f9986g.centerY() - descent;
            } else {
                ascent = descent2 + this.f9986g.centerY();
            }
        }
        this.f9995p = ascent;
        int i2 = m1777a & 8388615;
        if (i2 == 1) {
            this.f9997r = this.f9986g.centerX() - (measureText / 2.0f);
        } else if (i2 == 5) {
            this.f9997r = this.f9986g.right - measureText;
        } else {
            this.f9997r = this.f9986g.left;
        }
        m7134h(this.f9990k);
        float measureText2 = this.f9955A != null ? this.f9964J.measureText(this.f9955A, 0, this.f9955A.length()) : 0.0f;
        if (this.f9976V != null && this.f9981aa > 1 && !this.f9956B) {
            measureText2 = this.f9976V.getLineWidth(0);
        }
        this.f9979Y = this.f9976V != null ? this.f9976V.getLineLeft(0) : 0.0f;
        int m1777a2 = C0521f.m1777a(this.f9988i, this.f9956B ? 1 : 0);
        int i3 = m1777a2 & 112;
        if (i3 == 48) {
            ascent2 = this.f9985f.top - this.f9964J.ascent();
        } else if (i3 == 80) {
            ascent2 = this.f9985f.bottom - (m7140r() ? height - this.f9964J.descent() : 0.0f);
        } else {
            float descent3 = ((this.f9964J.descent() - this.f9964J.ascent()) / 2.0f) - this.f9964J.descent();
            if (m7140r()) {
                ascent2 = this.f9985f.centerY() - (height / 2.0f);
            } else {
                ascent2 = descent3 + this.f9985f.centerY();
            }
        }
        this.f9994o = ascent2;
        int i4 = m1777a2 & 8388615;
        if (i4 == 1) {
            this.f9996q = this.f9985f.centerX() - (measureText2 / 2.0f);
        } else if (i4 == 5) {
            this.f9996q = this.f9985f.right - measureText2;
        } else {
            this.f9996q = this.f9985f.left;
        }
        m7143u();
        m7133g(f);
    }

    /* renamed from: d */
    private void m7128d(float f) {
        this.f9987h.left = m7119a(this.f9985f.left, this.f9986g.left, f, this.f9966L);
        this.f9987h.top = m7119a(this.f9994o, this.f9995p, f, this.f9966L);
        this.f9987h.right = m7119a(this.f9985f.right, this.f9986g.right, f, this.f9966L);
        this.f9987h.bottom = m7119a(this.f9985f.bottom, this.f9986g.bottom, f, this.f9966L);
    }

    /* renamed from: e */
    private void m7130e(float f) {
        this.f9977W = f;
        C0538w.m1874f(this.f9982c);
    }

    /* renamed from: f */
    private void m7132f(float f) {
        this.f9978X = f;
        C0538w.m1874f(this.f9982c);
    }

    /* renamed from: a */
    public final void m7150a(Canvas canvas) {
        int save = canvas.save();
        if (this.f9955A == null || !this.f9983d) {
            return;
        }
        float lineLeft = (this.f9998s + this.f9976V.getLineLeft(0)) - (this.f9979Y * 2.0f);
        this.f9964J.setTextSize(this.f9961G);
        float f = this.f9998s;
        float f2 = this.f9999t;
        boolean z = this.f9957C && this.f9958D != null;
        float lineAscent = this.f9976V.getLineAscent(0);
        if (this.f9960F != 1.0f) {
            canvas.scale(this.f9960F, this.f9960F, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.f9958D, f, f2 + lineAscent, this.f9959E);
            canvas.restoreToCount(save);
            return;
        }
        if (!m7140r()) {
            canvas.translate(f, f2 + lineAscent);
            this.f9976V.draw(canvas);
        } else {
            int alpha = this.f9964J.getAlpha();
            canvas.translate(lineLeft, f2);
            float f3 = alpha;
            this.f9964J.setAlpha((int) (this.f9978X * f3));
            this.f9976V.draw(canvas);
            canvas.translate(f - lineLeft, 0.0f);
            this.f9964J.setAlpha((int) (this.f9977W * f3));
            float f4 = -lineAscent;
            canvas.drawText(this.f9980Z, 0, this.f9980Z.length(), 0.0f, f4 / this.f9960F, this.f9964J);
            String trim = this.f9980Z.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            this.f9964J.setAlpha(alpha);
            canvas.drawText(trim, 0, Math.min(this.f9976V.getLineEnd(0), trim.length()), 0.0f, f4 / this.f9960F, (Paint) this.f9964J);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: r */
    private boolean m7140r() {
        return (this.f9981aa <= 1 || this.f9956B || this.f9957C) ? false : true;
    }

    /* renamed from: b */
    private boolean m7125b(CharSequence charSequence) {
        return (m7141s() ? C0462i.f2261d : C0462i.f2260c).mo1606a(charSequence, charSequence.length());
    }

    /* renamed from: s */
    private boolean m7141s() {
        return C0538w.m1878h(this.f9982c) == 1;
    }

    /* renamed from: g */
    private void m7133g(float f) {
        m7134h(f);
        this.f9957C = f9953a && this.f9960F != 1.0f;
        if (this.f9957C) {
            m7142t();
        }
        C0538w.m1874f(this.f9982c);
    }

    /* renamed from: h */
    private void m7134h(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.f10005z == null) {
            return;
        }
        float width = this.f9986g.width();
        float width2 = this.f9985f.width();
        if (m7123a(f, this.f9991l)) {
            float f3 = this.f9991l;
            this.f9960F = 1.0f;
            if (this.f10002w != this.f10000u) {
                this.f10002w = this.f10000u;
                z2 = true;
            } else {
                z2 = false;
            }
            f2 = f3;
            z = z2;
        } else {
            f2 = this.f9990k;
            if (this.f10002w != this.f10001v) {
                this.f10002w = this.f10001v;
                z = true;
            } else {
                z = false;
            }
            if (m7123a(f, this.f9990k)) {
                this.f9960F = 1.0f;
            } else {
                this.f9960F = f / this.f9990k;
            }
            float f4 = this.f9991l / this.f9990k;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
        }
        if (width > 0.0f) {
            z = this.f9961G != f2 || this.f9963I || z;
            this.f9961G = f2;
            this.f9963I = false;
        }
        if (this.f9955A == null || z) {
            this.f9964J.setTextSize(this.f9961G);
            this.f9964J.setTypeface(this.f10002w);
            this.f9964J.setLinearText(this.f9960F != 1.0f);
            this.f9956B = m7125b(this.f10005z);
            this.f9976V = m7121a(m7140r() ? this.f9981aa : 1, width, this.f9956B);
            this.f9955A = this.f9976V.getText();
        }
    }

    /* renamed from: a */
    private StaticLayout m7121a(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = C2236ae.m7079a(this.f10005z, this.f9964J, (int) f).m7083a(TextUtils.TruncateAt.END).m7084a(z).m7082a(Layout.Alignment.ALIGN_NORMAL).m7080a().m7081a(i).m7085b();
        } catch (C2237af e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) C0478i.m1620a(staticLayout);
    }

    /* renamed from: t */
    private void m7142t() {
        if (this.f9958D != null || this.f9985f.isEmpty() || TextUtils.isEmpty(this.f9955A)) {
            return;
        }
        m7127c(0.0f);
        int width = this.f9976V.getWidth();
        int height = this.f9976V.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f9958D = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f9976V.draw(new Canvas(this.f9958D));
        if (this.f9959E == null) {
            this.f9959E = new Paint(3);
        }
    }

    /* renamed from: i */
    public final void m7174i() {
        if (this.f9982c.getHeight() <= 0 || this.f9982c.getWidth() <= 0) {
            return;
        }
        m7139q();
        m7137o();
    }

    /* renamed from: a */
    public final void m7154a(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f10005z, charSequence)) {
            this.f10005z = charSequence;
            this.f9955A = null;
            m7143u();
            m7174i();
        }
    }

    /* renamed from: j */
    public final CharSequence m7175j() {
        return this.f10005z;
    }

    /* renamed from: u */
    private void m7143u() {
        if (this.f9958D != null) {
            this.f9958D.recycle();
            this.f9958D = null;
        }
    }

    /* renamed from: e */
    public final void m7170e(int i) {
        if (i != this.f9981aa) {
            this.f9981aa = i;
            m7143u();
            m7174i();
        }
    }

    /* renamed from: k */
    public final int m7176k() {
        return this.f9981aa;
    }

    /* renamed from: a */
    private static boolean m7123a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: l */
    public final ColorStateList m7177l() {
        return this.f9993n;
    }

    /* renamed from: a */
    private static int m7120a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: a */
    private static float m7119a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C2032a.m6240a(f, f2, f3);
    }

    /* renamed from: a */
    private static boolean m7124a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
