package androidx.viewpager.widget;

import android.view.View;

/* compiled from: PagerTabStrip.java */
/* renamed from: androidx.viewpager.widget.b */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1095b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PagerTabStrip f4467a;

    public ViewOnClickListenerC1095b(PagerTabStrip pagerTabStrip) {
        this.f4467a = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4467a.f4388a.setCurrentItem(this.f4467a.f4388a.getCurrentItem() - 1);
    }
}
