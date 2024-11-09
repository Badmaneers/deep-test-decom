package androidx.p032e.p033a.p034a;

import android.content.Context;
import androidx.p032e.p033a.AbstractC0648d;
import androidx.p032e.p033a.InterfaceC0646b;
import androidx.p032e.p033a.InterfaceC0647c;

/* compiled from: FrameworkSQLiteOpenHelper.java */
/* renamed from: androidx.e.a.a.c */
/* loaded from: classes.dex */
final class C0640c implements InterfaceC0647c {

    /* renamed from: a */
    private final C0641d f2703a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0640c(Context context, String str, AbstractC0648d abstractC0648d) {
        this.f2703a = new C0641d(context, str, new C0638a[1], abstractC0648d);
    }

    @Override // androidx.p032e.p033a.InterfaceC0647c
    /* renamed from: a */
    public final String mo2219a() {
        return this.f2703a.getDatabaseName();
    }

    @Override // androidx.p032e.p033a.InterfaceC0647c
    /* renamed from: a */
    public final void mo2220a(boolean z) {
        this.f2703a.setWriteAheadLoggingEnabled(z);
    }

    @Override // androidx.p032e.p033a.InterfaceC0647c
    /* renamed from: b */
    public final InterfaceC0646b mo2221b() {
        return this.f2703a.m2224a();
    }
}
