package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.PreferenceCategory;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorPreferenceCategory extends PreferenceCategory {

    /* renamed from: b */
    private boolean f5750b;

    /* renamed from: c */
    private int f5751c;

    public ColorPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPreferenceCategory, 0, 0);
        this.f5750b = obtainStyledAttributes.getBoolean(R.styleable.ColorPreferenceCategory_isFirstCategory, false);
        this.f5751c = context.getResources().getDimensionPixelSize(R.dimen.support_preference_category_padding_top);
        obtainStyledAttributes.recycle();
    }
}
