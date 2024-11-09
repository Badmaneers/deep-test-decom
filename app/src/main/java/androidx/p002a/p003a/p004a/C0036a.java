package androidx.p002a.p003a.p004a;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
/* renamed from: androidx.a.a.a.a */
/* loaded from: classes.dex */
public class C0036a extends AbstractC0041f {

    /* renamed from: a */
    private static volatile C0036a f9a;

    /* renamed from: d */
    private static final Executor f10d = new ExecutorC0037b();

    /* renamed from: e */
    private static final Executor f11e = new ExecutorC0038c();

    /* renamed from: c */
    private AbstractC0041f f13c = new C0039d();

    /* renamed from: b */
    private AbstractC0041f f12b = this.f13c;

    private C0036a() {
    }

    /* renamed from: a */
    public static C0036a m10a() {
        if (f9a != null) {
            return f9a;
        }
        synchronized (C0036a.class) {
            if (f9a == null) {
                f9a = new C0036a();
            }
        }
        return f9a;
    }

    @Override // androidx.p002a.p003a.p004a.AbstractC0041f
    /* renamed from: a */
    public final void mo12a(Runnable runnable) {
        this.f12b.mo12a(runnable);
    }

    @Override // androidx.p002a.p003a.p004a.AbstractC0041f
    /* renamed from: b */
    public final void mo13b(Runnable runnable) {
        this.f12b.mo13b(runnable);
    }

    /* renamed from: b */
    public static Executor m11b() {
        return f11e;
    }

    @Override // androidx.p002a.p003a.p004a.AbstractC0041f
    /* renamed from: c */
    public final boolean mo14c() {
        return this.f12b.mo14c();
    }
}
