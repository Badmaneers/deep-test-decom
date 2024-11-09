package com.color.support.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: ColorEditText.java */
/* renamed from: com.color.support.widget.v */
/* loaded from: classes.dex */
final class C1633v implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ ColorEditText f7805a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    private C1633v(ColorEditText colorEditText) {
        this.f7805a = colorEditText;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1633v(ColorEditText colorEditText, byte b) {
        this(colorEditText);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ColorEditText.m4466a(this.f7805a, this.f7805a.hasFocus());
    }
}
