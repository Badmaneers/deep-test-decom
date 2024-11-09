package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.p002a.p003a.p005b.C0043b;
import androidx.p032e.p033a.InterfaceC0646b;
import androidx.p032e.p033a.InterfaceC0654j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import neton.internal.http.HttpMethod;

/* compiled from: InvalidationTracker.java */
/* renamed from: androidx.room.j */
/* loaded from: classes.dex */
public final class C0953j {

    /* renamed from: h */
    private static final String[] f3887h = {"UPDATE", HttpMethod.DELETE, "INSERT"};

    /* renamed from: c */
    final AbstractC0969z f3890c;

    /* renamed from: e */
    volatile InterfaceC0654j f3892e;

    /* renamed from: i */
    private Map<String, Set<String>> f3895i;

    /* renamed from: l */
    private final C0952i f3898l;

    /* renamed from: m */
    private C0958o f3899m;

    /* renamed from: d */
    AtomicBoolean f3891d = new AtomicBoolean(false);

    /* renamed from: j */
    private volatile boolean f3896j = false;

    /* renamed from: f */
    @SuppressLint({"RestrictedApi"})
    final C0043b<AbstractC0956m, C0957n> f3893f = new C0043b<>();

    /* renamed from: g */
    Runnable f3894g = new RunnableC0954k(this);

    /* renamed from: k */
    private C0955l f3897k = new C0955l();

    /* renamed from: a */
    final HashMap<String, Integer> f3888a = new HashMap<>();

    /* renamed from: b */
    final String[] f3889b = new String[1];

    public C0953j(AbstractC0969z abstractC0969z, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f3890c = abstractC0969z;
        this.f3895i = map2;
        this.f3898l = new C0952i(this.f3890c);
        for (int i = 0; i <= 0; i++) {
            String lowerCase = strArr[0].toLowerCase(Locale.US);
            this.f3888a.put(lowerCase, 0);
            String str = map.get(strArr[0]);
            if (str != null) {
                this.f3889b[0] = str.toLowerCase(Locale.US);
            } else {
                this.f3889b[0] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String lowerCase2 = entry.getValue().toLowerCase(Locale.US);
            if (this.f3888a.containsKey(lowerCase2)) {
                this.f3888a.put(entry.getKey().toLowerCase(Locale.US), this.f3888a.get(lowerCase2));
            }
        }
    }

    /* renamed from: a */
    public final void m3385a(InterfaceC0646b interfaceC0646b) {
        synchronized (this) {
            if (this.f3896j) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            interfaceC0646b.mo2214c("PRAGMA temp_store = MEMORY;");
            interfaceC0646b.mo2214c("PRAGMA recursive_triggers='ON';");
            interfaceC0646b.mo2214c("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m3388b(interfaceC0646b);
            this.f3892e = interfaceC0646b.mo2208a("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f3896j = true;
        }
    }

    /* renamed from: a */
    public final void m3384a(Context context, String str) {
        this.f3899m = new C0958o(context, str, this, this.f3890c.m3414i());
    }

    /* renamed from: a */
    private static void m3381a(StringBuilder sb, String str, String str2) {
        sb.append("`room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: a */
    private void m3380a(InterfaceC0646b interfaceC0646b, int i) {
        String str = this.f3889b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f3887h) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m3381a(sb, str, str2);
            interfaceC0646b.mo2214c(sb.toString());
        }
    }

    /* renamed from: b */
    private void m3383b(InterfaceC0646b interfaceC0646b, int i) {
        interfaceC0646b.mo2214c("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f3889b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f3887h) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m3381a(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb.append(i);
            sb.append(" AND invalidated = 0; END");
            interfaceC0646b.mo2214c(sb.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public final void m3386a(AbstractC0956m abstractC0956m) {
        C0957n mo16a;
        String[] strArr = abstractC0956m.f3906a;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f3895i.containsKey(lowerCase)) {
                hashSet.addAll(this.f3895i.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        String[] strArr2 = (String[]) hashSet.toArray(new String[hashSet.size()]);
        int[] iArr = new int[strArr2.length];
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.f3888a.get(strArr2[i].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArr2[i]);
            }
            iArr[i] = num.intValue();
        }
        C0957n c0957n = new C0957n(abstractC0956m, iArr, strArr2);
        synchronized (this.f3893f) {
            mo16a = this.f3893f.mo16a(abstractC0956m, c0957n);
        }
        if (mo16a == null && this.f3897k.m3391a(iArr)) {
            m3382b();
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    public final void m3389b(AbstractC0956m abstractC0956m) {
        C0957n mo17b;
        synchronized (this.f3893f) {
            mo17b = this.f3893f.mo17b(abstractC0956m);
        }
        if (mo17b == null || !this.f3897k.m3394b(mo17b.f3907a)) {
            return;
        }
        m3382b();
    }

    /* renamed from: a */
    public final boolean m3387a() {
        if (!this.f3890c.m3409d()) {
            return false;
        }
        if (!this.f3896j) {
            this.f3890c.m3406b().mo2221b();
        }
        if (this.f3896j) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: b */
    public final void m3388b(InterfaceC0646b interfaceC0646b) {
        if (interfaceC0646b.mo2215d()) {
            return;
        }
        while (true) {
            try {
                Lock m3403a = this.f3890c.m3403a();
                m3403a.lock();
                try {
                    int[] m3392a = this.f3897k.m3392a();
                    if (m3392a == null) {
                        return;
                    }
                    int length = m3392a.length;
                    interfaceC0646b.mo2209a();
                    for (int i = 0; i < length; i++) {
                        try {
                            switch (m3392a[i]) {
                                case 1:
                                    m3383b(interfaceC0646b, i);
                                    break;
                                case 2:
                                    m3380a(interfaceC0646b, i);
                                    break;
                            }
                        } finally {
                        }
                    }
                    interfaceC0646b.mo2213c();
                    interfaceC0646b.mo2212b();
                    this.f3897k.m3393b();
                } finally {
                    m3403a.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }

    /* renamed from: b */
    private void m3382b() {
        if (this.f3890c.m3409d()) {
            m3388b(this.f3890c.m3406b().mo2221b());
        }
    }
}
