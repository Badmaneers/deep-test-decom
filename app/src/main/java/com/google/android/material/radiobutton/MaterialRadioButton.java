package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.C0567e;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.p073b.C2063a;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.theme.p084a.C2402a;

/* loaded from: classes.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: a */
    private static final int f10208a = R.style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: b */
    private static final int[][] f10209b = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: c */
    private ColorStateList f10210c;

    /* renamed from: d */
    private boolean f10211d;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f10208a), attributeSet, i);
        TypedArray m7095a = C2243al.m7095a(getContext(), attributeSet, R.styleable.MaterialRadioButton, i, f10208a, new int[0]);
        this.f10211d = m7095a.getBoolean(R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        m7095a.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10211d && C0567e.m2035a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f10211d = z;
        if (z) {
            C0567e.m2036a(this, getMaterialThemeColorsTintList());
        } else {
            C0567e.m2036a(this, null);
        }
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10210c == null) {
            int m7042a = C2220c.m7042a(this, R.attr.colorControlActivated);
            int m7042a2 = C2220c.m7042a(this, R.attr.colorOnSurface);
            int m7042a3 = C2220c.m7042a(this, R.attr.colorSurface);
            int[] iArr = new int[f10209b.length];
            iArr[0] = C2063a.m6339a(m7042a3, m7042a, 1.0f);
            iArr[1] = C2063a.m6339a(m7042a3, m7042a2, 0.54f);
            iArr[2] = C2063a.m6339a(m7042a3, m7042a2, 0.38f);
            iArr[3] = C2063a.m6339a(m7042a3, m7042a2, 0.38f);
            this.f10210c = new ColorStateList(f10209b, iArr);
        }
        return this.f10210c;
    }
}
