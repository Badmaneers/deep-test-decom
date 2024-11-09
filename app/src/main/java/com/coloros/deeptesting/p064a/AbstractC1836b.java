package com.coloros.deeptesting.p064a;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;

/* compiled from: AesEncryptUtils.java */
/* renamed from: com.coloros.deeptesting.a.b */
/* loaded from: classes.dex */
abstract class AbstractC1836b implements BinaryDecoder, BinaryEncoder {

    /* renamed from: a */
    @Deprecated
    final byte f8545a;

    /* renamed from: b */
    final int f8546b;

    /* renamed from: c */
    private final int f8547c;

    /* renamed from: d */
    private final int f8548d;

    /* renamed from: e */
    private final int f8549e;

    /* renamed from: a */
    abstract void mo5945a(byte[] bArr, int i, int i2, C1837c c1837c);

    /* renamed from: a */
    protected abstract boolean mo5946a(byte b);

    /* renamed from: b */
    abstract void mo5949b(byte[] bArr, int i, int i2, C1837c c1837c);

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) {
        return null;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1836b(int i) {
        this(0, i);
    }

    private AbstractC1836b(int i, int i2) {
        this.f8547c = 3;
        this.f8548d = 4;
        this.f8546b = 0;
        this.f8549e = i2;
        this.f8545a = (byte) 61;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static byte[] m5944a(int i, C1837c c1837c) {
        if (c1837c.f8552c != null && c1837c.f8552c.length >= c1837c.f8553d + i) {
            return c1837c.f8552c;
        }
        if (c1837c.f8552c == null) {
            c1837c.f8552c = new byte[8192];
            c1837c.f8553d = 0;
            c1837c.f8554e = 0;
        } else {
            byte[] bArr = new byte[c1837c.f8552c.length * 2];
            System.arraycopy(c1837c.f8552c, 0, bArr, 0, c1837c.f8552c.length);
            c1837c.f8552c = bArr;
        }
        return c1837c.f8552c;
    }

    /* renamed from: a */
    private static int m5943a(byte[] bArr, int i, C1837c c1837c) {
        if (c1837c.f8552c == null) {
            return c1837c.f8555f ? -1 : 0;
        }
        int min = Math.min(c1837c.f8552c != null ? c1837c.f8553d - c1837c.f8554e : 0, i);
        System.arraycopy(c1837c.f8552c, c1837c.f8554e, bArr, 0, min);
        c1837c.f8554e += min;
        if (c1837c.f8554e >= c1837c.f8553d) {
            c1837c.f8552c = null;
        }
        return min;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C1837c c1837c = new C1837c();
        mo5949b(bArr, 0, bArr.length, c1837c);
        mo5949b(bArr, 0, -1, c1837c);
        byte[] bArr2 = new byte[c1837c.f8553d];
        m5943a(bArr2, bArr2.length, c1837c);
        return bArr2;
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C1837c c1837c = new C1837c();
        mo5945a(bArr, 0, bArr.length, c1837c);
        mo5945a(bArr, 0, -1, c1837c);
        byte[] bArr2 = new byte[c1837c.f8553d - c1837c.f8554e];
        m5943a(bArr2, bArr2.length, c1837c);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m5947a(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.f8545a == b || mo5946a(b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final long m5948b(byte[] bArr) {
        long length = (((bArr.length + this.f8547c) - 1) / this.f8547c) * this.f8548d;
        return this.f8546b > 0 ? length + ((((this.f8546b + length) - 1) / this.f8546b) * this.f8549e) : length;
    }
}
