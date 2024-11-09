package com.google.p066a.p068b;

import java.math.BigInteger;

/* compiled from: LazilyParsedNumber.java */
/* renamed from: com.google.a.b.r */
/* loaded from: classes.dex */
public final class C1989r extends Number {

    /* renamed from: a */
    private final String f8856a;

    public C1989r(String str) {
        this.f8856a = str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f8856a);
            } catch (NumberFormatException unused) {
                return new BigInteger(this.f8856a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f8856a);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f8856a);
        } catch (NumberFormatException unused) {
            return new BigInteger(this.f8856a).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f8856a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f8856a);
    }

    public final String toString() {
        return this.f8856a;
    }
}
