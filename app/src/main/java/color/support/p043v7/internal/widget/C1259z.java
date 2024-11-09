package color.support.p043v7.internal.widget;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ListView;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.z */
/* loaded from: classes.dex */
final class C1259z implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ListView f5291a;

    /* renamed from: b */
    final /* synthetic */ C1256w f5292b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1259z(C1256w c1256w, ListView listView) {
        this.f5292b = c1256w;
        this.f5291a = listView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5291a.setTranslationY((-C1256w.m4095a((View) this.f5291a)) * ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
