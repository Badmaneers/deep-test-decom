package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R;

/* compiled from: CollapsingToolbarLayout.java */
/* renamed from: com.google.android.material.appbar.m */
/* loaded from: classes.dex */
public final class C2055m extends FrameLayout.LayoutParams {

    /* renamed from: a */
    int f9068a;

    /* renamed from: b */
    float f9069b;

    public C2055m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9068a = 0;
        this.f9069b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
        this.f9068a = obtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
        this.f9069b = obtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public C2055m() {
        super(-1, -1);
        this.f9068a = 0;
        this.f9069b = 0.5f;
    }

    public C2055m(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9068a = 0;
        this.f9069b = 0.5f;
    }
}
