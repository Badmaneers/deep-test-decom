package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: SimpleItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.ci */
/* loaded from: classes.dex */
public abstract class AbstractC0883ci extends AbstractC0851bd {

    /* renamed from: h */
    boolean f3636h = true;

    /* renamed from: a */
    public abstract boolean mo3235a(AbstractC0879ce abstractC0879ce);

    /* renamed from: a */
    public abstract boolean mo3236a(AbstractC0879ce abstractC0879ce, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo3237a(AbstractC0879ce abstractC0879ce, AbstractC0879ce abstractC0879ce2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo3238b(AbstractC0879ce abstractC0879ce);

    @Override // androidx.recyclerview.widget.AbstractC0851bd
    /* renamed from: g */
    public final boolean mo3053g(AbstractC0879ce abstractC0879ce) {
        return !this.f3636h || abstractC0879ce.m3217k();
    }

    @Override // androidx.recyclerview.widget.AbstractC0851bd
    /* renamed from: a */
    public final boolean mo3041a(AbstractC0879ce abstractC0879ce, C0853bf c0853bf, C0853bf c0853bf2) {
        int i = c0853bf.f3521a;
        int i2 = c0853bf.f3522b;
        View view = abstractC0879ce.f3614a;
        int left = c0853bf2 == null ? view.getLeft() : c0853bf2.f3521a;
        int top = c0853bf2 == null ? view.getTop() : c0853bf2.f3522b;
        if (!abstractC0879ce.m3220n() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return mo3236a(abstractC0879ce, i, i2, left, top);
        }
        return mo3235a(abstractC0879ce);
    }

    @Override // androidx.recyclerview.widget.AbstractC0851bd
    /* renamed from: b */
    public final boolean mo3045b(AbstractC0879ce abstractC0879ce, C0853bf c0853bf, C0853bf c0853bf2) {
        if (c0853bf != null && (c0853bf.f3521a != c0853bf2.f3521a || c0853bf.f3522b != c0853bf2.f3522b)) {
            return mo3236a(abstractC0879ce, c0853bf.f3521a, c0853bf.f3522b, c0853bf2.f3521a, c0853bf2.f3522b);
        }
        return mo3238b(abstractC0879ce);
    }

    @Override // androidx.recyclerview.widget.AbstractC0851bd
    /* renamed from: c */
    public final boolean mo3047c(AbstractC0879ce abstractC0879ce, C0853bf c0853bf, C0853bf c0853bf2) {
        if (c0853bf.f3521a != c0853bf2.f3521a || c0853bf.f3522b != c0853bf2.f3522b) {
            return mo3236a(abstractC0879ce, c0853bf.f3521a, c0853bf.f3522b, c0853bf2.f3521a, c0853bf2.f3522b);
        }
        m3051f(abstractC0879ce);
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC0851bd
    /* renamed from: a */
    public final boolean mo3042a(AbstractC0879ce abstractC0879ce, AbstractC0879ce abstractC0879ce2, C0853bf c0853bf, C0853bf c0853bf2) {
        int i;
        int i2;
        int i3 = c0853bf.f3521a;
        int i4 = c0853bf.f3522b;
        if (abstractC0879ce2.m3208b()) {
            int i5 = c0853bf.f3521a;
            i2 = c0853bf.f3522b;
            i = i5;
        } else {
            i = c0853bf2.f3521a;
            i2 = c0853bf2.f3522b;
        }
        return mo3237a(abstractC0879ce, abstractC0879ce2, i3, i4, i, i2);
    }
}
