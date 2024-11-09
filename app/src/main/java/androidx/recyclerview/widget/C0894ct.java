package androidx.recyclerview.widget;

/* compiled from: ViewBoundsCheck.java */
/* renamed from: androidx.recyclerview.widget.ct */
/* loaded from: classes.dex */
final class C0894ct {

    /* renamed from: a */
    int f3661a = 0;

    /* renamed from: b */
    int f3662b;

    /* renamed from: c */
    int f3663c;

    /* renamed from: d */
    int f3664d;

    /* renamed from: e */
    int f3665e;

    /* renamed from: a */
    private static int m3263a(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3265a(int i, int i2, int i3, int i4) {
        this.f3662b = i;
        this.f3663c = i2;
        this.f3664d = i3;
        this.f3665e = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3264a(int i) {
        this.f3661a = i | this.f3661a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m3266a() {
        if ((this.f3661a & 7) != 0 && (this.f3661a & (m3263a(this.f3664d, this.f3662b) << 0)) == 0) {
            return false;
        }
        if ((this.f3661a & 112) != 0 && (this.f3661a & (m3263a(this.f3664d, this.f3663c) << 4)) == 0) {
            return false;
        }
        if ((this.f3661a & 1792) != 0 && (this.f3661a & (m3263a(this.f3665e, this.f3662b) << 8)) == 0) {
            return false;
        }
        if ((this.f3661a & 28672) != 0) {
            return ((m3263a(this.f3665e, this.f3663c) << 12) & this.f3661a) != 0;
        }
        return true;
    }
}
