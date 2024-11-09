package androidx.transition;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: ChangeBounds.java */
/* renamed from: androidx.transition.e */
/* loaded from: classes.dex */
final class C1048e extends Property<Drawable, PointF> {

    /* renamed from: a */
    private Rect f4215a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1048e(Class cls, String str) {
        super(cls, str);
        this.f4215a = new Rect();
    }

    @Override // android.util.Property
    public final /* synthetic */ PointF get(Drawable drawable) {
        drawable.copyBounds(this.f4215a);
        return new PointF(this.f4215a.left, this.f4215a.top);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Drawable drawable, PointF pointF) {
        Drawable drawable2 = drawable;
        PointF pointF2 = pointF;
        drawable2.copyBounds(this.f4215a);
        this.f4215a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
        drawable2.setBounds(this.f4215a);
    }
}
