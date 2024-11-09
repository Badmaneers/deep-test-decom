package com.google.android.material.bottomnavigation;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomNavigationItemView.java */
/* renamed from: com.google.android.material.bottomnavigation.a */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC2083a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ BottomNavigationItemView f9251a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnLayoutChangeListenerC2083a(BottomNavigationItemView bottomNavigationItemView) {
        this.f9251a = bottomNavigationItemView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ImageView imageView;
        ImageView imageView2;
        imageView = this.f9251a.f9200h;
        if (imageView.getVisibility() == 0) {
            BottomNavigationItemView bottomNavigationItemView = this.f9251a;
            imageView2 = this.f9251a.f9200h;
            BottomNavigationItemView.m6462a(bottomNavigationItemView, imageView2);
        }
    }
}
