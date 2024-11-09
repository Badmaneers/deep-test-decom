package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class Guideline extends View {
    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0384a c0384a = (C0384a) getLayoutParams();
        c0384a.f1923a = i;
        setLayoutParams(c0384a);
    }

    public void setGuidelineEnd(int i) {
        C0384a c0384a = (C0384a) getLayoutParams();
        c0384a.f1937b = i;
        setLayoutParams(c0384a);
    }

    public void setGuidelinePercent(float f) {
        C0384a c0384a = (C0384a) getLayoutParams();
        c0384a.f1938c = f;
        setLayoutParams(c0384a);
    }
}
