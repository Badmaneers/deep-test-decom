package com.color.support.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ListView;

/* loaded from: classes.dex */
public class ForegroundListView extends ListView {

    /* renamed from: a */
    private Paint f5838a;

    public ForegroundListView(Context context) {
        super(context);
        this.f5838a = new Paint();
    }

    public ForegroundListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5838a = new Paint();
    }

    public ForegroundListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5838a = new Paint();
    }

    public ForegroundListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5838a = new Paint();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(" ", 0.0f, 0.0f, this.f5838a);
    }
}
