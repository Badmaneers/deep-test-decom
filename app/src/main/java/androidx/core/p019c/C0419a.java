package androidx.core.p019c;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: TraceCompat.java */
/* renamed from: androidx.core.c.a */
/* loaded from: classes.dex */
public final class C0419a {

    /* renamed from: a */
    private static long f2144a;

    /* renamed from: b */
    private static Method f2145b;

    /* renamed from: c */
    private static Method f2146c;

    /* renamed from: d */
    private static Method f2147d;

    /* renamed from: e */
    private static Method f2148e;

    static {
        if (Build.VERSION.SDK_INT < 18 || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        try {
            f2144a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            f2145b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            f2146c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            f2147d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            f2148e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
        } catch (Exception e) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e);
        }
    }

    /* renamed from: a */
    public static void m1480a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: a */
    public static void m1479a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
