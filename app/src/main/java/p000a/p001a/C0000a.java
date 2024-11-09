package p000a.p001a;

import java.util.ArrayList;
import java.util.List;

/* compiled from: Timber.java */
/* renamed from: a.a.a */
/* loaded from: classes.dex */
public final class C0000a {

    /* renamed from: b */
    private static final AbstractC0003d[] f1b = new AbstractC0003d[0];

    /* renamed from: c */
    private static final List<AbstractC0003d> f2c = new ArrayList();

    /* renamed from: a */
    static volatile AbstractC0003d[] f0a = f1b;

    /* renamed from: d */
    private static final AbstractC0003d f3d = new C0001b();

    /* renamed from: a */
    public static void m3a(String str, Object... objArr) {
        f3d.mo5a(str, objArr);
    }

    /* renamed from: a */
    public static AbstractC0003d m0a(String str) {
        for (AbstractC0003d abstractC0003d : f0a) {
            abstractC0003d.f5a.set(str);
        }
        return f3d;
    }

    /* renamed from: a */
    public static void m2a(AbstractC0003d abstractC0003d) {
        if (abstractC0003d == f3d) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        synchronized (f2c) {
            f2c.add(abstractC0003d);
            List<AbstractC0003d> list = f2c;
            f0a = (AbstractC0003d[]) list.toArray(new AbstractC0003d[list.size()]);
        }
    }

    /* renamed from: a */
    public static void m1a() {
        synchronized (f2c) {
            f2c.clear();
            f0a = f1b;
        }
    }
}
