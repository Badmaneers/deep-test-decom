package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupUtils.java */
/* renamed from: androidx.transition.ay */
/* loaded from: classes.dex */
final class C1022ay {

    /* renamed from: a */
    private static boolean f4157a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC1021ax m3542a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1020aw(viewGroup);
        }
        return (C1019av) C1026bb.m3545c(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3543a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
            return;
        }
        if (Build.VERSION.SDK_INT < 18) {
            C1023az.m3544a(viewGroup, z);
        } else if (f4157a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f4157a = false;
            }
        }
    }
}
