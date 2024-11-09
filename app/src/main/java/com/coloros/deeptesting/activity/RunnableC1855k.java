package com.coloros.deeptesting.activity;

import android.widget.RelativeLayout;
import color.support.design.widget.ColorAppBarLayout;

/* compiled from: StatusActivity.java */
/* renamed from: com.coloros.deeptesting.activity.k */
/* loaded from: classes.dex */
final class RunnableC1855k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ StatusActivity f8607a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1855k(StatusActivity statusActivity) {
        this.f8607a = statusActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ColorAppBarLayout colorAppBarLayout;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        RelativeLayout relativeLayout4;
        colorAppBarLayout = this.f8607a.f8589b;
        int measuredHeight = colorAppBarLayout.getMeasuredHeight();
        relativeLayout = this.f8607a.f8590c;
        relativeLayout2 = this.f8607a.f8590c;
        int paddingLeft = relativeLayout2.getPaddingLeft();
        relativeLayout3 = this.f8607a.f8590c;
        int paddingRight = relativeLayout3.getPaddingRight();
        relativeLayout4 = this.f8607a.f8590c;
        relativeLayout.setPadding(paddingLeft, measuredHeight, paddingRight, relativeLayout4.getPaddingBottom());
    }
}
