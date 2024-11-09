package com.color.support.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.SwitchPreference;
import color.support.p043v7.appcompat.R;
import com.color.support.widget.ColorSwitch;

/* loaded from: classes.dex */
public class ColorSwitchPreference extends SwitchPreference {

    /* renamed from: b */
    private final C1333c f5761b;

    /* renamed from: c */
    private boolean f5762c;

    /* renamed from: d */
    private Drawable f5763d;

    /* renamed from: e */
    private boolean f5764e;

    /* renamed from: f */
    private ColorSwitch f5765f;

    /* renamed from: g */
    private boolean f5766g;

    /* renamed from: h */
    private int f5767h;

    /* renamed from: i */
    private float f5768i;

    /* renamed from: j */
    private int f5769j;

    /* renamed from: k */
    private int f5770k;

    /* renamed from: l */
    private CharSequence f5771l;

    public ColorSwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceStyle);
    }

    public ColorSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private ColorSwitchPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
        this.f5761b = new C1333c(this, (byte) 0);
        this.f5762c = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPreference, i, 0);
        this.f5762c = obtainStyledAttributes.getBoolean(R.styleable.ColorPreference_colorShowDivider, this.f5762c);
        this.f5763d = obtainStyledAttributes.getDrawable(R.styleable.ColorPreference_colorDividerDrawable);
        this.f5764e = obtainStyledAttributes.getBoolean(R.styleable.ColorPreference_colorEnalbeClickSpan, false);
        this.f5766g = obtainStyledAttributes.getBoolean(R.styleable.ColorPreference_hasBorder, false);
        this.f5767h = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorPreference_preference_icon_radius, 14);
        this.f5771l = obtainStyledAttributes.getText(R.styleable.ColorPreference_colorAssignment);
        obtainStyledAttributes.recycle();
        this.f5768i = context.getResources().getDisplayMetrics().density;
        this.f5769j = (int) ((this.f5768i * 14.0f) / 3.0f);
        this.f5770k = (int) ((this.f5768i * 36.0f) / 3.0f);
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    /* renamed from: a */
    public final void mo2691a() {
        if (this.f5765f != null) {
            this.f5765f.setShouldPlaySound(true);
        }
        if (this.f5765f != null) {
            this.f5765f.setTactileFeedbackEnabled(true);
        }
        super.mo2691a();
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m4366a(ColorSwitchPreference colorSwitchPreference) {
        if (colorSwitchPreference.m2721p() == null) {
            return true;
        }
        return colorSwitchPreference.m2721p().m2735a();
    }
}
