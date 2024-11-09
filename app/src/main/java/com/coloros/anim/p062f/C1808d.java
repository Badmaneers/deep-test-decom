package com.coloros.anim.p062f;

/* compiled from: GammaEvaluator.java */
/* renamed from: com.coloros.anim.f.d */
/* loaded from: classes.dex */
public final class C1808d {
    /* renamed from: a */
    private static float m5887a(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: b */
    private static float m5889b(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: a */
    public static int m5888a(float f, int i, int i2) {
        float f2 = ((i >> 24) & 255) / 255.0f;
        float m5889b = m5889b(((i >> 16) & 255) / 255.0f);
        float m5889b2 = m5889b(((i >> 8) & 255) / 255.0f);
        float m5889b3 = m5889b((i & 255) / 255.0f);
        float m5889b4 = m5889b(((i2 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float m5889b5 = m5889b2 + ((m5889b(((i2 >> 8) & 255) / 255.0f) - m5889b2) * f);
        float m5889b6 = m5889b3 + (f * (m5889b((i2 & 255) / 255.0f) - m5889b3));
        return (Math.round(m5887a(m5889b + ((m5889b4 - m5889b) * f)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(m5887a(m5889b5) * 255.0f) << 8) | Math.round(m5887a(m5889b6) * 255.0f);
    }
}
