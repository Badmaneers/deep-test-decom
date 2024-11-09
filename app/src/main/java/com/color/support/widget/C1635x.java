package com.color.support.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorExpandableListView.java */
/* renamed from: com.color.support.widget.x */
/* loaded from: classes.dex */
public final class C1635x extends View {

    /* renamed from: a */
    private List<View> f7807a;

    /* renamed from: b */
    private Drawable f7808b;

    /* renamed from: c */
    private int f7809c;

    /* renamed from: d */
    private int f7810d;

    public C1635x(Context context) {
        super(context);
        this.f7807a = new ArrayList();
    }

    /* renamed from: a */
    public final void m5445a(Drawable drawable, int i, int i2) {
        if (drawable != null) {
            this.f7808b = drawable;
            this.f7809c = i;
            this.f7810d = i2;
            drawable.setBounds(0, 0, i, i2);
        }
    }

    /* renamed from: a */
    public final void m5446a(View view) {
        this.f7807a.add(view);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        int size = this.f7807a.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            View view = this.f7807a.get(i7);
            int measuredHeight = view.getMeasuredHeight();
            view.layout(i, i2, view.getMeasuredWidth() + i, measuredHeight + i2);
            i6 = i6 + measuredHeight + this.f7810d;
            if (i6 > i5) {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void m5444a() {
        this.f7807a.clear();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f7808b != null) {
            this.f7808b.setBounds(0, 0, this.f7809c, this.f7810d);
        }
        int size = this.f7807a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f7807a.get(i2);
            canvas.save();
            int measuredHeight = view.getMeasuredHeight();
            i += measuredHeight;
            canvas.clipRect(0, 0, getWidth(), measuredHeight);
            view.draw(canvas);
            canvas.restore();
            if (this.f7808b != null) {
                i += this.f7810d;
                this.f7808b.draw(canvas);
                canvas.translate(0.0f, this.f7810d);
            }
            canvas.translate(0.0f, measuredHeight);
            if (i > canvas.getHeight()) {
                break;
            }
        }
        canvas.restore();
    }
}
