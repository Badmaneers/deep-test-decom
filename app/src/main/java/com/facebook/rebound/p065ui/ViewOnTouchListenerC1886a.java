package com.facebook.rebound.p065ui;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: SpringConfiguratorView.java */
/* renamed from: com.facebook.rebound.ui.a */
/* loaded from: classes.dex */
final class ViewOnTouchListenerC1886a implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ SpringConfiguratorView f8684a;

    private ViewOnTouchListenerC1886a(SpringConfiguratorView springConfiguratorView) {
        this.f8684a = springConfiguratorView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ViewOnTouchListenerC1886a(SpringConfiguratorView springConfiguratorView, byte b) {
        this(springConfiguratorView);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return true;
        }
        SpringConfiguratorView.m6042g(this.f8684a);
        return true;
    }
}
