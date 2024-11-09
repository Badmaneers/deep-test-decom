package androidx.core.p024g.p025a;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* renamed from: androidx.core.g.a.f */
/* loaded from: classes.dex */
public final class C0485f {

    /* renamed from: a */
    final Object f2330a;

    /* renamed from: a */
    public static C0485f m1715a(int i, int i2, int i3, int i4, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0485f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return new C0485f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false));
        }
        return new C0485f(null);
    }

    private C0485f(Object obj) {
        this.f2330a = obj;
    }
}
