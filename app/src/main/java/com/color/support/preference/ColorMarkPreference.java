package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.CheckBoxPreference;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorMarkPreference extends CheckBoxPreference {

    /* renamed from: b */
    int f5732b;

    /* renamed from: c */
    private boolean f5733c;

    /* renamed from: d */
    private Drawable f5734d;

    /* renamed from: e */
    private boolean f5735e;

    /* renamed from: f */
    private boolean f5736f;

    /* renamed from: g */
    private int f5737g;

    /* renamed from: h */
    private int f5738h;

    /* renamed from: i */
    private int f5739i;

    /* renamed from: j */
    private float f5740j;

    private ColorMarkPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5732b = 0;
        this.f5733c = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorMarkPreference, i, 0);
        this.f5732b = obtainStyledAttributes.getInt(R.styleable.ColorMarkPreference_colorMarkStyle, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPreference, i, 0);
        this.f5733c = obtainStyledAttributes2.getBoolean(R.styleable.ColorPreference_colorShowDivider, this.f5733c);
        this.f5734d = obtainStyledAttributes2.getDrawable(R.styleable.ColorPreference_colorDividerDrawable);
        this.f5735e = obtainStyledAttributes2.getBoolean(R.styleable.ColorPreference_hasBorder, false);
        this.f5737g = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.ColorPreference_preference_icon_radius, 14);
        this.f5736f = obtainStyledAttributes2.getBoolean(R.styleable.ColorPreference_colorEnalbeClickSpan, false);
        obtainStyledAttributes2.recycle();
        m2730d(true);
        this.f5740j = context.getResources().getDisplayMetrics().density;
        this.f5738h = (int) ((this.f5740j * 14.0f) / 3.0f);
        this.f5739i = (int) ((this.f5740j * 36.0f) / 3.0f);
    }

    private ColorMarkPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public ColorMarkPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorMarkPreferenceStyle, (byte) 0);
    }
}
