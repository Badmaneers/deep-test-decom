package androidx.p011b;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* renamed from: androidx.b.n */
/* loaded from: classes.dex */
public class C0328n<K, V> {

    /* renamed from: b */
    static Object[] f1503b;

    /* renamed from: c */
    static int f1504c;

    /* renamed from: d */
    static Object[] f1505d;

    /* renamed from: e */
    static int f1506e;

    /* renamed from: f */
    int[] f1507f;

    /* renamed from: g */
    Object[] f1508g;

    /* renamed from: h */
    int f1509h;

    /* renamed from: a */
    private static int m1054a(int[] iArr, int i, int i2) {
        try {
            return C0322e.m1025a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private int m1053a(Object obj, int i) {
        int i2 = this.f1509h;
        if (i2 == 0) {
            return -1;
        }
        int m1054a = m1054a(this.f1507f, i2, i);
        if (m1054a < 0 || obj.equals(this.f1508g[m1054a << 1])) {
            return m1054a;
        }
        int i3 = m1054a + 1;
        while (i3 < i2 && this.f1507f[i3] == i) {
            if (obj.equals(this.f1508g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m1054a - 1; i4 >= 0 && this.f1507f[i4] == i; i4--) {
            if (obj.equals(this.f1508g[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: a */
    private int m1052a() {
        int i = this.f1509h;
        if (i == 0) {
            return -1;
        }
        int m1054a = m1054a(this.f1507f, i, 0);
        if (m1054a < 0 || this.f1508g[m1054a << 1] == null) {
            return m1054a;
        }
        int i2 = m1054a + 1;
        while (i2 < i && this.f1507f[i2] == 0) {
            if (this.f1508g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m1054a - 1; i3 >= 0 && this.f1507f[i3] == 0; i3--) {
            if (this.f1508g[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* renamed from: e */
    private void m1056e(int i) {
        if (i == 8) {
            synchronized (C0328n.class) {
                if (f1505d != null) {
                    Object[] objArr = f1505d;
                    this.f1508g = objArr;
                    f1505d = (Object[]) objArr[0];
                    this.f1507f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1506e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0328n.class) {
                if (f1503b != null) {
                    Object[] objArr2 = f1503b;
                    this.f1508g = objArr2;
                    f1503b = (Object[]) objArr2[0];
                    this.f1507f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1504c--;
                    return;
                }
            }
        }
        this.f1507f = new int[i];
        this.f1508g = new Object[i << 1];
    }

    /* renamed from: a */
    private static void m1055a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0328n.class) {
                if (f1506e < 10) {
                    objArr[0] = f1505d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1505d = objArr;
                    f1506e++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0328n.class) {
                if (f1504c < 10) {
                    objArr[0] = f1503b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1503b = objArr;
                    f1504c++;
                }
            }
        }
    }

    public C0328n() {
        this.f1507f = C0322e.f1473a;
        this.f1508g = C0322e.f1475c;
        this.f1509h = 0;
    }

    public C0328n(int i) {
        if (i == 0) {
            this.f1507f = C0322e.f1473a;
            this.f1508g = C0322e.f1475c;
        } else {
            m1056e(i);
        }
        this.f1509h = 0;
    }

    public C0328n(C0328n<K, V> c0328n) {
        this();
        if (c0328n != null) {
            int i = c0328n.f1509h;
            m1059a(this.f1509h + i);
            if (this.f1509h != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(c0328n.m1061b(i2), c0328n.m1062c(i2));
                }
            } else if (i > 0) {
                System.arraycopy(c0328n.f1507f, 0, this.f1507f, 0, i);
                System.arraycopy(c0328n.f1508g, 0, this.f1508g, 0, i << 1);
                this.f1509h = i;
            }
        }
    }

    public void clear() {
        if (this.f1509h > 0) {
            int[] iArr = this.f1507f;
            Object[] objArr = this.f1508g;
            int i = this.f1509h;
            this.f1507f = C0322e.f1473a;
            this.f1508g = C0322e.f1475c;
            this.f1509h = 0;
            m1055a(iArr, objArr, i);
        }
        if (this.f1509h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public final void m1059a(int i) {
        int i2 = this.f1509h;
        if (this.f1507f.length < i) {
            int[] iArr = this.f1507f;
            Object[] objArr = this.f1508g;
            m1056e(i);
            if (this.f1509h > 0) {
                System.arraycopy(iArr, 0, this.f1507f, 0, i2);
                System.arraycopy(objArr, 0, this.f1508g, 0, i2 << 1);
            }
            m1055a(iArr, objArr, i2);
        }
        if (this.f1509h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m1057a(obj) >= 0;
    }

    /* renamed from: a */
    public final int m1057a(Object obj) {
        return obj == null ? m1052a() : m1053a(obj, obj.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m1060b(Object obj) {
        int i = this.f1509h * 2;
        Object[] objArr = this.f1508g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return m1060b(obj) >= 0;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int m1057a = m1057a(obj);
        return m1057a >= 0 ? (V) this.f1508g[(m1057a << 1) + 1] : v;
    }

    /* renamed from: b */
    public final K m1061b(int i) {
        return (K) this.f1508g[i << 1];
    }

    /* renamed from: c */
    public final V m1062c(int i) {
        return (V) this.f1508g[(i << 1) + 1];
    }

    /* renamed from: a */
    public final V m1058a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = (V) this.f1508g[i2];
        this.f1508g[i2] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.f1509h <= 0;
    }

    public V put(K k, V v) {
        int i;
        int m1053a;
        int i2 = this.f1509h;
        if (k == null) {
            m1053a = m1052a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m1053a = m1053a(k, hashCode);
        }
        if (m1053a >= 0) {
            int i3 = (m1053a << 1) + 1;
            V v2 = (V) this.f1508g[i3];
            this.f1508g[i3] = v;
            return v2;
        }
        int i4 = ~m1053a;
        if (i2 >= this.f1507f.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f1507f;
            Object[] objArr = this.f1508g;
            m1056e(i5);
            if (i2 != this.f1509h) {
                throw new ConcurrentModificationException();
            }
            if (this.f1507f.length > 0) {
                System.arraycopy(iArr, 0, this.f1507f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1508g, 0, objArr.length);
            }
            m1055a(iArr, objArr, i2);
        }
        if (i4 < i2) {
            int[] iArr2 = this.f1507f;
            int i6 = i4 + 1;
            System.arraycopy(iArr2, i4, iArr2, i6, i2 - i4);
            System.arraycopy(this.f1508g, i4 << 1, this.f1508g, i6 << 1, (this.f1509h - i4) << 1);
        }
        if (i2 != this.f1509h || i4 >= this.f1507f.length) {
            throw new ConcurrentModificationException();
        }
        this.f1507f[i4] = i;
        int i7 = i4 << 1;
        this.f1508g[i7] = k;
        this.f1508g[i7 + 1] = v;
        this.f1509h++;
        return null;
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int m1057a = m1057a(obj);
        if (m1057a >= 0) {
            return m1063d(m1057a);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int m1057a = m1057a(obj);
        if (m1057a < 0) {
            return false;
        }
        V m1062c = m1062c(m1057a);
        if (obj2 != m1062c && (obj2 == null || !obj2.equals(m1062c))) {
            return false;
        }
        m1063d(m1057a);
        return true;
    }

    /* renamed from: d */
    public final V m1063d(int i) {
        int i2 = i << 1;
        V v = (V) this.f1508g[i2 + 1];
        int i3 = this.f1509h;
        int i4 = 0;
        if (i3 <= 1) {
            m1055a(this.f1507f, this.f1508g, i3);
            this.f1507f = C0322e.f1473a;
            this.f1508g = C0322e.f1475c;
        } else {
            int i5 = i3 - 1;
            if (this.f1507f.length > 8 && this.f1509h < this.f1507f.length / 3) {
                int i6 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr = this.f1507f;
                Object[] objArr = this.f1508g;
                m1056e(i6);
                if (i3 != this.f1509h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1507f, 0, i);
                    System.arraycopy(objArr, 0, this.f1508g, 0, i2);
                }
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, this.f1507f, i, i8);
                    System.arraycopy(objArr, i7 << 1, this.f1508g, i2, i8 << 1);
                }
            } else {
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(this.f1507f, i9, this.f1507f, i, i10);
                    System.arraycopy(this.f1508g, i9 << 1, this.f1508g, i2, i10 << 1);
                }
                int i11 = i5 << 1;
                this.f1508g[i11] = null;
                this.f1508g[i11 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 != this.f1509h) {
            throw new ConcurrentModificationException();
        }
        this.f1509h = i4;
        return v;
    }

    public V replace(K k, V v) {
        int m1057a = m1057a(k);
        if (m1057a >= 0) {
            return m1058a(m1057a, (int) v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int m1057a = m1057a(k);
        if (m1057a < 0) {
            return false;
        }
        V m1062c = m1062c(m1057a);
        if (m1062c != v && (v == null || !v.equals(m1062c))) {
            return false;
        }
        m1058a(m1057a, (int) v2);
        return true;
    }

    public int size() {
        return this.f1509h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0328n) {
            C0328n c0328n = (C0328n) obj;
            if (size() != c0328n.size()) {
                return false;
            }
            for (int i = 0; i < this.f1509h; i++) {
                try {
                    K m1061b = m1061b(i);
                    V m1062c = m1062c(i);
                    Object obj2 = c0328n.get(m1061b);
                    if (m1062c == null) {
                        if (obj2 != null || !c0328n.containsKey(m1061b)) {
                            return false;
                        }
                    } else if (!m1062c.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException unused) {
                    return false;
                } catch (NullPointerException unused2) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1509h; i2++) {
            try {
                K m1061b2 = m1061b(i2);
                V m1062c2 = m1062c(i2);
                Object obj3 = map.get(m1061b2);
                if (m1062c2 == null) {
                    if (obj3 != null || !map.containsKey(m1061b2)) {
                        return false;
                    }
                } else if (!m1062c2.equals(obj3)) {
                    return false;
                }
            } catch (ClassCastException unused3) {
                return false;
            } catch (NullPointerException unused4) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.f1507f;
        Object[] objArr = this.f1508g;
        int i = this.f1509h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1509h * 28);
        sb.append('{');
        for (int i = 0; i < this.f1509h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m1061b = m1061b(i);
            if (m1061b != this) {
                sb.append(m1061b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m1062c = m1062c(i);
            if (m1062c != this) {
                sb.append(m1062c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
