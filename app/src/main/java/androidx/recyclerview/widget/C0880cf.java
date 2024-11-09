package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.p025a.C0482c;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* renamed from: androidx.recyclerview.widget.cf */
/* loaded from: classes.dex */
public class C0880cf extends C0479a {

    /* renamed from: a */
    final RecyclerView f3632a;

    /* renamed from: b */
    private final C0881cg f3633b;

    public C0880cf(RecyclerView recyclerView) {
        this.f3632a = recyclerView;
        C0881cg c0881cg = this.f3633b;
        if (c0881cg != null && (c0881cg instanceof C0881cg)) {
            this.f3633b = c0881cg;
        } else {
            this.f3633b = new C0881cg(this);
        }
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final boolean mo1627a(View view, int i, Bundle bundle) {
        if (super.mo1627a(view, i, bundle)) {
            return true;
        }
        if (this.f3632a.hasPendingAdapterUpdates() || this.f3632a.getLayoutManager() == null) {
            return false;
        }
        AbstractC0856bi layoutManager = this.f3632a.getLayoutManager();
        return layoutManager.mo3099a(layoutManager.f3535q.mRecycler, layoutManager.f3535q.mState, i, bundle);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public void mo1626a(View view, C0482c c0482c) {
        super.mo1626a(view, c0482c);
        if (this.f3632a.hasPendingAdapterUpdates() || this.f3632a.getLayoutManager() == null) {
            return;
        }
        AbstractC0856bi layoutManager = this.f3632a.getLayoutManager();
        layoutManager.mo3095a(layoutManager.f3535q.mRecycler, layoutManager.f3535q.mState, c0482c);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: d */
    public final void mo1631d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1631d(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f3632a.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo2827a(accessibilityEvent);
        }
    }

    /* renamed from: a */
    public final C0479a m3229a() {
        return this.f3633b;
    }
}
