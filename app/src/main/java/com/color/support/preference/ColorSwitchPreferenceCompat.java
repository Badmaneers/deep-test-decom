package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.SwitchPreferenceCompat;
import color.support.p043v7.appcompat.R;
import com.color.support.widget.ColorSwitch;

/* loaded from: classes.dex */
public class ColorSwitchPreferenceCompat extends SwitchPreferenceCompat {

    /* renamed from: b */
    private final C1334d f5772b;

    /* renamed from: c */
    private boolean f5773c;

    /* renamed from: d */
    private Drawable f5774d;

    /* renamed from: e */
    private boolean f5775e;

    /* renamed from: f */
    private ColorSwitch f5776f;

    public ColorSwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }

    private ColorSwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private ColorSwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
        this.f5772b = new C1334d(this, (byte) 0);
        this.f5773c = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPreference, i, 0);
        this.f5773c = obtainStyledAttributes.getBoolean(R.styleable.ColorPreference_colorShowDivider, this.f5773c);
        this.f5774d = obtainStyledAttributes.getDrawable(R.styleable.ColorPreference_colorDividerDrawable);
        this.f5775e = obtainStyledAttributes.getBoolean(R.styleable.ColorPreference_colorEnalbeClickSpan, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    /* renamed from: a */
    public final void mo2691a() {
        if (this.f5776f != null) {
            this.f5776f.setShouldPlaySound(true);
        }
        super.mo2691a();
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m4367a(ColorSwitchPreferenceCompat colorSwitchPreferenceCompat) {
        if (colorSwitchPreferenceCompat.m2721p() == null) {
            return true;
        }
        return colorSwitchPreferenceCompat.m2721p().m2735a();
    }
}
