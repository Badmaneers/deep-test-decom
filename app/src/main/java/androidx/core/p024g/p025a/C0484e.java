package androidx.core.p024g.p025a;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* renamed from: androidx.core.g.a.e */
/* loaded from: classes.dex */
public final class C0484e {

    /* renamed from: a */
    final Object f2329a;

    /* renamed from: a */
    public static C0484e m1714a(int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0484e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return new C0484e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false));
        }
        return new C0484e(null);
    }

    /* renamed from: a */
    public static C0484e m1713a(int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C0484e(AccessibilityNodeInfo.CollectionInfo.obtain(i, 0, false));
        }
        return new C0484e(null);
    }

    private C0484e(Object obj) {
        this.f2329a = obj;
    }
}
