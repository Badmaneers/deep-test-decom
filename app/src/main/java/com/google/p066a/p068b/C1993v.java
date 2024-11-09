package com.google.p066a.p068b;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* compiled from: StringMap.java */
/* renamed from: com.google.a.b.v */
/* loaded from: classes.dex */
public final class C1993v<V> extends AbstractMap<String, V> {

    /* renamed from: b */
    private static final Map.Entry[] f8859b = new C1964aa[2];

    /* renamed from: i */
    private static final int f8860i = new Random().nextInt();

    /* renamed from: d */
    private int f8863d;

    /* renamed from: f */
    private Set<String> f8865f;

    /* renamed from: g */
    private Set<Map.Entry<String, V>> f8866g;

    /* renamed from: h */
    private Collection<V> f8867h;

    /* renamed from: c */
    private C1964aa<V>[] f8862c = (C1964aa[]) f8859b;

    /* renamed from: e */
    private int f8864e = -1;

    /* renamed from: a */
    private C1964aa<V> f8861a = new C1964aa<>();

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8863d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return (obj instanceof String) && m6154a((String) obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        C1964aa<V> m6154a;
        if (!(obj instanceof String) || (m6154a = m6154a((String) obj)) == null) {
            return null;
        }
        return m6154a.f8805b;
    }

    /* renamed from: a */
    private C1964aa<V> m6154a(String str) {
        if (str == null) {
            return null;
        }
        int m6159b = m6159b(str);
        for (C1964aa<V> c1964aa = this.f8862c[(r4.length - 1) & m6159b]; c1964aa != null; c1964aa = c1964aa.f8807d) {
            String str2 = c1964aa.f8804a;
            if (str2 == str || (c1964aa.f8806c == m6159b && str.equals(str2))) {
                return c1964aa;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V put(String str, V v) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        int m6159b = m6159b(str);
        int length = (r0.length - 1) & m6159b;
        for (C1964aa<V> c1964aa = this.f8862c[length]; c1964aa != null; c1964aa = c1964aa.f8807d) {
            if (c1964aa.f8806c == m6159b && str.equals(c1964aa.f8804a)) {
                V v2 = c1964aa.f8805b;
                c1964aa.f8805b = v;
                return v2;
            }
        }
        int i = this.f8863d;
        this.f8863d = i + 1;
        if (i > this.f8864e) {
            length = m6159b & (m6157a().length - 1);
        }
        int i2 = length;
        C1964aa<V> c1964aa2 = this.f8861a;
        C1964aa<V> c1964aa3 = c1964aa2.f8809f;
        C1964aa<V> c1964aa4 = new C1964aa<>(str, v, m6159b, this.f8862c[i2], c1964aa2, c1964aa3);
        C1964aa<V>[] c1964aaArr = this.f8862c;
        c1964aa2.f8809f = c1964aa4;
        c1964aa3.f8808e = c1964aa4;
        c1964aaArr[i2] = c1964aa4;
        return null;
    }

    /* renamed from: a */
    private C1964aa<V>[] m6157a() {
        C1964aa<V>[] c1964aaArr = this.f8862c;
        int length = c1964aaArr.length;
        if (length == 1073741824) {
            return c1964aaArr;
        }
        int i = length * 2;
        C1964aa<V>[] c1964aaArr2 = new C1964aa[i];
        this.f8862c = c1964aaArr2;
        this.f8864e = (i >> 1) + (i >> 2);
        if (this.f8863d == 0) {
            return c1964aaArr2;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C1964aa<V> c1964aa = c1964aaArr[i2];
            if (c1964aa != null) {
                int i3 = c1964aa.f8806c & length;
                c1964aaArr2[i2 | i3] = c1964aa;
                C1964aa<V> c1964aa2 = c1964aa;
                C1964aa<V> c1964aa3 = null;
                for (C1964aa<V> c1964aa4 = c1964aa.f8807d; c1964aa4 != null; c1964aa4 = c1964aa4.f8807d) {
                    int i4 = c1964aa4.f8806c & length;
                    if (i4 != i3) {
                        if (c1964aa3 == null) {
                            c1964aaArr2[i2 | i4] = c1964aa4;
                        } else {
                            c1964aa3.f8807d = c1964aa4;
                        }
                        c1964aa3 = c1964aa2;
                        i3 = i4;
                    }
                    c1964aa2 = c1964aa4;
                }
                if (c1964aa3 != null) {
                    c1964aa3.f8807d = null;
                }
            }
        }
        return c1964aaArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        if (obj == null || !(obj instanceof String)) {
            return null;
        }
        int m6159b = m6159b((String) obj);
        C1964aa<V>[] c1964aaArr = this.f8862c;
        int length = (c1964aaArr.length - 1) & m6159b;
        C1964aa<V> c1964aa = null;
        for (C1964aa<V> c1964aa2 = c1964aaArr[length]; c1964aa2 != null; c1964aa2 = c1964aa2.f8807d) {
            if (c1964aa2.f8806c != m6159b || !obj.equals(c1964aa2.f8804a)) {
                c1964aa = c1964aa2;
            } else {
                if (c1964aa == null) {
                    c1964aaArr[length] = c1964aa2.f8807d;
                } else {
                    c1964aa.f8807d = c1964aa2.f8807d;
                }
                this.f8863d--;
                m6155a(c1964aa2);
                return c1964aa2.f8805b;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m6155a(C1964aa<V> c1964aa) {
        c1964aa.f8809f.f8808e = c1964aa.f8808e;
        c1964aa.f8808e.f8809f = c1964aa.f8809f;
        c1964aa.f8809f = null;
        c1964aa.f8808e = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.f8863d != 0) {
            Arrays.fill(this.f8862c, (Object) null);
            this.f8863d = 0;
        }
        C1964aa<V> c1964aa = this.f8861a;
        C1964aa<V> c1964aa2 = c1964aa.f8808e;
        while (c1964aa2 != c1964aa) {
            C1964aa<V> c1964aa3 = c1964aa2.f8808e;
            c1964aa2.f8809f = null;
            c1964aa2.f8808e = null;
            c1964aa2 = c1964aa3;
        }
        c1964aa.f8809f = c1964aa;
        c1964aa.f8808e = c1964aa;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<String> keySet() {
        Set<String> set = this.f8865f;
        if (set != null) {
            return set;
        }
        C1996y c1996y = new C1996y(this, (byte) 0);
        this.f8865f = c1996y;
        return c1996y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f8867h;
        if (collection != null) {
            return collection;
        }
        C1966ac c1966ac = new C1966ac(this, (byte) 0);
        this.f8867h = c1966ac;
        return c1966ac;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, V>> entrySet() {
        Set<Map.Entry<String, V>> set = this.f8866g;
        if (set != null) {
            return set;
        }
        C1994w c1994w = new C1994w(this, (byte) 0);
        this.f8866g = c1994w;
        return c1994w;
    }

    /* renamed from: b */
    private static int m6159b(String str) {
        int i = f8860i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int charAt = i + str.charAt(i2);
            int i3 = (charAt + charAt) << 10;
            i = i3 ^ (i3 >>> 6);
        }
        int i4 = ((i >>> 20) ^ (i >>> 12)) ^ i;
        return (i4 >>> 4) ^ ((i4 >>> 7) ^ i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m6156a(C1993v c1993v, Object obj, Object obj2) {
        if (obj == null || !(obj instanceof String)) {
            return false;
        }
        int m6159b = m6159b((String) obj);
        C1964aa<V>[] c1964aaArr = c1993v.f8862c;
        int length = (c1964aaArr.length - 1) & m6159b;
        C1964aa<V> c1964aa = c1964aaArr[length];
        C1964aa<V> c1964aa2 = null;
        while (true) {
            C1964aa<V> c1964aa3 = c1964aa2;
            c1964aa2 = c1964aa;
            if (c1964aa2 == null) {
                return false;
            }
            if (c1964aa2.f8806c != m6159b || !obj.equals(c1964aa2.f8804a)) {
                c1964aa = c1964aa2.f8807d;
            } else {
                if (obj2 != null ? !obj2.equals(c1964aa2.f8805b) : c1964aa2.f8805b != null) {
                    return false;
                }
                if (c1964aa3 == null) {
                    c1964aaArr[length] = c1964aa2.f8807d;
                } else {
                    c1964aa3.f8807d = c1964aa2.f8807d;
                }
                c1993v.f8863d--;
                m6155a(c1964aa2);
                return true;
            }
        }
    }
}
