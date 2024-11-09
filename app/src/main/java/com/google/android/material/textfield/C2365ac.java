package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PasswordToggleEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.ac */
/* loaded from: classes.dex */
public final class C2365ac implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C2364ab f10529a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2365ac(C2364ab c2364ab) {
        this.f10529a = c2364ab;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f10529a.f10575c.setChecked(!C2364ab.m7623a(this.f10529a));
    }
}
