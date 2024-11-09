package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback.java */
/* renamed from: androidx.activity.d */
/* loaded from: classes.dex */
public abstract class AbstractC0054d {

    /* renamed from: b */
    private CopyOnWriteArrayList<InterfaceC0051a> f55b = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    private boolean f54a = false;

    /* renamed from: c */
    public abstract void mo44c();

    /* renamed from: a */
    public final void m40a(boolean z) {
        this.f54a = z;
    }

    /* renamed from: a */
    public final boolean m41a() {
        return this.f54a;
    }

    /* renamed from: b */
    public final void m42b() {
        Iterator<InterfaceC0051a> it = this.f55b.iterator();
        while (it.hasNext()) {
            it.next().mo38a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m39a(InterfaceC0051a interfaceC0051a) {
        this.f55b.add(interfaceC0051a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m43b(InterfaceC0051a interfaceC0051a) {
        this.f55b.remove(interfaceC0051a);
    }
}
