package androidx.transition;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport.java */
/* renamed from: androidx.transition.w */
/* loaded from: classes.dex */
final class C1065w extends C1008ak {

    /* renamed from: a */
    final /* synthetic */ Object f4250a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f4251b;

    /* renamed from: c */
    final /* synthetic */ Object f4252c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f4253d;

    /* renamed from: e */
    final /* synthetic */ Object f4254e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f4255f;

    /* renamed from: g */
    final /* synthetic */ C1062t f4256g;

    public C1065w(C1062t c1062t, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f4256g = c1062t;
        this.f4250a = obj;
        this.f4251b = arrayList;
        this.f4252c = obj2;
        this.f4253d = arrayList2;
        this.f4254e = obj3;
        this.f4255f = arrayList3;
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: d */
    public final void mo3523d() {
        if (this.f4250a != null) {
            this.f4256g.mo2413b(this.f4250a, this.f4251b, (ArrayList<View>) null);
        }
        if (this.f4252c != null) {
            this.f4256g.mo2413b(this.f4252c, this.f4253d, (ArrayList<View>) null);
        }
        if (this.f4254e != null) {
            this.f4256g.mo2413b(this.f4254e, this.f4255f, (ArrayList<View>) null);
        }
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: a */
    public final void mo3520a(AbstractC1001ad abstractC1001ad) {
        abstractC1001ad.mo3501b(this);
    }
}
