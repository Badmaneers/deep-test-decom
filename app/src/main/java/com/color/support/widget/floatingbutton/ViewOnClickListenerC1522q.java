package com.color.support.widget.floatingbutton;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButtonLabel.java */
/* renamed from: com.color.support.widget.floatingbutton.q */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1522q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ColorFloatingButtonLabel f7262a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1522q(ColorFloatingButtonLabel colorFloatingButtonLabel) {
        this.f7262a = colorFloatingButtonLabel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1517l interfaceC1517l;
        InterfaceC1517l interfaceC1517l2;
        ColorFloatingButtonItem colorFloatingButtonItem = this.f7262a.getColorFloatingButtonItem();
        interfaceC1517l = this.f7262a.f7227g;
        if (interfaceC1517l == null || colorFloatingButtonItem == null) {
            return;
        }
        interfaceC1517l2 = this.f7262a.f7227g;
        interfaceC1517l2.mo5133a(colorFloatingButtonItem);
    }
}
