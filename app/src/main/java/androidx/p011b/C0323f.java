package androidx.p011b;

/* compiled from: LongSparseArray.java */
/* renamed from: androidx.b.f */
/* loaded from: classes.dex */
public final class C0323f<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1476a = new Object();

    /* renamed from: b */
    private boolean f1477b;

    /* renamed from: c */
    private long[] f1478c;

    /* renamed from: d */
    private Object[] f1479d;

    /* renamed from: e */
    private int f1480e;

    public C0323f() {
        this((byte) 0);
    }

    private C0323f(byte b) {
        this.f1477b = false;
        int m1028b = C0322e.m1028b(10);
        this.f1478c = new long[m1028b];
        this.f1479d = new Object[m1028b];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0323f<E> clone() {
        try {
            C0323f<E> c0323f = (C0323f) super.clone();
            c0323f.f1478c = (long[]) this.f1478c.clone();
            c0323f.f1479d = (Object[]) this.f1479d.clone();
            return c0323f;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final E m1032a(long j) {
        return m1033a(j, null);
    }

    /* renamed from: a */
    public final E m1033a(long j, E e) {
        int m1026a = C0322e.m1026a(this.f1478c, this.f1480e, j);
        return (m1026a < 0 || this.f1479d[m1026a] == f1476a) ? e : (E) this.f1479d[m1026a];
    }

    /* renamed from: b */
    public final void m1037b(long j) {
        int m1026a = C0322e.m1026a(this.f1478c, this.f1480e, j);
        if (m1026a < 0 || this.f1479d[m1026a] == f1476a) {
            return;
        }
        this.f1479d[m1026a] = f1476a;
        this.f1477b = true;
    }

    /* renamed from: a */
    public final void m1034a(int i) {
        if (this.f1479d[i] != f1476a) {
            this.f1479d[i] = f1476a;
            this.f1477b = true;
        }
    }

    /* renamed from: e */
    private void m1030e() {
        int i = this.f1480e;
        long[] jArr = this.f1478c;
        Object[] objArr = this.f1479d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1476a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1477b = false;
        this.f1480e = i2;
    }

    /* renamed from: b */
    public final void m1038b(long j, E e) {
        int m1026a = C0322e.m1026a(this.f1478c, this.f1480e, j);
        if (m1026a >= 0) {
            this.f1479d[m1026a] = e;
            return;
        }
        int i = ~m1026a;
        if (i < this.f1480e && this.f1479d[i] == f1476a) {
            this.f1478c[i] = j;
            this.f1479d[i] = e;
            return;
        }
        if (this.f1477b && this.f1480e >= this.f1478c.length) {
            m1030e();
            i = ~C0322e.m1026a(this.f1478c, this.f1480e, j);
        }
        if (this.f1480e >= this.f1478c.length) {
            int m1028b = C0322e.m1028b(this.f1480e + 1);
            long[] jArr = new long[m1028b];
            Object[] objArr = new Object[m1028b];
            System.arraycopy(this.f1478c, 0, jArr, 0, this.f1478c.length);
            System.arraycopy(this.f1479d, 0, objArr, 0, this.f1479d.length);
            this.f1478c = jArr;
            this.f1479d = objArr;
        }
        if (this.f1480e - i != 0) {
            long[] jArr2 = this.f1478c;
            int i2 = i + 1;
            System.arraycopy(jArr2, i, jArr2, i2, this.f1480e - i);
            Object[] objArr2 = this.f1479d;
            System.arraycopy(objArr2, i, objArr2, i2, this.f1480e - i);
        }
        this.f1478c[i] = j;
        this.f1479d[i] = e;
        this.f1480e++;
    }

    /* renamed from: b */
    public final int m1035b() {
        if (this.f1477b) {
            m1030e();
        }
        return this.f1480e;
    }

    /* renamed from: c */
    public final boolean m1042c() {
        return m1035b() == 0;
    }

    /* renamed from: b */
    public final long m1036b(int i) {
        if (this.f1477b) {
            m1030e();
        }
        return this.f1478c[i];
    }

    /* renamed from: c */
    public final E m1040c(int i) {
        if (this.f1477b) {
            m1030e();
        }
        return (E) this.f1479d[i];
    }

    /* renamed from: c */
    public final int m1039c(long j) {
        if (this.f1477b) {
            m1030e();
        }
        return C0322e.m1026a(this.f1478c, this.f1480e, j);
    }

    /* renamed from: d */
    public final void m1043d() {
        int i = this.f1480e;
        Object[] objArr = this.f1479d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1480e = 0;
        this.f1477b = false;
    }

    /* renamed from: c */
    public final void m1041c(long j, E e) {
        if (this.f1480e != 0 && j <= this.f1478c[this.f1480e - 1]) {
            m1038b(j, e);
            return;
        }
        if (this.f1477b && this.f1480e >= this.f1478c.length) {
            m1030e();
        }
        int i = this.f1480e;
        if (i >= this.f1478c.length) {
            int m1028b = C0322e.m1028b(i + 1);
            long[] jArr = new long[m1028b];
            Object[] objArr = new Object[m1028b];
            System.arraycopy(this.f1478c, 0, jArr, 0, this.f1478c.length);
            System.arraycopy(this.f1479d, 0, objArr, 0, this.f1479d.length);
            this.f1478c = jArr;
            this.f1479d = objArr;
        }
        this.f1478c[i] = j;
        this.f1479d[i] = e;
        this.f1480e = i + 1;
    }

    public final String toString() {
        if (m1035b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1480e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1480e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m1036b(i));
            sb.append('=');
            E m1040c = m1040c(i);
            if (m1040c != this) {
                sb.append(m1040c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
