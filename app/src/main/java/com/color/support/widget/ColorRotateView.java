package com.color.support.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.core.p024g.p026b.C0517b;

@TargetApi(12)
/* loaded from: classes.dex */
public class ColorRotateView extends ImageView {

    /* renamed from: a */
    private Interpolator f6403a;

    /* renamed from: b */
    private long f6404b;

    /* renamed from: c */
    private boolean f6405c;

    public ColorRotateView(Context context) {
        this(context, null);
    }

    public ColorRotateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorRotateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f6403a = C0517b.m1773a(0.133f, 0.0f, 0.3f, 1.0f);
        this.f6404b = 400L;
        this.f6405c = false;
        animate().setDuration(this.f6404b).setInterpolator(this.f6403a);
    }

    public void setExpanded(boolean z) {
        if (this.f6405c == z) {
            return;
        }
        this.f6405c = z;
        setRotation(z ? 180.0f : 0.0f);
    }
}
