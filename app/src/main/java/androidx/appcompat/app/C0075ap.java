package androidx.appcompat.app;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* compiled from: ResourcesFlusher.java */
/* renamed from: androidx.appcompat.app.ap */
/* loaded from: classes.dex */
final class C0075ap {

    /* renamed from: a */
    private static Field f217a;

    /* renamed from: b */
    private static boolean f218b;

    /* renamed from: c */
    private static Class<?> f219c;

    /* renamed from: d */
    private static boolean f220d;

    /* renamed from: e */
    private static Field f221e;

    /* renamed from: f */
    private static boolean f222f;

    /* renamed from: g */
    private static Field f223g;

    /* renamed from: h */
    private static boolean f224h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m188a(android.content.res.Resources r5) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0075ap.m188a(android.content.res.Resources):void");
    }

    /* renamed from: a */
    private static void m189a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f220d) {
            try {
                f219c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f220d = true;
        }
        if (f219c == null) {
            return;
        }
        if (!f222f) {
            try {
                Field declaredField = f219c.getDeclaredField("mUnthemedEntries");
                f221e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f222f = true;
        }
        if (f221e == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) f221e.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
