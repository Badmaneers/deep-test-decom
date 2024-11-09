package com.color.support.widget;

/* compiled from: SpringOverScroller.java */
/* renamed from: com.color.support.widget.gr */
/* loaded from: classes.dex */
final class C1560gr {

    /* renamed from: a */
    double f7397a;

    /* renamed from: b */
    double f7398b;

    /* renamed from: a */
    private static float m5217a(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return ((f - 8.0f) * 3.0f) + 25.0f;
    }

    /* renamed from: b */
    private static double m5218b(float f) {
        if (f == 0.0f) {
            return 0.0d;
        }
        return ((f - 30.0f) * 3.62f) + 194.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1560gr(double d, double d2) {
        this.f7397a = m5217a((float) d);
        this.f7398b = m5218b((float) d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5219a(double d) {
        this.f7397a = m5217a((float) d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m5220b(double d) {
        this.f7398b = m5218b((float) d);
    }
}
