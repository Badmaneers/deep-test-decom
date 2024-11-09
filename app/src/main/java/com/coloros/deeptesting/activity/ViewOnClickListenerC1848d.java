package com.coloros.deeptesting.activity;

import android.view.View;
import android.widget.Button;

/* compiled from: ApplyActivity.java */
/* renamed from: com.coloros.deeptesting.activity.d */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1848d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ApplyActivity f8600a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1848d(ApplyActivity applyActivity) {
        this.f8600a = applyActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        Button button;
        boolean z2;
        ApplyActivity applyActivity = this.f8600a;
        z = this.f8600a.f8579q;
        applyActivity.f8579q = !z;
        button = this.f8600a.f8576n;
        z2 = this.f8600a.f8579q;
        button.setEnabled(z2);
    }
}
