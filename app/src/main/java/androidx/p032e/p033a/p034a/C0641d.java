package androidx.p032e.p033a.p034a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.p032e.p033a.AbstractC0648d;
import androidx.p032e.p033a.InterfaceC0646b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FrameworkSQLiteOpenHelper.java */
/* renamed from: androidx.e.a.a.d */
/* loaded from: classes.dex */
public final class C0641d extends SQLiteOpenHelper {

    /* renamed from: a */
    final C0638a[] f2704a;

    /* renamed from: b */
    final AbstractC0648d f2705b;

    /* renamed from: c */
    private boolean f2706c;

    public C0641d(Context context, String str, C0638a[] c0638aArr, AbstractC0648d abstractC0648d) {
        super(context, str, null, abstractC0648d.f2711a, new C0642e(abstractC0648d, c0638aArr));
        this.f2705b = abstractC0648d;
        this.f2704a = c0638aArr;
    }

    /* renamed from: a */
    public final synchronized InterfaceC0646b m2224a() {
        this.f2706c = false;
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (this.f2706c) {
            close();
            return m2224a();
        }
        return m2222a(writableDatabase);
    }

    /* renamed from: a */
    private C0638a m2222a(SQLiteDatabase sQLiteDatabase) {
        return m2223a(this.f2704a, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f2705b.mo2235a(m2222a(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f2706c = true;
        this.f2705b.mo2236a(m2222a(sQLiteDatabase), i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        m2222a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f2706c = true;
        this.f2705b.mo2238b(m2222a(sQLiteDatabase), i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f2706c) {
            return;
        }
        this.f2705b.mo2237b(m2222a(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f2704a[0] = null;
    }

    /* renamed from: a */
    public static C0638a m2223a(C0638a[] c0638aArr, SQLiteDatabase sQLiteDatabase) {
        C0638a c0638a = c0638aArr[0];
        if (c0638a == null || !c0638a.m2210a(sQLiteDatabase)) {
            c0638aArr[0] = new C0638a(sQLiteDatabase);
        }
        return c0638aArr[0];
    }
}
