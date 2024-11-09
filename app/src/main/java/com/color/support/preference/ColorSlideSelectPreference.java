package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorSlideSelectPreference extends ColorPreference {

    /* renamed from: a */
    Context f5752a;

    /* renamed from: b */
    CharSequence f5753b;

    /* renamed from: c */
    private int f5754c;

    public ColorSlideSelectPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorSlideSelectPreferenceStyle);
    }

    private ColorSlideSelectPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private ColorSlideSelectPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i);
        this.f5754c = 0;
        this.f5752a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorSlideSelectPreference, i, 0);
        this.f5753b = obtainStyledAttributes.getText(R.styleable.ColorSlideSelectPreference_color_select_status1);
        obtainStyledAttributes.recycle();
    }
}
