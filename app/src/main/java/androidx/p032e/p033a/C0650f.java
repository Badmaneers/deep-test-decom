package androidx.p032e.p033a;

import android.content.Context;

/* compiled from: SupportSQLiteOpenHelper.java */
/* renamed from: androidx.e.a.f */
/* loaded from: classes.dex */
public final class C0650f {

    /* renamed from: a */
    Context f2715a;

    /* renamed from: b */
    String f2716b;

    /* renamed from: c */
    AbstractC0648d f2717c;

    /* renamed from: a */
    public final C0649e m2240a() {
        if (this.f2717c == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (this.f2715a == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return new C0649e(this.f2715a, this.f2716b, this.f2717c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0650f(Context context) {
        this.f2715a = context;
    }

    /* renamed from: a */
    public final C0650f m2242a(String str) {
        this.f2716b = str;
        return this;
    }

    /* renamed from: a */
    public final C0650f m2241a(AbstractC0648d abstractC0648d) {
        this.f2717c = abstractC0648d;
        return this;
    }
}
