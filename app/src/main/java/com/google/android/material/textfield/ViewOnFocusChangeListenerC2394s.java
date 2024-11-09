package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.s */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC2394s implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C2387l f10569a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnFocusChangeListenerC2394s(C2387l c2387l) {
        this.f10569a = c2387l;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.f10569a.f10573a.setEndIconActivated(z);
        if (z) {
            return;
        }
        this.f10569a.m7640b(false);
        this.f10569a.f10553h = false;
    }
}
