package com.color.support.widget.floatingbutton;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButtonLabel.java */
/* renamed from: com.color.support.widget.floatingbutton.u */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1526u implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ ColorFloatingButtonLabel f7266a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnTouchListenerC1526u(ColorFloatingButtonLabel colorFloatingButtonLabel) {
        this.f7266a = colorFloatingButtonLabel;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ColorFloatingButtonLabel.m5131b(this.f7266a);
            return false;
        }
        if (motionEvent.getAction() != 1) {
            return false;
        }
        ColorFloatingButtonLabel.m5132c(this.f7266a);
        return false;
    }
}
