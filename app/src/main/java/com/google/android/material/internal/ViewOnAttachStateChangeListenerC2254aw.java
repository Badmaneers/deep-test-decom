package com.google.android.material.internal;

import android.view.View;
import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewUtils.java */
/* renamed from: com.google.android.material.internal.aw */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2254aw implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        C0538w.m1892u(view);
    }
}
