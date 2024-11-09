package com.color.support.widget.seekbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p026b.C0517b;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1337b;
import com.color.support.util.C1338c;
import com.color.support.util.C1346k;
import com.facebook.rebound.C1875f;
import com.facebook.rebound.C1879j;
import com.facebook.rebound.C1881l;
import com.facebook.rebound.C1885p;

/* loaded from: classes.dex */
public class ColorSeekBar extends View {

    /* renamed from: A */
    private int f7662A;

    /* renamed from: B */
    private C1616x f7663B;

    /* renamed from: C */
    private RunnableC1614v f7664C;

    /* renamed from: D */
    private AccessibilityManager f7665D;

    /* renamed from: E */
    private RectF f7666E;

    /* renamed from: F */
    private AnimatorSet f7667F;

    /* renamed from: G */
    private int f7668G;

    /* renamed from: H */
    private float f7669H;

    /* renamed from: I */
    private float f7670I;

    /* renamed from: J */
    private float f7671J;

    /* renamed from: K */
    private int f7672K;

    /* renamed from: L */
    private int f7673L;

    /* renamed from: M */
    private int f7674M;

    /* renamed from: N */
    private float f7675N;

    /* renamed from: O */
    private float f7676O;

    /* renamed from: P */
    private final C1875f f7677P;

    /* renamed from: Q */
    private final C1879j f7678Q;

    /* renamed from: R */
    private C1881l f7679R;

    /* renamed from: S */
    private VelocityTracker f7680S;

    /* renamed from: a */
    private final String f7681a;

    /* renamed from: b */
    private int f7682b;

    /* renamed from: c */
    private float f7683c;

    /* renamed from: d */
    private InterfaceC1615w f7684d;

    /* renamed from: e */
    private int f7685e;

    /* renamed from: f */
    private int f7686f;

    /* renamed from: g */
    private int f7687g;

    /* renamed from: h */
    private boolean f7688h;

    /* renamed from: i */
    private boolean f7689i;

    /* renamed from: j */
    private ColorStateList f7690j;

    /* renamed from: k */
    private float f7691k;

    /* renamed from: l */
    private float f7692l;

    /* renamed from: m */
    private ColorStateList f7693m;

    /* renamed from: n */
    private ColorStateList f7694n;

    /* renamed from: o */
    private ColorStateList f7695o;

    /* renamed from: p */
    private float f7696p;

    /* renamed from: q */
    private float f7697q;

    /* renamed from: r */
    private float f7698r;

    /* renamed from: s */
    private float f7699s;

    /* renamed from: t */
    private float f7700t;

    /* renamed from: u */
    private RectF f7701u;

    /* renamed from: v */
    private RectF f7702v;

    /* renamed from: w */
    private RectF f7703w;

    /* renamed from: x */
    private float f7704x;

    /* renamed from: y */
    private Paint f7705y;

    /* renamed from: z */
    private ValueAnimator f7706z;

    public ColorSeekBar(Context context) {
        this(context, null);
    }

    public ColorSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorSeekBarStyle);
    }

    public ColorSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7681a = getClass().getSimpleName();
        this.f7682b = 0;
        this.f7685e = 0;
        this.f7686f = 0;
        this.f7687g = 100;
        this.f7688h = false;
        this.f7689i = false;
        this.f7701u = new RectF();
        this.f7702v = new RectF();
        this.f7703w = new RectF();
        this.f7666E = new RectF();
        this.f7667F = new AnimatorSet();
        this.f7677P = C1885p.m6031b();
        this.f7678Q = this.f7677P.m6006a();
        this.f7679R = C1881l.m6027a(500.0d, 30.0d);
        C1338c.m4375a(this, false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorSeekBar, i, 0);
        this.f7690j = obtainStyledAttributes.getColorStateList(R.styleable.ColorSeekBar_colorSeekBarThumbColor);
        this.f7691k = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSeekBar_colorSeekBarThumbInRadius, (int) m5397a(4.0f));
        this.f7692l = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSeekBar_colorSeekBarThumbInScaleRadius, (int) m5397a(3.67f));
        this.f7669H = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSeekBar_colorSeekBarThumbOutRadius, (int) m5397a(6.0f));
        this.f7670I = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSeekBar_colorSeekBarThumbOutScaleRadius, (int) m5397a(7.0f));
        this.f7698r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSeekBar_colorSeekBarProgressScaleRadius, (int) m5397a(2.0f));
        if (Build.VERSION.SDK_INT >= 23) {
            this.f7693m = obtainStyledAttributes.getColorStateList(R.styleable.ColorSeekBar_colorSeekBarProgressColor);
        } else {
            this.f7693m = C1346k.m4404a(C1337b.m4374a(context, R.attr.colorTintControlNormal), getResources().getColor(R.color.color_seekbar_progress_color_disabled));
        }
        this.f7697q = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSeekBar_colorSeekBarProgressRadius, (int) m5397a(1.0f));
        this.f7695o = obtainStyledAttributes.getColorStateList(R.styleable.ColorSeekBar_colorSeekBarBackgroundColor);
        this.f7696p = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSeekBar_colorSeekBarBackgroundRadius, (int) m5397a(1.0f));
        this.f7694n = obtainStyledAttributes.getColorStateList(R.styleable.ColorSeekBar_colorSeekBarSecondaryProgressColor);
        this.f7668G = obtainStyledAttributes.getColor(R.styleable.ColorSeekBar_colorSeekBarBackgroundHighlightColor, getResources().getColor(R.color.color_seekbar_background_highlight_color));
        this.f7673L = obtainStyledAttributes.getColor(R.styleable.ColorSeekBar_colorSeekBarThumbShadowColor, getResources().getColor(R.color.color_seekbar_thumb_shadow_color));
        this.f7672K = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ColorSeekBar_colorSeekBarThumbShadowRadius, (int) m5397a(14.0f));
        obtainStyledAttributes.recycle();
        this.f7682b = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f7663B = new C1616x(this, this);
        C0538w.m1849a(this, this.f7663B);
        if (Build.VERSION.SDK_INT >= 16) {
            C0538w.m1840a((View) this, 1);
        }
        this.f7663B.m2071a();
        this.f7665D = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f7705y = new Paint();
        this.f7705y.setAntiAlias(true);
        this.f7705y.setDither(true);
        this.f7699s = this.f7697q;
        this.f7700t = this.f7691k;
        this.f7671J = this.f7669H;
        this.f7675N = this.f7696p;
        this.f7674M = 0;
        m5402a();
    }

    /* renamed from: a */
    private void m5402a() {
        this.f7678Q.m6016a(this.f7679R);
        this.f7678Q.m6017a(new C1609q(this));
        this.f7667F.setInterpolator(C0517b.m1773a(0.3f, 0.0f, 0.1f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f7696p, this.f7696p * 2.0f);
        ofFloat.setDuration(115L);
        ofFloat.addUpdateListener(new C1610r(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f7696p * 2.0f, this.f7696p);
        ofFloat2.setStartDelay(115L);
        ofFloat2.setDuration(87L);
        ofFloat2.addUpdateListener(new C1611s(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f7672K);
        ofInt.setDuration(202L);
        ofInt.addUpdateListener(new C1612t(this));
        this.f7667F.play(ofFloat).with(ofFloat2).with(ofInt);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        m5402a();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int round = Math.round(this.f7672K * 2) + getPaddingTop() + getPaddingBottom();
        if (1073741824 != mode || size < round) {
            size = round;
        }
        setMeasuredDimension(size2, size);
    }

    private int getStart() {
        return getPaddingLeft();
    }

    private int getEnd() {
        return getPaddingRight();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        this.f7705y.setColor(C1617y.m5417a(this, this.f7695o));
        float start = (getStart() + this.f7672K) - this.f7696p;
        float width = ((getWidth() - getEnd()) - this.f7672K) + this.f7696p;
        float width2 = ((getWidth() - getEnd()) - (this.f7672K * 2)) - getStart();
        this.f7701u.set(start, (getHeight() >> 1) - this.f7675N, width, (getHeight() >> 1) + this.f7675N);
        canvas.drawRoundRect(this.f7701u, this.f7675N, this.f7675N, this.f7705y);
        if (isLayoutRtl()) {
            f4 = getStart() + this.f7672K + width2;
            float f6 = f4 - ((this.f7685e * width2) / this.f7687g);
            f5 = f4 - ((this.f7686f * width2) / this.f7687g);
            f = f4;
            f3 = f6;
            f2 = f3;
        } else {
            float start2 = getStart() + this.f7672K;
            f = ((this.f7685e * width2) / this.f7687g) + start2;
            f2 = f;
            f3 = start2;
            f4 = start2 + ((this.f7686f * width2) / this.f7687g);
            f5 = f3;
        }
        this.f7705y.setColor(C1617y.m5418a(this, this.f7694n, C1617y.f7733c));
        this.f7703w.set(f5, this.f7701u.top, f4, this.f7701u.bottom);
        canvas.drawRect(this.f7703w, this.f7705y);
        if (isLayoutRtl()) {
            this.f7666E.set(width - (this.f7696p * 2.0f), this.f7701u.top, width, this.f7701u.bottom);
            canvas.drawArc(this.f7666E, -90.0f, 180.0f, true, this.f7705y);
            if (this.f7686f == this.f7687g) {
                this.f7666E.set(start, this.f7701u.top, (this.f7696p * 2.0f) + start, this.f7701u.bottom);
                canvas.drawArc(this.f7666E, 90.0f, 180.0f, true, this.f7705y);
            }
        } else {
            this.f7666E.set(start, this.f7701u.top, (this.f7696p * 2.0f) + start, this.f7701u.bottom);
            canvas.drawArc(this.f7666E, 90.0f, 180.0f, true, this.f7705y);
            if (this.f7686f == this.f7687g) {
                this.f7666E.set(width - (this.f7696p * 2.0f), this.f7701u.top, width, this.f7701u.bottom);
                canvas.drawArc(this.f7666E, -90.0f, 180.0f, true, this.f7705y);
            }
        }
        this.f7705y.setColor(C1617y.m5418a(this, this.f7693m, C1617y.f7732b));
        this.f7702v.set(f3, (getHeight() >> 1) - this.f7699s, f, (getHeight() >> 1) + this.f7699s);
        canvas.drawRect(this.f7702v, this.f7705y);
        if (isLayoutRtl()) {
            this.f7666E.set((width - this.f7696p) - this.f7699s, this.f7702v.top, (width - this.f7696p) + this.f7699s, this.f7702v.bottom);
            canvas.drawArc(this.f7666E, -90.0f, 180.0f, true, this.f7705y);
        } else {
            this.f7666E.set(f3 - this.f7699s, this.f7702v.top, f3 + this.f7699s, this.f7702v.bottom);
            canvas.drawArc(this.f7666E, 90.0f, 180.0f, true, this.f7705y);
        }
        float f7 = f2 - this.f7674M;
        float f8 = this.f7674M + f2;
        float f9 = f2 - this.f7700t;
        float f10 = this.f7700t + f2;
        float f11 = f2 - this.f7671J;
        float f12 = f2 + this.f7671J;
        float f13 = this.f7676O * this.f7692l * 2.0f * 2.0f;
        if (this.f7676O > 0.0f) {
            f7 -= f13;
            f9 -= f13;
            f11 -= f13;
        } else {
            f8 -= f13;
            f10 -= f13;
            f12 -= f13;
        }
        float f14 = f9;
        float f15 = f10;
        float f16 = f11;
        float f17 = f8;
        float f18 = f7;
        this.f7705y.setColor(this.f7673L);
        canvas.drawRoundRect(f18, (getHeight() >> 1) - this.f7674M, f17, (getHeight() >> 1) + this.f7674M, this.f7674M, this.f7674M, this.f7705y);
        this.f7705y.setColor(C1617y.m5418a(this, this.f7693m, C1617y.f7732b));
        canvas.drawRoundRect(f16, (getHeight() >> 1) - this.f7671J, f12, (getHeight() >> 1) + this.f7671J, this.f7671J, this.f7671J, this.f7705y);
        this.f7705y.setColor(C1617y.m5418a(this, this.f7690j, -1));
        canvas.drawRoundRect(f14, (getHeight() >> 1) - this.f7700t, f15, (getHeight() >> 1) + this.f7700t, this.f7700t, this.f7700t, this.f7705y);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.seekbar.ColorSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m5403a(MotionEvent motionEvent) {
        float width = ((getWidth() - getEnd()) - (this.f7672K * 2)) - getStart();
        if (isLayoutRtl()) {
            this.f7685e = this.f7687g - Math.round((this.f7687g * ((motionEvent.getX() - getStart()) - this.f7698r)) / width);
        } else {
            this.f7685e = Math.round((this.f7687g * ((motionEvent.getX() - getStart()) - this.f7698r)) / width);
        }
        this.f7685e = m5400a(this.f7685e);
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f7689i = false;
    }

    /* renamed from: a */
    private float m5397a(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    private int m5400a(int i) {
        return Math.max(0, Math.min(i, this.f7687g));
    }

    /* renamed from: b */
    private void m5406b() {
        this.f7688h = true;
        this.f7689i = true;
    }

    /* renamed from: c */
    private void m5409c() {
        this.f7688h = false;
        this.f7689i = false;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        if (this.f7664C != null) {
            removeCallbacks(this.f7664C);
        }
        super.onDetachedFromWindow();
    }

    public void setProgress(int i) {
        if (i >= 0) {
            this.f7685e = Math.max(0, Math.min(i, this.f7687g));
            invalidate();
        }
    }

    public int getProgress() {
        return this.f7685e;
    }

    public int getMax() {
        return this.f7687g;
    }

    public void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.f7687g) {
            this.f7687g = i;
            if (this.f7685e > i) {
                this.f7685e = i;
            }
        }
        invalidate();
    }

    public void setOnSeekBarChangeListener(InterfaceC1615w interfaceC1615w) {
        this.f7684d = interfaceC1615w;
    }

    public void setSecondaryProgress(int i) {
        if (i >= 0) {
            this.f7686f = Math.max(0, Math.min(i, this.f7687g));
            invalidate();
        }
    }

    public int getSecondaryProgress() {
        return this.f7686f;
    }

    public boolean isLayoutRtl() {
        return Build.VERSION.SDK_INT > 16 && getLayoutDirection() == 1;
    }

    public void setMoveType(int i) {
        this.f7662A = i;
    }
}
