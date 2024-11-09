package androidx.viewpager2.adapter;

import androidx.fragment.app.AbstractC0671ao;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.EnumC0730j;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStateAdapter.java */
/* renamed from: androidx.viewpager2.adapter.c */
/* loaded from: classes.dex */
public final class C1115c {

    /* renamed from: a */
    final /* synthetic */ AbstractC1113a f4499a;

    /* renamed from: b */
    private ViewPager2 f4500b;

    /* renamed from: c */
    private long f4501c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3712a() {
        int currentItem;
        Fragment m1032a;
        if (this.f4499a.f4493b.mo2484g() || this.f4500b.getScrollState() != 0 || this.f4499a.f4494c.m1042c() || this.f4499a.mo3020b() == 0 || (currentItem = this.f4500b.getCurrentItem()) >= this.f4499a.mo3020b()) {
            return;
        }
        long mo3021b = this.f4499a.mo3021b(currentItem);
        if (mo3021b == this.f4501c || (m1032a = this.f4499a.f4494c.m1032a(mo3021b)) == null || !m1032a.m2320u()) {
            return;
        }
        this.f4501c = mo3021b;
        AbstractC0671ao mo2473a = this.f4499a.f4493b.mo2473a();
        Fragment fragment = null;
        for (int i = 0; i < this.f4499a.f4494c.m1035b(); i++) {
            long m1036b = this.f4499a.f4494c.m1036b(i);
            Fragment m1040c = this.f4499a.f4494c.m1040c(i);
            if (m1040c.m2320u()) {
                if (m1036b != this.f4501c) {
                    mo2473a.mo2337a(m1040c, EnumC0730j.STARTED);
                } else {
                    fragment = m1040c;
                }
                m1040c.m2283a(m1036b == this.f4501c);
            }
        }
        if (fragment != null) {
            mo2473a.mo2337a(fragment, EnumC0730j.RESUMED);
        }
        if (mo2473a.mo2355g()) {
            return;
        }
        mo2473a.mo2352d();
    }
}
