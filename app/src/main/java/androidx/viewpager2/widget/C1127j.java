package androidx.viewpager2.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager2.java */
/* renamed from: androidx.viewpager2.widget.j */
/* loaded from: classes.dex */
public final class C1127j extends AbstractC1133p {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f4553a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1127j(ViewPager2 viewPager2) {
        this.f4553a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.AbstractC1133p
    /* renamed from: a */
    public final void mo3727a(int i) {
        this.f4553a.clearFocus();
        if (this.f4553a.hasFocus()) {
            this.f4553a.f4505d.requestFocus(2);
        }
    }
}
