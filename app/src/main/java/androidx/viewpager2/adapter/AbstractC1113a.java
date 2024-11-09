package androidx.viewpager2.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p024g.C0538w;
import androidx.fragment.app.AbstractC0705q;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0728h;
import androidx.lifecycle.EnumC0729i;
import androidx.lifecycle.EnumC0730j;
import androidx.lifecycle.InterfaceC0731k;
import androidx.lifecycle.InterfaceC0733m;
import androidx.p011b.C0323f;
import androidx.recyclerview.widget.AbstractC0845ay;

/* compiled from: FragmentStateAdapter.java */
/* renamed from: androidx.viewpager2.adapter.a */
/* loaded from: classes.dex */
public abstract class AbstractC1113a extends AbstractC0845ay<C1116d> implements InterfaceC1117e {

    /* renamed from: a */
    final AbstractC0728h f4492a;

    /* renamed from: b */
    final AbstractC0705q f4493b;

    /* renamed from: c */
    final C0323f<Fragment> f4494c;

    /* renamed from: d */
    private C1115c f4495d;

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: b */
    public final long mo3021b(int i) {
        return i;
    }

    /* renamed from: a */
    public final void m3711a(C1116d c1116d) {
        Fragment m1032a = this.f4494c.m1032a(c1116d.m3211e());
        if (m1032a == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) c1116d.f3614a;
        View m2322w = m1032a.m2322w();
        if (!m1032a.m2320u() && m2322w != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (m1032a.m2320u() && m2322w == null) {
            m3710a(m1032a, frameLayout);
            return;
        }
        if (m1032a.m2320u() && m2322w.getParent() != null) {
            if (m2322w.getParent() != frameLayout) {
                m3709a(m2322w, frameLayout);
            }
        } else {
            if (m1032a.m2320u()) {
                m3709a(m2322w, frameLayout);
                return;
            }
            if (!this.f4493b.mo2484g()) {
                m3710a(m1032a, frameLayout);
                this.f4493b.mo2473a().m2374a(m1032a, "f" + c1116d.m3211e()).mo2337a(m1032a, EnumC0730j.STARTED).mo2352d();
                this.f4495d.m3712a();
                return;
            }
            if (this.f4493b.mo2482e()) {
                return;
            }
            this.f4492a.mo2609a(new InterfaceC0731k() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$2

                /* renamed from: a */
                final /* synthetic */ C1116d f4487a;

                public FragmentStateAdapter$2(C1116d c1116d2) {
                    r2 = c1116d2;
                }

                @Override // androidx.lifecycle.InterfaceC0731k
                /* renamed from: a */
                public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
                    if (AbstractC1113a.this.f4493b.mo2484g()) {
                        return;
                    }
                    interfaceC0733m.mo31a().mo2610b(this);
                    if (C0538w.m1822F((FrameLayout) r2.f3614a)) {
                        AbstractC1113a.this.m3711a(r2);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m3710a(Fragment fragment, FrameLayout frameLayout) {
        this.f4493b.mo2476a(new C1114b(this, fragment, frameLayout));
    }

    /* renamed from: a */
    public static void m3709a(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }
}
