package com.google.android.material.p082k;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.InterfaceC0547b;
import androidx.core.p023f.C0472c;
import com.google.android.material.R;
import com.google.android.material.p076e.C2179a;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.p081j.C2282a;
import java.util.BitSet;

/* compiled from: MaterialShapeDrawable.java */
/* renamed from: com.google.android.material.k.h */
/* loaded from: classes.dex */
public class C2295h extends Drawable implements InterfaceC0547b, InterfaceC2288ad {

    /* renamed from: a */
    private static final String f10064a = "h";

    /* renamed from: b */
    private static final Paint f10065b = new Paint(1);

    /* renamed from: c */
    private C2298k f10066c;

    /* renamed from: d */
    private final AbstractC2287ac[] f10067d;

    /* renamed from: e */
    private final AbstractC2287ac[] f10068e;

    /* renamed from: f */
    private final BitSet f10069f;

    /* renamed from: g */
    private boolean f10070g;

    /* renamed from: h */
    private final Matrix f10071h;

    /* renamed from: i */
    private final Path f10072i;

    /* renamed from: j */
    private final Path f10073j;

    /* renamed from: k */
    private final RectF f10074k;

    /* renamed from: l */
    private final RectF f10075l;

    /* renamed from: m */
    private final Region f10076m;

    /* renamed from: n */
    private final Region f10077n;

    /* renamed from: o */
    private C2303p f10078o;

    /* renamed from: p */
    private final Paint f10079p;

    /* renamed from: q */
    private final Paint f10080q;

    /* renamed from: r */
    private final C2282a f10081r;

    /* renamed from: s */
    private final InterfaceC2307t f10082s;

    /* renamed from: t */
    private final C2306s f10083t;

    /* renamed from: u */
    private PorterDuffColorFilter f10084u;

    /* renamed from: v */
    private PorterDuffColorFilter f10085v;

    /* renamed from: w */
    private final RectF f10086w;

    /* renamed from: x */
    private boolean f10087x;

    /* renamed from: b */
    private static int m7246b(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public /* synthetic */ C2295h(C2298k c2298k, byte b) {
        this(c2298k);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m7253d(C2295h c2295h) {
        c2295h.f10070g = true;
        return true;
    }

    /* renamed from: a */
    public static C2295h m7241a(Context context, float f) {
        int m7041a = C2220c.m7041a(context, R.attr.colorSurface, C2295h.class.getSimpleName());
        C2295h c2295h = new C2295h();
        c2295h.m7276a(context);
        c2295h.m7282g(ColorStateList.valueOf(m7041a));
        c2295h.m7288r(f);
        return c2295h;
    }

    public C2295h() {
        this(new C2303p());
    }

    public C2295h(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C2303p.m7300a(context, attributeSet, i, i2).m7327a());
    }

    public C2295h(C2303p c2303p) {
        this(new C2298k(c2303p));
    }

    private C2295h(C2298k c2298k) {
        this.f10067d = new AbstractC2287ac[4];
        this.f10068e = new AbstractC2287ac[4];
        this.f10069f = new BitSet(8);
        this.f10071h = new Matrix();
        this.f10072i = new Path();
        this.f10073j = new Path();
        this.f10074k = new RectF();
        this.f10075l = new RectF();
        this.f10076m = new Region();
        this.f10077n = new Region();
        this.f10079p = new Paint(1);
        this.f10080q = new Paint(1);
        this.f10081r = new C2282a();
        this.f10083t = new C2306s();
        this.f10086w = new RectF();
        this.f10087x = true;
        this.f10066c = c2298k;
        this.f10080q.setStyle(Paint.Style.STROKE);
        this.f10079p.setStyle(Paint.Style.FILL);
        f10065b.setColor(-1);
        f10065b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m7254e();
        m7245a(getState());
        this.f10082s = new C2296i(this);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f10066c;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f10066c = new C2298k(this.f10066c);
        return this;
    }

    @Override // com.google.android.material.p082k.InterfaceC2288ad
    public void setShapeAppearanceModel(C2303p c2303p) {
        this.f10066c.f10091a = c2303p;
        invalidateSelf();
    }

    /* renamed from: L */
    public final C2303p m7258L() {
        return this.f10066c.f10091a;
    }

    /* renamed from: g */
    public final void m7282g(ColorStateList colorStateList) {
        if (this.f10066c.f10094d != colorStateList) {
            this.f10066c.f10094d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: M */
    public final ColorStateList m7259M() {
        return this.f10066c.f10094d;
    }

    /* renamed from: h */
    public final void m7283h(ColorStateList colorStateList) {
        if (this.f10066c.f10095e != colorStateList) {
            this.f10066c.f10095e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f10066c.f10098h != mode) {
            this.f10066c.f10098h = mode;
            m7254e();
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public void setTintList(ColorStateList colorStateList) {
        this.f10066c.f10097g = colorStateList;
        m7254e();
        super.invalidateSelf();
    }

    /* renamed from: N */
    public final ColorStateList m7260N() {
        return this.f10066c.f10097g;
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public final void m7273a(float f, int i) {
        m7284n(f);
        m7283h(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public final void m7274a(float f, ColorStateList colorStateList) {
        m7284n(f);
        m7283h(colorStateList);
    }

    /* renamed from: n */
    public final void m7284n(float f) {
        this.f10066c.f10102l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f10066c.f10103m != i) {
            this.f10066c.f10103m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10066c.f10093c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f10076m.set(getBounds());
        m7248b(m7261O(), this.f10072i);
        this.f10077n.setPath(this.f10072i, this.f10076m);
        this.f10076m.op(this.f10077n, Region.Op.DIFFERENCE);
        return this.f10076m;
    }

    /* renamed from: O */
    public final RectF m7261O() {
        this.f10074k.set(getBounds());
        return this.f10074k;
    }

    /* renamed from: o */
    public final void m7285o(float f) {
        setShapeAppearanceModel(this.f10066c.f10091a.m7302a(f));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.f10066c.f10099i != null) {
            rect.set(this.f10066c.f10099i);
            return true;
        }
        return super.getPadding(rect);
    }

    /* renamed from: a */
    public final void m7275a(int i, int i2) {
        if (this.f10066c.f10099i == null) {
            this.f10066c.f10099i = new Rect();
        }
        this.f10066c.f10099i.set(0, i, 0, i2);
        invalidateSelf();
    }

    /* renamed from: P */
    public final void m7262P() {
        if (this.f10066c.f10107q != 2) {
            this.f10066c.f10107q = 2;
            super.invalidateSelf();
        }
    }

    /* renamed from: Q */
    public final boolean m7263Q() {
        return this.f10066c.f10092b != null && this.f10066c.f10092b.m6910a();
    }

    /* renamed from: a */
    public final void m7276a(Context context) {
        this.f10066c.f10092b = new C2179a(context);
        m7247b();
    }

    /* renamed from: a */
    private int m7237a(int i) {
        return this.f10066c.f10092b != null ? this.f10066c.f10092b.m6909a(i, m7236a() + this.f10066c.f10104n) : i;
    }

    /* renamed from: R */
    public final float m7264R() {
        return this.f10066c.f10101k;
    }

    /* renamed from: p */
    public final void m7286p(float f) {
        if (this.f10066c.f10101k != f) {
            this.f10066c.f10101k = f;
            this.f10070g = true;
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public final void m7287q(float f) {
        if (this.f10066c.f10104n != f) {
            this.f10066c.f10104n = f;
            m7247b();
        }
    }

    /* renamed from: S */
    public final float m7265S() {
        return this.f10066c.f10105o;
    }

    /* renamed from: r */
    public final void m7288r(float f) {
        if (this.f10066c.f10105o != f) {
            this.f10066c.f10105o = f;
            m7247b();
        }
    }

    /* renamed from: b */
    private void m7247b() {
        float m7236a = m7236a();
        this.f10066c.f10108r = (int) Math.ceil(0.75f * m7236a);
        this.f10066c.f10109s = (int) Math.ceil(m7236a * 0.25f);
        m7254e();
        super.invalidateSelf();
    }

    /* renamed from: f */
    public final void m7281f(boolean z) {
        this.f10087x = z;
    }

    /* renamed from: D */
    public final void m7257D(int i) {
        if (this.f10066c.f10110t != i) {
            this.f10066c.f10110t = i;
            super.invalidateSelf();
        }
    }

    /* renamed from: T */
    public final int m7266T() {
        return this.f10066c.f10108r;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f10070g = true;
        super.invalidateSelf();
    }

    /* renamed from: U */
    public final void m7267U() {
        this.f10081r.m7222a(-12303292);
        this.f10066c.f10111u = false;
        super.invalidateSelf();
    }

    /* renamed from: a */
    public final void m7278a(Paint.Style style) {
        this.f10066c.f10112v = style;
        super.invalidateSelf();
    }

    /* renamed from: c */
    private boolean m7250c() {
        return (this.f10066c.f10112v == Paint.Style.FILL_AND_STROKE || this.f10066c.f10112v == Paint.Style.STROKE) && this.f10080q.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f10070g = true;
        super.onBoundsChange(rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d0, code lost:            if ((android.os.Build.VERSION.SDK_INT < 21 || !(m7280aa() || r10.f10072i.isConvex() || android.os.Build.VERSION.SDK_INT >= 29)) != false) goto L75;     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c0  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.p082k.C2295h.draw(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    public final void m7277a(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m7244a(canvas, paint, path, this.f10066c.f10091a, rectF);
    }

    /* renamed from: a */
    private void m7244a(Canvas canvas, Paint paint, Path path, C2303p c2303p, RectF rectF) {
        if (c2303p.m7303a(rectF)) {
            float mo7225a = c2303p.f10123g.mo7225a(rectF) * this.f10066c.f10101k;
            canvas.drawRoundRect(rectF, mo7225a, mo7225a, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    /* renamed from: a */
    private void m7243a(Canvas canvas) {
        if (this.f10069f.cardinality() > 0) {
            Log.w(f10064a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f10066c.f10109s != 0) {
            canvas.drawPath(this.f10072i, this.f10081r.m7221a());
        }
        for (int i = 0; i < 4; i++) {
            this.f10067d[i].m7232a(this.f10081r, this.f10066c.f10108r, canvas);
            this.f10068e[i].m7232a(this.f10081r, this.f10066c.f10108r, canvas);
        }
        if (this.f10087x) {
            int m7252d = m7252d();
            int m7268V = m7268V();
            canvas.translate(-m7252d, -m7268V);
            canvas.drawPath(this.f10072i, f10065b);
            canvas.translate(m7252d, m7268V);
        }
    }

    /* renamed from: d */
    private int m7252d() {
        return (int) (this.f10066c.f10109s * Math.sin(Math.toRadians(this.f10066c.f10110t)));
    }

    /* renamed from: V */
    public final int m7268V() {
        return (int) (this.f10066c.f10109s * Math.cos(Math.toRadians(this.f10066c.f10110t)));
    }

    /* renamed from: a */
    public final void m7279a(RectF rectF, Path path) {
        this.f10083t.m7356a(this.f10066c.f10091a, this.f10066c.f10101k, rectF, this.f10082s, path);
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f10066c.f10107q == 2) {
            return;
        }
        if (m7280aa()) {
            outline.setRoundRect(getBounds(), m7269W() * this.f10066c.f10101k);
            return;
        }
        m7248b(m7261O(), this.f10072i);
        if (this.f10072i.isConvex() || Build.VERSION.SDK_INT >= 29) {
            outline.setConvexPath(this.f10072i);
        }
    }

    /* renamed from: b */
    private void m7248b(RectF rectF, Path path) {
        m7279a(rectF, path);
        if (this.f10066c.f10100j != 1.0f) {
            this.f10071h.reset();
            this.f10071h.setScale(this.f10066c.f10100j, this.f10066c.f10100j, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f10071h);
        }
        path.computeBounds(this.f10086w, true);
    }

    /* renamed from: e */
    private boolean m7254e() {
        PorterDuffColorFilter porterDuffColorFilter = this.f10084u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f10085v;
        this.f10084u = m7238a(this.f10066c.f10097g, this.f10066c.f10098h, this.f10079p, true);
        this.f10085v = m7238a(this.f10066c.f10096f, this.f10066c.f10098h, this.f10080q, false);
        if (this.f10066c.f10111u) {
            this.f10081r.m7222a(this.f10066c.f10097g.getColorForState(getState(), 0));
        }
        return (C0472c.m1615a(porterDuffColorFilter, this.f10084u) && C0472c.m1615a(porterDuffColorFilter2, this.f10085v)) ? false : true;
    }

    /* renamed from: a */
    private PorterDuffColorFilter m7238a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m7240a(paint, z);
        }
        return m7239a(colorStateList, mode, z);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m7240a(Paint paint, boolean z) {
        int color2;
        int m7237a;
        if (!z || (m7237a = m7237a((color2 = paint.getColor()))) == color2) {
            return null;
        }
        return new PorterDuffColorFilter(m7237a, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m7239a(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m7237a(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        if (this.f10066c.f10097g != null && this.f10066c.f10097g.isStateful()) {
            return true;
        }
        if (this.f10066c.f10096f != null && this.f10066c.f10096f.isStateful()) {
            return true;
        }
        if (this.f10066c.f10095e == null || !this.f10066c.f10095e.isStateful()) {
            return this.f10066c.f10094d != null && this.f10066c.f10094d.isStateful();
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.InterfaceC2240ai
    public boolean onStateChange(int[] iArr) {
        boolean z = m7245a(iArr) || m7254e();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: a */
    private boolean m7245a(int[] iArr) {
        boolean z;
        int color2;
        int colorForState;
        int color3;
        int colorForState2;
        if (this.f10066c.f10094d == null || color3 == (colorForState2 = this.f10066c.f10094d.getColorForState(iArr, (color3 = this.f10079p.getColor())))) {
            z = false;
        } else {
            this.f10079p.setColor(colorForState2);
            z = true;
        }
        if (this.f10066c.f10095e == null || color2 == (colorForState = this.f10066c.f10095e.getColorForState(iArr, (color2 = this.f10080q.getColor())))) {
            return z;
        }
        this.f10080q.setColor(colorForState);
        return true;
    }

    /* renamed from: f */
    private float m7255f() {
        if (m7250c()) {
            return this.f10080q.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: g */
    private RectF m7256g() {
        this.f10075l.set(m7261O());
        float m7255f = m7255f();
        this.f10075l.inset(m7255f, m7255f);
        return this.f10075l;
    }

    /* renamed from: W */
    public final float m7269W() {
        return this.f10066c.f10091a.f10122f.mo7225a(m7261O());
    }

    /* renamed from: X */
    public final float m7270X() {
        return this.f10066c.f10091a.f10123g.mo7225a(m7261O());
    }

    /* renamed from: Y */
    public final float m7271Y() {
        return this.f10066c.f10091a.f10125i.mo7225a(m7261O());
    }

    /* renamed from: Z */
    public final float m7272Z() {
        return this.f10066c.f10091a.f10124h.mo7225a(m7261O());
    }

    /* renamed from: aa */
    public final boolean m7280aa() {
        return this.f10066c.f10091a.m7303a(m7261O());
    }

    /* renamed from: a */
    private float m7236a() {
        return this.f10066c.f10105o + this.f10066c.f10106p;
    }
}
