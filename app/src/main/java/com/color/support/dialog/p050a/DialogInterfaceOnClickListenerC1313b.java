package com.color.support.dialog.p050a;

import android.content.DialogInterface;

/* compiled from: ColorRotatingSpinnerDialog.java */
/* renamed from: com.color.support.dialog.a.b */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1313b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ DialogC1312a f5568a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnClickListenerC1313b(DialogC1312a dialogC1312a) {
        this.f5568a = dialogC1312a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface.OnCancelListener onCancelListener;
        DialogInterface.OnCancelListener onCancelListener2;
        onCancelListener = this.f5568a.f5563h;
        if (onCancelListener != null) {
            onCancelListener2 = this.f5568a.f5563h;
            onCancelListener2.onCancel(dialogInterface);
        }
    }
}
