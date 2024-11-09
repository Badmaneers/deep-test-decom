package color.support.design.widget;

import androidx.viewpager.widget.AbstractC1094a;
import androidx.viewpager.widget.InterfaceC1107n;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorTabLayout.java */
/* renamed from: color.support.design.widget.e */
/* loaded from: classes.dex */
public final class C1176e implements InterfaceC1107n {

    /* renamed from: a */
    final /* synthetic */ ColorTabLayout f4770a;

    /* renamed from: b */
    private boolean f4771b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1176e(ColorTabLayout colorTabLayout) {
        this.f4770a = colorTabLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3886a() {
        this.f4771b = true;
    }

    @Override // androidx.viewpager.widget.InterfaceC1107n
    /* renamed from: a */
    public final void mo3706a(ViewPager viewPager, AbstractC1094a abstractC1094a, AbstractC1094a abstractC1094a2) {
        if (this.f4770a.f4698l == viewPager) {
            this.f4770a.m3862a(abstractC1094a2, this.f4771b);
        }
    }
}
