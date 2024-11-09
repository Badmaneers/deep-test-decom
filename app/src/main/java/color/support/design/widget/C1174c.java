package color.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import color.support.p043v7.appcompat.R;

/* compiled from: ColorAppBarLayout.java */
/* renamed from: color.support.design.widget.c */
/* loaded from: classes.dex */
public final class C1174c extends LinearLayout.LayoutParams {

    /* renamed from: a */
    int f4767a;

    /* renamed from: b */
    Interpolator f4768b;

    public C1174c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4767a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorAppBarLayout_Layout);
        this.f4767a = obtainStyledAttributes.getInt(R.styleable.ColorAppBarLayout_Layout_colorLayoutScrollFlags, 0);
        if (obtainStyledAttributes.hasValue(R.styleable.ColorAppBarLayout_Layout_colorLayoutScrollInterpolator)) {
            this.f4768b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(R.styleable.ColorAppBarLayout_Layout_colorLayoutScrollInterpolator, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public C1174c() {
        super(-1, -2);
        this.f4767a = 1;
    }

    public C1174c(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4767a = 1;
    }

    public C1174c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4767a = 1;
    }

    public C1174c(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4767a = 1;
    }
}
