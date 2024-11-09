package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: EndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.w */
/* loaded from: classes.dex */
public abstract class AbstractC2398w {

    /* renamed from: a */
    TextInputLayout f10573a;

    /* renamed from: b */
    Context f10574b;

    /* renamed from: c */
    CheckableImageButton f10575c;

    /* renamed from: a */
    public abstract void mo7621a();

    /* renamed from: a */
    public void mo7622a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo7649a(int i) {
        return true;
    }

    /* renamed from: b */
    public boolean mo7650b() {
        return false;
    }

    public AbstractC2398w(TextInputLayout textInputLayout) {
        this.f10573a = textInputLayout;
        this.f10574b = textInputLayout.getContext();
        this.f10575c = textInputLayout.getEndIconView();
    }
}
