package androidx.core.p022e;

import java.util.Locale;

/* compiled from: BidiFormatter.java */
/* renamed from: androidx.core.e.b */
/* loaded from: classes.dex */
public final class C0455b {

    /* renamed from: a */
    private boolean f2233a = C0454a.m1580a(Locale.getDefault());

    /* renamed from: c */
    private InterfaceC0461h f2235c = C0454a.f2225a;

    /* renamed from: b */
    private int f2234b = 2;

    /* renamed from: a */
    public final C0454a m1585a() {
        if (this.f2234b == 2 && this.f2235c == C0454a.f2225a) {
            return this.f2233a ? C0454a.f2227c : C0454a.f2226b;
        }
        return new C0454a(this.f2233a, this.f2234b, this.f2235c);
    }
}
