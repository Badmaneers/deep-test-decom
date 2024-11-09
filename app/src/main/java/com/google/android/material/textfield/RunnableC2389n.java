package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.n */
/* loaded from: classes.dex */
final class RunnableC2389n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AutoCompleteTextView f10562a;

    /* renamed from: b */
    final /* synthetic */ C2388m f10563b;

    public RunnableC2389n(C2388m c2388m, AutoCompleteTextView autoCompleteTextView) {
        this.f10563b = c2388m;
        this.f10562a = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isPopupShowing = this.f10562a.isPopupShowing();
        this.f10563b.f10561a.m7640b(isPopupShowing);
        this.f10563b.f10561a.f10553h = isPopupShowing;
    }
}
