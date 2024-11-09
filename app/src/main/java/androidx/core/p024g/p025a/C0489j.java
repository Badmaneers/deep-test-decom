package androidx.core.p024g.p025a;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccessibilityNodeProviderCompat.java */
/* renamed from: androidx.core.g.a.j */
/* loaded from: classes.dex */
public final class C0489j extends C0488i {
    public C0489j(C0487h c0487h) {
        super(c0487h);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C0482c mo1720b = this.f2333a.mo1720b(i);
        if (mo1720b == null) {
            return null;
        }
        return mo1720b.m1645a();
    }
}
