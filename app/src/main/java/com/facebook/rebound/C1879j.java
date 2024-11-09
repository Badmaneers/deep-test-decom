package com.facebook.rebound;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Spring.java */
/* renamed from: com.facebook.rebound.j */
/* loaded from: classes.dex */
public final class C1879j {

    /* renamed from: a */
    private static int f8647a;

    /* renamed from: b */
    private C1881l f8648b;

    /* renamed from: c */
    private boolean f8649c;

    /* renamed from: d */
    private final String f8650d;

    /* renamed from: h */
    private double f8654h;

    /* renamed from: i */
    private double f8655i;

    /* renamed from: o */
    private final C1875f f8661o;

    /* renamed from: e */
    private final C1880k f8651e = new C1880k((byte) 0);

    /* renamed from: f */
    private final C1880k f8652f = new C1880k((byte) 0);

    /* renamed from: g */
    private final C1880k f8653g = new C1880k((byte) 0);

    /* renamed from: j */
    private boolean f8656j = true;

    /* renamed from: k */
    private double f8657k = 0.005d;

    /* renamed from: l */
    private double f8658l = 0.005d;

    /* renamed from: m */
    private CopyOnWriteArraySet<InterfaceC1883n> f8659m = new CopyOnWriteArraySet<>();

    /* renamed from: n */
    private double f8660n = 0.0d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1879j(C1875f c1875f) {
        this.f8661o = c1875f;
        StringBuilder sb = new StringBuilder("spring:");
        int i = f8647a;
        f8647a = i + 1;
        sb.append(i);
        this.f8650d = sb.toString();
        m6016a(C1881l.f8664c);
    }

    /* renamed from: a */
    public final String m6018a() {
        return this.f8650d;
    }

    /* renamed from: a */
    public final C1879j m6016a(C1881l c1881l) {
        if (c1881l == null) {
            throw new IllegalArgumentException("springConfig is required");
        }
        this.f8648b = c1881l;
        return this;
    }

    /* renamed from: c */
    public final double m6021c() {
        return this.f8651e.f8662a;
    }

    /* renamed from: a */
    private double m6014a(C1880k c1880k) {
        return Math.abs(this.f8655i - c1880k.f8662a);
    }

    /* renamed from: a */
    public final C1879j m6015a(double d) {
        if (this.f8655i == d && m6024f()) {
            return this;
        }
        this.f8654h = this.f8651e.f8662a;
        this.f8655i = d;
        this.f8661o.m6008a(this.f8650d);
        Iterator<InterfaceC1883n> it = this.f8659m.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return this;
    }

    /* renamed from: d */
    public final double m6022d() {
        return this.f8655i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0134, code lost:            if ((r30.f8648b.f8666b > 0.0d && ((r30.f8654h < r30.f8655i && r30.f8651e.f8662a > r30.f8655i) || (r30.f8654h > r30.f8655i && r30.f8651e.f8662a < r30.f8655i))) != false) goto L38;     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179 A[LOOP:1: B:46:0x0173->B:48:0x0179, LOOP_END] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6020b(double r31) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rebound.C1879j.m6020b(double):void");
    }

    /* renamed from: e */
    public final boolean m6023e() {
        return this.f8656j;
    }

    /* renamed from: f */
    public final boolean m6024f() {
        if (Math.abs(this.f8651e.f8663b) <= this.f8657k) {
            return m6014a(this.f8651e) <= this.f8658l || this.f8648b.f8666b == 0.0d;
        }
        return false;
    }

    /* renamed from: a */
    public final C1879j m6017a(InterfaceC1883n interfaceC1883n) {
        if (interfaceC1883n == null) {
            throw new IllegalArgumentException("newListener is required");
        }
        this.f8659m.add(interfaceC1883n);
        return this;
    }

    /* renamed from: g */
    public final C1879j m6025g() {
        this.f8659m.clear();
        return this;
    }

    /* renamed from: b */
    public final C1879j m6019b() {
        this.f8654h = 1.0d;
        this.f8651e.f8662a = 1.0d;
        this.f8661o.m6008a(this.f8650d);
        Iterator<InterfaceC1883n> it = this.f8659m.iterator();
        while (it.hasNext()) {
            it.next().mo3804a(this);
        }
        this.f8655i = this.f8651e.f8662a;
        this.f8653g.f8662a = this.f8651e.f8662a;
        this.f8651e.f8663b = 0.0d;
        return this;
    }
}
