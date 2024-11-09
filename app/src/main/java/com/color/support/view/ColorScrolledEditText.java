package com.color.support.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.color.support.widget.ColorEditText;

/* loaded from: classes.dex */
public class ColorScrolledEditText extends ColorEditText {

    /* renamed from: a */
    private int f5837a;

    public ColorScrolledEditText(Context context) {
        super(context);
    }

    public ColorScrolledEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColorScrolledEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.color.support.widget.ColorEditText, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            this.f5837a = (getLineHeight() * getMaxLines()) + getPaddingTop() + getPaddingBottom();
            if (getHeight() >= this.f5837a) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
