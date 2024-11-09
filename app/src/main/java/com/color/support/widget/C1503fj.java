package com.color.support.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpandableRecyclerConnector.java */
/* renamed from: com.color.support.widget.fj */
/* loaded from: classes.dex */
final class C1503fj extends View {

    /* renamed from: a */
    private List<View> f7174a;

    public C1503fj(Context context) {
        super(context);
        this.f7174a = new ArrayList();
    }

    /* renamed from: a */
    public final void m5045a(View view) {
        this.f7174a.add(view);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int size = this.f7174a.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            View view = this.f7174a.get(i7);
            int measuredHeight = view.getMeasuredHeight();
            i6 += measuredHeight;
            view.layout(i, i2, view.getMeasuredWidth() + i, measuredHeight + i2);
            if (i6 > i5) {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void m5044a() {
        this.f7174a.clear();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        int size = this.f7174a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f7174a.get(i2);
            canvas.save();
            int measuredHeight = view.getMeasuredHeight();
            i += measuredHeight;
            canvas.clipRect(0, 0, getWidth(), measuredHeight);
            view.draw(canvas);
            canvas.restore();
            canvas.translate(0.0f, measuredHeight);
            if (i > canvas.getHeight()) {
                break;
            }
        }
        canvas.restore();
    }
}
