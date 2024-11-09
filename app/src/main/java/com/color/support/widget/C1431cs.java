package com.color.support.widget;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: ColorScrollingTabView.java */
/* renamed from: com.color.support.widget.cs */
/* loaded from: classes.dex */
final class C1431cs extends AppCompatTextView {

    /* renamed from: a */
    final /* synthetic */ ColorScrollingTabView f7067a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431cs(ColorScrollingTabView colorScrollingTabView, Context context, int i) {
        super(context, null, i);
        this.f7067a = colorScrollingTabView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        C1430cr c1430cr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        c1430cr = this.f7067a.f6443f;
        if (c1430cr.getChildCount() > 4) {
            i6 = this.f7067a.f6455r;
            i7 = this.f7067a.f6455r;
            setPadding(i6, 0, i7, 0);
        } else {
            i3 = this.f7067a.f6454q;
            i4 = this.f7067a.f6454q;
            setPadding(i3, 0, i4, 0);
        }
        super.onMeasure(i, i2);
        i5 = this.f7067a.f6437A;
        setTextSize(0, i5);
    }
}
