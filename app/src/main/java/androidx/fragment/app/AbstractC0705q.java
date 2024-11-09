package androidx.fragment.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: FragmentManager.java */
/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public abstract class AbstractC0705q {

    /* renamed from: a */
    static final C0703o f2984a = new C0703o();

    /* renamed from: b */
    private C0703o f2985b = null;

    /* renamed from: a */
    public abstract Fragment mo2472a(String str);

    /* renamed from: a */
    public abstract AbstractC0671ao mo2473a();

    /* renamed from: a */
    public abstract void mo2474a(int i);

    /* renamed from: a */
    public abstract void mo2476a(AbstractC0706r abstractC0706r);

    /* renamed from: a */
    public abstract void mo2477a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract void mo2478b(AbstractC0706r abstractC0706r);

    /* renamed from: b */
    public abstract boolean mo2479b();

    /* renamed from: c */
    public abstract boolean mo2480c();

    /* renamed from: d */
    public abstract List<Fragment> mo2481d();

    /* renamed from: e */
    public abstract boolean mo2482e();

    /* renamed from: g */
    public abstract boolean mo2484g();

    /* renamed from: a */
    public final void m2475a(C0703o c0703o) {
        this.f2985b = c0703o;
    }

    /* renamed from: f */
    public C0703o mo2483f() {
        if (this.f2985b == null) {
            this.f2985b = f2984a;
        }
        return this.f2985b;
    }
}
