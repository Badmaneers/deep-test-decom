package androidx.vectordrawable.p039a.p040a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.core.content.p020a.C0422b;
import androidx.core.content.p020a.C0435o;
import androidx.core.graphics.C0543b;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.o */
/* loaded from: classes.dex */
public final class C1083o extends AbstractC1086r {

    /* renamed from: a */
    C0422b f4299a;

    /* renamed from: b */
    float f4300b;

    /* renamed from: c */
    C0422b f4301c;

    /* renamed from: d */
    float f4302d;

    /* renamed from: e */
    float f4303e;

    /* renamed from: f */
    float f4304f;

    /* renamed from: g */
    float f4305g;

    /* renamed from: h */
    float f4306h;

    /* renamed from: i */
    Paint.Cap f4307i;

    /* renamed from: j */
    Paint.Join f4308j;

    /* renamed from: k */
    float f4309k;

    /* renamed from: p */
    private int[] f4310p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1083o() {
        this.f4300b = 0.0f;
        this.f4302d = 1.0f;
        this.f4303e = 1.0f;
        this.f4304f = 0.0f;
        this.f4305g = 1.0f;
        this.f4306h = 0.0f;
        this.f4307i = Paint.Cap.BUTT;
        this.f4308j = Paint.Join.MITER;
        this.f4309k = 4.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1083o(C1083o c1083o) {
        super(c1083o);
        this.f4300b = 0.0f;
        this.f4302d = 1.0f;
        this.f4303e = 1.0f;
        this.f4304f = 0.0f;
        this.f4305g = 1.0f;
        this.f4306h = 0.0f;
        this.f4307i = Paint.Cap.BUTT;
        this.f4308j = Paint.Join.MITER;
        this.f4309k = 4.0f;
        this.f4310p = c1083o.f4310p;
        this.f4299a = c1083o.f4299a;
        this.f4300b = c1083o.f4300b;
        this.f4302d = c1083o.f4302d;
        this.f4301c = c1083o.f4301c;
        this.f4326n = c1083o.f4326n;
        this.f4303e = c1083o.f4303e;
        this.f4304f = c1083o.f4304f;
        this.f4305g = c1083o.f4305g;
        this.f4306h = c1083o.f4306h;
        this.f4307i = c1083o.f4307i;
        this.f4308j = c1083o.f4308j;
        this.f4309k = c1083o.f4309k;
    }

    /* renamed from: a */
    public final void m3610a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        TypedArray m1540a = C0435o.m1540a(resources, theme, attributeSet, C1069a.f4261c);
        this.f4310p = null;
        if (C0435o.m1544a(xmlPullParser, "pathData")) {
            String string = m1540a.getString(0);
            if (string != null) {
                this.f4325m = string;
            }
            String string2 = m1540a.getString(2);
            if (string2 != null) {
                this.f4324l = C0543b.m1911b(string2);
            }
            this.f4301c = C0435o.m1542a(m1540a, xmlPullParser, theme, "fillColor", 1);
            this.f4303e = C0435o.m1534a(m1540a, xmlPullParser, "fillAlpha", 12, this.f4303e);
            int m1539a = C0435o.m1539a(m1540a, xmlPullParser, "strokeLineCap", 8, -1);
            Paint.Cap cap = this.f4307i;
            switch (m1539a) {
                case 0:
                    cap = Paint.Cap.BUTT;
                    break;
                case 1:
                    cap = Paint.Cap.ROUND;
                    break;
                case 2:
                    cap = Paint.Cap.SQUARE;
                    break;
            }
            this.f4307i = cap;
            int m1539a2 = C0435o.m1539a(m1540a, xmlPullParser, "strokeLineJoin", 9, -1);
            Paint.Join join = this.f4308j;
            switch (m1539a2) {
                case 0:
                    join = Paint.Join.MITER;
                    break;
                case 1:
                    join = Paint.Join.ROUND;
                    break;
                case 2:
                    join = Paint.Join.BEVEL;
                    break;
            }
            this.f4308j = join;
            this.f4309k = C0435o.m1534a(m1540a, xmlPullParser, "strokeMiterLimit", 10, this.f4309k);
            this.f4299a = C0435o.m1542a(m1540a, xmlPullParser, theme, "strokeColor", 3);
            this.f4302d = C0435o.m1534a(m1540a, xmlPullParser, "strokeAlpha", 11, this.f4302d);
            this.f4300b = C0435o.m1534a(m1540a, xmlPullParser, "strokeWidth", 4, this.f4300b);
            this.f4305g = C0435o.m1534a(m1540a, xmlPullParser, "trimPathEnd", 6, this.f4305g);
            this.f4306h = C0435o.m1534a(m1540a, xmlPullParser, "trimPathOffset", 7, this.f4306h);
            this.f4304f = C0435o.m1534a(m1540a, xmlPullParser, "trimPathStart", 5, this.f4304f);
            this.f4326n = C0435o.m1539a(m1540a, xmlPullParser, "fillType", 13, this.f4326n);
        }
        m1540a.recycle();
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1085q
    /* renamed from: b */
    public final boolean mo3612b() {
        return this.f4301c.m1501d() || this.f4299a.m1501d();
    }

    @Override // androidx.vectordrawable.p039a.p040a.AbstractC1085q
    /* renamed from: a */
    public final boolean mo3611a(int[] iArr) {
        return this.f4299a.m1497a(iArr) | this.f4301c.m1497a(iArr);
    }

    final int getStrokeColor() {
        return this.f4299a.m1498b();
    }

    final void setStrokeColor(int i) {
        this.f4299a.m1499b(i);
    }

    final float getStrokeWidth() {
        return this.f4300b;
    }

    final void setStrokeWidth(float f) {
        this.f4300b = f;
    }

    final float getStrokeAlpha() {
        return this.f4302d;
    }

    final void setStrokeAlpha(float f) {
        this.f4302d = f;
    }

    final int getFillColor() {
        return this.f4301c.m1498b();
    }

    final void setFillColor(int i) {
        this.f4301c.m1499b(i);
    }

    final float getFillAlpha() {
        return this.f4303e;
    }

    final void setFillAlpha(float f) {
        this.f4303e = f;
    }

    final float getTrimPathStart() {
        return this.f4304f;
    }

    final void setTrimPathStart(float f) {
        this.f4304f = f;
    }

    final float getTrimPathEnd() {
        return this.f4305g;
    }

    final void setTrimPathEnd(float f) {
        this.f4305g = f;
    }

    final float getTrimPathOffset() {
        return this.f4306h;
    }

    final void setTrimPathOffset(float f) {
        this.f4306h = f;
    }
}
