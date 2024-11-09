package color.support.p041a.p042a;

import android.os.Build;
import android.view.View;

/* compiled from: ColorViewCompat.java */
/* renamed from: color.support.a.a.b */
/* loaded from: classes.dex */
public final class C1154b {

    /* renamed from: a */
    static final InterfaceC1158f f4651a;

    /* renamed from: a */
    public static boolean m3811a() {
        return true;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            f4651a = new C1157e();
        } else if (i >= 16) {
            f4651a = new C1156d();
        } else {
            f4651a = new C1155c();
        }
    }

    /* renamed from: a */
    public static int m3809a(View view) {
        return f4651a.mo3813a(view);
    }

    /* renamed from: a */
    public static void m3810a(View view, int i) {
        f4651a.mo3814a(view, i);
    }

    /* renamed from: b */
    public static int m3812b(View view) {
        return f4651a.mo3815b(view);
    }
}
