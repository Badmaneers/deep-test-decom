package com.heytap.tingle.ipc;

import android.content.Context;
import android.os.Bundle;

/* compiled from: Engine.java */
/* renamed from: com.heytap.tingle.ipc.b */
/* loaded from: classes.dex */
public final class C2455b {
    /* renamed from: a */
    public static void m7806a(Context context) {
        if (context.getApplicationInfo().packageName.equals("com.heytap.appplatform")) {
            return;
        }
        if (context.getPackageManager().resolveContentProvider("com.heytap.appplatform.master.provider", 131072) != null) {
            C2467g.m7811a(context.getContentResolver().call("com.heytap.appplatform.master.provider", "sendBinder", (String) null, (Bundle) null).getBinder("com.heytap.epona.ext_binder"));
        }
    }
}
