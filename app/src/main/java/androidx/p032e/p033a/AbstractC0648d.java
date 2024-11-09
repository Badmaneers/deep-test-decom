package androidx.p032e.p033a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: SupportSQLiteOpenHelper.java */
/* renamed from: androidx.e.a.d */
/* loaded from: classes.dex */
public abstract class AbstractC0648d {

    /* renamed from: a */
    public final int f2711a;

    /* renamed from: a */
    public abstract void mo2235a(InterfaceC0646b interfaceC0646b);

    /* renamed from: a */
    public abstract void mo2236a(InterfaceC0646b interfaceC0646b, int i, int i2);

    /* renamed from: b */
    public void mo2237b(InterfaceC0646b interfaceC0646b) {
    }

    public AbstractC0648d(int i) {
        this.f2711a = i;
    }

    /* renamed from: b */
    public void mo2238b(InterfaceC0646b interfaceC0646b, int i, int i2) {
        throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
    }

    /* renamed from: c */
    public static void m2234c(InterfaceC0646b interfaceC0646b) {
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + interfaceC0646b.mo2217f());
        if (!interfaceC0646b.mo2216e()) {
            m2233a(interfaceC0646b.mo2217f());
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = interfaceC0646b.mo2218g();
            } catch (SQLiteException unused) {
            }
            try {
                interfaceC0646b.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    m2233a((String) it.next().second);
                }
            } else {
                m2233a(interfaceC0646b.mo2217f());
            }
        }
    }

    /* renamed from: a */
    private static void m2233a(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(String.valueOf(str)));
        try {
            if (Build.VERSION.SDK_INT >= 16) {
                SQLiteDatabase.deleteDatabase(new File(str));
                return;
            }
            try {
                if (new File(str).delete()) {
                    return;
                }
                Log.e("SupportSQLite", "Could not delete the database file ".concat(String.valueOf(str)));
            } catch (Exception e) {
                Log.e("SupportSQLite", "error while deleting corrupted database file", e);
            }
        } catch (Exception e2) {
            Log.w("SupportSQLite", "delete failed: ", e2);
        }
    }
}
