package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0276dn;
import com.google.android.material.R;

/* compiled from: ThemeEnforcement.java */
/* renamed from: com.google.android.material.internal.al */
/* loaded from: classes.dex */
public final class C2243al {

    /* renamed from: a */
    private static final int[] f9932a = {R.attr.colorPrimary};

    /* renamed from: b */
    private static final int[] f9933b = {R.attr.colorPrimaryVariant};

    /* renamed from: a */
    public static TypedArray m7095a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m7097a(context, attributeSet, i, i2);
        m7102c(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: b */
    public static C0276dn m7100b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m7097a(context, attributeSet, i, i2);
        m7102c(context, attributeSet, iArr, i, i2, iArr2);
        return C0276dn.m944a(context, attributeSet, iArr, i, i2);
    }

    /* renamed from: a */
    private static void m7097a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m7096a(context);
            }
        }
        m7101b(context);
    }

    /* renamed from: c */
    private static void m7102c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z = obtainStyledAttributes.getResourceId(R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            z = m7103d(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: d */
    private static boolean m7103d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: b */
    private static void m7101b(Context context) {
        m7098a(context, f9932a, "Theme.AppCompat");
    }

    /* renamed from: a */
    public static void m7096a(Context context) {
        m7098a(context, f9933b, "Theme.MaterialComponents");
    }

    /* renamed from: a */
    private static boolean m7099a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: a */
    private static void m7098a(Context context, int[] iArr, String str) {
        if (m7099a(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }
}
