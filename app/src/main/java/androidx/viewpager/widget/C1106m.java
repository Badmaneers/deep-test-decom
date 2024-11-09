package androidx.viewpager.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.p025a.C0482c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager.java */
/* renamed from: androidx.viewpager.widget.m */
/* loaded from: classes.dex */
public final class C1106m extends C0479a {

    /* renamed from: a */
    final /* synthetic */ ViewPager f4485a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1106m(ViewPager viewPager) {
        this.f4485a = viewPager;
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: d */
    public final void mo1631d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1631d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        accessibilityEvent.setScrollable(m3708a());
        if (accessibilityEvent.getEventType() != 4096 || this.f4485a.f4439b == null) {
            return;
        }
        accessibilityEvent.setItemCount(this.f4485a.f4439b.m3699a());
        accessibilityEvent.setFromIndex(this.f4485a.f4440c);
        accessibilityEvent.setToIndex(this.f4485a.f4440c);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        super.mo1626a(view, c0482c);
        c0482c.m1660b((CharSequence) ViewPager.class.getName());
        c0482c.m1692k(m3708a());
        if (this.f4485a.canScrollHorizontally(1)) {
            c0482c.m1646a(4096);
        }
        if (this.f4485a.canScrollHorizontally(-1)) {
            c0482c.m1646a(8192);
        }
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final boolean mo1627a(View view, int i, Bundle bundle) {
        if (super.mo1627a(view, i, bundle)) {
            return true;
        }
        if (i == 4096) {
            if (!this.f4485a.canScrollHorizontally(1)) {
                return false;
            }
            this.f4485a.setCurrentItem(this.f4485a.f4440c + 1);
            return true;
        }
        if (i != 8192 || !this.f4485a.canScrollHorizontally(-1)) {
            return false;
        }
        this.f4485a.setCurrentItem(this.f4485a.f4440c - 1);
        return true;
    }

    /* renamed from: a */
    private boolean m3708a() {
        return this.f4485a.f4439b != null && this.f4485a.f4439b.m3699a() > 1;
    }
}
