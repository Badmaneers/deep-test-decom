package androidx.core.p021d;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelfDestructiveThread.java */
/* renamed from: androidx.core.d.k */
/* loaded from: classes.dex */
public final class C0449k implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C0448j f2212a;

    public C0449k(C0448j c0448j) {
        this.f2212a = c0448j;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f2212a.m1575a();
                return true;
            case 1:
                this.f2212a.m1576a((Runnable) message.obj);
                return true;
            default:
                return true;
        }
    }
}
