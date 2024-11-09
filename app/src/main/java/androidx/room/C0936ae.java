package androidx.room;

import android.database.Cursor;
import androidx.p032e.p033a.AbstractC0648d;
import androidx.p032e.p033a.C0637a;
import androidx.p032e.p033a.InterfaceC0646b;
import java.util.Iterator;
import java.util.List;

/* compiled from: RoomOpenHelper.java */
/* renamed from: androidx.room.ae */
/* loaded from: classes.dex */
public final class C0936ae extends AbstractC0648d {

    /* renamed from: b */
    private C0922a f3849b;

    /* renamed from: c */
    private final AbstractC0937af f3850c;

    /* renamed from: d */
    private final String f3851d;

    /* renamed from: e */
    private final String f3852e;

    public C0936ae(C0922a c0922a, AbstractC0937af abstractC0937af, String str, String str2) {
        super(abstractC0937af.f3853a);
        this.f3849b = c0922a;
        this.f3850c = abstractC0937af;
        this.f3851d = str;
        this.f3852e = str2;
    }

    @Override // androidx.p032e.p033a.AbstractC0648d
    /* renamed from: a */
    public final void mo2235a(InterfaceC0646b interfaceC0646b) {
        boolean m3355g = m3355g(interfaceC0646b);
        this.f3850c.mo3358b(interfaceC0646b);
        if (!m3355g) {
            C0938ag mo3360d = this.f3850c.mo3360d(interfaceC0646b);
            if (!mo3360d.f3854a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo3360d.f3855b);
            }
        }
        m3352d(interfaceC0646b);
        this.f3850c.mo3356a();
    }

    @Override // androidx.p032e.p033a.AbstractC0648d
    /* renamed from: a */
    public final void mo2236a(InterfaceC0646b interfaceC0646b, int i, int i2) {
        boolean z;
        List<Object> m3350a;
        if (this.f3849b == null || (m3350a = this.f3849b.f3787d.m3350a(i, i2)) == null) {
            z = false;
        } else {
            this.f3850c.mo3361e(interfaceC0646b);
            Iterator<Object> it = m3350a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            C0938ag mo3360d = this.f3850c.mo3360d(interfaceC0646b);
            if (!mo3360d.f3854a) {
                throw new IllegalStateException("Migration didn't properly handle: " + mo3360d.f3855b);
            }
            m3352d(interfaceC0646b);
            z = true;
        }
        if (z) {
            return;
        }
        if (this.f3849b != null && !this.f3849b.m3333a(i, i2)) {
            this.f3850c.mo3357a(interfaceC0646b);
            this.f3850c.mo3358b(interfaceC0646b);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    @Override // androidx.p032e.p033a.AbstractC0648d
    /* renamed from: b */
    public final void mo2238b(InterfaceC0646b interfaceC0646b, int i, int i2) {
        mo2236a(interfaceC0646b, i, i2);
    }

    @Override // androidx.p032e.p033a.AbstractC0648d
    /* renamed from: b */
    public final void mo2237b(InterfaceC0646b interfaceC0646b) {
        super.mo2237b(interfaceC0646b);
        if (m3354f(interfaceC0646b)) {
            Cursor mo2207a = interfaceC0646b.mo2207a(new C0637a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", (byte) 0));
            try {
                String string = mo2207a.moveToFirst() ? mo2207a.getString(0) : null;
                mo2207a.close();
                if (!this.f3851d.equals(string) && !this.f3852e.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                mo2207a.close();
                throw th;
            }
        } else {
            C0938ag mo3360d = this.f3850c.mo3360d(interfaceC0646b);
            if (!mo3360d.f3854a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo3360d.f3855b);
            }
            m3352d(interfaceC0646b);
        }
        this.f3850c.mo3359c(interfaceC0646b);
        this.f3849b = null;
    }

    /* renamed from: d */
    private void m3352d(InterfaceC0646b interfaceC0646b) {
        m3353e(interfaceC0646b);
        interfaceC0646b.mo2214c(C0935ad.m3351a(this.f3851d));
    }

    /* renamed from: e */
    private static void m3353e(InterfaceC0646b interfaceC0646b) {
        interfaceC0646b.mo2214c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: f */
    private static boolean m3354f(InterfaceC0646b interfaceC0646b) {
        Cursor mo2211b = interfaceC0646b.mo2211b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (mo2211b.moveToFirst()) {
                if (mo2211b.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            mo2211b.close();
        }
    }

    /* renamed from: g */
    private static boolean m3355g(InterfaceC0646b interfaceC0646b) {
        Cursor mo2211b = interfaceC0646b.mo2211b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (mo2211b.moveToFirst()) {
                if (mo2211b.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            mo2211b.close();
        }
    }
}
