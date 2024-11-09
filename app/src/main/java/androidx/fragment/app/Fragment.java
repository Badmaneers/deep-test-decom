package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.AbstractC0415m;
import androidx.core.p023f.C0470a;
import androidx.core.p024g.C0524i;
import androidx.lifecycle.AbstractC0728h;
import androidx.lifecycle.C0720ae;
import androidx.lifecycle.C0734n;
import androidx.lifecycle.C0742v;
import androidx.lifecycle.EnumC0729i;
import androidx.lifecycle.EnumC0730j;
import androidx.lifecycle.InterfaceC0721af;
import androidx.lifecycle.InterfaceC0731k;
import androidx.lifecycle.InterfaceC0733m;
import androidx.loader.p036a.AbstractC0747a;
import androidx.savedstate.C0970a;
import androidx.savedstate.C0973d;
import androidx.savedstate.InterfaceC0974e;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0721af, InterfaceC0733m, InterfaceC0974e {

    /* renamed from: j */
    static final Object f2733j = new Object();

    /* renamed from: A */
    LayoutInflaterFactory2C0707s f2734A;

    /* renamed from: B */
    AbstractC0704p f2735B;

    /* renamed from: D */
    Fragment f2737D;

    /* renamed from: E */
    int f2738E;

    /* renamed from: F */
    int f2739F;

    /* renamed from: G */
    String f2740G;

    /* renamed from: H */
    boolean f2741H;

    /* renamed from: I */
    boolean f2742I;

    /* renamed from: J */
    boolean f2743J;

    /* renamed from: K */
    boolean f2744K;

    /* renamed from: L */
    boolean f2745L;

    /* renamed from: N */
    ViewGroup f2747N;

    /* renamed from: O */
    View f2748O;

    /* renamed from: P */
    View f2749P;

    /* renamed from: Q */
    boolean f2750Q;

    /* renamed from: S */
    C0696h f2752S;

    /* renamed from: U */
    boolean f2754U;

    /* renamed from: V */
    boolean f2755V;

    /* renamed from: W */
    float f2756W;

    /* renamed from: X */
    LayoutInflater f2757X;

    /* renamed from: Y */
    boolean f2758Y;

    /* renamed from: aa */
    C0734n f2761aa;

    /* renamed from: ab */
    C0689bf f2762ab;

    /* renamed from: ad */
    C0973d f2764ad;

    /* renamed from: b */
    private boolean f2765b;

    /* renamed from: c */
    private int f2766c;

    /* renamed from: l */
    Bundle f2768l;

    /* renamed from: m */
    SparseArray<Parcelable> f2769m;

    /* renamed from: n */
    Boolean f2770n;

    /* renamed from: p */
    Bundle f2772p;

    /* renamed from: q */
    Fragment f2773q;

    /* renamed from: s */
    int f2775s;

    /* renamed from: t */
    boolean f2776t;

    /* renamed from: u */
    boolean f2777u;

    /* renamed from: v */
    boolean f2778v;

    /* renamed from: w */
    boolean f2779w;

    /* renamed from: x */
    boolean f2780x;

    /* renamed from: y */
    boolean f2781y;

    /* renamed from: z */
    int f2782z;

    /* renamed from: k */
    int f2767k = 0;

    /* renamed from: o */
    String f2771o = UUID.randomUUID().toString();

    /* renamed from: r */
    String f2774r = null;

    /* renamed from: a */
    private Boolean f2760a = null;

    /* renamed from: C */
    LayoutInflaterFactory2C0707s f2736C = new LayoutInflaterFactory2C0707s();

    /* renamed from: M */
    boolean f2746M = true;

    /* renamed from: R */
    boolean f2751R = true;

    /* renamed from: T */
    Runnable f2753T = new RunnableC0693e(this);

    /* renamed from: Z */
    EnumC0730j f2759Z = EnumC0730j.RESUMED;

    /* renamed from: ac */
    C0742v<InterfaceC0733m> f2763ac = new C0742v<>();

    /* renamed from: d */
    public void mo2299d(Bundle bundle) {
    }

    @Override // androidx.lifecycle.InterfaceC0733m
    /* renamed from: a */
    public final AbstractC0728h mo31a() {
        return this.f2761aa;
    }

    @Override // androidx.lifecycle.InterfaceC0721af
    /* renamed from: b */
    public final C0720ae mo32b() {
        if (this.f2734A == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        return this.f2734A.m2555b(this);
    }

    @Override // androidx.savedstate.InterfaceC0974e
    /* renamed from: d */
    public final C0970a mo34d() {
        return this.f2764ad.m3422a();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0699k();

        /* renamed from: a */
        final Bundle f2784a;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f2784a = parcel.readBundle();
            if (classLoader == null || this.f2784a == null) {
                return;
            }
            this.f2784a.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f2784a);
        }
    }

    public Fragment() {
        m2245c();
    }

    /* renamed from: c */
    private void m2245c() {
        this.f2761aa = new C0734n(this);
        this.f2764ad = C0973d.m3421a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2761aa.mo2609a(new InterfaceC0731k() { // from class: androidx.fragment.app.Fragment.2
                C06552() {
                }

                @Override // androidx.lifecycle.InterfaceC0731k
                /* renamed from: a */
                public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
                    if (enumC0729i != EnumC0729i.ON_STOP || Fragment.this.f2748O == null) {
                        return;
                    }
                    Fragment.this.f2748O.cancelPendingInputEvents();
                }
            });
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$2 */
    /* loaded from: classes.dex */
    public class C06552 implements InterfaceC0731k {
        C06552() {
        }

        @Override // androidx.lifecycle.InterfaceC0731k
        /* renamed from: a */
        public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
            if (enumC0729i != EnumC0729i.ON_STOP || Fragment.this.f2748O == null) {
                return;
            }
            Fragment.this.f2748O.cancelPendingInputEvents();
        }
    }

    @Deprecated
    /* renamed from: a */
    public static Fragment m2244a(Context context, String str) {
        try {
            return C0703o.m2466b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new C0697i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0697i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0697i("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0697i("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: k */
    public final void m2310k() {
        if (this.f2769m != null) {
            this.f2749P.restoreHierarchyState(this.f2769m);
            this.f2769m = null;
        }
        this.f2765b = false;
        this.f2765b = true;
        if (!this.f2765b) {
            throw new C0690bg("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
        if (this.f2748O != null) {
            this.f2762ab.m2424a(EnumC0729i.ON_CREATE);
        }
    }

    /* renamed from: l */
    public final boolean m2311l() {
        return this.f2782z > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0470a.m1612a(this, sb);
        sb.append(" (");
        sb.append(this.f2771o);
        sb.append(")");
        if (this.f2738E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2738E));
        }
        if (this.f2740G != null) {
            sb.append(" ");
            sb.append(this.f2740G);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: e */
    public final void m2301e(Bundle bundle) {
        if (this.f2734A != null) {
            if (this.f2734A == null ? false : this.f2734A.mo2484g()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f2772p = bundle;
    }

    /* renamed from: m */
    public final Bundle m2312m() {
        return this.f2772p;
    }

    /* renamed from: n */
    public final Context m2313n() {
        if (this.f2735B == null) {
            return null;
        }
        return this.f2735B.m2470k();
    }

    /* renamed from: o */
    public final Context m2314o() {
        Context m2313n = m2313n();
        if (m2313n != null) {
            return m2313n;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: p */
    public final FragmentActivity m2315p() {
        if (this.f2735B == null) {
            return null;
        }
        return (FragmentActivity) this.f2735B.m2469j();
    }

    /* renamed from: q */
    public final Object m2316q() {
        if (this.f2735B == null) {
            return null;
        }
        return this.f2735B.mo2439i();
    }

    /* renamed from: r */
    public final Resources m2317r() {
        return m2314o().getResources();
    }

    /* renamed from: t */
    public final AbstractC0705q m2319t() {
        if (this.f2735B == null) {
            throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
        }
        return this.f2736C;
    }

    /* renamed from: u */
    public final boolean m2320u() {
        return this.f2735B != null && this.f2776t;
    }

    /* renamed from: a */
    public final void m2283a(boolean z) {
        if (this.f2746M != z) {
            this.f2746M = z;
            if (this.f2745L && m2320u() && !this.f2741H) {
                this.f2735B.mo2436f();
            }
        }
    }

    /* renamed from: f */
    public final LayoutInflater m2302f(Bundle bundle) {
        this.f2757X = mo2290b(bundle);
        return this.f2757X;
    }

    /* renamed from: v */
    public final void m2321v() {
        this.f2765b = true;
        if ((this.f2735B == null ? null : this.f2735B.m2469j()) != null) {
            this.f2765b = false;
            this.f2765b = true;
        }
    }

    /* renamed from: a */
    public void mo2278a(Context context) {
        this.f2765b = true;
        if ((this.f2735B == null ? null : this.f2735B.m2469j()) != null) {
            this.f2765b = false;
            this.f2765b = true;
        }
    }

    /* renamed from: a */
    public void mo2280a(Bundle bundle) {
        this.f2765b = true;
        m2304g(bundle);
        if (this.f2736C.f3006m > 0) {
            return;
        }
        this.f2736C.m2570m();
    }

    /* renamed from: g */
    public final void m2304g(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f2736C.m2540a(parcelable);
        this.f2736C.m2570m();
    }

    /* renamed from: a */
    public View mo2273a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f2766c != 0) {
            return layoutInflater.inflate(this.f2766c, viewGroup, false);
        }
        return null;
    }

    /* renamed from: w */
    public final View m2322w() {
        return this.f2748O;
    }

    /* renamed from: c */
    public void mo2297c(Bundle bundle) {
        this.f2765b = true;
    }

    /* renamed from: h */
    public void mo2305h() {
        this.f2765b = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f2765b = true;
    }

    /* renamed from: i */
    public void mo2307i() {
        this.f2765b = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f2765b = true;
    }

    /* renamed from: j */
    public void mo2309j() {
        this.f2765b = true;
    }

    /* renamed from: y */
    public final void m2324y() {
        m2245c();
        this.f2771o = UUID.randomUUID().toString();
        this.f2776t = false;
        this.f2777u = false;
        this.f2778v = false;
        this.f2779w = false;
        this.f2780x = false;
        this.f2782z = 0;
        this.f2734A = null;
        this.f2736C = new LayoutInflaterFactory2C0707s();
        this.f2735B = null;
        this.f2738E = 0;
        this.f2739F = 0;
        this.f2740G = null;
        this.f2741H = false;
        this.f2742I = false;
    }

    /* renamed from: f */
    public void mo2303f() {
        this.f2765b = true;
    }

    /* renamed from: z */
    public final Object m2325z() {
        if (this.f2752S == null) {
            return null;
        }
        return this.f2752S.f2963g;
    }

    /* renamed from: A */
    public final Object m2247A() {
        if (this.f2752S == null) {
            return null;
        }
        return this.f2752S.f2964h == f2733j ? m2325z() : this.f2752S.f2964h;
    }

    /* renamed from: B */
    public final Object m2248B() {
        if (this.f2752S == null) {
            return null;
        }
        return this.f2752S.f2965i;
    }

    /* renamed from: C */
    public final Object m2249C() {
        if (this.f2752S == null) {
            return null;
        }
        return this.f2752S.f2966j == f2733j ? m2248B() : this.f2752S.f2966j;
    }

    /* renamed from: D */
    public final Object m2250D() {
        if (this.f2752S == null) {
            return null;
        }
        return this.f2752S.f2967k;
    }

    /* renamed from: E */
    public final Object m2251E() {
        if (this.f2752S == null) {
            return null;
        }
        return this.f2752S.f2968l == f2733j ? m2250D() : this.f2752S.f2968l;
    }

    /* renamed from: F */
    public final boolean m2252F() {
        if (this.f2752S == null || this.f2752S.f2970n == null) {
            return true;
        }
        return this.f2752S.f2970n.booleanValue();
    }

    /* renamed from: G */
    public final boolean m2253G() {
        if (this.f2752S == null || this.f2752S.f2969m == null) {
            return true;
        }
        return this.f2752S.f2969m.booleanValue();
    }

    /* renamed from: H */
    public final void m2254H() {
        if (this.f2734A == null || this.f2734A.f3007n == null) {
            m2246e().f2973q = false;
        } else if (Looper.myLooper() != this.f2734A.f3007n.m2471l().getLooper()) {
            this.f2734A.f3007n.m2471l().postAtFrontOfQueue(new RunnableC0694f(this));
        } else {
            m2255I();
        }
    }

    /* renamed from: I */
    public final void m2255I() {
        InterfaceC0698j interfaceC0698j;
        if (this.f2752S == null) {
            interfaceC0698j = null;
        } else {
            this.f2752S.f2973q = false;
            interfaceC0698j = this.f2752S.f2974r;
            this.f2752S.f2974r = null;
        }
        if (interfaceC0698j != null) {
            interfaceC0698j.mo2356a();
        }
    }

    /* renamed from: a */
    public final Fragment m2274a(String str) {
        return str.equals(this.f2771o) ? this : this.f2736C.m2554b(str);
    }

    /* renamed from: J */
    public final void m2256J() {
        this.f2736C.m2547a(this.f2735B, new C0695g(this), this);
        this.f2765b = false;
        mo2278a(this.f2735B.m2470k());
        if (this.f2765b) {
            return;
        }
        throw new C0690bg("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* renamed from: h */
    public final void m2306h(Bundle bundle) {
        this.f2736C.m2569l();
        this.f2767k = 1;
        this.f2765b = false;
        this.f2764ad.m3423a(bundle);
        mo2280a(bundle);
        this.f2758Y = true;
        if (!this.f2765b) {
            throw new C0690bg("Fragment " + this + " did not call through to super.onCreate()");
        }
        this.f2761aa.m2623a(EnumC0729i.ON_CREATE);
    }

    /* renamed from: b */
    public final void m2292b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f2736C.m2569l();
        this.f2781y = true;
        this.f2762ab = new C0689bf();
        this.f2748O = mo2273a(layoutInflater, viewGroup);
        if (this.f2748O != null) {
            this.f2762ab.m2425b();
            this.f2763ac.mo2587a((C0742v<InterfaceC0733m>) this.f2762ab);
        } else {
            if (this.f2762ab.m2426c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f2762ab = null;
        }
    }

    /* renamed from: i */
    public final void m2308i(Bundle bundle) {
        this.f2736C.m2569l();
        this.f2767k = 2;
        this.f2765b = false;
        mo2297c(bundle);
        if (!this.f2765b) {
            throw new C0690bg("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        this.f2736C.m2571n();
    }

    /* renamed from: K */
    public final void m2257K() {
        this.f2736C.m2569l();
        this.f2736C.m2567j();
        this.f2767k = 3;
        this.f2765b = false;
        mo2305h();
        if (!this.f2765b) {
            throw new C0690bg("Fragment " + this + " did not call through to super.onStart()");
        }
        this.f2761aa.m2623a(EnumC0729i.ON_START);
        if (this.f2748O != null) {
            this.f2762ab.m2424a(EnumC0729i.ON_START);
        }
        this.f2736C.m2572o();
    }

    /* renamed from: L */
    public final void m2258L() {
        this.f2736C.m2569l();
        this.f2736C.m2567j();
        this.f2767k = 4;
        this.f2765b = false;
        this.f2765b = true;
        if (!this.f2765b) {
            throw new C0690bg("Fragment " + this + " did not call through to super.onResume()");
        }
        this.f2761aa.m2623a(EnumC0729i.ON_RESUME);
        if (this.f2748O != null) {
            this.f2762ab.m2424a(EnumC0729i.ON_RESUME);
        }
        this.f2736C.m2573p();
        this.f2736C.m2567j();
    }

    /* renamed from: M */
    public final void m2259M() {
        boolean m2552a = this.f2734A.m2552a(this);
        if (this.f2760a == null || this.f2760a.booleanValue() != m2552a) {
            this.f2760a = Boolean.valueOf(m2552a);
            this.f2736C.m2579v();
        }
    }

    /* renamed from: b */
    public final void m2294b(boolean z) {
        this.f2736C.m2548a(z);
    }

    /* renamed from: c */
    public final void m2298c(boolean z) {
        this.f2736C.m2557b(z);
    }

    /* renamed from: a */
    public final void m2279a(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f2736C.m2539a(configuration);
    }

    /* renamed from: N */
    public final void m2260N() {
        onLowMemory();
        this.f2736C.m2578u();
    }

    /* renamed from: a */
    public final boolean m2285a(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f2741H) {
            return false;
        }
        if (this.f2745L && this.f2746M) {
            z = true;
        }
        return z | this.f2736C.m2550a(menu, menuInflater);
    }

    /* renamed from: a */
    public final boolean m2284a(Menu menu) {
        boolean z = false;
        if (this.f2741H) {
            return false;
        }
        if (this.f2745L && this.f2746M) {
            z = true;
        }
        return z | this.f2736C.m2549a(menu);
    }

    /* renamed from: a */
    public final boolean m2286a(MenuItem menuItem) {
        return !this.f2741H && this.f2736C.m2551a(menuItem);
    }

    /* renamed from: b */
    public final boolean m2295b(MenuItem menuItem) {
        return !this.f2741H && this.f2736C.m2558b(menuItem);
    }

    /* renamed from: b */
    public final void m2293b(Menu menu) {
        if (this.f2741H) {
            return;
        }
        this.f2736C.m2556b(menu);
    }

    /* renamed from: O */
    public final void m2261O() {
        this.f2736C.m2574q();
        if (this.f2748O != null) {
            this.f2762ab.m2424a(EnumC0729i.ON_PAUSE);
        }
        this.f2761aa.m2623a(EnumC0729i.ON_PAUSE);
        this.f2767k = 3;
        this.f2765b = false;
        this.f2765b = true;
        if (this.f2765b) {
            return;
        }
        throw new C0690bg("Fragment " + this + " did not call through to super.onPause()");
    }

    /* renamed from: P */
    public final void m2262P() {
        this.f2736C.m2575r();
        if (this.f2748O != null) {
            this.f2762ab.m2424a(EnumC0729i.ON_STOP);
        }
        this.f2761aa.m2623a(EnumC0729i.ON_STOP);
        this.f2767k = 2;
        this.f2765b = false;
        mo2307i();
        if (this.f2765b) {
            return;
        }
        throw new C0690bg("Fragment " + this + " did not call through to super.onStop()");
    }

    /* renamed from: Q */
    public final void m2263Q() {
        this.f2736C.m2576s();
        if (this.f2748O != null) {
            this.f2762ab.m2424a(EnumC0729i.ON_DESTROY);
        }
        this.f2767k = 1;
        this.f2765b = false;
        mo2309j();
        if (!this.f2765b) {
            throw new C0690bg("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        AbstractC0747a.m2641a(this).mo2642a();
        this.f2781y = false;
    }

    /* renamed from: R */
    public final void m2264R() {
        this.f2736C.m2577t();
        this.f2761aa.m2623a(EnumC0729i.ON_DESTROY);
        this.f2767k = 0;
        this.f2765b = false;
        this.f2758Y = false;
        this.f2765b = true;
        if (this.f2765b) {
            return;
        }
        throw new C0690bg("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* renamed from: S */
    public final void m2265S() {
        this.f2765b = false;
        mo2303f();
        this.f2757X = null;
        if (!this.f2765b) {
            throw new C0690bg("Fragment " + this + " did not call through to super.onDetach()");
        }
        if (this.f2736C.f3014u) {
            return;
        }
        this.f2736C.m2577t();
        this.f2736C = new LayoutInflaterFactory2C0707s();
    }

    /* renamed from: a */
    public final void m2282a(InterfaceC0698j interfaceC0698j) {
        m2246e();
        if (interfaceC0698j == this.f2752S.f2974r) {
            return;
        }
        if (interfaceC0698j != null && this.f2752S.f2974r != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on ".concat(String.valueOf(this)));
        }
        if (this.f2752S.f2973q) {
            this.f2752S.f2974r = interfaceC0698j;
        }
        if (interfaceC0698j != null) {
            interfaceC0698j.mo2357b();
        }
    }

    /* renamed from: e */
    private C0696h m2246e() {
        if (this.f2752S == null) {
            this.f2752S = new C0696h();
        }
        return this.f2752S;
    }

    /* renamed from: T */
    public final int m2266T() {
        if (this.f2752S == null) {
            return 0;
        }
        return this.f2752S.f2960d;
    }

    /* renamed from: b */
    public final void m2291b(int i) {
        if (this.f2752S == null && i == 0) {
            return;
        }
        m2246e().f2960d = i;
    }

    /* renamed from: U */
    public final int m2267U() {
        if (this.f2752S == null) {
            return 0;
        }
        return this.f2752S.f2961e;
    }

    /* renamed from: a */
    public final void m2276a(int i, int i2) {
        if (this.f2752S == null && i == 0 && i2 == 0) {
            return;
        }
        m2246e();
        this.f2752S.f2961e = i;
        this.f2752S.f2962f = i2;
    }

    /* renamed from: V */
    public final int m2268V() {
        if (this.f2752S == null) {
            return 0;
        }
        return this.f2752S.f2962f;
    }

    /* renamed from: W */
    public final AbstractC0415m m2269W() {
        if (this.f2752S == null) {
            return null;
        }
        return this.f2752S.f2971o;
    }

    /* renamed from: X */
    public final AbstractC0415m m2270X() {
        if (this.f2752S == null) {
            return null;
        }
        return this.f2752S.f2972p;
    }

    /* renamed from: Y */
    public final View m2271Y() {
        if (this.f2752S == null) {
            return null;
        }
        return this.f2752S.f2957a;
    }

    /* renamed from: a */
    public final void m2281a(View view) {
        m2246e().f2957a = view;
    }

    /* renamed from: a */
    public final void m2277a(Animator animator) {
        m2246e().f2958b = animator;
    }

    /* renamed from: Z */
    public final Animator m2272Z() {
        if (this.f2752S == null) {
            return null;
        }
        return this.f2752S.f2958b;
    }

    /* renamed from: aa */
    public final int m2287aa() {
        if (this.f2752S == null) {
            return 0;
        }
        return this.f2752S.f2959c;
    }

    /* renamed from: c */
    public final void m2296c(int i) {
        m2246e().f2959c = i;
    }

    /* renamed from: ab */
    public final boolean m2288ab() {
        if (this.f2752S == null) {
            return false;
        }
        return this.f2752S.f2973q;
    }

    /* renamed from: ac */
    public final boolean m2289ac() {
        if (this.f2752S == null) {
            return false;
        }
        return this.f2752S.f2975s;
    }

    /* renamed from: d */
    public final void m2300d(boolean z) {
        m2246e().f2975s = z;
    }

    /* renamed from: a */
    public final String m2275a(int i) {
        return m2314o().getResources().getString(i);
    }

    /* renamed from: s */
    public final AbstractC0705q m2318s() {
        LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f2734A;
        if (layoutInflaterFactory2C0707s != null) {
            return layoutInflaterFactory2C0707s;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: b */
    public LayoutInflater mo2290b(Bundle bundle) {
        if (this.f2735B == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater mo2435e = this.f2735B.mo2435e();
        C0524i.m1783a(mo2435e, this.f2736C);
        return mo2435e;
    }

    /* renamed from: x */
    public final View m2323x() {
        View view = this.f2748O;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        FragmentActivity m2315p = m2315p();
        if (m2315p != null) {
            m2315p.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }
}
