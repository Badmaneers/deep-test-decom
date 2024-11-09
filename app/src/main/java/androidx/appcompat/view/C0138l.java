package androidx.appcompat.view;

import android.view.animation.Interpolator;
import androidx.core.p024g.C0507ah;
import androidx.core.p024g.C0512am;
import androidx.core.p024g.InterfaceC0511al;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* renamed from: androidx.appcompat.view.l */
/* loaded from: classes.dex */
public final class C0138l {

    /* renamed from: b */
    InterfaceC0511al f504b;

    /* renamed from: d */
    private Interpolator f506d;

    /* renamed from: e */
    private boolean f507e;

    /* renamed from: c */
    private long f505c = -1;

    /* renamed from: f */
    private final C0512am f508f = new C0139m(this);

    /* renamed from: a */
    final ArrayList<C0507ah> f503a = new ArrayList<>();

    /* renamed from: a */
    public final C0138l m329a(C0507ah c0507ah) {
        if (!this.f507e) {
            this.f503a.add(c0507ah);
        }
        return this;
    }

    /* renamed from: a */
    public final C0138l m330a(C0507ah c0507ah, C0507ah c0507ah2) {
        this.f503a.add(c0507ah);
        c0507ah2.m1760b(c0507ah.m1752a());
        this.f503a.add(c0507ah2);
        return this;
    }

    /* renamed from: a */
    public final void m332a() {
        if (this.f507e) {
            return;
        }
        Iterator<C0507ah> it = this.f503a.iterator();
        while (it.hasNext()) {
            C0507ah next = it.next();
            if (this.f505c >= 0) {
                next.m1754a(this.f505c);
            }
            if (this.f506d != null) {
                next.m1755a(this.f506d);
            }
            if (this.f504b != null) {
                next.m1756a(this.f508f);
            }
            next.m1762d();
        }
        this.f507e = true;
    }

    /* renamed from: b */
    public final void m333b() {
        this.f507e = false;
    }

    /* renamed from: c */
    public final void m334c() {
        if (this.f507e) {
            Iterator<C0507ah> it = this.f503a.iterator();
            while (it.hasNext()) {
                it.next().m1761c();
            }
            this.f507e = false;
        }
    }

    /* renamed from: d */
    public final C0138l m335d() {
        if (!this.f507e) {
            this.f505c = 250L;
        }
        return this;
    }

    /* renamed from: a */
    public final C0138l m328a(Interpolator interpolator) {
        if (!this.f507e) {
            this.f506d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public final C0138l m331a(InterfaceC0511al interfaceC0511al) {
        if (!this.f507e) {
            this.f504b = interfaceC0511al;
        }
        return this;
    }
}
