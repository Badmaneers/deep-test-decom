package androidx.constraintlayout.p014a.p015a;

import java.util.Arrays;

/* compiled from: Helper.java */
/* renamed from: androidx.constraintlayout.a.a.q */
/* loaded from: classes.dex */
public class C0364q extends C0357j {

    /* renamed from: ai */
    protected C0357j[] f1755ai = new C0357j[4];

    /* renamed from: aj */
    protected int f1756aj = 0;

    /* renamed from: a */
    public final void m1275a(C0357j c0357j) {
        if (this.f1756aj + 1 > this.f1755ai.length) {
            this.f1755ai = (C0357j[]) Arrays.copyOf(this.f1755ai, this.f1755ai.length * 2);
        }
        this.f1755ai[this.f1756aj] = c0357j;
        this.f1756aj++;
    }

    /* renamed from: H */
    public final void m1274H() {
        this.f1756aj = 0;
    }
}
