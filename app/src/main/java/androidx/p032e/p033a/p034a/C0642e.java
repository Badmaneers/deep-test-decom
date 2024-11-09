package androidx.p032e.p033a.p034a;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import androidx.p032e.p033a.AbstractC0648d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FrameworkSQLiteOpenHelper.java */
/* renamed from: androidx.e.a.a.e */
/* loaded from: classes.dex */
public final class C0642e implements DatabaseErrorHandler {

    /* renamed from: a */
    final /* synthetic */ AbstractC0648d f2707a;

    /* renamed from: b */
    final /* synthetic */ C0638a[] f2708b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0642e(AbstractC0648d abstractC0648d, C0638a[] c0638aArr) {
        this.f2707a = abstractC0648d;
        this.f2708b = c0638aArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        AbstractC0648d.m2234c(C0641d.m2223a(this.f2708b, sQLiteDatabase));
    }
}
