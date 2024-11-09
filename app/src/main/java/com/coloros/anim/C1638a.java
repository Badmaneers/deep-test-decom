package com.coloros.anim;

import android.graphics.Rect;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.p011b.C0329o;
import com.coloros.anim.p056c.C1760e;
import com.coloros.anim.p056c.C1761f;
import com.coloros.anim.p056c.C1764i;
import com.coloros.anim.p056c.p059c.C1749g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: EffectiveAnimationComposition.java */
/* renamed from: com.coloros.anim.a */
/* loaded from: classes.dex */
public final class C1638a {

    /* renamed from: c */
    private Map<String, List<C1749g>> f7836c;

    /* renamed from: d */
    private Map<String, C1689ak> f7837d;

    /* renamed from: e */
    private Map<String, C1760e> f7838e;

    /* renamed from: f */
    private List<C1764i> f7839f;

    /* renamed from: g */
    private C0329o<C1761f> f7840g;

    /* renamed from: h */
    private LongSparseArray<C1749g> f7841h;

    /* renamed from: i */
    private List<C1749g> f7842i;

    /* renamed from: j */
    private Rect f7843j;

    /* renamed from: k */
    private float f7844k;

    /* renamed from: l */
    private float f7845l;

    /* renamed from: m */
    private float f7846m;

    /* renamed from: n */
    private boolean f7847n;

    /* renamed from: a */
    private final C1693ao f7834a = new C1693ao();

    /* renamed from: b */
    private final HashSet<String> f7835b = new HashSet<>();

    /* renamed from: o */
    private int f7848o = 0;

    /* renamed from: a */
    public final void m5461a(Rect rect, float f, float f2, float f3, List<C1749g> list, LongSparseArray<C1749g> longSparseArray, Map<String, List<C1749g>> map, Map<String, C1689ak> map2, C0329o<C1761f> c0329o, Map<String, C1760e> map3, List<C1764i> list2) {
        this.f7843j = rect;
        this.f7844k = f;
        this.f7845l = f2;
        this.f7846m = f3;
        this.f7842i = list;
        this.f7841h = longSparseArray;
        this.f7836c = map;
        this.f7837d = map2;
        this.f7840g = c0329o;
        this.f7838e = map3;
        this.f7839f = list2;
    }

    /* renamed from: a */
    public final void m5462a(String str) {
        Log.w("EffectiveAnimation", str);
        this.f7835b.add(str);
    }

    /* renamed from: a */
    public final void m5459a() {
        this.f7847n = true;
    }

    /* renamed from: a */
    public final void m5460a(int i) {
        this.f7848o += i;
    }

    /* renamed from: b */
    public final boolean m5465b() {
        return this.f7847n;
    }

    /* renamed from: c */
    public final int m5466c() {
        return this.f7848o;
    }

    /* renamed from: a */
    public final void m5463a(boolean z) {
        this.f7834a.m5567a(z);
    }

    /* renamed from: d */
    public final C1693ao m5468d() {
        return this.f7834a;
    }

    /* renamed from: a */
    public final C1749g m5458a(long j) {
        return this.f7841h.get(j);
    }

    /* renamed from: e */
    public final Rect m5469e() {
        return this.f7843j;
    }

    /* renamed from: f */
    public final float m5470f() {
        return (m5478n() / this.f7846m) * 1000.0f;
    }

    /* renamed from: g */
    public final float m5471g() {
        return this.f7844k;
    }

    /* renamed from: h */
    public final float m5472h() {
        return this.f7845l;
    }

    /* renamed from: i */
    public final float m5473i() {
        return this.f7846m;
    }

    /* renamed from: j */
    public final List<C1749g> m5474j() {
        return this.f7842i;
    }

    /* renamed from: b */
    public final List<C1749g> m5464b(String str) {
        return this.f7836c.get(str);
    }

    /* renamed from: k */
    public final C0329o<C1761f> m5475k() {
        return this.f7840g;
    }

    /* renamed from: l */
    public final Map<String, C1760e> m5476l() {
        return this.f7838e;
    }

    /* renamed from: c */
    public final C1764i m5467c(String str) {
        this.f7839f.size();
        for (int i = 0; i < this.f7839f.size(); i++) {
            C1764i c1764i = this.f7839f.get(i);
            if (str.equals(c1764i.f8353a)) {
                return c1764i;
            }
        }
        return null;
    }

    /* renamed from: m */
    public final Map<String, C1689ak> m5477m() {
        return this.f7837d;
    }

    /* renamed from: n */
    public final float m5478n() {
        return this.f7845l - this.f7844k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EffectiveAnimationComposition:\n");
        Iterator<C1749g> it = this.f7842i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().m5756a("\t"));
        }
        return sb.toString();
    }
}
