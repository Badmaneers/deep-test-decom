package androidx.fragment.app;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerImpl.java */
/* renamed from: androidx.fragment.app.z */
/* loaded from: classes.dex */
public final class C0714z extends C0703o {

    /* renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0707s f3034a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0714z(LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s) {
        this.f3034a = layoutInflaterFactory2C0707s;
    }

    @Override // androidx.fragment.app.C0703o
    /* renamed from: c */
    public final Fragment mo2468c(ClassLoader classLoader, String str) {
        return Fragment.m2244a(this.f3034a.f3007n.m2470k(), str);
    }
}
