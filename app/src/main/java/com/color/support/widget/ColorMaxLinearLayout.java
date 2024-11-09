package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
class ColorMaxLinearLayout extends LinearLayout {

    /* renamed from: a */
    private int f6263a;

    /* renamed from: b */
    private int f6264b;

    public ColorMaxLinearLayout(Context context) {
        super(context);
    }

    public ColorMaxLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorMaxLinearLayout);
        this.f6263a = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorMaxLinearLayout_portraitMaxHeight, 0);
        this.f6264b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorMaxLinearLayout_landscapeMaxHeight, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels < displayMetrics.heightPixels ? this.f6263a : this.f6264b;
        if (measuredHeight > i3) {
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
    }
}
