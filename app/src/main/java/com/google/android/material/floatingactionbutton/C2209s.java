package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p023f.C0478i;
import androidx.core.p024g.C0538w;
import com.google.android.material.internal.C2233ab;
import com.google.android.material.p072a.C2032a;
import com.google.android.material.p072a.C2033b;
import com.google.android.material.p072a.C2037f;
import com.google.android.material.p072a.C2039h;
import com.google.android.material.p080i.C2227a;
import com.google.android.material.p080i.C2229c;
import com.google.android.material.p081j.InterfaceC2283b;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2299l;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.InterfaceC2288ad;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImpl.java */
/* renamed from: com.google.android.material.floatingactionbutton.s */
/* loaded from: classes.dex */
public class C2209s {

    /* renamed from: a */
    static final TimeInterpolator f9765a = C2032a.f8975c;

    /* renamed from: m */
    static final int[] f9766m = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: n */
    static final int[] f9767n = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: o */
    static final int[] f9768o = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: p */
    static final int[] f9769p = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: q */
    static final int[] f9770q = {R.attr.state_enabled};

    /* renamed from: r */
    static final int[] f9771r = new int[0];

    /* renamed from: A */
    private float f9772A;

    /* renamed from: C */
    private int f9774C;

    /* renamed from: E */
    private ArrayList<Animator.AnimatorListener> f9776E;

    /* renamed from: F */
    private ArrayList<Animator.AnimatorListener> f9777F;

    /* renamed from: G */
    private ArrayList<InterfaceC2185ab> f9778G;

    /* renamed from: L */
    private ViewTreeObserver.OnPreDrawListener f9783L;

    /* renamed from: b */
    C2303p f9784b;

    /* renamed from: c */
    C2295h f9785c;

    /* renamed from: d */
    Drawable f9786d;

    /* renamed from: e */
    C2193c f9787e;

    /* renamed from: f */
    Drawable f9788f;

    /* renamed from: g */
    boolean f9789g;

    /* renamed from: i */
    float f9791i;

    /* renamed from: j */
    float f9792j;

    /* renamed from: k */
    float f9793k;

    /* renamed from: l */
    int f9794l;

    /* renamed from: s */
    final FloatingActionButton f9795s;

    /* renamed from: t */
    final InterfaceC2283b f9796t;

    /* renamed from: v */
    private C2039h f9798v;

    /* renamed from: w */
    private C2039h f9799w;

    /* renamed from: x */
    private Animator f9800x;

    /* renamed from: y */
    private C2039h f9801y;

    /* renamed from: z */
    private C2039h f9802z;

    /* renamed from: h */
    boolean f9790h = true;

    /* renamed from: B */
    private float f9773B = 1.0f;

    /* renamed from: D */
    private int f9775D = 0;

    /* renamed from: H */
    private final Rect f9779H = new Rect();

    /* renamed from: I */
    private final RectF f9780I = new RectF();

    /* renamed from: J */
    private final RectF f9781J = new RectF();

    /* renamed from: K */
    private final Matrix f9782K = new Matrix();

    /* renamed from: u */
    private final C2233ab f9797u = new C2233ab();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo6972i() {
    }

    /* renamed from: k */
    boolean mo6973k() {
        return true;
    }

    /* renamed from: n */
    boolean mo6974n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2209s(FloatingActionButton floatingActionButton, InterfaceC2283b interfaceC2283b) {
        this.f9795s = floatingActionButton;
        this.f9796t = interfaceC2283b;
        this.f9797u.m7078a(f9766m, m7004a((AbstractC2188ae) new C2184aa(this)));
        this.f9797u.m7078a(f9767n, m7004a((AbstractC2188ae) new C2216z(this)));
        this.f9797u.m7078a(f9768o, m7004a((AbstractC2188ae) new C2216z(this)));
        this.f9797u.m7078a(f9769p, m7004a((AbstractC2188ae) new C2216z(this)));
        this.f9797u.m7078a(f9770q, m7004a((AbstractC2188ae) new C2187ad(this)));
        this.f9797u.m7078a(f9771r, m7004a((AbstractC2188ae) new C2215y(this)));
        this.f9772A = this.f9795s.getRotation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6968a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        this.f9785c = mo6975p();
        this.f9785c.setTintList(colorStateList);
        if (mode != null) {
            this.f9785c.setTintMode(mode);
        }
        this.f9785c.m7267U();
        this.f9785c.m7276a(this.f9795s.getContext());
        C2227a c2227a = new C2227a(this.f9785c.m7258L());
        c2227a.setTintList(C2229c.m7066b(colorStateList2));
        this.f9786d = c2227a;
        this.f9788f = new LayerDrawable(new Drawable[]{(Drawable) C0478i.m1620a(this.f9785c), c2227a});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6967a(ColorStateList colorStateList) {
        if (this.f9786d != null) {
            C0546a.m1922a(this.f9786d, C2229c.m7066b(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7010a(float f) {
        if (this.f9791i != f) {
            this.f9791i = f;
            mo6966a(this.f9791i, this.f9792j, this.f9793k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo6965a() {
        return this.f9791i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7018b(float f) {
        if (this.f9792j != f) {
            this.f9792j = f;
            mo6966a(this.f9791i, this.f9792j, this.f9793k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m7023c(float f) {
        if (this.f9793k != f) {
            this.f9793k = f;
            mo6966a(this.f9791i, this.f9792j, this.f9793k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7011a(int i) {
        if (this.f9774C != i) {
            this.f9774C = i;
            m7017b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7017b() {
        m7008e(this.f9773B);
    }

    /* renamed from: e */
    private void m7008e(float f) {
        this.f9773B = f;
        Matrix matrix = this.f9782K;
        m7005a(f, matrix);
        this.f9795s.setImageMatrix(matrix);
    }

    /* renamed from: a */
    private void m7005a(float f, Matrix matrix) {
        matrix.reset();
        if (this.f9795s.getDrawable() == null || this.f9774C == 0) {
            return;
        }
        RectF rectF = this.f9780I;
        RectF rectF2 = this.f9781J;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        rectF2.set(0.0f, 0.0f, this.f9774C, this.f9774C);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        matrix.postScale(f, f, this.f9774C / 2.0f, this.f9774C / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7016a(C2303p c2303p) {
        this.f9784b = c2303p;
        if (this.f9785c != null) {
            this.f9785c.setShapeAppearanceModel(c2303p);
        }
        if (this.f9786d instanceof InterfaceC2288ad) {
            ((InterfaceC2288ad) this.f9786d).setShapeAppearanceModel(c2303p);
        }
        if (this.f9787e != null) {
            this.f9787e.m6993a(c2303p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C2039h m7022c() {
        return this.f9801y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7013a(C2039h c2039h) {
        this.f9801y = c2039h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C2039h m7024d() {
        return this.f9802z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7020b(C2039h c2039h) {
        this.f9802z = c2039h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m7026e() {
        return !this.f9789g || this.f9795s.getSizeDimension() >= this.f9794l;
    }

    /* renamed from: a */
    void mo6966a(float f, float f2, float f3) {
        m7029j();
        m7025d(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m7025d(float f) {
        if (this.f9785c != null) {
            this.f9785c.m7288r(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6970a(int[] iArr) {
        this.f9797u.m7077a(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo6971f() {
        this.f9797u.m7076a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7012a(Animator.AnimatorListener animatorListener) {
        if (this.f9776E == null) {
            this.f9776E = new ArrayList<>();
        }
        this.f9776E.add(animatorListener);
    }

    /* renamed from: b */
    public final void m7019b(Animator.AnimatorListener animatorListener) {
        if (this.f9777F == null) {
            this.f9777F = new ArrayList<>();
        }
        this.f9777F.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7015a(InterfaceC2186ac interfaceC2186ac, boolean z) {
        C2039h c2039h;
        if (m7034r()) {
            return;
        }
        if (this.f9800x != null) {
            this.f9800x.cancel();
        }
        if (m7009t()) {
            if (this.f9802z != null) {
                c2039h = this.f9802z;
            } else {
                if (this.f9799w == null) {
                    this.f9799w = C2039h.m6245a(this.f9795s.getContext(), com.google.android.material.R.animator.design_fab_hide_motion_spec);
                }
                c2039h = (C2039h) C0478i.m1620a(this.f9799w);
            }
            AnimatorSet m7003a = m7003a(c2039h, 0.0f, 0.0f, 0.0f);
            m7003a.addListener(new C2210t(this, z, interfaceC2186ac));
            if (this.f9777F != null) {
                Iterator<Animator.AnimatorListener> it = this.f9777F.iterator();
                while (it.hasNext()) {
                    m7003a.addListener(it.next());
                }
            }
            m7003a.start();
            return;
        }
        this.f9795s.m7075a(z ? 8 : 4, z);
        if (interfaceC2186ac != null) {
            interfaceC2186ac.mo6963b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7021b(InterfaceC2186ac interfaceC2186ac, boolean z) {
        C2039h c2039h;
        if (m7033q()) {
            return;
        }
        if (this.f9800x != null) {
            this.f9800x.cancel();
        }
        if (m7009t()) {
            if (this.f9795s.getVisibility() != 0) {
                this.f9795s.setAlpha(0.0f);
                this.f9795s.setScaleY(0.0f);
                this.f9795s.setScaleX(0.0f);
                m7008e(0.0f);
            }
            if (this.f9801y != null) {
                c2039h = this.f9801y;
            } else {
                if (this.f9798v == null) {
                    this.f9798v = C2039h.m6245a(this.f9795s.getContext(), com.google.android.material.R.animator.design_fab_show_motion_spec);
                }
                c2039h = (C2039h) C0478i.m1620a(this.f9798v);
            }
            AnimatorSet m7003a = m7003a(c2039h, 1.0f, 1.0f, 1.0f);
            m7003a.addListener(new C2211u(this, z, interfaceC2186ac));
            if (this.f9776E != null) {
                Iterator<Animator.AnimatorListener> it = this.f9776E.iterator();
                while (it.hasNext()) {
                    m7003a.addListener(it.next());
                }
            }
            m7003a.start();
            return;
        }
        this.f9795s.m7075a(0, z);
        this.f9795s.setAlpha(1.0f);
        this.f9795s.setScaleY(1.0f);
        this.f9795s.setScaleX(1.0f);
        m7008e(1.0f);
        if (interfaceC2186ac != null) {
            interfaceC2186ac.mo6962a();
        }
    }

    /* renamed from: a */
    private AnimatorSet m7003a(C2039h c2039h, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9795s, (Property<FloatingActionButton, Float>) View.ALPHA, f);
        c2039h.m6253a("opacity").m6259a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9795s, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        c2039h.m6253a("scale").m6259a((Animator) ofFloat2);
        m7006a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f9795s, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        c2039h.m6253a("scale").m6259a((Animator) ofFloat3);
        m7006a(ofFloat3);
        arrayList.add(ofFloat3);
        m7005a(f3, this.f9782K);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f9795s, new C2037f(), new C2212v(this), new Matrix(this.f9782K));
        c2039h.m6253a("iconScale").m6259a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C2033b.m6242a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    private void m7006a(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C2213w(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7014a(InterfaceC2185ab interfaceC2185ab) {
        if (this.f9778G == null) {
            this.f9778G = new ArrayList<>();
        }
        this.f9778G.add(interfaceC2185ab);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m7027g() {
        if (this.f9778G != null) {
            Iterator<InterfaceC2185ab> it = this.f9778G.iterator();
            while (it.hasNext()) {
                it.next().mo6960a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m7028h() {
        if (this.f9778G != null) {
            Iterator<InterfaceC2185ab> it = this.f9778G.iterator();
            while (it.hasNext()) {
                it.next().mo6961b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m7029j() {
        Rect rect = this.f9779H;
        mo6969a(rect);
        m7007b(rect);
        this.f9796t.mo6997a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6969a(Rect rect) {
        int sizeDimension = this.f9789g ? (this.f9794l - this.f9795s.getSizeDimension()) / 2 : 0;
        int max = Math.max(sizeDimension, (int) Math.ceil(this.f9790h ? mo6965a() + this.f9793k : 0.0f));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: b */
    private void m7007b(Rect rect) {
        C0478i.m1621a(this.f9788f, "Didn't initialize content background");
        if (mo6973k()) {
            this.f9796t.mo6998a(new InsetDrawable(this.f9788f, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.f9796t.mo6998a(this.f9788f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final void m7030l() {
        if (this.f9785c != null) {
            C2299l.m7295a(this.f9795s, this.f9785c);
        }
        if (mo6974n()) {
            ViewTreeObserver viewTreeObserver = this.f9795s.getViewTreeObserver();
            if (this.f9783L == null) {
                this.f9783L = new ViewTreeObserverOnPreDrawListenerC2214x(this);
            }
            viewTreeObserver.addOnPreDrawListener(this.f9783L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m7031m() {
        ViewTreeObserver viewTreeObserver = this.f9795s.getViewTreeObserver();
        if (this.f9783L != null) {
            viewTreeObserver.removeOnPreDrawListener(this.f9783L);
            this.f9783L = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final void m7032o() {
        float rotation = this.f9795s.getRotation();
        if (this.f9772A != rotation) {
            this.f9772A = rotation;
            mo6976s();
        }
    }

    /* renamed from: p */
    C2295h mo6975p() {
        return new C2295h((C2303p) C0478i.m1620a(this.f9784b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean m7033q() {
        return this.f9795s.getVisibility() != 0 ? this.f9775D == 2 : this.f9775D != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean m7034r() {
        return this.f9795s.getVisibility() == 0 ? this.f9775D == 1 : this.f9775D != 2;
    }

    /* renamed from: a */
    private static ValueAnimator m7004a(AbstractC2188ae abstractC2188ae) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f9765a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC2188ae);
        valueAnimator.addUpdateListener(abstractC2188ae);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: t */
    private boolean m7009t() {
        return C0538w.m1819C(this.f9795s) && !this.f9795s.isInEditMode();
    }

    /* renamed from: s */
    void mo6976s() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f9772A % 90.0f != 0.0f) {
                if (this.f9795s.getLayerType() != 1) {
                    this.f9795s.setLayerType(1, null);
                }
            } else if (this.f9795s.getLayerType() != 0) {
                this.f9795s.setLayerType(0, null);
            }
        }
        if (this.f9785c != null) {
            this.f9785c.m7257D((int) this.f9772A);
        }
    }
}
