package com.color.support.widget.seekbar;

import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p026b.C0517b;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1337b;
import com.color.support.util.C1338c;
import com.color.support.util.C1346k;
import com.oppo.util.ColorOSHapticFeedbackUtils;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class ColorSectionSeekBar extends View {

    /* renamed from: A */
    private ValueAnimator f7620A;

    /* renamed from: B */
    private float f7621B;

    /* renamed from: C */
    private float f7622C;

    /* renamed from: D */
    private float f7623D;

    /* renamed from: E */
    private AnimatorSet f7624E;

    /* renamed from: F */
    private float f7625F;

    /* renamed from: G */
    private int f7626G;

    /* renamed from: H */
    private int f7627H;

    /* renamed from: I */
    private int f7628I;

    /* renamed from: J */
    private int f7629J;

    /* renamed from: K */
    private float f7630K;

    /* renamed from: L */
    private int f7631L;

    /* renamed from: M */
    private float f7632M;

    /* renamed from: N */
    private boolean f7633N;

    /* renamed from: O */
    private boolean f7634O;

    /* renamed from: P */
    private boolean f7635P;

    /* renamed from: a */
    private final String f7636a;

    /* renamed from: b */
    private int f7637b;

    /* renamed from: c */
    private int f7638c;

    /* renamed from: d */
    private float f7639d;

    /* renamed from: e */
    private int f7640e;

    /* renamed from: f */
    private InterfaceC1607o f7641f;

    /* renamed from: g */
    private boolean f7642g;

    /* renamed from: h */
    private ColorStateList f7643h;

    /* renamed from: i */
    private int f7644i;

    /* renamed from: j */
    private int f7645j;

    /* renamed from: k */
    private ColorStateList f7646k;

    /* renamed from: l */
    private ColorStateList f7647l;

    /* renamed from: m */
    private ColorStateList f7648m;

    /* renamed from: n */
    private int f7649n;

    /* renamed from: o */
    private int f7650o;

    /* renamed from: p */
    private int f7651p;

    /* renamed from: q */
    private float f7652q;

    /* renamed from: r */
    private float f7653r;

    /* renamed from: s */
    private RectF f7654s;

    /* renamed from: t */
    private float f7655t;

    /* renamed from: u */
    private int f7656u;

    /* renamed from: v */
    private float f7657v;

    /* renamed from: w */
    private Paint f7658w;

    /* renamed from: x */
    private float f7659x;

    /* renamed from: y */
    private C1608p f7660y;

    /* renamed from: z */
    private ValueAnimator f7661z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static /* synthetic */ boolean m5389n(ColorSectionSeekBar colorSectionSeekBar) {
        colorSectionSeekBar.f7633N = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static /* synthetic */ boolean m5391p(ColorSectionSeekBar colorSectionSeekBar) {
        colorSectionSeekBar.f7634O = false;
        return false;
    }

    public ColorSectionSeekBar(Context context) {
        this(context, null);
    }

    public ColorSectionSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorSectionSeekBarStyle);
    }

    public ColorSectionSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7636a = getClass().getSimpleName();
        this.f7637b = 3;
        this.f7638c = 0;
        this.f7640e = 0;
        this.f7642g = false;
        this.f7654s = new RectF();
        this.f7656u = -1;
        this.f7657v = 0.0f;
        this.f7659x = -1.0f;
        this.f7624E = new AnimatorSet();
        this.f7633N = false;
        this.f7634O = false;
        C1338c.m4375a(this, false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorSectionSeekBar, i, 0);
        this.f7643h = obtainStyledAttributes.getColorStateList(R.styleable.ColorSectionSeekBar_colorSectionSeekBarThumbColor);
        this.f7644i = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSectionSeekBar_colorSectionSeekBarThumbRadius, (int) m5364b(4.0f));
        this.f7645j = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSectionSeekBar_colorSectionSeekBarThumbScaleRadius, (int) m5364b(3.67f));
        this.f7651p = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSectionSeekBar_colorSectionSeekBarProgressScaleRadius, (int) m5364b(2.0f));
        if (Build.VERSION.SDK_INT >= 23) {
            this.f7646k = obtainStyledAttributes.getColorStateList(R.styleable.ColorSectionSeekBar_colorSectionSeekBarProgressColor);
        } else {
            this.f7646k = C1346k.m4404a(C1337b.m4374a(context, R.attr.colorTintControlNormal), getResources().getColor(R.color.color_seekbar_progress_color_disabled));
        }
        this.f7650o = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSectionSeekBar_colorSectionSeekBarProgressRadius, (int) m5364b(1.0f));
        this.f7647l = obtainStyledAttributes.getColorStateList(R.styleable.ColorSectionSeekBar_colorSectionSeekBarBackgroundColor);
        this.f7649n = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSectionSeekBar_colorSectionSeekBarBackgroundRadius, (int) m5364b(1.0f));
        this.f7626G = obtainStyledAttributes.getColor(R.styleable.ColorSectionSeekBar_colorSectionSeekBarBackgroundHighlightColor, getResources().getColor(R.color.color_seekbar_background_highlight_color));
        this.f7627H = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ColorSectionSeekBar_colorSectionSeekBarThumbShadowRadius, (int) m5364b(14.0f));
        this.f7628I = obtainStyledAttributes.getColor(R.styleable.ColorSectionSeekBar_colorSectionSeekBarThumbShadowColor, getResources().getColor(R.color.color_seekbar_thumb_shadow_color));
        this.f7635P = obtainStyledAttributes.getBoolean(R.styleable.ColorSectionSeekBar_colorSectionMarkEnable, false);
        this.f7648m = obtainStyledAttributes.getColorStateList(R.styleable.ColorSectionSeekBar_colorSectionSeekBarTickMarkColor);
        obtainStyledAttributes.recycle();
        this.f7652q = this.f7650o;
        this.f7653r = this.f7644i;
        this.f7625F = this.f7649n;
        this.f7629J = 0;
        this.f7638c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f7658w = new Paint();
        this.f7658w.setAntiAlias(true);
        this.f7658w.setDither(true);
        this.f7660y = new C1608p(this, this);
        C0538w.m1849a(this, this.f7660y);
        if (Build.VERSION.SDK_INT >= 16) {
            C0538w.m1840a((View) this, 1);
        }
        this.f7660y.m2071a();
        this.f7624E.setInterpolator(C0517b.m1773a(0.3f, 0.0f, 0.1f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f7649n, this.f7649n * 2.0f);
        ofFloat.setDuration(115L);
        ofFloat.addUpdateListener(new C1601i(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f7649n * 2.0f, this.f7649n);
        ofFloat2.setStartDelay(115L);
        ofFloat2.setDuration(87L);
        ofFloat2.addUpdateListener(new C1602j(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f7627H);
        ofInt.setDuration(202L);
        ofInt.addUpdateListener(new C1603k(this));
        this.f7624E.play(ofFloat).with(ofFloat2).with(ofInt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getStart() {
        return getPaddingLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getEnd() {
        return getPaddingRight();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = (int) TypedValue.applyDimension(1, 252.0f, getResources().getDisplayMetrics());
        }
        if (mode2 != 1073741824) {
            size2 = (this.f7627H << 1) + getPaddingBottom() + getPaddingTop();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f7659x == -1.0f) {
            m5373c();
            this.f7621B = this.f7659x;
            this.f7622C = this.f7621B;
        }
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) >> 1);
        float start = getStart() + (this.f7627H - this.f7649n);
        float f = paddingTop;
        this.f7654s.set(start, f - this.f7625F, (getWidth() - getEnd()) - r1, this.f7625F + f);
        this.f7658w.setColor(C1617y.m5417a(this, this.f7647l));
        canvas.drawRoundRect(this.f7654s, this.f7625F, this.f7625F, this.f7658w);
        if (this.f7635P) {
            this.f7658w.setColor(C1617y.m5417a(this, this.f7648m));
            for (int i = 0; i <= this.f7637b; i++) {
                canvas.drawCircle(((i * this.f7654s.width()) / this.f7637b) + start, f, getResources().getDimensionPixelSize(R.dimen.color_section_seekbar_tick_mark_radius), this.f7658w);
            }
        }
        int start2 = getStart() + this.f7627H;
        this.f7658w.setColor(this.f7628I);
        float f2 = start2;
        canvas.drawCircle(this.f7659x + f2, f, this.f7629J, this.f7658w);
        this.f7658w.setColor(C1617y.m5418a(this, this.f7646k, C1617y.f7732b));
        canvas.drawCircle(this.f7659x + f2, f, this.f7652q, this.f7658w);
        this.f7658w.setColor(C1617y.m5418a(this, this.f7643h, -1));
        canvas.drawCircle(f2 + this.f7659x, f, this.f7653r, this.f7658w);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f7633N) {
                    this.f7633N = false;
                    this.f7642g = false;
                }
                this.f7639d = m5357a(motionEvent);
                return true;
            case 1:
            case 3:
                if (this.f7642g) {
                    m5363a(m5357a(motionEvent), true);
                    setPressed(false);
                } else if (C1617y.m5419a(motionEvent, this)) {
                    this.f7642g = true;
                    this.f7642g = false;
                    m5363a(m5357a(motionEvent), false);
                    this.f7642g = false;
                }
                this.f7624E.cancel();
                if (this.f7620A == null) {
                    this.f7620A = new ValueAnimator();
                    this.f7620A.setDuration(120L);
                    if (Build.VERSION.SDK_INT > 21) {
                        this.f7620A.setInterpolator(C0517b.m1773a(0.0f, 0.0f, 0.2f, 1.0f));
                    }
                    this.f7620A.addUpdateListener(new C1606n(this));
                }
                this.f7620A.setValues(PropertyValuesHolder.ofFloat("radiusIn", this.f7653r, this.f7644i), PropertyValuesHolder.ofFloat("radiusOut", this.f7652q, this.f7650o), PropertyValuesHolder.ofInt("thumbShadowRadius", this.f7629J, 0), PropertyValuesHolder.ofFloat("backgroundRadius", this.f7625F, this.f7649n));
                this.f7620A.start();
                return true;
            case 2:
                float m5357a = m5357a(motionEvent);
                if (this.f7642g) {
                    if (m5357a - this.f7655t > 0.0f) {
                        i = 1;
                    } else if (m5357a - this.f7655t < 0.0f) {
                        i = -1;
                    }
                    if (i == (-this.f7631L)) {
                        this.f7631L = i;
                        if (this.f7656u != this.f7640e) {
                            this.f7656u = this.f7640e;
                            this.f7657v = m5356a(this.f7640e);
                            this.f7632M = 0.0f;
                        }
                        if (this.f7661z != null) {
                            this.f7661z.cancel();
                        }
                    }
                    m5361a(m5357a);
                } else {
                    if (!C1617y.m5419a(motionEvent, this)) {
                        return false;
                    }
                    if (Math.abs(m5357a - this.f7639d) > this.f7638c) {
                        setPressed(true);
                        this.f7642g = true;
                        if (getParent() instanceof ViewGroup) {
                            ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
                        }
                        if (this.f7624E.isRunning()) {
                            this.f7624E.cancel();
                        }
                        this.f7624E.start();
                        this.f7656u = m5371c(this.f7639d);
                        m5368b(this.f7656u);
                        this.f7657v = m5356a(this.f7656u);
                        this.f7632M = 0.0f;
                        this.f7659x = this.f7657v;
                        invalidate();
                        m5361a(m5357a);
                        this.f7631L = m5357a - this.f7639d > 0.0f ? 1 : -1;
                    }
                }
                this.f7655t = m5357a;
                return true;
            default:
                return true;
        }
    }

    /* renamed from: b */
    private void m5367b() {
        ColorOSHapticFeedbackUtils.performHapticFeedback(this, ResponseCode.CODE_3XX_FOUND, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5363a(float f, boolean z) {
        float m5356a = m5356a(this.f7640e);
        float f2 = f - m5356a;
        float sectionWidth = getSectionWidth();
        int round = this.f7642g ? (int) (f2 / sectionWidth) : Math.round(f2 / sectionWidth);
        if (this.f7661z != null && this.f7661z.isRunning()) {
            this.f7634O = true;
        }
        if (this.f7661z != null && this.f7661z.isRunning() && this.f7622C == (round * sectionWidth) + m5356a) {
            return;
        }
        float f3 = round * sectionWidth;
        this.f7623D = f3;
        this.f7621B = m5356a;
        this.f7622C = this.f7621B;
        float f4 = this.f7659x - m5356a;
        this.f7633N = true;
        m5362a(m5356a, f3 + m5356a, f4, z ? 100 : 0);
    }

    /* renamed from: a */
    private float m5357a(MotionEvent motionEvent) {
        return Math.min(Math.max(0.0f, (motionEvent.getX() - getPaddingLeft()) - this.f7627H), getSeekBarWidth());
    }

    /* renamed from: a */
    private void m5361a(float f) {
        float f2 = f - this.f7657v;
        float sectionWidth = getSectionWidth();
        int i = (int) (f2 / sectionWidth);
        float f3 = i * sectionWidth;
        if (isLayoutRtl()) {
            i = -i;
        }
        this.f7623D = f2;
        if (Math.abs((this.f7656u + i) - this.f7640e) > 0) {
            m5362a(this.f7657v, this.f7657v + f3, this.f7632M, 100);
        } else {
            this.f7659x = this.f7657v + f3 + ((this.f7623D - f3) * 0.6f);
            invalidate();
        }
    }

    /* renamed from: a */
    private void m5362a(float f, float f2, float f3, int i) {
        if (this.f7659x == f2 || (this.f7661z != null && this.f7661z.isRunning() && this.f7622C == f2)) {
            if (this.f7633N) {
                this.f7642g = false;
                this.f7633N = false;
                return;
            }
            return;
        }
        this.f7622C = f2;
        this.f7630K = f;
        if (this.f7661z == null) {
            this.f7661z = new ValueAnimator();
            if (Build.VERSION.SDK_INT > 21) {
                this.f7661z.setInterpolator(C0517b.m1773a(0.0f, 0.0f, 0.25f, 1.0f));
            }
            this.f7661z.addUpdateListener(new C1604l(this));
            this.f7661z.addListener(new C1605m(this));
        }
        this.f7661z.cancel();
        this.f7661z.setDuration(i);
        this.f7661z.setFloatValues(f3, f2 - f);
        this.f7661z.start();
    }

    /* renamed from: b */
    private float m5364b(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public int m5371c(float f) {
        int seekBarWidth = getSeekBarWidth();
        if (isLayoutRtl()) {
            f = seekBarWidth - f;
        }
        return Math.max(0, Math.min(Math.round((f * this.f7637b) / seekBarWidth), this.f7637b));
    }

    /* renamed from: a */
    private float m5356a(int i) {
        float f = (i * r0) / this.f7637b;
        float seekBarWidth = getSeekBarWidth();
        float max = Math.max(0.0f, Math.min(f, seekBarWidth));
        return isLayoutRtl() ? seekBarWidth - max : max;
    }

    /* renamed from: c */
    private void m5373c() {
        int seekBarWidth = getSeekBarWidth();
        this.f7659x = (this.f7640e * seekBarWidth) / this.f7637b;
        if (isLayoutRtl()) {
            this.f7659x = seekBarWidth - this.f7659x;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5396a() {
        this.f7642g = false;
    }

    private int getSeekBarWidth() {
        return ((getWidth() - getStart()) - getEnd()) - (this.f7627H << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getSectionWidth() {
        return getSeekBarWidth() / this.f7637b;
    }

    public int getThumbIndex() {
        return this.f7640e;
    }

    public void setThumbIndex(int i) {
        if (i < 0 || i > this.f7637b) {
            return;
        }
        this.f7640e = i;
        if (getWidth() != 0) {
            m5373c();
            this.f7621B = this.f7659x;
            this.f7622C = this.f7621B;
            invalidate();
        }
    }

    public void setMarkEnable(boolean z) {
        this.f7635P = z;
        invalidate();
    }

    public void setNumber(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.f7637b = i;
        if (this.f7640e > this.f7637b) {
            m5368b(this.f7637b);
        }
        if (getWidth() != 0) {
            m5373c();
            invalidate();
        }
    }

    public void setOnSectionSeekBarChangeListener(InterfaceC1607o interfaceC1607o) {
        this.f7641f = interfaceC1607o;
    }

    public boolean isLayoutRtl() {
        return Build.VERSION.SDK_INT > 16 && getLayoutDirection() == 1;
    }

    public void setProgressColor(ColorStateList colorStateList) {
        this.f7646k = colorStateList;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5368b(int i) {
        if (this.f7640e != i) {
            this.f7640e = i;
            m5367b();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7659x = -1.0f;
    }
}
