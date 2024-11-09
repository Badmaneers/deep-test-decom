package com.color.support.widget.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1342g;

/* loaded from: classes.dex */
public class ColorTabNavigationMenuView extends ColorNavigationMenuView {
    public ColorTabNavigationMenuView(Context context) {
        this(context, null);
    }

    public ColorTabNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColorTabNavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.color.support.widget.navigation.ColorNavigationMenuView, android.view.View
    public void onMeasure(int i, int i2) {
        if (C1342g.m4385a(getContext())) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8) {
                    ((RelativeLayout.LayoutParams) childAt.findViewById(R.id.icon).getLayoutParams()).addRule(14, -1);
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
