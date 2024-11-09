package androidx.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveData.java */
/* renamed from: androidx.lifecycle.s */
/* loaded from: classes.dex */
public final class RunnableC0739s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LiveData f3089a;

    public RunnableC0739s(LiveData liveData) {
        this.f3089a = liveData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f3089a.f3042a) {
            obj = this.f3089a.f3044d;
            this.f3089a.f3044d = LiveData.f3041b;
        }
        this.f3089a.mo2587a((LiveData) obj);
    }
}
