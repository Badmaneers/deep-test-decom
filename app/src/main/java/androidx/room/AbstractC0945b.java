package androidx.room;

import androidx.p032e.p033a.InterfaceC0654j;

/* compiled from: EntityInsertionAdapter.java */
/* renamed from: androidx.room.b */
/* loaded from: classes.dex */
public abstract class AbstractC0945b<T> extends AbstractC0942ak {
    /* renamed from: a */
    protected abstract void mo3372a(InterfaceC0654j interfaceC0654j, T t);

    public AbstractC0945b(AbstractC0969z abstractC0969z) {
        super(abstractC0969z);
    }

    /* renamed from: a */
    public final void m3373a(T t) {
        InterfaceC0654j b = m3370b();
        try {
            mo3372a(b, t);
            b.mo2232b();
        } finally {
            m3369a(b);
        }
    }
}
