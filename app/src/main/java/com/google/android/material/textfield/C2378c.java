package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.c */
/* loaded from: classes.dex */
public final class C2378c implements InterfaceC2374al {

    /* renamed from: a */
    final /* synthetic */ C2362a f10539a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2378c(C2362a c2362a) {
        this.f10539a = c2362a;
    }

    @Override // com.google.android.material.textfield.InterfaceC2374al
    /* renamed from: a */
    public final void mo7625a(TextInputLayout textInputLayout) {
        TextWatcher textWatcher;
        TextWatcher textWatcher2;
        EditText editText = textInputLayout.getEditText();
        textInputLayout.setEndIconVisible(C2362a.m7619a(editText.getText()));
        textInputLayout.setEndIconCheckable(false);
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2379d(this));
        textWatcher = this.f10539a.f10522d;
        editText.removeTextChangedListener(textWatcher);
        textWatcher2 = this.f10539a.f10522d;
        editText.addTextChangedListener(textWatcher2);
    }
}
