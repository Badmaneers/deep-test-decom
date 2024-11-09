package androidx.loader.p036a;

import androidx.lifecycle.AbstractC0716aa;
import androidx.lifecycle.C0717ab;
import androidx.lifecycle.C0720ae;
import androidx.lifecycle.InterfaceC0718ac;
import androidx.p011b.C0329o;
import java.io.PrintWriter;

/* compiled from: LoaderManagerImpl.java */
/* renamed from: androidx.loader.a.f */
/* loaded from: classes.dex */
class C0752f extends AbstractC0716aa {

    /* renamed from: a */
    private static final InterfaceC0718ac f3108a = new C0753g();

    /* renamed from: b */
    private C0329o<C0750d> f3109b = new C0329o<>();

    /* renamed from: c */
    private boolean f3110c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0752f m2649a(C0720ae c0720ae) {
        return (C0752f) new C0717ab(c0720ae, f3108a).m2600a(C0752f.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m2651b() {
        int m1069b = this.f3109b.m1069b();
        for (int i = 0; i < m1069b; i++) {
            this.f3109b.m1075d(i).m2645e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC0716aa
    /* renamed from: a */
    public final void mo2362a() {
        super.mo2362a();
        int m1069b = this.f3109b.m1069b();
        for (int i = 0; i < m1069b; i++) {
            this.f3109b.m1075d(i).m2646f();
        }
        this.f3109b.m1073c();
    }

    /* renamed from: a */
    public final void m2650a(String str, PrintWriter printWriter) {
        if (this.f3109b.m1069b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.f3109b.m1069b(); i++) {
                C0750d m1075d = this.f3109b.m1075d(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f3109b.m1072c(i));
                printWriter.print(": ");
                printWriter.println(m1075d.toString());
                m1075d.m2644a(str2, printWriter);
            }
        }
    }
}
