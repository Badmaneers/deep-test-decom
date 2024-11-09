package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;
import com.google.android.material.internal.C2250as;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p080i.C2227a;
import com.google.android.material.p080i.C2229c;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.InterfaceC2288ad;

/* compiled from: MaterialButtonHelper.java */
/* renamed from: com.google.android.material.button.d */
/* loaded from: classes.dex */
public final class C2101d {

    /* renamed from: a */
    private static final boolean f9339a;

    /* renamed from: b */
    private final MaterialButton f9340b;

    /* renamed from: c */
    private C2303p f9341c;

    /* renamed from: d */
    private int f9342d;

    /* renamed from: e */
    private int f9343e;

    /* renamed from: f */
    private int f9344f;

    /* renamed from: g */
    private int f9345g;

    /* renamed from: h */
    private int f9346h;

    /* renamed from: i */
    private int f9347i;

    /* renamed from: j */
    private PorterDuff.Mode f9348j;

    /* renamed from: k */
    private ColorStateList f9349k;

    /* renamed from: l */
    private ColorStateList f9350l;

    /* renamed from: m */
    private ColorStateList f9351m;

    /* renamed from: n */
    private Drawable f9352n;

    /* renamed from: o */
    private boolean f9353o = false;

    /* renamed from: p */
    private boolean f9354p = false;

    /* renamed from: q */
    private boolean f9355q = false;

    /* renamed from: r */
    private boolean f9356r;

    /* renamed from: s */
    private LayerDrawable f9357s;

    static {
        f9339a = Build.VERSION.SDK_INT >= 21;
    }

    public C2101d(MaterialButton materialButton, C2303p c2303p) {
        this.f9340b = materialButton;
        this.f9341c = c2303p;
    }

    /* renamed from: a */
    public final void m6537a(TypedArray typedArray) {
        Drawable m6528a;
        this.f9342d = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetLeft, 0);
        this.f9343e = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetRight, 0);
        this.f9344f = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetTop, 0);
        this.f9345g = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(R.styleable.MaterialButton_cornerRadius)) {
            this.f9346h = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_cornerRadius, -1);
            m6539a(this.f9341c.m7302a(this.f9346h));
            this.f9355q = true;
        }
        this.f9347i = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_strokeWidth, 0);
        this.f9348j = C2250as.m7109a(typedArray.getInt(R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f9349k = C2221d.m7045a(this.f9340b.getContext(), typedArray, R.styleable.MaterialButton_backgroundTint);
        this.f9350l = C2221d.m7045a(this.f9340b.getContext(), typedArray, R.styleable.MaterialButton_strokeColor);
        this.f9351m = C2221d.m7045a(this.f9340b.getContext(), typedArray, R.styleable.MaterialButton_rippleColor);
        this.f9356r = typedArray.getBoolean(R.styleable.MaterialButton_android_checkable, false);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_elevation, 0);
        int m1883l = C0538w.m1883l(this.f9340b);
        int paddingTop = this.f9340b.getPaddingTop();
        int m1884m = C0538w.m1884m(this.f9340b);
        int paddingBottom = this.f9340b.getPaddingBottom();
        if (typedArray.hasValue(R.styleable.MaterialButton_android_background)) {
            m6533a();
        } else {
            MaterialButton materialButton = this.f9340b;
            C2295h c2295h = new C2295h(this.f9341c);
            c2295h.m7276a(this.f9340b.getContext());
            C0546a.m1922a(c2295h, this.f9349k);
            if (this.f9348j != null) {
                C0546a.m1925a(c2295h, this.f9348j);
            }
            c2295h.m7274a(this.f9347i, this.f9350l);
            C2295h c2295h2 = new C2295h(this.f9341c);
            c2295h2.setTint(0);
            c2295h2.m7273a(this.f9347i, this.f9353o ? C2220c.m7042a(this.f9340b, R.attr.colorSurface) : 0);
            if (f9339a) {
                this.f9352n = new C2295h(this.f9341c);
                C0546a.m1920a(this.f9352n, -1);
                this.f9357s = new RippleDrawable(C2229c.m7066b(this.f9351m), m6528a(new LayerDrawable(new Drawable[]{c2295h2, c2295h})), this.f9352n);
                m6528a = this.f9357s;
            } else {
                this.f9352n = new C2227a(this.f9341c);
                C0546a.m1922a(this.f9352n, C2229c.m7066b(this.f9351m));
                this.f9357s = new LayerDrawable(new Drawable[]{c2295h2, c2295h, this.f9352n});
                m6528a = m6528a(this.f9357s);
            }
            materialButton.setInternalBackground(m6528a);
            C2295h m6530c = m6530c(false);
            if (m6530c != null) {
                m6530c.m7288r(dimensionPixelSize);
            }
        }
        C0538w.m1863b(this.f9340b, m1883l + this.f9342d, paddingTop + this.f9344f, m1884m + this.f9343e, paddingBottom + this.f9345g);
    }

    /* renamed from: a */
    public final void m6533a() {
        this.f9354p = true;
        this.f9340b.setSupportBackgroundTintList(this.f9349k);
        this.f9340b.setSupportBackgroundTintMode(this.f9348j);
    }

    /* renamed from: b */
    public final boolean m6544b() {
        return this.f9354p;
    }

    /* renamed from: a */
    private InsetDrawable m6528a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f9342d, this.f9344f, this.f9343e, this.f9345g);
    }

    /* renamed from: a */
    public final void m6536a(ColorStateList colorStateList) {
        if (this.f9349k != colorStateList) {
            this.f9349k = colorStateList;
            if (m6530c(false) != null) {
                C0546a.m1922a(m6530c(false), this.f9349k);
            }
        }
    }

    /* renamed from: c */
    public final ColorStateList m6545c() {
        return this.f9349k;
    }

    /* renamed from: a */
    public final void m6538a(PorterDuff.Mode mode) {
        if (this.f9348j != mode) {
            this.f9348j = mode;
            if (m6530c(false) == null || this.f9348j == null) {
                return;
            }
            C0546a.m1925a(m6530c(false), this.f9348j);
        }
    }

    /* renamed from: d */
    public final PorterDuff.Mode m6547d() {
        return this.f9348j;
    }

    /* renamed from: a */
    public final void m6540a(boolean z) {
        this.f9353o = z;
        m6531l();
    }

    /* renamed from: a */
    public final void m6535a(int i, int i2) {
        if (this.f9352n != null) {
            this.f9352n.setBounds(this.f9342d, this.f9344f, i2 - this.f9343e, i - this.f9345g);
        }
    }

    /* renamed from: b */
    public final void m6542b(ColorStateList colorStateList) {
        if (this.f9351m != colorStateList) {
            this.f9351m = colorStateList;
            if (f9339a && (this.f9340b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f9340b.getBackground()).setColor(C2229c.m7066b(colorStateList));
            } else {
                if (f9339a || !(this.f9340b.getBackground() instanceof C2227a)) {
                    return;
                }
                ((C2227a) this.f9340b.getBackground()).setTintList(C2229c.m7066b(colorStateList));
            }
        }
    }

    /* renamed from: e */
    public final ColorStateList m6548e() {
        return this.f9351m;
    }

    /* renamed from: c */
    public final void m6546c(ColorStateList colorStateList) {
        if (this.f9350l != colorStateList) {
            this.f9350l = colorStateList;
            m6531l();
        }
    }

    /* renamed from: f */
    public final ColorStateList m6549f() {
        return this.f9350l;
    }

    /* renamed from: a */
    public final void m6534a(int i) {
        if (this.f9347i != i) {
            this.f9347i = i;
            m6531l();
        }
    }

    /* renamed from: g */
    public final int m6550g() {
        return this.f9347i;
    }

    /* renamed from: b */
    public final void m6541b(int i) {
        if (this.f9355q && this.f9346h == i) {
            return;
        }
        this.f9346h = i;
        this.f9355q = true;
        m6539a(this.f9341c.m7302a(i));
    }

    /* renamed from: h */
    public final int m6551h() {
        return this.f9346h;
    }

    /* renamed from: c */
    private C2295h m6530c(boolean z) {
        if (this.f9357s == null || this.f9357s.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f9339a) {
            return (C2295h) ((LayerDrawable) ((InsetDrawable) this.f9357s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return (C2295h) this.f9357s.getDrawable(!z ? 1 : 0);
    }

    /* renamed from: i */
    public final C2295h m6552i() {
        return m6530c(false);
    }

    /* renamed from: b */
    public final void m6543b(boolean z) {
        this.f9356r = z;
    }

    /* renamed from: j */
    public final boolean m6553j() {
        return this.f9356r;
    }

    /* renamed from: m */
    private InterfaceC2288ad m6532m() {
        if (this.f9357s == null || this.f9357s.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f9357s.getNumberOfLayers() > 2) {
            return (InterfaceC2288ad) this.f9357s.getDrawable(2);
        }
        return (InterfaceC2288ad) this.f9357s.getDrawable(1);
    }

    /* renamed from: a */
    public final void m6539a(C2303p c2303p) {
        this.f9341c = c2303p;
        m6529b(c2303p);
    }

    /* renamed from: k */
    public final C2303p m6554k() {
        return this.f9341c;
    }

    /* renamed from: l */
    private void m6531l() {
        C2295h m6530c = m6530c(false);
        C2295h m6530c2 = m6530c(true);
        if (m6530c != null) {
            m6530c.m7274a(this.f9347i, this.f9350l);
            if (m6530c2 != null) {
                m6530c2.m7273a(this.f9347i, this.f9353o ? C2220c.m7042a(this.f9340b, R.attr.colorSurface) : 0);
            }
        }
    }

    /* renamed from: b */
    private void m6529b(C2303p c2303p) {
        if (m6530c(false) != null) {
            m6530c(false).setShapeAppearanceModel(c2303p);
        }
        if (m6530c(true) != null) {
            m6530c(true).setShapeAppearanceModel(c2303p);
        }
        if (m6532m() != null) {
            m6532m().setShapeAppearanceModel(c2303p);
        }
    }
}
