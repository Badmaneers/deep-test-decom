package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.p */
/* loaded from: classes.dex */
public final class C2391p implements InterfaceC2374al {

    /* renamed from: a */
    final /* synthetic */ C2387l f10565a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2391p(C2387l c2387l) {
        this.f10565a = c2387l;
    }

    @Override // com.google.android.material.textfield.InterfaceC2374al
    /* renamed from: a */
    public final void mo7625a(TextInputLayout textInputLayout) {
        TextWatcher textWatcher;
        TextWatcher textWatcher2;
        C2373ak c2373ak;
        AutoCompleteTextView m7634a = C2387l.m7634a(textInputLayout.getEditText());
        C2387l.m7639b(this.f10565a, m7634a);
        C2387l.m7643c(this.f10565a, m7634a);
        C2387l.m7645d(this.f10565a, m7634a);
        m7634a.setThreshold(0);
        textWatcher = this.f10565a.f10550e;
        m7634a.removeTextChangedListener(textWatcher);
        textWatcher2 = this.f10565a.f10550e;
        m7634a.addTextChangedListener(textWatcher2);
        textInputLayout.setErrorIconDrawable((Drawable) null);
        c2373ak = this.f10565a.f10551f;
        textInputLayout.setTextInputAccessibilityDelegate(c2373ak);
        textInputLayout.setEndIconVisible(true);
    }
}
