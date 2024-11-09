package androidx.fragment.app;

import androidx.lifecycle.EnumC0730j;

/* compiled from: FragmentTransaction.java */
/* renamed from: androidx.fragment.app.ap */
/* loaded from: classes.dex */
public final class C0672ap {

    /* renamed from: a */
    int f2870a;

    /* renamed from: b */
    Fragment f2871b;

    /* renamed from: c */
    int f2872c;

    /* renamed from: d */
    int f2873d;

    /* renamed from: e */
    int f2874e;

    /* renamed from: f */
    int f2875f;

    /* renamed from: g */
    EnumC0730j f2876g;

    /* renamed from: h */
    EnumC0730j f2877h;

    public C0672ap() {
    }

    public C0672ap(int i, Fragment fragment) {
        this.f2870a = i;
        this.f2871b = fragment;
        this.f2876g = EnumC0730j.RESUMED;
        this.f2877h = EnumC0730j.RESUMED;
    }

    public C0672ap(Fragment fragment, EnumC0730j enumC0730j) {
        this.f2870a = 10;
        this.f2871b = fragment;
        this.f2876g = fragment.f2759Z;
        this.f2877h = enumC0730j;
    }
}
