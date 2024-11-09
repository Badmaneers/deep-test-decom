package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import androidx.core.content.C0420a;

/* compiled from: ActivityCompat.java */
/* renamed from: androidx.core.app.a */
/* loaded from: classes.dex */
public final class C0403a extends C0420a {

    /* renamed from: a */
    private static InterfaceC0404b f2119a;

    /* renamed from: a */
    public static InterfaceC0404b m1451a() {
        return f2119a;
    }

    /* renamed from: a */
    public static void m1452a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: b */
    public static void m1453b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            if (C0405c.m1457a(activity)) {
                return;
            }
            activity.recreate();
        }
    }
}
