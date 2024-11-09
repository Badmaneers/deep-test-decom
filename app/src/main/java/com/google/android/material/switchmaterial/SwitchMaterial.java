package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2250as;
import com.google.android.material.p073b.C2063a;
import com.google.android.material.p076e.C2179a;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.theme.p084a.C2402a;

/* loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: c */
    private static final int f10334c = R.style.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: d */
    private static final int[][] f10335d = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    private final C2179a f10336e;

    /* renamed from: f */
    private ColorStateList f10337f;

    /* renamed from: g */
    private ColorStateList f10338g;

    /* renamed from: h */
    private boolean f10339h;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f10334c), attributeSet, i);
        Context context2 = getContext();
        this.f10336e = new C2179a(context2);
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, R.styleable.SwitchMaterial, i, f10334c, new int[0]);
        this.f10339h = m7095a.getBoolean(R.styleable.SwitchMaterial_useMaterialThemeColors, false);
        m7095a.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10339h && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f10339h && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f10339h = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f10337f == null) {
            int m7042a = C2220c.m7042a(this, R.attr.colorSurface);
            int m7042a2 = C2220c.m7042a(this, R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            if (this.f10336e.m6910a()) {
                dimension += C2250as.m7114c(this);
            }
            int m6909a = this.f10336e.m6909a(m7042a, dimension);
            int[] iArr = new int[f10335d.length];
            iArr[0] = C2063a.m6339a(m7042a, m7042a2, 1.0f);
            iArr[1] = m6909a;
            iArr[2] = C2063a.m6339a(m7042a, m7042a2, 0.38f);
            iArr[3] = m6909a;
            this.f10337f = new ColorStateList(f10335d, iArr);
        }
        return this.f10337f;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f10338g == null) {
            int[] iArr = new int[f10335d.length];
            int m7042a = C2220c.m7042a(this, R.attr.colorSurface);
            int m7042a2 = C2220c.m7042a(this, R.attr.colorControlActivated);
            int m7042a3 = C2220c.m7042a(this, R.attr.colorOnSurface);
            iArr[0] = C2063a.m6339a(m7042a, m7042a2, 0.54f);
            iArr[1] = C2063a.m6339a(m7042a, m7042a3, 0.32f);
            iArr[2] = C2063a.m6339a(m7042a, m7042a2, 0.12f);
            iArr[3] = C2063a.m6339a(m7042a, m7042a3, 0.12f);
            this.f10338g = new ColorStateList(f10335d, iArr);
        }
        return this.f10338g;
    }
}
