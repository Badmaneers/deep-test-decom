package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.m */
/* loaded from: classes.dex */
public final class C2388m implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C2387l f10561a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2388m(C2387l c2387l) {
        this.f10561a = c2387l;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AutoCompleteTextView m7634a = C2387l.m7634a(this.f10561a.f10573a.getEditText());
        m7634a.post(new RunnableC2389n(this, m7634a));
    }
}
