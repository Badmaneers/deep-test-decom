package androidx.p011b;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ArraySet.java */
/* renamed from: androidx.b.c */
/* loaded from: classes.dex */
public final class C0320c<E> implements Collection<E>, Set<E> {

    /* renamed from: c */
    private static final int[] f1462c = new int[0];

    /* renamed from: d */
    private static final Object[] f1463d = new Object[0];

    /* renamed from: e */
    private static Object[] f1464e;

    /* renamed from: f */
    private static int f1465f;

    /* renamed from: g */
    private static Object[] f1466g;

    /* renamed from: h */
    private static int f1467h;

    /* renamed from: a */
    Object[] f1468a;

    /* renamed from: b */
    int f1469b;

    /* renamed from: i */
    private int[] f1470i;

    /* renamed from: j */
    private AbstractC0325h<E, E> f1471j;

    /* renamed from: a */
    private int m1018a(Object obj, int i) {
        int i2 = this.f1469b;
        if (i2 == 0) {
            return -1;
        }
        int m1025a = C0322e.m1025a(this.f1470i, i2, i);
        if (m1025a < 0 || obj.equals(this.f1468a[m1025a])) {
            return m1025a;
        }
        int i3 = m1025a + 1;
        while (i3 < i2 && this.f1470i[i3] == i) {
            if (obj.equals(this.f1468a[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m1025a - 1; i4 >= 0 && this.f1470i[i4] == i; i4--) {
            if (obj.equals(this.f1468a[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: a */
    private int m1017a() {
        int i = this.f1469b;
        if (i == 0) {
            return -1;
        }
        int m1025a = C0322e.m1025a(this.f1470i, i, 0);
        if (m1025a < 0 || this.f1468a[m1025a] == null) {
            return m1025a;
        }
        int i2 = m1025a + 1;
        while (i2 < i && this.f1470i[i2] == 0) {
            if (this.f1468a[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m1025a - 1; i3 >= 0 && this.f1470i[i3] == 0; i3--) {
            if (this.f1468a[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* renamed from: c */
    private void m1020c(int i) {
        if (i == 8) {
            synchronized (C0320c.class) {
                if (f1466g != null) {
                    Object[] objArr = f1466g;
                    this.f1468a = objArr;
                    f1466g = (Object[]) objArr[0];
                    this.f1470i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1467h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0320c.class) {
                if (f1464e != null) {
                    Object[] objArr2 = f1464e;
                    this.f1468a = objArr2;
                    f1464e = (Object[]) objArr2[0];
                    this.f1470i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1465f--;
                    return;
                }
            }
        }
        this.f1470i = new int[i];
        this.f1468a = new Object[i];
    }

    /* renamed from: a */
    private static void m1019a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0320c.class) {
                if (f1467h < 10) {
                    objArr[0] = f1466g;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1466g = objArr;
                    f1467h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0320c.class) {
                if (f1465f < 10) {
                    objArr[0] = f1464e;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1464e = objArr;
                    f1465f++;
                }
            }
        }
    }

    public C0320c() {
        this((byte) 0);
    }

    private C0320c(byte b) {
        this.f1470i = f1462c;
        this.f1468a = f1463d;
        this.f1469b = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f1469b != 0) {
            m1019a(this.f1470i, this.f1468a, this.f1469b);
            this.f1470i = f1462c;
            this.f1468a = f1463d;
            this.f1469b = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return m1021a(obj) >= 0;
    }

    /* renamed from: a */
    public final int m1021a(Object obj) {
        return obj == null ? m1017a() : m1018a(obj, obj.hashCode());
    }

    /* renamed from: a */
    public final E m1022a(int i) {
        return (E) this.f1468a[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1469b <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int m1018a;
        if (e == null) {
            m1018a = m1017a();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m1018a = m1018a(e, hashCode);
        }
        if (m1018a >= 0) {
            return false;
        }
        int i2 = ~m1018a;
        if (this.f1469b >= this.f1470i.length) {
            int i3 = 4;
            if (this.f1469b >= 8) {
                i3 = (this.f1469b >> 1) + this.f1469b;
            } else if (this.f1469b >= 4) {
                i3 = 8;
            }
            int[] iArr = this.f1470i;
            Object[] objArr = this.f1468a;
            m1020c(i3);
            if (this.f1470i.length > 0) {
                System.arraycopy(iArr, 0, this.f1470i, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1468a, 0, objArr.length);
            }
            m1019a(iArr, objArr, this.f1469b);
        }
        if (i2 < this.f1469b) {
            int[] iArr2 = this.f1470i;
            int i4 = i2 + 1;
            System.arraycopy(iArr2, i2, iArr2, i4, this.f1469b - i2);
            Object[] objArr2 = this.f1468a;
            System.arraycopy(objArr2, i2, objArr2, i4, this.f1469b - i2);
        }
        this.f1470i[i2] = i;
        this.f1468a[i2] = e;
        this.f1469b++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m1021a = m1021a(obj);
        if (m1021a < 0) {
            return false;
        }
        m1023b(m1021a);
        return true;
    }

    /* renamed from: b */
    public final E m1023b(int i) {
        E e = (E) this.f1468a[i];
        if (this.f1469b <= 1) {
            m1019a(this.f1470i, this.f1468a, this.f1469b);
            this.f1470i = f1462c;
            this.f1468a = f1463d;
            this.f1469b = 0;
        } else {
            int i2 = 8;
            if (this.f1470i.length > 8 && this.f1469b < this.f1470i.length / 3) {
                if (this.f1469b > 8) {
                    i2 = (this.f1469b >> 1) + this.f1469b;
                }
                int[] iArr = this.f1470i;
                Object[] objArr = this.f1468a;
                m1020c(i2);
                this.f1469b--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1470i, 0, i);
                    System.arraycopy(objArr, 0, this.f1468a, 0, i);
                }
                if (i < this.f1469b) {
                    int i3 = i + 1;
                    System.arraycopy(iArr, i3, this.f1470i, i, this.f1469b - i);
                    System.arraycopy(objArr, i3, this.f1468a, i, this.f1469b - i);
                }
            } else {
                this.f1469b--;
                if (i < this.f1469b) {
                    int i4 = i + 1;
                    System.arraycopy(this.f1470i, i4, this.f1470i, i, this.f1469b - i);
                    System.arraycopy(this.f1468a, i4, this.f1468a, i, this.f1469b - i);
                }
                this.f1468a[this.f1469b] = null;
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1469b;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[this.f1469b];
        System.arraycopy(this.f1468a, 0, objArr, 0, this.f1469b);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1469b) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1469b));
        }
        System.arraycopy(this.f1468a, 0, tArr, 0, this.f1469b);
        if (tArr.length > this.f1469b) {
            tArr[this.f1469b] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        for (int i = 0; i < this.f1469b; i++) {
            try {
                if (!set.contains(this.f1468a[i])) {
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

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f1470i;
        int i = this.f1469b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1469b * 14);
        sb.append('{');
        for (int i = 0; i < this.f1469b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f1468a[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.f1469b + collection.size();
        boolean z = false;
        if (this.f1470i.length < size) {
            int[] iArr = this.f1470i;
            Object[] objArr = this.f1468a;
            m1020c(size);
            if (this.f1469b > 0) {
                System.arraycopy(iArr, 0, this.f1470i, 0, this.f1469b);
                System.arraycopy(objArr, 0, this.f1468a, 0, this.f1469b);
            }
            m1019a(iArr, objArr, this.f1469b);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1469b - 1; i >= 0; i--) {
            if (!collection.contains(this.f1468a[i])) {
                m1023b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f1471j == null) {
            this.f1471j = new C0321d(this);
        }
        return this.f1471j.m1051d().iterator();
    }
}
