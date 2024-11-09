package androidx.core.content.p020a;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* compiled from: ComplexColorCompat.java */
/* renamed from: androidx.core.content.a.b */
/* loaded from: classes.dex */
public final class C0422b {

    /* renamed from: a */
    private final Shader f2155a;

    /* renamed from: b */
    private final ColorStateList f2156b;

    /* renamed from: c */
    private int f2157c;

    private C0422b(Shader shader, ColorStateList colorStateList, int i) {
        this.f2155a = shader;
        this.f2156b = colorStateList;
        this.f2157c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0422b m1494a(int i) {
        return new C0422b(null, null, i);
    }

    /* renamed from: a */
    public final Shader m1496a() {
        return this.f2155a;
    }

    /* renamed from: b */
    public final int m1498b() {
        return this.f2157c;
    }

    /* renamed from: b */
    public final void m1499b(int i) {
        this.f2157c = i;
    }

    /* renamed from: c */
    public final boolean m1500c() {
        return this.f2155a != null;
    }

    /* renamed from: d */
    public final boolean m1501d() {
        return this.f2155a == null && this.f2156b != null && this.f2156b.isStateful();
    }

    /* renamed from: a */
    public final boolean m1497a(int[] iArr) {
        int colorForState;
        if (!m1501d() || (colorForState = this.f2156b.getColorForState(iArr, this.f2156b.getDefaultColor())) == this.f2157c) {
            return false;
        }
        this.f2157c = colorForState;
        return true;
    }

    /* renamed from: e */
    public final boolean m1502e() {
        return m1500c() || this.f2157c != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:3:0x0001, B:4:0x0009, B:9:0x0015, B:15:0x003e, B:16:0x0041, B:17:0x005c, B:18:0x0077, B:20:0x0044, B:22:0x004e, B:24:0x002a, B:27:0x0034, B:30:0x0078, B:31:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:3:0x0001, B:4:0x0009, B:9:0x0015, B:15:0x003e, B:16:0x0041, B:17:0x005c, B:18:0x0077, B:20:0x0044, B:22:0x004e, B:24:0x002a, B:27:0x0034, B:30:0x0078, B:31:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:3:0x0001, B:4:0x0009, B:9:0x0015, B:15:0x003e, B:16:0x0041, B:17:0x005c, B:18:0x0077, B:20:0x0044, B:22:0x004e, B:24:0x002a, B:27:0x0034, B:30:0x0078, B:31:0x007f), top: B:2:0x0001 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.content.p020a.C0422b m1495a(android.content.res.Resources r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r0 = 0
            android.content.res.XmlResourceParser r9 = r8.getXml(r9)     // Catch: java.lang.Exception -> L80
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r9)     // Catch: java.lang.Exception -> L80
        L9:
            int r2 = r9.next()     // Catch: java.lang.Exception -> L80
            r3 = 1
            r4 = 2
            if (r2 == r4) goto L13
            if (r2 != r3) goto L9
        L13:
            if (r2 != r4) goto L78
            java.lang.String r2 = r9.getName()     // Catch: java.lang.Exception -> L80
            r4 = -1
            int r5 = r2.hashCode()     // Catch: java.lang.Exception -> L80
            r6 = 89650992(0x557f730, float:1.01546526E-35)
            r7 = 0
            if (r5 == r6) goto L34
            r3 = 1191572447(0x4705f3df, float:34291.87)
            if (r5 == r3) goto L2a
            goto L3d
        L2a:
            java.lang.String r3 = "selector"
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Exception -> L80
            if (r3 == 0) goto L3d
            r3 = r7
            goto L3e
        L34:
            java.lang.String r5 = "gradient"
            boolean r5 = r2.equals(r5)     // Catch: java.lang.Exception -> L80
            if (r5 == 0) goto L3d
            goto L3e
        L3d:
            r3 = r4
        L3e:
            switch(r3) {
                case 0: goto L4e;
                case 1: goto L44;
                default: goto L41;
            }     // Catch: java.lang.Exception -> L80
        L41:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Exception -> L80
            goto L5c
        L44:
            android.graphics.Shader r8 = androidx.core.content.p020a.C0428h.m1520a(r8, r9, r1, r10)     // Catch: java.lang.Exception -> L80
            androidx.core.content.a.b r9 = new androidx.core.content.a.b     // Catch: java.lang.Exception -> L80
            r9.<init>(r8, r0, r7)     // Catch: java.lang.Exception -> L80
            return r9
        L4e:
            android.content.res.ColorStateList r8 = androidx.core.content.p020a.C0421a.m1492a(r8, r9, r1, r10)     // Catch: java.lang.Exception -> L80
            androidx.core.content.a.b r9 = new androidx.core.content.a.b     // Catch: java.lang.Exception -> L80
            int r10 = r8.getDefaultColor()     // Catch: java.lang.Exception -> L80
            r9.<init>(r0, r8, r10)     // Catch: java.lang.Exception -> L80
            return r9
        L5c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L80
            r10.<init>()     // Catch: java.lang.Exception -> L80
            java.lang.String r9 = r9.getPositionDescription()     // Catch: java.lang.Exception -> L80
            r10.append(r9)     // Catch: java.lang.Exception -> L80
            java.lang.String r9 = ": unsupported complex color tag "
            r10.append(r9)     // Catch: java.lang.Exception -> L80
            r10.append(r2)     // Catch: java.lang.Exception -> L80
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Exception -> L80
            r8.<init>(r9)     // Catch: java.lang.Exception -> L80
            throw r8     // Catch: java.lang.Exception -> L80
        L78:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Exception -> L80
            java.lang.String r9 = "No start tag found"
            r8.<init>(r9)     // Catch: java.lang.Exception -> L80
            throw r8     // Catch: java.lang.Exception -> L80
        L80:
            r8 = move-exception
            java.lang.String r9 = "ComplexColorCompat"
            java.lang.String r10 = "Failed to inflate ComplexColor."
            android.util.Log.e(r9, r10, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p020a.C0422b.m1495a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.a.b");
    }
}
