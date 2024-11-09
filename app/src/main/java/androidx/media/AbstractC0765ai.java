package androidx.media;

import android.os.Build;

/* compiled from: VolumeProviderCompat.java */
/* renamed from: androidx.media.ai */
/* loaded from: classes.dex */
public abstract class AbstractC0765ai {

    /* renamed from: a */
    private final int f3134a;

    /* renamed from: b */
    private final int f3135b;

    /* renamed from: c */
    private int f3136c;

    /* renamed from: d */
    private AbstractC0767ak f3137d;

    /* renamed from: e */
    private Object f3138e;

    /* renamed from: a */
    public final int m2665a() {
        return this.f3136c;
    }

    /* renamed from: b */
    public final int m2667b() {
        return this.f3134a;
    }

    /* renamed from: c */
    public final int m2668c() {
        return this.f3135b;
    }

    /* renamed from: a */
    public final void m2666a(AbstractC0767ak abstractC0767ak) {
        this.f3137d = abstractC0767ak;
    }

    /* renamed from: d */
    public final Object m2669d() {
        if (this.f3138e == null && Build.VERSION.SDK_INT >= 21) {
            this.f3138e = new C0769am(this.f3134a, this.f3135b, this.f3136c, new C0766aj(this));
        }
        return this.f3138e;
    }
}
