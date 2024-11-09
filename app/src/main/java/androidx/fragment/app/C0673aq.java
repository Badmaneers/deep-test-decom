package androidx.fragment.app;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import androidx.core.app.AbstractC0415m;
import androidx.core.p024g.C0538w;
import androidx.p011b.C0318a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentTransition.java */
/* renamed from: androidx.fragment.app.aq */
/* loaded from: classes.dex */
public final class C0673aq {

    /* renamed from: a */
    private static final int[] f2878a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final AbstractC0685bb f2879b;

    /* renamed from: c */
    private static final AbstractC0685bb f2880c;

    static {
        f2879b = Build.VERSION.SDK_INT >= 21 ? new C0679aw() : null;
        f2880c = m2381a();
    }

    /* renamed from: a */
    private static AbstractC0685bb m2381a() {
        try {
            return (AbstractC0685bb) Class.forName("androidx.transition.t").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:111:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2392a(androidx.fragment.app.LayoutInflaterFactory2C0707s r46, java.util.ArrayList<androidx.fragment.app.C0656a> r47, java.util.ArrayList<java.lang.Boolean> r48, int r49, int r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0673aq.m2392a(androidx.fragment.app.s, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    /* renamed from: a */
    private static C0318a<String, String> m2378a(int i, ArrayList<C0656a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0318a<String, String> c0318a = new C0318a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0656a c0656a = arrayList.get(i4);
            if (c0656a.m2350b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                if (c0656a.f2866r != null) {
                    int size = c0656a.f2866r.size();
                    if (booleanValue) {
                        arrayList3 = c0656a.f2866r;
                        arrayList4 = c0656a.f2867s;
                    } else {
                        ArrayList<String> arrayList5 = c0656a.f2866r;
                        arrayList3 = c0656a.f2867s;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = c0318a.remove(str2);
                        if (remove != null) {
                            c0318a.put(str, remove);
                        } else {
                            c0318a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0318a;
    }

    /* renamed from: a */
    private static AbstractC0685bb m2382a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object m2248B = fragment.m2248B();
            if (m2248B != null) {
                arrayList.add(m2248B);
            }
            Object m2247A = fragment.m2247A();
            if (m2247A != null) {
                arrayList.add(m2247A);
            }
            Object m2251E = fragment.m2251E();
            if (m2251E != null) {
                arrayList.add(m2251E);
            }
        }
        if (fragment2 != null) {
            Object m2325z = fragment2.m2325z();
            if (m2325z != null) {
                arrayList.add(m2325z);
            }
            Object m2249C = fragment2.m2249C();
            if (m2249C != null) {
                arrayList.add(m2249C);
            }
            Object m2250D = fragment2.m2250D();
            if (m2250D != null) {
                arrayList.add(m2250D);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f2879b != null && m2395a(f2879b, arrayList)) {
            return f2879b;
        }
        if (f2880c != null && m2395a(f2880c, arrayList)) {
            return f2880c;
        }
        if (f2879b == null && f2880c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static boolean m2395a(AbstractC0685bb abstractC0685bb, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC0685bb.mo2408a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m2383a(AbstractC0685bb abstractC0685bb, Fragment fragment, Fragment fragment2, boolean z) {
        Object m2250D;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            m2250D = fragment2.m2251E();
        } else {
            m2250D = fragment.m2250D();
        }
        return abstractC0685bb.mo2414c(abstractC0685bb.mo2409b(m2250D));
    }

    /* renamed from: a */
    private static Object m2384a(AbstractC0685bb abstractC0685bb, Fragment fragment, boolean z) {
        Object m2325z;
        if (fragment == null) {
            return null;
        }
        if (z) {
            m2325z = fragment.m2249C();
        } else {
            m2325z = fragment.m2325z();
        }
        return abstractC0685bb.mo2409b(m2325z);
    }

    /* renamed from: b */
    private static Object m2397b(AbstractC0685bb abstractC0685bb, Fragment fragment, boolean z) {
        Object m2248B;
        if (fragment == null) {
            return null;
        }
        if (z) {
            m2248B = fragment.m2247A();
        } else {
            m2248B = fragment.m2248B();
        }
        return abstractC0685bb.mo2409b(m2248B);
    }

    /* renamed from: a */
    private static void m2394a(ArrayList<View> arrayList, C0318a<String, View> c0318a, Collection<String> collection) {
        for (int size = c0318a.size() - 1; size >= 0; size--) {
            View c = c0318a.m1062c(size);
            if (collection.contains(C0538w.m1890s(c))) {
                arrayList.add(c);
            }
        }
    }

    /* renamed from: b */
    private static C0318a<String, View> m2396b(AbstractC0685bb abstractC0685bb, C0318a<String, String> c0318a, Object obj, C0678av c0678av) {
        AbstractC0415m m2270X;
        ArrayList<String> arrayList;
        if (c0318a.isEmpty() || obj == null) {
            c0318a.clear();
            return null;
        }
        Fragment fragment = c0678av.f2912d;
        C0318a<String, View> c0318a2 = new C0318a<>();
        abstractC0685bb.m2423a((Map<String, View>) c0318a2, fragment.m2323x());
        C0656a c0656a = c0678av.f2914f;
        if (c0678av.f2913e) {
            m2270X = fragment.m2269W();
            arrayList = c0656a.f2867s;
        } else {
            m2270X = fragment.m2270X();
            arrayList = c0656a.f2866r;
        }
        c0318a2.m1007a((Collection<?>) arrayList);
        if (m2270X != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0318a2.get(str);
                if (view == null) {
                    c0318a.remove(str);
                } else if (!str.equals(C0538w.m1890s(view))) {
                    c0318a.put(C0538w.m1890s(view), c0318a.remove(str));
                }
            }
        } else {
            c0318a.m1007a((Collection<?>) c0318a2.keySet());
        }
        return c0318a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0318a<String, View> m2379a(AbstractC0685bb abstractC0685bb, C0318a<String, String> c0318a, Object obj, C0678av c0678av) {
        AbstractC0415m m2269W;
        ArrayList<String> arrayList;
        String m2386a;
        Fragment fragment = c0678av.f2909a;
        View view = fragment.f2748O;
        if (c0318a.isEmpty() || obj == null || view == null) {
            c0318a.clear();
            return null;
        }
        C0318a<String, View> c0318a2 = new C0318a<>();
        abstractC0685bb.m2423a((Map<String, View>) c0318a2, view);
        C0656a c0656a = c0678av.f2911c;
        if (c0678av.f2910b) {
            m2269W = fragment.m2270X();
            arrayList = c0656a.f2866r;
        } else {
            m2269W = fragment.m2269W();
            arrayList = c0656a.f2867s;
        }
        if (arrayList != null) {
            c0318a2.m1007a((Collection<?>) arrayList);
            c0318a2.m1007a((Collection<?>) c0318a.values());
        }
        if (m2269W != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = c0318a2.get(str);
                if (view2 == null) {
                    String m2386a2 = m2386a(c0318a, str);
                    if (m2386a2 != null) {
                        c0318a.remove(m2386a2);
                    }
                } else if (!str.equals(C0538w.m1890s(view2)) && (m2386a = m2386a(c0318a, str)) != null) {
                    c0318a.put(m2386a, C0538w.m1890s(view2));
                }
            }
        } else {
            for (int size2 = c0318a.size() - 1; size2 >= 0; size2--) {
                if (!c0318a2.containsKey(c0318a.m1062c(size2))) {
                    c0318a.m1063d(size2);
                }
            }
        }
        return c0318a2;
    }

    /* renamed from: a */
    private static String m2386a(C0318a<String, String> c0318a, String str) {
        int size = c0318a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c0318a.m1062c(i))) {
                return c0318a.m1061b(i);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static View m2377a(C0318a<String, View> c0318a, C0678av c0678av, Object obj, boolean z) {
        String str;
        C0656a c0656a = c0678av.f2911c;
        if (obj == null || c0318a == null || c0656a.f2866r == null || c0656a.f2866r.isEmpty()) {
            return null;
        }
        if (z) {
            str = c0656a.f2866r.get(0);
        } else {
            str = c0656a.f2867s.get(0);
        }
        return c0318a.get(str);
    }

    /* renamed from: a */
    private static void m2391a(AbstractC0685bb abstractC0685bb, Object obj, Object obj2, C0318a<String, View> c0318a, boolean z, C0656a c0656a) {
        String str;
        if (c0656a.f2866r == null || c0656a.f2866r.isEmpty()) {
            return;
        }
        if (z) {
            str = c0656a.f2867s.get(0);
        } else {
            str = c0656a.f2866r.get(0);
        }
        View view = c0318a.get(str);
        abstractC0685bb.mo2403a(obj, view);
        if (obj2 != null) {
            abstractC0685bb.mo2403a(obj2, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2388a(Fragment fragment, Fragment fragment2, boolean z, C0318a<String, View> c0318a) {
        AbstractC0415m m2269W;
        if (z) {
            m2269W = fragment2.m2269W();
        } else {
            m2269W = fragment.m2269W();
        }
        if (m2269W != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = c0318a == null ? 0 : c0318a.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(c0318a.m1061b(i));
                arrayList.add(c0318a.m1062c(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ArrayList<View> m2387a(AbstractC0685bb abstractC0685bb, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.f2748O;
        if (view2 != null) {
            abstractC0685bb.m2422a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        abstractC0685bb.mo2406a(obj, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2393a(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* renamed from: a */
    private static Object m2385a(AbstractC0685bb abstractC0685bb, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else if (z) {
            z2 = fragment.m2253G();
        } else {
            z2 = fragment.m2252F();
        }
        if (z2) {
            return abstractC0685bb.mo2400a(obj2, obj, obj3);
        }
        return abstractC0685bb.mo2410b(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static void m2389a(C0656a c0656a, SparseArray<C0678av> sparseArray, boolean z) {
        int size = c0656a.f2852d.size();
        for (int i = 0; i < size; i++) {
            m2390a(c0656a, c0656a.f2852d.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: b */
    private static void m2398b(C0656a c0656a, SparseArray<C0678av> sparseArray, boolean z) {
        if (c0656a.f2821a.f3008o.mo2432b_()) {
            for (int size = c0656a.f2852d.size() - 1; size >= 0; size--) {
                m2390a(c0656a, c0656a.f2852d.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x002d, code lost:            if (r6.f2776t != false) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:            r12 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0065, code lost:            r12 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0081, code lost:            if (r6.f2741H == false) goto L60;     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m2390a(androidx.fragment.app.C0656a r11, androidx.fragment.app.C0672ap r12, android.util.SparseArray<androidx.fragment.app.C0678av> r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0673aq.m2390a(androidx.fragment.app.a, androidx.fragment.app.ap, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static C0678av m2380a(C0678av c0678av, SparseArray<C0678av> sparseArray, int i) {
        if (c0678av != null) {
            return c0678av;
        }
        C0678av c0678av2 = new C0678av();
        sparseArray.put(i, c0678av2);
        return c0678av2;
    }
}
