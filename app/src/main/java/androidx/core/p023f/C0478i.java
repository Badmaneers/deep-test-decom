package androidx.core.p023f;

/* compiled from: Preconditions.java */
/* renamed from: androidx.core.f.i */
/* loaded from: classes.dex */
public final class C0478i {
    /* renamed from: a */
    public static <T> T m1620a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m1621a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static int m1619a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }
}
