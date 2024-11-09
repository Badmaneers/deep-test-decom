package androidx.core.p024g.p025a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: AccessibilityEventCompat.java */
/* renamed from: androidx.core.g.a.b */
/* loaded from: classes.dex */
public final class C0481b {
    /* renamed from: a */
    public static void m1632a(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
