package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MultiInstanceInvalidationClient.java */
/* renamed from: androidx.room.o */
/* loaded from: classes.dex */
public final class C0958o {

    /* renamed from: a */
    final Context f3911a;

    /* renamed from: b */
    final String f3912b;

    /* renamed from: c */
    int f3913c;

    /* renamed from: d */
    final C0953j f3914d;

    /* renamed from: e */
    final AbstractC0956m f3915e;

    /* renamed from: f */
    InterfaceC0949f f3916f;

    /* renamed from: g */
    final Executor f3917g;

    /* renamed from: h */
    final InterfaceC0946c f3918h = new BinderC0959p(this);

    /* renamed from: i */
    final AtomicBoolean f3919i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f3920j = new ServiceConnectionC0961r(this);

    /* renamed from: k */
    final Runnable f3921k = new RunnableC0962s(this);

    /* renamed from: l */
    final Runnable f3922l = new RunnableC0963t(this);

    /* renamed from: m */
    private final Runnable f3923m = new RunnableC0964u(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0958o(Context context, String str, C0953j c0953j, Executor executor) {
        this.f3911a = context.getApplicationContext();
        this.f3912b = str;
        this.f3914d = c0953j;
        this.f3917g = executor;
        this.f3915e = new C0965v(this, (String[]) c0953j.f3888a.keySet().toArray(new String[0]));
        this.f3911a.bindService(new Intent(this.f3911a, (Class<?>) MultiInstanceInvalidationService.class), this.f3920j, 1);
    }
}
