package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.core.graphics.C0542a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.graphics.drawable.InterfaceC0547b;
import androidx.core.p022e.C0454a;
import com.coloros.neton.BuildConfig;
import com.google.android.material.internal.C2238ag;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.InterfaceC2240ai;
import com.google.android.material.p072a.C2039h;
import com.google.android.material.p075d.C2129a;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p079h.C2222e;
import com.google.android.material.p080i.C2229c;
import com.google.android.material.p082k.C2295h;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: ChipDrawable.java */
/* renamed from: com.google.android.material.chip.d */
/* loaded from: classes.dex */
public final class C2114d extends C2295h implements Drawable.Callback, InterfaceC0547b, InterfaceC2240ai {

    /* renamed from: a */
    private static final int[] f9439a = {R.attr.state_enabled};

    /* renamed from: b */
    private static final ShapeDrawable f9440b = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    private C2039h f9441A;

    /* renamed from: B */
    private float f9442B;

    /* renamed from: C */
    private float f9443C;

    /* renamed from: D */
    private float f9444D;

    /* renamed from: E */
    private float f9445E;

    /* renamed from: F */
    private float f9446F;

    /* renamed from: G */
    private float f9447G;

    /* renamed from: H */
    private float f9448H;

    /* renamed from: I */
    private float f9449I;

    /* renamed from: J */
    private final Context f9450J;

    /* renamed from: K */
    private final Paint f9451K;

    /* renamed from: L */
    private final Paint f9452L;

    /* renamed from: M */
    private final Paint.FontMetrics f9453M;

    /* renamed from: N */
    private final RectF f9454N;

    /* renamed from: O */
    private final PointF f9455O;

    /* renamed from: P */
    private final Path f9456P;

    /* renamed from: Q */
    private final C2238ag f9457Q;

    /* renamed from: R */
    private int f9458R;

    /* renamed from: S */
    private int f9459S;

    /* renamed from: T */
    private int f9460T;

    /* renamed from: U */
    private int f9461U;

    /* renamed from: V */
    private int f9462V;

    /* renamed from: W */
    private int f9463W;

    /* renamed from: X */
    private boolean f9464X;

    /* renamed from: Y */
    private int f9465Y;

    /* renamed from: Z */
    private int f9466Z;

    /* renamed from: aa */
    private ColorFilter f9467aa;

    /* renamed from: ab */
    private PorterDuffColorFilter f9468ab;

    /* renamed from: ac */
    private ColorStateList f9469ac;

    /* renamed from: ad */
    private PorterDuff.Mode f9470ad;

    /* renamed from: ae */
    private int[] f9471ae;

    /* renamed from: af */
    private boolean f9472af;

    /* renamed from: ag */
    private ColorStateList f9473ag;

    /* renamed from: ah */
    private WeakReference<InterfaceC2115e> f9474ah;

    /* renamed from: ai */
    private TextUtils.TruncateAt f9475ai;

    /* renamed from: aj */
    private boolean f9476aj;

    /* renamed from: ak */
    private int f9477ak;

    /* renamed from: al */
    private boolean f9478al;

    /* renamed from: c */
    private ColorStateList f9479c;

    /* renamed from: d */
    private ColorStateList f9480d;

    /* renamed from: e */
    private float f9481e;

    /* renamed from: f */
    private float f9482f;

    /* renamed from: g */
    private ColorStateList f9483g;

    /* renamed from: h */
    private float f9484h;

    /* renamed from: i */
    private ColorStateList f9485i;

    /* renamed from: j */
    private CharSequence f9486j;

    /* renamed from: k */
    private boolean f9487k;

    /* renamed from: l */
    private Drawable f9488l;

    /* renamed from: m */
    private ColorStateList f9489m;

    /* renamed from: n */
    private float f9490n;

    /* renamed from: o */
    private boolean f9491o;

    /* renamed from: p */
    private boolean f9492p;

    /* renamed from: q */
    private Drawable f9493q;

    /* renamed from: r */
    private Drawable f9494r;

    /* renamed from: s */
    private ColorStateList f9495s;

    /* renamed from: t */
    private float f9496t;

    /* renamed from: u */
    private CharSequence f9497u;

    /* renamed from: v */
    private boolean f9498v;

    /* renamed from: w */
    private boolean f9499w;

    /* renamed from: x */
    private Drawable f9500x;

    /* renamed from: y */
    private ColorStateList f9501y;

    /* renamed from: z */
    private C2039h f9502z;

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    public static C2114d m6648a(Context context, AttributeSet attributeSet, int i, int i2) {
        C2114d c2114d = new C2114d(context, attributeSet, i, i2);
        TypedArray m7095a = C2243al.m7095a(c2114d.f9450J, attributeSet, com.google.android.material.R.styleable.Chip, i, i2, new int[0]);
        c2114d.f9478al = m7095a.hasValue(com.google.android.material.R.styleable.Chip_shapeAppearance);
        ColorStateList m7045a = C2221d.m7045a(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_chipSurfaceColor);
        if (c2114d.f9479c != m7045a) {
            c2114d.f9479c = m7045a;
            c2114d.onStateChange(c2114d.getState());
        }
        c2114d.m6682a(C2221d.m7045a(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_chipBackgroundColor));
        c2114d.m6680a(m7095a.getDimension(com.google.android.material.R.styleable.Chip_chipMinHeight, 0.0f));
        if (m7095a.hasValue(com.google.android.material.R.styleable.Chip_chipCornerRadius)) {
            c2114d.m6693b(m7095a.getDimension(com.google.android.material.R.styleable.Chip_chipCornerRadius, 0.0f));
        }
        c2114d.m6695b(C2221d.m7045a(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_chipStrokeColor));
        c2114d.m6701c(m7095a.getDimension(com.google.android.material.R.styleable.Chip_chipStrokeWidth, 0.0f));
        c2114d.m6703c(C2221d.m7045a(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_rippleColor));
        c2114d.m6689a(m7095a.getText(com.google.android.material.R.styleable.Chip_android_text));
        c2114d.m6688a(C2221d.m7048c(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_android_textAppearance));
        switch (m7095a.getInt(com.google.android.material.R.styleable.Chip_android_ellipsize, 0)) {
            case 1:
                c2114d.f9475ai = TextUtils.TruncateAt.START;
                break;
            case 2:
                c2114d.f9475ai = TextUtils.TruncateAt.MIDDLE;
                break;
            case 3:
                c2114d.f9475ai = TextUtils.TruncateAt.END;
                break;
        }
        c2114d.m6699b(m7095a.getBoolean(com.google.android.material.R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c2114d.m6699b(m7095a.getBoolean(com.google.android.material.R.styleable.Chip_chipIconEnabled, false));
        }
        c2114d.m6684a(C2221d.m7047b(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_chipIcon));
        if (m7095a.hasValue(com.google.android.material.R.styleable.Chip_chipIconTint)) {
            c2114d.m6709d(C2221d.m7045a(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_chipIconTint));
        }
        c2114d.m6707d(m7095a.getDimension(com.google.android.material.R.styleable.Chip_chipIconSize, 0.0f));
        c2114d.m6705c(m7095a.getBoolean(com.google.android.material.R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c2114d.m6705c(m7095a.getBoolean(com.google.android.material.R.styleable.Chip_closeIconEnabled, false));
        }
        c2114d.m6696b(C2221d.m7047b(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_closeIcon));
        c2114d.m6713e(C2221d.m7045a(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_closeIconTint));
        c2114d.m6711e(m7095a.getDimension(com.google.android.material.R.styleable.Chip_closeIconSize, 0.0f));
        c2114d.m6710d(m7095a.getBoolean(com.google.android.material.R.styleable.Chip_android_checkable, false));
        c2114d.m6714e(m7095a.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c2114d.m6714e(m7095a.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconEnabled, false));
        }
        c2114d.m6704c(C2221d.m7047b(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_checkedIcon));
        if (m7095a.hasValue(com.google.android.material.R.styleable.Chip_checkedIconTint)) {
            c2114d.m6719f(C2221d.m7045a(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_checkedIconTint));
        }
        c2114d.f9502z = C2039h.m6246a(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_showMotionSpec);
        c2114d.f9441A = C2039h.m6246a(c2114d.f9450J, m7095a, com.google.android.material.R.styleable.Chip_hideMotionSpec);
        c2114d.m6717f(m7095a.getDimension(com.google.android.material.R.styleable.Chip_chipStartPadding, 0.0f));
        c2114d.m6721g(m7095a.getDimension(com.google.android.material.R.styleable.Chip_iconStartPadding, 0.0f));
        c2114d.m6724h(m7095a.getDimension(com.google.android.material.R.styleable.Chip_iconEndPadding, 0.0f));
        c2114d.m6727i(m7095a.getDimension(com.google.android.material.R.styleable.Chip_textStartPadding, 0.0f));
        c2114d.m6730j(m7095a.getDimension(com.google.android.material.R.styleable.Chip_textEndPadding, 0.0f));
        c2114d.m6733k(m7095a.getDimension(com.google.android.material.R.styleable.Chip_closeIconStartPadding, 0.0f));
        c2114d.m6736l(m7095a.getDimension(com.google.android.material.R.styleable.Chip_closeIconEndPadding, 0.0f));
        c2114d.m6739m(m7095a.getDimension(com.google.android.material.R.styleable.Chip_chipEndPadding, 0.0f));
        c2114d.f9477ak = m7095a.getDimensionPixelSize(com.google.android.material.R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE);
        m7095a.recycle();
        return c2114d;
    }

    private C2114d(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9482f = -1.0f;
        this.f9451K = new Paint(1);
        this.f9453M = new Paint.FontMetrics();
        this.f9454N = new RectF();
        this.f9455O = new PointF();
        this.f9456P = new Path();
        this.f9466Z = 255;
        this.f9470ad = PorterDuff.Mode.SRC_IN;
        this.f9474ah = new WeakReference<>(null);
        m7276a(context);
        this.f9450J = context;
        this.f9457Q = new C2238ag(this);
        this.f9486j = BuildConfig.FLAVOR;
        this.f9457Q.m7089a().density = context.getResources().getDisplayMetrics().density;
        this.f9452L = null;
        if (this.f9452L != null) {
            this.f9452L.setStyle(Paint.Style.STROKE);
        }
        setState(f9439a);
        m6692a(f9439a);
        this.f9476aj = true;
        if (C2229c.f9843a) {
            f9440b.setTint(-1);
        }
    }

    /* renamed from: a */
    public final void m6690a(boolean z) {
        if (this.f9472af != z) {
            this.f9472af = z;
            m6657ah();
            onStateChange(getState());
        }
    }

    /* renamed from: a */
    public final boolean m6691a() {
        return this.f9472af;
    }

    /* renamed from: a */
    public final void m6687a(InterfaceC2115e interfaceC2115e) {
        this.f9474ah = new WeakReference<>(interfaceC2115e);
    }

    /* renamed from: ab */
    private void m6651ab() {
        InterfaceC2115e interfaceC2115e = this.f9474ah.get();
        if (interfaceC2115e != null) {
            interfaceC2115e.mo6632a();
        }
    }

    /* renamed from: a */
    public final void m6683a(RectF rectF) {
        m6661c(getBounds(), rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.f9442B + m6700c() + this.f9445E + this.f9457Q.m7088a(this.f9486j.toString()) + this.f9446F + m6706d() + this.f9449I), this.f9477ak);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f9481e;
    }

    /* renamed from: ac */
    private boolean m6652ac() {
        return this.f9487k && this.f9488l != null;
    }

    /* renamed from: ad */
    private boolean m6653ad() {
        return this.f9499w && this.f9500x != null && this.f9464X;
    }

    /* renamed from: ae */
    private boolean m6654ae() {
        return this.f9492p && this.f9493q != null;
    }

    /* renamed from: af */
    private boolean m6655af() {
        return this.f9499w && this.f9500x != null && this.f9498v;
    }

    /* renamed from: c */
    public final float m6700c() {
        if (m6652ac() || m6653ad()) {
            return this.f9443C + this.f9490n + this.f9444D;
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final float m6706d() {
        if (m6654ae()) {
            return this.f9447G + this.f9496t + this.f9448H;
        }
        return 0.0f;
    }

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        if (this.f9466Z < 255) {
            float f = bounds.left;
            float f2 = bounds.top;
            float f3 = bounds.right;
            float f4 = bounds.bottom;
            int i3 = this.f9466Z;
            if (Build.VERSION.SDK_INT > 21) {
                i = canvas.saveLayerAlpha(f, f2, f3, f4, i3);
            } else {
                i = canvas.saveLayerAlpha(f, f2, f3, f4, i3, 31);
            }
        } else {
            i = 0;
        }
        if (!this.f9478al) {
            this.f9451K.setColor(this.f9458R);
            this.f9451K.setStyle(Paint.Style.FILL);
            this.f9454N.set(bounds);
            canvas.drawRoundRect(this.f9454N, m6723h(), m6723h(), this.f9451K);
        }
        if (!this.f9478al) {
            this.f9451K.setColor(this.f9459S);
            this.f9451K.setStyle(Paint.Style.FILL);
            this.f9451K.setColorFilter(m6656ag());
            this.f9454N.set(bounds);
            canvas.drawRoundRect(this.f9454N, m6723h(), m6723h(), this.f9451K);
        }
        if (this.f9478al) {
            super.draw(canvas);
        }
        if (this.f9484h > 0.0f && !this.f9478al) {
            this.f9451K.setColor(this.f9461U);
            this.f9451K.setStyle(Paint.Style.STROKE);
            if (!this.f9478al) {
                this.f9451K.setColorFilter(m6656ag());
            }
            this.f9454N.set(bounds.left + (this.f9484h / 2.0f), bounds.top + (this.f9484h / 2.0f), bounds.right - (this.f9484h / 2.0f), bounds.bottom - (this.f9484h / 2.0f));
            float f5 = this.f9482f - (this.f9484h / 2.0f);
            canvas.drawRoundRect(this.f9454N, f5, f5, this.f9451K);
        }
        this.f9451K.setColor(this.f9462V);
        this.f9451K.setStyle(Paint.Style.FILL);
        this.f9454N.set(bounds);
        if (!this.f9478al) {
            canvas.drawRoundRect(this.f9454N, m6723h(), m6723h(), this.f9451K);
        } else {
            m7279a(new RectF(bounds), this.f9456P);
            super.m7277a(canvas, this.f9451K, this.f9456P, m7261O());
        }
        if (m6652ac()) {
            m6649a(bounds, this.f9454N);
            float f6 = this.f9454N.left;
            float f7 = this.f9454N.top;
            canvas.translate(f6, f7);
            this.f9488l.setBounds(0, 0, (int) this.f9454N.width(), (int) this.f9454N.height());
            this.f9488l.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (m6653ad()) {
            m6649a(bounds, this.f9454N);
            float f8 = this.f9454N.left;
            float f9 = this.f9454N.top;
            canvas.translate(f8, f9);
            this.f9500x.setBounds(0, 0, (int) this.f9454N.width(), (int) this.f9454N.height());
            this.f9500x.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (this.f9476aj && this.f9486j != null) {
            PointF pointF = this.f9455O;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.f9486j != null) {
                float m6700c = this.f9442B + m6700c() + this.f9445E;
                if (C0546a.m1935h(this) == 0) {
                    pointF.x = bounds.left + m6700c;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - m6700c;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                this.f9457Q.m7089a().getFontMetrics(this.f9453M);
                pointF.y = centerY - ((this.f9453M.descent + this.f9453M.ascent) / 2.0f);
            }
            RectF rectF = this.f9454N;
            rectF.setEmpty();
            if (this.f9486j != null) {
                float m6700c2 = this.f9442B + m6700c() + this.f9445E;
                float m6706d = this.f9449I + m6706d() + this.f9446F;
                if (C0546a.m1935h(this) == 0) {
                    rectF.left = bounds.left + m6700c2;
                    rectF.right = bounds.right - m6706d;
                } else {
                    rectF.left = bounds.left + m6706d;
                    rectF.right = bounds.right - m6700c2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            if (this.f9457Q.m7093c() != null) {
                this.f9457Q.m7089a().drawableState = getState();
                this.f9457Q.m7090a(this.f9450J);
            }
            this.f9457Q.m7089a().setTextAlign(align);
            boolean z = Math.round(this.f9457Q.m7088a(this.f9486j.toString())) > Math.round(this.f9454N.width());
            if (z) {
                i2 = canvas.save();
                canvas.clipRect(this.f9454N);
            } else {
                i2 = 0;
            }
            CharSequence charSequence = this.f9486j;
            if (z && this.f9475ai != null) {
                charSequence = TextUtils.ellipsize(this.f9486j, this.f9457Q.m7089a(), this.f9454N.width(), this.f9475ai);
            }
            CharSequence charSequence2 = charSequence;
            canvas.drawText(charSequence2, 0, charSequence2.length(), this.f9455O.x, this.f9455O.y, this.f9457Q.m7089a());
            if (z) {
                canvas.restoreToCount(i2);
            }
        }
        if (m6654ae()) {
            m6659b(bounds, this.f9454N);
            float f10 = this.f9454N.left;
            float f11 = this.f9454N.top;
            canvas.translate(f10, f11);
            this.f9493q.setBounds(0, 0, (int) this.f9454N.width(), (int) this.f9454N.height());
            if (C2229c.f9843a) {
                this.f9494r.setBounds(this.f9493q.getBounds());
                this.f9494r.jumpToCurrentState();
                this.f9494r.draw(canvas);
            } else {
                this.f9493q.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
        if (this.f9452L != null) {
            this.f9452L.setColor(C0542a.m1904b(-16777216, 127));
            canvas.drawRect(bounds, this.f9452L);
            if (m6652ac() || m6653ad()) {
                m6649a(bounds, this.f9454N);
                canvas.drawRect(this.f9454N, this.f9452L);
            }
            if (this.f9486j != null) {
                canvas.drawLine(bounds.left, bounds.exactCenterY(), bounds.right, bounds.exactCenterY(), this.f9452L);
            }
            if (m6654ae()) {
                m6659b(bounds, this.f9454N);
                canvas.drawRect(this.f9454N, this.f9452L);
            }
            this.f9452L.setColor(C0542a.m1904b(-65536, 127));
            RectF rectF2 = this.f9454N;
            rectF2.set(bounds);
            if (m6654ae()) {
                float f12 = this.f9449I + this.f9448H + this.f9496t + this.f9447G + this.f9446F;
                if (C0546a.m1935h(this) == 0) {
                    rectF2.right = bounds.right - f12;
                } else {
                    rectF2.left = bounds.left + f12;
                }
            }
            canvas.drawRect(this.f9454N, this.f9452L);
            this.f9452L.setColor(C0542a.m1904b(-16711936, 127));
            m6661c(bounds, this.f9454N);
            canvas.drawRect(this.f9454N, this.f9452L);
        }
        if (this.f9466Z < 255) {
            canvas.restoreToCount(i);
        }
    }

    /* renamed from: a */
    private void m6649a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m6652ac() || m6653ad()) {
            float f = this.f9442B + this.f9443C;
            if (C0546a.m1935h(this) == 0) {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + this.f9490n;
            } else {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - this.f9490n;
            }
            rectF.top = rect.exactCenterY() - (this.f9490n / 2.0f);
            rectF.bottom = rectF.top + this.f9490n;
        }
    }

    /* renamed from: b */
    private void m6659b(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m6654ae()) {
            float f = this.f9449I + this.f9448H;
            if (C0546a.m1935h(this) == 0) {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - this.f9496t;
            } else {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + this.f9496t;
            }
            rectF.top = rect.exactCenterY() - (this.f9496t / 2.0f);
            rectF.bottom = rectF.top + this.f9496t;
        }
    }

    /* renamed from: c */
    private void m6661c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m6654ae()) {
            float f = this.f9449I + this.f9448H + this.f9496t + this.f9447G + this.f9446F;
            if (C0546a.m1935h(this) == 0) {
                rectF.right = rect.right;
                rectF.left = rectF.right - f;
            } else {
                rectF.left = rect.left;
                rectF.right = rect.left + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!m6665i(this.f9479c) && !m6665i(this.f9480d) && !m6665i(this.f9483g) && (!this.f9472af || !m6665i(this.f9473ag))) {
            C2222e m7093c = this.f9457Q.m7093c();
            if (!((m7093c == null || m7093c.f9820b == null || !m7093c.f9820b.isStateful()) ? false : true) && !m6655af() && !m6662d(this.f9488l) && !m6662d(this.f9500x) && !m6665i(this.f9469ac)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m6715e() {
        return m6662d(this.f9493q);
    }

    /* renamed from: a */
    public final boolean m6692a(int[] iArr) {
        if (Arrays.equals(this.f9471ae, iArr)) {
            return false;
        }
        this.f9471ae = iArr;
        if (m6654ae()) {
            return m6650a(getState(), iArr);
        }
        return false;
    }

    @Override // com.google.android.material.internal.InterfaceC2240ai
    /* renamed from: b */
    public final void mo6359b() {
        m6651ab();
        invalidateSelf();
    }

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable, com.google.android.material.internal.InterfaceC2240ai
    public final boolean onStateChange(int[] iArr) {
        if (this.f9478al) {
            super.onStateChange(iArr);
        }
        return m6650a(iArr, this.f9471ae);
    }

    /* renamed from: a */
    private boolean m6650a(int[] iArr, int[] iArr2) {
        boolean z;
        boolean onStateChange = super.onStateChange(iArr);
        int colorForState = this.f9479c != null ? this.f9479c.getColorForState(iArr, this.f9458R) : 0;
        if (this.f9458R != colorForState) {
            this.f9458R = colorForState;
            onStateChange = true;
        }
        int colorForState2 = this.f9480d != null ? this.f9480d.getColorForState(iArr, this.f9459S) : 0;
        if (this.f9459S != colorForState2) {
            this.f9459S = colorForState2;
            onStateChange = true;
        }
        int m1900a = C0542a.m1900a(colorForState2, colorForState);
        if ((this.f9460T != m1900a) | (m7259M() == null)) {
            this.f9460T = m1900a;
            m7282g(ColorStateList.valueOf(this.f9460T));
            onStateChange = true;
        }
        int colorForState3 = this.f9483g != null ? this.f9483g.getColorForState(iArr, this.f9461U) : 0;
        if (this.f9461U != colorForState3) {
            this.f9461U = colorForState3;
            onStateChange = true;
        }
        int colorForState4 = (this.f9473ag == null || !C2229c.m7065a(iArr)) ? 0 : this.f9473ag.getColorForState(iArr, this.f9462V);
        if (this.f9462V != colorForState4) {
            this.f9462V = colorForState4;
            if (this.f9472af) {
                onStateChange = true;
            }
        }
        int colorForState5 = (this.f9457Q.m7093c() == null || this.f9457Q.m7093c().f9820b == null) ? 0 : this.f9457Q.m7093c().f9820b.getColorForState(iArr, this.f9463W);
        if (this.f9463W != colorForState5) {
            this.f9463W = colorForState5;
            onStateChange = true;
        }
        boolean z2 = m6660b(getState()) && this.f9498v;
        if (this.f9464X == z2 || this.f9500x == null) {
            z = false;
        } else {
            float m6700c = m6700c();
            this.f9464X = z2;
            if (m6700c != m6700c()) {
                onStateChange = true;
                z = true;
            } else {
                z = false;
                onStateChange = true;
            }
        }
        int colorForState6 = this.f9469ac != null ? this.f9469ac.getColorForState(iArr, this.f9465Y) : 0;
        if (this.f9465Y != colorForState6) {
            this.f9465Y = colorForState6;
            this.f9468ab = C2129a.m6789a(this, this.f9469ac, this.f9470ad);
            onStateChange = true;
        }
        if (m6662d(this.f9488l)) {
            onStateChange |= this.f9488l.setState(iArr);
        }
        if (m6662d(this.f9500x)) {
            onStateChange |= this.f9500x.setState(iArr);
        }
        if (m6662d(this.f9493q)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            onStateChange |= this.f9493q.setState(iArr3);
        }
        if (C2229c.f9843a && m6662d(this.f9494r)) {
            onStateChange |= this.f9494r.setState(iArr2);
        }
        if (onStateChange) {
            invalidateSelf();
        }
        if (z) {
            m6651ab();
        }
        return onStateChange;
    }

    /* renamed from: i */
    private static boolean m6665i(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: d */
    private static boolean m6662d(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m6652ac()) {
            onLayoutDirectionChanged |= C0546a.m1929b(this.f9488l, i);
        }
        if (m6653ad()) {
            onLayoutDirectionChanged |= C0546a.m1929b(this.f9500x, i);
        }
        if (m6654ae()) {
            onLayoutDirectionChanged |= C0546a.m1929b(this.f9493q, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m6652ac()) {
            onLevelChange |= this.f9488l.setLevel(i);
        }
        if (m6653ad()) {
            onLevelChange |= this.f9500x.setLevel(i);
        }
        if (m6654ae()) {
            onLevelChange |= this.f9493q.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m6652ac()) {
            visible |= this.f9488l.setVisible(z, z2);
        }
        if (m6653ad()) {
            visible |= this.f9500x.setVisible(z, z2);
        }
        if (m6654ae()) {
            visible |= this.f9493q.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f9466Z != i) {
            this.f9466Z = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9466Z;
    }

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f9467aa != colorFilter) {
            this.f9467aa = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f9467aa;
    }

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f9469ac != colorStateList) {
            this.f9469ac = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0547b
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f9470ad != mode) {
            this.f9470ad = mode;
            this.f9468ab = C2129a.m6789a(this, this.f9469ac, mode);
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.p082k.C2295h, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f9478al) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f9482f);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f9482f);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: e */
    private static void m6663e(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: f */
    private void m6664f(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C0546a.m1929b(drawable, C0546a.m1935h(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f9493q) {
            if (drawable.isStateful()) {
                drawable.setState(this.f9471ae);
            }
            C0546a.m1922a(drawable, this.f9495s);
        } else {
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            if (drawable == this.f9488l && this.f9491o) {
                C0546a.m1922a(this.f9488l, this.f9489m);
            }
        }
    }

    /* renamed from: ag */
    private ColorFilter m6656ag() {
        return this.f9467aa != null ? this.f9467aa : this.f9468ab;
    }

    /* renamed from: ah */
    private void m6657ah() {
        this.f9473ag = this.f9472af ? C2229c.m7066b(this.f9485i) : null;
    }

    /* renamed from: b */
    private static boolean m6660b(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == 16842912) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final ColorStateList m6716f() {
        return this.f9480d;
    }

    /* renamed from: a */
    public final void m6681a(int i) {
        m6682a(C0057a.m45a(this.f9450J, i));
    }

    /* renamed from: a */
    public final void m6682a(ColorStateList colorStateList) {
        if (this.f9480d != colorStateList) {
            this.f9480d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: g */
    public final float m6720g() {
        return this.f9481e;
    }

    /* renamed from: b */
    public final void m6694b(int i) {
        m6680a(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: a */
    public final void m6680a(float f) {
        if (this.f9481e != f) {
            this.f9481e = f;
            invalidateSelf();
            m6651ab();
        }
    }

    /* renamed from: h */
    public final float m6723h() {
        return this.f9478al ? m7269W() : this.f9482f;
    }

    @Deprecated
    /* renamed from: c */
    public final void m6702c(int i) {
        m6693b(this.f9450J.getResources().getDimension(i));
    }

    @Deprecated
    /* renamed from: b */
    public final void m6693b(float f) {
        if (this.f9482f != f) {
            this.f9482f = f;
            setShapeAppearanceModel(m7258L().m7302a(f));
        }
    }

    /* renamed from: i */
    public final ColorStateList m6726i() {
        return this.f9483g;
    }

    /* renamed from: d */
    public final void m6708d(int i) {
        m6695b(C0057a.m45a(this.f9450J, i));
    }

    /* renamed from: b */
    public final void m6695b(ColorStateList colorStateList) {
        if (this.f9483g != colorStateList) {
            this.f9483g = colorStateList;
            if (this.f9478al) {
                m7283h(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: j */
    public final float m6729j() {
        return this.f9484h;
    }

    /* renamed from: e */
    public final void m6712e(int i) {
        m6701c(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: c */
    public final void m6701c(float f) {
        if (this.f9484h != f) {
            this.f9484h = f;
            this.f9451K.setStrokeWidth(f);
            if (this.f9478al) {
                super.m7284n(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: k */
    public final ColorStateList m6732k() {
        return this.f9485i;
    }

    /* renamed from: f */
    public final void m6718f(int i) {
        m6703c(C0057a.m45a(this.f9450J, i));
    }

    /* renamed from: c */
    public final void m6703c(ColorStateList colorStateList) {
        if (this.f9485i != colorStateList) {
            this.f9485i = colorStateList;
            m6657ah();
            onStateChange(getState());
        }
    }

    /* renamed from: l */
    public final CharSequence m6735l() {
        return this.f9486j;
    }

    /* renamed from: a */
    public final void m6689a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (TextUtils.equals(this.f9486j, charSequence)) {
            return;
        }
        this.f9486j = charSequence;
        this.f9457Q.m7092b();
        invalidateSelf();
        m6651ab();
    }

    /* renamed from: m */
    public final C2222e m6738m() {
        return this.f9457Q.m7093c();
    }

    /* renamed from: g */
    public final void m6722g(int i) {
        m6688a(new C2222e(this.f9450J, i));
    }

    /* renamed from: a */
    public final void m6688a(C2222e c2222e) {
        this.f9457Q.m7091a(c2222e, this.f9450J);
    }

    /* renamed from: n */
    public final TextUtils.TruncateAt m6741n() {
        return this.f9475ai;
    }

    /* renamed from: a */
    public final void m6685a(TextUtils.TruncateAt truncateAt) {
        this.f9475ai = truncateAt;
    }

    /* renamed from: h */
    public final void m6725h(int i) {
        m6699b(this.f9450J.getResources().getBoolean(i));
    }

    /* renamed from: b */
    public final void m6699b(boolean z) {
        if (this.f9487k != z) {
            boolean m6652ac = m6652ac();
            this.f9487k = z;
            boolean m6652ac2 = m6652ac();
            if (m6652ac != m6652ac2) {
                if (m6652ac2) {
                    m6664f(this.f9488l);
                } else {
                    m6663e(this.f9488l);
                }
                invalidateSelf();
                m6651ab();
            }
        }
    }

    /* renamed from: o */
    public final Drawable m6743o() {
        if (this.f9488l != null) {
            return C0546a.m1934g(this.f9488l);
        }
        return null;
    }

    /* renamed from: i */
    public final void m6728i(int i) {
        m6684a(C0057a.m46b(this.f9450J, i));
    }

    /* renamed from: a */
    public final void m6684a(Drawable drawable) {
        Drawable m6743o = m6743o();
        if (m6743o != drawable) {
            float m6700c = m6700c();
            this.f9488l = drawable != null ? C0546a.m1933f(drawable).mutate() : null;
            float m6700c2 = m6700c();
            m6663e(m6743o);
            if (m6652ac()) {
                m6664f(this.f9488l);
            }
            invalidateSelf();
            if (m6700c != m6700c2) {
                m6651ab();
            }
        }
    }

    /* renamed from: p */
    public final ColorStateList m6745p() {
        return this.f9489m;
    }

    /* renamed from: j */
    public final void m6731j(int i) {
        m6709d(C0057a.m45a(this.f9450J, i));
    }

    /* renamed from: d */
    public final void m6709d(ColorStateList colorStateList) {
        this.f9491o = true;
        if (this.f9489m != colorStateList) {
            this.f9489m = colorStateList;
            if (m6652ac()) {
                C0546a.m1922a(this.f9488l, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: q */
    public final float m6747q() {
        return this.f9490n;
    }

    /* renamed from: k */
    public final void m6734k(int i) {
        m6707d(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: d */
    public final void m6707d(float f) {
        if (this.f9490n != f) {
            float m6700c = m6700c();
            this.f9490n = f;
            float m6700c2 = m6700c();
            invalidateSelf();
            if (m6700c != m6700c2) {
                m6651ab();
            }
        }
    }

    /* renamed from: r */
    public final boolean m6750r() {
        return this.f9492p;
    }

    /* renamed from: c */
    public final void m6705c(boolean z) {
        if (this.f9492p != z) {
            boolean m6654ae = m6654ae();
            this.f9492p = z;
            boolean m6654ae2 = m6654ae();
            if (m6654ae != m6654ae2) {
                if (m6654ae2) {
                    m6664f(this.f9493q);
                } else {
                    m6663e(this.f9493q);
                }
                invalidateSelf();
                m6651ab();
            }
        }
    }

    /* renamed from: s */
    public final Drawable m6751s() {
        if (this.f9493q != null) {
            return C0546a.m1934g(this.f9493q);
        }
        return null;
    }

    /* renamed from: l */
    public final void m6737l(int i) {
        m6696b(C0057a.m46b(this.f9450J, i));
    }

    /* renamed from: b */
    public final void m6696b(Drawable drawable) {
        Drawable m6751s = m6751s();
        if (m6751s != drawable) {
            float m6706d = m6706d();
            this.f9493q = drawable != null ? C0546a.m1933f(drawable).mutate() : null;
            if (C2229c.f9843a) {
                m6658ai();
            }
            float m6706d2 = m6706d();
            m6663e(m6751s);
            if (m6654ae()) {
                m6664f(this.f9493q);
            }
            invalidateSelf();
            if (m6706d != m6706d2) {
                m6651ab();
            }
        }
    }

    @TargetApi(21)
    /* renamed from: ai */
    private void m6658ai() {
        this.f9494r = new RippleDrawable(C2229c.m7066b(this.f9485i), this.f9493q, f9440b);
    }

    /* renamed from: t */
    public final ColorStateList m6753t() {
        return this.f9495s;
    }

    /* renamed from: m */
    public final void m6740m(int i) {
        m6713e(C0057a.m45a(this.f9450J, i));
    }

    /* renamed from: e */
    public final void m6713e(ColorStateList colorStateList) {
        if (this.f9495s != colorStateList) {
            this.f9495s = colorStateList;
            if (m6654ae()) {
                C0546a.m1922a(this.f9493q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: u */
    public final float m6755u() {
        return this.f9496t;
    }

    /* renamed from: n */
    public final void m6742n(int i) {
        m6711e(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: e */
    public final void m6711e(float f) {
        if (this.f9496t != f) {
            this.f9496t = f;
            invalidateSelf();
            if (m6654ae()) {
                m6651ab();
            }
        }
    }

    /* renamed from: b */
    public final void m6698b(CharSequence charSequence) {
        if (this.f9497u != charSequence) {
            this.f9497u = C0454a.m1578a().m1583a(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: v */
    public final CharSequence m6757v() {
        return this.f9497u;
    }

    /* renamed from: w */
    public final boolean m6760w() {
        return this.f9498v;
    }

    /* renamed from: o */
    public final void m6744o(int i) {
        m6710d(this.f9450J.getResources().getBoolean(i));
    }

    /* renamed from: d */
    public final void m6710d(boolean z) {
        if (this.f9498v != z) {
            this.f9498v = z;
            float m6700c = m6700c();
            if (!z && this.f9464X) {
                this.f9464X = false;
            }
            float m6700c2 = m6700c();
            invalidateSelf();
            if (m6700c != m6700c2) {
                m6651ab();
            }
        }
    }

    /* renamed from: p */
    public final void m6746p(int i) {
        m6714e(this.f9450J.getResources().getBoolean(i));
    }

    /* renamed from: e */
    public final void m6714e(boolean z) {
        if (this.f9499w != z) {
            boolean m6653ad = m6653ad();
            this.f9499w = z;
            boolean m6653ad2 = m6653ad();
            if (m6653ad != m6653ad2) {
                if (m6653ad2) {
                    m6664f(this.f9500x);
                } else {
                    m6663e(this.f9500x);
                }
                invalidateSelf();
                m6651ab();
            }
        }
    }

    /* renamed from: x */
    public final Drawable m6761x() {
        return this.f9500x;
    }

    /* renamed from: q */
    public final void m6748q(int i) {
        m6704c(C0057a.m46b(this.f9450J, i));
    }

    /* renamed from: c */
    public final void m6704c(Drawable drawable) {
        if (this.f9500x != drawable) {
            float m6700c = m6700c();
            this.f9500x = drawable;
            float m6700c2 = m6700c();
            m6663e(this.f9500x);
            m6664f(this.f9500x);
            invalidateSelf();
            if (m6700c != m6700c2) {
                m6651ab();
            }
        }
    }

    /* renamed from: y */
    public final ColorStateList m6763y() {
        return this.f9501y;
    }

    /* renamed from: r */
    public final void m6749r(int i) {
        m6719f(C0057a.m45a(this.f9450J, i));
    }

    /* renamed from: f */
    public final void m6719f(ColorStateList colorStateList) {
        if (this.f9501y != colorStateList) {
            this.f9501y = colorStateList;
            if (m6655af()) {
                C0546a.m1922a(this.f9500x, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: z */
    public final C2039h m6765z() {
        return this.f9502z;
    }

    /* renamed from: s */
    public final void m6752s(int i) {
        this.f9502z = C2039h.m6245a(this.f9450J, i);
    }

    /* renamed from: a */
    public final void m6686a(C2039h c2039h) {
        this.f9502z = c2039h;
    }

    /* renamed from: A */
    public final C2039h m6666A() {
        return this.f9441A;
    }

    /* renamed from: t */
    public final void m6754t(int i) {
        this.f9441A = C2039h.m6245a(this.f9450J, i);
    }

    /* renamed from: b */
    public final void m6697b(C2039h c2039h) {
        this.f9441A = c2039h;
    }

    /* renamed from: B */
    public final float m6668B() {
        return this.f9442B;
    }

    /* renamed from: u */
    public final void m6756u(int i) {
        m6717f(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: f */
    public final void m6717f(float f) {
        if (this.f9442B != f) {
            this.f9442B = f;
            invalidateSelf();
            m6651ab();
        }
    }

    /* renamed from: C */
    public final float m6670C() {
        return this.f9443C;
    }

    /* renamed from: v */
    public final void m6758v(int i) {
        m6721g(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: g */
    public final void m6721g(float f) {
        if (this.f9443C != f) {
            float m6700c = m6700c();
            this.f9443C = f;
            float m6700c2 = m6700c();
            invalidateSelf();
            if (m6700c != m6700c2) {
                m6651ab();
            }
        }
    }

    /* renamed from: D */
    public final float m6672D() {
        return this.f9444D;
    }

    /* renamed from: w */
    public final void m6759w(int i) {
        m6724h(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: h */
    public final void m6724h(float f) {
        if (this.f9444D != f) {
            float m6700c = m6700c();
            this.f9444D = f;
            float m6700c2 = m6700c();
            invalidateSelf();
            if (m6700c != m6700c2) {
                m6651ab();
            }
        }
    }

    /* renamed from: E */
    public final float m6673E() {
        return this.f9445E;
    }

    /* renamed from: x */
    public final void m6762x(int i) {
        m6727i(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: i */
    public final void m6727i(float f) {
        if (this.f9445E != f) {
            this.f9445E = f;
            invalidateSelf();
            m6651ab();
        }
    }

    /* renamed from: F */
    public final float m6674F() {
        return this.f9446F;
    }

    /* renamed from: y */
    public final void m6764y(int i) {
        m6730j(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: j */
    public final void m6730j(float f) {
        if (this.f9446F != f) {
            this.f9446F = f;
            invalidateSelf();
            m6651ab();
        }
    }

    /* renamed from: G */
    public final float m6675G() {
        return this.f9447G;
    }

    /* renamed from: z */
    public final void m6766z(int i) {
        m6733k(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: k */
    public final void m6733k(float f) {
        if (this.f9447G != f) {
            this.f9447G = f;
            invalidateSelf();
            if (m6654ae()) {
                m6651ab();
            }
        }
    }

    /* renamed from: H */
    public final float m6676H() {
        return this.f9448H;
    }

    /* renamed from: A */
    public final void m6667A(int i) {
        m6736l(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: l */
    public final void m6736l(float f) {
        if (this.f9448H != f) {
            this.f9448H = f;
            invalidateSelf();
            if (m6654ae()) {
                m6651ab();
            }
        }
    }

    /* renamed from: I */
    public final float m6677I() {
        return this.f9449I;
    }

    /* renamed from: B */
    public final void m6669B(int i) {
        m6739m(this.f9450J.getResources().getDimension(i));
    }

    /* renamed from: m */
    public final void m6739m(float f) {
        if (this.f9449I != f) {
            this.f9449I = f;
            invalidateSelf();
            m6651ab();
        }
    }

    /* renamed from: C */
    public final void m6671C(int i) {
        this.f9477ak = i;
    }

    /* renamed from: J */
    public final boolean m6678J() {
        return this.f9476aj;
    }

    /* renamed from: K */
    public final void m6679K() {
        this.f9476aj = false;
    }
}
