package androidx.media;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.l */
/* loaded from: classes.dex */
public class C0781l<T> {

    /* renamed from: a */
    private final Object f3170a;

    /* renamed from: b */
    private boolean f3171b;

    /* renamed from: c */
    private boolean f3172c;

    /* renamed from: d */
    private boolean f3173d;

    /* renamed from: e */
    private int f3174e;

    /* renamed from: a */
    void mo2671a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0781l(Object obj) {
        this.f3170a = obj;
    }

    /* renamed from: c */
    public final void m2676c() {
        if (this.f3172c || this.f3173d) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f3170a);
        }
        this.f3172c = true;
        mo2671a();
    }

    /* renamed from: d */
    public final void m2677d() {
        if (this.f3172c || this.f3173d) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f3170a);
        }
        this.f3173d = true;
        mo2672b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m2678e() {
        return this.f3171b || this.f3172c || this.f3173d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2675a(int i) {
        this.f3174e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final int m2679f() {
        return this.f3174e;
    }

    /* renamed from: b */
    void mo2672b() {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.f3170a);
    }
}
