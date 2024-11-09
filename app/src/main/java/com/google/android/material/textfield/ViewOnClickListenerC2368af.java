package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.af */
/* loaded from: classes.dex */
final class ViewOnClickListenerC2368af implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2364ab f10532a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC2368af(C2364ab c2364ab) {
        this.f10532a = c2364ab;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = this.f10532a.f10573a.getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (C2364ab.m7623a(this.f10532a)) {
            editText.setTransformationMethod(null);
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            editText.setSelection(selectionEnd);
        }
    }
}
