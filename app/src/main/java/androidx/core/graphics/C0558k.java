package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import androidx.core.content.p020a.C0425e;
import androidx.core.content.p020a.C0426f;
import androidx.core.p021d.C0446h;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import neton.client.Utils.ResponseCode;

/* compiled from: TypefaceCompatBaseImpl.java */
/* renamed from: androidx.core.graphics.k */
/* loaded from: classes.dex */
public class C0558k {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0425e> f2443a = new ConcurrentHashMap<>();

    /* renamed from: a */
    private static <T> T m1970a(T[] tArr, int i, InterfaceC0561n<T> interfaceC0561n) {
        int i2 = (i & 1) == 0 ? ResponseCode.CODE_4XX_BAD_REQUEST : 700;
        boolean z = (i & 2) != 0;
        int i3 = Integer.MAX_VALUE;
        T t = null;
        for (T t2 : tArr) {
            int abs = (Math.abs(interfaceC0561n.mo1974b(t2) - i2) * 2) + (interfaceC0561n.mo1973a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: b */
    private static long m1971b(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    /* renamed from: a */
    public C0446h mo1969a(C0446h[] c0446hArr, int i) {
        return (C0446h) m1970a(c0446hArr, i, new C0559l(this));
    }

    /* renamed from: a */
    public Typeface mo1968a(Context context, InputStream inputStream) {
        File m1975a = C0562o.m1975a(context);
        if (m1975a == null) {
            return null;
        }
        try {
            if (C0562o.m1981a(m1975a, inputStream)) {
                return Typeface.createFromFile(m1975a.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m1975a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo1954a(Context context, C0446h[] c0446hArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c0446hArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo1969a(c0446hArr, i).m1568a());
            try {
                Typeface mo1968a = mo1968a(context, inputStream);
                C0562o.m1979a(inputStream);
                return mo1968a;
            } catch (IOException unused) {
                C0562o.m1979a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0562o.m1979a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public Typeface mo1965a(Context context, Resources resources, int i, String str, int i2) {
        File m1975a = C0562o.m1975a(context);
        if (m1975a == null) {
            return null;
        }
        try {
            if (C0562o.m1980a(m1975a, resources, i)) {
                return Typeface.createFromFile(m1975a.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m1975a.delete();
        }
    }

    /* renamed from: a */
    public final C0425e m1972a(Typeface typeface) {
        long m1971b = m1971b(typeface);
        if (m1971b == 0) {
            return null;
        }
        return this.f2443a.get(Long.valueOf(m1971b));
    }

    /* renamed from: a */
    public Typeface mo1953a(Context context, C0425e c0425e, Resources resources, int i) {
        C0426f c0426f = (C0426f) m1970a(c0425e.m1509a(), i, new C0560m(this));
        if (c0426f == null) {
            return null;
        }
        Typeface m1942a = C0552e.m1942a(context, resources, c0426f.m1515f(), c0426f.m1510a(), i);
        long m1971b = m1971b(m1942a);
        if (m1971b != 0) {
            this.f2443a.put(Long.valueOf(m1971b), c0425e);
        }
        return m1942a;
    }
}
