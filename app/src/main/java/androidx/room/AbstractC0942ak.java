package androidx.room;

import androidx.p032e.p033a.InterfaceC0654j;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement.java */
/* renamed from: androidx.room.ak */
/* loaded from: classes.dex */
public abstract class AbstractC0942ak {

    /* renamed from: a */
    private final AtomicBoolean f3875a = new AtomicBoolean(false);

    /* renamed from: b */
    private final AbstractC0969z f3876b;

    /* renamed from: c */
    private volatile InterfaceC0654j f3877c;

    /* renamed from: a */
    protected abstract String mo3368a();

    public AbstractC0942ak(AbstractC0969z abstractC0969z) {
        this.f3876b = abstractC0969z;
    }

    /* renamed from: c */
    private InterfaceC0654j m3367c() {
        return this.f3876b.m3402a(mo3368a());
    }

    /* renamed from: a */
    public final void m3369a(InterfaceC0654j interfaceC0654j) {
        if (interfaceC0654j == this.f3877c) {
            this.f3875a.set(false);
        }
    }

    /* renamed from: b */
    public final InterfaceC0654j m3370b() {
        this.f3876b.m3410e();
        if (this.f3875a.compareAndSet(false, true)) {
            if (this.f3877c == null) {
                this.f3877c = m3367c();
            }
            return this.f3877c;
        }
        return m3367c();
    }
}
