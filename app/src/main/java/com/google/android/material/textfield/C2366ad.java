package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PasswordToggleEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.ad */
/* loaded from: classes.dex */
public final class C2366ad implements InterfaceC2374al {

    /* renamed from: a */
    final /* synthetic */ C2364ab f10530a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2366ad(C2364ab c2364ab) {
        this.f10530a = c2364ab;
    }

    @Override // com.google.android.material.textfield.InterfaceC2374al
    /* renamed from: a */
    public final void mo7625a(TextInputLayout textInputLayout) {
        TextWatcher textWatcher;
        TextWatcher textWatcher2;
        EditText editText = textInputLayout.getEditText();
        textInputLayout.setEndIconVisible(true);
        this.f10530a.f10575c.setChecked(true ^ C2364ab.m7623a(this.f10530a));
        textWatcher = this.f10530a.f10526d;
        editText.removeTextChangedListener(textWatcher);
        textWatcher2 = this.f10530a.f10526d;
        editText.addTextChangedListener(textWatcher2);
    }
}
