package com.coloros.deeptesting.p064a;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Messenger;
import android.os.SystemProperties;
import android.service.persistentdata.PersistentDataBlockManager;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import color.support.p043v7.app.C1204n;
import color.support.p043v7.app.DialogInterfaceC1203m;
import com.coloros.deeptesting.R;
import com.coloros.deeptesting.service.RequestService;
import com.coloros.neton.BuildConfig;
import com.coloros.neton.NetonClient;
import com.google.p066a.C2015j;
import neton.MediaType;
import neton.Request;
import neton.RequestBody;
import neton.Response;

/* compiled from: Utils.java */
/* renamed from: com.coloros.deeptesting.a.h */
/* loaded from: classes.dex */
public final class C1842h {
    /* renamed from: a */
    public static String m5955a(Object obj) {
        return new C2015j().m6221a(obj);
    }

    /* renamed from: a */
    public static boolean m5960a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
    }

    /* renamed from: a */
    public static Response m5956a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        try {
            return NetonClient.execute(new Request.Builder().url(str).post(RequestBody.create(MediaType.parse(MediaType.JSON), str2)).build());
        } catch (Exception e) {
            C1841g.m5952a("Utils", "neton post error");
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static int m5962b(Context context) {
        try {
            return ((PersistentDataBlockManager) context.getSystemService("persistent_data_block")).getFlashLockState();
        } catch (SecurityException unused) {
            return 1;
        }
    }

    /* renamed from: a */
    public static boolean m5959a() {
        return SystemProperties.get("ro.product.brand.sub", BuildConfig.FLAVOR).equalsIgnoreCase("Realme");
    }

    /* renamed from: c */
    public static String m5964c(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception e) {
            C1841g.m5954c("Utils", "getdeviceid error".concat(String.valueOf(e)));
            return "00";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m5963b() {
        /*
            java.lang.String r0 = "ro.vold.serialno"
            java.lang.String r1 = ""
            java.lang.String r0 = android.os.SystemProperties.get(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lb6
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45
            java.lang.String r3 = "proc/oppoVersion/serialID"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45
        L25:
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3e
            if (r0 == 0) goto L2f
            r1.append(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3e
            goto L25
        L2f:
            r3.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r0 = move-exception
            r0.printStackTrace()
        L37:
            r0 = r3
            goto L53
        L39:
            r0 = move-exception
            r1 = r0
            r0 = r3
            goto Lab
        L3e:
            r0 = move-exception
            r2 = r0
            r0 = r3
            goto L46
        L42:
            r1 = move-exception
            goto Lab
        L45:
            r2 = move-exception
        L46:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L53
            r0.close()     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r2 = move-exception
            r2.printStackTrace()
        L53:
            java.lang.String r1 = r1.toString()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto La9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            java.lang.String r3 = "proc/oplusVersion/serialID"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8b
        L73:
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L85
            if (r0 == 0) goto L7d
            r1.append(r0)     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L85
            goto L73
        L7d:
            r3.close()     // Catch: java.io.IOException -> L95
            goto L99
        L81:
            r0 = move-exception
            r1 = r0
            r0 = r3
            goto L9e
        L85:
            r0 = move-exception
            r2 = r0
            r0 = r3
            goto L8c
        L89:
            r1 = move-exception
            goto L9e
        L8b:
            r2 = move-exception
        L8c:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L99
            r0.close()     // Catch: java.io.IOException -> L95
            goto L99
        L95:
            r0 = move-exception
            r0.printStackTrace()
        L99:
            java.lang.String r0 = r1.toString()
            goto Lb6
        L9e:
            if (r0 == 0) goto La8
            r0.close()     // Catch: java.io.IOException -> La4
            goto La8
        La4:
            r0 = move-exception
            r0.printStackTrace()
        La8:
            throw r1
        La9:
            r0 = r1
            goto Lb6
        Lab:
            if (r0 == 0) goto Lb5
            r0.close()     // Catch: java.io.IOException -> Lb1
            goto Lb5
        Lb1:
            r0 = move-exception
            r0.printStackTrace()
        Lb5:
            throw r1
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coloros.deeptesting.p064a.C1842h.m5963b():java.lang.String");
    }

    /* renamed from: a */
    public static void m5958a(Context context, String str, String str2, Handler handler) {
        TextView textView = new TextView(context);
        textView.setText(str2);
        textView.setGravity(17);
        textView.setTextSize(16.0f);
        textView.setLineSpacing(6.0f, 1.1f);
        C1204n c1204n = new C1204n(context);
        String string = context.getString(R.string.dialog_ok);
        c1204n.mo242a(str);
        c1204n.m4002b(textView);
        c1204n.m4001a(string, new DialogInterfaceOnClickListenerC1843i(handler, context));
        if (handler != null) {
            c1204n.m4004b(context.getString(R.string.dialog_no), new DialogInterfaceOnClickListenerC1844j());
        }
        DialogInterfaceC1203m mo243b = c1204n.mo243b();
        mo243b.getWindow().setType(2);
        mo243b.show();
    }

    /* renamed from: a */
    public static void m5957a(Context context, int i, Handler handler) {
        Intent intent = new Intent(context, (Class<?>) RequestService.class);
        intent.putExtra("MessengerFlag", i);
        intent.putExtra("Messenger", new Messenger(handler));
        context.startService(intent);
    }

    /* renamed from: c */
    public static boolean m5965c() {
        try {
            return ((Boolean) Class.forName("android.engineer.OplusEngineerManager").getMethod("fastbootUnlock", byte[].class, Integer.TYPE).invoke(null, new byte[]{0}, 1)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m5961a(String str) {
        byte[] bArr;
        if (str == null) {
            bArr = null;
        } else if (str.length() == 0) {
            bArr = new byte[0];
        } else {
            byte[] bArr2 = new byte[str.length() / 2];
            for (int i = 0; i < bArr2.length; i++) {
                int i2 = i * 2;
                bArr2[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(bArr2.length);
            C1841g.m5952a("Utils", sb.toString());
            bArr = bArr2;
        }
        try {
            return ((Boolean) Class.forName("android.engineer.OplusEngineerManager").getMethod("fastbootUnlock", byte[].class, Integer.TYPE).invoke(null, bArr, Integer.valueOf(bArr.length))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
