package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.t */
/* loaded from: classes.dex */
public final class C2395t implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C2387l f10570a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2395t(C2387l c2387l) {
        this.f10570a = c2387l;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        this.f10570a.f10553h = true;
        this.f10570a.f10555j = System.currentTimeMillis();
        this.f10570a.m7640b(false);
    }
}
