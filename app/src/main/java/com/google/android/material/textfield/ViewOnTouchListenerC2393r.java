package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.r */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2393r implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ AutoCompleteTextView f10567a;

    /* renamed from: b */
    final /* synthetic */ C2387l f10568b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnTouchListenerC2393r(C2387l c2387l, AutoCompleteTextView autoCompleteTextView) {
        this.f10568b = c2387l;
        this.f10567a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean m7644c;
        if (motionEvent.getAction() == 1) {
            m7644c = this.f10568b.m7644c();
            if (m7644c) {
                this.f10568b.f10553h = false;
            }
            C2387l.m7636a(this.f10568b, this.f10567a);
        }
        return false;
    }
}
