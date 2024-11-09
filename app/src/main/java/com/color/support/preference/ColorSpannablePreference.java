package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorSpannablePreference extends Preference {

    /* renamed from: a */
    private CharSequence f5755a;

    public ColorSpannablePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPreference, 0, 0);
        this.f5755a = obtainStyledAttributes.getText(R.styleable.ColorPreference_colorAssignment);
        obtainStyledAttributes.recycle();
    }
}
