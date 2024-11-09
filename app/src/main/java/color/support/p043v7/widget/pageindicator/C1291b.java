package color.support.p043v7.widget.pageindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorPageIndicator.java */
/* renamed from: color.support.v7.widget.pageindicator.b */
/* loaded from: classes.dex */
public final class C1291b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ColorPageIndicator f5494a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1291b(ColorPageIndicator colorPageIndicator) {
        this.f5494a = colorPageIndicator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        RectF rectF;
        RectF rectF2;
        int i;
        super.onAnimationEnd(animator);
        z = this.f5494a.f5486t;
        if (!z) {
            rectF = this.f5494a.f5462A;
            rectF2 = this.f5494a.f5462A;
            float f = rectF2.left;
            i = this.f5494a.f5467a;
            rectF.right = f + i;
            this.f5494a.f5488v = false;
            this.f5494a.f5484r = true;
            this.f5494a.invalidate();
        }
        ColorPageIndicator.m4250j(this.f5494a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RectF rectF;
        RectF rectF2;
        super.onAnimationStart(animator);
        ColorPageIndicator.m4251k(this.f5494a);
        ColorPageIndicator colorPageIndicator = this.f5494a;
        rectF = this.f5494a.f5462A;
        colorPageIndicator.f5479m = rectF.left;
        ColorPageIndicator colorPageIndicator2 = this.f5494a;
        rectF2 = this.f5494a.f5462A;
        colorPageIndicator2.f5480n = rectF2.right;
    }
}
