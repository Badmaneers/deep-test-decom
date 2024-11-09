package androidx.p011b;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: LruCache.java */
/* renamed from: androidx.b.g */
/* loaded from: classes.dex */
public class C0324g<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f1481a;

    /* renamed from: b */
    private int f1482b;

    /* renamed from: c */
    private int f1483c;

    /* renamed from: d */
    private int f1484d;

    /* renamed from: e */
    private int f1485e;

    /* renamed from: f */
    private int f1486f;

    /* renamed from: g */
    private int f1487g;

    public C0324g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1483c = i;
        this.f1481a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: a */
    public final V m1045a(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f1481a.get(k);
            if (v != null) {
                this.f1486f++;
                return v;
            }
            this.f1487g++;
            return null;
        }
    }

    /* renamed from: a */
    public final V m1046a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1484d++;
            this.f1482b++;
            put = this.f1481a.put(k, v);
            if (put != null) {
                this.f1482b--;
            }
        }
        m1044a(this.f1483c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:            throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1044a(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f1482b     // Catch: java.lang.Throwable -> L69
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<K, V> r0 = r2.f1481a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L11
            int r0 = r2.f1482b     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.f1482b     // Catch: java.lang.Throwable -> L69
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<K, V> r0 = r2.f1481a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r2.f1481a     // Catch: java.lang.Throwable -> L69
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L69
            r0.getValue()     // Catch: java.lang.Throwable -> L69
            java.util.LinkedHashMap<K, V> r0 = r2.f1481a     // Catch: java.lang.Throwable -> L69
            r0.remove(r1)     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f1482b     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + (-1)
            r2.f1482b = r0     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f1485e     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + 1
            r2.f1485e = r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L0
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            return
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L69
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L69
        L69:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p011b.C0324g.m1044a(int):void");
    }

    public final synchronized String toString() {
        int i;
        i = this.f1486f + this.f1487g;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1483c), Integer.valueOf(this.f1486f), Integer.valueOf(this.f1487g), Integer.valueOf(i != 0 ? (this.f1486f * 100) / i : 0));
    }
}
