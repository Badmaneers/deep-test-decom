package androidx.p011b;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapCollections.java */
/* renamed from: androidx.b.h */
/* loaded from: classes.dex */
public abstract class AbstractC0325h<K, V> {

    /* renamed from: b */
    AbstractC0325h<K, V>.j f1488b;

    /* renamed from: c */
    AbstractC0325h<K, V>.k f1489c;

    /* renamed from: d */
    AbstractC0325h<K, V>.m f1490d;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1008a();

    /* renamed from: a */
    protected abstract int mo1009a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo1010a(int i, int i2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo1011a(int i, V v);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1012a(int i);

    /* renamed from: a */
    protected abstract void mo1013a(K k2, V v);

    /* renamed from: b */
    protected abstract int mo1014b(Object obj);

    /* renamed from: b */
    protected abstract Map<K, V> mo1015b();

    /* renamed from: c */
    protected abstract void mo1016c();

    /* compiled from: MapCollections.java */
    /* renamed from: androidx.b.j */
    /* loaded from: classes.dex */
    final class j implements Set<Map.Entry<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public j() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo1008a = AbstractC0325h.this.mo1008a();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0325h.this.mo1013a((AbstractC0325h) entry.getKey(), (K) entry.getValue());
            }
            return mo1008a != AbstractC0325h.this.mo1008a();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            AbstractC0325h.this.mo1016c();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo1009a = AbstractC0325h.this.mo1009a(entry.getKey());
            if (mo1009a < 0) {
                return false;
            }
            return C0322e.m1027a(AbstractC0325h.this.mo1010a(mo1009a, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return AbstractC0325h.this.mo1008a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C0327l(AbstractC0325h.this);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return AbstractC0325h.this.mo1008a();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return AbstractC0325h.m1048a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i = 0;
            for (int mo1008a = AbstractC0325h.this.mo1008a() - 1; mo1008a >= 0; mo1008a--) {
                Object mo1010a = AbstractC0325h.this.mo1010a(mo1008a, 0);
                Object mo1010a2 = AbstractC0325h.this.mo1010a(mo1008a, 1);
                i += (mo1010a == null ? 0 : mo1010a.hashCode()) ^ (mo1010a2 == null ? 0 : mo1010a2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections.java */
    /* renamed from: androidx.b.k */
    /* loaded from: classes.dex */
    final class k implements Set<K> {
        k() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            AbstractC0325h.this.mo1016c();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractC0325h.this.mo1009a(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> mo1015b = AbstractC0325h.this.mo1015b();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mo1015b.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return AbstractC0325h.this.mo1008a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new C0326i(AbstractC0325h.this, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int mo1009a = AbstractC0325h.this.mo1009a(obj);
            if (mo1009a < 0) {
                return false;
            }
            AbstractC0325h.this.mo1012a(mo1009a);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> mo1015b = AbstractC0325h.this.mo1015b();
            int size = mo1015b.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mo1015b.remove(it.next());
            }
            return size != mo1015b.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return AbstractC0325h.m1047a((Map) AbstractC0325h.this.mo1015b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return AbstractC0325h.this.mo1008a();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            return AbstractC0325h.this.m1050b(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0325h.this.m1049a(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return AbstractC0325h.m1048a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i = 0;
            for (int mo1008a = AbstractC0325h.this.mo1008a() - 1; mo1008a >= 0; mo1008a--) {
                Object mo1010a = AbstractC0325h.this.mo1010a(mo1008a, 0);
                i += mo1010a == null ? 0 : mo1010a.hashCode();
            }
            return i;
        }
    }

    /* compiled from: MapCollections.java */
    /* renamed from: androidx.b.m */
    /* loaded from: classes.dex */
    final class m implements Collection<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public m() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            AbstractC0325h.this.mo1016c();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractC0325h.this.mo1014b(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return AbstractC0325h.this.mo1008a() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new C0326i(AbstractC0325h.this, 1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int mo1014b = AbstractC0325h.this.mo1014b(obj);
            if (mo1014b < 0) {
                return false;
            }
            AbstractC0325h.this.mo1012a(mo1014b);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int mo1008a = AbstractC0325h.this.mo1008a();
            int i = 0;
            boolean z = false;
            while (i < mo1008a) {
                if (collection.contains(AbstractC0325h.this.mo1010a(i, 1))) {
                    AbstractC0325h.this.mo1012a(i);
                    i--;
                    mo1008a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int mo1008a = AbstractC0325h.this.mo1008a();
            int i = 0;
            boolean z = false;
            while (i < mo1008a) {
                if (!collection.contains(AbstractC0325h.this.mo1010a(i, 1))) {
                    AbstractC0325h.this.mo1012a(i);
                    i--;
                    mo1008a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return AbstractC0325h.this.mo1008a();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return AbstractC0325h.this.m1050b(1);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0325h.this.m1049a(tArr, 1);
        }
    }

    /* renamed from: a */
    public static <K, V> boolean m1047a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: b */
    public final Object[] m1050b(int i) {
        int mo1008a = mo1008a();
        Object[] objArr = new Object[mo1008a];
        for (int i2 = 0; i2 < mo1008a; i2++) {
            objArr[i2] = mo1010a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public final <T> T[] m1049a(T[] tArr, int i) {
        int mo1008a = mo1008a();
        if (tArr.length < mo1008a) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo1008a));
        }
        for (int i2 = 0; i2 < mo1008a; i2++) {
            tArr[i2] = mo1010a(i2, i);
        }
        if (tArr.length > mo1008a) {
            tArr[mo1008a] = null;
        }
        return tArr;
    }

    /* renamed from: a */
    public static <T> boolean m1048a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                if (set.containsAll(set2)) {
                    return true;
                }
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        } catch (NullPointerException unused2) {
            return false;
        }
    }

    /* renamed from: d */
    public final Set<K> m1051d() {
        if (this.f1489c == null) {
            this.f1489c = new k();
        }
        return this.f1489c;
    }
}
