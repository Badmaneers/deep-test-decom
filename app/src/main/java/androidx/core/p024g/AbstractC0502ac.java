package androidx.core.p024g;

import android.os.Build;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewCompat.java */
/* renamed from: androidx.core.g.ac */
/* loaded from: classes.dex */
public abstract class AbstractC0502ac<T> {

    /* renamed from: a */
    private final int f2337a;

    /* renamed from: b */
    private final Class<T> f2338b;

    /* renamed from: c */
    private final int f2339c;

    /* renamed from: a */
    abstract T mo1723a(View view);

    /* renamed from: a */
    abstract void mo1724a(View view, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0502ac(int i, Class<T> cls) {
        this(i, cls, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0502ac(int i, Class<T> cls, byte b) {
        this.f2337a = i;
        this.f2338b = cls;
        this.f2339c = 28;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m1730b(View view, T t) {
        if (m1726a()) {
            mo1724a(view, (View) t);
        } else if (m1728b() && mo1725a(m1729b(view), t)) {
            C0538w.m1870d(view);
            view.setTag(this.f2337a, t);
            C0538w.m1875f(view, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final T m1729b(View view) {
        if (m1726a()) {
            return mo1723a(view);
        }
        if (!m1728b()) {
            return null;
        }
        T t = (T) view.getTag(this.f2337a);
        if (this.f2338b.isInstance(t)) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m1726a() {
        return Build.VERSION.SDK_INT >= this.f2339c;
    }

    /* renamed from: b */
    private static boolean m1728b() {
        return Build.VERSION.SDK_INT >= 19;
    }

    /* renamed from: a */
    boolean mo1725a(T t, T t2) {
        return !t2.equals(t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m1727a(Boolean bool, Boolean bool2) {
        return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
    }
}
