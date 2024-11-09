package com.google.android.material.tabs;

import androidx.viewpager.widget.AbstractC1094a;
import androidx.viewpager.widget.InterfaceC1107n;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabLayout.java */
/* renamed from: com.google.android.material.tabs.b */
/* loaded from: classes.dex */
public final class C2351b implements InterfaceC1107n {

    /* renamed from: a */
    final /* synthetic */ TabLayout f10397a;

    /* renamed from: b */
    private boolean f10398b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2351b(TabLayout tabLayout) {
        this.f10397a = tabLayout;
    }

    @Override // androidx.viewpager.widget.InterfaceC1107n
    /* renamed from: a */
    public final void mo3706a(ViewPager viewPager, AbstractC1094a abstractC1094a, AbstractC1094a abstractC1094a2) {
        if (this.f10397a.f10383w == viewPager) {
            this.f10397a.m7495a(abstractC1094a2, this.f10398b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7520a() {
        this.f10398b = true;
    }
}
