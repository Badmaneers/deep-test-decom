package com.color.support.widget.floatingbutton;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButton.java */
/* renamed from: com.color.support.widget.floatingbutton.b */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1507b implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ ColorFloatingButton f7232a;

    public ViewOnTouchListenerC1507b(ColorFloatingButton colorFloatingButton) {
        this.f7232a = colorFloatingButton;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7232a.m5088f();
            return false;
        }
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.f7232a.m5089g();
        return false;
    }
}
