package androidx.core.widget;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NestedScrollView.java */
/* renamed from: androidx.core.widget.k */
/* loaded from: classes.dex */
public final class C0573k extends C0479a {
    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final boolean mo1627a(View view, int i, Bundle bundle) {
        if (super.mo1627a(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m2012a(max);
                return true;
            }
            if (i != 16908346) {
                return false;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.m2012a(min);
        return true;
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        int scrollRange;
        super.mo1626a(view, c0482c);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        c0482c.m1660b((CharSequence) ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        c0482c.m1692k(true);
        if (nestedScrollView.getScrollY() > 0) {
            c0482c.m1649a(C0483d.f2312n);
            c0482c.m1649a(C0483d.f2323y);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            c0482c.m1649a(C0483d.f2311m);
            c0482c.m1649a(C0483d.f2288A);
        }
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: d */
    public final void mo1631d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1631d(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        int scrollX = nestedScrollView.getScrollX();
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityEvent.setMaxScrollX(scrollX);
        }
        int scrollRange = nestedScrollView.getScrollRange();
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityEvent.setMaxScrollY(scrollRange);
        }
    }
}
