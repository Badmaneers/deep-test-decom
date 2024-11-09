package androidx.activity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ComponentActivity.java */
/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public final class RunnableC0052b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComponentActivity f51a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0052b(ComponentActivity componentActivity) {
        this.f51a = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*androidx.core.app.ComponentActivity*/.onBackPressed();
    }
}
