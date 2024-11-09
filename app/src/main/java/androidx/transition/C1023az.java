package androidx.transition;

import android.animation.LayoutTransition;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtilsApi14.java */
/* renamed from: androidx.transition.az */
/* loaded from: classes.dex */
final class C1023az {

    /* renamed from: a */
    private static LayoutTransition f4158a;

    /* renamed from: b */
    private static Field f4159b;

    /* renamed from: c */
    private static boolean f4160c;

    /* renamed from: d */
    private static Method f4161d;

    /* renamed from: e */
    private static boolean f4162e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3544a(android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = androidx.transition.C1023az.f4158a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L28
            androidx.transition.ba r0 = new androidx.transition.ba
            r0.<init>()
            androidx.transition.C1023az.f4158a = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = androidx.transition.C1023az.f4158a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = androidx.transition.C1023az.f4158a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = androidx.transition.C1023az.f4158a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = androidx.transition.C1023az.f4158a
            r4 = 4
            r0.setAnimator(r4, r3)
        L28:
            if (r6 == 0) goto L7d
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L77
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L6e
            boolean r0 = androidx.transition.C1023az.f4162e
            if (r0 != 0) goto L53
            java.lang.Class<android.animation.LayoutTransition> r0 = android.animation.LayoutTransition.class
            java.lang.String r3 = "cancel"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L4a
            androidx.transition.C1023az.f4161d = r0     // Catch: java.lang.NoSuchMethodException -> L4a
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L4a
            goto L51
        L4a:
            java.lang.String r0 = "ViewGroupUtilsApi14"
            java.lang.String r3 = "Failed to access cancel method by reflection"
            android.util.Log.i(r0, r3)
        L51:
            androidx.transition.C1023az.f4162e = r1
        L53:
            java.lang.reflect.Method r0 = androidx.transition.C1023az.f4161d
            if (r0 == 0) goto L6e
            java.lang.reflect.Method r0 = androidx.transition.C1023az.f4161d     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.IllegalAccessException -> L67
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.IllegalAccessException -> L67
            r0.invoke(r6, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.IllegalAccessException -> L67
            goto L6e
        L5f:
            java.lang.String r0 = "ViewGroupUtilsApi14"
            java.lang.String r1 = "Failed to invoke cancel method by reflection"
            android.util.Log.i(r0, r1)
            goto L6e
        L67:
            java.lang.String r0 = "ViewGroupUtilsApi14"
            java.lang.String r1 = "Failed to access cancel method by reflection"
            android.util.Log.i(r0, r1)
        L6e:
            android.animation.LayoutTransition r0 = androidx.transition.C1023az.f4158a
            if (r6 == r0) goto L77
            int r0 = androidx.transition.R.id.transition_layout_save
            r5.setTag(r0, r6)
        L77:
            android.animation.LayoutTransition r6 = androidx.transition.C1023az.f4158a
            r5.setLayoutTransition(r6)
            return
        L7d:
            r5.setLayoutTransition(r3)
            boolean r6 = androidx.transition.C1023az.f4160c
            if (r6 != 0) goto L9b
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r0 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L92
            androidx.transition.C1023az.f4159b = r6     // Catch: java.lang.NoSuchFieldException -> L92
            r6.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L92
            goto L99
        L92:
            java.lang.String r6 = "ViewGroupUtilsApi14"
            java.lang.String r0 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r6, r0)
        L99:
            androidx.transition.C1023az.f4160c = r1
        L9b:
            java.lang.reflect.Field r6 = androidx.transition.C1023az.f4159b
            if (r6 == 0) goto Lb8
            java.lang.reflect.Field r6 = androidx.transition.C1023az.f4159b     // Catch: java.lang.IllegalAccessException -> Lb1
            boolean r6 = r6.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> Lb1
            if (r6 == 0) goto Laf
            java.lang.reflect.Field r0 = androidx.transition.C1023az.f4159b     // Catch: java.lang.IllegalAccessException -> Lad
            r0.setBoolean(r5, r2)     // Catch: java.lang.IllegalAccessException -> Lad
            goto Laf
        Lad:
            r2 = r6
            goto Lb1
        Laf:
            r2 = r6
            goto Lb8
        Lb1:
            java.lang.String r6 = "ViewGroupUtilsApi14"
            java.lang.String r0 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r6, r0)
        Lb8:
            if (r2 == 0) goto Lbd
            r5.requestLayout()
        Lbd:
            int r6 = androidx.transition.R.id.transition_layout_save
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto Lcf
            int r0 = androidx.transition.R.id.transition_layout_save
            r5.setTag(r0, r3)
            r5.setLayoutTransition(r6)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1023az.m3544a(android.view.ViewGroup, boolean):void");
    }
}
