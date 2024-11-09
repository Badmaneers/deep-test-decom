package com.color.support.preference;

import android.content.Context;
import android.util.AttributeSet;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorSwitchWithDividerPreference extends ColorSwitchPreference {
    public ColorSwitchWithDividerPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorSwitchWithDividerPreferenceStyle);
    }

    private ColorSwitchWithDividerPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private ColorSwitchWithDividerPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i);
    }
}
