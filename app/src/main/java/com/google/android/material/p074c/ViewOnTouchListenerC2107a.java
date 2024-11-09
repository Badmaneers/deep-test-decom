package com.google.android.material.p074c;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener.java */
/* renamed from: com.google.android.material.c.a */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2107a implements View.OnTouchListener {

    /* renamed from: a */
    private final Dialog f9367a;

    /* renamed from: b */
    private final int f9368b;

    /* renamed from: c */
    private final int f9369c;

    /* renamed from: d */
    private final int f9370d;

    public ViewOnTouchListenerC2107a(Dialog dialog, Rect rect) {
        this.f9367a = dialog;
        this.f9368b = rect.left;
        this.f9369c = rect.top;
        this.f9370d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.f9368b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f9369c + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            obtain.setLocation((-this.f9370d) - 1, (-this.f9370d) - 1);
        }
        view.performClick();
        return this.f9367a.onTouchEvent(obtain);
    }
}
