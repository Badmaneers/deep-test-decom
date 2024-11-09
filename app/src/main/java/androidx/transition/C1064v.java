package androidx.transition;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport.java */
/* renamed from: androidx.transition.v */
/* loaded from: classes.dex */
final class C1064v implements InterfaceC1007aj {

    /* renamed from: a */
    final /* synthetic */ View f4247a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f4248b;

    /* renamed from: c */
    final /* synthetic */ C1062t f4249c;

    @Override // androidx.transition.InterfaceC1007aj
    /* renamed from: a */
    public final void mo3519a() {
    }

    @Override // androidx.transition.InterfaceC1007aj
    /* renamed from: b */
    public final void mo3521b() {
    }

    @Override // androidx.transition.InterfaceC1007aj
    /* renamed from: c */
    public final void mo3522c() {
    }

    @Override // androidx.transition.InterfaceC1007aj
    /* renamed from: d */
    public final void mo3523d() {
    }

    public C1064v(C1062t c1062t, View view, ArrayList arrayList) {
        this.f4249c = c1062t;
        this.f4247a = view;
        this.f4248b = arrayList;
    }

    @Override // androidx.transition.InterfaceC1007aj
    /* renamed from: a */
    public final void mo3520a(AbstractC1001ad abstractC1001ad) {
        abstractC1001ad.mo3501b(this);
        this.f4247a.setVisibility(8);
        int size = this.f4248b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f4248b.get(i)).setVisibility(0);
        }
    }
}
