package com.color.support.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorScrollingTabView.java */
/* renamed from: com.color.support.widget.cr */
/* loaded from: classes.dex */
public final class C1430cr extends LinearLayout {

    /* renamed from: a */
    final /* synthetic */ ColorScrollingTabView f7061a;

    /* renamed from: b */
    private int f7062b;

    /* renamed from: c */
    private float f7063c;

    /* renamed from: d */
    private View f7064d;

    /* renamed from: e */
    private int f7065e;

    /* renamed from: f */
    private int f7066f;

    public C1430cr(ColorScrollingTabView colorScrollingTabView, Context context) {
        this(colorScrollingTabView, context, (byte) 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C1430cr(ColorScrollingTabView colorScrollingTabView, Context context, byte b) {
        super(context, null);
        this.f7061a = colorScrollingTabView;
        setGravity(17);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:            if (r3 == 0) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:            if (r3 < r5) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:            if (r3 == r5) goto L27;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4991a(int r7, float r8) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.C1430cr.m4991a(int, float):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            int m4666a = ColorScrollingTabView.m4666a(this.f7061a, childCount, i4);
            getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(m4666a, 1073741824), i2);
            i3 += m4666a;
        }
        setMeasuredDimension(i3, View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int childCount = getChildCount();
        if (this.f7061a.isLayoutRtl()) {
            i6 = childCount - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt((i5 * i7) + i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int i8 = paddingLeft + layoutParams.leftMargin;
            int measuredWidth = childAt.getMeasuredWidth() + i8;
            childAt.layout(i8, i2, measuredWidth, i4);
            paddingLeft = layoutParams.leftMargin + measuredWidth;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        int childCount = getChildCount();
        if (childCount > 0) {
            canvas.save();
            m4990a(this.f7062b);
            View childAt = getChildAt(this.f7062b);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            boolean z = this.f7062b < childCount - 1;
            if (this.f7063c > 0.0f && z) {
                View childAt2 = getChildAt(this.f7062b + 1);
                int left2 = childAt2.getLeft();
                int right2 = childAt2.getRight();
                left = (int) ((this.f7063c * left2) + ((1.0f - this.f7063c) * left));
                right = (int) ((this.f7063c * right2) + ((1.0f - this.f7063c) * right));
            }
            canvas.translate(left, 0.0f);
            drawable = this.f7061a.f6445h;
            drawable.setBounds(0, 0, right - left, getHeight());
            drawable2 = this.f7061a.f6445h;
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: a */
    private void m4990a(int i) {
        this.f7064d = getChildAt(i);
        this.f7065e = this.f7064d.getLeft();
        this.f7066f = this.f7064d.getRight();
    }
}
