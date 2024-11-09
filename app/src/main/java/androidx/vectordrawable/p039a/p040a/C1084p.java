package androidx.vectordrawable.p039a.p040a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import androidx.core.content.p020a.C0435o;
import androidx.p011b.C0318a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: VectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.p */
/* loaded from: classes.dex */
public final class C1084p extends AbstractC1085q {

    /* renamed from: a */
    final Matrix f4311a;

    /* renamed from: b */
    final ArrayList<AbstractC1085q> f4312b;

    /* renamed from: c */
    float f4313c;

    /* renamed from: d */
    final Matrix f4314d;

    /* renamed from: e */
    int f4315e;

    /* renamed from: f */
    private float f4316f;

    /* renamed from: g */
    private float f4317g;

    /* renamed from: h */
    private float f4318h;

    /* renamed from: i */
    private float f4319i;

    /* renamed from: j */
    private float f4320j;

    /* renamed from: k */
    private float f4321k;

    /* renamed from: l */
    private int[] f4322l;

    /* renamed from: m */
    private String f4323m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084p(C1084p c1084p, C0318a<String, Object> c0318a) {
        super((byte) 0);
        AbstractC1086r c1082n;
        this.f4311a = new Matrix();
        this.f4312b = new ArrayList<>();
        this.f4313c = 0.0f;
        this.f4316f = 0.0f;
        this.f4317g = 0.0f;
        this.f4318h = 1.0f;
        this.f4319i = 1.0f;
        this.f4320j = 0.0f;
        this.f4321k = 0.0f;
        this.f4314d = new Matrix();
        this.f4323m = null;
        this.f4313c = c1084p.f4313c;
        this.f4316f = c1084p.f4316f;
        this.f4317g = c1084p.f4317g;
        this.f4318h = c1084p.f4318h;
        this.f4319i = c1084p.f4319i;
        this.f4320j = c1084p.f4320j;
        this.f4321k = c1084p.f4321k;
        this.f4322l = c1084p.f4322l;
        this.f4323m = c1084p.f4323m;
        this.f4315e = c1084p.f4315e;
        if (this.f4323m != null) {
            c0318a.put(this.f4323m, this);
        }
        this.f4314d.set(c1084p.f4314d);
        ArrayList<AbstractC1085q> arrayList = c1084p.f4312b;
        for (int i = 0; i < arrayList.size(); i++) {
            AbstractC1085q abstractC1085q = arrayList.get(i);
            if (abstractC1085q instanceof C1084p) {
                this.f4312b.add(new C1084p((C1084p) abstractC1085q, c0318a));
            } else {
                if (abstractC1085q instanceof C1083o) {
                    c1082n = new C1083o((C1083o) abstractC1085q);
                } else if (abstractC1085q instanceof C1082n) {
                    c1082n = new C1082n((C1082n) abstractC1085q);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f4312b.add(c1082n);
                if (c1082n.f4325m != null) {
                    c0318a.put(c1082n.f4325m, c1082n);
                }
            }
        }
    }

    public C1084p() {
        super((byte) 0);
        this.f4311a = new Matrix();
        this.f4312b = new ArrayList<>();
        this.f4313c = 0.0f;
        this.f4316f = 0.0f;
        this.f4317g = 0.0f;
        this.f4318h = 1.0f;
        this.f4319i = 1.0f;
        this.f4320j = 0.0f;
        this.f4321k = 0.0f;
        this.f4314d = new Matrix();
        this.f4323m = null;
    }

    public final String getGroupName() {
        return this.f4323m;
    }

    public final Matrix getLocalMatrix() {
        return this.f4314d;
    }

    /* renamed from: a */
    public final void m3614a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        TypedArray m1540a = C0435o.m1540a(resources, theme, attributeSet, C1069a.f4260b);
        this.f4322l = null;
        this.f4313c = C0435o.m1534a(m1540a, xmlPullParser, "rotation", 5, this.f4313c);
        this.f4316f = m1540a.getFloat(1, this.f4316f);
        this.f4317g = m1540a.getFloat(2, this.f4317g);
        this.f4318h = C0435o.m1534a(m1540a, xmlPullParser, "scaleX", 3, this.f4318h);
        this.f4319i = C0435o.m1534a(m1540a, xmlPullParser, "scaleY", 4, this.f4319i);
        this.f4320j = C0435o.m1534a(m1540a, xmlPullParser, "translateX", 6, this.f4320j);
        this.f4321k = C0435o.m1534a(m1540a, xmlPullParser, "translateY", 7, this.f4321k);
        String string = m1540a.getString(0);
        if (string != null) {
            this.f4323m = string;
        }
        m3613a();
        m1540a.recycle();
    }

    /* renamed from: a */
    private void m3613a() {
        this.f4314d.reset();
        this.f4314d.postTranslate(-this.f4316f, -this.f4317g);
        this.f4314d.postScale(this.f4318h, this.f4319i);
        this.f4314d.postRotate(this.f4313c, 0.0f, 0.0f);
        this.f4314d.postTranslate(this.f4320j + this.f4316f, this.f4321k + this.f4317g);
    }

    public final float getRotation() {
        return this.f4313c;
    }

    public final void setRotation(float f) {
        if (f != this.f4313c) {
            this.f4313c = f;
            m3613a();
        }
    }

    public final float getPivotX() {
        return this.f4316f;
    }

    public final void setPivotX(float f) {
        if (f != this.f4316f) {
            this.f4316f = f;
            m3613a();
        }
    }

    public final float getPivotY() {
        return this.f4317g;
    }

    public final void setPivotY(float f) {
        if (f != this.f4317g) {
            this.f4317g = f;
            m3613a();
        }
    }

    public final float getScaleX() {
        return this.f4318h;
    }

    public final void setScaleX(float f) {
        if (f != this.f4318h) {
            this.f4318h = f;
            m3613a();
        }
    }

    public final float getScaleY() {
        return this.f4319i;
    }

    public final void setScaleY(float f) {
        if (f != this.f4319i) {
            this.f4319i = f;
            m3613a();
        }
    }

    public final float getTranslateX() {
        return this.f4320j;
    }

    public final void setTranslateX(float f) {
        if (f != this.f4320j) {
            this.f4320j = f;
            m3613a();
        }
    }

    public final float getTranslateY() {
        return this.f4321k;
    }

    public final void setTranslateY(float f) {
        if (f != this.f4321k) {
            this.f4321k = f;
            m3613a();
        }
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1085q
    /* renamed from: b */
    public final boolean mo3612b() {
        for (int i = 0; i < this.f4312b.size(); i++) {
            if (this.f4312b.get(i).mo3612b()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1085q
    /* renamed from: a */
    public final boolean mo3611a(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.f4312b.size(); i++) {
            z |= this.f4312b.get(i).mo3611a(iArr);
        }
        return z;
    }
}
