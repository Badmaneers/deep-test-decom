package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a */
    int f3780a = 0;

    /* renamed from: b */
    final HashMap<Integer, String> f3781b = new HashMap<>();

    /* renamed from: c */
    final RemoteCallbackList<InterfaceC0946c> f3782c = new RemoteCallbackListC0966w(this);

    /* renamed from: d */
    private final AbstractBinderC0950g f3783d = new BinderC0967x(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f3783d;
    }
}
