package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.b */
/* loaded from: classes.dex */
public final class C2377b implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C2362a f10538a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2377b(C2362a c2362a) {
        this.f10538a = c2362a;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f10538a.f10573a.getSuffixText() != null) {
            return;
        }
        this.f10538a.m7620b(C2362a.m7619a(editable));
    }
}
