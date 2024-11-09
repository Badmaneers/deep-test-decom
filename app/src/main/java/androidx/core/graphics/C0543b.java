package androidx.core.graphics;

import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: PathParser.java */
/* renamed from: androidx.core.graphics.b */
/* loaded from: classes.dex */
public final class C0543b {
    /* renamed from: a */
    public static float[] m1909a(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i - 0;
        int min = Math.min(i2, length - 0);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: a */
    public static Path m1906a(String str) {
        Path path = new Path();
        C0545d[] m1911b = m1911b(str);
        if (m1911b == null) {
            return null;
        }
        try {
            C0545d.m1915a(m1911b, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: b */
    public static C0545d[] m1911b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int m1905a = m1905a(str, i);
            String trim = str.substring(i2, m1905a).trim();
            if (trim.length() > 0) {
                m1907a(arrayList, trim.charAt(0), m1912c(trim));
            }
            i2 = m1905a;
            i = m1905a + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m1907a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0545d[]) arrayList.toArray(new C0545d[arrayList.size()]);
    }

    /* renamed from: a */
    public static C0545d[] m1910a(C0545d[] c0545dArr) {
        if (c0545dArr == null) {
            return null;
        }
        C0545d[] c0545dArr2 = new C0545d[c0545dArr.length];
        for (int i = 0; i < c0545dArr.length; i++) {
            c0545dArr2[i] = new C0545d(c0545dArr[i]);
        }
        return c0545dArr2;
    }

    /* renamed from: a */
    public static boolean m1908a(C0545d[] c0545dArr, C0545d[] c0545dArr2) {
        if (c0545dArr == null || c0545dArr2 == null || c0545dArr.length != c0545dArr2.length) {
            return false;
        }
        for (int i = 0; i < c0545dArr.length; i++) {
            if (c0545dArr[i].f2397a != c0545dArr2[i].f2397a || c0545dArr[i].f2398b.length != c0545dArr2[i].f2398b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static int m1905a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static void m1907a(ArrayList<C0545d> arrayList, char c, float[] fArr) {
        arrayList.add(new C0545d(c, fArr));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0043. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[Catch: NumberFormatException -> 0x0082, LOOP:1: B:9:0x002d->B:21:0x005e, LOOP_END, TryCatch #0 {NumberFormatException -> 0x0082, blocks: (B:6:0x0013, B:8:0x0027, B:9:0x002d, B:11:0x0033, B:17:0x0043, B:21:0x005e, B:37:0x004c, B:40:0x0053, B:23:0x0061, B:25:0x0067, B:26:0x0074, B:29:0x007a, B:45:0x007d), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[Catch: NumberFormatException -> 0x0082, TryCatch #0 {NumberFormatException -> 0x0082, blocks: (B:6:0x0013, B:8:0x0027, B:9:0x002d, B:11:0x0033, B:17:0x0043, B:21:0x005e, B:37:0x004c, B:40:0x0053, B:23:0x0061, B:25:0x0067, B:26:0x0074, B:29:0x007a, B:45:0x007d), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static float[] m1912c(java.lang.String r13) {
        /*
            r0 = 0
            char r1 = r13.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L9c
            char r1 = r13.charAt(r0)
            r2 = 90
            if (r1 != r2) goto L13
            goto L9c
        L13:
            int r1 = r13.length()     // Catch: java.lang.NumberFormatException -> L82
            float[] r1 = new float[r1]     // Catch: java.lang.NumberFormatException -> L82
            androidx.core.graphics.c r2 = new androidx.core.graphics.c     // Catch: java.lang.NumberFormatException -> L82
            r2.<init>()     // Catch: java.lang.NumberFormatException -> L82
            int r3 = r13.length()     // Catch: java.lang.NumberFormatException -> L82
            r4 = 1
            r6 = r0
            r5 = r4
        L25:
            if (r5 >= r3) goto L7d
            r2.f2396b = r0     // Catch: java.lang.NumberFormatException -> L82
            r8 = r0
            r9 = r8
            r10 = r9
            r7 = r5
        L2d:
            int r11 = r13.length()     // Catch: java.lang.NumberFormatException -> L82
            if (r7 >= r11) goto L61
            char r11 = r13.charAt(r7)     // Catch: java.lang.NumberFormatException -> L82
            r12 = 32
            if (r11 == r12) goto L5a
            r12 = 69
            if (r11 == r12) goto L58
            r12 = 101(0x65, float:1.42E-43)
            if (r11 == r12) goto L58
            switch(r11) {
                case 44: goto L5a;
                case 45: goto L4f;
                case 46: goto L47;
                default: goto L46;
            }     // Catch: java.lang.NumberFormatException -> L82
        L46:
            goto L56
        L47:
            if (r9 != 0) goto L4c
            r8 = r0
            r9 = r4
            goto L5c
        L4c:
            r2.f2396b = r4     // Catch: java.lang.NumberFormatException -> L82
            goto L5a
        L4f:
            if (r7 == r5) goto L56
            if (r8 != 0) goto L56
            r2.f2396b = r4     // Catch: java.lang.NumberFormatException -> L82
            goto L5a
        L56:
            r8 = r0
            goto L5c
        L58:
            r8 = r4
            goto L5c
        L5a:
            r8 = r0
            r10 = r4
        L5c:
            if (r10 != 0) goto L61
            int r7 = r7 + 1
            goto L2d
        L61:
            r2.f2395a = r7     // Catch: java.lang.NumberFormatException -> L82
            int r7 = r2.f2395a     // Catch: java.lang.NumberFormatException -> L82
            if (r5 >= r7) goto L74
            int r8 = r6 + 1
            java.lang.String r5 = r13.substring(r5, r7)     // Catch: java.lang.NumberFormatException -> L82
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L82
            r1[r6] = r5     // Catch: java.lang.NumberFormatException -> L82
            r6 = r8
        L74:
            boolean r5 = r2.f2396b     // Catch: java.lang.NumberFormatException -> L82
            if (r5 == 0) goto L7a
            r5 = r7
            goto L25
        L7a:
            int r5 = r7 + 1
            goto L25
        L7d:
            float[] r0 = m1909a(r1, r6)     // Catch: java.lang.NumberFormatException -> L82
            return r0
        L82:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error in parsing \""
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r13 = "\""
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r1.<init>(r13, r0)
            throw r1
        L9c:
            float[] r13 = new float[r0]
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0543b.m1912c(java.lang.String):float[]");
    }
}
