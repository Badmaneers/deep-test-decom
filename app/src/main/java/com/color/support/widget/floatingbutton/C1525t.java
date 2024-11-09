package com.color.support.widget.floatingbutton;

import android.graphics.Outline;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButtonLabel.java */
/* renamed from: com.color.support.widget.floatingbutton.t */
/* loaded from: classes.dex */
public final class C1525t extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ ColorFloatingButtonLabel f7265a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1525t(ColorFloatingButtonLabel colorFloatingButtonLabel) {
        this.f7265a = colorFloatingButtonLabel;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int round;
        outline.setAlpha(0.3f);
        int width = view.getWidth();
        int height = view.getHeight();
        round = Math.round(TypedValue.applyDimension(1, 5.67f, this.f7265a.getContext().getResources().getDisplayMetrics()));
        outline.setRoundRect(0, 0, width, height, round);
    }
}
