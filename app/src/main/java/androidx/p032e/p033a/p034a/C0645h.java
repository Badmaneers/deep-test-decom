package androidx.p032e.p033a.p034a;

import android.database.sqlite.SQLiteStatement;
import androidx.p032e.p033a.InterfaceC0654j;

/* compiled from: FrameworkSQLiteStatement.java */
/* renamed from: androidx.e.a.a.h */
/* loaded from: classes.dex */
final class C0645h extends C0644g implements InterfaceC0654j {

    /* renamed from: a */
    private final SQLiteStatement f2710a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0645h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2710a = sQLiteStatement;
    }

    @Override // androidx.p032e.p033a.InterfaceC0654j
    /* renamed from: a */
    public final int mo2231a() {
        return this.f2710a.executeUpdateDelete();
    }

    @Override // androidx.p032e.p033a.InterfaceC0654j
    /* renamed from: b */
    public final long mo2232b() {
        return this.f2710a.executeInsert();
    }
}
