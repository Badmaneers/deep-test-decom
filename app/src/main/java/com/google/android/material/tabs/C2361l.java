package com.google.android.material.tabs;

import androidx.viewpager.widget.ViewPager;

/* compiled from: TabLayout.java */
/* renamed from: com.google.android.material.tabs.l */
/* loaded from: classes.dex */
public final class C2361l implements InterfaceC2353d {

    /* renamed from: a */
    private final ViewPager f10431a;

    public C2361l(ViewPager viewPager) {
        this.f10431a = viewPager;
    }

    @Override // com.google.android.material.tabs.InterfaceC2352c
    /* renamed from: a */
    public final void mo7521a(C2358i c2358i) {
        this.f10431a.setCurrentItem(c2358i.m7542c());
    }
}
