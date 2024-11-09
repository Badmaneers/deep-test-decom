package androidx.p032e.p033a.p034a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import androidx.p032e.p033a.C0637a;
import androidx.p032e.p033a.InterfaceC0646b;
import androidx.p032e.p033a.InterfaceC0653i;
import androidx.p032e.p033a.InterfaceC0654j;
import com.coloros.neton.BuildConfig;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FrameworkSQLiteDatabase.java */
/* renamed from: androidx.e.a.a.a */
/* loaded from: classes.dex */
public final class C0638a implements InterfaceC0646b {

    /* renamed from: a */
    private static final String[] f2698a = {BuildConfig.FLAVOR, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: b */
    private static final String[] f2699b = new String[0];

    /* renamed from: c */
    private final SQLiteDatabase f2700c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0638a(SQLiteDatabase sQLiteDatabase) {
        this.f2700c = sQLiteDatabase;
    }

    @Override // androidx.p032e.p033a.InterfaceC0646b
    /* renamed from: a */
    public final InterfaceC0654j mo2208a(String str) {
        return new C0645h(this.f2700c.compileStatement(str));
    }

    @Override // androidx.p032e.p033a.InterfaceC0646b
    /* renamed from: a */
    public final void mo2209a() {
        this.f2700c.beginTransaction();
    }

    @Override // androidx.p032e.p033a.InterfaceC0646b
    /* renamed from: b */
    public final void mo2212b() {
        this.f2700c.endTransaction();
    }

    @Override // androidx.p032e.p033a.InterfaceC0646b
    /* renamed from: c */
    public final void mo2213c() {
        this.f2700c.setTransactionSuccessful();
    }

    @Override // androidx.p032e.p033a.InterfaceC0646b
    /* renamed from: d */
    public final boolean mo2215d() {
        return this.f2700c.inTransaction();
    }

    @Override // androidx.p032e.p033a.InterfaceC0646b
    /* renamed from: b */
    public final Cursor mo2211b(String str) {
        return mo2207a(new C0637a(str, (byte) 0));
    }

    @Override // androidx.p032e.p033a.InterfaceC0646b
    /* renamed from: a */
    public final Cursor mo2207a(InterfaceC0653i interfaceC0653i) {
        return this.f2700c.rawQueryWithFactory(new C0639b(this, interfaceC0653i), interfaceC0653i.mo2206b(), f2699b, null);
    }

    @Override // androidx.p032e.p033a.InterfaceC0646b
    /* renamed from: c */
    public final void mo2214c(String str) {
        this.f2700c.execSQL(str);
    }

    @Override // androidx.p032e.p033a.InterfaceC0646b
    /* renamed from: e */
    public final boolean mo2216e() {
        return this.f2700c.isOpen();
    }

    @Override // androidx.p032e.p033a.InterfaceC0646b
    /* renamed from: f */
    public final String mo2217f() {
        return this.f2700c.getPath();
    }

    @Override // androidx.p032e.p033a.InterfaceC0646b
    /* renamed from: g */
    public final List<Pair<String, String>> mo2218g() {
        return this.f2700c.getAttachedDbs();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2700c.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m2210a(SQLiteDatabase sQLiteDatabase) {
        return this.f2700c == sQLiteDatabase;
    }
}
