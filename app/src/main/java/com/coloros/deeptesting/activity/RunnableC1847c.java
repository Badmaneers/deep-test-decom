package com.coloros.deeptesting.activity;

import android.widget.ScrollView;
import color.support.design.widget.ColorAppBarLayout;

/* compiled from: ApplyActivity.java */
/* renamed from: com.coloros.deeptesting.activity.c */
/* loaded from: classes.dex */
final class RunnableC1847c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ApplyActivity f8599a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1847c(ApplyActivity applyActivity) {
        this.f8599a = applyActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ColorAppBarLayout colorAppBarLayout;
        ScrollView scrollView;
        ScrollView scrollView2;
        ScrollView scrollView3;
        ScrollView scrollView4;
        colorAppBarLayout = this.f8599a.f8574l;
        int measuredHeight = colorAppBarLayout.getMeasuredHeight();
        scrollView = this.f8599a.f8575m;
        scrollView2 = this.f8599a.f8575m;
        int paddingLeft = scrollView2.getPaddingLeft();
        scrollView3 = this.f8599a.f8575m;
        int paddingRight = scrollView3.getPaddingRight();
        scrollView4 = this.f8599a.f8575m;
        scrollView.setPadding(paddingLeft, measuredHeight, paddingRight, scrollView4.getPaddingBottom());
    }
}
