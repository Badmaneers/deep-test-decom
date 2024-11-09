package com.color.support.widget;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: ColorScrollingTabView.java */
/* renamed from: com.color.support.widget.cq */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1429cq implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f7059a;

    /* renamed from: b */
    final /* synthetic */ ColorScrollingTabView f7060b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1429cq(ColorScrollingTabView colorScrollingTabView, int i) {
        this.f7060b = colorScrollingTabView;
        this.f7059a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPager viewPager;
        viewPager = this.f7060b.f6438a;
        viewPager.m3691a(ColorScrollingTabView.m4672c(this.f7059a), false);
    }
}
