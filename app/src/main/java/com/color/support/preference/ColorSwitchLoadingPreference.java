package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.SwitchPreferenceCompat;
import color.support.p043v7.appcompat.R;
import com.color.support.widget.ColorSwitch;

/* loaded from: classes.dex */
public class ColorSwitchLoadingPreference extends SwitchPreferenceCompat {

    /* renamed from: b */
    private ColorSwitch f5756b;

    /* renamed from: c */
    private final C1332b f5757c;

    /* renamed from: d */
    private boolean f5758d;

    /* renamed from: e */
    private Drawable f5759e;

    /* renamed from: f */
    private boolean f5760f;

    public ColorSwitchLoadingPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorSwitchLoadPreferenceStyle);
    }

    private ColorSwitchLoadingPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private ColorSwitchLoadingPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
        this.f5757c = new C1332b(this, (byte) 0);
        this.f5758d = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPreference, i, 0);
        this.f5758d = obtainStyledAttributes.getBoolean(R.styleable.ColorPreference_colorShowDivider, this.f5758d);
        this.f5759e = obtainStyledAttributes.getDrawable(R.styleable.ColorPreference_colorDividerDrawable);
        this.f5760f = obtainStyledAttributes.getBoolean(R.styleable.ColorPreference_colorEnalbeClickSpan, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    /* renamed from: a */
    public final void mo2691a() {
        if (this.f5756b != null) {
            this.f5756b.setShouldPlaySound(true);
            this.f5756b.setTactileFeedbackEnabled(true);
            this.f5756b.m4770a();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m4365a(ColorSwitchLoadingPreference colorSwitchLoadingPreference) {
        if (colorSwitchLoadingPreference.m2721p() == null) {
            return true;
        }
        return colorSwitchLoadingPreference.m2721p().m2735a();
    }
}
