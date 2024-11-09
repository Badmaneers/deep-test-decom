package androidx.viewpager.widget;

/* compiled from: ViewPager.java */
/* renamed from: androidx.viewpager.widget.h */
/* loaded from: classes.dex */
final class RunnableC1101h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ViewPager f4472a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1101h(ViewPager viewPager) {
        this.f4472a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4472a.setScrollState(0);
        this.f4472a.m3694b();
    }
}
