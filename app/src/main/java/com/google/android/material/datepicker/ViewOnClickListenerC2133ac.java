package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: MaterialDatePicker.java */
/* renamed from: com.google.android.material.datepicker.ac */
/* loaded from: classes.dex */
final class ViewOnClickListenerC2133ac implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2177y f9556a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC2133ac(C2177y c2177y) {
        this.f9556a = c2177y;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CheckableImageButton checkableImageButton;
        CheckableImageButton checkableImageButton2;
        checkableImageButton = this.f9556a.f9671av;
        checkableImageButton.toggle();
        C2177y c2177y = this.f9556a;
        checkableImageButton2 = this.f9556a.f9671av;
        c2177y.m6895a(checkableImageButton2);
        this.f9556a.m6898ag();
    }
}
