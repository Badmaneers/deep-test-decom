package com.color.support.widget;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.core.p024g.C0538w;

/* loaded from: classes.dex */
public class ColorAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: A */
    private ValueAnimator f5861A;

    /* renamed from: B */
    private ValueAnimator f5862B;

    /* renamed from: C */
    private boolean f5863C;

    /* renamed from: D */
    private boolean f5864D;

    /* renamed from: E */
    private Paint f5865E;

    /* renamed from: F */
    private Paint f5866F;

    /* renamed from: G */
    private int f5867G;

    /* renamed from: H */
    private int f5868H;

    /* renamed from: I */
    private int f5869I;

    /* renamed from: J */
    private int f5870J;

    /* renamed from: K */
    private int f5871K;

    /* renamed from: L */
    private int f5872L;

    /* renamed from: a */
    private final C1563j f5873a;

    /* renamed from: b */
    private Interpolator f5874b;

    /* renamed from: c */
    private Interpolator f5875c;

    /* renamed from: d */
    private CharSequence f5876d;

    /* renamed from: e */
    private boolean f5877e;

    /* renamed from: f */
    private CharSequence f5878f;

    /* renamed from: g */
    private boolean f5879g;

    /* renamed from: h */
    private GradientDrawable f5880h;

    /* renamed from: i */
    private int f5881i;

    /* renamed from: j */
    private int f5882j;

    /* renamed from: k */
    private float f5883k;

    /* renamed from: l */
    private float f5884l;

    /* renamed from: m */
    private float f5885m;

    /* renamed from: n */
    private float f5886n;

    /* renamed from: o */
    private int f5887o;

    /* renamed from: p */
    private int f5888p;

    /* renamed from: q */
    private int f5889q;

    /* renamed from: r */
    private RectF f5890r;

    /* renamed from: s */
    private ColorStateList f5891s;

    /* renamed from: t */
    private ColorStateList f5892t;

    /* renamed from: u */
    private int f5893u;

    /* renamed from: v */
    private int f5894v;

    /* renamed from: w */
    private int f5895w;

    /* renamed from: x */
    private boolean f5896x;

    /* renamed from: y */
    private boolean f5897y;

    /* renamed from: z */
    private ValueAnimator f5898z;

    public ColorAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public ColorAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public ColorAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5873a = new C1563j(this);
        this.f5887o = 3;
        this.f5890r = new RectF();
        this.f5873a.m5252a(new LinearInterpolator());
        this.f5873a.m5260b(new LinearInterpolator());
        this.f5873a.m5257b(8388659);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5874b = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
            this.f5875c = new PathInterpolator(0.0f, 0.0f, 0.1f, 1.0f);
        } else {
            this.f5874b = new LinearInterpolator();
            this.f5875c = new LinearInterpolator();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, color.support.p043v7.appcompat.R.styleable.ColorEditText, i, color.support.p043v7.appcompat.R.style.Widget_ColorSupport_EditText_HintAnim_Line);
        this.f5877e = obtainStyledAttributes.getBoolean(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorHintEnabled, false);
        if (Build.VERSION.SDK_INT < 19 && this.f5877e) {
            this.f5877e = false;
            setPadding(0, 0, 0, 0);
        }
        if (this.f5877e) {
            setBackgroundDrawable(null);
            setTopHint(obtainStyledAttributes.getText(color.support.p043v7.appcompat.R.styleable.ColorEditText_android_hint));
            this.f5897y = obtainStyledAttributes.getBoolean(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorHintAnimationEnabled, true);
            this.f5869I = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.ColorEditText_rectModePaddingTop, 0);
            float dimension = obtainStyledAttributes.getDimension(color.support.p043v7.appcompat.R.styleable.ColorEditText_cornerRadius, 0.0f);
            this.f5883k = dimension;
            this.f5884l = dimension;
            this.f5885m = dimension;
            this.f5886n = dimension;
            this.f5894v = obtainStyledAttributes.getColor(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorStrokeColor, -16711936);
            this.f5887o = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorStrokeWidth, 0);
            this.f5888p = this.f5887o;
            this.f5881i = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_textinput_label_cutout_padding);
            this.f5870J = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_textinput_line_padding_top);
            this.f5871K = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_textinput_line_padding_middle);
            this.f5872L = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_textinput_rect_padding_middle);
            int i2 = obtainStyledAttributes.getInt(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorBackgroundMode, 0);
            setBoxBackgroundMode(i2);
            if (obtainStyledAttributes.hasValue(color.support.p043v7.appcompat.R.styleable.ColorEditText_android_textColorHint)) {
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(color.support.p043v7.appcompat.R.styleable.ColorEditText_android_textColorHint);
                this.f5892t = colorStateList;
                this.f5891s = colorStateList;
            }
            this.f5893u = context.getResources().getColor(color.support.p043v7.appcompat.R.color.color_textinput_stroke_color_default);
            this.f5895w = context.getResources().getColor(color.support.p043v7.appcompat.R.color.color_textinput_stroke_color_disabled);
            this.f5873a.m5248a(obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.ColorEditText_collapsedTextSize, 0), obtainStyledAttributes.getColorStateList(color.support.p043v7.appcompat.R.styleable.ColorEditText_colorStrokeColor));
            this.f5892t = this.f5873a.m5272n();
            m4415a(false, false);
            if (i2 == 2) {
                Typeface.create("sans-serif-medium", 0);
                this.f5873a.m5265g();
            }
            obtainStyledAttributes.recycle();
            this.f5866F = new Paint();
            this.f5866F.setColor(this.f5893u);
            this.f5866F.setStrokeWidth(this.f5887o);
            this.f5865E = new Paint();
            this.f5865E.setColor(this.f5894v);
            this.f5865E.setStrokeWidth(this.f5887o);
            m4411a();
            this.f5873a.m5245a(getTextSize());
            int gravity = getGravity();
            this.f5873a.m5257b((gravity & (-113)) | 48);
            this.f5873a.m5246a(gravity);
            if (this.f5891s == null) {
                this.f5891s = getHintTextColors();
            }
            if (this.f5877e) {
                setHint((CharSequence) null);
                if (TextUtils.isEmpty(this.f5878f)) {
                    this.f5876d = getHint();
                    setTopHint(this.f5876d);
                    setHint((CharSequence) null);
                }
                this.f5879g = true;
            }
            m4415a(false, true);
            m4417b();
        }
    }

    private Drawable getBoxBackground() {
        if (this.f5882j == 1 || this.f5882j == 2) {
            return this.f5880h;
        }
        return null;
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f5882j) {
            return;
        }
        this.f5882j = i;
        m4411a();
    }

    /* renamed from: a */
    private void m4411a() {
        m4419c();
        m4420d();
    }

    /* renamed from: b */
    private void m4417b() {
        C0538w.m1863b(this, m4427k() ? getPaddingRight() : getPaddingLeft(), getModePaddingTop(), m4427k() ? getPaddingLeft() : getPaddingRight(), getPaddingBottom());
    }

    private int getModePaddingTop() {
        switch (this.f5882j) {
            case 1:
                return this.f5870J + ((int) this.f5873a.m5262d()) + this.f5871K;
            case 2:
                return this.f5869I + ((int) (this.f5873a.m5261c() / 2.0f));
            default:
                return 0;
        }
    }

    /* renamed from: c */
    private void m4419c() {
        if (this.f5882j == 0) {
            this.f5880h = null;
            return;
        }
        if (this.f5882j == 2 && this.f5877e && !(this.f5880h instanceof C1562i)) {
            this.f5880h = new C1562i();
        } else if (this.f5880h == null) {
            this.f5880h = new GradientDrawable();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f5894v != i) {
            this.f5894v = i;
            m4426j();
        }
    }

    public int getBoxStrokeColor() {
        return this.f5894v;
    }

    private float[] getCornerRadiiAsArray() {
        return new float[]{this.f5884l, this.f5884l, this.f5883k, this.f5883k, this.f5886n, this.f5886n, this.f5885m, this.f5885m};
    }

    /* renamed from: a */
    private void m4415a(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        boolean z3 = !TextUtils.isEmpty(getText());
        if (this.f5891s != null) {
            this.f5873a.m5249a(this.f5891s);
            this.f5873a.m5259b(this.f5891s);
        }
        if (!isEnabled) {
            this.f5873a.m5249a(ColorStateList.valueOf(this.f5895w));
            this.f5873a.m5259b(ColorStateList.valueOf(this.f5895w));
        } else if (hasFocus() && this.f5892t != null) {
            this.f5873a.m5249a(this.f5892t);
        }
        if (z3 || (isEnabled() && hasFocus())) {
            if (z2 || this.f5896x) {
                m4414a(z);
                return;
            }
            return;
        }
        if (z2 || !this.f5896x) {
            m4418b(z);
        }
    }

    public void setTopHint(CharSequence charSequence) {
        if (this.f5877e) {
            setHintInternal(charSequence);
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f5878f)) {
            return;
        }
        this.f5878f = charSequence;
        this.f5873a.m5253a(charSequence);
        if (this.f5896x) {
            return;
        }
        m4424h();
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        if (this.f5877e) {
            return this.f5878f;
        }
        return null;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f5877e) {
            this.f5877e = z;
            if (!this.f5877e) {
                this.f5879g = false;
                if (!TextUtils.isEmpty(this.f5878f) && TextUtils.isEmpty(getHint())) {
                    setHint(this.f5878f);
                }
                setHintInternal(null);
                return;
            }
            CharSequence hint = getHint();
            if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.f5878f)) {
                    setTopHint(hint);
                }
                setHint((CharSequence) null);
            }
            this.f5879g = true;
        }
    }

    /* renamed from: d */
    private void m4420d() {
        if (this.f5882j == 0 || this.f5880h == null || getRight() == 0) {
            return;
        }
        this.f5880h.setBounds(0, getBoundsTop(), getWidth(), getHeight());
        m4422f();
    }

    private int getBoundsTop() {
        switch (this.f5882j) {
            case 1:
                return this.f5870J;
            case 2:
                return (int) (this.f5873a.m5261c() / 2.0f);
            default:
                return 0;
        }
    }

    /* renamed from: e */
    private void m4421e() {
        switch (this.f5882j) {
            case 1:
                this.f5887o = 0;
                return;
            case 2:
                if (this.f5894v == 0) {
                    this.f5894v = this.f5892t.getColorForState(getDrawableState(), this.f5892t.getDefaultColor());
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: f */
    private void m4422f() {
        if (this.f5880h == null) {
            return;
        }
        m4421e();
        if (this.f5887o >= 0 && this.f5889q != 0) {
            this.f5880h.setStroke(this.f5887o, this.f5889q);
        }
        this.f5880h.setCornerRadii(getCornerRadiiAsArray());
        invalidate();
    }

    public void setmHintAnimationEnabled(boolean z) {
        this.f5897y = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f5877e) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            this.f5873a.m5250a(canvas);
            if (this.f5880h != null && this.f5882j == 2) {
                if (getScrollX() != 0) {
                    m4420d();
                }
                this.f5880h.draw(canvas);
            }
            if (this.f5882j == 1) {
                float height = getHeight() - ((int) ((this.f5888p / 2.0d) + 0.5d));
                canvas.drawLine(0.0f, height, getWidth(), height, this.f5866F);
                this.f5865E.setAlpha(this.f5867G);
                canvas.drawLine(0.0f, height, this.f5868H, height, this.f5865E);
            }
            canvas.restoreToCount(save);
        }
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f5877e) {
            if (this.f5880h != null) {
                m4420d();
            }
            m4417b();
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int width = getWidth() - getCompoundPaddingRight();
            switch (this.f5882j) {
                case 1:
                    i5 = getBoxBackground().getBounds().top;
                    break;
                case 2:
                    i5 = getBoxBackground().getBounds().top - ((int) (this.f5873a.m5261c() / 2.0f));
                    break;
                default:
                    i5 = getPaddingTop();
                    break;
            }
            this.f5873a.m5247a(compoundPaddingLeft, getCompoundPaddingTop(), width, getHeight() - getCompoundPaddingBottom());
            this.f5873a.m5258b(compoundPaddingLeft, i5, width, getHeight() - getCompoundPaddingBottom());
            this.f5873a.m5269k();
            if (!m4423g() || this.f5896x) {
                return;
            }
            m4424h();
        }
    }

    /* renamed from: a */
    private void m4414a(boolean z) {
        if (this.f5898z != null && this.f5898z.isRunning()) {
            this.f5898z.cancel();
        }
        if (z && this.f5897y) {
            m4412a(1.0f);
        } else {
            this.f5873a.m5256b(1.0f);
        }
        this.f5896x = false;
        if (m4423g()) {
            m4424h();
        }
    }

    /* renamed from: g */
    private boolean m4423g() {
        return this.f5877e && !TextUtils.isEmpty(this.f5878f) && (this.f5880h instanceof C1562i);
    }

    /* renamed from: h */
    private void m4424h() {
        if (m4423g()) {
            RectF rectF = this.f5890r;
            this.f5873a.m5251a(rectF);
            m4413a(rectF);
            ((C1562i) this.f5880h).m5222a(rectF);
        }
    }

    /* renamed from: i */
    private void m4425i() {
        if (m4423g()) {
            ((C1562i) this.f5880h).m5225c();
        }
    }

    /* renamed from: a */
    private void m4413a(RectF rectF) {
        rectF.left -= this.f5881i;
        rectF.top -= this.f5881i;
        rectF.right += this.f5881i;
        rectF.bottom += this.f5881i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        if (!this.f5877e) {
            super.drawableStateChanged();
            return;
        }
        if (this.f5863C) {
            return;
        }
        this.f5863C = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        m4415a(C0538w.m1819C(this) && isEnabled(), false);
        if (this.f5882j == 1) {
            if (isEnabled()) {
                if (hasFocus()) {
                    if (!this.f5864D) {
                        if (this.f5861A == null) {
                            this.f5861A = new ValueAnimator();
                            this.f5861A.setInterpolator(this.f5875c);
                            this.f5861A.setDuration(250L);
                            this.f5861A.addUpdateListener(new C1356a(this));
                        }
                        this.f5867G = 255;
                        this.f5861A.setIntValues(0, getWidth());
                        this.f5861A.start();
                        this.f5864D = true;
                    }
                } else if (this.f5864D) {
                    if (this.f5862B == null) {
                        this.f5862B = new ValueAnimator();
                        this.f5862B.setInterpolator(this.f5875c);
                        this.f5862B.setDuration(250L);
                        this.f5862B.addUpdateListener(new C1385b(this));
                    }
                    this.f5862B.setIntValues(255, 0);
                    this.f5862B.start();
                    this.f5864D = false;
                }
            } else {
                this.f5868H = 0;
            }
        }
        m4420d();
        m4426j();
        if (this.f5873a != null ? this.f5873a.m5254a(drawableState) | false : false) {
            invalidate();
        }
        this.f5863C = false;
    }

    /* renamed from: j */
    private void m4426j() {
        if (this.f5880h == null || this.f5882j == 0 || this.f5882j != 2) {
            return;
        }
        if (!isEnabled()) {
            this.f5889q = this.f5895w;
        } else if (hasFocus()) {
            this.f5889q = this.f5894v;
        } else {
            this.f5889q = this.f5893u;
        }
        m4422f();
    }

    /* renamed from: b */
    private void m4418b(boolean z) {
        if (this.f5880h != null) {
            Log.d("AutoCompleteTextView", "mBoxBackground: " + this.f5880h.getBounds());
        }
        if (this.f5898z != null && this.f5898z.isRunning()) {
            this.f5898z.cancel();
        }
        if (z && this.f5897y) {
            m4412a(0.0f);
        } else {
            this.f5873a.m5256b(0.0f);
        }
        if (m4423g() && ((C1562i) this.f5880h).m5223a()) {
            m4425i();
        }
        this.f5896x = true;
    }

    /* renamed from: a */
    private void m4412a(float f) {
        if (this.f5873a.m5267i() == f) {
            return;
        }
        if (this.f5898z == null) {
            this.f5898z = new ValueAnimator();
            this.f5898z.setInterpolator(this.f5874b);
            this.f5898z.setDuration(200L);
            this.f5898z.addUpdateListener(new C1412c(this));
        }
        this.f5898z.setFloatValues(this.f5873a.m5267i(), f);
        this.f5898z.start();
    }

    /* renamed from: k */
    private boolean m4427k() {
        return Build.VERSION.SDK_INT > 16 && getLayoutDirection() == 1;
    }
}
