package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
/* renamed from: androidx.transition.bt */
/* loaded from: classes.dex */
final class C1044bt implements InterfaceC1045bu {

    /* renamed from: a */
    private final WindowId f4203a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1044bt(View view) {
        this.f4203a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1044bt) && ((C1044bt) obj).f4203a.equals(this.f4203a);
    }

    public final int hashCode() {
        return this.f4203a.hashCode();
    }
}
