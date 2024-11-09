package androidx.viewpager2.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager2.java */
/* renamed from: androidx.viewpager2.widget.i */
/* loaded from: classes.dex */
public final class C1126i extends AbstractC1133p {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f4552a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1126i(ViewPager2 viewPager2) {
        this.f4552a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.AbstractC1133p
    /* renamed from: a */
    public final void mo3727a(int i) {
        if (this.f4552a.f4503b != i) {
            this.f4552a.f4503b = i;
            this.f4552a.f4507f.mo3762e();
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC1133p
    /* renamed from: b */
    public final void mo3730b(int i) {
        if (i == 0) {
            this.f4552a.m3718a();
        }
    }
}
