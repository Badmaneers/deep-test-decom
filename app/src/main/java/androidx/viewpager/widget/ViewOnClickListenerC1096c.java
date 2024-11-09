package androidx.viewpager.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PagerTabStrip.java */
/* renamed from: androidx.viewpager.widget.c */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1096c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PagerTabStrip f4468a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1096c(PagerTabStrip pagerTabStrip) {
        this.f4468a = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4468a.f4388a.setCurrentItem(this.f4468a.f4388a.getCurrentItem() + 1);
    }
}
