package androidx.viewpager2.widget;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;
import androidx.core.p024g.p025a.C0484e;
import androidx.core.p024g.p025a.InterfaceC0491l;
import androidx.recyclerview.widget.AbstractC0845ay;
import androidx.recyclerview.widget.AbstractC0848ba;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager2.java */
/* renamed from: androidx.viewpager2.widget.q */
/* loaded from: classes.dex */
public final class C1134q extends AbstractC1129l {

    /* renamed from: b */
    final /* synthetic */ ViewPager2 f4558b;

    /* renamed from: c */
    private final InterfaceC0491l f4559c;

    /* renamed from: d */
    private final InterfaceC0491l f4560d;

    /* renamed from: e */
    private AbstractC0848ba f4561e;

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: a */
    public final boolean mo3753a() {
        return true;
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: a */
    public final boolean mo3754a(int i) {
        return i == 8192 || i == 4096;
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: b */
    public final String mo3755b() {
        return "androidx.viewpager.widget.ViewPager";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134q(ViewPager2 viewPager2) {
        super(viewPager2, (byte) 0);
        this.f4558b = viewPager2;
        this.f4559c = new C1135r(this);
        this.f4560d = new C1136s(this);
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: a */
    public final void mo3751a(RecyclerView recyclerView) {
        C0538w.m1840a((View) recyclerView, 2);
        this.f4561e = new C1137t(this);
        if (C0538w.m1876g(this.f4558b) == 0) {
            C0538w.m1840a((View) this.f4558b, 1);
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: c */
    public final void mo3758c() {
        m3768j();
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: a */
    public final void mo3752a(AbstractC0845ay<?> abstractC0845ay) {
        m3768j();
        if (abstractC0845ay != null) {
            abstractC0845ay.m3017a(this.f4561e);
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: b */
    public final void mo3756b(AbstractC0845ay<?> abstractC0845ay) {
        if (abstractC0845ay != null) {
            abstractC0845ay.m3023b(this.f4561e);
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: d */
    public final void mo3760d() {
        m3768j();
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: e */
    public final void mo3762e() {
        m3768j();
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: f */
    public final void mo3763f() {
        m3768j();
        if (Build.VERSION.SDK_INT < 21) {
            this.f4558b.sendAccessibilityEvent(2048);
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: g */
    public final void mo3764g() {
        m3768j();
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: b */
    public final boolean mo3757b(int i) {
        int currentItem;
        if (!mo3754a(i)) {
            throw new IllegalStateException();
        }
        if (i == 8192) {
            currentItem = this.f4558b.getCurrentItem() - 1;
        } else {
            currentItem = this.f4558b.getCurrentItem() + 1;
        }
        m3767e(currentItem);
        return true;
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: a */
    public final void mo3748a(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource(this.f4558b);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m3767e(int i) {
        if (this.f4558b.m3721d()) {
            this.f4558b.setCurrentItemInternal$2563266(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m3768j() {
        int mo3020b;
        ViewPager2 viewPager2 = this.f4558b;
        int i = R.id.accessibilityActionPageLeft;
        C0538w.m1862b((View) viewPager2, R.id.accessibilityActionPageLeft);
        C0538w.m1862b((View) viewPager2, R.id.accessibilityActionPageRight);
        C0538w.m1862b((View) viewPager2, R.id.accessibilityActionPageUp);
        C0538w.m1862b((View) viewPager2, R.id.accessibilityActionPageDown);
        if (this.f4558b.getAdapter() == null || (mo3020b = this.f4558b.getAdapter().mo3020b()) == 0 || !this.f4558b.m3721d()) {
            return;
        }
        if (this.f4558b.getOrientation() == 0) {
            boolean m3719b = this.f4558b.m3719b();
            int i2 = m3719b ? 16908360 : 16908361;
            if (m3719b) {
                i = 16908361;
            }
            if (this.f4558b.f4503b < mo3020b - 1) {
                C0538w.m1848a(viewPager2, new C0483d(i2), this.f4559c);
            }
            if (this.f4558b.f4503b > 0) {
                C0538w.m1848a(viewPager2, new C0483d(i), this.f4560d);
                return;
            }
            return;
        }
        if (this.f4558b.f4503b < mo3020b - 1) {
            C0538w.m1848a(viewPager2, new C0483d(R.id.accessibilityActionPageDown), this.f4559c);
        }
        if (this.f4558b.f4503b > 0) {
            C0538w.m1848a(viewPager2, new C0483d(R.id.accessibilityActionPageUp), this.f4560d);
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC1129l
    /* renamed from: a */
    public final void mo3749a(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        AbstractC0845ay adapter;
        int mo3020b;
        if (this.f4558b.getAdapter() == null) {
            i = 0;
            i2 = 0;
        } else if (this.f4558b.getOrientation() == 1) {
            i = this.f4558b.getAdapter().mo3020b();
            i2 = 0;
        } else {
            i2 = this.f4558b.getAdapter().mo3020b();
            i = 0;
        }
        C0482c.m1635a(accessibilityNodeInfo).m1653a(C0484e.m1714a(i, i2, 0));
        if (Build.VERSION.SDK_INT < 16 || (adapter = this.f4558b.getAdapter()) == null || (mo3020b = adapter.mo3020b()) == 0 || !this.f4558b.m3721d()) {
            return;
        }
        if (this.f4558b.f4503b > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (this.f4558b.f4503b < mo3020b - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }
}
