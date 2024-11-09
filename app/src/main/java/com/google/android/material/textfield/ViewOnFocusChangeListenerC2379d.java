package com.google.android.material.textfield;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.d */
/* loaded from: classes.dex */
final class ViewOnFocusChangeListenerC2379d implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C2378c f10540a;

    public ViewOnFocusChangeListenerC2379d(C2378c c2378c) {
        this.f10540a = c2378c;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.f10540a.f10539a.m7620b((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z);
    }
}
