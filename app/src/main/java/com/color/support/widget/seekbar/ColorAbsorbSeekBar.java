package com.color.support.widget.seekbar;

import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
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
import android.view.ViewGroup;
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
import java.util.Arrays;

/* loaded from: classes.dex */
public class ColorAbsorbSeekBar extends View {

    /* renamed from: A */
    private C1600h f7581A;

    /* renamed from: B */
    private RunnableC1598f f7582B;

    /* renamed from: C */
    private float f7583C;

    /* renamed from: D */
    private final C1875f f7584D;

    /* renamed from: E */
    private final C1879j f7585E;

    /* renamed from: F */
    private C1881l f7586F;

    /* renamed from: G */
    private VelocityTracker f7587G;

    /* renamed from: H */
    private float f7588H;

    /* renamed from: I */
    private int f7589I;

    /* renamed from: J */
    private AnimatorSet f7590J;

    /* renamed from: K */
    private int f7591K;

    /* renamed from: L */
    private int f7592L;

    /* renamed from: M */
    private int f7593M;

    /* renamed from: a */
    private final String f7594a;

    /* renamed from: b */
    private int f7595b;

    /* renamed from: c */
    private float f7596c;

    /* renamed from: d */
    private InterfaceC1599g f7597d;

    /* renamed from: e */
    private int f7598e;

    /* renamed from: f */
    private int f7599f;

    /* renamed from: g */
    private boolean f7600g;

    /* renamed from: h */
    private ColorStateList f7601h;

    /* renamed from: i */
    private int f7602i;

    /* renamed from: j */
    private float f7603j;

    /* renamed from: k */
    private ColorStateList f7604k;

    /* renamed from: l */
    private ColorStateList f7605l;

    /* renamed from: m */
    private float f7606m;

    /* renamed from: n */
    private float f7607n;

    /* renamed from: o */
    private float f7608o;

    /* renamed from: p */
    private float f7609p;

    /* renamed from: q */
    private float f7610q;

    /* renamed from: r */
    private RectF f7611r;

    /* renamed from: s */
    private float f7612s;

    /* renamed from: t */
    private Paint f7613t;

    /* renamed from: u */
    private float f7614u;

    /* renamed from: v */
    private float[] f7615v;

    /* renamed from: w */
    private float f7616w;

    /* renamed from: x */
    private boolean f7617x;

    /* renamed from: y */
    private boolean f7618y;

    /* renamed from: z */
    private ValueAnimator f7619z;

    public ColorAbsorbSeekBar(Context context) {
        this(context, null);
    }

    public ColorAbsorbSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorAbsorbSeekBarStyle);
    }

    public ColorAbsorbSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7594a = getClass().getSimpleName();
        this.f7595b = 0;
        this.f7598e = 0;
        this.f7599f = 100;
        this.f7600g = false;
        this.f7611r = new RectF();
        this.f7614u = 0.009f;
        this.f7584D = C1885p.m6031b();
        this.f7585E = this.f7584D.m6006a();
        this.f7586F = C1881l.m6027a(500.0d, 30.0d);
        this.f7590J = new AnimatorSet();
        C1338c.m4375a(this, false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorAbsorbSeekBar, i, 0);
        this.f7601h = obtainStyledAttributes.getColorStateList(R.styleable.ColorAbsorbSeekBar_colorAbsorbSeekBarThumbColor);
        this.f7602i = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorAbsorbSeekBar_colorAbsorbSeekBarThumbRadius, (int) m5344b(4.0f));
        this.f7603j = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorAbsorbSeekBar_colorAbsorbSeekBarThumbScaleRadius, (int) m5344b(3.67f));
        this.f7607n = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorAbsorbSeekBar_colorAbsorbSeekBarProgressRadius, (int) m5344b(6.0f));
        this.f7608o = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorAbsorbSeekBar_colorAbsorbSeekBarProgressScaleRadius, (int) m5344b(7.0f));
        if (Build.VERSION.SDK_INT >= 23) {
            this.f7604k = obtainStyledAttributes.getColorStateList(R.styleable.ColorAbsorbSeekBar_colorAbsorbSeekBarProgressColor);
        } else {
            this.f7604k = C1346k.m4404a(C1337b.m4374a(context, R.attr.colorTintControlNormal), getResources().getColor(R.color.color_seekbar_progress_color_disabled));
        }
        this.f7605l = obtainStyledAttributes.getColorStateList(R.styleable.ColorAbsorbSeekBar_colorAbsorbSeekBarBackgroundColor);
        this.f7606m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorAbsorbSeekBar_colorAbsorbSeekBarBackgroundRadius, (int) m5344b(1.0f));
        this.f7591K = obtainStyledAttributes.getColor(R.styleable.ColorAbsorbSeekBar_colorAbsorbSeekBarBackgroundHighlightColor, getResources().getColor(R.color.color_seekbar_background_highlight_color));
        this.f7592L = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ColorAbsorbSeekBar_colorAbsorbSeekBarThumbShadowRadius, (int) m5344b(14.0f));
        this.f7593M = obtainStyledAttributes.getColor(R.styleable.ColorAbsorbSeekBar_colorAbsorbSeekBarThumbShadowColor, getResources().getColor(R.color.color_seekbar_thumb_shadow_color));
        obtainStyledAttributes.recycle();
        this.f7595b = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f7581A = new C1600h(this, this);
        C0538w.m1849a(this, this.f7581A);
        if (Build.VERSION.SDK_INT >= 16) {
            C0538w.m1840a((View) this, 1);
        }
        this.f7581A.m2071a();
        this.f7613t = new Paint();
        this.f7613t.setAntiAlias(true);
        this.f7613t.setDither(true);
        this.f7609p = this.f7607n;
        this.f7610q = this.f7602i;
        this.f7588H = this.f7606m;
        this.f7589I = 0;
        m5341a();
    }

    /* renamed from: a */
    private void m5341a() {
        this.f7585E.m6016a(this.f7586F);
        this.f7585E.m6017a(new C1593a(this));
        this.f7590J.setInterpolator(C0517b.m1773a(0.3f, 0.0f, 0.1f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f7606m, this.f7606m * 2.0f);
        ofFloat.setDuration(115L);
        ofFloat.addUpdateListener(new C1594b(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f7606m * 2.0f, this.f7606m);
        ofFloat2.setStartDelay(115L);
        ofFloat2.setDuration(87L);
        ofFloat2.addUpdateListener(new C1595c(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f7592L);
        ofInt.setDuration(202L);
        ofInt.addUpdateListener(new C1596d(this));
        this.f7590J.play(ofFloat).with(ofFloat2).with(ofInt);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int round = Math.round(this.f7592L * 2);
        if (mode != 1073741824) {
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
        float start;
        boolean isLayoutRtl = isLayoutRtl();
        this.f7613t.setColor(C1617y.m5417a(this, this.f7605l));
        float start2 = (getStart() + this.f7592L) - this.f7606m;
        float width = ((getWidth() - getEnd()) - this.f7592L) + this.f7606m;
        float width2 = ((getWidth() - getEnd()) - (this.f7592L * 2)) - getStart();
        this.f7611r.set(start2, (getHeight() >> 1) - this.f7588H, width, (getHeight() >> 1) + this.f7588H);
        canvas.drawRoundRect(this.f7611r, this.f7588H, this.f7588H, this.f7613t);
        if (this.f7617x) {
            this.f7616w = (this.f7598e / this.f7599f) * width2;
            this.f7617x = false;
        }
        if (isLayoutRtl) {
            start = ((getStart() + this.f7592L) + width2) - ((this.f7598e * width2) / this.f7599f);
        } else {
            start = getStart() + this.f7592L + ((this.f7598e * width2) / this.f7599f);
        }
        float max = Math.max(getStart() + this.f7592L, Math.min(getStart() + this.f7592L + width2, start));
        Paint paint = this.f7613t;
        ColorStateList colorStateList = this.f7604k;
        int i = C1617y.f7732b;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(getDrawableState(), i);
        }
        paint.setColor(i);
        float f = max - this.f7589I;
        float f2 = this.f7589I + max;
        float f3 = max - this.f7610q;
        float f4 = this.f7610q + max;
        float f5 = max - this.f7609p;
        float f6 = max + this.f7609p;
        float f7 = this.f7583C * this.f7603j * 2.0f * 2.0f;
        if (this.f7583C > 0.0f) {
            f -= f7;
            f3 -= f7;
            f5 -= f7;
        } else {
            f2 -= f7;
            f4 -= f7;
            f6 -= f7;
        }
        float f8 = f;
        float f9 = f2;
        this.f7613t.setColor(this.f7593M);
        canvas.drawRoundRect(f8, (getHeight() >> 1) - this.f7589I, f9, (getHeight() >> 1) + this.f7589I, this.f7589I, this.f7589I, this.f7613t);
        this.f7613t.setColor(C1617y.m5418a(this, this.f7604k, C1617y.f7732b));
        canvas.drawRoundRect(f5, (getHeight() >> 1) - this.f7609p, f6, (getHeight() >> 1) + this.f7609p, this.f7609p, this.f7609p, this.f7613t);
        this.f7613t.setColor(C1617y.m5418a(this, this.f7601h, -1));
        canvas.drawRoundRect(f3, (getHeight() >> 1) - this.f7610q, f4, (getHeight() >> 1) + this.f7610q, this.f7610q, this.f7610q, this.f7613t);
    }

    public float getThumbCenter() {
        float start;
        float width = ((getWidth() - getEnd()) - (this.f7592L * 2)) - getStart();
        if (isLayoutRtl()) {
            start = ((getStart() + this.f7592L) + width) - this.f7616w;
        } else {
            start = getStart() + this.f7592L + this.f7616w;
        }
        return Math.max(getStart() + this.f7592L, Math.min(getStart() + this.f7592L + width, start));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f7600g = false;
                this.f7596c = motionEvent.getX();
                this.f7612s = motionEvent.getX();
                this.f7587G = VelocityTracker.obtain();
                this.f7587G.addMovement(motionEvent);
                return true;
            case 1:
            case 3:
                this.f7585E.m6015a(0.0d);
                if (!this.f7600g) {
                    if (C1617y.m5419a(motionEvent, this)) {
                        this.f7600g = true;
                        m5343a(motionEvent);
                        this.f7600g = false;
                    }
                } else {
                    this.f7600g = false;
                    setPressed(false);
                }
                m5347b();
                return true;
            case 2:
                this.f7587G.addMovement(motionEvent);
                if (this.f7600g) {
                    if (!this.f7618y) {
                        m5348b(motionEvent);
                        this.f7612s = motionEvent.getX();
                    } else {
                        float x = motionEvent.getX();
                        if (Math.abs(x - this.f7612s) > this.f7595b) {
                            this.f7618y = false;
                            this.f7612s = x;
                            m5348b(motionEvent);
                        }
                    }
                } else {
                    if (!C1617y.m5419a(motionEvent, this)) {
                        return false;
                    }
                    float x2 = motionEvent.getX();
                    if (Math.abs(x2 - this.f7596c) > this.f7595b) {
                        setPressed(true);
                        this.f7600g = true;
                        if (getParent() instanceof ViewGroup) {
                            ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
                        }
                        m5343a(motionEvent);
                        if (this.f7590J.isRunning()) {
                            this.f7590J.cancel();
                        }
                        this.f7590J.start();
                        this.f7612s = x2;
                    }
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: a */
    private void m5343a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float start = getStart() + this.f7592L;
        float width = (getWidth() - getEnd()) - this.f7592L;
        float f = width - start;
        if (isLayoutRtl()) {
            if (this.f7616w > width) {
                this.f7616w = 0.0f;
            } else if (x < start) {
                this.f7616w = f;
            } else {
                this.f7616w = (f - x) + start;
            }
        } else if (x < start) {
            this.f7616w = 0.0f;
        } else if (x > width) {
            this.f7616w = f;
        } else {
            this.f7616w = x - start;
        }
        this.f7598e = Math.round((this.f7616w * this.f7599f) / f);
        invalidate();
    }

    /* renamed from: b */
    private void m5348b(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = x - this.f7612s;
        if (isLayoutRtl()) {
            f = -f;
        }
        float width = ((getWidth() - getEnd()) - this.f7592L) - (getStart() + this.f7592L);
        this.f7616w += f;
        this.f7616w = Math.max(0.0f, Math.min(width, this.f7616w));
        if (this.f7615v != null) {
            float f2 = this.f7614u * width;
            boolean isLayoutRtl = isLayoutRtl();
            int i = 0;
            boolean z = x - this.f7612s > 0.0f;
            boolean z2 = x - this.f7612s < 0.0f;
            float[] fArr = this.f7615v;
            int length = fArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                float f3 = fArr[i] * width;
                if (isLayoutRtl) {
                    f3 = width - f3;
                }
                if (this.f7616w < f3 - f2 || this.f7616w > f3 + f2) {
                    i++;
                } else if (isLayoutRtl) {
                    if (z && this.f7616w > f3) {
                        this.f7616w = f3;
                        this.f7618y = true;
                    } else if (z2 && this.f7616w < f3) {
                        this.f7616w = f3;
                        this.f7618y = true;
                    }
                } else if (z && this.f7616w < f3) {
                    this.f7616w = f3;
                    this.f7618y = true;
                } else if (z2 && this.f7616w > f3) {
                    this.f7616w = f3;
                    this.f7618y = true;
                }
            }
        }
        this.f7598e = Math.round((this.f7616w * this.f7599f) / width);
        invalidate();
        this.f7587G.computeCurrentVelocity(100);
        m5342a(this.f7587G.getXVelocity());
    }

    /* renamed from: a */
    private void m5342a(float f) {
        if (f >= 95.0f) {
            this.f7585E.m6015a(1.0d);
        } else if (f <= -95.0f) {
            this.f7585E.m6015a(-1.0d);
        } else {
            this.f7585E.m6015a(0.0d);
        }
    }

    /* renamed from: b */
    private float m5344b(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    private void m5347b() {
        if (this.f7619z == null) {
            this.f7619z = new ValueAnimator();
        }
        this.f7590J.cancel();
        this.f7619z.cancel();
        this.f7619z.setValues(PropertyValuesHolder.ofFloat("radiusIn", this.f7610q, this.f7602i), PropertyValuesHolder.ofFloat("radiusOut", this.f7609p, this.f7607n), PropertyValuesHolder.ofInt("thumbShadowRadius", this.f7589I, 0), PropertyValuesHolder.ofFloat("backgroundRadius", this.f7588H, this.f7606m));
        this.f7619z.setDuration(120L);
        if (Build.VERSION.SDK_INT > 21) {
            this.f7619z.setInterpolator(C0517b.m1773a(0.0f, 0.0f, 0.2f, 1.0f));
        }
        this.f7619z.addUpdateListener(new C1597e(this));
        this.f7619z.start();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        if (this.f7582B != null) {
            removeCallbacks(this.f7582B);
        }
        super.onDetachedFromWindow();
    }

    public void setProgress(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("progress must be greater than zero");
        }
        this.f7598e = i;
        this.f7617x = true;
        invalidate();
    }

    public int getProgress() {
        return this.f7598e;
    }

    public int getMax() {
        return this.f7599f;
    }

    public void setMax(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("max cannot be greater than max");
        }
        if (this.f7598e > i) {
            throw new IllegalArgumentException("progress cannot be greater than max");
        }
        this.f7599f = i;
    }

    public void setOnSeekBarChangeListener(InterfaceC1599g interfaceC1599g) {
        this.f7597d = interfaceC1599g;
    }

    public void setAbsorbRatio(float f) {
        this.f7614u = f;
    }

    public void setAbsorbValues(float... fArr) {
        if (fArr == null) {
            return;
        }
        this.f7615v = Arrays.copyOf(fArr, fArr.length);
    }

    public boolean isLayoutRtl() {
        return Build.VERSION.SDK_INT > 16 && getLayoutDirection() == 1;
    }

    public void setBackgroundRadius(float f) {
        this.f7606m = f;
        m5341a();
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m5347b();
        super.setEnabled(z);
    }
}
