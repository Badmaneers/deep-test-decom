package androidx.loader.p036a;

import androidx.lifecycle.InterfaceC0721af;
import androidx.lifecycle.InterfaceC0733m;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* renamed from: androidx.loader.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0747a {
    /* renamed from: a */
    public abstract void mo2642a();

    @Deprecated
    /* renamed from: a */
    public abstract void mo2643a(String str, PrintWriter printWriter);

    /* renamed from: a */
    public static <T extends InterfaceC0733m & InterfaceC0721af> AbstractC0747a m2641a(T t) {
        return new C0749c(t, t.mo32b());
    }
}
