package com.color.support.widget.floatingbutton;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButton.java */
/* renamed from: com.color.support.widget.floatingbutton.c */
/* loaded from: classes.dex */
public final class C1508c extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ ColorFloatingButton f7233a;

    public C1508c(ColorFloatingButton colorFloatingButton) {
        this.f7233a = colorFloatingButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setAlpha(0.3f);
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }
}
