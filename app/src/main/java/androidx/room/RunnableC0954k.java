package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.p032e.p033a.C0637a;
import androidx.p032e.p033a.InterfaceC0646b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InvalidationTracker.java */
/* renamed from: androidx.room.k */
/* loaded from: classes.dex */
public final class RunnableC0954k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0953j f3900a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0954k(C0953j c0953j) {
        this.f3900a = c0953j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.room.n] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r3;
        Throwable th;
        Set<Integer> m3390a;
        Lock m3403a = this.f3900a.f3890c.m3403a();
        try {
            try {
                m3403a.lock();
            } finally {
                m3403a.unlock();
            }
        } catch (SQLiteException | IllegalStateException e) {
            e = e;
            r3 = 0;
        }
        if (this.f3900a.m3387a()) {
            r3 = 1;
            if (this.f3900a.f3891d.compareAndSet(true, false)) {
                if (this.f3900a.f3890c.m3416k()) {
                    return;
                }
                if (this.f3900a.f3890c.f3935b) {
                    try {
                        InterfaceC0646b mo2221b = this.f3900a.f3890c.m3406b().mo2221b();
                        mo2221b.mo2209a();
                        try {
                            m3390a = m3390a();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            mo2221b.mo2213c();
                            mo2221b.mo2212b();
                            r3 = m3390a;
                        } catch (Throwable th3) {
                            th = th3;
                            mo2221b.mo2212b();
                            throw th;
                        }
                    } catch (SQLiteException | IllegalStateException e2) {
                        e = e2;
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                        if (r3 != 0) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    r3 = m3390a();
                }
                if (r3 != 0 || r3.isEmpty()) {
                    return;
                }
                synchronized (this.f3900a.f3893f) {
                    Iterator<Map.Entry<AbstractC0956m, C0957n>> it = this.f3900a.f3893f.iterator();
                    while (it.hasNext()) {
                        it.next().getValue().m3397a((Set<Integer>) r3);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private Set<Integer> m3390a() {
        HashSet hashSet = new HashSet();
        Cursor m3401a = this.f3900a.f3890c.m3401a(new C0637a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", (byte) 0));
        while (m3401a.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(m3401a.getInt(0)));
            } catch (Throwable th) {
                m3401a.close();
                throw th;
            }
        }
        m3401a.close();
        if (!hashSet.isEmpty()) {
            this.f3900a.f3892e.mo2231a();
        }
        return hashSet;
    }
}
