package androidx.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Visibility.java */
/* renamed from: androidx.transition.bo */
/* loaded from: classes.dex */
public abstract class AbstractC1039bo extends AbstractC1001ad {

    /* renamed from: h */
    private static final String[] f4184h = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: i */
    private int f4185i = 3;

    /* renamed from: a */
    public Animator mo3572a(View view, C1017at c1017at) {
        return null;
    }

    /* renamed from: b */
    public Animator mo3574b(View view, C1017at c1017at) {
        return null;
    }

    /* renamed from: a */
    public final void m3573a(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f4185i = i;
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final String[] mo3497a() {
        return f4184h;
    }

    /* renamed from: d */
    private static void m3571d(C1017at c1017at) {
        c1017at.f4149a.put("android:visibility:visibility", Integer.valueOf(c1017at.f4150b.getVisibility()));
        c1017at.f4149a.put("android:visibility:parent", c1017at.f4150b.getParent());
        int[] iArr = new int[2];
        c1017at.f4150b.getLocationOnScreen(iArr);
        c1017at.f4149a.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public void mo3492a(C1017at c1017at) {
        m3571d(c1017at);
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: b */
    public final void mo3503b(C1017at c1017at) {
        m3571d(c1017at);
    }

    /* renamed from: b */
    private static C1042br m3570b(C1017at c1017at, C1017at c1017at2) {
        C1042br c1042br = new C1042br();
        c1042br.f4196a = false;
        c1042br.f4197b = false;
        if (c1017at != null && c1017at.f4149a.containsKey("android:visibility:visibility")) {
            c1042br.f4198c = ((Integer) c1017at.f4149a.get("android:visibility:visibility")).intValue();
            c1042br.f4200e = (ViewGroup) c1017at.f4149a.get("android:visibility:parent");
        } else {
            c1042br.f4198c = -1;
            c1042br.f4200e = null;
        }
        if (c1017at2 != null && c1017at2.f4149a.containsKey("android:visibility:visibility")) {
            c1042br.f4199d = ((Integer) c1017at2.f4149a.get("android:visibility:visibility")).intValue();
            c1042br.f4201f = (ViewGroup) c1017at2.f4149a.get("android:visibility:parent");
        } else {
            c1042br.f4199d = -1;
            c1042br.f4201f = null;
        }
        if (c1017at != null && c1017at2 != null) {
            if (c1042br.f4198c == c1042br.f4199d && c1042br.f4200e == c1042br.f4201f) {
                return c1042br;
            }
            if (c1042br.f4198c != c1042br.f4199d) {
                if (c1042br.f4198c == 0) {
                    c1042br.f4197b = false;
                    c1042br.f4196a = true;
                } else if (c1042br.f4199d == 0) {
                    c1042br.f4197b = true;
                    c1042br.f4196a = true;
                }
            } else if (c1042br.f4201f == null) {
                c1042br.f4197b = false;
                c1042br.f4196a = true;
            } else if (c1042br.f4200e == null) {
                c1042br.f4197b = true;
                c1042br.f4196a = true;
            }
        } else if (c1017at == null && c1042br.f4199d == 0) {
            c1042br.f4197b = true;
            c1042br.f4196a = true;
        } else if (c1017at2 == null && c1042br.f4198c == 0) {
            c1042br.f4197b = false;
            c1042br.f4196a = true;
        }
        return c1042br;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bf, code lost:            if (r10.f4103e != false) goto L61;     */
    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator mo3481a(android.view.ViewGroup r11, androidx.transition.C1017at r12, androidx.transition.C1017at r13) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC1039bo.mo3481a(android.view.ViewGroup, androidx.transition.at, androidx.transition.at):android.animation.Animator");
    }

    @Override // androidx.transition.AbstractC1001ad
    /* renamed from: a */
    public final boolean mo3496a(C1017at c1017at, C1017at c1017at2) {
        if (c1017at == null && c1017at2 == null) {
            return false;
        }
        if (c1017at != null && c1017at2 != null && c1017at2.f4149a.containsKey("android:visibility:visibility") != c1017at.f4149a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1042br m3570b = m3570b(c1017at, c1017at2);
        if (m3570b.f4196a) {
            return m3570b.f4198c == 0 || m3570b.f4199d == 0;
        }
        return false;
    }
}
