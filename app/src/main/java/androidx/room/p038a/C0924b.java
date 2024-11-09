package androidx.room.p038a;

import android.database.Cursor;

/* compiled from: CursorUtil.java */
/* renamed from: androidx.room.a.b */
/* loaded from: classes.dex */
public final class C0924b {
    /* renamed from: a */
    public static int m3337a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }
}
