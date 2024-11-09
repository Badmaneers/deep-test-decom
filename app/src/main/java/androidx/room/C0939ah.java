package androidx.room;

import androidx.p032e.p033a.InterfaceC0652h;
import androidx.p032e.p033a.InterfaceC0653i;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery.java */
/* renamed from: androidx.room.ah */
/* loaded from: classes.dex */
public final class C0939ah implements InterfaceC0652h, InterfaceC0653i {

    /* renamed from: g */
    static final TreeMap<Integer, C0939ah> f3856g = new TreeMap<>();

    /* renamed from: f */
    int f3862f;

    /* renamed from: h */
    private volatile String f3863h;

    /* renamed from: e */
    final int f3861e = 4;

    /* renamed from: i */
    private final int[] f3864i = new int[5];

    /* renamed from: a */
    final long[] f3857a = new long[5];

    /* renamed from: b */
    final double[] f3858b = new double[5];

    /* renamed from: c */
    final String[] f3859c = new String[5];

    /* renamed from: d */
    final byte[][] f3860d = new byte[5];

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* renamed from: a */
    public static C0939ah m3362a(String str) {
        synchronized (f3856g) {
            Map.Entry<Integer, C0939ah> ceilingEntry = f3856g.ceilingEntry(4);
            if (ceilingEntry != null) {
                f3856g.remove(ceilingEntry.getKey());
                C0939ah value = ceilingEntry.getValue();
                value.m3363b(str);
                return value;
            }
            C0939ah c0939ah = new C0939ah();
            c0939ah.m3363b(str);
            return c0939ah;
        }
    }

    private C0939ah() {
    }

    /* renamed from: b */
    private void m3363b(String str) {
        this.f3863h = str;
        this.f3862f = 4;
    }

    /* renamed from: a */
    public final void m3364a() {
        synchronized (f3856g) {
            f3856g.put(Integer.valueOf(this.f3861e), this);
            if (f3856g.size() > 15) {
                int size = f3856g.size() - 10;
                Iterator<Integer> it = f3856g.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // androidx.p032e.p033a.InterfaceC0653i
    /* renamed from: b */
    public final String mo2206b() {
        return this.f3863h;
    }

    @Override // androidx.p032e.p033a.InterfaceC0653i
    /* renamed from: a */
    public final void mo2205a(InterfaceC0652h interfaceC0652h) {
        for (int i = 1; i <= this.f3862f; i++) {
            switch (this.f3864i[i]) {
                case 1:
                    interfaceC0652h.mo2226a(i);
                    break;
                case 2:
                    interfaceC0652h.mo2228a(i, this.f3857a[i]);
                    break;
                case 3:
                    interfaceC0652h.mo2227a(i, this.f3858b[i]);
                    break;
                case 4:
                    interfaceC0652h.mo2229a(i, this.f3859c[i]);
                    break;
                case 5:
                    interfaceC0652h.mo2230a(i, this.f3860d[i]);
                    break;
            }
        }
    }

    @Override // androidx.p032e.p033a.InterfaceC0652h
    /* renamed from: a */
    public final void mo2226a(int i) {
        this.f3864i[i] = 1;
    }

    @Override // androidx.p032e.p033a.InterfaceC0652h
    /* renamed from: a */
    public final void mo2228a(int i, long j) {
        this.f3864i[i] = 2;
        this.f3857a[i] = j;
    }

    @Override // androidx.p032e.p033a.InterfaceC0652h
    /* renamed from: a */
    public final void mo2227a(int i, double d) {
        this.f3864i[i] = 3;
        this.f3858b[i] = d;
    }

    @Override // androidx.p032e.p033a.InterfaceC0652h
    /* renamed from: a */
    public final void mo2229a(int i, String str) {
        this.f3864i[i] = 4;
        this.f3859c[i] = str;
    }

    @Override // androidx.p032e.p033a.InterfaceC0652h
    /* renamed from: a */
    public final void mo2230a(int i, byte[] bArr) {
        this.f3864i[i] = 5;
        this.f3860d[i] = bArr;
    }
}
