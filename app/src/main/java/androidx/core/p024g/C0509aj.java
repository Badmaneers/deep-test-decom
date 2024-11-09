package androidx.core.p024g;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPropertyAnimatorCompat.java */
/* renamed from: androidx.core.g.aj */
/* loaded from: classes.dex */
public final class C0509aj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0513an f2352a;

    /* renamed from: b */
    final /* synthetic */ View f2353b;

    /* renamed from: c */
    final /* synthetic */ C0507ah f2354c;

    public C0509aj(C0507ah c0507ah, InterfaceC0513an interfaceC0513an, View view) {
        this.f2354c = c0507ah;
        this.f2352a = interfaceC0513an;
        this.f2353b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2352a.mo211a();
    }
}
