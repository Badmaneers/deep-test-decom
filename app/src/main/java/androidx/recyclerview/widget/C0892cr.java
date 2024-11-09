package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StaggeredGridLayoutManager.java */
/* renamed from: androidx.recyclerview.widget.cr */
/* loaded from: classes.dex */
public final class C0892cr {

    /* renamed from: a */
    ArrayList<View> f3653a = new ArrayList<>();

    /* renamed from: b */
    int f3654b = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: c */
    int f3655c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    int f3656d = 0;

    /* renamed from: e */
    final int f3657e;

    /* renamed from: f */
    final /* synthetic */ StaggeredGridLayoutManager f3658f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0892cr(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f3658f = staggeredGridLayoutManager;
        this.f3657e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m3248a(int i) {
        if (this.f3654b != Integer.MIN_VALUE) {
            return this.f3654b;
        }
        if (this.f3653a.size() == 0) {
            return i;
        }
        m3245h();
        return this.f3654b;
    }

    /* renamed from: h */
    private void m3245h() {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem m2913d;
        View view = this.f3653a.get(0);
        C0889co c0889co = (C0889co) view.getLayoutParams();
        this.f3654b = this.f3658f.f3410b.mo2968a(view);
        if (c0889co.f3652b && (m2913d = this.f3658f.f3416h.m2913d(c0889co.f3550c.m3209c())) != null && m2913d.f3428b == -1) {
            this.f3654b -= m2913d.m2914a(this.f3657e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m3247a() {
        if (this.f3654b != Integer.MIN_VALUE) {
            return this.f3654b;
        }
        m3245h();
        return this.f3654b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m3252b(int i) {
        if (this.f3655c != Integer.MIN_VALUE) {
            return this.f3655c;
        }
        if (this.f3653a.size() == 0) {
            return i;
        }
        m3246i();
        return this.f3655c;
    }

    /* renamed from: i */
    private void m3246i() {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem m2913d;
        View view = this.f3653a.get(this.f3653a.size() - 1);
        C0889co c0889co = (C0889co) view.getLayoutParams();
        this.f3655c = this.f3658f.f3410b.mo2971b(view);
        if (c0889co.f3652b && (m2913d = this.f3658f.f3416h.m2913d(c0889co.f3550c.m3209c())) != null && m2913d.f3428b == 1) {
            this.f3655c += m2913d.m2914a(this.f3657e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m3251b() {
        if (this.f3655c != Integer.MIN_VALUE) {
            return this.f3655c;
        }
        m3246i();
        return this.f3655c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m3254c() {
        this.f3653a.clear();
        this.f3654b = RecyclerView.UNDEFINED_DURATION;
        this.f3655c = RecyclerView.UNDEFINED_DURATION;
        this.f3656d = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m3255c(int i) {
        this.f3654b = i;
        this.f3655c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m3256d() {
        int size = this.f3653a.size();
        View remove = this.f3653a.remove(size - 1);
        C0889co c0889co = (C0889co) remove.getLayoutParams();
        c0889co.f3651a = null;
        if (c0889co.f3550c.m3220n() || c0889co.f3550c.m3228v()) {
            this.f3656d -= this.f3658f.f3410b.mo2978e(remove);
        }
        if (size == 1) {
            this.f3654b = RecyclerView.UNDEFINED_DURATION;
        }
        this.f3655c = RecyclerView.UNDEFINED_DURATION;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m3258e() {
        View remove = this.f3653a.remove(0);
        C0889co c0889co = (C0889co) remove.getLayoutParams();
        c0889co.f3651a = null;
        if (this.f3653a.size() == 0) {
            this.f3655c = RecyclerView.UNDEFINED_DURATION;
        }
        if (c0889co.f3550c.m3220n() || c0889co.f3550c.m3228v()) {
            this.f3656d -= this.f3658f.f3410b.mo2978e(remove);
        }
        this.f3654b = RecyclerView.UNDEFINED_DURATION;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m3257d(int i) {
        if (this.f3654b != Integer.MIN_VALUE) {
            this.f3654b += i;
        }
        if (this.f3655c != Integer.MIN_VALUE) {
            this.f3655c += i;
        }
    }

    /* renamed from: f */
    public final int m3259f() {
        if (this.f3658f.f3412d) {
            return m3244b(this.f3653a.size() - 1, -1);
        }
        return m3244b(0, this.f3653a.size());
    }

    /* renamed from: g */
    public final int m3260g() {
        if (this.f3658f.f3412d) {
            return m3244b(0, this.f3653a.size());
        }
        return m3244b(this.f3653a.size() - 1, -1);
    }

    /* renamed from: b */
    private int m3244b(int i, int i2) {
        int mo2975d = this.f3658f.f3410b.mo2975d();
        int mo2977e = this.f3658f.f3410b.mo2977e();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = this.f3653a.get(i);
            int mo2968a = this.f3658f.f3410b.mo2968a(view);
            int mo2971b = this.f3658f.f3410b.mo2971b(view);
            boolean z = mo2968a <= mo2977e;
            boolean z2 = mo2971b >= mo2975d;
            if (z && z2 && (mo2968a < mo2975d || mo2971b > mo2977e)) {
                return StaggeredGridLayoutManager.m3069e(view);
            }
            i += i3;
        }
        return -1;
    }

    /* renamed from: a */
    public final View m3249a(int i, int i2) {
        View view = null;
        if (i2 == -1) {
            int size = this.f3653a.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = this.f3653a.get(i3);
                if ((this.f3658f.f3412d && StaggeredGridLayoutManager.m3069e(view2) <= i) || ((!this.f3658f.f3412d && StaggeredGridLayoutManager.m3069e(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
        } else {
            int size2 = this.f3653a.size() - 1;
            while (size2 >= 0) {
                View view3 = this.f3653a.get(size2);
                if ((this.f3658f.f3412d && StaggeredGridLayoutManager.m3069e(view3) >= i) || ((!this.f3658f.f3412d && StaggeredGridLayoutManager.m3069e(view3) <= i) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3250a(View view) {
        C0889co c0889co = (C0889co) view.getLayoutParams();
        c0889co.f3651a = this;
        this.f3653a.add(0, view);
        this.f3654b = RecyclerView.UNDEFINED_DURATION;
        if (this.f3653a.size() == 1) {
            this.f3655c = RecyclerView.UNDEFINED_DURATION;
        }
        if (c0889co.f3550c.m3220n() || c0889co.f3550c.m3228v()) {
            this.f3656d += this.f3658f.f3410b.mo2978e(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3253b(View view) {
        C0889co c0889co = (C0889co) view.getLayoutParams();
        c0889co.f3651a = this;
        this.f3653a.add(view);
        this.f3655c = RecyclerView.UNDEFINED_DURATION;
        if (this.f3653a.size() == 1) {
            this.f3654b = RecyclerView.UNDEFINED_DURATION;
        }
        if (c0889co.f3550c.m3220n() || c0889co.f3550c.m3228v()) {
            this.f3656d += this.f3658f.f3410b.mo2978e(view);
        }
    }
}
