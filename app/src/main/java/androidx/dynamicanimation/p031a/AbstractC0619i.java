package androidx.dynamicanimation.p031a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.p031a.AbstractC0619i;
import java.util.ArrayList;

/* compiled from: DynamicAnimation.java */
/* renamed from: androidx.dynamicanimation.a.i */
/* loaded from: classes.dex */
public abstract class AbstractC0619i<T extends AbstractC0619i<T>> implements InterfaceC0613c {

    /* renamed from: a */
    public static final AbstractC0636z f2668a = new C0620j("translationX");

    /* renamed from: b */
    public static final AbstractC0636z f2669b = new C0626p("translationY");

    /* renamed from: c */
    public static final AbstractC0636z f2670c = new C0627q("translationZ");

    /* renamed from: d */
    public static final AbstractC0636z f2671d = new C0628r("scaleX");

    /* renamed from: e */
    public static final AbstractC0636z f2672e = new C0629s("scaleY");

    /* renamed from: f */
    public static final AbstractC0636z f2673f = new C0630t("rotation");

    /* renamed from: g */
    public static final AbstractC0636z f2674g = new C0631u("rotationX");

    /* renamed from: h */
    public static final AbstractC0636z f2675h = new C0632v("rotationY");

    /* renamed from: i */
    public static final AbstractC0636z f2676i = new C0633w("x");

    /* renamed from: j */
    public static final AbstractC0636z f2677j = new C0621k("y");

    /* renamed from: k */
    public static final AbstractC0636z f2678k = new C0622l("z");

    /* renamed from: l */
    public static final AbstractC0636z f2679l = new C0623m("alpha");

    /* renamed from: m */
    public static final AbstractC0636z f2680m = new C0624n("scrollX");

    /* renamed from: n */
    public static final AbstractC0636z f2681n = new C0625o("scrollY");

    /* renamed from: r */
    final Object f2685r;

    /* renamed from: s */
    final AbstractC0609aa f2686s;

    /* renamed from: x */
    private float f2691x;

    /* renamed from: o */
    float f2682o = 0.0f;

    /* renamed from: p */
    float f2683p = Float.MAX_VALUE;

    /* renamed from: q */
    boolean f2684q = false;

    /* renamed from: t */
    boolean f2687t = false;

    /* renamed from: u */
    float f2688u = Float.MAX_VALUE;

    /* renamed from: v */
    float f2689v = -this.f2688u;

    /* renamed from: w */
    private long f2690w = 0;

    /* renamed from: y */
    private final ArrayList<InterfaceC0635y> f2692y = new ArrayList<>();

    /* renamed from: z */
    private final ArrayList<Object> f2693z = new ArrayList<>();

    /* renamed from: b */
    abstract boolean mo2186b(long j);

    public <K> AbstractC0619i(K k, AbstractC0609aa<K> abstractC0609aa) {
        this.f2685r = k;
        this.f2686s = abstractC0609aa;
        if (this.f2686s == f2673f || this.f2686s == f2674g || this.f2686s == f2675h) {
            this.f2691x = 0.1f;
            return;
        }
        if (this.f2686s == f2679l) {
            this.f2691x = 0.00390625f;
        } else if (this.f2686s == f2671d || this.f2686s == f2672e) {
            this.f2691x = 0.00390625f;
        } else {
            this.f2691x = 1.0f;
        }
    }

    /* renamed from: a */
    public final T m2202a() {
        this.f2682o = 0.0f;
        return this;
    }

    /* renamed from: a */
    public final T m2203a(InterfaceC0635y interfaceC0635y) {
        if (!this.f2692y.contains(interfaceC0635y)) {
            this.f2692y.add(interfaceC0635y);
        }
        return this;
    }

    /* renamed from: a */
    private static <T> void m2201a(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: b */
    public void mo2185b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f2687t || this.f2687t) {
            return;
        }
        this.f2687t = true;
        if (!this.f2684q) {
            this.f2683p = this.f2686s.mo2182a(this.f2685r);
        }
        if (this.f2683p > this.f2688u || this.f2683p < this.f2689v) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        C0608a.m2177a().m2179a(this);
    }

    @Override // androidx.dynamicanimation.p031a.InterfaceC0613c
    /* renamed from: a */
    public final boolean mo2198a(long j) {
        if (this.f2690w == 0) {
            this.f2690w = j;
            m2200a(this.f2683p);
            return false;
        }
        long j2 = j - this.f2690w;
        this.f2690w = j;
        boolean mo2186b = mo2186b(j2);
        this.f2683p = Math.min(this.f2683p, this.f2688u);
        this.f2683p = Math.max(this.f2683p, this.f2689v);
        m2200a(this.f2683p);
        if (mo2186b) {
            this.f2687t = false;
            C0608a.m2177a().m2181b(this);
            this.f2690w = 0L;
            this.f2684q = false;
            for (int i = 0; i < this.f2692y.size(); i++) {
                if (this.f2692y.get(i) != null) {
                    this.f2692y.get(i);
                }
            }
            m2201a(this.f2692y);
        }
        return mo2186b;
    }

    /* renamed from: a */
    private void m2200a(float f) {
        this.f2686s.mo2183a(this.f2685r, f);
        for (int i = 0; i < this.f2693z.size(); i++) {
            if (this.f2693z.get(i) != null) {
                this.f2693z.get(i);
            }
        }
        m2201a(this.f2693z);
    }

    /* renamed from: c */
    public final float m2204c() {
        return this.f2691x * 0.75f;
    }
}
