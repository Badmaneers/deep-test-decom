package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorDraggableVerticalLinearLayout extends LinearLayout {

    /* renamed from: a */
    private ImageView f5976a;

    /* renamed from: b */
    private boolean f5977b;

    /* renamed from: c */
    private float f5978c;

    /* renamed from: d */
    private int f5979d;

    /* renamed from: e */
    private int f5980e;

    /* renamed from: f */
    private int f5981f;

    /* renamed from: g */
    private int f5982g;

    public ColorDraggableVerticalLinearLayout(Context context) {
        super(context);
        this.f5977b = false;
        this.f5978c = 0.0f;
        this.f5979d = 0;
        this.f5980e = 0;
        this.f5981f = 0;
        this.f5982g = 0;
        m4458a();
    }

    public ColorDraggableVerticalLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5977b = false;
        this.f5978c = 0.0f;
        this.f5979d = 0;
        this.f5980e = 0;
        this.f5981f = 0;
        this.f5982g = 0;
        m4459a(attributeSet);
        m4458a();
    }

    public ColorDraggableVerticalLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5977b = false;
        this.f5978c = 0.0f;
        this.f5979d = 0;
        this.f5980e = 0;
        this.f5981f = 0;
        this.f5982g = 0;
        m4459a(attributeSet);
        m4458a();
    }

    public ColorDraggableVerticalLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5977b = false;
        this.f5978c = 0.0f;
        this.f5979d = 0;
        this.f5980e = 0;
        this.f5981f = 0;
        this.f5982g = 0;
        m4459a(attributeSet);
        m4458a();
    }

    /* renamed from: a */
    private void m4459a(AttributeSet attributeSet) {
        if (getContext() != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ColorDraggableVerticalLinearLayout);
            this.f5977b = obtainStyledAttributes.getBoolean(R.styleable.ColorDraggableVerticalLinearLayout_hasShadowNinePatchDrawable, false);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m4458a() {
        setOrientation(1);
        this.f5976a = new ImageView(getContext());
        int dimension = (int) getResources().getDimension(R.dimen.color_panel_drag_view_size);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension, dimension);
        layoutParams.gravity = 1;
        this.f5976a.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5976a.setForceDarkAllowed(false);
        }
        this.f5976a.setImageDrawable(getResources().getDrawable(R.drawable.color_panel_drag_view, getContext().getTheme()));
        m4460b();
        addView(this.f5976a);
        if (this.f5977b) {
            setBackground(getContext().getDrawable(R.drawable.color_panel_bg_with_shadow));
        } else {
            setBackground(getContext().getDrawable(R.drawable.color_panel_bg_without_shadow));
        }
    }

    /* renamed from: b */
    private void m4460b() {
        this.f5978c = getElevation();
        this.f5979d = getPaddingLeft();
        this.f5980e = getPaddingTop();
        this.f5981f = getPaddingRight();
        this.f5982g = getPaddingBottom();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        super.setOrientation(1);
    }

    public ImageView getDragView() {
        return this.f5976a;
    }

    public void setHasShadowNinePatchDrawable(boolean z) {
        this.f5977b = z;
        if (this.f5977b) {
            setBackground(getContext().getDrawable(R.drawable.color_panel_bg_with_shadow));
            setElevation(0.0f);
        } else {
            setBackground(getContext().getDrawable(R.drawable.color_panel_bg_without_shadow));
            setPadding(this.f5979d, this.f5980e, this.f5981f, this.f5982g);
            setElevation(this.f5978c);
        }
        invalidate();
    }
}
