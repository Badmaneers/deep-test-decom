package androidx.room;

import android.database.Cursor;
import android.os.Build;
import android.os.Looper;
import androidx.p032e.p033a.InterfaceC0646b;
import androidx.p032e.p033a.InterfaceC0647c;
import androidx.p032e.p033a.InterfaceC0653i;
import androidx.p032e.p033a.InterfaceC0654j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: RoomDatabase.java */
/* renamed from: androidx.room.z */
/* loaded from: classes.dex */
public abstract class AbstractC0969z {

    /* renamed from: a */
    @Deprecated
    protected volatile InterfaceC0646b f3934a;

    /* renamed from: b */
    boolean f3935b;

    /* renamed from: c */
    @Deprecated
    protected List<Object> f3936c;

    /* renamed from: d */
    private Executor f3937d;

    /* renamed from: e */
    private Executor f3938e;

    /* renamed from: f */
    private InterfaceC0647c f3939f;

    /* renamed from: h */
    private boolean f3941h;

    /* renamed from: i */
    private final ReentrantReadWriteLock f3942i = new ReentrantReadWriteLock();

    /* renamed from: j */
    private final ThreadLocal<Integer> f3943j = new ThreadLocal<>();

    /* renamed from: k */
    private final Map<String, Object> f3944k = new ConcurrentHashMap();

    /* renamed from: g */
    private final C0953j f3940g = mo3408c();

    /* renamed from: b */
    protected abstract InterfaceC0647c mo3407b(C0922a c0922a);

    /* renamed from: c */
    protected abstract C0953j mo3408c();

    /* renamed from: a */
    public final Lock m3403a() {
        return this.f3942i.readLock();
    }

    /* renamed from: a */
    public final void m3405a(C0922a c0922a) {
        this.f3939f = mo3407b(c0922a);
        if (this.f3939f instanceof C0940ai) {
            ((C0940ai) this.f3939f).m3366a(c0922a);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            r2 = c0922a.f3790g == C0933ab.f3846c;
            this.f3939f.mo2220a(r2);
        }
        this.f3936c = c0922a.f3788e;
        this.f3937d = c0922a.f3791h;
        this.f3938e = new ExecutorC0943al(c0922a.f3792i);
        this.f3941h = c0922a.f3789f;
        this.f3935b = r2;
        if (c0922a.f3793j) {
            this.f3940g.m3384a(c0922a.f3785b, c0922a.f3786c);
        }
    }

    /* renamed from: b */
    public final InterfaceC0647c m3406b() {
        return this.f3939f;
    }

    /* renamed from: d */
    public final boolean m3409d() {
        InterfaceC0646b interfaceC0646b = this.f3934a;
        return interfaceC0646b != null && interfaceC0646b.mo2216e();
    }

    /* renamed from: e */
    public final void m3410e() {
        if (this.f3941h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: f */
    public final void m3411f() {
        if (!m3416k() && this.f3943j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* renamed from: a */
    public final Cursor m3401a(InterfaceC0653i interfaceC0653i) {
        m3410e();
        m3411f();
        return this.f3939f.mo2221b().mo2207a(interfaceC0653i);
    }

    /* renamed from: a */
    public final InterfaceC0654j m3402a(String str) {
        m3410e();
        m3411f();
        return this.f3939f.mo2221b().mo2208a(str);
    }

    @Deprecated
    /* renamed from: g */
    public final void m3412g() {
        m3410e();
        InterfaceC0646b mo2221b = this.f3939f.mo2221b();
        this.f3940g.m3388b(mo2221b);
        mo2221b.mo2209a();
    }

    @Deprecated
    /* renamed from: h */
    public final void m3413h() {
        this.f3939f.mo2221b().mo2212b();
        if (m3416k()) {
            return;
        }
        C0953j c0953j = this.f3940g;
        if (c0953j.f3891d.compareAndSet(false, true)) {
            c0953j.f3890c.f3937d.execute(c0953j.f3894g);
        }
    }

    /* renamed from: i */
    public final Executor m3414i() {
        return this.f3937d;
    }

    @Deprecated
    /* renamed from: j */
    public final void m3415j() {
        this.f3939f.mo2221b().mo2213c();
    }

    /* renamed from: a */
    public final void m3404a(InterfaceC0646b interfaceC0646b) {
        this.f3940g.m3385a(interfaceC0646b);
    }

    /* renamed from: k */
    public final boolean m3416k() {
        return this.f3939f.mo2221b().mo2215d();
    }
}
