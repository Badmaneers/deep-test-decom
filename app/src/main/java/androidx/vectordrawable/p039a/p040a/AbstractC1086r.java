package androidx.vectordrawable.p039a.p040a;

import android.graphics.Path;
import androidx.core.graphics.C0543b;
import androidx.core.graphics.C0545d;

/* compiled from: VectorDrawableCompat.java */
/* renamed from: androidx.vectordrawable.a.a.r */
/* loaded from: classes.dex */
abstract class AbstractC1086r extends AbstractC1085q {

    /* renamed from: l */
    protected C0545d[] f4324l;

    /* renamed from: m */
    String f4325m;

    /* renamed from: n */
    int f4326n;

    /* renamed from: o */
    int f4327o;

    /* renamed from: a */
    public boolean mo3609a() {
        return false;
    }

    public AbstractC1086r() {
        super((byte) 0);
        this.f4324l = null;
        this.f4326n = 0;
    }

    public AbstractC1086r(AbstractC1086r abstractC1086r) {
        super((byte) 0);
        this.f4324l = null;
        this.f4326n = 0;
        this.f4325m = abstractC1086r.f4325m;
        this.f4327o = abstractC1086r.f4327o;
        this.f4324l = C0543b.m1910a(abstractC1086r.f4324l);
    }

    /* renamed from: a */
    public final void m3615a(Path path) {
        path.reset();
        if (this.f4324l != null) {
            C0545d.m1915a(this.f4324l, path);
        }
    }

    public String getPathName() {
        return this.f4325m;
    }

    public C0545d[] getPathData() {
        return this.f4324l;
    }

    public void setPathData(C0545d[] c0545dArr) {
        if (!C0543b.m1908a(this.f4324l, c0545dArr)) {
            this.f4324l = C0543b.m1910a(c0545dArr);
            return;
        }
        C0545d[] c0545dArr2 = this.f4324l;
        for (int i = 0; i < c0545dArr.length; i++) {
            c0545dArr2[i].f2397a = c0545dArr[i].f2397a;
            for (int i2 = 0; i2 < c0545dArr[i].f2398b.length; i2++) {
                c0545dArr2[i].f2398b[i2] = c0545dArr[i].f2398b[i2];
            }
        }
    }
}
