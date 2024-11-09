package com.color.support.widget;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLockPatternView.java */
/* renamed from: com.color.support.widget.bk */
/* loaded from: classes.dex */
public final class C1396bk implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorLockPatternView f6960a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1396bk(ColorLockPatternView colorLockPatternView) {
        this.f6960a = colorLockPatternView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ArrayList arrayList;
        C1405bt[][] c1405btArr;
        int i;
        int i2;
        float f;
        float f2;
        this.f6960a.f6209c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        arrayList = this.f6960a.f6214h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1404bs c1404bs = (C1404bs) it.next();
            c1405btArr = this.f6960a.f6207a;
            i = c1404bs.f6978b;
            C1405bt[] c1405btArr2 = c1405btArr[i];
            i2 = c1404bs.f6979c;
            C1405bt c1405bt = c1405btArr2[i2];
            f = this.f6960a.f6209c;
            c1405bt.f6990k = f;
            f2 = this.f6960a.f6209c;
            c1405bt.f6992m = f2 <= 0.1f;
        }
        this.f6960a.invalidate();
    }
}
