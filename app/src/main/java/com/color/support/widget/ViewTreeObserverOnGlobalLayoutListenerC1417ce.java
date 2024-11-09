package com.color.support.widget;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.color.support.util.C1340e;
import com.color.support.util.C1343h;

/* compiled from: ColorMaxHeightDraggableVerticalLinearLayout.java */
/* renamed from: com.color.support.widget.ce */
/* loaded from: classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC1417ce implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ColorMaxHeightDraggableVerticalLinearLayout f7019a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC1417ce(ColorMaxHeightDraggableVerticalLinearLayout colorMaxHeightDraggableVerticalLinearLayout) {
        this.f7019a = colorMaxHeightDraggableVerticalLinearLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        int m4584a;
        int i2;
        Activity m4391b = C1343h.m4391b(this.f7019a.getContext());
        int m4389a = C1343h.m4389a(m4391b);
        int m4393c = C1343h.m4393c(this.f7019a.getContext()) - (C1340e.m4380a(this.f7019a.getContext()) ? C1340e.m4381b(this.f7019a.getContext()) : 0);
        if (!C1343h.m4392b(m4391b) || m4389a == 0) {
            return;
        }
        i = this.f7019a.f6258a;
        if (m4389a == i || m4389a < m4393c / 4) {
            return;
        }
        m4584a = this.f7019a.m4584a(m4391b, m4389a);
        i2 = this.f7019a.f6259b;
        if (i2 == m4584a || m4584a == 0 || !this.f7019a.isAttachedToWindow()) {
            return;
        }
        this.f7019a.f6259b = m4584a;
        this.f7019a.requestLayout();
    }
}
