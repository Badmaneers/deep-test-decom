package androidx.core.p024g;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;
import androidx.core.p024g.p025a.C0487h;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccessibilityDelegateCompat.java */
/* renamed from: androidx.core.g.b */
/* loaded from: classes.dex */
public final class C0515b extends View.AccessibilityDelegate {

    /* renamed from: a */
    final C0479a f2358a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0515b(C0479a c0479a) {
        this.f2358a = c0479a;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2358a.mo1629b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2358a.mo1631d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C0482c m1635a = C0482c.m1635a(accessibilityNodeInfo);
        m1635a.m1694l(C0538w.m1825I(view));
        m1635a.m1698n(C0538w.m1827K(view));
        m1635a.m1684h(C0538w.m1826J(view));
        this.f2358a.mo1626a(view, m1635a);
        m1635a.m1652a(accessibilityNodeInfo.getText(), view);
        List<C0483d> m1622b = C0479a.m1622b(view);
        for (int i = 0; i < m1622b.size(); i++) {
            m1635a.m1649a(m1622b.get(i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2358a.mo1630c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2358a.mo1628a(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f2358a.mo1624a(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f2358a.mo1625a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0487h mo1623a = this.f2358a.mo1623a(view);
        if (mo1623a != null) {
            return (AccessibilityNodeProvider) mo1623a.m1718a();
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f2358a.mo1627a(view, i, bundle);
    }
}
