package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class MaxHeightScrollView extends ScrollView {

    /* renamed from: a */
    private int f6737a;

    public MaxHeightScrollView(Context context) {
        this(context, null);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaxHeightScrollView);
        this.f6737a = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaxHeightScrollView_scrollViewMaxHeight, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        if (this.f6737a > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.f6737a, size), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.f6737a = i;
        requestLayout();
    }
}
