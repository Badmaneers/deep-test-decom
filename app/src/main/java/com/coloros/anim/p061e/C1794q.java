package com.coloros.anim.p061e;

import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.p011b.C0329o;
import com.coloros.anim.C1638a;
import com.coloros.anim.p063g.C1815c;
import java.lang.ref.WeakReference;

/* compiled from: KeyframeParser.java */
/* renamed from: com.coloros.anim.e.q */
/* loaded from: classes.dex */
class C1794q {

    /* renamed from: a */
    private static final Interpolator f8380a = new LinearInterpolator();

    /* renamed from: b */
    private static C0329o<WeakReference<Interpolator>> f8381b;

    C1794q() {
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m5849a(int i) {
        WeakReference<Interpolator> m1067a;
        synchronized (C1794q.class) {
            if (f8381b == null) {
                f8381b = new C0329o<>();
            }
            m1067a = f8381b.m1067a(i);
        }
        return m1067a;
    }

    /* renamed from: a */
    private static void m5850a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C1794q.class) {
            f8381b.m1071b(i, weakReference);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> C1815c<T> m5847a(JsonReader jsonReader, C1638a c1638a, float f, InterfaceC1778ag<T> interfaceC1778ag, boolean z) {
        if (z) {
            return m5848a(c1638a, jsonReader, f, interfaceC1778ag);
        }
        return new C1815c<>(interfaceC1778ag.mo5811a(jsonReader, f));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0078. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> com.coloros.anim.p063g.C1815c<T> m5848a(com.coloros.anim.C1638a r16, android.util.JsonReader r17, float r18, com.coloros.anim.p061e.InterfaceC1778ag<T> r19) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coloros.anim.p061e.C1794q.m5848a(com.coloros.anim.a, android.util.JsonReader, float, com.coloros.anim.e.ag):com.coloros.anim.g.c");
    }
}
