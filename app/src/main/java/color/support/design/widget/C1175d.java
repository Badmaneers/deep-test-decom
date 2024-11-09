package color.support.design.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorTabLayout.java */
/* renamed from: color.support.design.widget.d */
/* loaded from: classes.dex */
public final class C1175d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorTabLayout f4769a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1175d(ColorTabLayout colorTabLayout) {
        this.f4769a = colorTabLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4769a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
