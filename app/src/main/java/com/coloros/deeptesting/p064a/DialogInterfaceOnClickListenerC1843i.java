package com.coloros.deeptesting.p064a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.java */
/* renamed from: com.coloros.deeptesting.a.i */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1843i implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Handler f8570a;

    /* renamed from: b */
    final /* synthetic */ Context f8571b;

    public DialogInterfaceOnClickListenerC1843i(Handler handler, Context context) {
        this.f8570a = handler;
        this.f8571b = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f8570a != null) {
            C1842h.m5957a(this.f8571b, 1004, this.f8570a);
        }
    }
}
