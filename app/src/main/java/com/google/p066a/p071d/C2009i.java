package com.google.p066a.p071d;

/* compiled from: StringPool.java */
/* renamed from: com.google.a.d.i */
/* loaded from: classes.dex */
final class C2009i {

    /* renamed from: a */
    private final String[] f8930a = new String[512];

    /* renamed from: a */
    public final String m6213a(char[] cArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 = (i3 * 31) + cArr[i4];
        }
        int i5 = ((i3 >>> 20) ^ (i3 >>> 12)) ^ i3;
        int length = (i5 ^ ((i5 >>> 7) ^ (i5 >>> 4))) & (this.f8930a.length - 1);
        String str = this.f8930a[length];
        if (str == null || str.length() != i2) {
            String str2 = new String(cArr, i, i2);
            this.f8930a[length] = str2;
            return str2;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            if (str.charAt(i6) != cArr[i + i6]) {
                String str3 = new String(cArr, i, i2);
                this.f8930a[length] = str3;
                return str3;
            }
        }
        return str;
    }
}
