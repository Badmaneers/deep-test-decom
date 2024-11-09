package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: LinearLayoutManager.java */
/* renamed from: androidx.recyclerview.widget.af */
/* loaded from: classes.dex */
final class C0826af {

    /* renamed from: a */
    AbstractC0834an f3469a;

    /* renamed from: b */
    int f3470b;

    /* renamed from: c */
    int f3471c;

    /* renamed from: d */
    boolean f3472d;

    /* renamed from: e */
    boolean f3473e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0826af() {
        m2939a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2939a() {
        this.f3470b = -1;
        this.f3471c = RecyclerView.UNDEFINED_DURATION;
        this.f3472d = false;
        this.f3473e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m2941b() {
        int mo2975d;
        if (this.f3472d) {
            mo2975d = this.f3469a.mo2977e();
        } else {
            mo2975d = this.f3469a.mo2975d();
        }
        this.f3471c = mo2975d;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3470b + ", mCoordinate=" + this.f3471c + ", mLayoutFromEnd=" + this.f3472d + ", mValid=" + this.f3473e + '}';
    }

    /* renamed from: a */
    public final void m2940a(View view, int i) {
        int m2973c = this.f3469a.m2973c();
        if (m2973c >= 0) {
            m2942b(view, i);
            return;
        }
        this.f3470b = i;
        if (this.f3472d) {
            int mo2977e = (this.f3469a.mo2977e() - m2973c) - this.f3469a.mo2971b(view);
            this.f3471c = this.f3469a.mo2977e() - mo2977e;
            if (mo2977e > 0) {
                int mo2978e = this.f3471c - this.f3469a.mo2978e(view);
                int mo2975d = this.f3469a.mo2975d();
                int min = mo2978e - (mo2975d + Math.min(this.f3469a.mo2968a(view) - mo2975d, 0));
                if (min < 0) {
                    this.f3471c += Math.min(mo2977e, -min);
                    return;
                }
                return;
            }
            return;
        }
        int mo2968a = this.f3469a.mo2968a(view);
        int mo2975d2 = mo2968a - this.f3469a.mo2975d();
        this.f3471c = mo2968a;
        if (mo2975d2 > 0) {
            int mo2977e2 = (this.f3469a.mo2977e() - Math.min(0, (this.f3469a.mo2977e() - m2973c) - this.f3469a.mo2971b(view))) - (mo2968a + this.f3469a.mo2978e(view));
            if (mo2977e2 < 0) {
                this.f3471c -= Math.min(mo2975d2, -mo2977e2);
            }
        }
    }

    /* renamed from: b */
    public final void m2942b(View view, int i) {
        if (this.f3472d) {
            this.f3471c = this.f3469a.mo2971b(view) + this.f3469a.m2973c();
        } else {
            this.f3471c = this.f3469a.mo2968a(view);
        }
        this.f3470b = i;
    }
}
