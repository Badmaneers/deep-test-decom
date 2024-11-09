package com.color.support.widget.slideselect;

import android.view.animation.Animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSlideSelectView.java */
/* renamed from: com.color.support.widget.slideselect.e */
/* loaded from: classes.dex */
public final class C1622e extends AbstractAnimationAnimationListenerC1618a {

    /* renamed from: a */
    final /* synthetic */ ColorSlideSelectView f7770a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1622e(ColorSlideSelectView colorSlideSelectView) {
        this.f7770a = colorSlideSelectView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        ColorSelectListView colorSelectListView;
        this.f7770a.f7758n = true;
        colorSelectListView = this.f7770a.f7749e;
        colorSelectListView.setAnimationInPregress(true);
    }

    @Override // com.color.support.widget.slideselect.AbstractAnimationAnimationListenerC1618a, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ColorSelectListView colorSelectListView;
        this.f7770a.f7758n = false;
        colorSelectListView = this.f7770a.f7749e;
        colorSelectListView.setAnimationInPregress(false);
    }
}
