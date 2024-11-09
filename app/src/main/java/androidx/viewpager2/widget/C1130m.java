package androidx.viewpager2.widget;

import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager2.java */
/* renamed from: androidx.viewpager2.widget.m */
/* loaded from: classes.dex */
public final class C1130m extends AbstractC1129l {

    /* renamed from: b */
    final /* synthetic */ ViewPager2 f4556b;

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: h */
    public final boolean mo3765h() {
        return true;
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: i */
    public final CharSequence mo3766i() {
        return "androidx.viewpager.widget.ViewPager";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1130m(ViewPager2 viewPager2) {
        super(viewPager2, (byte) 0);
        this.f4556b = viewPager2;
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: c */
    public final boolean mo3759c(int i) {
        return (i == 8192 || i == 4096) && !this.f4556b.m3721d();
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: d */
    public final boolean mo3761d(int i) {
        if (mo3759c(i)) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: a */
    public final void mo3750a(C0482c c0482c) {
        if (this.f4556b.m3721d()) {
            return;
        }
        c0482c.m1663b(C0483d.f2312n);
        c0482c.m1663b(C0483d.f2311m);
        c0482c.m1692k(false);
    }
}
