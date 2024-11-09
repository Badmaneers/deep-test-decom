package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import androidx.appcompat.p006a.p007a.C0057a;
import com.google.android.material.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PasswordToggleEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.ab */
/* loaded from: classes.dex */
public final class C2364ab extends AbstractC2398w {

    /* renamed from: d */
    private final TextWatcher f10526d;

    /* renamed from: e */
    private final InterfaceC2374al f10527e;

    /* renamed from: f */
    private final InterfaceC2375am f10528f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2364ab(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f10526d = new C2365ac(this);
        this.f10527e = new C2366ad(this);
        this.f10528f = new C2367ae(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2398w
    /* renamed from: a */
    public final void mo7621a() {
        this.f10573a.setEndIconDrawable(C0057a.m46b(this.f10574b, R.drawable.design_password_eye));
        this.f10573a.setEndIconContentDescription(this.f10573a.getResources().getText(R.string.password_toggle_content_description));
        this.f10573a.setEndIconOnClickListener(new ViewOnClickListenerC2368af(this));
        this.f10573a.m7609a(this.f10527e);
        this.f10573a.m7610a(this.f10528f);
        EditText editText = this.f10573a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m7623a(C2364ab c2364ab) {
        EditText editText = c2364ab.f10573a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
