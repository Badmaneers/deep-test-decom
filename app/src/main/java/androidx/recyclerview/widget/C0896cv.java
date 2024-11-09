package androidx.recyclerview.widget;

import androidx.p011b.C0323f;
import androidx.p011b.C0328n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewInfoStore.java */
/* renamed from: androidx.recyclerview.widget.cv */
/* loaded from: classes.dex */
public final class C0896cv {

    /* renamed from: a */
    final C0328n<AbstractC0879ce, C0897cw> f3666a = new C0328n<>();

    /* renamed from: b */
    final C0323f<AbstractC0879ce> f3667b = new C0323f<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3268a() {
        this.f3666a.clear();
        this.f3667b.m1043d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3270a(AbstractC0879ce abstractC0879ce, C0853bf c0853bf) {
        C0897cw c0897cw = this.f3666a.get(abstractC0879ce);
        if (c0897cw == null) {
            c0897cw = C0897cw.m3278a();
            this.f3666a.put(abstractC0879ce, c0897cw);
        }
        c0897cw.f3670b = c0853bf;
        c0897cw.f3669a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m3271a(AbstractC0879ce abstractC0879ce) {
        C0897cw c0897cw = this.f3666a.get(abstractC0879ce);
        return (c0897cw == null || (c0897cw.f3669a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0853bf m3272b(AbstractC0879ce abstractC0879ce) {
        return m3267a(abstractC0879ce, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C0853bf m3274c(AbstractC0879ce abstractC0879ce) {
        return m3267a(abstractC0879ce, 8);
    }

    /* renamed from: a */
    private C0853bf m3267a(AbstractC0879ce abstractC0879ce, int i) {
        C0897cw m1062c;
        C0853bf c0853bf;
        int m1057a = this.f3666a.m1057a(abstractC0879ce);
        if (m1057a < 0 || (m1062c = this.f3666a.m1062c(m1057a)) == null || (m1062c.f3669a & i) == 0) {
            return null;
        }
        m1062c.f3669a &= ~i;
        if (i == 4) {
            c0853bf = m1062c.f3670b;
        } else if (i == 8) {
            c0853bf = m1062c.f3671c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((m1062c.f3669a & 12) == 0) {
            this.f3666a.m1063d(m1057a);
            C0897cw.m3279a(m1062c);
        }
        return c0853bf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3269a(long j, AbstractC0879ce abstractC0879ce) {
        this.f3667b.m1038b(j, abstractC0879ce);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3273b(AbstractC0879ce abstractC0879ce, C0853bf c0853bf) {
        C0897cw c0897cw = this.f3666a.get(abstractC0879ce);
        if (c0897cw == null) {
            c0897cw = C0897cw.m3278a();
            this.f3666a.put(abstractC0879ce, c0897cw);
        }
        c0897cw.f3671c = c0853bf;
        c0897cw.f3669a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m3275d(AbstractC0879ce abstractC0879ce) {
        C0897cw c0897cw = this.f3666a.get(abstractC0879ce);
        if (c0897cw == null) {
            c0897cw = C0897cw.m3278a();
            this.f3666a.put(abstractC0879ce, c0897cw);
        }
        c0897cw.f3669a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m3276e(AbstractC0879ce abstractC0879ce) {
        C0897cw c0897cw = this.f3666a.get(abstractC0879ce);
        if (c0897cw == null) {
            return;
        }
        c0897cw.f3669a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m3277f(AbstractC0879ce abstractC0879ce) {
        int m1035b = this.f3667b.m1035b() - 1;
        while (true) {
            if (m1035b < 0) {
                break;
            }
            if (abstractC0879ce == this.f3667b.m1040c(m1035b)) {
                this.f3667b.m1034a(m1035b);
                break;
            }
            m1035b--;
        }
        C0897cw remove = this.f3666a.remove(abstractC0879ce);
        if (remove != null) {
            C0897cw.m3279a(remove);
        }
    }
}
