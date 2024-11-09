package com.color.support.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class ColorHeightView {

    /* renamed from: a */
    private View f6046a;

    public void setHeight(int i) {
        if (this.f6046a != null) {
            ViewGroup.LayoutParams layoutParams = this.f6046a.getLayoutParams();
            layoutParams.height = i;
            this.f6046a.setLayoutParams(layoutParams);
        }
    }

    public int getHeight() {
        if (this.f6046a != null) {
            return this.f6046a.getHeight();
        }
        return 0;
    }
}
