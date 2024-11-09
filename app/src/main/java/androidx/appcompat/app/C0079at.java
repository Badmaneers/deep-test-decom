package androidx.appcompat.app;

/* compiled from: TwilightCalculator.java */
/* renamed from: androidx.appcompat.app.at */
/* loaded from: classes.dex */
final class C0079at {

    /* renamed from: d */
    private static C0079at f234d;

    /* renamed from: a */
    public long f235a;

    /* renamed from: b */
    public long f236b;

    /* renamed from: c */
    public int f237c;

    C0079at() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0079at m190a() {
        if (f234d == null) {
            f234d = new C0079at();
        }
        return f234d;
    }

    /* renamed from: a */
    public final void m191a(long j, double d, double d2) {
        double d3 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin(2.0f * r5) * 3.4906598739326E-4d) + (Math.sin(r5 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((r4 - 9.0E-4f) - r10)) + 9.0E-4f + ((-d2) / 360.0d) + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(asin))) / (Math.cos(d4) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f237c = 1;
            this.f235a = -1L;
            this.f236b = -1L;
        } else {
            if (sin2 <= -1.0d) {
                this.f237c = 0;
                this.f235a = -1L;
                this.f236b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.f235a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            this.f236b = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            if (this.f236b < j && this.f235a > j) {
                this.f237c = 0;
            } else {
                this.f237c = 1;
            }
        }
    }
}
