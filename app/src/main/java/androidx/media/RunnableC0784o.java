package androidx.media;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.o */
/* loaded from: classes.dex */
final class RunnableC0784o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0793x f3182a;

    /* renamed from: b */
    final /* synthetic */ C0782m f3183b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0784o(C0782m c0782m, InterfaceC0793x interfaceC0793x) {
        this.f3183b = c0782m;
        this.f3182a = interfaceC0793x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0779j remove = this.f3183b.f3175a.f3122b.remove(this.f3182a.mo2684a());
        if (remove != null) {
            remove.f3165f.mo2684a().unlinkToDeath(remove, 0);
        }
    }
}
