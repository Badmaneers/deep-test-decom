package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: a */
    private int f9900a;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9900a = getVisibility();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m7075a(i, true);
    }

    /* renamed from: a */
    public final void m7075a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f9900a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f9900a;
    }
}
