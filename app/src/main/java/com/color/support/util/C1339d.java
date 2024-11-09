package com.color.support.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import color.support.p043v7.appcompat.R;

/* compiled from: ColorHintRedDotHelper.java */
/* renamed from: com.color.support.util.d */
/* loaded from: classes.dex */
public final class C1339d {

    /* renamed from: a */
    private int f5805a;

    /* renamed from: b */
    private int f5806b;

    /* renamed from: c */
    private int f5807c;

    /* renamed from: d */
    private int f5808d;

    /* renamed from: e */
    private int f5809e;

    /* renamed from: f */
    private int f5810f;

    /* renamed from: g */
    private int f5811g;

    /* renamed from: h */
    private int f5812h;

    /* renamed from: i */
    private int f5813i;

    /* renamed from: j */
    private int f5814j;

    /* renamed from: k */
    private int f5815k;

    /* renamed from: l */
    private int f5816l;

    /* renamed from: m */
    private int f5817m;

    /* renamed from: n */
    private TextPaint f5818n;

    /* renamed from: o */
    private Paint f5819o;

    public C1339d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f5805a = obtainStyledAttributes.getColor(R.styleable.ColorHintRedDot_colorHintRedDotColor, 0);
        this.f5806b = obtainStyledAttributes.getColor(R.styleable.ColorHintRedDot_colorHintRedDotTextColor, 0);
        this.f5807c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorHintRedDot_colorHintTextSize, 0);
        this.f5808d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorHintRedDot_colorSmallWidth, 0);
        this.f5809e = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorHintRedDot_colorMediumWidth, 0);
        this.f5810f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorHintRedDot_colorLargeWidth, 0);
        this.f5812h = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorHintRedDot_colorHeight, 0);
        this.f5813i = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorHintRedDot_colorCornerRadius, 0);
        this.f5814j = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorHintRedDot_colorDotDiameter, 0);
        this.f5816l = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorHintRedDot_colorEllipsisDiameter, 0);
        obtainStyledAttributes.recycle();
        this.f5815k = context.getResources().getDimensionPixelSize(R.dimen.color_hint_red_dot_rect_radius);
        this.f5811g = context.getResources().getDimensionPixelSize(R.dimen.color_hint_red_dot_navi_small_width);
        this.f5817m = context.getResources().getDimensionPixelSize(R.dimen.color_hint_red_dot_ellipsis_spacing);
        this.f5818n = new TextPaint();
        this.f5818n.setAntiAlias(true);
        this.f5818n.setColor(this.f5806b);
        this.f5818n.setTextSize(this.f5807c);
        this.f5818n.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.f5819o = new Paint();
        this.f5819o.setAntiAlias(true);
        this.f5819o.setColor(this.f5805a);
        this.f5819o.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public final int m4377a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return this.f5814j;
            case 2:
                return this.f5812h;
            case 3:
                return this.f5809e / 2;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public final void m4379a(Canvas canvas, int i, int i2, RectF rectF) {
        switch (i) {
            case 0:
                return;
            case 1:
                float f = (rectF.bottom - rectF.top) / 2.0f;
                canvas.drawCircle(rectF.left + f, rectF.top + f, f, this.f5819o);
                return;
            case 2:
            case 3:
                if (i2 > 0) {
                    canvas.drawPath(C1344i.m4397a().m4400a(rectF, this.f5813i), this.f5819o);
                    if (i2 < 1000) {
                        String valueOf = String.valueOf(i2);
                        Paint.FontMetricsInt fontMetricsInt = this.f5818n.getFontMetricsInt();
                        canvas.drawText(valueOf, rectF.left + (((rectF.right - rectF.left) - ((int) this.f5818n.measureText(valueOf))) / 2.0f), (((rectF.top + rectF.bottom) - fontMetricsInt.ascent) - fontMetricsInt.descent) / 2.0f, this.f5818n);
                        return;
                    }
                    float f2 = (rectF.left + rectF.right) / 2.0f;
                    float f3 = (rectF.top + rectF.bottom) / 2.0f;
                    for (int i3 = -1; i3 <= 1; i3++) {
                        canvas.drawCircle(((this.f5817m + this.f5816l) * i3) + f2, f3, this.f5816l / 2.0f, this.f5818n);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final int m4378a(int i, int i2) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return this.f5814j;
            case 2:
                if (i2 < 10) {
                    return this.f5808d;
                }
                if (i2 >= 100 && i2 < 1000) {
                    return this.f5810f;
                }
                return this.f5809e;
            case 3:
                if (i2 < 10) {
                    return this.f5811g;
                }
                if (i2 < 100) {
                    return this.f5808d;
                }
                return this.f5809e;
            default:
                return 0;
        }
    }
}
