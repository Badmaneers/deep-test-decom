package com.color.support.dialog.p050a;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorRotatingSpinnerDialog.java */
/* renamed from: com.color.support.dialog.a.d */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1315d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ DialogC1312a f5570a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1315d(DialogC1312a dialogC1312a) {
        this.f5570a = dialogC1312a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        z = this.f5570a.f5567l;
        if (z && this.f5570a.isShowing()) {
            this.f5570a.dismiss();
        }
    }
}
