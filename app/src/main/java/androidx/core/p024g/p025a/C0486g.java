package androidx.core.p024g.p025a;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* renamed from: androidx.core.g.a.g */
/* loaded from: classes.dex */
public final class C0486g {

    /* renamed from: a */
    final Object f2331a;

    /* renamed from: a */
    public static C0486g m1716a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C0486g(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
        }
        return new C0486g(null);
    }

    private C0486g(Object obj) {
        this.f2331a = obj;
    }
}
