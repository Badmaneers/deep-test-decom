package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C0192ak;
import androidx.appcompat.widget.C0195an;
import androidx.coordinatorlayout.widget.AbstractC0391c;
import androidx.coordinatorlayout.widget.C0394f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.InterfaceC0390b;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p023f.C0478i;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0537v;
import androidx.core.widget.InterfaceC0581s;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2250as;
import com.google.android.material.internal.C2261f;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.p072a.C2039h;
import com.google.android.material.p072a.InterfaceC2042k;
import com.google.android.material.p077f.C2182c;
import com.google.android.material.p077f.InterfaceC2180a;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.InterfaceC2288ad;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.p084a.C2402a;
import java.util.List;

/* loaded from: classes.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements InterfaceC0390b, InterfaceC0537v, InterfaceC0581s, InterfaceC2180a, InterfaceC2288ad {

    /* renamed from: c */
    private static final int f9698c = R.style.Widget_Design_FloatingActionButton;

    /* renamed from: a */
    boolean f9699a;

    /* renamed from: b */
    final Rect f9700b;

    /* renamed from: d */
    private ColorStateList f9701d;

    /* renamed from: e */
    private PorterDuff.Mode f9702e;

    /* renamed from: f */
    private ColorStateList f9703f;

    /* renamed from: g */
    private PorterDuff.Mode f9704g;

    /* renamed from: h */
    private ColorStateList f9705h;

    /* renamed from: i */
    private int f9706i;

    /* renamed from: j */
    private int f9707j;

    /* renamed from: k */
    private int f9708k;

    /* renamed from: l */
    private int f9709l;

    /* renamed from: m */
    private int f9710m;

    /* renamed from: n */
    private final Rect f9711n;

    /* renamed from: o */
    private final C0195an f9712o;

    /* renamed from: p */
    private final C2182c f9713p;

    /* renamed from: q */
    private C2209s f9714q;

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9698c), attributeSet, i);
        this.f9700b = new Rect();
        this.f9711n = new Rect();
        Context context2 = getContext();
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, R.styleable.FloatingActionButton, i, f9698c, new int[0]);
        this.f9701d = C2221d.m7045a(context2, m7095a, R.styleable.FloatingActionButton_backgroundTint);
        this.f9702e = C2250as.m7109a(m7095a.getInt(R.styleable.FloatingActionButton_backgroundTintMode, -1), (PorterDuff.Mode) null);
        this.f9705h = C2221d.m7045a(context2, m7095a, R.styleable.FloatingActionButton_rippleColor);
        this.f9707j = m7095a.getInt(R.styleable.FloatingActionButton_fabSize, -1);
        this.f9708k = m7095a.getDimensionPixelSize(R.styleable.FloatingActionButton_fabCustomSize, 0);
        this.f9706i = m7095a.getDimensionPixelSize(R.styleable.FloatingActionButton_borderWidth, 0);
        float dimension = m7095a.getDimension(R.styleable.FloatingActionButton_elevation, 0.0f);
        float dimension2 = m7095a.getDimension(R.styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = m7095a.getDimension(R.styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f9699a = m7095a.getBoolean(R.styleable.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        this.f9710m = m7095a.getDimensionPixelSize(R.styleable.FloatingActionButton_maxImageSize, 0);
        C2039h m6246a = C2039h.m6246a(context2, m7095a, R.styleable.FloatingActionButton_showMotionSpec);
        C2039h m6246a2 = C2039h.m6246a(context2, m7095a, R.styleable.FloatingActionButton_hideMotionSpec);
        C2303p m7327a = C2303p.m7301a(context2, attributeSet, i, f9698c, C2303p.f10117a).m7327a();
        boolean z = m7095a.getBoolean(R.styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(m7095a.getBoolean(R.styleable.FloatingActionButton_android_enabled, true));
        m7095a.recycle();
        this.f9712o = new C0195an(this);
        this.f9712o.m729a(attributeSet, i);
        this.f9713p = new C2182c(this);
        getImpl().m7016a(m7327a);
        getImpl().mo6968a(this.f9701d, this.f9702e, this.f9705h, this.f9706i);
        getImpl().f9794l = dimensionPixelSize;
        getImpl().m7010a(dimension);
        getImpl().m7018b(dimension2);
        getImpl().m7023c(dimension3);
        getImpl().m7011a(this.f9710m);
        getImpl().m7013a(m6246a);
        getImpl().m7020b(m6246a2);
        getImpl().f9789g = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f9709l = (sizeDimension - this.f9710m) / 2;
        getImpl().m7029j();
        int min = Math.min(m6933a(sizeDimension, i), m6933a(sizeDimension, i2));
        setMeasuredDimension(this.f9700b.left + min + this.f9700b.right, min + this.f9700b.top + this.f9700b.bottom);
    }

    @Deprecated
    public int getRippleColor() {
        if (this.f9705h != null) {
            return this.f9705h.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f9705h;
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f9705h != colorStateList) {
            this.f9705h = colorStateList;
            getImpl().mo6967a(this.f9705h);
        }
    }

    @Override // androidx.coordinatorlayout.widget.InterfaceC0390b
    public AbstractC0391c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f9701d;
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f9701d != colorStateList) {
            this.f9701d = colorStateList;
            C2209s impl = getImpl();
            if (impl.f9785c != null) {
                impl.f9785c.setTintList(colorStateList);
            }
            if (impl.f9787e != null) {
                impl.f9787e.m6992a(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f9702e;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f9702e != mode) {
            this.f9702e = mode;
            C2209s impl = getImpl();
            if (impl.f9785c != null) {
                impl.f9785c.setTintMode(mode);
            }
        }
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.p024g.InterfaceC0537v
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.InterfaceC0581s
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f9703f != colorStateList) {
            this.f9703f = colorStateList;
            m6938d();
        }
    }

    @Override // androidx.core.widget.InterfaceC0581s
    public ColorStateList getSupportImageTintList() {
        return this.f9703f;
    }

    @Override // androidx.core.widget.InterfaceC0581s
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f9704g != mode) {
            this.f9704g = mode;
            m6938d();
        }
    }

    @Override // androidx.core.widget.InterfaceC0581s
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f9704g;
    }

    /* renamed from: d */
    private void m6938d() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        if (this.f9703f == null) {
            C0546a.m1932e(drawable);
            return;
        }
        int colorForState = this.f9703f.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f9704g;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0192ak.m706a(colorForState, mode));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f9712o.m726a(i);
        m6938d();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m7017b();
            if (this.f9703f != null) {
                m6938d();
            }
        }
    }

    @Override // com.google.android.material.p082k.InterfaceC2288ad
    public void setShapeAppearanceModel(C2303p c2303p) {
        getImpl().m7016a(c2303p);
    }

    public C2303p getShapeAppearanceModel() {
        return (C2303p) C0478i.m1620a(getImpl().f9784b);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f9789g) {
            getImpl().f9789g = z;
            requestLayout();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: a */
    public final void m6941a(AbstractC2206p abstractC2206p) {
        m6942a(abstractC2206p, true);
    }

    /* renamed from: a */
    final void m6942a(AbstractC2206p abstractC2206p, boolean z) {
        getImpl().m7021b(m6936c(abstractC2206p), z);
    }

    /* renamed from: a */
    public final void m6939a(Animator.AnimatorListener animatorListener) {
        getImpl().m7012a(animatorListener);
    }

    /* renamed from: b */
    public final void m6946b(AbstractC2206p abstractC2206p) {
        m6947b(abstractC2206p, true);
    }

    /* renamed from: b */
    final void m6947b(AbstractC2206p abstractC2206p, boolean z) {
        getImpl().m7015a(m6936c(abstractC2206p), z);
    }

    /* renamed from: b */
    public final void m6944b(Animator.AnimatorListener animatorListener) {
        getImpl().m7019b(animatorListener);
    }

    @Override // com.google.android.material.p077f.InterfaceC2181b
    /* renamed from: a */
    public final boolean mo6911a() {
        return this.f9713p.m6914a();
    }

    public void setExpandedComponentIdHint(int i) {
        this.f9713p.m6912a(i);
    }

    public int getExpandedComponentIdHint() {
        return this.f9713p.m6916c();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f9699a != z) {
            this.f9699a = z;
            getImpl().mo6972i();
        }
    }

    public boolean getUseCompatPadding() {
        return this.f9699a;
    }

    public void setSize(int i) {
        this.f9708k = 0;
        if (i != this.f9707j) {
            this.f9707j = i;
            requestLayout();
        }
    }

    public int getSize() {
        return this.f9707j;
    }

    /* renamed from: c */
    private InterfaceC2186ac m6936c(AbstractC2206p abstractC2206p) {
        if (abstractC2206p == null) {
            return null;
        }
        return new C2205o(this, abstractC2206p);
    }

    /* renamed from: b */
    public final boolean m6948b() {
        return getImpl().m7034r();
    }

    /* renamed from: c */
    public final boolean m6949c() {
        return getImpl().m7033q();
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f9708k) {
            this.f9708k = i;
            requestLayout();
        }
    }

    public int getCustomSize() {
        return this.f9708k;
    }

    public int getSizeDimension() {
        int i = this.f9707j;
        while (this.f9708k == 0) {
            Resources resources = getResources();
            if (i != -1) {
                if (i == 1) {
                    return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
                }
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            i = Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? 1 : 0;
        }
        return this.f9708k;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m7030l();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m7031m();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo6970a(getDrawableState());
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo6971f();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f10333a.put("expandableWidgetHelper", this.f9713p.m6915b());
        return extendableSavedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.m2149a());
        this.f9713p.m6913a((Bundle) C0478i.m1620a(extendableSavedState.f10333a.get("expandableWidgetHelper")));
    }

    @Deprecated
    /* renamed from: a */
    public final boolean m6943a(Rect rect) {
        if (!C0538w.m1819C(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m6937c(rect);
        return true;
    }

    /* renamed from: b */
    public final void m6945b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m6937c(rect);
    }

    /* renamed from: c */
    private void m6937c(Rect rect) {
        rect.left += this.f9700b.left;
        rect.top += this.f9700b.top;
        rect.right -= this.f9700b.right;
        rect.bottom -= this.f9700b.bottom;
    }

    public Drawable getContentBackground() {
        return getImpl().f9788f;
    }

    /* renamed from: a */
    private static int m6933a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m6943a(this.f9711n) && !this.f9711n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* loaded from: classes.dex */
    public class Behavior extends BaseBehavior<FloatingActionButton> {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1412a(C0394f c0394f) {
            super.mo1412a(c0394f);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1414a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo1414a(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1416a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo1416a(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1419a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo1419a(coordinatorLayout, floatingActionButton, view);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public class BaseBehavior<T extends FloatingActionButton> extends AbstractC0391c<T> {

        /* renamed from: a */
        private Rect f9715a;

        /* renamed from: b */
        private AbstractC2206p f9716b;

        /* renamed from: c */
        private boolean f9717c;

        public BaseBehavior() {
            this.f9717c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.f9717c = obtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public void mo1412a(C0394f c0394f) {
            if (c0394f.f2087h == 0) {
                c0394f.f2087h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public boolean mo1419a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m6952a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!m6950a(view)) {
                return false;
            }
            m6953b(view, floatingActionButton);
            return false;
        }

        /* renamed from: a */
        private static boolean m6950a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0394f) {
                return ((C0394f) layoutParams).m1430b() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m6951a(View view, FloatingActionButton floatingActionButton) {
            return this.f9717c && ((C0394f) floatingActionButton.getLayoutParams()).m1425a() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: a */
        private boolean m6952a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m6951a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f9715a == null) {
                this.f9715a = new Rect();
            }
            Rect rect = this.f9715a;
            C2261f.m7180b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m6947b(this.f9716b, false);
                return true;
            }
            floatingActionButton.m6942a(this.f9716b, false);
            return true;
        }

        /* renamed from: b */
        private boolean m6953b(View view, FloatingActionButton floatingActionButton) {
            if (!m6951a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0394f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.m6947b(this.f9716b, false);
                return true;
            }
            floatingActionButton.m6942a(this.f9716b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public boolean mo1414a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            List<View> m1403b = coordinatorLayout.m1403b(floatingActionButton);
            int size = m1403b.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view = m1403b.get(i4);
                if (view instanceof AppBarLayout) {
                    if (m6952a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m6950a(view) && m6953b(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1404b(floatingActionButton, i);
            Rect rect = floatingActionButton.f9700b;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            C0394f c0394f = (C0394f) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - c0394f.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= c0394f.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - c0394f.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= c0394f.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                C0538w.m1869c((View) floatingActionButton, i3);
            }
            if (i2 == 0) {
                return true;
            }
            C0538w.m1871d(floatingActionButton, i2);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public boolean mo1416a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f9700b;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().m7025d(f);
    }

    public float getCompatElevation() {
        return getImpl().mo6965a();
    }

    public void setCompatElevation(float f) {
        getImpl().m7010a(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f9792j;
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().m7018b(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f9793k;
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().m7023c(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public C2039h getShowMotionSpec() {
        return getImpl().m7022c();
    }

    public void setShowMotionSpec(C2039h c2039h) {
        getImpl().m7013a(c2039h);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C2039h.m6245a(getContext(), i));
    }

    public C2039h getHideMotionSpec() {
        return getImpl().m7024d();
    }

    public void setHideMotionSpec(C2039h c2039h) {
        getImpl().m7020b(c2039h);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C2039h.m6245a(getContext(), i));
    }

    /* renamed from: a */
    public final void m6940a(InterfaceC2042k<? extends FloatingActionButton> interfaceC2042k) {
        getImpl().m7014a(new C2208r(this, interfaceC2042k));
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m7027g();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m7027g();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m7027g();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m7028h();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m7028h();
    }

    public void setShadowPaddingEnabled(boolean z) {
        C2209s impl = getImpl();
        impl.f9790h = z;
        impl.m7029j();
    }

    private C2209s getImpl() {
        C2209s c2209s;
        if (this.f9714q == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                c2209s = new C2189af(this, new C2207q(this));
            } else {
                c2209s = new C2209s(this, new C2207q(this));
            }
            this.f9714q = c2209s;
        }
        return this.f9714q;
    }
}
