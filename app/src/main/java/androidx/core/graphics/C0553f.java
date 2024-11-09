package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.p020a.C0425e;
import androidx.core.content.p020a.C0426f;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypefaceCompatApi21Impl.java */
/* renamed from: androidx.core.graphics.f */
/* loaded from: classes.dex */
public class C0553f extends C0558k {

    /* renamed from: a */
    private static Class<?> f2427a = null;

    /* renamed from: b */
    private static Constructor<?> f2428b = null;

    /* renamed from: c */
    private static Method f2429c = null;

    /* renamed from: d */
    private static Method f2430d = null;

    /* renamed from: e */
    private static boolean f2431e = false;

    /* renamed from: a */
    private static void m1950a() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2431e) {
            return;
        }
        f2431e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f2428b = constructor;
        f2427a = cls;
        f2429c = method2;
        f2430d = method;
    }

    /* renamed from: a */
    private static File m1949a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Object m1952b() {
        m1950a();
        try {
            return f2428b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static Typeface m1948a(Object obj) {
        m1950a();
        try {
            Object newInstance = Array.newInstance(f2427a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2430d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m1951a(Object obj, String str, int i, boolean z) {
        m1950a();
        try {
            return ((Boolean) f2429c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060 A[Catch: all -> 0x0064, Throwable -> 0x0067, TryCatch #3 {all -> 0x0064, blocks: (B:13:0x001f, B:15:0x0025, B:18:0x002c, B:22:0x0036, B:25:0x0043, B:36:0x0057, B:34:0x0063, B:33:0x0060, B:40:0x005c), top: B:12:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[Catch: IOException -> 0x007e, SYNTHETIC, TRY_LEAVE, TryCatch #8 {IOException -> 0x007e, blocks: (B:7:0x000d, B:10:0x001b, B:20:0x0032, B:27:0x0048, B:55:0x0071, B:52:0x007a, B:59:0x0076, B:53:0x007d), top: B:6:0x000d, inners: #5 }] */
    @Override // androidx.core.graphics.C0558k
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface mo1954a(android.content.Context r4, androidx.core.p021d.C0446h[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 0
            if (r0 > 0) goto L5
            return r1
        L5:
            androidx.core.d.h r5 = r3.mo1969a(r5, r6)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.m1568a()     // Catch: java.io.IOException -> L7e
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r1)     // Catch: java.io.IOException -> L7e
            if (r5 != 0) goto L1f
            if (r5 == 0) goto L1e
            r5.close()     // Catch: java.io.IOException -> L7e
        L1e:
            return r1
        L1f:
            java.io.File r6 = m1949a(r5)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L67
            if (r6 == 0) goto L36
            boolean r0 = r6.canRead()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L67
            if (r0 != 0) goto L2c
            goto L36
        L2c:
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L67
            if (r5 == 0) goto L35
            r5.close()     // Catch: java.io.IOException -> L7e
        L35:
            return r3
        L36:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L67
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L67
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L67
            android.graphics.Typeface r3 = super.mo1968a(r4, r6)     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4f
            r6.close()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L67
            if (r5 == 0) goto L4b
            r5.close()     // Catch: java.io.IOException -> L7e
        L4b:
            return r3
        L4c:
            r3 = move-exception
            r4 = r1
            goto L55
        L4f:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L51
        L51:
            r4 = move-exception
            r2 = r4
            r4 = r3
            r3 = r2
        L55:
            if (r4 == 0) goto L60
            r6.close()     // Catch: java.lang.Throwable -> L5b java.lang.Throwable -> L64
            goto L63
        L5b:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L67
            goto L63
        L60:
            r6.close()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L67
        L63:
            throw r3     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L67
        L64:
            r3 = move-exception
            r4 = r1
            goto L6d
        L67:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L69
        L69:
            r4 = move-exception
            r2 = r4
            r4 = r3
            r3 = r2
        L6d:
            if (r5 == 0) goto L7d
            if (r4 == 0) goto L7a
            r5.close()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L7e
            goto L7d
        L75:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L7e
            goto L7d
        L7a:
            r5.close()     // Catch: java.io.IOException -> L7e
        L7d:
            throw r3     // Catch: java.io.IOException -> L7e
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0553f.mo1954a(android.content.Context, androidx.core.d.h[], int):android.graphics.Typeface");
    }

    @Override // androidx.core.graphics.C0558k
    /* renamed from: a */
    public Typeface mo1953a(Context context, C0425e c0425e, Resources resources, int i) {
        Object m1952b = m1952b();
        for (C0426f c0426f : c0425e.m1509a()) {
            File m1975a = C0562o.m1975a(context);
            if (m1975a == null) {
                return null;
            }
            try {
                if (!C0562o.m1980a(m1975a, resources, c0426f.m1515f())) {
                    return null;
                }
                if (!m1951a(m1952b, m1975a.getPath(), c0426f.m1511b(), c0426f.m1512c())) {
                    return null;
                }
                m1975a.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m1975a.delete();
            }
        }
        return m1948a(m1952b);
    }
}
