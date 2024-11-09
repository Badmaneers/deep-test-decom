package com.color.support.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorExpandableListView.java */
/* renamed from: com.color.support.widget.z */
/* loaded from: classes.dex */
public final class C1637z extends ValueAnimator {

    /* renamed from: a */
    private WeakReference<ColorExpandableListView> f7811a;

    /* renamed from: b */
    private boolean f7812b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ boolean m5450d(C1637z c1637z) {
        c1637z.f7812b = false;
        return false;
    }

    public C1637z(ColorExpandableListView colorExpandableListView, TimeInterpolator timeInterpolator) {
        this.f7811a = new WeakReference<>(colorExpandableListView);
        setDuration(400L);
        setInterpolator(timeInterpolator);
    }

    /* renamed from: a */
    public final void m5451a(boolean z, boolean z2, int i, View view, C1360ab c1360ab, int i2, int i3) {
        this.f7812b = true;
        setIntValues(i2, i3);
        removeAllUpdateListeners();
        addUpdateListener(new C1359aa(this, z2, i, z, view, c1360ab));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m5448b(C1637z c1637z) {
        c1637z.removeAllUpdateListeners();
        c1637z.end();
    }
}
