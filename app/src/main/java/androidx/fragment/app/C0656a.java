package androidx.fragment.app;

import android.util.Log;
import androidx.core.p023f.C0471b;
import androidx.lifecycle.EnumC0730j;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord.java */
/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0656a extends AbstractC0671ao implements InterfaceC0661ae {

    /* renamed from: a */
    final LayoutInflaterFactory2C0707s f2821a;

    /* renamed from: b */
    boolean f2822b;

    /* renamed from: c */
    int f2823c = -1;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2823c >= 0) {
            sb.append(" #");
            sb.append(this.f2823c);
        }
        if (this.f2861m != null) {
            sb.append(" ");
            sb.append(this.f2861m);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void m2342a(String str, PrintWriter printWriter) {
        m2343a(str, printWriter, true);
    }

    /* renamed from: a */
    public final void m2343a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2861m);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2823c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2822b);
            if (this.f2857i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2857i));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f2858j));
            }
            if (this.f2853e != 0 || this.f2854f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2853e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2854f));
            }
            if (this.f2855g != 0 || this.f2856h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2855g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2856h));
            }
            if (this.f2862n != 0 || this.f2863o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2862n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2863o);
            }
            if (this.f2864p != 0 || this.f2865q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2864p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2865q);
            }
        }
        if (this.f2852d.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2852d.size();
        for (int i = 0; i < size; i++) {
            C0672ap c0672ap = this.f2852d.get(i);
            switch (c0672ap.f2870a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0672ap.f2870a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0672ap.f2871b);
            if (z) {
                if (c0672ap.f2872c != 0 || c0672ap.f2873d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0672ap.f2872c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0672ap.f2873d));
                }
                if (c0672ap.f2874e != 0 || c0672ap.f2875f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0672ap.f2874e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0672ap.f2875f));
                }
            }
        }
    }

    public C0656a(LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s) {
        this.f2821a = layoutInflaterFactory2C0707s;
    }

    @Override // androidx.fragment.app.AbstractC0671ao
    /* renamed from: a */
    public final void mo2340a(int i, Fragment fragment, String str, int i2) {
        super.mo2340a(i, fragment, str, i2);
        fragment.f2734A = this.f2821a;
    }

    @Override // androidx.fragment.app.AbstractC0671ao
    /* renamed from: a */
    public final AbstractC0671ao mo2336a(Fragment fragment) {
        if (fragment.f2734A != null && fragment.f2734A != this.f2821a) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo2336a(fragment);
    }

    @Override // androidx.fragment.app.AbstractC0671ao
    /* renamed from: b */
    public final AbstractC0671ao mo2349b(Fragment fragment) {
        if (fragment.f2734A != null && fragment.f2734A != this.f2821a) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo2349b(fragment);
    }

    @Override // androidx.fragment.app.AbstractC0671ao
    /* renamed from: a */
    public final AbstractC0671ao mo2337a(Fragment fragment, EnumC0730j enumC0730j) {
        if (fragment.f2734A != this.f2821a) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f2821a);
        }
        if (!enumC0730j.m2611a(EnumC0730j.CREATED)) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + EnumC0730j.CREATED);
        }
        return super.mo2337a(fragment, enumC0730j);
    }

    /* renamed from: a */
    public final void m2339a(int i) {
        if (this.f2859k) {
            if (LayoutInflaterFactory2C0707s.f2988b) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f2852d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0672ap c0672ap = this.f2852d.get(i2);
                if (c0672ap.f2871b != null) {
                    c0672ap.f2871b.f2782z += i;
                    if (LayoutInflaterFactory2C0707s.f2988b) {
                        Log.v("FragmentManager", "Bump nesting of " + c0672ap.f2871b + " to " + c0672ap.f2871b.f2782z);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2338a() {
        if (this.f2869u != null) {
            for (int i = 0; i < this.f2869u.size(); i++) {
                this.f2869u.get(i).run();
            }
            this.f2869u = null;
        }
    }

    @Override // androidx.fragment.app.AbstractC0671ao
    /* renamed from: b */
    public final int mo2347b() {
        return m2333b(false);
    }

    @Override // androidx.fragment.app.AbstractC0671ao
    /* renamed from: c */
    public final int mo2351c() {
        return m2333b(true);
    }

    /* renamed from: b */
    private int m2333b(boolean z) {
        if (this.f2822b) {
            throw new IllegalStateException("commit already called");
        }
        if (LayoutInflaterFactory2C0707s.f2988b) {
            Log.v("FragmentManager", "Commit: ".concat(String.valueOf(this)));
            PrintWriter printWriter = new PrintWriter(new C0471b("FragmentManager"));
            m2342a("  ", printWriter);
            printWriter.close();
        }
        this.f2822b = true;
        if (this.f2859k) {
            this.f2823c = this.f2821a.m2537a(this);
        } else {
            this.f2823c = -1;
        }
        this.f2821a.m2546a(this, z);
        return this.f2823c;
    }

    @Override // androidx.fragment.app.InterfaceC0661ae
    /* renamed from: a */
    public final boolean mo2346a(ArrayList<C0656a> arrayList, ArrayList<Boolean> arrayList2) {
        if (LayoutInflaterFactory2C0707s.f2988b) {
            Log.v("FragmentManager", "Run: ".concat(String.valueOf(this)));
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2859k) {
            return true;
        }
        LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f2821a;
        if (layoutInflaterFactory2C0707s.f3001h == null) {
            layoutInflaterFactory2C0707s.f3001h = new ArrayList<>();
        }
        layoutInflaterFactory2C0707s.f3001h.add(this);
        return true;
    }

    /* renamed from: b */
    public final boolean m2350b(int i) {
        int size = this.f2852d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0672ap c0672ap = this.f2852d.get(i2);
            int i3 = c0672ap.f2871b != null ? c0672ap.f2871b.f2739F : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m2345a(ArrayList<C0656a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2852d.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0672ap c0672ap = this.f2852d.get(i4);
            int i5 = c0672ap.f2871b != null ? c0672ap.f2871b.f2739F : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0656a c0656a = arrayList.get(i6);
                    int size2 = c0656a.f2852d.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0672ap c0672ap2 = c0656a.f2852d.get(i7);
                        if ((c0672ap2.f2871b != null ? c0672ap2.f2871b.f2739F : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void m2353e() {
        int size = this.f2852d.size();
        for (int i = 0; i < size; i++) {
            C0672ap c0672ap = this.f2852d.get(i);
            Fragment fragment = c0672ap.f2871b;
            if (fragment != null) {
                fragment.m2276a(this.f2857i, this.f2858j);
            }
            int i2 = c0672ap.f2870a;
            if (i2 == 1) {
                fragment.m2291b(c0672ap.f2872c);
                this.f2821a.m2543a(fragment, false);
            } else {
                switch (i2) {
                    case 3:
                        fragment.m2291b(c0672ap.f2873d);
                        this.f2821a.m2561e(fragment);
                        break;
                    case 4:
                        fragment.m2291b(c0672ap.f2873d);
                        LayoutInflaterFactory2C0707s.m2517f(fragment);
                        break;
                    case 5:
                        fragment.m2291b(c0672ap.f2872c);
                        LayoutInflaterFactory2C0707s.m2518g(fragment);
                        break;
                    case 6:
                        fragment.m2291b(c0672ap.f2873d);
                        this.f2821a.m2563h(fragment);
                        break;
                    case 7:
                        fragment.m2291b(c0672ap.f2872c);
                        this.f2821a.m2565i(fragment);
                        break;
                    case 8:
                        this.f2821a.m2566j(fragment);
                        break;
                    case 9:
                        this.f2821a.m2566j(null);
                        break;
                    case 10:
                        this.f2821a.m2542a(fragment, c0672ap.f2877h);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + c0672ap.f2870a);
                }
            }
            if (!this.f2868t && c0672ap.f2870a != 1 && fragment != null) {
                this.f2821a.m2559c(fragment);
            }
        }
        if (this.f2868t) {
            return;
        }
        this.f2821a.m2538a(this.f2821a.f3006m, true);
    }

    /* renamed from: a */
    public final void m2344a(boolean z) {
        for (int size = this.f2852d.size() - 1; size >= 0; size--) {
            C0672ap c0672ap = this.f2852d.get(size);
            Fragment fragment = c0672ap.f2871b;
            if (fragment != null) {
                fragment.m2276a(LayoutInflaterFactory2C0707s.m2505b(this.f2857i), this.f2858j);
            }
            int i = c0672ap.f2870a;
            if (i == 1) {
                fragment.m2291b(c0672ap.f2875f);
                this.f2821a.m2561e(fragment);
            } else {
                switch (i) {
                    case 3:
                        fragment.m2291b(c0672ap.f2874e);
                        this.f2821a.m2543a(fragment, false);
                        break;
                    case 4:
                        fragment.m2291b(c0672ap.f2874e);
                        LayoutInflaterFactory2C0707s.m2518g(fragment);
                        break;
                    case 5:
                        fragment.m2291b(c0672ap.f2875f);
                        LayoutInflaterFactory2C0707s.m2517f(fragment);
                        break;
                    case 6:
                        fragment.m2291b(c0672ap.f2874e);
                        this.f2821a.m2565i(fragment);
                        break;
                    case 7:
                        fragment.m2291b(c0672ap.f2875f);
                        this.f2821a.m2563h(fragment);
                        break;
                    case 8:
                        this.f2821a.m2566j(null);
                        break;
                    case 9:
                        this.f2821a.m2566j(fragment);
                        break;
                    case 10:
                        this.f2821a.m2542a(fragment, c0672ap.f2876g);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + c0672ap.f2870a);
                }
            }
            if (!this.f2868t && c0672ap.f2870a != 3 && fragment != null) {
                this.f2821a.m2559c(fragment);
            }
        }
        if (this.f2868t || !z) {
            return;
        }
        this.f2821a.m2538a(this.f2821a.f3006m, true);
    }

    /* renamed from: a */
    public final Fragment m2335a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f2852d.size()) {
            C0672ap c0672ap = this.f2852d.get(i);
            switch (c0672ap.f2870a) {
                case 1:
                case 7:
                    arrayList.add(c0672ap.f2871b);
                    break;
                case 2:
                    Fragment fragment3 = c0672ap.f2871b;
                    int i2 = fragment3.f2739F;
                    Fragment fragment4 = fragment2;
                    int i3 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = arrayList.get(size);
                        if (fragment5.f2739F == i2) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f2852d.add(i3, new C0672ap(9, fragment5));
                                    i3++;
                                    fragment4 = null;
                                }
                                C0672ap c0672ap2 = new C0672ap(3, fragment5);
                                c0672ap2.f2872c = c0672ap.f2872c;
                                c0672ap2.f2874e = c0672ap.f2874e;
                                c0672ap2.f2873d = c0672ap.f2873d;
                                c0672ap2.f2875f = c0672ap.f2875f;
                                this.f2852d.add(i3, c0672ap2);
                                arrayList.remove(fragment5);
                                i3++;
                            }
                        }
                    }
                    if (z) {
                        this.f2852d.remove(i3);
                        i = i3 - 1;
                    } else {
                        c0672ap.f2870a = 1;
                        arrayList.add(fragment3);
                        i = i3;
                    }
                    fragment2 = fragment4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(c0672ap.f2871b);
                    if (c0672ap.f2871b == fragment2) {
                        this.f2852d.add(i, new C0672ap(9, c0672ap.f2871b));
                        i++;
                        fragment2 = null;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    this.f2852d.add(i, new C0672ap(9, fragment2));
                    i++;
                    fragment2 = c0672ap.f2871b;
                    break;
            }
            i++;
        }
        return fragment2;
    }

    /* renamed from: b */
    public final Fragment m2348b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2852d.size() - 1; size >= 0; size--) {
            C0672ap c0672ap = this.f2852d.get(size);
            int i = c0672ap.f2870a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c0672ap.f2871b;
                            break;
                        case 10:
                            c0672ap.f2877h = c0672ap.f2876g;
                            break;
                    }
                }
                arrayList.add(c0672ap.f2871b);
            }
            arrayList.remove(c0672ap.f2871b);
        }
        return fragment;
    }

    /* renamed from: f */
    public final boolean m2354f() {
        for (int i = 0; i < this.f2852d.size(); i++) {
            if (m2334b(this.f2852d.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m2341a(InterfaceC0698j interfaceC0698j) {
        for (int i = 0; i < this.f2852d.size(); i++) {
            C0672ap c0672ap = this.f2852d.get(i);
            if (m2334b(c0672ap)) {
                c0672ap.f2871b.m2282a(interfaceC0698j);
            }
        }
    }

    /* renamed from: b */
    private static boolean m2334b(C0672ap c0672ap) {
        Fragment fragment = c0672ap.f2871b;
        return (fragment == null || !fragment.f2776t || fragment.f2748O == null || fragment.f2742I || fragment.f2741H || !fragment.m2288ab()) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0671ao
    /* renamed from: g */
    public final boolean mo2355g() {
        return this.f2852d.isEmpty();
    }

    @Override // androidx.fragment.app.AbstractC0671ao
    /* renamed from: d */
    public final void mo2352d() {
        if (this.f2859k) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2860l = false;
        this.f2821a.m2545a((InterfaceC0661ae) this);
    }
}
