package com.google.android.material.textfield;

import android.view.View;
import android.widget.AutoCompleteTextView;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.q */
/* loaded from: classes.dex */
final class ViewOnClickListenerC2392q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2387l f10566a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC2392q(C2387l c2387l) {
        this.f10566a = c2387l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2387l.m7636a(this.f10566a, (AutoCompleteTextView) this.f10566a.f10573a.getEditText());
    }
}
