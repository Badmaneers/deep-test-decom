package androidx.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* compiled from: ChangeBounds.java */
/* renamed from: androidx.transition.j */
/* loaded from: classes.dex */
final class C1053j extends Property<View, PointF> {
    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ PointF get(View view) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1053j(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(View view, PointF pointF) {
        View view2 = view;
        PointF pointF2 = pointF;
        C1030bf.m3555a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
    }
}
