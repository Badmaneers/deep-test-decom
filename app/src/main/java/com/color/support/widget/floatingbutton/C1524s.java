package com.color.support.widget.floatingbutton;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButtonLabel.java */
/* renamed from: com.color.support.widget.floatingbutton.s */
/* loaded from: classes.dex */
public final class C1524s extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ ColorFloatingButtonLabel f7264a;

    public C1524s(ColorFloatingButtonLabel colorFloatingButtonLabel) {
        this.f7264a = colorFloatingButtonLabel;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setAlpha(0.3f);
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }
}
