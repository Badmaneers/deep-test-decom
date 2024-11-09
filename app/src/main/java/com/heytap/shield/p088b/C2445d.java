package com.heytap.shield.p088b;

/* compiled from: ParseUtils.java */
/* renamed from: com.heytap.shield.b.d */
/* loaded from: classes.dex */
public final class C2445d {
    /* renamed from: a */
    public static byte[] m7797a(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        C2448g.m7805a(bArr, bArr.length - 4, bArr2, 0, 4);
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m7798a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        C2448g.m7805a(bArr, (bArr.length - i) - 4, bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: b */
    public static byte[] m7799b(byte[] bArr, int i) {
        byte[] bArr2 = new byte[4];
        C2448g.m7805a(bArr, (bArr.length - i) - 8, bArr2, 0, 4);
        return bArr2;
    }

    /* renamed from: c */
    public static byte[] m7800c(byte[] bArr, int i) {
        byte[] bArr2 = new byte[(bArr.length - i) - 9];
        C2448g.m7805a(bArr, 1, bArr2, 0, (bArr.length - i) - 9);
        return bArr2;
    }
}
