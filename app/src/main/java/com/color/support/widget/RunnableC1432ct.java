package com.color.support.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import color.support.p043v7.appcompat.R;
import color.support.p043v7.widget.Toolbar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.ct */
/* loaded from: classes.dex */
public final class RunnableC1432ct implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ColorSearchViewAnimate f7068a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1432ct(ColorSearchViewAnimate colorSearchViewAnimate) {
        this.f7068a = colorSearchViewAnimate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toolbar toolbar;
        Toolbar toolbar2;
        TextView textView;
        TextView textView2;
        boolean m4691h;
        Toolbar toolbar3;
        toolbar = this.f7068a.f6480o;
        if (toolbar != null) {
            int i = -1;
            toolbar2 = this.f7068a.f6480o;
            int childCount = toolbar2.getChildCount();
            if (childCount > 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    toolbar3 = this.f7068a.f6480o;
                    View childAt = toolbar3.getChildAt(i2);
                    if (childAt instanceof ActionMenuView) {
                        i = ((ActionMenuView) childAt).getWidth();
                        break;
                    }
                    i2++;
                }
            }
            if (i > 0) {
                int dimensionPixelSize = i + this.f7068a.getContext().getResources().getDimensionPixelSize(R.dimen.color_actionbar_menuitemview_item_spacing);
                textView = this.f7068a.f6468c;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    m4691h = this.f7068a.m4691h();
                    if (m4691h) {
                        marginLayoutParams.leftMargin = dimensionPixelSize;
                    } else {
                        marginLayoutParams.rightMargin = dimensionPixelSize;
                    }
                }
                textView2 = this.f7068a.f6468c;
                textView2.setLayoutParams(layoutParams);
            }
        }
    }
}
