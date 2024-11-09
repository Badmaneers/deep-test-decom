package com.coloros.deeptesting.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Messenger;
import com.coloros.deeptesting.p064a.C1841g;
import com.coloros.deeptesting.p064a.C1842h;
import com.coloros.neton.NetonClient;
import com.coloros.neton.NetonException;
import com.google.p066a.C2015j;

/* loaded from: classes.dex */
public class RequestService extends Service {

    /* renamed from: a */
    private Context f8610a;

    /* renamed from: b */
    private HandlerThread f8611b;

    /* renamed from: c */
    private Handler f8612c;

    /* renamed from: d */
    private Messenger f8613d;

    /* renamed from: e */
    private String f8614e;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f8610a = this;
        try {
            NetonClient.getInstance().init(getApplicationContext());
        } catch (NetonException e) {
            C1841g.m5952a("Utils", "neton init error");
            e.printStackTrace();
        }
        this.f8611b = new HandlerThread("Request");
        this.f8611b.start();
        if (this.f8611b.getLooper() != null) {
            this.f8612c = new HandlerC1858a(this, this.f8611b.getLooper());
        } else {
            stopSelf();
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && intent.getExtras() != null) {
            this.f8613d = (Messenger) intent.getExtras().get("Messenger");
            if (this.f8610a.getPackageManager().hasSystemFeature("oppo.version.exp")) {
                this.f8614e = "https://lkf.realmemobile.com/realme/v1/";
            } else {
                this.f8614e = "https://lk.realmemobile.com/realme/v1/";
            }
            switch (((Integer) intent.getExtras().get("MessengerFlag")).intValue()) {
                case 1000:
                    this.f8614e += "applyLkUnlock";
                    break;
                case 1001:
                    this.f8614e += "checkApproveResult";
                    break;
                case 1002:
                    this.f8614e += "updateLockStatus";
                    break;
                case 1003:
                    this.f8614e += "acquireClientStatus";
                    break;
                case 1004:
                    this.f8614e += "closeApply";
                    break;
                case 1005:
                    this.f8614e += "acquireApplyStatus";
                    break;
            }
            this.f8612c.sendEmptyMessage(0);
            return 2;
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f8611b.quit();
    }

    /* renamed from: a */
    public final C1860c m5990a() {
        C1859b c1859b = new C1859b();
        c1859b.m5991a(this.f8610a);
        String m5955a = C1842h.m5955a(c1859b);
        C1841g.m5952a("RequestService", this.f8614e);
        C1841g.m5952a("RequestService", m5955a);
        String m5989a = m5989a(this.f8614e, m5955a);
        C1841g.m5952a("RequestService", m5989a);
        try {
            return (C1860c) new C2015j().m6220a(m5989a, C1860c.class);
        } catch (Exception e) {
            C1841g.m5953b("RequestService", "parser error gson when parsing update query response from server");
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053 A[Catch: Exception -> 0x003b, all -> 0x008e, TryCatch #3 {Exception -> 0x003b, blocks: (B:18:0x0029, B:26:0x003d, B:28:0x004a, B:33:0x0053, B:35:0x0060), top: B:16:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [neton.Response] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m5989a(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto Lb
            java.lang.String r3 = "RequestService"
            java.lang.String r4 = "request url is null"
            com.coloros.deeptesting.p064a.C1841g.m5952a(r3, r4)
            return r0
        Lb:
            if (r4 != 0) goto L15
            java.lang.String r3 = "RequestService"
            java.lang.String r4 = "request string is null"
            com.coloros.deeptesting.p064a.C1841g.m5952a(r3, r4)
            return r0
        L15:
            java.lang.String r4 = com.coloros.deeptesting.p064a.C1835a.m5937a(r4)
            if (r4 != 0) goto L23
            java.lang.String r3 = "RequestService"
            java.lang.String r4 = " json request is null after encrypt"
            com.coloros.deeptesting.p064a.C1841g.m5952a(r3, r4)
            return r0
        L23:
            neton.Response r3 = com.coloros.deeptesting.p064a.C1842h.m5956a(r3, r4)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L77
            if (r3 != 0) goto L3d
            java.lang.String r4 = "RequestService"
            java.lang.String r1 = "neton response is null"
            com.coloros.deeptesting.p064a.C1841g.m5952a(r4, r1)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L8e
            if (r3 == 0) goto L3a
            r3.close()     // Catch: com.coloros.neton.NetonException -> L36
            goto L3a
        L36:
            r3 = move-exception
            r3.printStackTrace()
        L3a:
            return r0
        L3b:
            r4 = move-exception
            goto L79
        L3d:
            r3.code()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L8e
            neton.ResponseBody r4 = r3.body()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L8e
            byte[] r4 = r4.bytes()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L8e
            if (r4 == 0) goto L50
            int r1 = r4.length     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L8e
            if (r1 != 0) goto L4e
            goto L50
        L4e:
            r1 = 0
            goto L51
        L50:
            r1 = 1
        L51:
            if (r1 != 0) goto L68
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L8e
            java.lang.String r2 = "UTF-8"
            r1.<init>(r4, r2)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L8e
            java.lang.String r4 = com.coloros.deeptesting.p064a.C1835a.m5939b(r1)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L8e
            if (r4 != 0) goto L69
            java.lang.String r1 = "RequestService"
            java.lang.String r2 = "decryptJsonFromServer reslut is null"
            com.coloros.deeptesting.p064a.C1841g.m5952a(r1, r2)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L8e
            goto L69
        L68:
            r4 = r0
        L69:
            if (r3 == 0) goto L73
            r3.close()     // Catch: com.coloros.neton.NetonException -> L6f
            goto L73
        L6f:
            r3 = move-exception
            r3.printStackTrace()
        L73:
            return r4
        L74:
            r4 = move-exception
            r3 = r0
            goto L8f
        L77:
            r4 = move-exception
            r3 = r0
        L79:
            java.lang.String r1 = "RequestService"
            java.lang.String r2 = "post to server occur"
            com.coloros.deeptesting.p064a.C1841g.m5954c(r1, r2)     // Catch: java.lang.Throwable -> L8e
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L8d
            r3.close()     // Catch: com.coloros.neton.NetonException -> L89
            goto L8d
        L89:
            r3 = move-exception
            r3.printStackTrace()
        L8d:
            return r0
        L8e:
            r4 = move-exception
        L8f:
            if (r3 == 0) goto L99
            r3.close()     // Catch: com.coloros.neton.NetonException -> L95
            goto L99
        L95:
            r3 = move-exception
            r3.printStackTrace()
        L99:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coloros.deeptesting.service.RequestService.m5989a(java.lang.String, java.lang.String):java.lang.String");
    }
}
