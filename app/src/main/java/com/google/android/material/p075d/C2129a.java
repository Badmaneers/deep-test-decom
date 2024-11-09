package com.google.android.material.p075d;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableUtils.java */
/* renamed from: com.google.android.material.d.a */
/* loaded from: classes.dex */
public final class C2129a {
    /* renamed from: a */
    public static PorterDuffColorFilter m6789a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
