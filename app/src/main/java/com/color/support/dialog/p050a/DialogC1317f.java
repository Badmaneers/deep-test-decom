package com.color.support.dialog.p050a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import color.support.p043v7.app.DialogInterfaceC1203m;

/* compiled from: ColorSpinnerDialog.java */
/* renamed from: com.color.support.dialog.a.f */
/* loaded from: classes.dex */
public class DialogC1317f extends DialogInterfaceC1203m {

    /* renamed from: c */
    protected View f5572c;

    /* renamed from: d */
    protected TextView f5573d;

    /* renamed from: e */
    protected CharSequence f5574e;

    /* renamed from: f */
    protected boolean f5575f;

    public DialogC1317f(Context context) {
        super(context);
    }

    @Override // color.support.p043v7.app.DialogInterfaceC1203m, androidx.appcompat.app.DialogInterfaceC0101p, androidx.appcompat.app.DialogC0072am, android.app.Dialog
    public void onCreate(Bundle bundle) {
        if (this.f5574e != null) {
            CharSequence charSequence = this.f5574e;
            if (this.f5572c != null) {
                this.f5573d.setText(charSequence);
            } else {
                this.f5574e = charSequence;
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f5575f = true;
    }

    @Override // androidx.appcompat.app.DialogC0072am, android.app.Dialog
    public void onStop() {
        super.onStop();
        this.f5575f = false;
    }
}
