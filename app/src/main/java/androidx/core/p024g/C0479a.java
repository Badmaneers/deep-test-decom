package androidx.core.p024g;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;
import androidx.core.p024g.p025a.C0487h;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityDelegateCompat.java */
/* renamed from: androidx.core.g.a */
/* loaded from: classes.dex */
public class C0479a {

    /* renamed from: a */
    private static final View.AccessibilityDelegate f2278a = new View.AccessibilityDelegate();

    /* renamed from: b */
    private final View.AccessibilityDelegate f2279b;

    /* renamed from: c */
    private final View.AccessibilityDelegate f2280c;

    public C0479a() {
        this(f2278a);
    }

    public C0479a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2279b = accessibilityDelegate;
        this.f2280c = new C0515b(this);
    }

    public View.AccessibilityDelegate getBridge() {
        return this.f2280c;
    }

    /* renamed from: a */
    public void mo1624a(View view, int i) {
        this.f2279b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo1625a(View view, AccessibilityEvent accessibilityEvent) {
        this.f2279b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: b */
    public boolean mo1629b(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2279b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo1630c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2279b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo1631d(View view, AccessibilityEvent accessibilityEvent) {
        this.f2279b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1626a(View view, C0482c c0482c) {
        this.f2279b.onInitializeAccessibilityNodeInfo(view, c0482c.m1645a());
    }

    /* renamed from: a */
    public boolean mo1628a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2279b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public C0487h mo1623a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f2279b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0487h(accessibilityNodeProvider);
    }

    /* renamed from: a */
    public boolean mo1627a(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z2;
        List<C0483d> m1622b = m1622b(view);
        int i2 = 0;
        while (true) {
            if (i2 >= m1622b.size()) {
                z = false;
                break;
            }
            C0483d c0483d = m1622b.get(i2);
            if (c0483d.m1709a() == i) {
                z = c0483d.m1711a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f2279b.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                ClickableSpan[] m1641d = C0482c.m1641d(view.createAccessibilityNodeInfo().getText());
                for (int i4 = 0; m1641d != null && i4 < m1641d.length; i4++) {
                    if (clickableSpan.equals(m1641d[i4])) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static List<C0483d> m1622b(View view) {
        List<C0483d> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }
}
