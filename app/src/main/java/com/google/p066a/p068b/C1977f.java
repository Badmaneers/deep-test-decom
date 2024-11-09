package com.google.p066a.p068b;

import com.google.p066a.InterfaceC2023r;
import com.google.p066a.p070c.C1999a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: ConstructorConstructor.java */
/* renamed from: com.google.a.b.f */
/* loaded from: classes.dex */
public final class C1977f {

    /* renamed from: a */
    private final Map<Type, InterfaceC2023r<?>> f8827a;

    public C1977f(Map<Type, InterfaceC2023r<?>> map) {
        this.f8827a = map;
    }

    public C1977f() {
        this(Collections.emptyMap());
    }

    /* renamed from: a */
    public final <T> InterfaceC1990s<T> m6136a(C1999a<T> c1999a) {
        InterfaceC1990s<T> c1984m;
        Type m6166b = c1999a.m6166b();
        Class<? super T> m6165a = c1999a.m6165a();
        InterfaceC2023r<?> interfaceC2023r = this.f8827a.get(m6166b);
        if (interfaceC2023r != null) {
            return new C1978g(this, interfaceC2023r, m6166b);
        }
        InterfaceC1990s<T> m6135a = m6135a(m6165a);
        if (m6135a != null) {
            return m6135a;
        }
        if (Collection.class.isAssignableFrom(m6165a)) {
            if (SortedSet.class.isAssignableFrom(m6165a)) {
                c1984m = new C1980i<>(this);
            } else if (Set.class.isAssignableFrom(m6165a)) {
                c1984m = new C1981j<>(this);
            } else if (Queue.class.isAssignableFrom(m6165a)) {
                c1984m = new C1982k<>(this);
            } else {
                c1984m = new C1983l<>(this);
            }
        } else {
            c1984m = Map.class.isAssignableFrom(m6165a) ? new C1984m<>(this) : null;
        }
        return c1984m != null ? c1984m : new C1985n(this, m6165a, m6166b);
    }

    /* renamed from: a */
    private <T> InterfaceC1990s<T> m6135a(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new C1979h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final String toString() {
        return this.f8827a.toString();
    }
}
