package color.support.p043v7.internal.widget;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.ah */
/* loaded from: classes.dex */
final class C1225ah implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ Drawable f5217a;

    /* renamed from: b */
    final /* synthetic */ C1256w f5218b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1225ah(C1256w c1256w, Drawable drawable) {
        this.f5218b = c1256w;
        this.f5217a = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5217a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
