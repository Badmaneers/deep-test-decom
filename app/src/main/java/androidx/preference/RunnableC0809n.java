package androidx.preference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreferenceGroup.java */
/* renamed from: androidx.preference.n */
/* loaded from: classes.dex */
public final class RunnableC0809n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PreferenceGroup f3325a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0809n(PreferenceGroup preferenceGroup) {
        this.f3325a = preferenceGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            this.f3325a.f3278a.clear();
        }
    }
}
