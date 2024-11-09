package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0705q;
import androidx.fragment.app.AbstractC0706r;
import androidx.fragment.app.Fragment;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStateAdapter.java */
/* renamed from: androidx.viewpager2.adapter.b */
/* loaded from: classes.dex */
public final class C1114b extends AbstractC0706r {

    /* renamed from: a */
    final /* synthetic */ Fragment f4496a;

    /* renamed from: b */
    final /* synthetic */ FrameLayout f4497b;

    /* renamed from: c */
    final /* synthetic */ AbstractC1113a f4498c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1114b(AbstractC1113a abstractC1113a, Fragment fragment, FrameLayout frameLayout) {
        this.f4498c = abstractC1113a;
        this.f4496a = fragment;
        this.f4497b = frameLayout;
    }

    @Override // androidx.fragment.app.AbstractC0706r
    /* renamed from: a */
    public final void mo2485a(AbstractC0705q abstractC0705q, Fragment fragment, View view) {
        if (fragment == this.f4496a) {
            abstractC0705q.mo2478b(this);
            AbstractC1113a.m3709a(view, this.f4497b);
        }
    }
}
