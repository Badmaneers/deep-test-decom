package com.google.android.material.p078g;

/* compiled from: MathUtils.java */
/* renamed from: com.google.android.material.g.a */
/* loaded from: classes.dex */
public final class C2217a {
    /* renamed from: a */
    public static float m7035a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: b */
    private static float m7037b(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* renamed from: a */
    public static float m7036a(float f, float f2, float f3, float f4) {
        float m7037b = m7037b(f, f2, 0.0f, 0.0f);
        float m7037b2 = m7037b(f, f2, f3, 0.0f);
        float m7037b3 = m7037b(f, f2, f3, f4);
        float m7037b4 = m7037b(f, f2, 0.0f, f4);
        return (m7037b <= m7037b2 || m7037b <= m7037b3 || m7037b <= m7037b4) ? (m7037b2 <= m7037b3 || m7037b2 <= m7037b4) ? m7037b3 > m7037b4 ? m7037b3 : m7037b4 : m7037b2 : m7037b;
    }
}
