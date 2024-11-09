package com.heytap.tingle.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class PersistService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return BinderC2466f.m7810c();
    }
}
