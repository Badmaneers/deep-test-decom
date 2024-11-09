package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0281ds;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.C0394f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.InterfaceC0390b;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0538w;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2250as;
import com.google.android.material.p072a.InterfaceC2042k;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2299l;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.theme.p084a.C2402a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements InterfaceC0390b {

    /* renamed from: g */
    private static final int f9147g = R.style.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: e */
    AnimatorListenerAdapter f9148e;

    /* renamed from: f */
    InterfaceC2042k<FloatingActionButton> f9149f;

    /* renamed from: h */
    private final int f9150h;

    /* renamed from: i */
    private final C2295h f9151i;

    /* renamed from: j */
    private Animator f9152j;

    /* renamed from: k */
    private Animator f9153k;

    /* renamed from: l */
    private int f9154l;

    /* renamed from: m */
    private int f9155m;

    /* renamed from: n */
    private boolean f9156n;

    /* renamed from: o */
    private final boolean f9157o;

    /* renamed from: p */
    private final boolean f9158p;

    /* renamed from: q */
    private final boolean f9159q;

    /* renamed from: r */
    private int f9160r;

    /* renamed from: s */
    private ArrayList<Object> f9161s;

    /* renamed from: t */
    private boolean f9162t;

    /* renamed from: u */
    private Behavior f9163u;

    /* renamed from: v */
    private int f9164v;

    /* renamed from: w */
    private int f9165w;

    /* renamed from: x */
    private int f9166x;

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static /* synthetic */ Animator m6426o(BottomAppBar bottomAppBar) {
        bottomAppBar.f9153k = null;
        return null;
    }

    public BottomAppBar(Context context) {
        this(context, null, 0);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9147g), attributeSet, i);
        this.f9151i = new C2295h();
        this.f9160r = 0;
        this.f9162t = true;
        this.f9148e = new C2071a(this);
        this.f9149f = new C2072b(this);
        Context context2 = getContext();
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, R.styleable.BottomAppBar, i, f9147g, new int[0]);
        ColorStateList m7045a = C2221d.m7045a(context2, m7095a, R.styleable.BottomAppBar_backgroundTint);
        int dimensionPixelSize = m7095a.getDimensionPixelSize(R.styleable.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = m7095a.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = m7095a.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = m7095a.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleVerticalOffset, 0);
        this.f9154l = m7095a.getInt(R.styleable.BottomAppBar_fabAlignmentMode, 0);
        this.f9155m = m7095a.getInt(R.styleable.BottomAppBar_fabAnimationMode, 0);
        this.f9156n = m7095a.getBoolean(R.styleable.BottomAppBar_hideOnScroll, false);
        this.f9157o = m7095a.getBoolean(R.styleable.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.f9158p = m7095a.getBoolean(R.styleable.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f9159q = m7095a.getBoolean(R.styleable.BottomAppBar_paddingRightSystemWindowInsets, false);
        m7095a.recycle();
        this.f9150h = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        this.f9151i.setShapeAppearanceModel(C2303p.m7297a().m7331a(new C2082l(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).m7327a());
        this.f9151i.m7262P();
        this.f9151i.m7278a(Paint.Style.FILL);
        this.f9151i.m7276a(context2);
        setElevation(dimensionPixelSize);
        C0546a.m1922a(this.f9151i, m7045a);
        C0538w.m1846a(this, this.f9151i);
        C2250as.m7110a(this, attributeSet, i, f9147g, new C2073c(this));
    }

    public int getFabAlignmentMode() {
        return this.f9154l;
    }

    public int getFabAnimationMode() {
        return this.f9155m;
    }

    public void setFabAnimationMode(int i) {
        this.f9155m = i;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0546a.m1922a(this.f9151i, colorStateList);
    }

    public ColorStateList getBackgroundTint() {
        return this.f9151i.m7260N();
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m6453d();
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().m6454d(f);
            this.f9151i.invalidateSelf();
        }
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m6455e();
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m6456e(f);
            this.f9151i.invalidateSelf();
        }
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m6451c();
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m6452c(f);
            this.f9151i.invalidateSelf();
            m6433r();
        }
    }

    public boolean getHideOnScroll() {
        return this.f9156n;
    }

    public void setHideOnScroll(boolean z) {
        this.f9156n = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.f9151i.m7288r(f);
        getBehavior().m6387a((Behavior) this, this.f9151i.m7266T() - this.f9151i.m7268V());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m6422m() {
        int i = this.f9160r;
        this.f9160r = i + 1;
        if (i != 0 || this.f9161s == null) {
            return;
        }
        Iterator<Object> it = this.f9161s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m6439a(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().m6446a()) {
            return false;
        }
        getTopEdgeTreatment().m6447a(f);
        this.f9151i.invalidateSelf();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public FloatingActionButton m6424n() {
        View m6427o = m6427o();
        if (m6427o instanceof FloatingActionButton) {
            return (FloatingActionButton) m6427o;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public View m6427o() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m1405c(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: p */
    private boolean m6429p() {
        FloatingActionButton m6424n = m6424n();
        return m6424n != null && m6424n.m6949c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6400a(int i, boolean z) {
        if (C0538w.m1819C(this)) {
            if (this.f9153k != null) {
                this.f9153k.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m6429p()) {
                i = 0;
                z = false;
            }
            m6401a(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f9153k = animatorSet;
            this.f9153k.addListener(new C2077g(this));
            this.f9153k.start();
        }
    }

    /* renamed from: a */
    private void m6401a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - m6407b(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new C2078h(this, actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        }
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().m6451c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public float m6406b(int i) {
        boolean m7112a = C2250as.m7112a(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - (this.f9150h + (m7112a ? this.f9166x : this.f9165w))) * (m7112a ? -1 : 1);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m6406b(this.f9154l);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6402a(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX(m6407b(actionMenuView, i, z));
    }

    /* renamed from: b */
    private int m6407b(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean m7112a = C2250as.m7112a(this);
        int measuredWidth = m7112a ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof C0281ds) && (((C0281ds) childAt.getLayoutParams()).f285a & 8388615) == 8388611) {
                if (m7112a) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((m7112a ? actionMenuView.getRight() : actionMenuView.getLeft()) + (m7112a ? this.f9165w : -this.f9166x));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m6431q() {
        if (this.f9153k != null) {
            this.f9153k.cancel();
        }
        if (this.f9152j != null) {
            this.f9152j.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m6431q();
            m6433r();
        }
        m6435s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2082l getTopEdgeTreatment() {
        return (C2082l) this.f9151i.m7258L().m7312j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m6433r() {
        getTopEdgeTreatment().m6450b(getFabTranslationX());
        View m6427o = m6427o();
        this.f9151i.m7286p((this.f9162t && m6429p()) ? 1.0f : 0.0f);
        if (m6427o != null) {
            m6427o.setTranslationY(getFabTranslationY());
            m6427o.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m6435s() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m6429p()) {
                m6402a(actionMenuView, 0, false);
            } else {
                m6402a(actionMenuView, this.f9154l, this.f9162t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f9164v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f9165w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f9166x;
    }

    @Override // androidx.coordinatorlayout.widget.InterfaceC0390b
    public Behavior getBehavior() {
        if (this.f9163u == null) {
            this.f9163u = new Behavior();
        }
        return this.f9163u;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2299l.m7295a(this, this.f9151i);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* loaded from: classes.dex */
    public class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: a */
        private final Rect f9167a;

        /* renamed from: b */
        private WeakReference<BottomAppBar> f9168b;

        /* renamed from: c */
        private int f9169c;

        /* renamed from: d */
        private final View.OnLayoutChangeListener f9170d;

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final /* synthetic */ boolean mo1414a(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f9168b = new WeakReference<>(bottomAppBar);
            View m6427o = bottomAppBar.m6427o();
            if (m6427o != null && !C0538w.m1819C(m6427o)) {
                C0394f c0394f = (C0394f) m6427o.getLayoutParams();
                c0394f.f2083d = 49;
                this.f9169c = c0394f.bottomMargin;
                if (m6427o instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) m6427o;
                    floatingActionButton.addOnLayoutChangeListener(this.f9170d);
                    BottomAppBar.m6405a(bottomAppBar, floatingActionButton);
                }
                bottomAppBar.m6433r();
            }
            coordinatorLayout.m1404b(bottomAppBar, i);
            return super.mo1414a(coordinatorLayout, (CoordinatorLayout) bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final /* synthetic */ boolean mo1421a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.mo1421a(coordinatorLayout, (CoordinatorLayout) bottomAppBar, view2, view3, i, i2);
        }

        public Behavior() {
            this.f9170d = new ViewOnLayoutChangeListenerC2080j(this);
            this.f9167a = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9170d = new ViewOnLayoutChangeListenerC2080j(this);
            this.f9167a = new Rect();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9171a = this.f9154l;
        savedState.f9172b = this.f9162t;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        this.f9154l = savedState.f9171a;
        this.f9162t = savedState.f9172b;
    }

    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2081k();

        /* renamed from: a */
        int f9171a;

        /* renamed from: b */
        boolean f9172b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9171a = parcel.readInt();
            this.f9172b = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9171a);
            parcel.writeInt(this.f9172b ? 1 : 0);
        }
    }

    public void setFabAlignmentMode(int i) {
        if (this.f9154l != i && C0538w.m1819C(this)) {
            if (this.f9152j != null) {
                this.f9152j.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f9155m == 1) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m6424n(), "translationX", m6406b(i));
                ofFloat.setDuration(300L);
                arrayList.add(ofFloat);
            } else {
                FloatingActionButton m6424n = m6424n();
                if (m6424n != null && !m6424n.m6948b()) {
                    m6422m();
                    m6424n.m6946b(new C2075e(this, i));
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f9152j = animatorSet;
            this.f9152j.addListener(new C2074d(this));
            this.f9152j.start();
        }
        m6400a(i, this.f9162t);
        this.f9154l = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static /* synthetic */ void m6425n(BottomAppBar bottomAppBar) {
        int i = bottomAppBar.f9160r - 1;
        bottomAppBar.f9160r = i;
        if (i != 0 || bottomAppBar.f9161s == null) {
            return;
        }
        Iterator<Object> it = bottomAppBar.f9161s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m6405a(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        floatingActionButton.m6944b(bottomAppBar.f9148e);
        floatingActionButton.m6939a(new C2079i(bottomAppBar));
        floatingActionButton.m6940a(bottomAppBar.f9149f);
    }
}
