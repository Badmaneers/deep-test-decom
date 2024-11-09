package androidx.p011b;

/* compiled from: SparseArrayCompat.java */
/* renamed from: androidx.b.o */
/* loaded from: classes.dex */
public final class C0329o<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1510a = new Object();

    /* renamed from: b */
    private boolean f1511b;

    /* renamed from: c */
    private int[] f1512c;

    /* renamed from: d */
    private Object[] f1513d;

    /* renamed from: e */
    private int f1514e;

    public C0329o() {
        this(10);
    }

    public C0329o(int i) {
        this.f1511b = false;
        if (i == 0) {
            this.f1512c = C0322e.f1473a;
            this.f1513d = C0322e.f1475c;
        } else {
            int m1024a = C0322e.m1024a(i);
            this.f1512c = new int[m1024a];
            this.f1513d = new Object[m1024a];
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0329o<E> clone() {
        try {
            C0329o<E> c0329o = (C0329o) super.clone();
            c0329o.f1512c = (int[]) this.f1512c.clone();
            c0329o.f1513d = (Object[]) this.f1513d.clone();
            return c0329o;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final E m1067a(int i) {
        return m1068a(i, null);
    }

    /* renamed from: a */
    public final E m1068a(int i, E e) {
        int m1025a = C0322e.m1025a(this.f1512c, this.f1514e, i);
        return (m1025a < 0 || this.f1513d[m1025a] == f1510a) ? e : (E) this.f1513d[m1025a];
    }

    /* renamed from: b */
    public final void m1070b(int i) {
        int m1025a = C0322e.m1025a(this.f1512c, this.f1514e, i);
        if (m1025a < 0 || this.f1513d[m1025a] == f1510a) {
            return;
        }
        this.f1513d[m1025a] = f1510a;
        this.f1511b = true;
    }

    /* renamed from: d */
    private void m1064d() {
        int i = this.f1514e;
        int[] iArr = this.f1512c;
        Object[] objArr = this.f1513d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1510a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1511b = false;
        this.f1514e = i2;
    }

    /* renamed from: b */
    public final void m1071b(int i, E e) {
        int m1025a = C0322e.m1025a(this.f1512c, this.f1514e, i);
        if (m1025a >= 0) {
            this.f1513d[m1025a] = e;
            return;
        }
        int i2 = ~m1025a;
        if (i2 < this.f1514e && this.f1513d[i2] == f1510a) {
            this.f1512c[i2] = i;
            this.f1513d[i2] = e;
            return;
        }
        if (this.f1511b && this.f1514e >= this.f1512c.length) {
            m1064d();
            i2 = ~C0322e.m1025a(this.f1512c, this.f1514e, i);
        }
        if (this.f1514e >= this.f1512c.length) {
            int m1024a = C0322e.m1024a(this.f1514e + 1);
            int[] iArr = new int[m1024a];
            Object[] objArr = new Object[m1024a];
            System.arraycopy(this.f1512c, 0, iArr, 0, this.f1512c.length);
            System.arraycopy(this.f1513d, 0, objArr, 0, this.f1513d.length);
            this.f1512c = iArr;
            this.f1513d = objArr;
        }
        if (this.f1514e - i2 != 0) {
            int[] iArr2 = this.f1512c;
            int i3 = i2 + 1;
            System.arraycopy(iArr2, i2, iArr2, i3, this.f1514e - i2);
            Object[] objArr2 = this.f1513d;
            System.arraycopy(objArr2, i2, objArr2, i3, this.f1514e - i2);
        }
        this.f1512c[i2] = i;
        this.f1513d[i2] = e;
        this.f1514e++;
    }

    /* renamed from: b */
    public final int m1069b() {
        if (this.f1511b) {
            m1064d();
        }
        return this.f1514e;
    }

    /* renamed from: c */
    public final int m1072c(int i) {
        if (this.f1511b) {
            m1064d();
        }
        return this.f1512c[i];
    }

    /* renamed from: d */
    public final E m1075d(int i) {
        if (this.f1511b) {
            m1064d();
        }
        return (E) this.f1513d[i];
    }

    /* renamed from: a */
    public final int m1065a(E e) {
        if (this.f1511b) {
            m1064d();
        }
        for (int i = 0; i < this.f1514e; i++) {
            if (this.f1513d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final void m1073c() {
        int i = this.f1514e;
        Object[] objArr = this.f1513d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1514e = 0;
        this.f1511b = false;
    }

    /* renamed from: c */
    public final void m1074c(int i, E e) {
        if (this.f1514e != 0 && i <= this.f1512c[this.f1514e - 1]) {
            m1071b(i, e);
            return;
        }
        if (this.f1511b && this.f1514e >= this.f1512c.length) {
            m1064d();
        }
        int i2 = this.f1514e;
        if (i2 >= this.f1512c.length) {
            int m1024a = C0322e.m1024a(i2 + 1);
            int[] iArr = new int[m1024a];
            Object[] objArr = new Object[m1024a];
            System.arraycopy(this.f1512c, 0, iArr, 0, this.f1512c.length);
            System.arraycopy(this.f1513d, 0, objArr, 0, this.f1513d.length);
            this.f1512c = iArr;
            this.f1513d = objArr;
        }
        this.f1512c[i2] = i;
        this.f1513d[i2] = e;
        this.f1514e = i2 + 1;
    }

    public final String toString() {
        if (m1069b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1514e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1514e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m1072c(i));
            sb.append('=');
            E m1075d = m1075d(i);
            if (m1075d != this) {
                sb.append(m1075d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
