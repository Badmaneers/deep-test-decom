package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.google.android.material.R;

/* compiled from: AppBarLayout.java */
/* renamed from: com.google.android.material.appbar.i */
/* loaded from: classes.dex */
public final class C2051i extends LinearLayout.LayoutParams {

    /* renamed from: a */
    int f9064a;

    /* renamed from: b */
    Interpolator f9065b;

    public C2051i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9064a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
        this.f9064a = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
        if (obtainStyledAttributes.hasValue(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
            this.f9065b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public C2051i() {
        super(-1, -2);
        this.f9064a = 1;
    }

    public C2051i(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9064a = 1;
    }

    public C2051i(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f9064a = 1;
    }

    public C2051i(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9064a = 1;
    }
}
