package androidx.viewpager.widget;

import android.database.DataSetObserver;

/* compiled from: PagerTitleStrip.java */
/* renamed from: androidx.viewpager.widget.d */
/* loaded from: classes.dex */
public final class C1097d extends DataSetObserver implements InterfaceC1107n, InterfaceC1108o {

    /* renamed from: a */
    final /* synthetic */ PagerTitleStrip f4469a;

    /* renamed from: b */
    private int f4470b;

    public C1097d(PagerTitleStrip pagerTitleStrip) {
        this.f4469a = pagerTitleStrip;
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: a */
    public final void mo3705a(int i, float f) {
        if (f > 0.5f) {
            i++;
        }
        this.f4469a.mo3657a(i, f, false);
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: a */
    public final void mo3704a(int i) {
        if (this.f4470b == 0) {
            PagerTitleStrip pagerTitleStrip = this.f4469a;
            int currentItem = this.f4469a.f4388a.getCurrentItem();
            this.f4469a.f4388a.getAdapter();
            pagerTitleStrip.m3658a(currentItem);
            this.f4469a.mo3657a(this.f4469a.f4388a.getCurrentItem(), this.f4469a.f4392e >= 0.0f ? this.f4469a.f4392e : 0.0f, true);
        }
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: b */
    public final void mo3707b(int i) {
        this.f4470b = i;
    }

    @Override // androidx.viewpager.widget.InterfaceC1107n
    /* renamed from: a */
    public final void mo3706a(ViewPager viewPager, AbstractC1094a abstractC1094a, AbstractC1094a abstractC1094a2) {
        this.f4469a.m3659a(abstractC1094a, abstractC1094a2);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        PagerTitleStrip pagerTitleStrip = this.f4469a;
        int currentItem = this.f4469a.f4388a.getCurrentItem();
        this.f4469a.f4388a.getAdapter();
        pagerTitleStrip.m3658a(currentItem);
        this.f4469a.mo3657a(this.f4469a.f4388a.getCurrentItem(), this.f4469a.f4392e >= 0.0f ? this.f4469a.f4392e : 0.0f, true);
    }
}
