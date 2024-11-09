package androidx.loader.p036a;

import androidx.core.p023f.C0470a;
import androidx.lifecycle.C0720ae;
import androidx.lifecycle.InterfaceC0733m;
import java.io.PrintWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoaderManagerImpl.java */
/* renamed from: androidx.loader.a.c */
/* loaded from: classes.dex */
public final class C0749c extends AbstractC0747a {

    /* renamed from: a */
    static boolean f3096a = false;

    /* renamed from: b */
    private final InterfaceC0733m f3097b;

    /* renamed from: c */
    private final C0752f f3098c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0749c(InterfaceC0733m interfaceC0733m, C0720ae c0720ae) {
        this.f3097b = interfaceC0733m;
        this.f3098c = C0752f.m2649a(c0720ae);
    }

    @Override // androidx.loader.p036a.AbstractC0747a
    /* renamed from: a */
    public final void mo2642a() {
        this.f3098c.m2651b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0470a.m1612a(this.f3097b, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.loader.p036a.AbstractC0747a
    @Deprecated
    /* renamed from: a */
    public final void mo2643a(String str, PrintWriter printWriter) {
        this.f3098c.m2650a(str, printWriter);
    }
}
