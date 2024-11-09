package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.p020a.C0425e;
import androidx.core.content.p020a.C0426f;
import androidx.core.p021d.C0446h;
import androidx.p011b.C0328n;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl.java */
/* renamed from: androidx.core.graphics.g */
/* loaded from: classes.dex */
final class C0554g extends C0558k {

    /* renamed from: a */
    private static final Class<?> f2432a;

    /* renamed from: b */
    private static final Constructor<?> f2433b;

    /* renamed from: c */
    private static final Method f2434c;

    /* renamed from: d */
    private static final Method f2435d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f2433b = constructor;
        f2432a = cls;
        f2434c = method2;
        f2435d = method;
    }

    /* renamed from: a */
    public static boolean m1956a() {
        if (f2434c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f2434c != null;
    }

    /* renamed from: b */
    private static Object m1958b() {
        try {
            return f2433b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m1957a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2434c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Typeface m1955a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2432a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2435d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0558k
    /* renamed from: a */
    public final Typeface mo1954a(Context context, C0446h[] c0446hArr, int i) {
        Object m1958b = m1958b();
        if (m1958b == null) {
            return null;
        }
        C0328n c0328n = new C0328n();
        for (C0446h c0446h : c0446hArr) {
            Uri m1568a = c0446h.m1568a();
            ByteBuffer byteBuffer = (ByteBuffer) c0328n.get(m1568a);
            if (byteBuffer == null) {
                byteBuffer = C0562o.m1977a(context, m1568a);
                c0328n.put(m1568a, byteBuffer);
            }
            if (byteBuffer == null || !m1957a(m1958b, byteBuffer, c0446h.m1569b(), c0446h.m1570c(), c0446h.m1571d())) {
                return null;
            }
        }
        Typeface m1955a = m1955a(m1958b);
        if (m1955a == null) {
            return null;
        }
        return Typeface.create(m1955a, i);
    }

    @Override // androidx.core.graphics.C0558k
    /* renamed from: a */
    public final Typeface mo1953a(Context context, C0425e c0425e, Resources resources, int i) {
        Object m1958b = m1958b();
        if (m1958b == null) {
            return null;
        }
        for (C0426f c0426f : c0425e.m1509a()) {
            ByteBuffer m1976a = C0562o.m1976a(context, resources, c0426f.m1515f());
            if (m1976a == null || !m1957a(m1958b, m1976a, c0426f.m1514e(), c0426f.m1511b(), c0426f.m1512c())) {
                return null;
            }
        }
        return m1955a(m1958b);
    }
}
