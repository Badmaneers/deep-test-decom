package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.ah */
/* loaded from: classes.dex */
public final class C0067ah extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ AbstractC0066ag f205a;

    public C0067ah(AbstractC0066ag abstractC0066ag) {
        this.f205a = abstractC0066ag;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f205a.mo179b();
    }
}
