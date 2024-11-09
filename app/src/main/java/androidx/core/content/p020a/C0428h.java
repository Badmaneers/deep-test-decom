package androidx.core.content.p020a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.core.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientColorInflaterCompat.java */
/* renamed from: androidx.core.content.a.h */
/* loaded from: classes.dex */
public final class C0428h {
    /* renamed from: a */
    public static Shader m1520a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray m1540a = C0435o.m1540a(resources, theme, attributeSet, R.styleable.GradientColor);
        float m1534a = C0435o.m1534a(m1540a, xmlPullParser, "startX", R.styleable.GradientColor_android_startX, 0.0f);
        float m1534a2 = C0435o.m1534a(m1540a, xmlPullParser, "startY", R.styleable.GradientColor_android_startY, 0.0f);
        float m1534a3 = C0435o.m1534a(m1540a, xmlPullParser, "endX", R.styleable.GradientColor_android_endX, 0.0f);
        float m1534a4 = C0435o.m1534a(m1540a, xmlPullParser, "endY", R.styleable.GradientColor_android_endY, 0.0f);
        float m1534a5 = C0435o.m1534a(m1540a, xmlPullParser, "centerX", R.styleable.GradientColor_android_centerX, 0.0f);
        float m1534a6 = C0435o.m1534a(m1540a, xmlPullParser, "centerY", R.styleable.GradientColor_android_centerY, 0.0f);
        int m1539a = C0435o.m1539a(m1540a, xmlPullParser, "type", R.styleable.GradientColor_android_type, 0);
        int m1538a = C0435o.m1538a(m1540a, xmlPullParser, "startColor", R.styleable.GradientColor_android_startColor);
        boolean m1544a = C0435o.m1544a(xmlPullParser, "centerColor");
        int m1538a2 = C0435o.m1538a(m1540a, xmlPullParser, "centerColor", R.styleable.GradientColor_android_centerColor);
        int m1538a3 = C0435o.m1538a(m1540a, xmlPullParser, "endColor", R.styleable.GradientColor_android_endColor);
        int m1539a2 = C0435o.m1539a(m1540a, xmlPullParser, "tileMode", R.styleable.GradientColor_android_tileMode, 0);
        float m1534a7 = C0435o.m1534a(m1540a, xmlPullParser, "gradientRadius", R.styleable.GradientColor_android_gradientRadius, 0.0f);
        m1540a.recycle();
        C0429i m1521b = m1521b(resources, xmlPullParser, attributeSet, theme);
        if (m1521b == null) {
            if (m1544a) {
                m1521b = new C0429i(m1538a, m1538a2, m1538a3);
            } else {
                m1521b = new C0429i(m1538a, m1538a3);
            }
        }
        switch (m1539a) {
            case 1:
                if (m1534a7 <= 0.0f) {
                    throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                }
                return new RadialGradient(m1534a5, m1534a6, m1534a7, m1521b.f2168a, m1521b.f2169b, m1519a(m1539a2));
            case 2:
                return new SweepGradient(m1534a5, m1534a6, m1521b.f2168a, m1521b.f2169b);
            default:
                return new LinearGradient(m1534a, m1534a2, m1534a3, m1534a4, m1521b.f2168a, m1521b.f2169b, m1519a(m1539a2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.p020a.C0429i m1521b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L83
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L83
        L21:
            r6 = 2
            if (r3 != r6) goto L12
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L12
            int[] r3 = androidx.core.R.styleable.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.p020a.C0435o.m1540a(r8, r11, r10, r3)
            int r5 = androidx.core.R.styleable.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = androidx.core.R.styleable.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L68
            if (r6 == 0) goto L68
            int r5 = androidx.core.R.styleable.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = androidx.core.R.styleable.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L68:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L83:
            int r8 = r4.size()
            if (r8 <= 0) goto L8f
            androidx.core.content.a.i r8 = new androidx.core.content.a.i
            r8.<init>(r4, r2)
            return r8
        L8f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p020a.C0428h.m1521b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.a.i");
    }

    /* renamed from: a */
    private static Shader.TileMode m1519a(int i) {
        switch (i) {
            case 1:
                return Shader.TileMode.REPEAT;
            case 2:
                return Shader.TileMode.MIRROR;
            default:
                return Shader.TileMode.CLAMP;
        }
    }
}
