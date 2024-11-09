package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p024g.C0525j;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;

/* loaded from: classes.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    private int f9874a;

    /* renamed from: b */
    private int f9875b;

    /* renamed from: c */
    private boolean f9876c;

    /* renamed from: d */
    private int f9877d;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9876c = false;
        m7072a(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9876c = false;
        m7072a(context, attributeSet);
    }

    /* renamed from: a */
    private void m7072a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FlowLayout, 0, 0);
        this.f9874a = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        this.f9875b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    protected int getLineSpacing() {
        return this.f9874a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f9874a = i;
    }

    protected int getItemSpacing() {
        return this.f9875b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f9875b = i;
    }

    /* renamed from: a */
    public boolean mo6645a() {
        return this.f9876c;
    }

    public void setSingleLine(boolean z) {
        this.f9876c = z;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i5 - getPaddingRight();
        int i6 = paddingLeft;
        int i7 = paddingTop;
        int i8 = i7;
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i11 = i6;
                if (i6 + i3 + childAt.getMeasuredWidth() > paddingRight && !mo6645a()) {
                    int paddingLeft2 = getPaddingLeft();
                    i8 = this.f9874a + i7;
                    i11 = paddingLeft2;
                }
                int measuredWidth = i11 + i3 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + i8;
                if (measuredWidth > i9) {
                    i9 = measuredWidth;
                }
                int measuredWidth2 = i11 + i3 + i4 + childAt.getMeasuredWidth() + this.f9875b;
                if (i10 == getChildCount() - 1) {
                    i9 += i4;
                }
                i7 = measuredHeight;
                i6 = measuredWidth2;
            }
        }
        setMeasuredDimension(m7070a(size, mode, i9 + getPaddingRight()), m7070a(size2, mode2, i7 + getPaddingBottom()));
    }

    /* renamed from: a */
    private static int m7070a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f9877d = 0;
            return;
        }
        this.f9877d = 1;
        boolean z2 = C0538w.m1878h(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = C0525j.m1785a(marginLayoutParams);
                    i5 = C0525j.m1787b(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = i8 + i6 + childAt.getMeasuredWidth();
                if (!this.f9876c && measuredWidth > i7) {
                    i9 = paddingTop + this.f9874a;
                    this.f9877d++;
                    i8 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f9877d - 1));
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i6, measuredHeight);
                } else {
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                }
                i8 += i6 + i5 + childAt.getMeasuredWidth() + this.f9875b;
                paddingTop = measuredHeight;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getRowCount() {
        return this.f9877d;
    }

    /* renamed from: a */
    public static int m7071a(View view) {
        Object tag = view.getTag(R.id.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }
}
