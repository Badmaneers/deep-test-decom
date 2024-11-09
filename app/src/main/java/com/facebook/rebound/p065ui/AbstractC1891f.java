package com.facebook.rebound.p065ui;

import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* compiled from: Util.java */
/* renamed from: com.facebook.rebound.ui.f */
/* loaded from: classes.dex */
public abstract class AbstractC1891f {
    /* renamed from: a */
    public static final int m6048a(float f, Resources resources) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    /* renamed from: a */
    public static final FrameLayout.LayoutParams m6049a(int i, int i2) {
        return new FrameLayout.LayoutParams(i, i2);
    }
}
