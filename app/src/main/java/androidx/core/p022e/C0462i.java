package androidx.core.p022e;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* renamed from: androidx.core.e.i */
/* loaded from: classes.dex */
public final class C0462i {

    /* renamed from: a */
    public static final InterfaceC0461h f2258a = new C0467n(null, false);

    /* renamed from: b */
    public static final InterfaceC0461h f2259b = new C0467n(null, true);

    /* renamed from: c */
    public static final InterfaceC0461h f2260c = new C0467n(C0464k.f2266a, false);

    /* renamed from: d */
    public static final InterfaceC0461h f2261d = new C0467n(C0464k.f2266a, true);

    /* renamed from: e */
    public static final InterfaceC0461h f2262e = new C0467n(C0463j.f2264a, false);

    /* renamed from: f */
    public static final InterfaceC0461h f2263f = C0468o.f2269a;

    /* renamed from: a */
    public static int m1607a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    /* renamed from: b */
    public static int m1608b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                switch (i) {
                    case 14:
                    case 15:
                        return 1;
                    case 16:
                    case 17:
                        return 0;
                    default:
                        return 2;
                }
        }
    }
}
