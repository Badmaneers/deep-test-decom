package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.C0567e;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.p073b.C2063a;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.theme.p084a.C2402a;

/* loaded from: classes.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: a */
    private static final int f9402a = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: b */
    private static final int[][] f9403b = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: c */
    private ColorStateList f9404c;

    /* renamed from: d */
    private boolean f9405d;

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9402a), attributeSet, i);
        Context context2 = getContext();
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, R.styleable.MaterialCheckBox, i, f9402a, new int[0]);
        if (m7095a.hasValue(R.styleable.MaterialCheckBox_buttonTint)) {
            C0567e.m2036a(this, C2221d.m7045a(context2, m7095a, R.styleable.MaterialCheckBox_buttonTint));
        }
        this.f9405d = m7095a.getBoolean(R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        m7095a.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9405d && C0567e.m2035a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f9405d = z;
        if (z) {
            C0567e.m2036a(this, getMaterialThemeColorsTintList());
        } else {
            C0567e.m2036a(this, null);
        }
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9404c == null) {
            int[] iArr = new int[f9403b.length];
            int m7042a = C2220c.m7042a(this, R.attr.colorControlActivated);
            int m7042a2 = C2220c.m7042a(this, R.attr.colorSurface);
            int m7042a3 = C2220c.m7042a(this, R.attr.colorOnSurface);
            iArr[0] = C2063a.m6339a(m7042a2, m7042a, 1.0f);
            iArr[1] = C2063a.m6339a(m7042a2, m7042a3, 0.54f);
            iArr[2] = C2063a.m6339a(m7042a2, m7042a3, 0.38f);
            iArr[3] = C2063a.m6339a(m7042a2, m7042a3, 0.38f);
            this.f9404c = new ColorStateList(f9403b, iArr);
        }
        return this.f9404c;
    }
}
