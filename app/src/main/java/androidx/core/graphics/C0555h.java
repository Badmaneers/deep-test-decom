package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import androidx.core.content.p020a.C0425e;
import androidx.core.content.p020a.C0426f;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* compiled from: TypefaceCompatApi26Impl.java */
/* renamed from: androidx.core.graphics.h */
/* loaded from: classes.dex */
public class C0555h extends C0553f {

    /* renamed from: a */
    protected final Class<?> f2436a;

    /* renamed from: b */
    protected final Constructor<?> f2437b;

    /* renamed from: c */
    protected final Method f2438c;

    /* renamed from: d */
    protected final Method f2439d;

    /* renamed from: e */
    protected final Method f2440e;

    /* renamed from: f */
    protected final Method f2441f;

    /* renamed from: g */
    protected final Method f2442g;

    public C0555h() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method2 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            method4 = cls2.getMethod("freeze", new Class[0]);
            method = cls2.getMethod("abortCreation", new Class[0]);
            method5 = mo1967a(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2436a = cls;
        this.f2437b = constructor;
        this.f2438c = method2;
        this.f2439d = method3;
        this.f2440e = method4;
        this.f2441f = method;
        this.f2442g = method5;
    }

    /* renamed from: a */
    private boolean m1959a() {
        if (this.f2438c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2438c != null;
    }

    /* renamed from: b */
    private Object m1962b() {
        try {
            return this.f2437b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private boolean m1960a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2438c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m1961a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f2439d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    protected Typeface mo1966a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2436a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2442g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private boolean m1963b(Object obj) {
        try {
            return ((Boolean) this.f2440e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private void m1964c(Object obj) {
        try {
            this.f2441f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // androidx.core.graphics.C0553f, androidx.core.graphics.C0558k
    /* renamed from: a */
    public final Typeface mo1953a(Context context, C0425e c0425e, Resources resources, int i) {
        if (!m1959a()) {
            return super.mo1953a(context, c0425e, resources, i);
        }
        Object m1962b = m1962b();
        if (m1962b == null) {
            return null;
        }
        for (C0426f c0426f : c0425e.m1509a()) {
            if (!m1960a(context, m1962b, c0426f.m1510a(), c0426f.m1514e(), c0426f.m1511b(), c0426f.m1512c() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0426f.m1513d()))) {
                m1964c(m1962b);
                return null;
            }
        }
        if (m1963b(m1962b)) {
            return mo1966a(m1962b);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[Catch: IOException -> 0x0062, SYNTHETIC, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:9:0x0013, B:12:0x0021, B:17:0x0044, B:27:0x0055, B:24:0x005e, B:31:0x005a, B:25:0x0061), top: B:8:0x0013, inners: #4 }] */
    @Override // androidx.core.graphics.C0553f, androidx.core.graphics.C0558k
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface mo1954a(android.content.Context r12, androidx.core.p021d.C0446h[] r13, int r14) {
        /*
            r11 = this;
            int r0 = r13.length
            r1 = 0
            if (r0 > 0) goto L5
            return r1
        L5:
            boolean r0 = r11.m1959a()
            if (r0 != 0) goto L63
            androidx.core.d.h r11 = r11.mo1969a(r13, r14)
            android.content.ContentResolver r12 = r12.getContentResolver()
            android.net.Uri r13 = r11.m1568a()     // Catch: java.io.IOException -> L62
            java.lang.String r14 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r13, r14, r1)     // Catch: java.io.IOException -> L62
            if (r12 != 0) goto L25
            if (r12 == 0) goto L24
            r12.close()     // Catch: java.io.IOException -> L62
        L24:
            return r1
        L25:
            android.graphics.Typeface$Builder r13 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            java.io.FileDescriptor r14 = r12.getFileDescriptor()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            int r14 = r11.m1570c()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            android.graphics.Typeface$Builder r13 = r13.setWeight(r14)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            boolean r11 = r11.m1571d()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            android.graphics.Typeface$Builder r11 = r13.setItalic(r11)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            android.graphics.Typeface r11 = r11.build()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            if (r12 == 0) goto L47
            r12.close()     // Catch: java.io.IOException -> L62
        L47:
            return r11
        L48:
            r11 = move-exception
            r13 = r1
            goto L51
        L4b:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> L4d
        L4d:
            r13 = move-exception
            r10 = r13
            r13 = r11
            r11 = r10
        L51:
            if (r12 == 0) goto L61
            if (r13 == 0) goto L5e
            r12.close()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L62
            goto L61
        L59:
            r12 = move-exception
            r13.addSuppressed(r12)     // Catch: java.io.IOException -> L62
            goto L61
        L5e:
            r12.close()     // Catch: java.io.IOException -> L62
        L61:
            throw r11     // Catch: java.io.IOException -> L62
        L62:
            return r1
        L63:
            java.util.Map r12 = androidx.core.p021d.C0440b.m1562a(r12, r13)
            java.lang.Object r0 = r11.m1962b()
            if (r0 != 0) goto L6e
            return r1
        L6e:
            int r8 = r13.length
            r2 = 0
            r9 = r2
        L71:
            if (r9 >= r8) goto L9d
            r3 = r13[r9]
            android.net.Uri r4 = r3.m1568a()
            java.lang.Object r4 = r12.get(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            if (r4 == 0) goto L9a
            int r5 = r3.m1569b()
            int r6 = r3.m1570c()
            boolean r7 = r3.m1571d()
            r2 = r11
            r3 = r0
            boolean r2 = r2.m1961a(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L99
            r11.m1964c(r0)
            return r1
        L99:
            r2 = 1
        L9a:
            int r9 = r9 + 1
            goto L71
        L9d:
            if (r2 != 0) goto La3
            r11.m1964c(r0)
            return r1
        La3:
            boolean r12 = r11.m1963b(r0)
            if (r12 != 0) goto Laa
            return r1
        Laa:
            android.graphics.Typeface r11 = r11.mo1966a(r0)
            if (r11 != 0) goto Lb1
            return r1
        Lb1:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0555h.mo1954a(android.content.Context, androidx.core.d.h[], int):android.graphics.Typeface");
    }

    @Override // androidx.core.graphics.C0558k
    /* renamed from: a */
    public final Typeface mo1965a(Context context, Resources resources, int i, String str, int i2) {
        if (!m1959a()) {
            return super.mo1965a(context, resources, i, str, i2);
        }
        Object m1962b = m1962b();
        if (m1962b == null) {
            return null;
        }
        if (!m1960a(context, m1962b, str, 0, -1, -1, null)) {
            m1964c(m1962b);
            return null;
        }
        if (m1963b(m1962b)) {
            return mo1966a(m1962b);
        }
        return null;
    }

    /* renamed from: a */
    protected Method mo1967a(Class<?> cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
