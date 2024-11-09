package color.support.p043v7.internal.widget;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ListView;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.ai */
/* loaded from: classes.dex */
final class C1226ai implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ListView f5219a;

    /* renamed from: b */
    final /* synthetic */ C1256w f5220b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1226ai(C1256w c1256w, ListView listView) {
        this.f5220b = c1256w;
        this.f5219a = listView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5219a.setTranslationY((-C1256w.m4095a((View) this.f5219a)) * (1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }
}
