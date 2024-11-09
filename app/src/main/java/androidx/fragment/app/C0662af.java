package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: FragmentManagerImpl.java */
/* renamed from: androidx.fragment.app.af */
/* loaded from: classes.dex */
final class C0662af implements InterfaceC0661ae {

    /* renamed from: b */
    final int f2835b;

    /* renamed from: d */
    final /* synthetic */ LayoutInflaterFactory2C0707s f2837d;

    /* renamed from: a */
    final String f2834a = null;

    /* renamed from: c */
    final int f2836c = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0662af(LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s, int i) {
        this.f2837d = layoutInflaterFactory2C0707s;
        this.f2835b = i;
    }

    @Override // androidx.fragment.app.InterfaceC0661ae
    /* renamed from: a */
    public final boolean mo2346a(ArrayList<C0656a> arrayList, ArrayList<Boolean> arrayList2) {
        if (this.f2837d.f3010q == null || this.f2835b >= 0 || this.f2834a != null || !this.f2837d.f3010q.m2319t().mo2480c()) {
            return this.f2837d.m2553a(arrayList, arrayList2, this.f2834a, this.f2835b, this.f2836c);
        }
        return false;
    }
}
