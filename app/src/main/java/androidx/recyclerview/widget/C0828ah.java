package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LinearLayoutManager.java */
/* renamed from: androidx.recyclerview.widget.ah */
/* loaded from: classes.dex */
public final class C0828ah {

    /* renamed from: b */
    int f3479b;

    /* renamed from: c */
    int f3480c;

    /* renamed from: d */
    int f3481d;

    /* renamed from: e */
    int f3482e;

    /* renamed from: f */
    int f3483f;

    /* renamed from: g */
    int f3484g;

    /* renamed from: k */
    int f3488k;

    /* renamed from: m */
    boolean f3490m;

    /* renamed from: a */
    boolean f3478a = true;

    /* renamed from: h */
    int f3485h = 0;

    /* renamed from: i */
    int f3486i = 0;

    /* renamed from: j */
    boolean f3487j = false;

    /* renamed from: l */
    List<AbstractC0879ce> f3489l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m2947a(C0876cb c0876cb) {
        return this.f3481d >= 0 && this.f3481d < c0876cb.m3190a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final View m2945a(C0868bu c0868bu) {
        if (this.f3489l != null) {
            int size = this.f3489l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f3489l.get(i).f3614a;
                C0861bn c0861bn = (C0861bn) view.getLayoutParams();
                if (!c0861bn.f3550c.m3220n() && this.f3481d == c0861bn.f3550c.m3209c()) {
                    m2946a(view);
                    return view;
                }
            }
            return null;
        }
        View m3168c = c0868bu.m3168c(this.f3481d);
        this.f3481d += this.f3482e;
        return m3168c;
    }

    /* renamed from: a */
    public final void m2946a(View view) {
        View m2944b = m2944b(view);
        if (m2944b == null) {
            this.f3481d = -1;
        } else {
            this.f3481d = ((C0861bn) m2944b.getLayoutParams()).f3550c.m3209c();
        }
    }

    /* renamed from: b */
    private View m2944b(View view) {
        int m3209c;
        int size = this.f3489l.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = this.f3489l.get(i2).f3614a;
            C0861bn c0861bn = (C0861bn) view3.getLayoutParams();
            if (view3 != view && !c0861bn.f3550c.m3220n() && (m3209c = (c0861bn.f3550c.m3209c() - this.f3481d) * this.f3482e) >= 0 && m3209c < i) {
                if (m3209c == 0) {
                    return view3;
                }
                view2 = view3;
                i = m3209c;
            }
        }
        return view2;
    }
}
