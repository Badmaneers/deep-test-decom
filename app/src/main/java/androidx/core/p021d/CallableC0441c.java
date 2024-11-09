package androidx.core.p021d;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontsContractCompat.java */
/* renamed from: androidx.core.d.c */
/* loaded from: classes.dex */
public final class CallableC0441c implements Callable<C0447i> {

    /* renamed from: a */
    final /* synthetic */ Context f2188a;

    /* renamed from: b */
    final /* synthetic */ C0439a f2189b;

    /* renamed from: c */
    final /* synthetic */ int f2190c;

    /* renamed from: d */
    final /* synthetic */ String f2191d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC0441c(Context context, C0439a c0439a, int i, String str) {
        this.f2188a = context;
        this.f2189b = c0439a;
        this.f2190c = i;
        this.f2191d = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C0447i call() {
        C0447i m1560a = C0440b.m1560a(this.f2188a, this.f2189b, this.f2190c);
        if (m1560a.f2202a != null) {
            C0440b.f2183a.m1046a(this.f2191d, m1560a.f2202a);
        }
        return m1560a;
    }
}
