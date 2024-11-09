package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorPreference extends Preference {

    /* renamed from: a */
    private boolean f5748a;

    /* renamed from: b */
    private CharSequence f5749b;

    public ColorPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5748a = true;
        m4364a(context, attributeSet, 0);
    }

    public ColorPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, (byte) 0);
        this.f5748a = true;
        m4364a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m4364a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPreference, i, 0);
        this.f5749b = obtainStyledAttributes.getText(R.styleable.ColorPreference_colorAssignment);
        obtainStyledAttributes.recycle();
    }
}
