package androidx.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* compiled from: ChangeBounds.java */
/* renamed from: androidx.transition.k */
/* loaded from: classes.dex */
final class C1054k extends Property<View, PointF> {
    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ PointF get(View view) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1054k(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(View view, PointF pointF) {
        View view2 = view;
        PointF pointF2 = pointF;
        int round = Math.round(pointF2.x);
        int round2 = Math.round(pointF2.y);
        C1030bf.m3555a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
    }
}
