package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.AbstractC0391c;
import androidx.coordinatorlayout.widget.C0394f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.InterfaceC0390b;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2261f;
import com.google.android.material.p072a.C2039h;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.theme.p084a.C2402a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements InterfaceC0390b {

    /* renamed from: e */
    private int f9685e;

    /* renamed from: f */
    private final C2183a f9686f;

    /* renamed from: g */
    private final InterfaceC2191ah f9687g;

    /* renamed from: h */
    private final InterfaceC2191ah f9688h;

    /* renamed from: i */
    private final InterfaceC2191ah f9689i;

    /* renamed from: j */
    private final InterfaceC2191ah f9690j;

    /* renamed from: k */
    private final AbstractC0391c<ExtendedFloatingActionButton> f9691k;

    /* renamed from: l */
    private boolean f9692l;

    /* renamed from: c */
    private static final int f9684c = R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: a */
    static final Property<View, Float> f9682a = new C2198h(Float.class, "width");

    /* renamed from: b */
    static final Property<View, Float> f9683b = new C2199i(Float.class, "height");

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9684c), attributeSet, i);
        this.f9685e = 0;
        this.f9686f = new C2183a();
        this.f9689i = new C2203m(this, this.f9686f);
        this.f9690j = new C2201k(this, this.f9686f);
        this.f9692l = true;
        Context context2 = getContext();
        this.f9691k = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, R.styleable.ExtendedFloatingActionButton, i, f9684c, new int[0]);
        C2039h m6246a = C2039h.m6246a(context2, m7095a, R.styleable.ExtendedFloatingActionButton_showMotionSpec);
        C2039h m6246a2 = C2039h.m6246a(context2, m7095a, R.styleable.ExtendedFloatingActionButton_hideMotionSpec);
        C2039h m6246a3 = C2039h.m6246a(context2, m7095a, R.styleable.ExtendedFloatingActionButton_extendMotionSpec);
        C2039h m6246a4 = C2039h.m6246a(context2, m7095a, R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        C2183a c2183a = new C2183a();
        this.f9688h = new C2200j(this, c2183a, new C2195e(this), true);
        this.f9687g = new C2200j(this, c2183a, new C2196f(this), false);
        this.f9689i.mo6978a(m6246a);
        this.f9690j.mo6978a(m6246a2);
        this.f9688h.mo6978a(m6246a3);
        this.f9687g.mo6978a(m6246a4);
        m7095a.recycle();
        setShapeAppearanceModel(C2303p.m7301a(context2, attributeSet, i, f9684c, C2303p.f10117a).m7327a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9692l && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f9692l = false;
            this.f9687g.mo6984g();
        }
    }

    @Override // androidx.coordinatorlayout.widget.InterfaceC0390b
    public AbstractC0391c<ExtendedFloatingActionButton> getBehavior() {
        return this.f9691k;
    }

    public void setExtended(boolean z) {
        if (this.f9692l == z) {
            return;
        }
        InterfaceC2191ah interfaceC2191ah = z ? this.f9688h : this.f9687g;
        if (interfaceC2191ah.mo6986i()) {
            return;
        }
        interfaceC2191ah.mo6984g();
    }

    public C2039h getShowMotionSpec() {
        return this.f9689i.mo6980c();
    }

    public void setShowMotionSpec(C2039h c2039h) {
        this.f9689i.mo6978a(c2039h);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C2039h.m6245a(getContext(), i));
    }

    public C2039h getHideMotionSpec() {
        return this.f9690j.mo6980c();
    }

    public void setHideMotionSpec(C2039h c2039h) {
        this.f9690j.mo6978a(c2039h);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C2039h.m6245a(getContext(), i));
    }

    public C2039h getExtendMotionSpec() {
        return this.f9688h.mo6980c();
    }

    public void setExtendMotionSpec(C2039h c2039h) {
        this.f9688h.mo6978a(c2039h);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C2039h.m6245a(getContext(), i));
    }

    public C2039h getShrinkMotionSpec() {
        return this.f9687g.mo6980c();
    }

    public void setShrinkMotionSpec(C2039h c2039h) {
        this.f9687g.mo6978a(c2039h);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C2039h.m6245a(getContext(), i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(C0538w.m1883l(this), C0538w.m1884m(this)) * 2) + getIconSize();
    }

    /* loaded from: classes.dex */
    public class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends AbstractC0391c<T> {

        /* renamed from: a */
        private Rect f9693a;

        /* renamed from: b */
        private AbstractC2202l f9694b;

        /* renamed from: c */
        private AbstractC2202l f9695c;

        /* renamed from: d */
        private boolean f9696d;

        /* renamed from: e */
        private boolean f9697e;

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final /* synthetic */ boolean mo1414a(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> m1403b = coordinatorLayout.m1403b(extendedFloatingActionButton);
            int size = m1403b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = m1403b.get(i2);
                if (view2 instanceof AppBarLayout) {
                    if (m6930a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m6928a(view2) && m6932b(view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1404b(extendedFloatingActionButton, i);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1416a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return super.mo1416a(coordinatorLayout, (CoordinatorLayout) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final /* synthetic */ boolean mo1419a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m6930a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                return false;
            }
            if (!m6928a(view2)) {
                return false;
            }
            m6932b(view2, extendedFloatingActionButton);
            return false;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.f9696d = false;
            this.f9697e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f9696d = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f9697e = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final void mo1412a(C0394f c0394f) {
            if (c0394f.f2087h == 0) {
                c0394f.f2087h = 80;
            }
        }

        /* renamed from: a */
        private static boolean m6928a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0394f) {
                return ((C0394f) layoutParams).m1430b() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m6929a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f9696d || this.f9697e) && ((C0394f) extendedFloatingActionButton.getLayoutParams()).m1425a() == view.getId();
        }

        /* renamed from: a */
        private boolean m6930a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m6929a((View) appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f9693a == null) {
                this.f9693a = new Rect();
            }
            Rect rect = this.f9693a;
            C2261f.m7180b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                m6927a(extendedFloatingActionButton);
                return true;
            }
            m6931b(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: b */
        private boolean m6932b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m6929a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((C0394f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                m6927a(extendedFloatingActionButton);
                return true;
            }
            m6931b(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: a */
        private void m6927a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton.m6919a(extendedFloatingActionButton, this.f9697e ? extendedFloatingActionButton.f9687g : extendedFloatingActionButton.f9690j, this.f9697e ? this.f9695c : this.f9694b);
        }

        /* renamed from: b */
        private void m6931b(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton.m6919a(extendedFloatingActionButton, this.f9697e ? extendedFloatingActionButton.f9688h : extendedFloatingActionButton.f9689i, this.f9697e ? this.f9695c : this.f9694b);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m6919a(ExtendedFloatingActionButton extendedFloatingActionButton, InterfaceC2191ah interfaceC2191ah, AbstractC2202l abstractC2202l) {
        if (interfaceC2191ah.mo6986i()) {
            return;
        }
        if (!(C0538w.m1819C(extendedFloatingActionButton) && !extendedFloatingActionButton.isInEditMode())) {
            interfaceC2191ah.mo6984g();
            return;
        }
        extendedFloatingActionButton.measure(0, 0);
        AnimatorSet mo6983f = interfaceC2191ah.mo6983f();
        mo6983f.addListener(new C2197g(extendedFloatingActionButton, interfaceC2191ah, abstractC2202l));
        Iterator<Animator.AnimatorListener> it = interfaceC2191ah.mo6979b().iterator();
        while (it.hasNext()) {
            mo6983f.addListener(it.next());
        }
        mo6983f.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ boolean m6925f(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.getVisibility() != 0 ? extendedFloatingActionButton.f9685e == 2 : extendedFloatingActionButton.f9685e != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* synthetic */ boolean m6926g(ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton.getVisibility() == 0 ? extendedFloatingActionButton.f9685e == 1 : extendedFloatingActionButton.f9685e != 2;
    }
}
