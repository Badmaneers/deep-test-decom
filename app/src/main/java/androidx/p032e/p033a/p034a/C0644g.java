package androidx.p032e.p033a.p034a;

import android.database.sqlite.SQLiteProgram;
import androidx.p032e.p033a.InterfaceC0652h;

/* compiled from: FrameworkSQLiteProgram.java */
/* renamed from: androidx.e.a.a.g */
/* loaded from: classes.dex */
class C0644g implements InterfaceC0652h {

    /* renamed from: a */
    private final SQLiteProgram f2709a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0644g(SQLiteProgram sQLiteProgram) {
        this.f2709a = sQLiteProgram;
    }

    @Override // androidx.p032e.p033a.InterfaceC0652h
    /* renamed from: a */
    public final void mo2226a(int i) {
        this.f2709a.bindNull(i);
    }

    @Override // androidx.p032e.p033a.InterfaceC0652h
    /* renamed from: a */
    public final void mo2228a(int i, long j) {
        this.f2709a.bindLong(i, j);
    }

    @Override // androidx.p032e.p033a.InterfaceC0652h
    /* renamed from: a */
    public final void mo2227a(int i, double d) {
        this.f2709a.bindDouble(i, d);
    }

    @Override // androidx.p032e.p033a.InterfaceC0652h
    /* renamed from: a */
    public final void mo2229a(int i, String str) {
        this.f2709a.bindString(i, str);
    }

    @Override // androidx.p032e.p033a.InterfaceC0652h
    /* renamed from: a */
    public final void mo2230a(int i, byte[] bArr) {
        this.f2709a.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2709a.close();
    }
}
