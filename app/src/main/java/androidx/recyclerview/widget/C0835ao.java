package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OrientationHelper.java */
/* renamed from: androidx.recyclerview.widget.ao */
/* loaded from: classes.dex */
public final class C0835ao extends AbstractC0834an {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0835ao(AbstractC0856bi abstractC0856bi) {
        super(abstractC0856bi, (byte) 0);
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: e */
    public final int mo2977e() {
        return this.f3502a.m3124y() - this.f3502a.m3083C();
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: f */
    public final int mo2979f() {
        return this.f3502a.m3124y();
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: a */
    public final void mo2970a(int i) {
        this.f3502a.mo2898g(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: d */
    public final int mo2975d() {
        return this.f3502a.m3081A();
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: e */
    public final int mo2978e(View view) {
        C0861bn c0861bn = (C0861bn) view.getLayoutParams();
        return AbstractC0856bi.m3070g(view) + c0861bn.leftMargin + c0861bn.rightMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: f */
    public final int mo2980f(View view) {
        C0861bn c0861bn = (C0861bn) view.getLayoutParams();
        return AbstractC0856bi.m3071h(view) + c0861bn.topMargin + c0861bn.bottomMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: b */
    public final int mo2971b(View view) {
        return AbstractC0856bi.m3075k(view) + ((C0861bn) view.getLayoutParams()).rightMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: a */
    public final int mo2968a(View view) {
        return AbstractC0856bi.m3072i(view) - ((C0861bn) view.getLayoutParams()).leftMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: c */
    public final int mo2974c(View view) {
        this.f3502a.m3090a(view, this.f3503b);
        return this.f3503b.right;
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: d */
    public final int mo2976d(View view) {
        this.f3502a.m3090a(view, this.f3503b);
        return this.f3503b.left;
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: g */
    public final int mo2981g() {
        return (this.f3502a.m3124y() - this.f3502a.m3081A()) - this.f3502a.m3083C();
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: h */
    public final int mo2982h() {
        return this.f3502a.m3083C();
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: i */
    public final int mo2983i() {
        return this.f3502a.m3122w();
    }

    @Override // androidx.recyclerview.widget.AbstractC0834an
    /* renamed from: j */
    public final int mo2984j() {
        return this.f3502a.m3123x();
    }
}
