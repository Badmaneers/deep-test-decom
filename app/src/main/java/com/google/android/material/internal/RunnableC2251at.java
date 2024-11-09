package com.google.android.material.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: ViewUtils.java */
/* renamed from: com.google.android.material.internal.at */
/* loaded from: classes.dex */
final class RunnableC2251at implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f9942a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2251at(View view) {
        this.f9942a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InputMethodManager) this.f9942a.getContext().getSystemService("input_method")).showSoftInput(this.f9942a, 1);
    }
}
