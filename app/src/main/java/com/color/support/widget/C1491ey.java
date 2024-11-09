package com.color.support.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ErrorEditTextHelper.java */
/* renamed from: com.color.support.widget.ey */
/* loaded from: classes.dex */
public final class C1491ey implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C1490ex f7152a;

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1491ey(C1490ex c1490ex) {
        this.f7152a = c1490ex;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float f;
        EditText editText;
        f = this.f7152a.f7151v;
        if (f <= 0.0f) {
            C1490ex c1490ex = this.f7152a;
            editText = this.f7152a.f7131b;
            c1490ex.f7151v = editText.getHeight();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText;
        EditText editText2;
        this.f7152a.m5017a(false, false, false);
        editText = this.f7152a.f7131b;
        Editable text = editText.getText();
        int length = text.length();
        C1490ex c1490ex = this.f7152a;
        editText2 = this.f7152a.f7131b;
        c1490ex.f7150u = editText2.getPaint().measureText(text, 0, length);
    }
}
