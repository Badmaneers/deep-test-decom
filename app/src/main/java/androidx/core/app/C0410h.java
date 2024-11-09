package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;

/* compiled from: BundleCompat.java */
/* renamed from: androidx.core.app.h */
/* loaded from: classes.dex */
public final class C0410h {
    /* renamed from: a */
    public static IBinder m1464a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0411i.m1466a(bundle, str);
    }

    /* renamed from: a */
    public static void m1465a(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0411i.m1467a(bundle, str, iBinder);
        }
    }
}
