package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PasswordToggleEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.ae */
/* loaded from: classes.dex */
public final class C2367ae implements InterfaceC2375am {

    /* renamed from: a */
    final /* synthetic */ C2364ab f10531a;

    public C2367ae(C2364ab c2364ab) {
        this.f10531a = c2364ab;
    }

    @Override // com.google.android.material.textfield.InterfaceC2375am
    /* renamed from: a */
    public final void mo7626a(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.getEditText();
        if (editText == null || i != 1) {
            return;
        }
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
}
