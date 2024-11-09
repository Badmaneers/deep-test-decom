package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextInputLayout.java */
/* renamed from: com.google.android.material.textfield.ag */
/* loaded from: classes.dex */
public final class C2369ag implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f10533a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2369ag(TextInputLayout textInputLayout) {
        this.f10533a = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        boolean z2;
        TextInputLayout textInputLayout = this.f10533a;
        z = this.f10533a.f10469aH;
        textInputLayout.m7611a(!z);
        if (this.f10533a.f10496b) {
            this.f10533a.m7607a(editable.length());
        }
        z2 = this.f10533a.f10510q;
        if (z2) {
            this.f10533a.m7576b(editable.length());
        }
    }
}
