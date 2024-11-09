package androidx.core.content.p020a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.TypedValue;
import androidx.core.p023f.C0478i;

/* compiled from: ResourcesCompat.java */
/* renamed from: androidx.core.content.a.k */
/* loaded from: classes.dex */
public final class C0431k {
    /* renamed from: a */
    public static Drawable m1529a(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: b */
    public static ColorStateList m1531b(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        return resources.getColorStateList(i);
    }

    /* renamed from: a */
    public static Typeface m1525a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m1527a(context, i, new TypedValue(), 0, null, false);
    }

    /* renamed from: a */
    public static void m1530a(Context context, int i, AbstractC0432l abstractC0432l) {
        C0478i.m1620a(abstractC0432l);
        if (context.isRestricted()) {
            abstractC0432l.m1532a(-4, (Handler) null);
        } else {
            m1527a(context, i, new TypedValue(), 0, abstractC0432l, false);
        }
    }

    /* renamed from: a */
    public static Typeface m1526a(Context context, int i, TypedValue typedValue, int i2, AbstractC0432l abstractC0432l) {
        if (context.isRestricted()) {
            return null;
        }
        return m1527a(context, i, typedValue, i2, abstractC0432l, true);
    }

    /* renamed from: a */
    private static Typeface m1527a(Context context, int i, TypedValue typedValue, int i2, AbstractC0432l abstractC0432l, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface m1528a = m1528a(context, resources, typedValue, i, i2, abstractC0432l, z);
        if (m1528a != null || abstractC0432l != null) {
            return m1528a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface m1528a(android.content.Context r12, android.content.res.Resources r13, android.util.TypedValue r14, int r15, int r16, androidx.core.content.p020a.AbstractC0432l r17, boolean r18) {
        /*
            r0 = r13
            r1 = r14
            r4 = r15
            r5 = r16
            r8 = r17
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L96
            java.lang.CharSequence r1 = r1.string
            java.lang.String r9 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r9.startsWith(r1)
            r10 = -3
            r11 = 0
            if (r1 != 0) goto L21
            if (r8 == 0) goto L20
            r8.m1532a(r10, r11)
        L20:
            return r11
        L21:
            android.graphics.Typeface r1 = androidx.core.graphics.C0552e.m1946a(r13, r15, r5)
            if (r1 == 0) goto L2d
            if (r8 == 0) goto L2c
            r8.m1533a(r1, r11)
        L2c:
            return r1
        L2d:
            java.lang.String r1 = r9.toLowerCase()     // Catch: java.io.IOException -> L6f org.xmlpull.v1.XmlPullParserException -> L80
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L6f org.xmlpull.v1.XmlPullParserException -> L80
            if (r1 == 0) goto L5e
            android.content.res.XmlResourceParser r1 = r13.getXml(r15)     // Catch: java.io.IOException -> L6f org.xmlpull.v1.XmlPullParserException -> L80
            androidx.core.content.a.d r2 = androidx.core.content.p020a.C0423c.m1503a(r1, r13)     // Catch: java.io.IOException -> L6f org.xmlpull.v1.XmlPullParserException -> L80
            if (r2 != 0) goto L50
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r1 = "Failed to find font-family tag"
            android.util.Log.e(r0, r1)     // Catch: java.io.IOException -> L6f org.xmlpull.v1.XmlPullParserException -> L80
            if (r8 == 0) goto L4f
            r8.m1532a(r10, r11)     // Catch: java.io.IOException -> L6f org.xmlpull.v1.XmlPullParserException -> L80
        L4f:
            return r11
        L50:
            r1 = r12
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            android.graphics.Typeface r0 = androidx.core.graphics.C0552e.m1944a(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L6f org.xmlpull.v1.XmlPullParserException -> L80
            return r0
        L5e:
            r1 = r12
            android.graphics.Typeface r0 = androidx.core.graphics.C0552e.m1942a(r12, r13, r15, r9, r5)     // Catch: java.io.IOException -> L6f org.xmlpull.v1.XmlPullParserException -> L80
            if (r8 == 0) goto L6e
            if (r0 == 0) goto L6b
            r8.m1533a(r0, r11)     // Catch: java.io.IOException -> L6f org.xmlpull.v1.XmlPullParserException -> L80
            goto L6e
        L6b:
            r8.m1532a(r10, r11)     // Catch: java.io.IOException -> L6f org.xmlpull.v1.XmlPullParserException -> L80
        L6e:
            return r0
        L6f:
            r0 = move-exception
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r2 = "Failed to read xml resource "
            java.lang.String r3 = java.lang.String.valueOf(r9)
            java.lang.String r2 = r2.concat(r3)
            android.util.Log.e(r1, r2, r0)
            goto L90
        L80:
            r0 = move-exception
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r2 = "Failed to parse xml resource "
            java.lang.String r3 = java.lang.String.valueOf(r9)
            java.lang.String r2 = r2.concat(r3)
            android.util.Log.e(r1, r2, r0)
        L90:
            if (r8 == 0) goto L95
            r8.m1532a(r10, r11)
        L95:
            return r11
        L96:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Resource \""
            r3.<init>(r5)
            java.lang.String r0 = r13.getResourceName(r15)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r15)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r14)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p020a.C0431k.m1528a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.a.l, boolean):android.graphics.Typeface");
    }
}
