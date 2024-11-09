package androidx.loader.p036a;

import android.util.Log;
import androidx.lifecycle.InterfaceC0743w;
import androidx.loader.p037b.C0754a;
import java.io.PrintWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoaderManagerImpl.java */
/* renamed from: androidx.loader.a.e */
/* loaded from: classes.dex */
public final class C0751e<D> implements InterfaceC0743w<D> {

    /* renamed from: a */
    private final C0754a<D> f3105a;

    /* renamed from: b */
    private final InterfaceC0748b<D> f3106b;

    /* renamed from: c */
    private boolean f3107c;

    @Override // androidx.lifecycle.InterfaceC0743w
    /* renamed from: a */
    public final void mo2637a(D d) {
        if (C0749c.f3096a) {
            Log.v("LoaderManager", "  onLoadFinished in " + this.f3105a + ": " + C0754a.m2652a(d));
        }
        this.f3107c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2647a() {
        if (this.f3107c && C0749c.f3096a) {
            Log.v("LoaderManager", "  Resetting: " + this.f3105a);
        }
    }

    public final String toString() {
        return this.f3106b.toString();
    }

    /* renamed from: a */
    public final void m2648a(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mDeliveredData=");
        printWriter.println(this.f3107c);
    }
}
