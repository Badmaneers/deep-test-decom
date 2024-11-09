package com.coloros.deeptesting.activity;

import android.os.Handler;
import android.os.Message;
import android.service.persistentdata.PersistentDataBlockManager;
import android.telecom.Log;
import com.color.support.dialog.p050a.DialogC1312a;
import com.coloros.deeptesting.R;
import com.coloros.deeptesting.p064a.C1841g;
import com.coloros.deeptesting.p064a.C1842h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: StatusActivity.java */
/* renamed from: com.coloros.deeptesting.activity.i */
/* loaded from: classes.dex */
final class HandlerC1853i extends Handler {

    /* renamed from: a */
    final /* synthetic */ StatusActivity f8605a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC1853i(StatusActivity statusActivity) {
        this.f8605a = statusActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Process] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        DialogC1312a dialogC1312a;
        String readLine;
        DialogC1312a dialogC1312a2;
        ?? r0 = 0;
        r0 = null;
        BufferedReader bufferedReader = null;
        r0 = 0;
        if (message.what != 0) {
            dialogC1312a2 = this.f8605a.f8595h;
            dialogC1312a2.dismiss();
            C1842h.m5958a(this.f8605a, this.f8605a.getString(R.string.dialog_title), this.f8605a.getString(R.string.dialog_nonetwork), null);
            return;
        }
        dialogC1312a = this.f8605a.f8595h;
        dialogC1312a.dismiss();
        if (!C1842h.m5959a()) {
            this.f8605a.finish();
            return;
        }
        ?? r1 = "Status";
        C1841g.m5952a("Status", "result:".concat(String.valueOf(C1842h.m5961a(this.f8605a.getIntent().getStringExtra("data")))));
        try {
            ((PersistentDataBlockManager) this.f8605a.getSystemService("persistent_data_block")).setOemUnlockEnabled(true);
            C1841g.m5952a("Utils", "Set oem");
        } catch (SecurityException unused) {
            C1841g.m5952a("Utils", "Fail to set oem");
        }
        StringBuilder sb = new StringBuilder();
        try {
            try {
                r1 = Runtime.getRuntime().exec("reboot bootloader");
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(r1.getInputStream(), "UTF-8"));
                    while (true) {
                        try {
                            readLine = bufferedReader2.readLine();
                            if (readLine != null) {
                                sb.append(readLine);
                                sb.append("\n");
                            } else {
                                try {
                                    break;
                                } catch (IOException e) {
                                    Log.w("bootloader", "failed closing reader  ".concat(String.valueOf(e)), new Object[0]);
                                    r0 = "bootloader";
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            bufferedReader = bufferedReader2;
                            Log.w("bootloader", "failed parsing sensor map  ".concat(String.valueOf(e)), new Object[0]);
                            r0 = bufferedReader;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    r0 = bufferedReader;
                                } catch (IOException e3) {
                                    Log.w("bootloader", "failed closing reader  ".concat(String.valueOf(e3)), new Object[0]);
                                    r0 = "bootloader";
                                }
                            }
                            if (r1 != 0) {
                                try {
                                    r1.waitFor();
                                } catch (InterruptedException e4) {
                                    Log.w("bootloader", "failed process waitfor ".concat(String.valueOf(e4)), new Object[0]);
                                }
                                r1.destroy();
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r0 = bufferedReader2;
                            if (r0 != 0) {
                                try {
                                    r0.close();
                                } catch (IOException e5) {
                                    Log.w("bootloader", "failed closing reader  ".concat(String.valueOf(e5)), new Object[0]);
                                }
                            }
                            if (r1 != 0) {
                                try {
                                    r1.waitFor();
                                } catch (InterruptedException e6) {
                                    Log.w("bootloader", "failed process waitfor ".concat(String.valueOf(e6)), new Object[0]);
                                }
                                r1.destroy();
                                throw th;
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                    r0 = readLine;
                    if (r1 != 0) {
                        try {
                            r1.waitFor();
                        } catch (InterruptedException e7) {
                            Log.w("bootloader", "failed process waitfor ".concat(String.valueOf(e7)), new Object[0]);
                        }
                        r1.destroy();
                    }
                } catch (IOException e8) {
                    e = e8;
                }
            } catch (IOException e9) {
                e = e9;
                r1 = 0;
            } catch (Throwable th2) {
                th = th2;
                r1 = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
