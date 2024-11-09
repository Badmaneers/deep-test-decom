package androidx.loader.p037b;

import androidx.core.p023f.C0470a;
import java.io.PrintWriter;

/* compiled from: Loader.java */
/* renamed from: androidx.loader.b.a */
/* loaded from: classes.dex */
public final class C0754a<D> {

    /* renamed from: a */
    int f3111a;

    /* renamed from: b */
    InterfaceC0755b<D> f3112b;

    /* renamed from: c */
    boolean f3113c;

    /* renamed from: d */
    boolean f3114d;

    /* renamed from: e */
    boolean f3115e;

    /* renamed from: f */
    boolean f3116f;

    /* renamed from: g */
    boolean f3117g;

    /* renamed from: a */
    public final void m2654a(InterfaceC0755b<D> interfaceC0755b) {
        if (this.f3112b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.f3112b != interfaceC0755b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f3112b = null;
    }

    /* renamed from: a */
    public final void m2653a() {
        this.f3113c = true;
        this.f3115e = false;
        this.f3114d = false;
    }

    /* renamed from: b */
    public final void m2656b() {
        this.f3113c = false;
    }

    /* renamed from: c */
    public final void m2657c() {
        this.f3114d = true;
    }

    /* renamed from: d */
    public final void m2658d() {
        this.f3115e = true;
        this.f3113c = false;
        this.f3114d = false;
        this.f3116f = false;
        this.f3117g = false;
    }

    /* renamed from: a */
    public static String m2652a(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0470a.m1612a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0470a.m1612a(this, sb);
        sb.append(" id=");
        sb.append(this.f3111a);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public final void m2655a(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f3111a);
        printWriter.print(" mListener=");
        printWriter.println(this.f3112b);
        if (this.f3113c || this.f3116f || this.f3117g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f3113c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f3116f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f3117g);
        }
        if (this.f3114d || this.f3115e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f3114d);
            printWriter.print(" mReset=");
            printWriter.println(this.f3115e);
        }
    }
}
