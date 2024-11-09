package androidx.p032e.p033a.p034a;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.p032e.p033a.InterfaceC0653i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FrameworkSQLiteDatabase.java */
/* renamed from: androidx.e.a.a.b */
/* loaded from: classes.dex */
public final class C0639b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0653i f2701a;

    /* renamed from: b */
    final /* synthetic */ C0638a f2702b;

    public C0639b(C0638a c0638a, InterfaceC0653i interfaceC0653i) {
        this.f2702b = c0638a;
        this.f2701a = interfaceC0653i;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f2701a.mo2205a(new C0644g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
