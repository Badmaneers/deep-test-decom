package com.google.android.material.tabs;

import androidx.viewpager.widget.InterfaceC1108o;
import java.lang.ref.WeakReference;

/* compiled from: TabLayout.java */
/* renamed from: com.google.android.material.tabs.j */
/* loaded from: classes.dex */
public final class C2359j implements InterfaceC1108o {

    /* renamed from: a */
    private final WeakReference<TabLayout> f10426a;

    /* renamed from: b */
    private int f10427b;

    /* renamed from: c */
    private int f10428c;

    public C2359j(TabLayout tabLayout) {
        this.f10426a = new WeakReference<>(tabLayout);
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: b */
    public final void mo3707b(int i) {
        this.f10427b = this.f10428c;
        this.f10428c = i;
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: a */
    public final void mo3705a(int i, float f) {
        TabLayout tabLayout = this.f10426a.get();
        if (tabLayout != null) {
            tabLayout.m7494a(i, f, this.f10428c != 2 || this.f10427b == 1, (this.f10428c == 2 && this.f10427b == 0) ? false : true);
        }
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: a */
    public final void mo3704a(int i) {
        TabLayout tabLayout = this.f10426a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        tabLayout.m7497a(tabLayout.m7492a(i), this.f10428c == 0 || (this.f10428c == 2 && this.f10427b == 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7549a() {
        this.f10428c = 0;
        this.f10427b = 0;
    }
}
