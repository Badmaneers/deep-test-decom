package com.facebook.rebound;

import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;

/* compiled from: SpringSystem.java */
/* renamed from: com.facebook.rebound.p */
/* loaded from: classes.dex */
public final class C1885p extends C1875f {
    /* renamed from: b */
    public static C1885p m6031b() {
        AbstractC1884o c1873d;
        if (Build.VERSION.SDK_INT >= 16) {
            c1873d = new C1871b(Choreographer.getInstance());
        } else {
            c1873d = new C1873d(new Handler());
        }
        return new C1885p(c1873d);
    }

    private C1885p(AbstractC1884o abstractC1884o) {
        super(abstractC1884o);
    }
}
