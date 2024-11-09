package com.google.android.material.p079h;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* compiled from: MaterialAttributes.java */
/* renamed from: com.google.android.material.h.c */
/* loaded from: classes.dex */
public final class C2220c {
    /* renamed from: a */
    public static TypedValue m7043a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: a */
    public static int m7041a(Context context, int i, String str) {
        TypedValue m7043a = m7043a(context, i);
        if (m7043a == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
        }
        return m7043a.data;
    }

    /* renamed from: a */
    public static int m7042a(View view, int i) {
        return m7041a(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public static boolean m7044a(Context context, int i, boolean z) {
        TypedValue m7043a = m7043a(context, i);
        return (m7043a == null || m7043a.type != 18) ? z : m7043a.data != 0;
    }
}
