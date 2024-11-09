package androidx.core.p024g;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat.java */
/* renamed from: androidx.core.g.u */
/* loaded from: classes.dex */
public final class C0536u {

    /* renamed from: a */
    private Object f2380a;

    private C0536u(Object obj) {
        this.f2380a = obj;
    }

    /* renamed from: a */
    public final Object m1816a() {
        return this.f2380a;
    }

    /* renamed from: a */
    public static C0536u m1815a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C0536u(PointerIcon.getSystemIcon(context, 1002));
        }
        return new C0536u(null);
    }
}
