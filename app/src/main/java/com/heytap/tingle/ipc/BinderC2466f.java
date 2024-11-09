package com.heytap.tingle.ipc;

import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.system.Os;
import com.heytap.shield.C2441b;

/* compiled from: Master.java */
/* renamed from: com.heytap.tingle.ipc.f */
/* loaded from: classes.dex */
public final class BinderC2466f extends AbstractBinderC2464d {

    /* renamed from: a */
    private static final Object f10741a = new Object();

    /* renamed from: b */
    private static BinderC2466f f10742b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static BinderC2466f m7810c() {
        synchronized (f10741a) {
            if (f10742b == null) {
                f10742b = new BinderC2466f();
            }
        }
        return f10742b;
    }

    private BinderC2466f() {
    }

    @Override // com.heytap.tingle.ipc.AbstractBinderC2464d, android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("com.heytap.epona.binder");
            IBinder readStrongBinder = parcel.readStrongBinder();
            int readInt = parcel.readInt();
            parcel.readStringArray();
            C2441b.m7776b();
            if (C2441b.m7775a() && !C2441b.m7776b().m7779a(readStrongBinder.getInterfaceDescriptor(), readInt)) {
                throw new SecurityException("Tingle Authentication Failed.");
            }
            Parcel obtain = Parcel.obtain();
            try {
                obtain.appendFrom(parcel, parcel.dataPosition(), parcel.dataAvail());
            } catch (Throwable unused) {
            }
            try {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                readStrongBinder.transact(readInt, obtain, parcel2, i2);
                Binder.restoreCallingIdentity(clearCallingIdentity);
                return true;
            } finally {
                obtain.recycle();
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    @Override // com.heytap.tingle.ipc.InterfaceC2463c
    /* renamed from: a */
    public final int mo7807a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Os.getuid();
        }
        return -1;
    }
}
