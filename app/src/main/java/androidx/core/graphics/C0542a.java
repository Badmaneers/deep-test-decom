package androidx.core.graphics;

import android.graphics.Color;

/* compiled from: ColorUtils.java */
/* renamed from: androidx.core.graphics.a */
/* loaded from: classes.dex */
public final class C0542a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f2394a = new ThreadLocal<>();

    /* renamed from: a */
    private static float m1898a(float f, float f2) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > f2 ? f2 : f;
    }

    /* renamed from: a */
    private static int m1899a(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    /* renamed from: a */
    public static int m1900a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, m1901a(Color.red(i), alpha2, Color.red(i2), alpha, i3), m1901a(Color.green(i), alpha2, Color.green(i2), alpha, i3), m1901a(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    /* renamed from: a */
    private static int m1901a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: a */
    public static void m1903a(int i, float[] fArr) {
        float f;
        float abs;
        float red = Color.red(i) / 255.0f;
        float green = Color.green(i) / 255.0f;
        float blue = Color.blue(i) / 255.0f;
        float max = Math.max(red, Math.max(green, blue));
        float min = Math.min(red, Math.min(green, blue));
        float f2 = max - min;
        float f3 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == red ? ((green - blue) / f2) % 6.0f : max == green ? ((blue - red) / f2) + 2.0f : ((red - green) / f2) + 4.0f;
            abs = f2 / (1.0f - Math.abs((2.0f * f3) - 1.0f));
        }
        float f4 = (f * 60.0f) % 360.0f;
        if (f4 < 0.0f) {
            f4 += 360.0f;
        }
        fArr[0] = m1898a(f4, 360.0f);
        fArr[1] = m1898a(abs, 1.0f);
        fArr[2] = m1898a(f3, 1.0f);
    }

    /* renamed from: a */
    public static int m1902a(float[] fArr) {
        int round;
        int round2;
        int i = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 1:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 2:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(m1899a(i), m1899a(round), m1899a(round2));
    }

    /* renamed from: b */
    public static int m1904b(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
