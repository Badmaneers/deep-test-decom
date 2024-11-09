package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty.java */
/* renamed from: androidx.transition.aa */
/* loaded from: classes.dex */
final class C0998aa<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f4078a;

    /* renamed from: b */
    private final PathMeasure f4079b;

    /* renamed from: c */
    private final float f4080c;

    /* renamed from: d */
    private final float[] f4081d;

    /* renamed from: e */
    private final PointF f4082e;

    /* renamed from: f */
    private float f4083f;

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Float f) {
        Float f2 = f;
        this.f4083f = f2.floatValue();
        this.f4079b.getPosTan(this.f4080c * f2.floatValue(), this.f4081d, null);
        this.f4082e.x = this.f4081d[0];
        this.f4082e.y = this.f4081d[1];
        this.f4078a.set(obj, this.f4082e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0998aa(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f4081d = new float[2];
        this.f4082e = new PointF();
        this.f4078a = property;
        this.f4079b = new PathMeasure(path, false);
        this.f4080c = this.f4079b.getLength();
    }

    @Override // android.util.Property
    public final /* synthetic */ Float get(Object obj) {
        return Float.valueOf(this.f4083f);
    }
}
