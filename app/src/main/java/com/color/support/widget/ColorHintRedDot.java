package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1339d;

/* loaded from: classes.dex */
public class ColorHintRedDot extends View {

    /* renamed from: a */
    private int f6047a;

    /* renamed from: b */
    private int f6048b;

    /* renamed from: c */
    private C1339d f6049c;

    /* renamed from: d */
    private RectF f6050d;

    public ColorHintRedDot(Context context) {
        this(context, null);
    }

    public ColorHintRedDot(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorHintRedDotStyle);
    }

    public ColorHintRedDot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6047a = 0;
        this.f6048b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorHintRedDot, i, 0);
        this.f6047a = obtainStyledAttributes.getInteger(R.styleable.ColorHintRedDot_colorHintRedPointMode, 0);
        this.f6048b = obtainStyledAttributes.getInteger(R.styleable.ColorHintRedDot_colorHintRedPointNum, 0);
        obtainStyledAttributes.recycle();
        this.f6049c = new C1339d(context, attributeSet, R.styleable.ColorHintRedDot, i, 0);
        this.f6050d = new RectF();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f6049c.m4378a(this.f6047a, this.f6048b), this.f6049c.m4377a(this.f6047a));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f6050d.left = 0.0f;
        this.f6050d.top = 0.0f;
        this.f6050d.right = getWidth();
        this.f6050d.bottom = getHeight();
        this.f6049c.m4379a(canvas, this.f6047a, this.f6048b, this.f6050d);
    }

    public void setPointNumber(int i) {
        this.f6048b = i;
        requestLayout();
    }

    public void setPointMode(int i) {
        this.f6047a = i;
        requestLayout();
    }

    public int getPointMode() {
        return this.f6047a;
    }

    public int getPointNumber() {
        return this.f6048b;
    }
}
