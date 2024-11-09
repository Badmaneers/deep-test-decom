package com.google.android.material.p080i;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.C0542a;

/* compiled from: RippleUtils.java */
/* renamed from: com.google.android.material.i.c */
/* loaded from: classes.dex */
public class C2229c {

    /* renamed from: a */
    public static final boolean f9843a;

    /* renamed from: b */
    static final String f9844b;

    /* renamed from: c */
    private static final int[] f9845c;

    /* renamed from: d */
    private static final int[] f9846d;

    /* renamed from: e */
    private static final int[] f9847e;

    /* renamed from: f */
    private static final int[] f9848f;

    /* renamed from: g */
    private static final int[] f9849g;

    /* renamed from: h */
    private static final int[] f9850h;

    /* renamed from: i */
    private static final int[] f9851i;

    /* renamed from: j */
    private static final int[] f9852j;

    /* renamed from: k */
    private static final int[] f9853k;

    /* renamed from: l */
    private static final int[] f9854l;

    static {
        f9843a = Build.VERSION.SDK_INT >= 21;
        f9845c = new int[]{R.attr.state_pressed};
        f9846d = new int[]{R.attr.state_hovered, R.attr.state_focused};
        f9847e = new int[]{R.attr.state_focused};
        f9848f = new int[]{R.attr.state_hovered};
        f9849g = new int[]{R.attr.state_selected, R.attr.state_pressed};
        f9850h = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        f9851i = new int[]{R.attr.state_selected, R.attr.state_focused};
        f9852j = new int[]{R.attr.state_selected, R.attr.state_hovered};
        f9853k = new int[]{R.attr.state_selected};
        f9854l = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        f9844b = C2229c.class.getSimpleName();
    }

    private C2229c() {
    }

    /* renamed from: a */
    public static ColorStateList m7064a(ColorStateList colorStateList) {
        if (f9843a) {
            return new ColorStateList(new int[][]{f9853k, StateSet.NOTHING}, new int[]{m7063a(colorStateList, f9849g), m7063a(colorStateList, f9845c)});
        }
        return new ColorStateList(new int[][]{f9849g, f9850h, f9851i, f9852j, f9853k, f9845c, f9846d, f9847e, f9848f, StateSet.NOTHING}, new int[]{m7063a(colorStateList, f9849g), m7063a(colorStateList, f9850h), m7063a(colorStateList, f9851i), m7063a(colorStateList, f9852j), 0, m7063a(colorStateList, f9845c), m7063a(colorStateList, f9846d), m7063a(colorStateList, f9847e), m7063a(colorStateList, f9848f), 0});
    }

    /* renamed from: b */
    public static ColorStateList m7066b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f9854l, 0)) != 0) {
                Log.w(f9844b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: a */
    public static boolean m7065a(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    /* renamed from: a */
    private static int m7063a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f9843a ? m7062a(colorForState) : colorForState;
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m7062a(int i) {
        return C0542a.m1904b(i, Math.min(Color.alpha(i) * 2, 255));
    }
}
