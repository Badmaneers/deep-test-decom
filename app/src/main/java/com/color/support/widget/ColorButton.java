package com.color.support.widget;

import android.R;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatButton;
import com.color.support.util.C1337b;
import com.color.support.util.C1338c;
import com.color.support.util.C1344i;

/* loaded from: classes.dex */
public class ColorButton extends AppCompatButton {

    /* renamed from: a */
    private static String f5899a = "ColorButton";

    /* renamed from: b */
    private Interpolator f5900b;

    /* renamed from: c */
    private Interpolator f5901c;

    /* renamed from: e */
    private ValueAnimator f5902e;

    /* renamed from: f */
    private boolean f5903f;

    /* renamed from: g */
    private ValueAnimator f5904g;

    /* renamed from: h */
    private boolean f5905h;

    /* renamed from: i */
    private Matrix f5906i;

    /* renamed from: j */
    private final Paint f5907j;

    /* renamed from: k */
    private int f5908k;

    /* renamed from: l */
    private int f5909l;

    /* renamed from: m */
    private float f5910m;

    /* renamed from: n */
    private int f5911n;

    /* renamed from: o */
    private float f5912o;

    /* renamed from: p */
    private boolean f5913p;

    /* renamed from: q */
    private float f5914q;

    /* renamed from: r */
    private int f5915r;

    /* renamed from: s */
    private int f5916s;

    /* renamed from: t */
    private float f5917t;

    /* renamed from: u */
    private int f5918u;

    /* renamed from: v */
    private Rect f5919v;

    public ColorButton(Context context) {
        this(context, null);
    }

    public ColorButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public ColorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5906i = new Matrix();
        this.f5907j = new Paint(1);
        this.f5910m = 21.0f;
        this.f5914q = 1.0f;
        this.f5915r = 0;
        this.f5916s = 0;
        this.f5917t = 1.0f;
        this.f5919v = new Rect();
        C1338c.m4375a(this, false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, color.support.p043v7.appcompat.R.styleable.ColorButton, i, 0);
        this.f5905h = obtainStyledAttributes.getBoolean(color.support.p043v7.appcompat.R.styleable.ColorButton_animColorEnable, false);
        this.f5913p = obtainStyledAttributes.hasValue(color.support.p043v7.appcompat.R.styleable.ColorButton_expandOffset);
        if (this.f5905h) {
            this.f5911n = (int) ((obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.ColorButton_expandOffset, -2) / 2.0f) + 0.5d);
            this.f5912o = obtainStyledAttributes.getFloat(color.support.p043v7.appcompat.R.styleable.ColorButton_brightness, 1.2f);
            this.f5910m = obtainStyledAttributes.getDimension(color.support.p043v7.appcompat.R.styleable.ColorButton_drawableRadius, 7.0f);
            this.f5909l = obtainStyledAttributes.getColor(color.support.p043v7.appcompat.R.styleable.ColorButton_disabledColor, context.getResources().getColor(color.support.p043v7.appcompat.R.color.color_btn_drawable_color_disabled));
            this.f5908k = obtainStyledAttributes.getColor(color.support.p043v7.appcompat.R.styleable.ColorButton_drawableColor, C1337b.m4374a(context, color.support.p043v7.appcompat.R.attr.colorTintControlNormal));
            setBackgroundDrawable(null);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f5900b = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
                this.f5901c = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
                this.f5918u = 0;
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int argb;
        if (this.f5905h) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            Paint paint = this.f5907j;
            int i = this.f5908k;
            if (!isEnabled()) {
                argb = this.f5909l;
            } else {
                int red = Color.red(i);
                int green = Color.green(i);
                int blue = Color.blue(i);
                int alpha = Color.alpha(i);
                int i2 = (int) (red * this.f5914q);
                int i3 = (int) (green * this.f5914q);
                int i4 = (int) (blue * this.f5914q);
                if (i2 > 255) {
                    i2 = 255;
                }
                if (i3 > 255) {
                    i3 = 255;
                }
                if (i4 > 255) {
                    i4 = 255;
                }
                argb = Color.argb(alpha, i2, i3, i4);
            }
            paint.setColor(argb);
            this.f5919v.left = this.f5916s + this.f5918u;
            this.f5919v.top = this.f5915r + this.f5918u;
            this.f5919v.right = (getWidth() - this.f5918u) - this.f5916s;
            this.f5919v.bottom = (getHeight() - this.f5918u) - this.f5915r;
            C1344i m4397a = C1344i.m4397a();
            Rect rect = this.f5919v;
            canvas.drawPath(m4397a.m4398a(rect.left, rect.top, rect.right, rect.bottom, this.f5910m), this.f5907j);
            this.f5906i.setScale(this.f5917t, this.f5917t, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            canvas.setMatrix(this.f5906i);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofFloat2;
        PropertyValuesHolder propertyValuesHolder;
        if (isEnabled() && this.f5905h) {
            if (motionEvent.getAction() == 0 && !this.f5903f) {
                m4434b();
                PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("brightnessHolder", 1.0f, this.f5912o);
                if (!this.f5913p) {
                    ofFloat = PropertyValuesHolder.ofFloat("narrowHolderY", 0.0f, getMeasuredHeight() * 0.05f);
                    propertyValuesHolder = PropertyValuesHolder.ofFloat("narrowHolderX", 0.0f, getMeasuredWidth() * 0.05f);
                    ofFloat2 = PropertyValuesHolder.ofFloat("narrowHolderFont", 1.0f, 0.9f);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat("narrowHolderY", 0.0f, this.f5911n);
                    PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("narrowHolderX", 0.0f, this.f5911n);
                    ofFloat2 = PropertyValuesHolder.ofFloat("narrowHolderFont", 1.0f, this.f5911n);
                    propertyValuesHolder = ofFloat4;
                }
                this.f5902e = ValueAnimator.ofPropertyValuesHolder(ofFloat3, ofFloat, propertyValuesHolder, ofFloat2);
                this.f5902e.setInterpolator(this.f5900b);
                this.f5902e.setDuration(200L);
                this.f5902e.addUpdateListener(new C1439d(this));
                this.f5902e.start();
                this.f5903f = true;
            }
            if (motionEvent.getAction() == 1) {
                m4430a();
            }
            if (motionEvent.getAction() == 3) {
                m4430a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m4430a() {
        if (this.f5903f) {
            m4434b();
            this.f5904g = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("brightnessHolder", this.f5914q, 1.0f), PropertyValuesHolder.ofFloat("narrowHolderY", this.f5915r, 0.0f), PropertyValuesHolder.ofFloat("narrowHolderX", this.f5916s, 0.0f), PropertyValuesHolder.ofFloat("narrowHolderFont", this.f5917t, 1.0f));
            this.f5904g.setInterpolator(this.f5901c);
            this.f5904g.setDuration(200L);
            this.f5904g.addUpdateListener(new C1466e(this));
            this.f5904g.start();
            this.f5903f = false;
        }
    }

    /* renamed from: b */
    private void m4434b() {
        if (this.f5902e != null && this.f5902e.isRunning()) {
            this.f5902e.cancel();
        }
        if (this.f5904g == null || !this.f5904g.isRunning()) {
            return;
        }
        this.f5904g.cancel();
    }

    public void setAnimColorEnable(boolean z) {
        this.f5905h = z;
    }
}
