package androidx.transition;

import android.os.IBinder;

/* compiled from: WindowIdApi14.java */
/* renamed from: androidx.transition.bs */
/* loaded from: classes.dex */
final class C1043bs implements InterfaceC1045bu {

    /* renamed from: a */
    private final IBinder f4202a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1043bs(IBinder iBinder) {
        this.f4202a = iBinder;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1043bs) && ((C1043bs) obj).f4202a.equals(this.f4202a);
    }

    public final int hashCode() {
        return this.f4202a.hashCode();
    }
}
