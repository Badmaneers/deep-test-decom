package color.support.p043v7.internal.widget;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.y */
/* loaded from: classes.dex */
final class C1258y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ Drawable f5289a;

    /* renamed from: b */
    final /* synthetic */ C1256w f5290b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1258y(C1256w c1256w, Drawable drawable) {
        this.f5290b = c1256w;
        this.f5289a = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5289a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
