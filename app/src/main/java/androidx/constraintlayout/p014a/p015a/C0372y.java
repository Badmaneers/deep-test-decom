package androidx.constraintlayout.p014a.p015a;

import androidx.constraintlayout.p014a.C0374c;
import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* renamed from: androidx.constraintlayout.a.a.y */
/* loaded from: classes.dex */
public class C0372y extends C0357j {

    /* renamed from: az */
    protected ArrayList<C0357j> f1784az = new ArrayList<>();

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: f */
    public void mo1216f() {
        this.f1784az.clear();
        super.mo1216f();
    }

    /* renamed from: a */
    public final void m1303a(C0357j c0357j) {
        this.f1784az.add(c0357j);
        if (c0357j.f1636D != null) {
            ((C0372y) c0357j.f1636D).m1304b(c0357j);
        }
        c0357j.f1636D = this;
    }

    /* renamed from: b */
    public final void m1304b(C0357j c0357j) {
        this.f1784az.remove(c0357j);
        c0357j.f1636D = null;
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: b */
    public final void mo1199b(int i, int i2) {
        super.mo1199b(i, i2);
        int size = this.f1784az.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f1784az.get(i3).mo1199b(m1245u(), m1246v());
        }
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: C */
    public final void mo1183C() {
        super.mo1183C();
        if (this.f1784az == null) {
            return;
        }
        int size = this.f1784az.size();
        for (int i = 0; i < size; i++) {
            C0357j c0357j = this.f1784az.get(i);
            c0357j.mo1199b(m1241s(), m1243t());
            if (!(c0357j instanceof C0360m)) {
                c0357j.mo1183C();
            }
        }
    }

    /* renamed from: K */
    public void mo1257K() {
        mo1183C();
        if (this.f1784az == null) {
            return;
        }
        int size = this.f1784az.size();
        for (int i = 0; i < size; i++) {
            C0357j c0357j = this.f1784az.get(i);
            if (c0357j instanceof C0372y) {
                ((C0372y) c0357j).mo1257K();
            }
        }
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: a */
    public final void mo1195a(C0374c c0374c) {
        super.mo1195a(c0374c);
        int size = this.f1784az.size();
        for (int i = 0; i < size; i++) {
            this.f1784az.get(i).mo1195a(c0374c);
        }
    }

    /* renamed from: N */
    public final void m1302N() {
        this.f1784az.clear();
    }
}
