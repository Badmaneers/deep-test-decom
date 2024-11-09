package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0487h;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* renamed from: androidx.recyclerview.widget.cg */
/* loaded from: classes.dex */
public final class C0881cg extends C0479a {

    /* renamed from: a */
    final C0880cf f3634a;

    /* renamed from: b */
    private Map<View, C0479a> f3635b = new WeakHashMap();

    public C0881cg(C0880cf c0880cf) {
        this.f3634a = c0880cf;
    }

    /* renamed from: c */
    public final void m3230c(View view) {
        C0479a m1866c = C0538w.m1866c(view);
        if (m1866c == null || m1866c == this) {
            return;
        }
        this.f3635b.put(view, m1866c);
    }

    /* renamed from: d */
    public final C0479a m3231d(View view) {
        return this.f3635b.remove(view);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        if (!this.f3634a.f3632a.hasPendingAdapterUpdates() && this.f3634a.f3632a.getLayoutManager() != null) {
            this.f3634a.f3632a.getLayoutManager().m3091a(view, c0482c);
            C0479a c0479a = this.f3635b.get(view);
            if (c0479a != null) {
                c0479a.mo1626a(view, c0482c);
                return;
            } else {
                super.mo1626a(view, c0482c);
                return;
            }
        }
        super.mo1626a(view, c0482c);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final boolean mo1627a(View view, int i, Bundle bundle) {
        if (!this.f3634a.f3632a.hasPendingAdapterUpdates() && this.f3634a.f3632a.getLayoutManager() != null) {
            C0479a c0479a = this.f3635b.get(view);
            if (c0479a != null) {
                if (c0479a.mo1627a(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo1627a(view, i, bundle)) {
                return true;
            }
            this.f3634a.f3632a.getLayoutManager();
            return false;
        }
        return super.mo1627a(view, i, bundle);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1624a(View view, int i) {
        C0479a c0479a = this.f3635b.get(view);
        if (c0479a != null) {
            c0479a.mo1624a(view, i);
        } else {
            super.mo1624a(view, i);
        }
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1625a(View view, AccessibilityEvent accessibilityEvent) {
        C0479a c0479a = this.f3635b.get(view);
        if (c0479a != null) {
            c0479a.mo1625a(view, accessibilityEvent);
        } else {
            super.mo1625a(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: b */
    public final boolean mo1629b(View view, AccessibilityEvent accessibilityEvent) {
        C0479a c0479a = this.f3635b.get(view);
        if (c0479a != null) {
            return c0479a.mo1629b(view, accessibilityEvent);
        }
        return super.mo1629b(view, accessibilityEvent);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: c */
    public final void mo1630c(View view, AccessibilityEvent accessibilityEvent) {
        C0479a c0479a = this.f3635b.get(view);
        if (c0479a != null) {
            c0479a.mo1630c(view, accessibilityEvent);
        } else {
            super.mo1630c(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: d */
    public final void mo1631d(View view, AccessibilityEvent accessibilityEvent) {
        C0479a c0479a = this.f3635b.get(view);
        if (c0479a != null) {
            c0479a.mo1631d(view, accessibilityEvent);
        } else {
            super.mo1631d(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final boolean mo1628a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0479a c0479a = this.f3635b.get(viewGroup);
        if (c0479a != null) {
            return c0479a.mo1628a(viewGroup, view, accessibilityEvent);
        }
        return super.mo1628a(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final C0487h mo1623a(View view) {
        C0479a c0479a = this.f3635b.get(view);
        if (c0479a != null) {
            return c0479a.mo1623a(view);
        }
        return super.mo1623a(view);
    }
}
