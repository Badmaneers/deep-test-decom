package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.bd */
/* loaded from: classes.dex */
public abstract class AbstractC0851bd {

    /* renamed from: a */
    private InterfaceC0852be f3515a = null;

    /* renamed from: b */
    private ArrayList<Object> f3516b = new ArrayList<>();

    /* renamed from: c */
    private long f3517c = 120;

    /* renamed from: d */
    private long f3518d = 120;

    /* renamed from: e */
    private long f3519e = 250;

    /* renamed from: f */
    private long f3520f = 250;

    /* renamed from: a */
    public abstract void mo3039a();

    /* renamed from: a */
    public abstract boolean mo3041a(AbstractC0879ce abstractC0879ce, C0853bf c0853bf, C0853bf c0853bf2);

    /* renamed from: a */
    public abstract boolean mo3042a(AbstractC0879ce abstractC0879ce, AbstractC0879ce abstractC0879ce2, C0853bf c0853bf, C0853bf c0853bf2);

    /* renamed from: b */
    public abstract boolean mo3044b();

    /* renamed from: b */
    public abstract boolean mo3045b(AbstractC0879ce abstractC0879ce, C0853bf c0853bf, C0853bf c0853bf2);

    /* renamed from: c */
    public abstract void mo3046c(AbstractC0879ce abstractC0879ce);

    /* renamed from: c */
    public abstract boolean mo3047c(AbstractC0879ce abstractC0879ce, C0853bf c0853bf, C0853bf c0853bf2);

    /* renamed from: d */
    public abstract void mo3048d();

    /* renamed from: g */
    public boolean mo3053g(AbstractC0879ce abstractC0879ce) {
        return true;
    }

    /* renamed from: e */
    public final long m3049e() {
        return this.f3519e;
    }

    /* renamed from: f */
    public final long m3050f() {
        return this.f3517c;
    }

    /* renamed from: g */
    public final long m3052g() {
        return this.f3518d;
    }

    /* renamed from: h */
    public final long m3054h() {
        return this.f3520f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3040a(InterfaceC0852be interfaceC0852be) {
        this.f3515a = interfaceC0852be;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m3038e(AbstractC0879ce abstractC0879ce) {
        int i = abstractC0879ce.f3623j & 14;
        if (abstractC0879ce.m3217k()) {
            return 4;
        }
        if ((i & 4) != 0) {
            return i;
        }
        int i2 = abstractC0879ce.f3617d;
        int m3210d = abstractC0879ce.m3210d();
        return (i2 == -1 || m3210d == -1 || i2 == m3210d) ? i : i | 2048;
    }

    /* renamed from: f */
    public final void m3051f(AbstractC0879ce abstractC0879ce) {
        if (this.f3515a != null) {
            this.f3515a.mo3056a(abstractC0879ce);
        }
    }

    /* renamed from: a */
    public boolean mo3043a(AbstractC0879ce abstractC0879ce, List<Object> list) {
        return mo3053g(abstractC0879ce);
    }

    /* renamed from: i */
    public final void m3055i() {
        int size = this.f3516b.size();
        for (int i = 0; i < size; i++) {
            this.f3516b.get(i);
        }
        this.f3516b.clear();
    }

    /* renamed from: d */
    public static C0853bf m3037d(AbstractC0879ce abstractC0879ce) {
        return new C0853bf().m3057a(abstractC0879ce);
    }
}
