package com.google.android.material.p079h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.widget.C0276dn;

/* compiled from: MaterialResources.java */
/* renamed from: com.google.android.material.h.d */
/* loaded from: classes.dex */
public final class C2221d {
    /* renamed from: a */
    public static ColorStateList m7045a(Context context, TypedArray typedArray, int i) {
        int color2;
        int resourceId;
        ColorStateList m45a;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (m45a = C0057a.m45a(context, resourceId)) != null) {
            return m45a;
        }
        if (Build.VERSION.SDK_INT <= 15 && (color2 = typedArray.getColor(i, -1)) != -1) {
            return ColorStateList.valueOf(color2);
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: a */
    public static ColorStateList m7046a(Context context, C0276dn c0276dn, int i) {
        int m950b;
        int m962g;
        ColorStateList m45a;
        if (c0276dn.m964i(i) && (m962g = c0276dn.m962g(i, 0)) != 0 && (m45a = C0057a.m45a(context, m962g)) != null) {
            return m45a;
        }
        if (Build.VERSION.SDK_INT <= 15 && (m950b = c0276dn.m950b(i, -1)) != -1) {
            return ColorStateList.valueOf(m950b);
        }
        return c0276dn.m960f(i);
    }

    /* renamed from: b */
    public static Drawable m7047b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m46b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m46b = C0057a.m46b(context, resourceId)) == null) ? typedArray.getDrawable(i) : m46b;
    }

    /* renamed from: c */
    public static C2222e m7048c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C2222e(context, resourceId);
    }

    /* renamed from: d */
    public static int m7049d(Context context, TypedArray typedArray, int i) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, -1);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }
}
