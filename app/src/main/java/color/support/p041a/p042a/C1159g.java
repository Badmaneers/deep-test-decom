package color.support.p041a.p042a;

import android.os.Build;
import android.view.ViewTreeObserver;

/* compiled from: ColorViewTreeObserverCompat.java */
/* renamed from: color.support.a.a.g */
/* loaded from: classes.dex */
public final class C1159g {

    /* renamed from: a */
    static final InterfaceC1162j f4652a;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f4652a = new C1161i();
        } else {
            f4652a = new C1160h();
        }
    }

    /* renamed from: a */
    public static void m3816a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        f4652a.mo3817a(viewTreeObserver, onGlobalLayoutListener);
    }
}
