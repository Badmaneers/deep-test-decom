package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.bk */
/* loaded from: classes.dex */
public final class C0858bk implements InterfaceC0895cu {

    /* renamed from: a */
    final /* synthetic */ AbstractC0856bi f3545a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0858bk(AbstractC0856bi abstractC0856bi) {
        this.f3545a = abstractC0856bi;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0895cu
    /* renamed from: a */
    public final View mo3128a(int i) {
        return this.f3545a.m3111f(i);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0895cu
    /* renamed from: a */
    public final int mo3126a() {
        return this.f3545a.m3082B();
    }

    @Override // androidx.recyclerview.widget.InterfaceC0895cu
    /* renamed from: b */
    public final int mo3129b() {
        return this.f3545a.m3125z() - this.f3545a.m3084D();
    }

    @Override // androidx.recyclerview.widget.InterfaceC0895cu
    /* renamed from: a */
    public final int mo3127a(View view) {
        return AbstractC0856bi.m3074j(view) - ((C0861bn) view.getLayoutParams()).topMargin;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0895cu
    /* renamed from: b */
    public final int mo3130b(View view) {
        return AbstractC0856bi.m3076l(view) + ((C0861bn) view.getLayoutParams()).bottomMargin;
    }
}
