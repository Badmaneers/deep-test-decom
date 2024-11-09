package com.google.android.material.textfield;

import android.text.Editable;
import android.view.View;

/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.e */
/* loaded from: classes.dex */
final class ViewOnClickListenerC2380e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2362a f10541a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC2380e(C2362a c2362a) {
        this.f10541a = c2362a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text = this.f10541a.f10573a.getEditText().getText();
        if (text != null) {
            text.clear();
        }
    }
}
