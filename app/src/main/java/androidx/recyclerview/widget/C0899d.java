package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChildHelper.java */
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public final class C0899d {

    /* renamed from: a */
    final InterfaceC0901f f3672a;

    /* renamed from: b */
    final C0900e f3673b = new C0900e();

    /* renamed from: c */
    final List<View> f3674c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0899d(InterfaceC0901f interfaceC0901f) {
        this.f3672a = interfaceC0901f;
    }

    /* renamed from: h */
    private void m3282h(View view) {
        this.f3674c.add(view);
        this.f3672a.mo3003c(view);
    }

    /* renamed from: i */
    private boolean m3283i(View view) {
        if (!this.f3674c.remove(view)) {
            return false;
        }
        this.f3672a.mo3004d(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3286a(View view) {
        m3288a(view, -1, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3288a(View view, int i, boolean z) {
        int m3281e;
        if (i < 0) {
            m3281e = this.f3672a.mo2994a();
        } else {
            m3281e = m3281e(i);
        }
        this.f3673b.m3301a(m3281e, z);
        if (z) {
            m3282h(view);
        }
        this.f3672a.mo2997a(view, m3281e);
    }

    /* renamed from: e */
    private int m3281e(int i) {
        if (i < 0) {
            return -1;
        }
        int mo2994a = this.f3672a.mo2994a();
        int i2 = i;
        while (i2 < mo2994a) {
            int m3305e = i - (i2 - this.f3673b.m3305e(i2));
            if (m3305e == 0) {
                while (this.f3673b.m3303c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m3305e;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3291b(View view) {
        int mo2995a = this.f3672a.mo2995a(view);
        if (mo2995a < 0) {
            return;
        }
        if (this.f3673b.m3304d(mo2995a)) {
            m3283i(view);
        }
        this.f3672a.mo2996a(mo2995a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3285a(int i) {
        int m3281e = m3281e(i);
        View mo2999b = this.f3672a.mo2999b(m3281e);
        if (mo2999b == null) {
            return;
        }
        if (this.f3673b.m3304d(m3281e)) {
            m3283i(mo2999b);
        }
        this.f3672a.mo2996a(m3281e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final View m3290b(int i) {
        return this.f3672a.mo2999b(m3281e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3287a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m3281e;
        if (i < 0) {
            m3281e = this.f3672a.mo2994a();
        } else {
            m3281e = m3281e(i);
        }
        this.f3673b.m3301a(m3281e, z);
        if (z) {
            m3282h(view);
        }
        this.f3672a.mo2998a(view, m3281e, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m3284a() {
        return this.f3672a.mo2994a() - this.f3674c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m3289b() {
        return this.f3672a.mo2994a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final View m3293c(int i) {
        return this.f3672a.mo2999b(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m3294d(int i) {
        int m3281e = m3281e(i);
        this.f3673b.m3304d(m3281e);
        this.f3672a.mo3002c(m3281e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final int m3292c(View view) {
        int mo2995a = this.f3672a.mo2995a(view);
        if (mo2995a == -1 || this.f3673b.m3303c(mo2995a)) {
            return -1;
        }
        return mo2995a - this.f3673b.m3305e(mo2995a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m3295d(View view) {
        return this.f3674c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m3296e(View view) {
        int mo2995a = this.f3672a.mo2995a(view);
        if (mo2995a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
        }
        this.f3673b.m3300a(mo2995a);
        m3282h(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m3297f(View view) {
        int mo2995a = this.f3672a.mo2995a(view);
        if (mo2995a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
        }
        if (!this.f3673b.m3303c(mo2995a)) {
            throw new RuntimeException("trying to unhide a view that was not hidden".concat(String.valueOf(view)));
        }
        this.f3673b.m3302b(mo2995a);
        m3283i(view);
    }

    public final String toString() {
        return this.f3673b.toString() + ", hidden list:" + this.f3674c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m3298g(View view) {
        int mo2995a = this.f3672a.mo2995a(view);
        if (mo2995a == -1) {
            m3283i(view);
            return true;
        }
        if (!this.f3673b.m3303c(mo2995a)) {
            return false;
        }
        this.f3673b.m3304d(mo2995a);
        m3283i(view);
        this.f3672a.mo2996a(mo2995a);
        return true;
    }
}
