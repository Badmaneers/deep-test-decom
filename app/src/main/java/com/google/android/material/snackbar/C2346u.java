package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnackbarManager.java */
/* renamed from: com.google.android.material.snackbar.u */
/* loaded from: classes.dex */
public final class C2346u implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C2345t f10329a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2346u(C2345t c2345t) {
        this.f10329a = c2345t;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        this.f10329a.m7463a((C2348w) message.obj);
        return true;
    }
}
