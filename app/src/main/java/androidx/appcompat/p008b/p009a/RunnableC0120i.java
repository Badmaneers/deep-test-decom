package androidx.appcompat.p008b.p009a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawableContainer.java */
/* renamed from: androidx.appcompat.b.a.i */
/* loaded from: classes.dex */
public final class RunnableC0120i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0119h f399a;

    public RunnableC0120i(C0119h c0119h) {
        this.f399a = c0119h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f399a.m277a(true);
        this.f399a.invalidateSelf();
    }
}
