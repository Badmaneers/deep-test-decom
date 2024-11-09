package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0830aj;

/* compiled from: SmoothCalendarLayoutManager.java */
/* renamed from: com.google.android.material.datepicker.as */
/* loaded from: classes.dex */
final class C2149as extends C0830aj {

    /* renamed from: f */
    final /* synthetic */ C2148ar f9584f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2149as(C2148ar c2148ar, Context context) {
        super(context);
        this.f9584f = c2148ar;
    }

    @Override // androidx.recyclerview.widget.C0830aj
    /* renamed from: a */
    protected final float mo2950a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
