package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import androidx.activity.AbstractC0054d;
import androidx.activity.InterfaceC0056f;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.p023f.C0470a;
import androidx.core.p023f.C0471b;
import androidx.lifecycle.C0720ae;
import androidx.lifecycle.EnumC0730j;
import androidx.lifecycle.InterfaceC0721af;
import androidx.loader.p036a.AbstractC0747a;
import androidx.p011b.C0320c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentManagerImpl.java */
/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0707s extends AbstractC0705q implements LayoutInflater.Factory2 {

    /* renamed from: D */
    static final Interpolator f2986D = new DecelerateInterpolator(2.5f);

    /* renamed from: E */
    static final Interpolator f2987E = new DecelerateInterpolator(1.5f);

    /* renamed from: b */
    static boolean f2988b = false;

    /* renamed from: B */
    ArrayList<C0663ag> f2990B;

    /* renamed from: F */
    private OnBackPressedDispatcher f2992F;

    /* renamed from: I */
    private C0665ai f2995I;

    /* renamed from: c */
    ArrayList<InterfaceC0661ae> f2996c;

    /* renamed from: d */
    boolean f2997d;

    /* renamed from: h */
    ArrayList<C0656a> f3001h;

    /* renamed from: i */
    ArrayList<Fragment> f3002i;

    /* renamed from: j */
    ArrayList<C0656a> f3003j;

    /* renamed from: k */
    ArrayList<Integer> f3004k;

    /* renamed from: l */
    ArrayList<Object> f3005l;

    /* renamed from: n */
    AbstractC0704p f3007n;

    /* renamed from: o */
    AbstractC0701m f3008o;

    /* renamed from: p */
    Fragment f3009p;

    /* renamed from: q */
    Fragment f3010q;

    /* renamed from: r */
    boolean f3011r;

    /* renamed from: s */
    boolean f3012s;

    /* renamed from: t */
    boolean f3013t;

    /* renamed from: u */
    boolean f3014u;

    /* renamed from: v */
    boolean f3015v;

    /* renamed from: w */
    ArrayList<C0656a> f3016w;

    /* renamed from: x */
    ArrayList<Boolean> f3017x;

    /* renamed from: y */
    ArrayList<Fragment> f3018y;

    /* renamed from: e */
    int f2998e = 0;

    /* renamed from: f */
    final ArrayList<Fragment> f2999f = new ArrayList<>();

    /* renamed from: g */
    final HashMap<String, Fragment> f3000g = new HashMap<>();

    /* renamed from: G */
    private final AbstractC0054d f2993G = new C0708t(this);

    /* renamed from: H */
    private final CopyOnWriteArrayList<C0659ac> f2994H = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    int f3006m = 0;

    /* renamed from: z */
    Bundle f3019z = null;

    /* renamed from: A */
    SparseArray<Parcelable> f2989A = null;

    /* renamed from: C */
    Runnable f2991C = new RunnableC0709u(this);

    /* renamed from: b */
    public static int m2505b(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: a */
    private void m2502a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0471b("FragmentManager"));
        if (this.f3007n != null) {
            try {
                this.f3007n.mo2433a("  ", printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            mo2477a("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: a */
    public final AbstractC0671ao mo2473a() {
        return new C0656a(this);
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: b */
    public final boolean mo2479b() {
        boolean m2567j = m2567j();
        m2487B();
        return m2567j;
    }

    /* renamed from: w */
    private void m2531w() {
        if (this.f2996c != null && !this.f2996c.isEmpty()) {
            this.f2993G.m40a(true);
        } else {
            this.f2993G.m40a((this.f3001h != null ? this.f3001h.size() : 0) > 0 && m2552a(this.f3009p));
        }
    }

    /* renamed from: a */
    public final boolean m2552a(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = fragment.f2734A;
        return fragment == layoutInflaterFactory2C0707s.f3010q && m2552a(layoutInflaterFactory2C0707s.f3009p);
    }

    /* renamed from: h */
    public final void m2562h() {
        m2567j();
        if (this.f2993G.m41a()) {
            mo2480c();
        } else {
            this.f2992F.m36a();
        }
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: c */
    public final boolean mo2480c() {
        m2536z();
        return m2533x();
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: a */
    public final void mo2474a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: ".concat(String.valueOf(i)));
        }
        m2546a((InterfaceC0661ae) new C0662af(this, i), false);
    }

    /* renamed from: x */
    private boolean m2533x() {
        m2567j();
        m2513c(true);
        if (this.f3010q != null && this.f3010q.m2319t().mo2480c()) {
            return true;
        }
        boolean m2553a = m2553a(this.f3016w, this.f3017x, (String) null, -1, 0);
        if (m2553a) {
            this.f2997d = true;
            try {
                m2509b(this.f3016w, this.f3017x);
            } finally {
                m2486A();
            }
        }
        m2531w();
        m2488C();
        m2490E();
        return m2553a;
    }

    /* renamed from: a */
    private Fragment m2493a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.f3000g.get(string);
        if (fragment == null) {
            m2502a(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: d */
    public final List<Fragment> mo2481d() {
        List<Fragment> list;
        if (this.f2999f.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2999f) {
            list = (List) this.f2999f.clone();
        }
        return list;
    }

    /* renamed from: b */
    public final C0720ae m2555b(Fragment fragment) {
        return this.f2995I.m2369e(fragment);
    }

    /* renamed from: k */
    private void m2519k(Fragment fragment) {
        if (mo2484g()) {
            if (f2988b) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f2995I.m2367c(fragment) && f2988b) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed ".concat(String.valueOf(fragment)));
        }
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: e */
    public final boolean mo2482e() {
        return this.f3014u;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.f3009p != null) {
            C0470a.m1612a(this.f3009p, sb);
        } else {
            C0470a.m1612a(this.f3007n, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: a */
    public final void mo2477a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        Object obj;
        String str2 = str + "    ";
        if (!this.f3000g.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f3000g.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    printWriter.print(str2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(fragment.f2738E));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(fragment.f2739F));
                    printWriter.print(" mTag=");
                    printWriter.println(fragment.f2740G);
                    printWriter.print(str2);
                    printWriter.print("mState=");
                    printWriter.print(fragment.f2767k);
                    printWriter.print(" mWho=");
                    printWriter.print(fragment.f2771o);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(fragment.f2782z);
                    printWriter.print(str2);
                    printWriter.print("mAdded=");
                    printWriter.print(fragment.f2776t);
                    printWriter.print(" mRemoving=");
                    printWriter.print(fragment.f2777u);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(fragment.f2778v);
                    printWriter.print(" mInLayout=");
                    printWriter.println(fragment.f2779w);
                    printWriter.print(str2);
                    printWriter.print("mHidden=");
                    printWriter.print(fragment.f2741H);
                    printWriter.print(" mDetached=");
                    printWriter.print(fragment.f2742I);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(fragment.f2746M);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(fragment.f2745L);
                    printWriter.print(str2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(fragment.f2743J);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(fragment.f2751R);
                    if (fragment.f2734A != null) {
                        printWriter.print(str2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(fragment.f2734A);
                    }
                    if (fragment.f2735B != null) {
                        printWriter.print(str2);
                        printWriter.print("mHost=");
                        printWriter.println(fragment.f2735B);
                    }
                    if (fragment.f2737D != null) {
                        printWriter.print(str2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(fragment.f2737D);
                    }
                    if (fragment.f2772p != null) {
                        printWriter.print(str2);
                        printWriter.print("mArguments=");
                        printWriter.println(fragment.f2772p);
                    }
                    if (fragment.f2768l != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(fragment.f2768l);
                    }
                    if (fragment.f2769m != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(fragment.f2769m);
                    }
                    if (fragment.f2773q != null) {
                        obj = fragment.f2773q;
                    } else {
                        obj = (fragment.f2734A == null || fragment.f2774r == null) ? null : (Fragment) fragment.f2734A.f3000g.get(fragment.f2774r);
                    }
                    if (obj != null) {
                        printWriter.print(str2);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(fragment.f2775s);
                    }
                    if (fragment.m2266T() != 0) {
                        printWriter.print(str2);
                        printWriter.print("mNextAnim=");
                        printWriter.println(fragment.m2266T());
                    }
                    if (fragment.f2747N != null) {
                        printWriter.print(str2);
                        printWriter.print("mContainer=");
                        printWriter.println(fragment.f2747N);
                    }
                    if (fragment.f2748O != null) {
                        printWriter.print(str2);
                        printWriter.print("mView=");
                        printWriter.println(fragment.f2748O);
                    }
                    if (fragment.f2749P != null) {
                        printWriter.print(str2);
                        printWriter.print("mInnerView=");
                        printWriter.println(fragment.f2748O);
                    }
                    if (fragment.m2271Y() != null) {
                        printWriter.print(str2);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(fragment.m2271Y());
                        printWriter.print(str2);
                        printWriter.print("mStateAfterAnimating=");
                        printWriter.println(fragment.m2287aa());
                    }
                    if (fragment.m2313n() != null) {
                        AbstractC0747a.m2641a(fragment).mo2643a(str2, printWriter);
                    }
                    printWriter.print(str2);
                    printWriter.println("Child " + fragment.f2736C + ":");
                    fragment.f2736C.mo2477a(str2 + "  ", fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f2999f.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size5; i++) {
                Fragment fragment2 = this.f2999f.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        if (this.f3002i != null && (size4 = this.f3002i.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size4; i2++) {
                Fragment fragment3 = this.f3002i.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        if (this.f3001h != null && (size3 = this.f3001h.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                C0656a c0656a = this.f3001h.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0656a.toString());
                c0656a.m2342a(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.f3003j != null && (size2 = this.f3003j.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj2 = (C0656a) this.f3003j.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj2);
                }
            }
            if (this.f3004k != null && this.f3004k.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f3004k.toArray()));
            }
        }
        if (this.f2996c != null && (size = this.f2996c.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i5 = 0; i5 < size; i5++) {
                Object obj3 = (InterfaceC0661ae) this.f2996c.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(obj3);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3007n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3008o);
        if (this.f3009p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3009p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3006m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3012s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3013t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3014u);
        if (this.f3011r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3011r);
        }
    }

    /* renamed from: a */
    private static C0657aa m2495a(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f2986D);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f2987E);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new C0657aa(animationSet);
    }

    /* renamed from: a */
    private static C0657aa m2494a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f2987E);
        alphaAnimation.setDuration(220L);
        return new C0657aa(alphaAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private androidx.fragment.app.C0657aa m2496a(androidx.fragment.app.Fragment r7, int r8, boolean r9, int r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflaterFactory2C0707s.m2496a(androidx.fragment.app.Fragment, int, boolean, int):androidx.fragment.app.aa");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x007d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0425  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2541a(androidx.fragment.app.Fragment r15, int r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflaterFactory2C0707s.m2541a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: l */
    private void m2520l(Fragment fragment) {
        m2541a(fragment, this.f3006m, 0, 0, false);
    }

    /* renamed from: c */
    public final void m2559c(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.f3000g.containsKey(fragment.f2771o)) {
            if (f2988b) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3006m + "since it is not added to " + this);
                return;
            }
            return;
        }
        int i = this.f3006m;
        if (fragment.f2777u) {
            if (fragment.m2311l()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, 0);
            }
        }
        m2541a(fragment, i, fragment.m2267U(), fragment.m2268V(), false);
        if (fragment.f2748O != null) {
            Fragment m2522n = m2522n(fragment);
            if (m2522n != null) {
                View view = m2522n.f2748O;
                ViewGroup viewGroup = fragment.f2747N;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.f2748O);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.f2748O, indexOfChild);
                }
            }
            if (fragment.f2754U && fragment.f2747N != null) {
                if (fragment.f2756W > 0.0f) {
                    fragment.f2748O.setAlpha(fragment.f2756W);
                }
                fragment.f2756W = 0.0f;
                fragment.f2754U = false;
                C0657aa m2496a = m2496a(fragment, fragment.m2267U(), true, fragment.m2268V());
                if (m2496a != null) {
                    if (m2496a.f2824a != null) {
                        fragment.f2748O.startAnimation(m2496a.f2824a);
                    } else {
                        m2496a.f2825b.setTarget(fragment.f2748O);
                        m2496a.f2825b.start();
                    }
                }
            }
        }
        if (fragment.f2755V) {
            if (fragment.f2748O != null) {
                C0657aa m2496a2 = m2496a(fragment, fragment.m2267U(), !fragment.f2741H, fragment.m2268V());
                if (m2496a2 != null && m2496a2.f2825b != null) {
                    m2496a2.f2825b.setTarget(fragment.f2748O);
                    if (fragment.f2741H) {
                        if (fragment.m2289ac()) {
                            fragment.m2300d(false);
                        } else {
                            ViewGroup viewGroup2 = fragment.f2747N;
                            View view2 = fragment.f2748O;
                            viewGroup2.startViewTransition(view2);
                            m2496a2.f2825b.addListener(new C0713y(this, viewGroup2, view2, fragment));
                        }
                    } else {
                        fragment.f2748O.setVisibility(0);
                    }
                    m2496a2.f2825b.start();
                } else {
                    if (m2496a2 != null) {
                        fragment.f2748O.startAnimation(m2496a2.f2824a);
                        m2496a2.f2824a.start();
                    }
                    fragment.f2748O.setVisibility((!fragment.f2741H || fragment.m2289ac()) ? 0 : 8);
                    if (fragment.m2289ac()) {
                        fragment.m2300d(false);
                    }
                }
            }
            if (fragment.f2776t && m2534x(fragment)) {
                this.f3011r = true;
            }
            fragment.f2755V = false;
        }
    }

    /* renamed from: a */
    public final void m2538a(int i, boolean z) {
        if (this.f3007n == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f3006m) {
            this.f3006m = i;
            int size = this.f2999f.size();
            for (int i2 = 0; i2 < size; i2++) {
                m2559c(this.f2999f.get(i2));
            }
            for (Fragment fragment : this.f3000g.values()) {
                if (fragment != null && (fragment.f2777u || fragment.f2742I)) {
                    if (!fragment.f2754U) {
                        m2559c(fragment);
                    }
                }
            }
            m2535y();
            if (this.f3011r && this.f3007n != null && this.f3006m == 4) {
                this.f3007n.mo2436f();
                this.f3011r = false;
            }
        }
    }

    /* renamed from: y */
    private void m2535y() {
        for (Fragment fragment : this.f3000g.values()) {
            if (fragment != null && fragment.f2750Q) {
                if (this.f2997d) {
                    this.f3015v = true;
                } else {
                    fragment.f2750Q = false;
                    m2541a(fragment, this.f3006m, 0, 0, false);
                }
            }
        }
    }

    /* renamed from: d */
    public final void m2560d(Fragment fragment) {
        if (this.f3000g.get(fragment.f2771o) != null) {
            return;
        }
        this.f3000g.put(fragment.f2771o, fragment);
        if (fragment.f2744K) {
            if (!fragment.f2743J) {
                m2519k(fragment);
            } else if (mo2484g()) {
                if (f2988b) {
                    Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                }
            } else if (this.f2995I.m2363a(fragment) && f2988b) {
                Log.v("FragmentManager", "Updating retained Fragments: Added ".concat(String.valueOf(fragment)));
            }
            fragment.f2744K = false;
        }
        if (f2988b) {
            Log.v("FragmentManager", "Added fragment to active set ".concat(String.valueOf(fragment)));
        }
    }

    /* renamed from: m */
    private void m2521m(Fragment fragment) {
        if (this.f3000g.get(fragment.f2771o) == null) {
            return;
        }
        if (f2988b) {
            Log.v("FragmentManager", "Removed fragment from active set ".concat(String.valueOf(fragment)));
        }
        for (Fragment fragment2 : this.f3000g.values()) {
            if (fragment2 != null && fragment.f2771o.equals(fragment2.f2774r)) {
                fragment2.f2773q = fragment;
                fragment2.f2774r = null;
            }
        }
        this.f3000g.put(fragment.f2771o, null);
        m2519k(fragment);
        if (fragment.f2774r != null) {
            fragment.f2773q = this.f3000g.get(fragment.f2774r);
        }
        fragment.m2324y();
    }

    /* renamed from: a */
    public final void m2543a(Fragment fragment, boolean z) {
        if (f2988b) {
            Log.v("FragmentManager", "add: ".concat(String.valueOf(fragment)));
        }
        m2560d(fragment);
        if (fragment.f2742I) {
            return;
        }
        if (this.f2999f.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fragment)));
        }
        synchronized (this.f2999f) {
            this.f2999f.add(fragment);
        }
        fragment.f2776t = true;
        fragment.f2777u = false;
        if (fragment.f2748O == null) {
            fragment.f2755V = false;
        }
        if (m2534x(fragment)) {
            this.f3011r = true;
        }
        if (z) {
            m2520l(fragment);
        }
    }

    /* renamed from: e */
    public final void m2561e(Fragment fragment) {
        if (f2988b) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f2782z);
        }
        boolean z = !fragment.m2311l();
        if (!fragment.f2742I || z) {
            synchronized (this.f2999f) {
                this.f2999f.remove(fragment);
            }
            if (m2534x(fragment)) {
                this.f3011r = true;
            }
            fragment.f2776t = false;
            fragment.f2777u = true;
        }
    }

    /* renamed from: f */
    public static void m2517f(Fragment fragment) {
        if (f2988b) {
            Log.v("FragmentManager", "hide: ".concat(String.valueOf(fragment)));
        }
        if (fragment.f2741H) {
            return;
        }
        fragment.f2741H = true;
        fragment.f2755V = true ^ fragment.f2755V;
    }

    /* renamed from: g */
    public static void m2518g(Fragment fragment) {
        if (f2988b) {
            Log.v("FragmentManager", "show: ".concat(String.valueOf(fragment)));
        }
        if (fragment.f2741H) {
            fragment.f2741H = false;
            fragment.f2755V = !fragment.f2755V;
        }
    }

    /* renamed from: h */
    public final void m2563h(Fragment fragment) {
        if (f2988b) {
            Log.v("FragmentManager", "detach: ".concat(String.valueOf(fragment)));
        }
        if (fragment.f2742I) {
            return;
        }
        fragment.f2742I = true;
        if (fragment.f2776t) {
            if (f2988b) {
                Log.v("FragmentManager", "remove from detach: ".concat(String.valueOf(fragment)));
            }
            synchronized (this.f2999f) {
                this.f2999f.remove(fragment);
            }
            if (m2534x(fragment)) {
                this.f3011r = true;
            }
            fragment.f2776t = false;
        }
    }

    /* renamed from: i */
    public final void m2565i(Fragment fragment) {
        if (f2988b) {
            Log.v("FragmentManager", "attach: ".concat(String.valueOf(fragment)));
        }
        if (fragment.f2742I) {
            fragment.f2742I = false;
            if (fragment.f2776t) {
                return;
            }
            if (this.f2999f.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fragment)));
            }
            if (f2988b) {
                Log.v("FragmentManager", "add from attach: ".concat(String.valueOf(fragment)));
            }
            synchronized (this.f2999f) {
                this.f2999f.add(fragment);
            }
            fragment.f2776t = true;
            if (m2534x(fragment)) {
                this.f3011r = true;
            }
        }
    }

    /* renamed from: c */
    private Fragment m2511c(int i) {
        for (int size = this.f2999f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2999f.get(size);
            if (fragment != null && fragment.f2738E == i) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f3000g.values()) {
            if (fragment2 != null && fragment2.f2738E == i) {
                return fragment2;
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: a */
    public final Fragment mo2472a(String str) {
        if (str != null) {
            for (int size = this.f2999f.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2999f.get(size);
                if (fragment != null && str.equals(fragment.f2740G)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.f3000g.values()) {
            if (fragment2 != null && str.equals(fragment2.f2740G)) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final Fragment m2554b(String str) {
        Fragment m2274a;
        for (Fragment fragment : this.f3000g.values()) {
            if (fragment != null && (m2274a = fragment.m2274a(str)) != null) {
                return m2274a;
            }
        }
        return null;
    }

    /* renamed from: z */
    private void m2536z() {
        if (mo2484g()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: g */
    public final boolean mo2484g() {
        return this.f3012s || this.f3013t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:            return;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2546a(androidx.fragment.app.InterfaceC0661ae r2, boolean r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            r1.m2536z()
        L5:
            monitor-enter(r1)
            boolean r0 = r1.f3014u     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L24
            androidx.fragment.app.p r0 = r1.f3007n     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lf
            goto L24
        Lf:
            java.util.ArrayList<androidx.fragment.app.ae> r3 = r1.f2996c     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L1a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            r1.f2996c = r3     // Catch: java.lang.Throwable -> L30
        L1a:
            java.util.ArrayList<androidx.fragment.app.ae> r3 = r1.f2996c     // Catch: java.lang.Throwable -> L30
            r3.add(r2)     // Catch: java.lang.Throwable -> L30
            r1.m2564i()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L24:
            if (r3 == 0) goto L28
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L28:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            throw r2     // Catch: java.lang.Throwable -> L30
        L30:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflaterFactory2C0707s.m2546a(androidx.fragment.app.ae, boolean):void");
    }

    /* renamed from: i */
    public final void m2564i() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = (this.f2990B == null || this.f2990B.isEmpty()) ? false : true;
            if (this.f2996c != null && this.f2996c.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f3007n.m2471l().removeCallbacks(this.f2991C);
                this.f3007n.m2471l().post(this.f2991C);
                m2531w();
            }
        }
    }

    /* renamed from: a */
    public final int m2537a(C0656a c0656a) {
        synchronized (this) {
            if (this.f3004k != null && this.f3004k.size() > 0) {
                int intValue = this.f3004k.remove(this.f3004k.size() - 1).intValue();
                if (f2988b) {
                    Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + c0656a);
                }
                this.f3003j.set(intValue, c0656a);
                return intValue;
            }
            if (this.f3003j == null) {
                this.f3003j = new ArrayList<>();
            }
            int size = this.f3003j.size();
            if (f2988b) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + c0656a);
            }
            this.f3003j.add(c0656a);
            return size;
        }
    }

    /* renamed from: a */
    private void m2497a(int i, C0656a c0656a) {
        synchronized (this) {
            if (this.f3003j == null) {
                this.f3003j = new ArrayList<>();
            }
            int size = this.f3003j.size();
            if (i < size) {
                if (f2988b) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + c0656a);
                }
                this.f3003j.set(i, c0656a);
            } else {
                while (size < i) {
                    this.f3003j.add(null);
                    if (this.f3004k == null) {
                        this.f3004k = new ArrayList<>();
                    }
                    if (f2988b) {
                        Log.v("FragmentManager", "Adding available back stack index ".concat(String.valueOf(size)));
                    }
                    this.f3004k.add(Integer.valueOf(size));
                    size++;
                }
                if (f2988b) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + c0656a);
                }
                this.f3003j.add(c0656a);
            }
        }
    }

    /* renamed from: c */
    private void m2513c(boolean z) {
        if (this.f2997d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3007n == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f3007n.m2471l().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            m2536z();
        }
        if (this.f3016w == null) {
            this.f3016w = new ArrayList<>();
            this.f3017x = new ArrayList<>();
        }
        this.f2997d = true;
        try {
            m2503a((ArrayList<C0656a>) null, (ArrayList<Boolean>) null);
        } finally {
            this.f2997d = false;
        }
    }

    /* renamed from: a */
    public final void m2545a(InterfaceC0661ae interfaceC0661ae) {
        m2513c(false);
        if (interfaceC0661ae.mo2346a(this.f3016w, this.f3017x)) {
            this.f2997d = true;
            try {
                m2509b(this.f3016w, this.f3017x);
            } finally {
                m2486A();
            }
        }
        m2531w();
        m2488C();
        m2490E();
    }

    /* renamed from: A */
    private void m2486A() {
        this.f2997d = false;
        this.f3017x.clear();
        this.f3016w.clear();
    }

    /* renamed from: j */
    public final boolean m2567j() {
        m2513c(true);
        boolean z = false;
        while (m2514c(this.f3016w, this.f3017x)) {
            this.f2997d = true;
            try {
                m2509b(this.f3016w, this.f3017x);
                m2486A();
                z = true;
            } catch (Throwable th) {
                m2486A();
                throw th;
            }
        }
        m2531w();
        m2488C();
        m2490E();
        return z;
    }

    /* renamed from: a */
    private void m2503a(ArrayList<C0656a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        int size = this.f2990B == null ? 0 : this.f2990B.size();
        int i = 0;
        while (i < size) {
            C0663ag c0663ag = this.f2990B.get(i);
            if (arrayList != null && !c0663ag.f2838a && (indexOf2 = arrayList.indexOf(c0663ag.f2839b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                this.f2990B.remove(i);
                i--;
                size--;
                c0663ag.m2360e();
            } else if (c0663ag.m2358c() || (arrayList != null && c0663ag.f2839b.m2345a(arrayList, 0, arrayList.size()))) {
                this.f2990B.remove(i);
                i--;
                size--;
                if (arrayList != null && !c0663ag.f2838a && (indexOf = arrayList.indexOf(c0663ag.f2839b)) != -1 && arrayList2.get(indexOf).booleanValue()) {
                    c0663ag.m2360e();
                } else {
                    c0663ag.m2359d();
                }
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m2509b(ArrayList<C0656a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m2503a(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f2868t) {
                if (i2 != i) {
                    m2504a(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f2868t) {
                        i2++;
                    }
                }
                m2504a(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m2504a(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: a */
    private void m2504a(ArrayList<C0656a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4 = i;
        boolean z = arrayList.get(i4).f2868t;
        if (this.f3018y == null) {
            this.f3018y = new ArrayList<>();
        } else {
            this.f3018y.clear();
        }
        this.f3018y.addAll(this.f2999f);
        Fragment fragment = this.f3010q;
        boolean z2 = false;
        for (int i5 = i4; i5 < i2; i5++) {
            C0656a c0656a = arrayList.get(i5);
            if (!arrayList2.get(i5).booleanValue()) {
                fragment = c0656a.m2335a(this.f3018y, fragment);
            } else {
                fragment = c0656a.m2348b(this.f3018y, fragment);
            }
            z2 = z2 || c0656a.f2859k;
        }
        this.f3018y.clear();
        if (!z) {
            C0673aq.m2392a(this, arrayList, arrayList2, i, i2, false);
        }
        m2510b(arrayList, arrayList2, i, i2);
        if (z) {
            C0320c<Fragment> c0320c = new C0320c<>();
            m2506b(c0320c);
            int m2492a = m2492a(arrayList, arrayList2, i, i2, c0320c);
            m2498a(c0320c);
            i3 = m2492a;
        } else {
            i3 = i2;
        }
        if (i3 != i4 && z) {
            C0673aq.m2392a(this, arrayList, arrayList2, i, i3, true);
            m2538a(this.f3006m, true);
        }
        while (i4 < i2) {
            C0656a c0656a2 = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue() && c0656a2.f2823c >= 0) {
                int i6 = c0656a2.f2823c;
                synchronized (this) {
                    this.f3003j.set(i6, null);
                    if (this.f3004k == null) {
                        this.f3004k = new ArrayList<>();
                    }
                    if (f2988b) {
                        Log.v("FragmentManager", "Freeing back stack index ".concat(String.valueOf(i6)));
                    }
                    this.f3004k.add(Integer.valueOf(i6));
                }
                c0656a2.f2823c = -1;
            }
            c0656a2.m2338a();
            i4++;
        }
        if (z2) {
            m2489D();
        }
    }

    /* renamed from: a */
    private static void m2498a(C0320c<Fragment> c0320c) {
        int size = c0320c.size();
        for (int i = 0; i < size; i++) {
            Fragment m1022a = c0320c.m1022a(i);
            if (!m1022a.f2776t) {
                View m2323x = m1022a.m2323x();
                m1022a.f2756W = m2323x.getAlpha();
                m2323x.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: a */
    private int m2492a(ArrayList<C0656a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0320c<Fragment> c0320c) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0656a c0656a = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (c0656a.m2354f() && !c0656a.m2345a(arrayList, i4 + 1, i2)) {
                if (this.f2990B == null) {
                    this.f2990B = new ArrayList<>();
                }
                C0663ag c0663ag = new C0663ag(c0656a, booleanValue);
                this.f2990B.add(c0663ag);
                c0656a.m2341a(c0663ag);
                if (booleanValue) {
                    c0656a.m2353e();
                } else {
                    c0656a.m2344a(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, c0656a);
                }
                m2506b(c0320c);
            }
        }
        return i3;
    }

    /* renamed from: a */
    public final void m2544a(C0656a c0656a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0656a.m2344a(z3);
        } else {
            c0656a.m2353e();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0656a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0673aq.m2392a(this, (ArrayList<C0656a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            m2538a(this.f3006m, true);
        }
        for (Fragment fragment : this.f3000g.values()) {
            if (fragment != null && fragment.f2748O != null && fragment.f2754U && c0656a.m2350b(fragment.f2739F)) {
                if (fragment.f2756W > 0.0f) {
                    fragment.f2748O.setAlpha(fragment.f2756W);
                }
                if (z3) {
                    fragment.f2756W = 0.0f;
                } else {
                    fragment.f2756W = -1.0f;
                    fragment.f2754U = false;
                }
            }
        }
    }

    /* renamed from: n */
    private Fragment m2522n(Fragment fragment) {
        ViewGroup viewGroup = fragment.f2747N;
        View view = fragment.f2748O;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.f2999f.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
            Fragment fragment2 = this.f2999f.get(indexOf);
            if (fragment2.f2747N == viewGroup && fragment2.f2748O != null) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static void m2510b(ArrayList<C0656a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0656a c0656a = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                c0656a.m2339a(-1);
                c0656a.m2344a(i == i2 + (-1));
            } else {
                c0656a.m2339a(1);
                c0656a.m2353e();
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m2506b(C0320c<Fragment> c0320c) {
        if (this.f3006m <= 0) {
            return;
        }
        int min = Math.min(this.f3006m, 3);
        int size = this.f2999f.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f2999f.get(i);
            if (fragment.f2767k < min) {
                m2541a(fragment, min, fragment.m2266T(), fragment.m2267U(), false);
                if (fragment.f2748O != null && !fragment.f2741H && fragment.f2754U) {
                    c0320c.add(fragment);
                }
            }
        }
    }

    /* renamed from: B */
    private void m2487B() {
        if (this.f2990B != null) {
            while (!this.f2990B.isEmpty()) {
                this.f2990B.remove(0).m2359d();
            }
        }
    }

    /* renamed from: c */
    private boolean m2514c(ArrayList<C0656a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.f2996c != null && this.f2996c.size() != 0) {
                int size = this.f2996c.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= this.f2996c.get(i).mo2346a(arrayList, arrayList2);
                }
                this.f2996c.clear();
                this.f3007n.m2471l().removeCallbacks(this.f2991C);
                return z;
            }
            return false;
        }
    }

    /* renamed from: C */
    private void m2488C() {
        if (this.f3015v) {
            this.f3015v = false;
            m2535y();
        }
    }

    /* renamed from: D */
    private void m2489D() {
        if (this.f3005l != null) {
            for (int i = 0; i < this.f3005l.size(); i++) {
                this.f3005l.get(i);
            }
        }
    }

    /* renamed from: a */
    public final boolean m2553a(ArrayList<C0656a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int size;
        if (this.f3001h == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size2 = this.f3001h.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.f3001h.remove(size2));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                size = this.f3001h.size() - 1;
                while (size >= 0) {
                    C0656a c0656a = this.f3001h.get(size);
                    if ((str != null && str.equals(c0656a.f2861m)) || (i >= 0 && i == c0656a.f2823c)) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size--;
                    while (size >= 0) {
                        C0656a c0656a2 = this.f3001h.get(size);
                        if ((str == null || !str.equals(c0656a2.f2861m)) && (i < 0 || i != c0656a2.f2823c)) {
                            break;
                        }
                        size--;
                    }
                }
            } else {
                size = -1;
            }
            if (size == this.f3001h.size() - 1) {
                return false;
            }
            for (int size3 = this.f3001h.size() - 1; size3 > size; size3--) {
                arrayList.add(this.f3001h.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: o */
    private void m2523o(Fragment fragment) {
        if (fragment.f2749P == null) {
            return;
        }
        if (this.f2989A == null) {
            this.f2989A = new SparseArray<>();
        } else {
            this.f2989A.clear();
        }
        fragment.f2749P.saveHierarchyState(this.f2989A);
        if (this.f2989A.size() > 0) {
            fragment.f2769m = this.f2989A;
            this.f2989A = null;
        }
    }

    /* renamed from: k */
    public final Parcelable m2568k() {
        BackStackState[] backStackStateArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle;
        m2487B();
        Iterator<Fragment> it = this.f3000g.values().iterator();
        while (true) {
            backStackStateArr = null;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next != null) {
                if (next.m2271Y() != null) {
                    int m2287aa = next.m2287aa();
                    View m2271Y = next.m2271Y();
                    Animation animation = m2271Y.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        m2271Y.clearAnimation();
                    }
                    next.m2281a((View) null);
                    m2541a(next, m2287aa, 0, 0, false);
                } else if (next.m2272Z() != null) {
                    next.m2272Z().end();
                }
            }
        }
        m2567j();
        this.f3012s = true;
        if (this.f3000g.isEmpty()) {
            return null;
        }
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(this.f3000g.size());
        boolean z = false;
        for (Fragment fragment : this.f3000g.values()) {
            if (fragment != null) {
                if (fragment.f2734A != this) {
                    m2502a(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                arrayList2.add(fragmentState);
                if (fragment.f2767k <= 0 || fragmentState.f2811m != null) {
                    fragmentState.f2811m = fragment.f2768l;
                } else {
                    if (this.f3019z == null) {
                        this.f3019z = new Bundle();
                    }
                    Bundle bundle2 = this.f3019z;
                    fragment.mo2299d(bundle2);
                    fragment.f2764ad.m3424b(bundle2);
                    Parcelable m2568k = fragment.f2736C.m2568k();
                    if (m2568k != null) {
                        bundle2.putParcelable("android:support:fragments", m2568k);
                    }
                    m2516d(fragment, this.f3019z);
                    if (this.f3019z.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = this.f3019z;
                        this.f3019z = null;
                    }
                    if (fragment.f2748O != null) {
                        m2523o(fragment);
                    }
                    if (fragment.f2769m != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", fragment.f2769m);
                    }
                    if (!fragment.f2751R) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", fragment.f2751R);
                    }
                    fragmentState.f2811m = bundle;
                    if (fragment.f2774r != null) {
                        Fragment fragment2 = this.f3000g.get(fragment.f2774r);
                        if (fragment2 == null) {
                            m2502a(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f2774r));
                        }
                        if (fragmentState.f2811m == null) {
                            fragmentState.f2811m = new Bundle();
                        }
                        Bundle bundle3 = fragmentState.f2811m;
                        if (fragment2.f2734A != this) {
                            m2502a(new IllegalStateException("Fragment " + fragment2 + " is not currently in the FragmentManager"));
                        }
                        bundle3.putString("android:target_state", fragment2.f2771o);
                        if (fragment.f2775s != 0) {
                            fragmentState.f2811m.putInt("android:target_req_state", fragment.f2775s);
                        }
                    }
                }
                if (f2988b) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.f2811m);
                }
                z = true;
            }
        }
        if (!z) {
            if (f2988b) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f2999f.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it2 = this.f2999f.iterator();
            while (it2.hasNext()) {
                Fragment next2 = it2.next();
                arrayList.add(next2.f2771o);
                if (next2.f2734A != this) {
                    m2502a(new IllegalStateException("Failure saving state: active " + next2 + " was removed from the FragmentManager"));
                }
                if (f2988b) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next2.f2771o + "): " + next2);
                }
            }
        } else {
            arrayList = null;
        }
        if (this.f3001h != null && (size = this.f3001h.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i = 0; i < size; i++) {
                backStackStateArr[i] = new BackStackState(this.f3001h.get(i));
                if (f2988b) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f3001h.get(i));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f2794a = arrayList2;
        fragmentManagerState.f2795b = arrayList;
        fragmentManagerState.f2796c = backStackStateArr;
        if (this.f3010q != null) {
            fragmentManagerState.f2797d = this.f3010q.f2771o;
        }
        fragmentManagerState.f2798e = this.f2998e;
        return fragmentManagerState;
    }

    /* renamed from: a */
    public final void m2540a(Parcelable parcelable) {
        FragmentState fragmentState;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f2794a == null) {
            return;
        }
        for (Fragment fragment : this.f2995I.m2366c()) {
            if (f2988b) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained ".concat(String.valueOf(fragment)));
            }
            Iterator<FragmentState> it = fragmentManagerState.f2794a.iterator();
            while (true) {
                if (it.hasNext()) {
                    fragmentState = it.next();
                    if (fragmentState.f2800b.equals(fragment.f2771o)) {
                        break;
                    }
                } else {
                    fragmentState = null;
                    break;
                }
            }
            if (fragmentState == null) {
                if (f2988b) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f2794a);
                }
                m2541a(fragment, 1, 0, 0, false);
                fragment.f2777u = true;
                m2541a(fragment, 0, 0, 0, false);
            } else {
                fragmentState.f2812n = fragment;
                fragment.f2769m = null;
                fragment.f2782z = 0;
                fragment.f2779w = false;
                fragment.f2776t = false;
                fragment.f2774r = fragment.f2773q != null ? fragment.f2773q.f2771o : null;
                fragment.f2773q = null;
                if (fragmentState.f2811m != null) {
                    fragmentState.f2811m.setClassLoader(this.f3007n.m2470k().getClassLoader());
                    fragment.f2769m = fragmentState.f2811m.getSparseParcelableArray("android:view_state");
                    fragment.f2768l = fragmentState.f2811m;
                }
            }
        }
        this.f3000g.clear();
        Iterator<FragmentState> it2 = fragmentManagerState.f2794a.iterator();
        while (it2.hasNext()) {
            FragmentState next = it2.next();
            if (next != null) {
                ClassLoader classLoader = this.f3007n.m2470k().getClassLoader();
                C0703o mo2483f = mo2483f();
                if (next.f2812n == null) {
                    if (next.f2808j != null) {
                        next.f2808j.setClassLoader(classLoader);
                    }
                    next.f2812n = mo2483f.mo2468c(classLoader, next.f2799a);
                    next.f2812n.m2301e(next.f2808j);
                    if (next.f2811m != null) {
                        next.f2811m.setClassLoader(classLoader);
                        next.f2812n.f2768l = next.f2811m;
                    } else {
                        next.f2812n.f2768l = new Bundle();
                    }
                    next.f2812n.f2771o = next.f2800b;
                    next.f2812n.f2778v = next.f2801c;
                    next.f2812n.f2780x = true;
                    next.f2812n.f2738E = next.f2802d;
                    next.f2812n.f2739F = next.f2803e;
                    next.f2812n.f2740G = next.f2804f;
                    next.f2812n.f2743J = next.f2805g;
                    next.f2812n.f2777u = next.f2806h;
                    next.f2812n.f2742I = next.f2807i;
                    next.f2812n.f2741H = next.f2809k;
                    next.f2812n.f2759Z = EnumC0730j.values()[next.f2810l];
                    if (f2988b) {
                        Log.v("FragmentManager", "Instantiated fragment " + next.f2812n);
                    }
                }
                Fragment fragment2 = next.f2812n;
                fragment2.f2734A = this;
                if (f2988b) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.f2771o + "): " + fragment2);
                }
                this.f3000g.put(fragment2.f2771o, fragment2);
                next.f2812n = null;
            }
        }
        this.f2999f.clear();
        if (fragmentManagerState.f2795b != null) {
            Iterator<String> it3 = fragmentManagerState.f2795b.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                Fragment fragment3 = this.f3000g.get(next2);
                if (fragment3 == null) {
                    m2502a(new IllegalStateException("No instantiated fragment for (" + next2 + ")"));
                }
                fragment3.f2776t = true;
                if (f2988b) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + fragment3);
                }
                if (this.f2999f.contains(fragment3)) {
                    throw new IllegalStateException("Already added ".concat(String.valueOf(fragment3)));
                }
                synchronized (this.f2999f) {
                    this.f2999f.add(fragment3);
                }
            }
        }
        if (fragmentManagerState.f2796c != null) {
            this.f3001h = new ArrayList<>(fragmentManagerState.f2796c.length);
            for (int i = 0; i < fragmentManagerState.f2796c.length; i++) {
                C0656a m2243a = fragmentManagerState.f2796c[i].m2243a(this);
                if (f2988b) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + m2243a.f2823c + "): " + m2243a);
                    PrintWriter printWriter = new PrintWriter(new C0471b("FragmentManager"));
                    m2243a.m2343a("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3001h.add(m2243a);
                if (m2243a.f2823c >= 0) {
                    m2497a(m2243a.f2823c, m2243a);
                }
            }
        } else {
            this.f3001h = null;
        }
        if (fragmentManagerState.f2797d != null) {
            this.f3010q = this.f3000g.get(fragmentManagerState.f2797d);
            m2524p(this.f3010q);
        }
        this.f2998e = fragmentManagerState.f2798e;
    }

    /* renamed from: E */
    private void m2490E() {
        this.f3000g.values().removeAll(Collections.singleton(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m2547a(AbstractC0704p abstractC0704p, AbstractC0701m abstractC0701m, Fragment fragment) {
        if (this.f3007n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f3007n = abstractC0704p;
        this.f3008o = abstractC0701m;
        this.f3009p = fragment;
        if (this.f3009p != null) {
            m2531w();
        }
        if (abstractC0704p instanceof InterfaceC0056f) {
            InterfaceC0056f interfaceC0056f = (InterfaceC0056f) abstractC0704p;
            this.f2992F = interfaceC0056f.mo33c();
            Fragment fragment2 = interfaceC0056f;
            if (fragment != null) {
                fragment2 = fragment;
            }
            this.f2992F.m37a(fragment2, this.f2993G);
        }
        if (fragment != null) {
            this.f2995I = fragment.f2734A.f2995I.m2368d(fragment);
        } else if (abstractC0704p instanceof InterfaceC0721af) {
            this.f2995I = C0665ai.m2361a(((InterfaceC0721af) abstractC0704p).mo32b());
        } else {
            this.f2995I = new C0665ai(false);
        }
    }

    /* renamed from: l */
    public final void m2569l() {
        this.f3012s = false;
        this.f3013t = false;
        int size = this.f2999f.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f2999f.get(i);
            if (fragment != null) {
                fragment.f2736C.m2569l();
            }
        }
    }

    /* renamed from: m */
    public final void m2570m() {
        this.f3012s = false;
        this.f3013t = false;
        m2515d(1);
    }

    /* renamed from: n */
    public final void m2571n() {
        this.f3012s = false;
        this.f3013t = false;
        m2515d(2);
    }

    /* renamed from: o */
    public final void m2572o() {
        this.f3012s = false;
        this.f3013t = false;
        m2515d(3);
    }

    /* renamed from: p */
    public final void m2573p() {
        this.f3012s = false;
        this.f3013t = false;
        m2515d(4);
    }

    /* renamed from: q */
    public final void m2574q() {
        m2515d(3);
    }

    /* renamed from: r */
    public final void m2575r() {
        this.f3013t = true;
        m2515d(2);
    }

    /* renamed from: s */
    public final void m2576s() {
        m2515d(1);
    }

    /* renamed from: t */
    public final void m2577t() {
        this.f3014u = true;
        m2567j();
        m2515d(0);
        this.f3007n = null;
        this.f3008o = null;
        this.f3009p = null;
        if (this.f2992F != null) {
            this.f2993G.m42b();
            this.f2992F = null;
        }
    }

    /* renamed from: d */
    private void m2515d(int i) {
        try {
            this.f2997d = true;
            m2538a(i, false);
            this.f2997d = false;
            m2567j();
        } catch (Throwable th) {
            this.f2997d = false;
            throw th;
        }
    }

    /* renamed from: a */
    public final void m2548a(boolean z) {
        for (int size = this.f2999f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2999f.get(size);
            if (fragment != null) {
                fragment.m2294b(z);
            }
        }
    }

    /* renamed from: b */
    public final void m2557b(boolean z) {
        for (int size = this.f2999f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2999f.get(size);
            if (fragment != null) {
                fragment.m2298c(z);
            }
        }
    }

    /* renamed from: a */
    public final void m2539a(Configuration configuration) {
        for (int i = 0; i < this.f2999f.size(); i++) {
            Fragment fragment = this.f2999f.get(i);
            if (fragment != null) {
                fragment.m2279a(configuration);
            }
        }
    }

    /* renamed from: u */
    public final void m2578u() {
        for (int i = 0; i < this.f2999f.size(); i++) {
            Fragment fragment = this.f2999f.get(i);
            if (fragment != null) {
                fragment.m2260N();
            }
        }
    }

    /* renamed from: a */
    public final boolean m2550a(Menu menu, MenuInflater menuInflater) {
        if (this.f3006m <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f2999f.size(); i++) {
            Fragment fragment = this.f2999f.get(i);
            if (fragment != null && fragment.m2285a(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f3002i != null) {
            for (int i2 = 0; i2 < this.f3002i.size(); i2++) {
                Fragment fragment2 = this.f3002i.get(i2);
                if (arrayList != null) {
                    arrayList.contains(fragment2);
                }
            }
        }
        this.f3002i = arrayList;
        return z;
    }

    /* renamed from: a */
    public final boolean m2549a(Menu menu) {
        if (this.f3006m <= 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f2999f.size(); i++) {
            Fragment fragment = this.f2999f.get(i);
            if (fragment != null && fragment.m2284a(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean m2551a(MenuItem menuItem) {
        if (this.f3006m <= 0) {
            return false;
        }
        for (int i = 0; i < this.f2999f.size(); i++) {
            Fragment fragment = this.f2999f.get(i);
            if (fragment != null && fragment.m2286a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m2558b(MenuItem menuItem) {
        if (this.f3006m <= 0) {
            return false;
        }
        for (int i = 0; i < this.f2999f.size(); i++) {
            Fragment fragment = this.f2999f.get(i);
            if (fragment != null && fragment.m2295b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m2556b(Menu menu) {
        if (this.f3006m <= 0) {
            return;
        }
        for (int i = 0; i < this.f2999f.size(); i++) {
            Fragment fragment = this.f2999f.get(i);
            if (fragment != null) {
                fragment.m2293b(menu);
            }
        }
    }

    /* renamed from: j */
    public final void m2566j(Fragment fragment) {
        if (fragment != null && (this.f3000g.get(fragment.f2771o) != fragment || (fragment.f2735B != null && fragment.f2734A != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f3010q;
        this.f3010q = fragment;
        m2524p(fragment2);
        m2524p(this.f3010q);
    }

    /* renamed from: p */
    private void m2524p(Fragment fragment) {
        if (fragment == null || this.f3000g.get(fragment.f2771o) != fragment) {
            return;
        }
        fragment.m2259M();
    }

    /* renamed from: v */
    public final void m2579v() {
        m2531w();
        m2524p(this.f3010q);
    }

    /* renamed from: a */
    public final void m2542a(Fragment fragment, EnumC0730j enumC0730j) {
        if (this.f3000g.get(fragment.f2771o) != fragment || (fragment.f2735B != null && fragment.f2734A != this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.f2759Z = enumC0730j;
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: f */
    public final C0703o mo2483f() {
        while (true) {
            if (super.mo2483f() == f2984a) {
                if (this.f3009p != null) {
                    this = this.f3009p.f2734A;
                } else {
                    this.m2475a(new C0714z(this));
                    break;
                }
            } else {
                break;
            }
        }
        return super.mo2483f();
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: a */
    public final void mo2476a(AbstractC0706r abstractC0706r) {
        this.f2994H.add(new C0659ac(abstractC0706r));
    }

    @Override // androidx.fragment.app.AbstractC0705q
    /* renamed from: b */
    public final void mo2478b(AbstractC0706r abstractC0706r) {
        synchronized (this.f2994H) {
            int i = 0;
            int size = this.f2994H.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                if (this.f2994H.get(i).f2831a == abstractC0706r) {
                    this.f2994H.remove(i);
                    break;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m2499a(Fragment fragment, Context context) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2499a(fragment, context);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: b */
    private void m2507b(Fragment fragment, Context context) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2507b(fragment, context);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    private void m2500a(Fragment fragment, Bundle bundle) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2500a(fragment, bundle);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: b */
    private void m2508b(Fragment fragment, Bundle bundle) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2508b(fragment, bundle);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: c */
    private void m2512c(Fragment fragment, Bundle bundle) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2512c(fragment, bundle);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    private void m2501a(Fragment fragment, View view, Bundle bundle, boolean z) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2501a(fragment, view, bundle, true);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            C0659ac next = it.next();
            if (!z || next.f2832b) {
                next.f2831a.mo2485a(this, fragment, view);
            }
        }
    }

    /* renamed from: q */
    private void m2525q(Fragment fragment) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2525q(fragment);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: r */
    private void m2526r(Fragment fragment) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2526r(fragment);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: s */
    private void m2527s(Fragment fragment) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2527s(fragment);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: t */
    private void m2528t(Fragment fragment) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2528t(fragment);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: d */
    private void m2516d(Fragment fragment, Bundle bundle) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2516d(fragment, bundle);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: u */
    private void m2529u(Fragment fragment) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2529u(fragment);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: v */
    private void m2530v(Fragment fragment) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2530v(fragment);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: w */
    private void m2532w(Fragment fragment) {
        if (this.f3009p != null) {
            LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s = this.f3009p.f2734A;
            if (layoutInflaterFactory2C0707s instanceof LayoutInflaterFactory2C0707s) {
                layoutInflaterFactory2C0707s.m2532w(fragment);
            }
        }
        Iterator<C0659ac> it = this.f2994H.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: F */
    private boolean m2491F() {
        boolean z = false;
        for (Fragment fragment : this.f3000g.values()) {
            if (fragment != null) {
                z = m2534x(fragment);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    private static boolean m2534x(Fragment fragment) {
        return (fragment.f2745L && fragment.f2746M) || fragment.f2736C.m2491F();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0660ad.f2833a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 == null || !C0703o.m2465a(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment m2511c = resourceId != -1 ? m2511c(resourceId) : null;
        if (m2511c == null && string != null) {
            m2511c = mo2472a(string);
        }
        if (m2511c == null && id != -1) {
            m2511c = m2511c(id);
        }
        if (f2988b) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + m2511c);
        }
        if (m2511c == null) {
            Fragment mo2468c = mo2483f().mo2468c(context.getClassLoader(), str2);
            mo2468c.f2778v = true;
            mo2468c.f2738E = resourceId != 0 ? resourceId : id;
            mo2468c.f2739F = id;
            mo2468c.f2740G = string;
            mo2468c.f2779w = true;
            mo2468c.f2734A = this;
            mo2468c.f2735B = this.f3007n;
            mo2468c.m2321v();
            m2543a(mo2468c, true);
            fragment = mo2468c;
        } else {
            if (m2511c.f2779w) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            m2511c.f2779w = true;
            m2511c.f2735B = this.f3007n;
            m2511c.m2321v();
            fragment = m2511c;
        }
        if (this.f3006m <= 0 && fragment.f2778v) {
            m2541a(fragment, 1, 0, 0, false);
        } else {
            m2520l(fragment);
        }
        if (fragment.f2748O == null) {
            throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
        }
        if (resourceId != 0) {
            fragment.f2748O.setId(resourceId);
        }
        if (fragment.f2748O.getTag() == null) {
            fragment.f2748O.setTag(string);
        }
        return fragment.f2748O;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
