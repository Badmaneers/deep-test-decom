package androidx.fragment.app;

import androidx.lifecycle.EnumC0730j;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* renamed from: androidx.fragment.app.ao */
/* loaded from: classes.dex */
public abstract class AbstractC0671ao {

    /* renamed from: e */
    int f2853e;

    /* renamed from: f */
    int f2854f;

    /* renamed from: g */
    int f2855g;

    /* renamed from: h */
    int f2856h;

    /* renamed from: i */
    int f2857i;

    /* renamed from: j */
    int f2858j;

    /* renamed from: k */
    boolean f2859k;

    /* renamed from: m */
    String f2861m;

    /* renamed from: n */
    int f2862n;

    /* renamed from: o */
    CharSequence f2863o;

    /* renamed from: p */
    int f2864p;

    /* renamed from: q */
    CharSequence f2865q;

    /* renamed from: r */
    ArrayList<String> f2866r;

    /* renamed from: s */
    ArrayList<String> f2867s;

    /* renamed from: u */
    ArrayList<Runnable> f2869u;

    /* renamed from: d */
    ArrayList<C0672ap> f2852d = new ArrayList<>();

    /* renamed from: l */
    boolean f2860l = true;

    /* renamed from: t */
    boolean f2868t = false;

    /* renamed from: b */
    public abstract int mo2347b();

    /* renamed from: c */
    public abstract int mo2351c();

    /* renamed from: d */
    public abstract void mo2352d();

    /* renamed from: a */
    public final void m2375a(C0672ap c0672ap) {
        this.f2852d.add(c0672ap);
        c0672ap.f2872c = this.f2853e;
        c0672ap.f2873d = this.f2854f;
        c0672ap.f2874e = this.f2855g;
        c0672ap.f2875f = this.f2856h;
    }

    /* renamed from: a */
    public final AbstractC0671ao m2374a(Fragment fragment, String str) {
        mo2340a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public final AbstractC0671ao m2373a(int i, Fragment fragment, String str) {
        mo2340a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public void mo2340a(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            if (fragment.f2740G != null && !str.equals(fragment.f2740G)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2740G + " now " + str);
            }
            fragment.f2740G = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            if (fragment.f2738E != 0 && fragment.f2738E != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2738E + " now " + i);
            }
            fragment.f2738E = i;
            fragment.f2739F = i;
        }
        m2375a(new C0672ap(i2, fragment));
    }

    /* renamed from: a */
    public AbstractC0671ao mo2336a(Fragment fragment) {
        m2375a(new C0672ap(3, fragment));
        return this;
    }

    /* renamed from: b */
    public AbstractC0671ao mo2349b(Fragment fragment) {
        m2375a(new C0672ap(6, fragment));
        return this;
    }

    /* renamed from: c */
    public final AbstractC0671ao m2376c(Fragment fragment) {
        m2375a(new C0672ap(7, fragment));
        return this;
    }

    /* renamed from: a */
    public AbstractC0671ao mo2337a(Fragment fragment, EnumC0730j enumC0730j) {
        m2375a(new C0672ap(fragment, enumC0730j));
        return this;
    }

    /* renamed from: g */
    public boolean mo2355g() {
        return this.f2852d.isEmpty();
    }

    /* renamed from: a */
    public final AbstractC0671ao m2372a(int i, Fragment fragment) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo2340a(i, fragment, null, 2);
        return this;
    }
}
