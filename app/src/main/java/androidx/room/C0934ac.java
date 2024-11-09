package androidx.room;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/* compiled from: RoomDatabase.java */
/* renamed from: androidx.room.ac */
/* loaded from: classes.dex */
public final class C0934ac {

    /* renamed from: a */
    private HashMap<Integer, TreeMap<Integer, Object>> f3848a = new HashMap<>();

    /* renamed from: a */
    public final List<Object> m3350a(int i, int i2) {
        if (i == i2) {
            return Collections.emptyList();
        }
        return m3349a(new ArrayList(), i2 > i, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<java.lang.Object> m3349a(java.util.List<java.lang.Object> r7, boolean r8, int r9, int r10) {
        /*
            r6 = this;
        L0:
            if (r8 == 0) goto L5
            if (r9 >= r10) goto L58
            goto L7
        L5:
            if (r9 <= r10) goto L58
        L7:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, java.lang.Object>> r0 = r6.f3848a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r0.get(r1)
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            r1 = 0
            if (r0 != 0) goto L17
            return r1
        L17:
            if (r8 == 0) goto L1e
            java.util.NavigableSet r2 = r0.descendingKeySet()
            goto L22
        L1e:
            java.util.Set r2 = r0.keySet()
        L22:
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L54
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r8 == 0) goto L40
            if (r3 > r10) goto L45
            if (r3 <= r9) goto L45
        L3e:
            r5 = r4
            goto L45
        L40:
            if (r3 < r10) goto L45
            if (r3 >= r9) goto L45
            goto L3e
        L45:
            if (r5 == 0) goto L26
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            java.lang.Object r9 = r0.get(r9)
            r7.add(r9)
            r9 = r3
            goto L55
        L54:
            r4 = r5
        L55:
            if (r4 != 0) goto L0
            return r1
        L58:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0934ac.m3349a(java.util.List, boolean, int, int):java.util.List");
    }
}
