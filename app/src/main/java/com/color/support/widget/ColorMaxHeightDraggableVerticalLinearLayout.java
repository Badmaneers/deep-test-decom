package com.color.support.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1343h;

/* loaded from: classes.dex */
public class ColorMaxHeightDraggableVerticalLinearLayout extends ColorDraggableVerticalLinearLayout {

    /* renamed from: a */
    private int f6258a;

    /* renamed from: b */
    private int f6259b;

    /* renamed from: c */
    private int f6260c;

    /* renamed from: d */
    private int f6261d;

    /* renamed from: e */
    private ViewTreeObserver.OnGlobalLayoutListener f6262e;

    public ColorMaxHeightDraggableVerticalLinearLayout(Context context) {
        super(context);
        this.f6258a = 0;
        this.f6259b = 0;
        m4588a();
    }

    public ColorMaxHeightDraggableVerticalLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6258a = 0;
        this.f6259b = 0;
        m4588a();
    }

    public ColorMaxHeightDraggableVerticalLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6258a = 0;
        this.f6259b = 0;
        m4588a();
    }

    public ColorMaxHeightDraggableVerticalLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6258a = 0;
        this.f6259b = 0;
        m4588a();
    }

    /* renamed from: a */
    private void m4588a() {
        this.f6260c = (int) getContext().getResources().getDimension(R.dimen.color_panel_normal_padding_top);
        this.f6261d = (int) getContext().getResources().getDimension(R.dimen.color_panel_full_screen_padding_top);
        Activity m4391b = C1343h.m4391b(getContext());
        if (m4391b != null) {
            this.f6259b = m4584a(m4391b, C1343h.m4389a(m4391b));
        } else if (getContext() != null) {
            this.f6259b = C1343h.m4390a(getContext()) - this.f6260c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m4584a(Activity activity, int i) {
        this.f6258a = i;
        if (C1343h.m4392b(activity) && !C1343h.m4394c(activity)) {
            return this.f6258a - this.f6261d;
        }
        return this.f6258a - this.f6260c;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (this.f6259b > 0 && mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.f6259b, size), mode);
        }
        super.onMeasure(i, i2);
    }

    public int getMaxHeight() {
        return this.f6259b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity m4391b = C1343h.m4391b(getContext());
        if (m4391b == null || !C1343h.m4392b(m4391b)) {
            return;
        }
        this.f6262e = new ViewTreeObserverOnGlobalLayoutListenerC1417ce(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f6262e);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.f6262e != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f6262e);
            this.f6262e = null;
        }
        super.onDetachedFromWindow();
    }
}
