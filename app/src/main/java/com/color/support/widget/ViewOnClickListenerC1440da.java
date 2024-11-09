package com.color.support.widget;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import com.color.support.widget.ColorSearchViewAnimate;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.da */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1440da implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ColorSearchViewAnimate f7076a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1440da(ColorSearchViewAnimate colorSearchViewAnimate) {
        this.f7076a = colorSearchViewAnimate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinearLayout linearLayout;
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton;
        boolean z;
        boolean z2;
        int id = view.getId();
        linearLayout = this.f7076a.f6472g;
        if (id == linearLayout.getId()) {
            z2 = ColorSearchViewAnimate.f6466a;
            if (z2) {
                Log.d("ColorSearchViewAnimate", "onClick: hint");
            }
            this.f7076a.getAnimatorHelper().m4998a(1);
            return;
        }
        int id2 = view.getId();
        searchCancelButton = this.f7076a.f6470e;
        if (id2 == searchCancelButton.getId()) {
            z = ColorSearchViewAnimate.f6466a;
            if (z) {
                Log.d("ColorSearchViewAnimate", "onClick: cancel button");
            }
            ColorSearchViewAnimate.m4695k(this.f7076a);
        }
    }
}
