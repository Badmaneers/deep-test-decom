package com.color.support.preference;

import android.view.View;

/* compiled from: SecondToolbarBehavior.java */
/* renamed from: com.color.support.preference.e */
/* loaded from: classes.dex */
final class ViewOnScrollChangeListenerC1335e implements View.OnScrollChangeListener {

    /* renamed from: a */
    final /* synthetic */ SecondToolbarBehavior f5801a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnScrollChangeListenerC1335e(SecondToolbarBehavior secondToolbarBehavior) {
        this.f5801a = secondToolbarBehavior;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        this.f5801a.m4369b();
    }
}
