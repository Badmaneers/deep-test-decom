package com.coloros.deeptesting.p064a;

import java.io.UnsupportedEncodingException;
import neton.client.config.Constants;

/* compiled from: AesEncryptUtils.java */
/* renamed from: com.coloros.deeptesting.a.f */
/* loaded from: classes.dex */
final class C1840f extends AbstractC1836b {

    /* renamed from: c */
    private static final byte[] f8560c = {13, 10};

    /* renamed from: d */
    private static final byte[] f8561d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: e */
    private static final byte[] f8562e = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: f */
    private static final byte[] f8563f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, Constants.PROTOCOL_VERSION, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: g */
    private final byte[] f8564g;

    /* renamed from: h */
    private final byte[] f8565h;

    /* renamed from: i */
    private final byte[] f8566i;

    /* renamed from: j */
    private final int f8567j;

    /* renamed from: k */
    private final int f8568k;

    C1840f() {
        this((byte) 0);
    }

    private C1840f(byte b) {
        this(f8560c);
    }

    private C1840f(byte[] bArr) {
        this(bArr, (byte) 0);
    }

    private C1840f(byte[] bArr, byte b) {
        super(bArr == null ? 0 : bArr.length);
        String str;
        this.f8565h = f8563f;
        if (bArr != null) {
            if (m5947a(bArr)) {
                try {
                    str = new String(bArr, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    str = null;
                }
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + str + "]");
            }
            this.f8568k = 4;
            this.f8566i = null;
        } else {
            this.f8568k = 4;
            this.f8566i = null;
        }
        this.f8567j = this.f8568k - 1;
        this.f8564g = f8561d;
    }

    @Override // com.coloros.deeptesting.p064a.AbstractC1836b
    /* renamed from: a */
    final void mo5945a(byte[] bArr, int i, int i2, C1837c c1837c) {
        if (c1837c.f8555f) {
            return;
        }
        if (i2 >= 0) {
            int i3 = i;
            int i4 = 0;
            while (i4 < i2) {
                byte[] a2 = m5944a(this.f8568k, c1837c);
                c1837c.f8557h = (c1837c.f8557h + 1) % 3;
                int i5 = i3 + 1;
                int i6 = bArr[i3];
                if (i6 < 0) {
                    i6 += 256;
                }
                c1837c.f8550a = (c1837c.f8550a << 8) + i6;
                if (c1837c.f8557h == 0) {
                    int i7 = c1837c.f8553d;
                    c1837c.f8553d = i7 + 1;
                    a2[i7] = this.f8564g[(c1837c.f8550a >> 18) & 63];
                    int i8 = c1837c.f8553d;
                    c1837c.f8553d = i8 + 1;
                    a2[i8] = this.f8564g[(c1837c.f8550a >> 12) & 63];
                    int i9 = c1837c.f8553d;
                    c1837c.f8553d = i9 + 1;
                    a2[i9] = this.f8564g[(c1837c.f8550a >> 6) & 63];
                    int i10 = c1837c.f8553d;
                    c1837c.f8553d = i10 + 1;
                    a2[i10] = this.f8564g[c1837c.f8550a & 63];
                    c1837c.f8556g += 4;
                    if (this.f8546b > 0 && this.f8546b <= c1837c.f8556g) {
                        System.arraycopy(this.f8566i, 0, a2, c1837c.f8553d, this.f8566i.length);
                        c1837c.f8553d += this.f8566i.length;
                        c1837c.f8556g = 0;
                    }
                }
                i4++;
                i3 = i5;
            }
            return;
        }
        c1837c.f8555f = true;
        if (c1837c.f8557h == 0 && this.f8546b == 0) {
            return;
        }
        byte[] a3 = m5944a(this.f8568k, c1837c);
        int i11 = c1837c.f8553d;
        switch (c1837c.f8557h) {
            case 0:
                break;
            case 1:
                int i12 = c1837c.f8553d;
                c1837c.f8553d = i12 + 1;
                a3[i12] = this.f8564g[(c1837c.f8550a >> 2) & 63];
                int i13 = c1837c.f8553d;
                c1837c.f8553d = i13 + 1;
                a3[i13] = this.f8564g[(c1837c.f8550a << 4) & 63];
                if (this.f8564g == f8561d) {
                    int i14 = c1837c.f8553d;
                    c1837c.f8553d = i14 + 1;
                    a3[i14] = this.f8545a;
                    int i15 = c1837c.f8553d;
                    c1837c.f8553d = i15 + 1;
                    a3[i15] = this.f8545a;
                    break;
                }
                break;
            case 2:
                int i16 = c1837c.f8553d;
                c1837c.f8553d = i16 + 1;
                a3[i16] = this.f8564g[(c1837c.f8550a >> 10) & 63];
                int i17 = c1837c.f8553d;
                c1837c.f8553d = i17 + 1;
                a3[i17] = this.f8564g[(c1837c.f8550a >> 4) & 63];
                int i18 = c1837c.f8553d;
                c1837c.f8553d = i18 + 1;
                a3[i18] = this.f8564g[(c1837c.f8550a << 2) & 63];
                if (this.f8564g == f8561d) {
                    int i19 = c1837c.f8553d;
                    c1837c.f8553d = i19 + 1;
                    a3[i19] = this.f8545a;
                    break;
                }
                break;
            default:
                throw new IllegalStateException("Impossible modulus " + c1837c.f8557h);
        }
        c1837c.f8556g += c1837c.f8553d - i11;
        if (this.f8546b <= 0 || c1837c.f8556g <= 0) {
            return;
        }
        System.arraycopy(this.f8566i, 0, a3, c1837c.f8553d, this.f8566i.length);
        c1837c.f8553d += this.f8566i.length;
    }

    @Override // com.coloros.deeptesting.p064a.AbstractC1836b
    /* renamed from: b */
    final void mo5949b(byte[] bArr, int i, int i2, C1837c c1837c) {
        byte b;
        if (c1837c.f8555f) {
            return;
        }
        if (i2 < 0) {
            c1837c.f8555f = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            byte[] a2 = m5944a(this.f8567j, c1837c);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == this.f8545a) {
                c1837c.f8555f = true;
                break;
            }
            if (b2 >= 0 && b2 < f8563f.length && (b = f8563f[b2]) >= 0) {
                c1837c.f8557h = (c1837c.f8557h + 1) % 4;
                c1837c.f8550a = (c1837c.f8550a << 6) + b;
                if (c1837c.f8557h == 0) {
                    int i5 = c1837c.f8553d;
                    c1837c.f8553d = i5 + 1;
                    a2[i5] = (byte) ((c1837c.f8550a >> 16) & 255);
                    int i6 = c1837c.f8553d;
                    c1837c.f8553d = i6 + 1;
                    a2[i6] = (byte) ((c1837c.f8550a >> 8) & 255);
                    int i7 = c1837c.f8553d;
                    c1837c.f8553d = i7 + 1;
                    a2[i7] = (byte) (c1837c.f8550a & 255);
                }
            }
            i3++;
            i = i4;
        }
        if (!c1837c.f8555f || c1837c.f8557h == 0) {
            return;
        }
        byte[] a3 = m5944a(this.f8567j, c1837c);
        switch (c1837c.f8557h) {
            case 1:
                return;
            case 2:
                c1837c.f8550a >>= 4;
                int i8 = c1837c.f8553d;
                c1837c.f8553d = i8 + 1;
                a3[i8] = (byte) (c1837c.f8550a & 255);
                return;
            case 3:
                c1837c.f8550a >>= 2;
                int i9 = c1837c.f8553d;
                c1837c.f8553d = i9 + 1;
                a3[i9] = (byte) ((c1837c.f8550a >> 8) & 255);
                int i10 = c1837c.f8553d;
                c1837c.f8553d = i10 + 1;
                a3[i10] = (byte) (c1837c.f8550a & 255);
                return;
            default:
                throw new IllegalStateException("Impossible modulus " + c1837c.f8557h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m5950c(byte[] bArr) {
        try {
            if (bArr != null && bArr.length != 0) {
                C1840f c1840f = new C1840f(f8560c, (byte) 0);
                long b = c1840f.m5948b(bArr);
                if (b > 2147483647L) {
                    throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + b + ") than the specified maximum size of 2147483647");
                }
                bArr = c1840f.encode(bArr);
            }
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static byte[] m5951d(byte[] bArr) {
        return new C1840f().decode(bArr);
    }

    @Override // com.coloros.deeptesting.p064a.AbstractC1836b
    /* renamed from: a */
    protected final boolean mo5946a(byte b) {
        return b >= 0 && b < this.f8565h.length && this.f8565h[b] != -1;
    }
}
