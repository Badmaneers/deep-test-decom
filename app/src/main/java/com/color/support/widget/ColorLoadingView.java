package com.color.support.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.p024g.C0538w;
import color.support.p043v7.appcompat.R;
import com.color.support.p048c.p049a.C1310a;
import com.color.support.p048c.p049a.InterfaceC1311b;
import com.color.support.util.C1337b;
import com.color.support.util.C1338c;

/* loaded from: classes.dex */
public class ColorLoadingView extends View {

    /* renamed from: a */
    private static final String f6163a = "ColorLoadingView";

    /* renamed from: A */
    private int f6164A;

    /* renamed from: B */
    private RectF f6165B;

    /* renamed from: C */
    private float f6166C;

    /* renamed from: D */
    private float f6167D;

    /* renamed from: E */
    private InterfaceC1311b f6168E;

    /* renamed from: b */
    private float[] f6169b;

    /* renamed from: c */
    private int f6170c;

    /* renamed from: d */
    private int f6171d;

    /* renamed from: e */
    private int f6172e;

    /* renamed from: f */
    private int f6173f;

    /* renamed from: g */
    private int f6174g;

    /* renamed from: h */
    private int f6175h;

    /* renamed from: i */
    private int f6176i;

    /* renamed from: j */
    private int f6177j;

    /* renamed from: k */
    private int f6178k;

    /* renamed from: l */
    private int f6179l;

    /* renamed from: m */
    private Paint f6180m;

    /* renamed from: n */
    private float f6181n;

    /* renamed from: o */
    private float f6182o;

    /* renamed from: p */
    private float f6183p;

    /* renamed from: q */
    private ValueAnimator f6184q;

    /* renamed from: r */
    private C1310a f6185r;

    /* renamed from: s */
    private String f6186s;

    /* renamed from: t */
    private float f6187t;

    /* renamed from: u */
    private float f6188u;

    /* renamed from: v */
    private boolean f6189v;

    /* renamed from: w */
    private boolean f6190w;

    /* renamed from: x */
    private Paint f6191x;

    /* renamed from: y */
    private int f6192y;

    /* renamed from: z */
    private int f6193z;

    public ColorLoadingView(Context context) {
        this(context, null);
    }

    public ColorLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorLoadingViewStyle);
    }

    public ColorLoadingView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, R.attr.colorLoadingViewStyle, 0);
    }

    public ColorLoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f6169b = new float[6];
        this.f6172e = 0;
        this.f6173f = 0;
        this.f6174g = 1;
        this.f6178k = 0;
        this.f6179l = 0;
        this.f6183p = 60.0f;
        this.f6186s = null;
        this.f6187t = 0.1f;
        this.f6188u = 0.4f;
        this.f6189v = false;
        this.f6190w = false;
        this.f6168E = new C1393bh(this);
        C1338c.m4375a(this, false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.colorLoadingView, i, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.color_loading_view_default_length);
        this.f6172e = obtainStyledAttributes.getDimensionPixelSize(R.styleable.colorLoadingView_colorLoadingViewWidth, dimensionPixelSize);
        this.f6173f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.colorLoadingView_colorLoadingViewHeight, dimensionPixelSize);
        this.f6174g = obtainStyledAttributes.getInteger(R.styleable.colorLoadingView_colorLoadingViewType, 1);
        int m4374a = C1337b.m4374a(context, R.attr.colorTintControlNormal);
        int m4374a2 = C1337b.m4374a(context, R.attr.colorTintLightNormal);
        this.f6170c = obtainStyledAttributes.getColor(R.styleable.colorLoadingView_colorLoadingViewColor, m4374a);
        this.f6171d = obtainStyledAttributes.getColor(R.styleable.colorLoadingView_colorLoadingViewBgCircleColor, m4374a2);
        obtainStyledAttributes.recycle();
        this.f6175h = context.getResources().getDimensionPixelSize(R.dimen.color_circle_loading_strokewidth);
        this.f6176i = context.getResources().getDimensionPixelSize(R.dimen.color_circle_loading_medium_strokewidth);
        this.f6177j = context.getResources().getDimensionPixelSize(R.dimen.color_circle_loading_large_strokewidth);
        this.f6178k = this.f6175h;
        if (1 == this.f6174g) {
            this.f6178k = this.f6176i;
            this.f6187t = 0.1f;
            this.f6188u = 0.4f;
        } else if (2 == this.f6174g) {
            this.f6178k = this.f6177j;
            this.f6187t = 0.215f;
            this.f6188u = 1.0f;
        }
        this.f6179l = this.f6178k >> 1;
        this.f6181n = this.f6172e >> 1;
        this.f6182o = this.f6173f >> 1;
        this.f6185r = new C1310a(this);
        this.f6185r.m4289a(this.f6168E);
        C0538w.m1849a(this, this.f6185r);
        C0538w.m1840a((View) this, 1);
        this.f6186s = context.getString(R.string.color_loading_view_access_string);
        this.f6180m = new Paint(1);
        this.f6180m.setStyle(Paint.Style.STROKE);
        this.f6180m.setColor(this.f6170c);
        this.f6180m.setStrokeWidth(this.f6178k);
        this.f6180m.setStrokeCap(Paint.Cap.ROUND);
        this.f6191x = new Paint(1);
        this.f6191x.setColor(this.f6171d);
        this.f6191x.setStyle(Paint.Style.STROKE);
        this.f6191x.setStrokeWidth(this.f6178k);
    }

    /* renamed from: a */
    private void m4526a() {
        this.f6184q = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6184q.setDuration(480L);
        this.f6184q.setInterpolator(new LinearInterpolator());
        this.f6184q.addUpdateListener(new C1394bi(this));
        this.f6184q.setRepeatMode(1);
        this.f6184q.setRepeatCount(-1);
        this.f6184q.setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f6189v) {
            m4526a();
            this.f6189v = true;
        }
        if (this.f6190w) {
            return;
        }
        m4528b();
        this.f6190w = true;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6184q != null) {
            this.f6184q.cancel();
            this.f6184q.removeAllListeners();
            this.f6184q.removeAllUpdateListeners();
            this.f6184q = null;
        }
        this.f6189v = false;
        this.f6190w = false;
    }

    /* renamed from: b */
    private void m4528b() {
        if (this.f6184q != null) {
            if (this.f6184q.isRunning()) {
                this.f6184q.cancel();
            }
            this.f6184q.start();
        }
    }

    /* renamed from: c */
    private void m4530c() {
        if (this.f6184q != null) {
            this.f6184q.cancel();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view instanceof ColorLoadingView) {
            if (i == 0) {
                if (!this.f6189v) {
                    m4526a();
                    this.f6189v = true;
                }
                if (this.f6190w) {
                    return;
                }
                m4528b();
                this.f6190w = true;
                return;
            }
            m4530c();
            this.f6190w = false;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f6172e, this.f6173f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f6167D = (this.f6167D + 6.0f) % 360.0f;
        canvas.drawCircle(this.f6193z, this.f6193z, this.f6166C, this.f6191x);
        canvas.save();
        canvas.rotate(-90.0f, this.f6193z, this.f6164A);
        if (this.f6165B == null) {
            m4531d();
        }
        canvas.drawArc(this.f6165B, this.f6167D - 30.0f, (2.0f - Math.abs((180.0f - this.f6167D) / 180.0f)) * 60.0f, false, this.f6180m);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f6165B == null) {
            m4531d();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m4531d();
    }

    /* renamed from: d */
    private void m4531d() {
        this.f6192y = this.f6178k / 2;
        this.f6193z = getWidth() / 2;
        this.f6164A = getHeight() / 2;
        this.f6166C = this.f6193z - this.f6192y;
        this.f6165B = new RectF(this.f6193z - this.f6166C, this.f6193z - this.f6166C, this.f6193z + this.f6166C, this.f6193z + this.f6166C);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            m4528b();
        } else {
            m4530c();
        }
    }
}
