package com.heytap.epona.ipc.remote;

import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Dispatcher.java */
/* renamed from: com.heytap.epona.ipc.remote.a */
/* loaded from: classes.dex */
public class C2424a {

    /* renamed from: a */
    private static volatile C2424a f10672a;

    /* renamed from: b */
    private Map<String, IBinder> f10673b = new ConcurrentHashMap();

    /* renamed from: c */
    private Map<String, List<String>> f10674c = new ConcurrentHashMap();

    private C2424a() {
    }

    /* renamed from: a */
    public static C2424a m7720a() {
        if (f10672a == null) {
            synchronized (C2424a.class) {
                if (f10672a == null) {
                    f10672a = new C2424a();
                }
            }
        }
        return f10672a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m7722b(String str) {
        this.f10673b.remove(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:            if (r4.f10673b.containsKey(r5) != false) goto L14;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:            return true;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m7724a(final java.lang.String r5, android.os.IBinder r6, java.lang.String r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.heytap.epona.ipc.remote.-$$Lambda$a$Op8xPTjIUq-kW84YyB8w8G61Ov8 r2 = new com.heytap.epona.ipc.remote.-$$Lambda$a$Op8xPTjIUq-kW84YyB8w8G61Ov8     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            r2.<init>()     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            r6.linkToDeath(r2, r1)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            java.util.Map<java.lang.String, android.os.IBinder> r2 = r4.f10673b
            boolean r2 = r2.containsKey(r5)
            if (r2 != 0) goto L2c
        L12:
            java.util.Map<java.lang.String, android.os.IBinder> r1 = r4.f10673b
            r1.put(r5, r6)
            r4.m7721a(r5, r7)
            goto L2d
        L1b:
            r0 = move-exception
            goto L2e
        L1d:
            r2 = move-exception
            java.lang.String r3 = "Dispatcher"
            com.heytap.epona.p085a.C2412a.m7710a(r3, r2)     // Catch: java.lang.Throwable -> L1b
            java.util.Map<java.lang.String, android.os.IBinder> r2 = r4.f10673b
            boolean r2 = r2.containsKey(r5)
            if (r2 != 0) goto L2c
            goto L12
        L2c:
            r0 = r1
        L2d:
            return r0
        L2e:
            java.util.Map<java.lang.String, android.os.IBinder> r1 = r4.f10673b
            boolean r1 = r1.containsKey(r5)
            if (r1 != 0) goto L3e
            java.util.Map<java.lang.String, android.os.IBinder> r1 = r4.f10673b
            r1.put(r5, r6)
            r4.m7721a(r5, r7)
        L3e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.epona.ipc.remote.C2424a.m7724a(java.lang.String, android.os.IBinder, java.lang.String):boolean");
    }

    /* renamed from: a */
    private void m7721a(String str, String str2) {
        List<String> list = this.f10674c.get(str2);
        if (list == null) {
            list = new ArrayList<>();
            this.f10674c.put(str2, list);
        }
        list.add(str);
    }

    /* renamed from: a */
    public final IBinder m7723a(String str) {
        return this.f10673b.get(str);
    }

    /* renamed from: b */
    public final String m7725b() {
        return this.f10674c.toString();
    }
}
