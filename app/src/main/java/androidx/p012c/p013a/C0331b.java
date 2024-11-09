package androidx.p012c.p013a;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CursorAdapter.java */
/* renamed from: androidx.c.a.b */
/* loaded from: classes.dex */
public final class C0331b extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ AbstractC0330a f1524a;

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0331b(AbstractC0330a abstractC0330a) {
        super(new Handler());
        this.f1524a = abstractC0330a;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f1524a.m1079b();
    }
}
