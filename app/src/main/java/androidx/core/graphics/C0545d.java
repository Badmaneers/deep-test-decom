package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;

/* compiled from: PathParser.java */
/* renamed from: androidx.core.graphics.d */
/* loaded from: classes.dex */
public final class C0545d {

    /* renamed from: a */
    public char f2397a;

    /* renamed from: b */
    public float[] f2398b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0545d(char c, float[] fArr) {
        this.f2397a = c;
        this.f2398b = fArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0545d(C0545d c0545d) {
        this.f2397a = c0545d.f2397a;
        this.f2398b = C0543b.m1909a(c0545d.f2398b, c0545d.f2398b.length);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x005c. Please report as an issue. */
    /* renamed from: a */
    public static void m1915a(C0545d[] c0545dArr, Path path) {
        int i;
        int i2;
        float[] fArr;
        char c;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        C0545d[] c0545dArr2 = c0545dArr;
        int i4 = 6;
        float[] fArr2 = new float[6];
        int i5 = 0;
        char c2 = 'm';
        int i6 = 0;
        while (i6 < c0545dArr2.length) {
            char c3 = c0545dArr2[i6].f2397a;
            float[] fArr3 = c0545dArr2[i6].f2398b;
            float f12 = fArr2[i5];
            float f13 = fArr2[1];
            float f14 = fArr2[2];
            float f15 = fArr2[3];
            float f16 = fArr2[4];
            float f17 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i4;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                    break;
            }
            i = 2;
            float f18 = f16;
            float f19 = f17;
            int i7 = i5;
            float f20 = f12;
            float f21 = f13;
            while (i7 < fArr3.length) {
                float f22 = 0.0f;
                switch (c3) {
                    case 'A':
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        i3 = i6;
                        int i8 = i2 + 5;
                        int i9 = i2 + 6;
                        m1914a(path, f20, f21, fArr[i8], fArr[i9], fArr[i2 + 0], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f, fArr[i2 + 4] != 0.0f);
                        f20 = fArr[i8];
                        f21 = fArr[i9];
                        f15 = f21;
                        f14 = f20;
                        break;
                    case 'C':
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        i3 = i6;
                        int i10 = i2 + 2;
                        int i11 = i2 + 3;
                        int i12 = i2 + 4;
                        int i13 = i2 + 5;
                        path.cubicTo(fArr[i2 + 0], fArr[i2 + 1], fArr[i10], fArr[i11], fArr[i12], fArr[i13]);
                        f20 = fArr[i12];
                        f21 = fArr[i13];
                        f = fArr[i10];
                        f2 = fArr[i11];
                        f15 = f2;
                        f14 = f;
                        break;
                    case 'H':
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        i3 = i6;
                        int i14 = i2 + 0;
                        path.lineTo(fArr[i14], f21);
                        f20 = fArr[i14];
                        break;
                    case 'L':
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        i3 = i6;
                        int i15 = i2 + 0;
                        int i16 = i2 + 1;
                        path.lineTo(fArr[i15], fArr[i16]);
                        f20 = fArr[i15];
                        f21 = fArr[i16];
                        break;
                    case 'M':
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        i3 = i6;
                        int i17 = i2 + 0;
                        f20 = fArr[i17];
                        int i18 = i2 + 1;
                        f21 = fArr[i18];
                        if (i2 > 0) {
                            path.lineTo(fArr[i17], fArr[i18]);
                            break;
                        } else {
                            path.moveTo(fArr[i17], fArr[i18]);
                            f19 = f21;
                            f18 = f20;
                            break;
                        }
                    case 'Q':
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        i3 = i6;
                        int i19 = i2 + 0;
                        int i20 = i2 + 1;
                        int i21 = i2 + 2;
                        int i22 = i2 + 3;
                        path.quadTo(fArr[i19], fArr[i20], fArr[i21], fArr[i22]);
                        float f23 = fArr[i19];
                        float f24 = fArr[i20];
                        f20 = fArr[i21];
                        f21 = fArr[i22];
                        f14 = f23;
                        f15 = f24;
                        break;
                    case 'S':
                        float f25 = f21;
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        i3 = i6;
                        float f26 = f20;
                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                            f3 = (f25 * 2.0f) - f15;
                            f4 = (f26 * 2.0f) - f14;
                        } else {
                            f3 = f25;
                            f4 = f26;
                        }
                        int i23 = i2 + 0;
                        int i24 = i2 + 1;
                        int i25 = i2 + 2;
                        int i26 = i2 + 3;
                        path.cubicTo(f4, f3, fArr[i23], fArr[i24], fArr[i25], fArr[i26]);
                        f = fArr[i23];
                        f2 = fArr[i24];
                        f20 = fArr[i25];
                        f21 = fArr[i26];
                        f15 = f2;
                        f14 = f;
                        break;
                    case 'T':
                        float f27 = f21;
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        i3 = i6;
                        float f28 = f20;
                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                            f27 = (f27 * 2.0f) - f15;
                            f28 = (f28 * 2.0f) - f14;
                        }
                        int i27 = i2 + 0;
                        int i28 = i2 + 1;
                        path.quadTo(f28, f27, fArr[i27], fArr[i28]);
                        f20 = fArr[i27];
                        f21 = fArr[i28];
                        f15 = f27;
                        f14 = f28;
                        break;
                    case 'V':
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        i3 = i6;
                        int i29 = i2 + 0;
                        path.lineTo(f20, fArr[i29]);
                        f21 = fArr[i29];
                        break;
                    case 'a':
                        float f29 = f21;
                        i3 = i6;
                        float f30 = f20;
                        int i30 = i7 + 5;
                        int i31 = i7 + 6;
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        m1914a(path, f30, f29, fArr3[i30] + f30, fArr3[i31] + f29, fArr3[i7 + 0], fArr3[i7 + 1], fArr3[i7 + 2], fArr3[i7 + 3] != 0.0f, fArr3[i7 + 4] != 0.0f);
                        f20 = f30 + fArr[i30];
                        f21 = f29 + fArr[i31];
                        f15 = f21;
                        f14 = f20;
                        break;
                    case 'c':
                        float f31 = f21;
                        i3 = i6;
                        float f32 = f20;
                        int i32 = i7 + 2;
                        int i33 = i7 + 3;
                        int i34 = i7 + 4;
                        int i35 = i7 + 5;
                        path.rCubicTo(fArr3[i7 + 0], fArr3[i7 + 1], fArr3[i32], fArr3[i33], fArr3[i34], fArr3[i35]);
                        f5 = f32 + fArr3[i32];
                        f6 = f31 + fArr3[i33];
                        f7 = fArr3[i34] + f32;
                        f8 = f31 + fArr3[i35];
                        f15 = f6;
                        f14 = f5;
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        f21 = f8;
                        f20 = f7;
                        break;
                    case 'h':
                        i3 = i6;
                        int i36 = i7 + 0;
                        path.rLineTo(fArr3[i36], 0.0f);
                        f20 += fArr3[i36];
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        break;
                    case 'l':
                        i3 = i6;
                        int i37 = i7 + 0;
                        int i38 = i7 + 1;
                        path.rLineTo(fArr3[i37], fArr3[i38]);
                        f20 += fArr3[i37];
                        f21 += fArr3[i38];
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        break;
                    case 'm':
                        i3 = i6;
                        int i39 = i7 + 0;
                        f20 += fArr3[i39];
                        int i40 = i7 + 1;
                        f21 += fArr3[i40];
                        if (i7 > 0) {
                            path.rLineTo(fArr3[i39], fArr3[i40]);
                        } else {
                            path.rMoveTo(fArr3[i39], fArr3[i40]);
                            f19 = f21;
                            f18 = f20;
                        }
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        break;
                    case 'q':
                        float f33 = f21;
                        i3 = i6;
                        float f34 = f20;
                        int i41 = i7 + 0;
                        int i42 = i7 + 1;
                        int i43 = i7 + 2;
                        int i44 = i7 + 3;
                        path.rQuadTo(fArr3[i41], fArr3[i42], fArr3[i43], fArr3[i44]);
                        float f35 = fArr3[i41] + f34;
                        float f36 = f33 + fArr3[i42];
                        float f37 = fArr3[i43] + f34;
                        float f38 = f33 + fArr3[i44];
                        f14 = f35;
                        f20 = f37;
                        f15 = f36;
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        f21 = f38;
                        break;
                    case 's':
                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                            f9 = f21 - f15;
                            f10 = f20 - f14;
                        } else {
                            f10 = 0.0f;
                            f9 = 0.0f;
                        }
                        int i45 = i7 + 0;
                        int i46 = i7 + 1;
                        int i47 = i7 + 2;
                        int i48 = i7 + 3;
                        float f39 = f21;
                        i3 = i6;
                        float f40 = f20;
                        path.rCubicTo(f10, f9, fArr3[i45], fArr3[i46], fArr3[i47], fArr3[i48]);
                        f5 = f40 + fArr3[i45];
                        f6 = f39 + fArr3[i46];
                        f7 = fArr3[i47] + f40;
                        f8 = f39 + fArr3[i48];
                        f15 = f6;
                        f14 = f5;
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        f21 = f8;
                        f20 = f7;
                        break;
                    case 't':
                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                            f22 = f20 - f14;
                            f11 = f21 - f15;
                        } else {
                            f11 = 0.0f;
                        }
                        int i49 = i7 + 0;
                        int i50 = i7 + 1;
                        path.rQuadTo(f22, f11, fArr3[i49], fArr3[i50]);
                        float f41 = f22 + f20;
                        float f42 = f11 + f21;
                        f20 += fArr3[i49];
                        f21 += fArr3[i50];
                        f15 = f42;
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        f14 = f41;
                        i3 = i6;
                        break;
                    case 'v':
                        int i51 = i7 + 0;
                        path.rLineTo(0.0f, fArr3[i51]);
                        f21 += fArr3[i51];
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        i3 = i6;
                        break;
                    default:
                        i2 = i7;
                        fArr = fArr3;
                        c = c3;
                        i3 = i6;
                        break;
                }
                i7 = i2 + i;
                i6 = i3;
                fArr3 = fArr;
                c2 = c;
                c3 = c2;
                i5 = 0;
            }
            int i52 = i6;
            fArr2[i5] = f20;
            fArr2[1] = f21;
            fArr2[2] = f14;
            fArr2[3] = f15;
            fArr2[4] = f18;
            fArr2[5] = f19;
            c0545dArr2 = c0545dArr;
            i6 = i52 + 1;
            c2 = c0545dArr2[i52].f2397a;
            i4 = 6;
        }
    }

    /* renamed from: a */
    public final void m1916a(C0545d c0545d, C0545d c0545d2, float f) {
        this.f2397a = c0545d.f2397a;
        for (int i = 0; i < c0545d.f2398b.length; i++) {
            this.f2398b[i] = (c0545d.f2398b[i] * (1.0f - f)) + (c0545d2.f2398b[i] * f);
        }
    }

    /* renamed from: a */
    private static void m1914a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        float f8 = f;
        float f9 = f3;
        float f10 = f5;
        float f11 = f6;
        while (true) {
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = f8;
            double d4 = d3 * cos;
            double d5 = f2;
            double d6 = f10;
            double d7 = (d4 + (d5 * sin)) / d6;
            double d8 = ((-f8) * sin) + (d5 * cos);
            double d9 = f11;
            double d10 = d8 / d9;
            float f12 = f10;
            float f13 = f11;
            double d11 = f4;
            double d12 = ((f9 * cos) + (d11 * sin)) / d6;
            double d13 = (((-f9) * sin) + (d11 * cos)) / d9;
            double d14 = d7 - d12;
            double d15 = d10 - d13;
            double d16 = (d7 + d12) / 2.0d;
            double d17 = (d10 + d13) / 2.0d;
            double d18 = (d14 * d14) + (d15 * d15);
            if (d18 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < 0.0d) {
                Log.w("PathParser", "Points are too far apart ".concat(String.valueOf(d18)));
                float sqrt = (float) (Math.sqrt(d18) / 1.99999d);
                f10 = f12 * sqrt;
                f11 = f13 * sqrt;
                f8 = f;
                f9 = f3;
            } else {
                double sqrt2 = Math.sqrt(d19);
                double d20 = d14 * sqrt2;
                double d21 = sqrt2 * d15;
                if (z == z2) {
                    d = d16 - d21;
                    d2 = d17 + d20;
                } else {
                    d = d16 + d21;
                    d2 = d17 - d20;
                }
                double atan2 = Math.atan2(d10 - d2, d7 - d);
                double atan22 = Math.atan2(d13 - d2, d12 - d) - atan2;
                if (z2 != (atan22 >= 0.0d)) {
                    atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                }
                double d22 = d * d6;
                double d23 = d2 * d9;
                m1913a(path, (d22 * cos) - (d23 * sin), (d22 * sin) + (d23 * cos), d6, d9, d3, d5, radians, atan2, atan22);
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m1913a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d11 = -d10;
        double d12 = d11 * cos;
        double d13 = d4 * sin;
        double d14 = (d12 * sin2) - (d13 * cos2);
        double d15 = d11 * sin;
        double d16 = d4 * cos;
        double d17 = (sin2 * d15) + (cos2 * d16);
        double d18 = d9 / ceil;
        int i = 0;
        double d19 = d6;
        double d20 = d17;
        double d21 = d14;
        double d22 = d5;
        double d23 = d8;
        while (i < ceil) {
            double d24 = d23 + d18;
            double sin3 = Math.sin(d24);
            double cos3 = Math.cos(d24);
            double d25 = d18;
            double d26 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
            double d27 = d2 + (d10 * sin * cos3) + (d16 * sin3);
            double d28 = (d12 * sin3) - (d13 * cos3);
            double d29 = (sin3 * d15) + (cos3 * d16);
            double d30 = d24 - d23;
            double tan = Math.tan(d30 / 2.0d);
            double sin4 = (Math.sin(d30) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) (d22 + (d21 * sin4)), (float) (d19 + (d20 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
            i++;
            d19 = d27;
            d22 = d26;
            d23 = d24;
            d20 = d29;
            d21 = d28;
            d18 = d25;
            d16 = d16;
            d15 = d15;
            ceil = ceil;
            cos = cos;
            sin = sin;
            d10 = d3;
        }
    }
}
