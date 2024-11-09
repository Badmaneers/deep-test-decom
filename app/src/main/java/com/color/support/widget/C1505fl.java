package com.color.support.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpandableRecyclerConnector.java */
/* renamed from: com.color.support.widget.fl */
/* loaded from: classes.dex */
public final class C1505fl extends ValueAnimator {

    /* renamed from: a */
    private WeakReference<ColorExpandableRecyclerView> f7175a;

    /* renamed from: b */
    private boolean f7176b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ boolean m5049d(C1505fl c1505fl) {
        c1505fl.f7176b = false;
        return false;
    }

    public C1505fl(ColorExpandableRecyclerView colorExpandableRecyclerView, TimeInterpolator timeInterpolator) {
        this.f7175a = new WeakReference<>(colorExpandableRecyclerView);
        setDuration(400L);
        setInterpolator(timeInterpolator);
    }

    /* renamed from: a */
    public final void m5050a(boolean z, boolean z2, int i, View view, C1529fn c1529fn, int i2, int i3) {
        Log.d("ExpandableRecyclerConnector", "setParam: " + z + ", isLastChild:" + z2 + " ,flatPos:" + i + " ,start:" + i2 + " ,end:" + i3);
        this.f7176b = true;
        setIntValues(i2, i3);
        removeAllUpdateListeners();
        addUpdateListener(new C1528fm(this, z2, i, z, view, c1529fn));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m5047b(C1505fl c1505fl) {
        c1505fl.removeAllUpdateListeners();
        c1505fl.end();
    }
}
