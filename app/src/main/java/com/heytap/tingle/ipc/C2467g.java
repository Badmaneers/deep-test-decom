package com.heytap.tingle.ipc;

import android.os.IBinder;
import com.heytap.tingle.ipc.p089a.C2450a;
import com.heytap.tingle.ipc.p089a.C2451b;
import com.heytap.tingle.ipc.p089a.C2452c;
import com.heytap.tingle.ipc.p089a.C2453d;
import com.heytap.tingle.ipc.p089a.C2454e;
import com.heytap.tingle.ipc.p090b.p091a.C2457a;
import com.heytap.tingle.ipc.p090b.p091a.C2458b;
import com.heytap.tingle.ipc.p090b.p092b.C2459a;
import com.heytap.tingle.ipc.p090b.p093c.p094a.C2460a;
import com.heytap.tingle.ipc.p090b.p095d.C2461a;
import com.heytap.tingle.ipc.p090b.p096e.C2462a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p001a.C0000a;

/* compiled from: Slave.java */
/* renamed from: com.heytap.tingle.ipc.g */
/* loaded from: classes.dex */
public final class C2467g {

    /* renamed from: a */
    private static InterfaceC2463c f10743a;

    /* renamed from: b */
    private static List<Object> f10744b = new ArrayList();

    /* renamed from: c */
    private static List<Object> f10745c = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static void m7811a(IBinder iBinder) {
        C0000a.m3a("Slave attach", new Object[0]);
        f10743a = AbstractBinderC2464d.m7808a(iBinder);
        f10744b.add(new C2453d());
        f10744b.add(new C2454e());
        f10744b.add(new C2450a());
        f10744b.add(new C2451b());
        f10744b.add(new C2452c());
        f10745c.add(new C2457a());
        f10745c.add(new C2461a());
        f10745c.add(new C2458b());
        f10745c.add(new C2462a());
        f10745c.add(new C2460a());
        f10745c.add(new C2459a());
    }
}
