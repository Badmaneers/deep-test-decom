package androidx.appcompat.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownListView.java */
/* renamed from: androidx.appcompat.widget.bm */
/* loaded from: classes.dex */
public final class RunnableC0221bm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0219bk f1216a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0221bm(C0219bk c0219bk) {
        this.f1216a = c0219bk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1216a.f1201a = null;
        this.f1216a.drawableStateChanged();
    }
}
