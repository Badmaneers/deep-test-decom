package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0716aa;
import androidx.lifecycle.C0717ab;
import androidx.lifecycle.C0720ae;
import androidx.lifecycle.InterfaceC0718ac;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerViewModel.java */
/* renamed from: androidx.fragment.app.ai */
/* loaded from: classes.dex */
public class C0665ai extends AbstractC0716aa {

    /* renamed from: a */
    private static final InterfaceC0718ac f2841a = new C0666aj();

    /* renamed from: e */
    private final boolean f2845e;

    /* renamed from: b */
    private final HashSet<Fragment> f2842b = new HashSet<>();

    /* renamed from: c */
    private final HashMap<String, C0665ai> f2843c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C0720ae> f2844d = new HashMap<>();

    /* renamed from: f */
    private boolean f2846f = false;

    /* renamed from: g */
    private boolean f2847g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0665ai m2361a(C0720ae c0720ae) {
        return (C0665ai) new C0717ab(c0720ae, f2841a).m2600a(C0665ai.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0665ai(boolean z) {
        this.f2845e = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC0716aa
    /* renamed from: a */
    public final void mo2362a() {
        if (LayoutInflaterFactory2C0707s.f2988b) {
            Log.d("FragmentManager", "onCleared called for ".concat(String.valueOf(this)));
        }
        this.f2846f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m2364b() {
        return this.f2846f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m2363a(Fragment fragment) {
        return this.f2842b.add(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Collection<Fragment> m2366c() {
        return this.f2842b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m2365b(Fragment fragment) {
        if (!this.f2842b.contains(fragment)) {
            return true;
        }
        if (this.f2845e) {
            return this.f2846f;
        }
        return !this.f2847g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m2367c(Fragment fragment) {
        return this.f2842b.remove(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C0665ai m2368d(Fragment fragment) {
        C0665ai c0665ai = this.f2843c.get(fragment.f2771o);
        if (c0665ai != null) {
            return c0665ai;
        }
        C0665ai c0665ai2 = new C0665ai(this.f2845e);
        this.f2843c.put(fragment.f2771o, c0665ai2);
        return c0665ai2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final C0720ae m2369e(Fragment fragment) {
        C0720ae c0720ae = this.f2844d.get(fragment.f2771o);
        if (c0720ae != null) {
            return c0720ae;
        }
        C0720ae c0720ae2 = new C0720ae();
        this.f2844d.put(fragment.f2771o, c0720ae2);
        return c0720ae2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m2370f(Fragment fragment) {
        if (LayoutInflaterFactory2C0707s.f2988b) {
            Log.d("FragmentManager", "Clearing non-config state for ".concat(String.valueOf(fragment)));
        }
        C0665ai c0665ai = this.f2843c.get(fragment.f2771o);
        if (c0665ai != null) {
            c0665ai.mo2362a();
            this.f2843c.remove(fragment.f2771o);
        }
        C0720ae c0720ae = this.f2844d.get(fragment.f2771o);
        if (c0720ae != null) {
            c0720ae.m2603a();
            this.f2844d.remove(fragment.f2771o);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0665ai c0665ai = (C0665ai) obj;
        return this.f2842b.equals(c0665ai.f2842b) && this.f2843c.equals(c0665ai.f2843c) && this.f2844d.equals(c0665ai.f2844d);
    }

    public int hashCode() {
        return (((this.f2842b.hashCode() * 31) + this.f2843c.hashCode()) * 31) + this.f2844d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2842b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2843c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2844d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
