package androidx.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* compiled from: ChangeBounds.java */
/* renamed from: androidx.transition.i */
/* loaded from: classes.dex */
final class C1052i extends Property<View, PointF> {
    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ PointF get(View view) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1052i(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(View view, PointF pointF) {
        View view2 = view;
        PointF pointF2 = pointF;
        C1030bf.m3555a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
    }
}
