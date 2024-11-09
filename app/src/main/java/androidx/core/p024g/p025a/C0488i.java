package androidx.core.p024g.p025a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccessibilityNodeProviderCompat.java */
/* renamed from: androidx.core.g.a.i */
/* loaded from: classes.dex */
public class C0488i extends AccessibilityNodeProvider {

    /* renamed from: a */
    final C0487h f2333a;

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public C0488i(C0487h c0487h) {
        this.f2333a = c0487h;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C0482c mo1717a = this.f2333a.mo1717a(i);
        if (mo1717a == null) {
            return null;
        }
        return mo1717a.m1645a();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f2333a.mo1719a(i, i2, bundle);
    }
}
