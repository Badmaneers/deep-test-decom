package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.C2265j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationView.java */
/* renamed from: com.google.android.material.navigation.b */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2317b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ NavigationView f10207a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC2317b(NavigationView navigationView) {
        this.f10207a = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr;
        int[] iArr2;
        C2265j c2265j;
        NavigationView navigationView = this.f10207a;
        iArr = this.f10207a.f10202j;
        navigationView.getLocationOnScreen(iArr);
        iArr2 = this.f10207a.f10202j;
        boolean z = iArr2[1] == 0;
        c2265j = this.f10207a.f10200h;
        c2265j.m7196c(z);
        this.f10207a.setDrawTopInsetForeground(z);
        Context context = this.f10207a.getContext();
        if (!(context instanceof Activity) || Build.VERSION.SDK_INT < 21) {
            return;
        }
        Activity activity = (Activity) context;
        this.f10207a.setDrawBottomInsetForeground((activity.findViewById(R.id.content).getHeight() == this.f10207a.getHeight()) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0));
    }
}
