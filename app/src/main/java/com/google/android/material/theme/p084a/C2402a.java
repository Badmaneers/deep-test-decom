package com.google.android.material.theme.p084a;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.C0131e;

/* compiled from: MaterialThemeOverlay.java */
/* renamed from: com.google.android.material.theme.a.a */
/* loaded from: classes.dex */
public final class C2402a {

    /* renamed from: a */
    private static final int[] f10605a = {R.attr.theme, com.google.android.material.R.attr.theme};

    /* renamed from: b */
    private static final int[] f10606b = {com.google.android.material.R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m7691a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10606b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof C0131e) && ((C0131e) context).getThemeResId() == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0131e c0131e = new C0131e(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f10605a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0131e.getTheme().applyStyle(resourceId2, true);
        }
        return c0131e;
    }
}
