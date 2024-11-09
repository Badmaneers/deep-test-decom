package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.bj */
/* loaded from: classes.dex */
public final class C0857bj implements InterfaceC0895cu {

    /* renamed from: a */
    final /* synthetic */ AbstractC0856bi f3544a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0857bj(AbstractC0856bi abstractC0856bi) {
        this.f3544a = abstractC0856bi;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0895cu
    /* renamed from: a */
    public final View mo3128a(int i) {
        return this.f3544a.m3111f(i);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0895cu
    /* renamed from: a */
    public final int mo3126a() {
        return this.f3544a.m3081A();
    }

    @Override // androidx.recyclerview.widget.InterfaceC0895cu
    /* renamed from: b */
    public final int mo3129b() {
        return this.f3544a.m3124y() - this.f3544a.m3083C();
    }

    @Override // androidx.recyclerview.widget.InterfaceC0895cu
    /* renamed from: a */
    public final int mo3127a(View view) {
        return AbstractC0856bi.m3072i(view) - ((C0861bn) view.getLayoutParams()).leftMargin;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0895cu
    /* renamed from: b */
    public final int mo3130b(View view) {
        return AbstractC0856bi.m3075k(view) + ((C0861bn) view.getLayoutParams()).rightMargin;
    }
}
