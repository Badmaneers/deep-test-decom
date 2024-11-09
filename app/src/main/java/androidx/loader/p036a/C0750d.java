package androidx.loader.p036a;

import android.os.Bundle;
import android.util.Log;
import androidx.core.p023f.C0470a;
import androidx.lifecycle.C0742v;
import androidx.lifecycle.InterfaceC0733m;
import androidx.lifecycle.InterfaceC0743w;
import androidx.loader.p037b.C0754a;
import androidx.loader.p037b.InterfaceC0755b;
import java.io.PrintWriter;

/* compiled from: LoaderManagerImpl.java */
/* renamed from: androidx.loader.a.d */
/* loaded from: classes.dex */
public final class C0750d<D> extends C0742v<D> implements InterfaceC0755b<D> {

    /* renamed from: e */
    private final int f3099e;

    /* renamed from: f */
    private final Bundle f3100f;

    /* renamed from: g */
    private final C0754a<D> f3101g;

    /* renamed from: h */
    private InterfaceC0733m f3102h;

    /* renamed from: i */
    private C0751e<D> f3103i;

    /* renamed from: j */
    private C0754a<D> f3104j;

    @Override // androidx.lifecycle.LiveData
    /* renamed from: b */
    protected final void mo2588b() {
        if (C0749c.f3096a) {
            Log.v("LoaderManager", "  Starting: ".concat(String.valueOf(this)));
        }
        this.f3101g.m2653a();
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: c */
    protected final void mo2589c() {
        if (C0749c.f3096a) {
            Log.v("LoaderManager", "  Stopping: ".concat(String.valueOf(this)));
        }
        this.f3101g.m2656b();
    }

    /* renamed from: e */
    public final void m2645e() {
        InterfaceC0733m interfaceC0733m = this.f3102h;
        C0751e<D> c0751e = this.f3103i;
        if (interfaceC0733m == null || c0751e == null) {
            return;
        }
        super.mo2586a((InterfaceC0743w) c0751e);
        m2584a(interfaceC0733m, c0751e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: a */
    public final void mo2586a(InterfaceC0743w<? super D> interfaceC0743w) {
        super.mo2586a((InterfaceC0743w) interfaceC0743w);
        this.f3102h = null;
        this.f3103i = null;
    }

    /* renamed from: f */
    public final C0754a<D> m2646f() {
        if (C0749c.f3096a) {
            Log.v("LoaderManager", "  Destroying: ".concat(String.valueOf(this)));
        }
        this.f3101g.m2657c();
        C0751e<D> c0751e = this.f3103i;
        if (c0751e != null) {
            mo2586a((InterfaceC0743w) c0751e);
            c0751e.m2647a();
        }
        this.f3101g.m2654a((InterfaceC0755b) this);
        this.f3101g.m2658d();
        return this.f3104j;
    }

    @Override // androidx.lifecycle.C0742v, androidx.lifecycle.LiveData
    /* renamed from: a */
    public final void mo2587a(D d) {
        super.mo2587a((C0750d<D>) d);
        if (this.f3104j != null) {
            this.f3104j.m2658d();
            this.f3104j = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.f3099e);
        sb.append(" : ");
        C0470a.m1612a(this.f3101g, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void m2644a(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f3099e);
        printWriter.print(" mArgs=");
        printWriter.println(this.f3100f);
        printWriter.print(str);
        printWriter.print("mLoader=");
        printWriter.println(this.f3101g);
        this.f3101g.m2655a(str + "  ", printWriter);
        if (this.f3103i != null) {
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f3103i);
            this.f3103i.m2648a(str + "  ", printWriter);
        }
        printWriter.print(str);
        printWriter.print("mData=");
        printWriter.println(C0754a.m2652a(m2583a()));
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.println(m2590d());
    }
}
