package com.coloros.anim;

import android.util.Log;
import androidx.core.p019c.C0419a;
import com.coloros.anim.p062f.C1806b;
import java.util.HashSet;
import java.util.Set;

/* compiled from: L.java */
/* renamed from: com.coloros.anim.an */
/* loaded from: classes.dex */
public final class C1692an {

    /* renamed from: c */
    private static String[] f8047c;

    /* renamed from: d */
    private static long[] f8048d;

    /* renamed from: a */
    private static final Set<String> f8045a = new HashSet();

    /* renamed from: b */
    private static boolean f8046b = false;

    /* renamed from: e */
    private static int f8049e = 0;

    /* renamed from: f */
    private static int f8050f = 0;

    /* renamed from: a */
    public static void m5562a(String str) {
        if (C1806b.f8388a) {
            Log.d("EffectiveAnimation", str);
        }
    }

    /* renamed from: b */
    public static void m5563b(String str) {
        if (f8045a.contains(str)) {
            return;
        }
        Log.w("EffectiveAnimation", str);
        f8045a.add(str);
    }

    /* renamed from: c */
    public static void m5564c(String str) {
        if (f8046b) {
            if (f8049e == 20) {
                f8050f++;
                return;
            }
            f8047c[f8049e] = str;
            f8048d[f8049e] = System.nanoTime();
            C0419a.m1480a(str);
            f8049e++;
        }
    }

    /* renamed from: d */
    public static float m5565d(String str) {
        if (f8050f > 0) {
            f8050f--;
            return 0.0f;
        }
        if (!f8046b) {
            return 0.0f;
        }
        int i = f8049e - 1;
        f8049e = i;
        if (i == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(f8047c[f8049e])) {
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f8047c[f8049e] + ".");
        }
        C0419a.m1479a();
        return ((float) (System.nanoTime() - f8048d[f8049e])) / 1000000.0f;
    }
}
