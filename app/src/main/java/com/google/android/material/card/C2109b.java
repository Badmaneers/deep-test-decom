package com.google.android.material.card;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0538w;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p080i.C2229c;
import com.google.android.material.p082k.C2291d;
import com.google.android.material.p082k.C2292e;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2302o;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.C2304q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialCardViewHelper.java */
/* renamed from: com.google.android.material.card.b */
/* loaded from: classes.dex */
public final class C2109b {

    /* renamed from: a */
    private static final int[] f9380a = {R.attr.state_checked};

    /* renamed from: b */
    private static final double f9381b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c */
    private final MaterialCardView f9382c;

    /* renamed from: e */
    private final C2295h f9384e;

    /* renamed from: f */
    private final C2295h f9385f;

    /* renamed from: g */
    private final int f9386g;

    /* renamed from: h */
    private final int f9387h;

    /* renamed from: i */
    private int f9388i;

    /* renamed from: j */
    private Drawable f9389j;

    /* renamed from: k */
    private Drawable f9390k;

    /* renamed from: l */
    private ColorStateList f9391l;

    /* renamed from: m */
    private ColorStateList f9392m;

    /* renamed from: n */
    private C2303p f9393n;

    /* renamed from: o */
    private ColorStateList f9394o;

    /* renamed from: p */
    private Drawable f9395p;

    /* renamed from: q */
    private LayerDrawable f9396q;

    /* renamed from: r */
    private C2295h f9397r;

    /* renamed from: s */
    private C2295h f9398s;

    /* renamed from: u */
    private boolean f9400u;

    /* renamed from: d */
    private final Rect f9383d = new Rect();

    /* renamed from: t */
    private boolean f9399t = false;

    public C2109b(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f9382c = materialCardView;
        this.f9384e = new C2295h(materialCardView.getContext(), attributeSet, i, i2);
        this.f9384e.m7276a(materialCardView.getContext());
        this.f9384e.m7267U();
        C2304q m7313k = this.f9384e.m7258L().m7313k();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.CardView, i, com.google.android.material.R.style.CardView);
        if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CardView_cardCornerRadius)) {
            m7313k.m7332b(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.CardView_cardCornerRadius, 0.0f));
        }
        this.f9385f = new C2295h();
        m6587a(m7313k.m7327a());
        Resources resources = materialCardView.getResources();
        this.f9386g = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_card_checked_icon_margin);
        this.f9387h = resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6585a(TypedArray typedArray) {
        this.f9394o = C2221d.m7045a(this.f9382c.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_strokeColor);
        if (this.f9394o == null) {
            this.f9394o = ColorStateList.valueOf(-1);
        }
        this.f9388i = typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_strokeWidth, 0);
        this.f9400u = typedArray.getBoolean(com.google.android.material.R.styleable.MaterialCardView_android_checkable, false);
        this.f9382c.setLongClickable(this.f9400u);
        this.f9392m = C2221d.m7045a(this.f9382c.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_checkedIconTint);
        m6586a(C2221d.m7047b(this.f9382c.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_checkedIcon));
        this.f9391l = C2221d.m7045a(this.f9382c.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_rippleColor);
        if (this.f9391l == null) {
            this.f9391l = ColorStateList.valueOf(C2220c.m7042a(this.f9382c, com.google.android.material.R.attr.colorControlHighlight));
        }
        m6594c(C2221d.m7045a(this.f9382c.getContext(), typedArray, com.google.android.material.R.styleable.MaterialCardView_cardForegroundColor));
        m6570G();
        m6606m();
        m6575v();
        this.f9382c.setBackgroundInternal(m6574b(this.f9384e));
        this.f9389j = this.f9382c.isClickable() ? m6567D() : this.f9385f;
        this.f9382c.setForeground(m6574b(this.f9389j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m6589a() {
        return this.f9399t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m6590b() {
        this.f9399t = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6584a(ColorStateList colorStateList) {
        if (this.f9394o == colorStateList) {
            return;
        }
        this.f9394o = colorStateList;
        m6575v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final int m6593c() {
        if (this.f9394o == null) {
            return -1;
        }
        return this.f9394o.getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final ColorStateList m6595d() {
        return this.f9394o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6581a(int i) {
        if (i == this.f9388i) {
            return;
        }
        this.f9388i = i;
        m6575v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m6597e() {
        return this.f9388i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final C2295h m6599f() {
        return this.f9384e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m6592b(ColorStateList colorStateList) {
        this.f9384e.m7282g(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final ColorStateList m6600g() {
        return this.f9384e.m7259M();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m6594c(ColorStateList colorStateList) {
        C2295h c2295h = this.f9385f;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c2295h.m7282g(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final ColorStateList m6601h() {
        return this.f9385f.m7259M();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6583a(int i, int i2, int i3, int i4) {
        this.f9383d.set(i, i2, i3, i4);
        m6608o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final Rect m6602i() {
        return this.f9383d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m6603j() {
        Drawable drawable = this.f9389j;
        this.f9389j = this.f9382c.isClickable() ? m6567D() : this.f9385f;
        if (drawable != this.f9389j) {
            Drawable drawable2 = this.f9389j;
            if (Build.VERSION.SDK_INT >= 23 && (this.f9382c.getForeground() instanceof InsetDrawable)) {
                ((InsetDrawable) this.f9382c.getForeground()).setDrawable(drawable2);
            } else {
                this.f9382c.setForeground(m6574b(drawable2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6580a(float f) {
        m6587a(this.f9393n.m7302a(f));
        this.f9389j.invalidateSelf();
        if (m6565B() || m6564A()) {
            m6608o();
        }
        if (m6565B()) {
            m6607n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final float m6604k() {
        return this.f9384e.m7269W();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m6591b(float f) {
        this.f9384e.m7286p(f);
        if (this.f9385f != null) {
            this.f9385f.m7286p(f);
        }
        if (this.f9398s != null) {
            this.f9398s.m7286p(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final float m6605l() {
        return this.f9384e.m7264R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m6606m() {
        this.f9384e.m7288r(this.f9382c.getCardElevation());
    }

    /* renamed from: v */
    private void m6575v() {
        this.f9385f.m7274a(this.f9388i, this.f9394o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final void m6608o() {
        int m6566C = (int) ((m6564A() || m6565B() ? m6566C() : 0.0f) - m6579z());
        this.f9382c.m6563b(this.f9383d.left + m6566C, this.f9383d.top + m6566C, this.f9383d.right + m6566C, this.f9383d.bottom + m6566C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6588a(boolean z) {
        this.f9400u = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean m6609p() {
        return this.f9400u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m6596d(ColorStateList colorStateList) {
        this.f9391l = colorStateList;
        m6570G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m6598e(ColorStateList colorStateList) {
        this.f9392m = colorStateList;
        if (this.f9390k != null) {
            C0546a.m1922a(this.f9390k, colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final ColorStateList m6610q() {
        return this.f9392m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final ColorStateList m6611r() {
        return this.f9391l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final Drawable m6612s() {
        return this.f9390k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6586a(Drawable drawable) {
        this.f9390k = drawable;
        if (drawable != null) {
            this.f9390k = C0546a.m1933f(drawable.mutate());
            C0546a.m1922a(this.f9390k, this.f9392m);
        }
        if (this.f9396q != null) {
            this.f9396q.setDrawableByLayerId(com.google.android.material.R.id.mtrl_card_checked_layer_id, m6571H());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6582a(int i, int i2) {
        int i3;
        int i4;
        if (this.f9396q != null) {
            int i5 = (i - this.f9386g) - this.f9387h;
            int i6 = (i2 - this.f9386g) - this.f9387h;
            if ((Build.VERSION.SDK_INT < 21) || this.f9382c.getUseCompatPadding()) {
                i6 -= (int) Math.ceil(m6576w() * 2.0f);
                i5 -= (int) Math.ceil(m6577x() * 2.0f);
            }
            int i7 = i6;
            int i8 = this.f9386g;
            if (C0538w.m1878h(this.f9382c) == 1) {
                i4 = i5;
                i3 = i8;
            } else {
                i3 = i5;
                i4 = i8;
            }
            this.f9396q.setLayerInset(2, i3, this.f9386g, i4, i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final void m6613t() {
        if (this.f9395p != null) {
            Rect bounds = this.f9395p.getBounds();
            int i = bounds.bottom;
            this.f9395p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f9395p.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6587a(C2303p c2303p) {
        this.f9393n = c2303p;
        this.f9384e.setShapeAppearanceModel(c2303p);
        this.f9384e.m7281f(!this.f9384e.m7280aa());
        if (this.f9385f != null) {
            this.f9385f.setShapeAppearanceModel(c2303p);
        }
        if (this.f9398s != null) {
            this.f9398s.setShapeAppearanceModel(c2303p);
        }
        if (this.f9397r != null) {
            this.f9397r.setShapeAppearanceModel(c2303p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final C2303p m6614u() {
        return this.f9393n;
    }

    /* renamed from: b */
    private Drawable m6574b(Drawable drawable) {
        int ceil;
        int i;
        if ((Build.VERSION.SDK_INT < 21) || this.f9382c.getUseCompatPadding()) {
            int ceil2 = (int) Math.ceil(m6576w());
            ceil = (int) Math.ceil(m6577x());
            i = ceil2;
        } else {
            ceil = 0;
            i = 0;
        }
        return new C2110c(this, drawable, ceil, i, ceil, i);
    }

    /* renamed from: w */
    private float m6576w() {
        return (this.f9382c.getMaxCardElevation() * 1.5f) + (m6565B() ? m6566C() : 0.0f);
    }

    /* renamed from: x */
    private float m6577x() {
        return this.f9382c.getMaxCardElevation() + (m6565B() ? m6566C() : 0.0f);
    }

    /* renamed from: y */
    private boolean m6578y() {
        return Build.VERSION.SDK_INT >= 21 && this.f9384e.m7280aa();
    }

    /* renamed from: z */
    private float m6579z() {
        if (!this.f9382c.getPreventCornerOverlap()) {
            return 0.0f;
        }
        if (Build.VERSION.SDK_INT < 21 || this.f9382c.getUseCompatPadding()) {
            return (float) ((1.0d - f9381b) * this.f9382c.getCardViewRadius());
        }
        return 0.0f;
    }

    /* renamed from: A */
    private boolean m6564A() {
        return this.f9382c.getPreventCornerOverlap() && !m6578y();
    }

    /* renamed from: B */
    private boolean m6565B() {
        return this.f9382c.getPreventCornerOverlap() && m6578y() && this.f9382c.getUseCompatPadding();
    }

    /* renamed from: C */
    private float m6566C() {
        return Math.max(Math.max(m6573a(this.f9393n.m7304b(), this.f9384e.m7269W()), m6573a(this.f9393n.m7305c(), this.f9384e.m7270X())), Math.max(m6573a(this.f9393n.m7306d(), this.f9384e.m7272Z()), m6573a(this.f9393n.m7307e(), this.f9384e.m7271Y())));
    }

    /* renamed from: a */
    private static float m6573a(C2291d c2291d, float f) {
        if (c2291d instanceof C2302o) {
            return (float) ((1.0d - f9381b) * f);
        }
        if (c2291d instanceof C2292e) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: D */
    private Drawable m6567D() {
        if (this.f9395p == null) {
            this.f9395p = m6568E();
        }
        if (this.f9396q == null) {
            this.f9396q = new LayerDrawable(new Drawable[]{this.f9395p, this.f9385f, m6571H()});
            this.f9396q.setId(2, com.google.android.material.R.id.mtrl_card_checked_layer_id);
        }
        return this.f9396q;
    }

    /* renamed from: E */
    private Drawable m6568E() {
        if (C2229c.f9843a) {
            this.f9398s = m6572I();
            return new RippleDrawable(this.f9391l, null, this.f9398s);
        }
        return m6569F();
    }

    /* renamed from: F */
    private Drawable m6569F() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f9397r = m6572I();
        this.f9397r.m7282g(this.f9391l);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f9397r);
        return stateListDrawable;
    }

    /* renamed from: G */
    private void m6570G() {
        if (C2229c.f9843a && this.f9395p != null) {
            ((RippleDrawable) this.f9395p).setColor(this.f9391l);
        } else if (this.f9397r != null) {
            this.f9397r.m7282g(this.f9391l);
        }
    }

    /* renamed from: H */
    private Drawable m6571H() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (this.f9390k != null) {
            stateListDrawable.addState(f9380a, this.f9390k);
        }
        return stateListDrawable;
    }

    /* renamed from: I */
    private C2295h m6572I() {
        return new C2295h(this.f9393n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final void m6607n() {
        if (!this.f9399t) {
            this.f9382c.setBackgroundInternal(m6574b(this.f9384e));
        }
        this.f9382c.setForeground(m6574b(this.f9389j));
    }
}
