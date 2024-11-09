package com.color.support.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;

/* loaded from: classes.dex */
public class ColorCheckImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: a */
    private static final int[] f5920a = {R.attr.state_checked};

    /* renamed from: b */
    private boolean f5921b;

    public ColorCheckImageButton(Context context) {
        this(context, null);
    }

    public ColorCheckImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public ColorCheckImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f5921b != z) {
            this.f5921b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f5921b;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f5921b);
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f5921b) {
            return mergeDrawableStates(super.onCreateDrawableState(i + f5920a.length), f5920a);
        }
        return super.onCreateDrawableState(i);
    }
}
