package androidx.vectordrawable.p039a.p040a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.p020a.C0435o;
import androidx.core.graphics.C0543b;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PathInterpolatorCompat.java */
/* renamed from: androidx.vectordrawable.a.a.k */
/* loaded from: classes.dex */
public final class InterpolatorC1079k implements Interpolator {

    /* renamed from: a */
    private float[] f4286a;

    /* renamed from: b */
    private float[] f4287b;

    public InterpolatorC1079k(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private InterpolatorC1079k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m1540a = C0435o.m1540a(resources, theme, attributeSet, C1069a.f4270l);
        if (C0435o.m1544a(xmlPullParser, "pathData")) {
            String m1548c = C0435o.m1548c(m1540a, xmlPullParser, "pathData", 4);
            Path m1906a = C0543b.m1906a(m1548c);
            if (m1906a == null) {
                throw new InflateException("The path is null, which is created from ".concat(String.valueOf(m1548c)));
            }
            m3600a(m1906a);
        } else {
            if (!C0435o.m1544a(xmlPullParser, "controlX1")) {
                throw new InflateException("pathInterpolator requires the controlX1 attribute");
            }
            if (!C0435o.m1544a(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float m1534a = C0435o.m1534a(m1540a, xmlPullParser, "controlX1", 0, 0.0f);
            float m1534a2 = C0435o.m1534a(m1540a, xmlPullParser, "controlY1", 1, 0.0f);
            boolean m1544a = C0435o.m1544a(xmlPullParser, "controlX2");
            if (m1544a != C0435o.m1544a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (m1544a) {
                float m1534a3 = C0435o.m1534a(m1540a, xmlPullParser, "controlX2", 2, 0.0f);
                float m1534a4 = C0435o.m1534a(m1540a, xmlPullParser, "controlY2", 3, 0.0f);
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(m1534a, m1534a2, m1534a3, m1534a4, 1.0f, 1.0f);
                m3600a(path);
            } else {
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.quadTo(m1534a, m1534a2, 1.0f, 1.0f);
                m3600a(path2);
            }
        }
        m1540a.recycle();
    }

    /* renamed from: a */
    private void m3600a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length ".concat(String.valueOf(length)));
        }
        this.f4286a = new float[min];
        this.f4287b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.f4286a[i2] = fArr[0];
            this.f4287b[i2] = fArr[1];
        }
        if (Math.abs(this.f4286a[0]) <= 1.0E-5d && Math.abs(this.f4287b[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.f4286a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f4287b[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    int i5 = i4 + 1;
                    float f2 = this.f4286a[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :".concat(String.valueOf(f2)));
                    }
                    this.f4286a[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f4286a[0]);
        sb.append(",");
        sb.append(this.f4287b[0]);
        sb.append(" end:");
        int i6 = min - 1;
        sb.append(this.f4286a[i6]);
        sb.append(",");
        sb.append(this.f4287b[i6]);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f4286a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f4286a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f4286a[length] - this.f4286a[i];
        if (f2 == 0.0f) {
            return this.f4287b[i];
        }
        float f3 = (f - this.f4286a[i]) / f2;
        float f4 = this.f4287b[i];
        return f4 + (f3 * (this.f4287b[length] - f4));
    }
}
