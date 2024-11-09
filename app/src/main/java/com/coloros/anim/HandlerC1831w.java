package com.coloros.anim;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EffectiveAnimationTask.java */
/* renamed from: com.coloros.anim.w */
/* loaded from: classes.dex */
public final class HandlerC1831w extends Handler {

    /* renamed from: a */
    final /* synthetic */ C1830v f8489a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1831w(C1830v c1830v, Looper looper) {
        super(looper);
        this.f8489a = c1830v;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1001) {
            return;
        }
        C1830v.m5928a(this.f8489a);
    }
}
