package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.color.support.widget.ColorSearchViewAnimate;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.de */
/* loaded from: classes.dex */
public final class C1444de extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1441db f7087a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1444de(C1441db c1441db) {
        this.f7087a = c1441db;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton;
        ImageView imageView;
        Runnable runnable;
        super.onAnimationEnd(animator);
        searchCancelButton = this.f7087a.f7077a.f6470e;
        searchCancelButton.setVisibility(8);
        imageView = this.f7087a.f7077a.f6471f;
        imageView.setVisibility(8);
        runnable = this.f7087a.f7084h;
        runnable.run();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable;
        super.onAnimationStart(animator);
        runnable = this.f7087a.f7083g;
        runnable.run();
    }
}
