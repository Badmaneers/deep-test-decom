package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.C0394f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C2250as;
import com.google.android.material.p072a.C2032a;
import com.google.android.material.p073b.C2063a;
import com.google.android.material.p079h.C2220c;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.theme.p084a.C2402a;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    static final Handler f10270a;

    /* renamed from: d */
    private static final boolean f10271d;

    /* renamed from: e */
    private static final int[] f10272e;

    /* renamed from: f */
    private static final String f10273f;

    /* renamed from: b */
    protected final SnackbarBaseLayout f10274b;

    /* renamed from: c */
    InterfaceC2347v f10275c;

    /* renamed from: g */
    private final ViewGroup f10276g;

    /* renamed from: h */
    private final InterfaceC2344s f10277h;

    /* renamed from: i */
    private boolean f10278i;

    /* renamed from: j */
    private View f10279j;

    /* renamed from: k */
    private final Runnable f10280k;

    /* renamed from: l */
    private Rect f10281l;

    /* renamed from: m */
    private int f10282m;

    /* renamed from: n */
    private int f10283n;

    /* renamed from: o */
    private int f10284o;

    /* renamed from: p */
    private int f10285p;

    /* renamed from: q */
    private int f10286q;

    /* renamed from: r */
    private List<Object<B>> f10287r;

    /* renamed from: s */
    private Behavior f10288s;

    /* renamed from: t */
    private final AccessibilityManager f10289t;

    static {
        f10271d = Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 19;
        f10272e = new int[]{R.attr.snackbarStyle};
        f10273f = BaseTransientBottomBar.class.getSimpleName();
        f10270a = new Handler(Looper.getMainLooper(), new C2326a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:            if (((r0 instanceof androidx.coordinatorlayout.widget.C0394f) && (((androidx.coordinatorlayout.widget.C0394f) r0).m1430b() instanceof com.google.android.material.behavior.SwipeDismissBehavior)) != false) goto L26;     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m7438e() {
        /*
            r4 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r4.f10274b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L74
            android.graphics.Rect r1 = r4.f10281l
            if (r1 != 0) goto Lf
            goto L74
        Lf:
            android.view.View r1 = r4.f10279j
            if (r1 == 0) goto L16
            int r1 = r4.f10286q
            goto L18
        L16:
            int r1 = r4.f10282m
        L18:
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.graphics.Rect r2 = r4.f10281l
            int r2 = r2.bottom
            int r2 = r2 + r1
            r0.bottomMargin = r2
            android.graphics.Rect r1 = r4.f10281l
            int r1 = r1.left
            int r2 = r4.f10283n
            int r1 = r1 + r2
            r0.leftMargin = r1
            android.graphics.Rect r1 = r4.f10281l
            int r1 = r1.right
            int r2 = r4.f10284o
            int r1 = r1 + r2
            r0.rightMargin = r1
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r4.f10274b
            r0.requestLayout()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L73
            int r0 = r4.f10285p
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L62
            boolean r0 = r4.f10278i
            if (r0 != 0) goto L62
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r4.f10274b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r3 = r0 instanceof androidx.coordinatorlayout.widget.C0394f
            if (r3 == 0) goto L5e
            androidx.coordinatorlayout.widget.f r0 = (androidx.coordinatorlayout.widget.C0394f) r0
            androidx.coordinatorlayout.widget.c r0 = r0.m1430b()
            boolean r0 = r0 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r0 == 0) goto L5e
            r0 = r1
            goto L5f
        L5e:
            r0 = r2
        L5f:
            if (r0 == 0) goto L62
            goto L63
        L62:
            r1 = r2
        L63:
            if (r1 == 0) goto L73
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r4.f10274b
            java.lang.Runnable r1 = r4.f10280k
            r0.removeCallbacks(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r4.f10274b
            java.lang.Runnable r4 = r4.f10280k
            r0.post(r4)
        L73:
            return
        L74:
            java.lang.String r4 = com.google.android.material.snackbar.BaseTransientBottomBar.f10273f
            java.lang.String r0 = "Unable to update margins because layout params are not MarginLayoutParams"
            android.util.Log.w(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.m7438e():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7443a() {
        int height;
        Behavior behavior;
        this.f10274b.setOnAttachStateChangeListener(new C2335j(this));
        if (this.f10274b.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f10274b.getLayoutParams();
            if (layoutParams instanceof C0394f) {
                C0394f c0394f = (C0394f) layoutParams;
                if (this.f10288s != null) {
                    behavior = this.f10288s;
                } else {
                    behavior = new Behavior();
                }
                if (behavior instanceof Behavior) {
                    Behavior.m7447a(behavior, this);
                }
                behavior.m6391a(new C2338m(this));
                c0394f.m1428a(behavior);
                if (this.f10279j == null) {
                    c0394f.f2086g = 80;
                }
            }
            if (this.f10279j == null) {
                height = 0;
            } else {
                int[] iArr = new int[2];
                this.f10279j.getLocationOnScreen(iArr);
                int i = iArr[1];
                int[] iArr2 = new int[2];
                this.f10276g.getLocationOnScreen(iArr2);
                height = (iArr2[1] + this.f10276g.getHeight()) - i;
            }
            this.f10286q = height;
            m7438e();
            this.f10274b.setVisibility(4);
            this.f10276g.addView(this.f10274b);
        }
        if (C0538w.m1819C(this.f10274b)) {
            m7439f();
        } else {
            this.f10274b.setOnLayoutChangeListener(new C2337l(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m7439f() {
        if (m7442i()) {
            m7440g();
        } else {
            this.f10274b.setVisibility(0);
            m7445b();
        }
    }

    /* renamed from: g */
    private void m7440g() {
        this.f10274b.post(new RunnableC2339n(this));
    }

    /* renamed from: a */
    private ValueAnimator m7431a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C2032a.f8973a);
        ofFloat.addUpdateListener(new C2329d(this));
        return ofFloat;
    }

    /* renamed from: h */
    private int m7441h() {
        int height = this.f10274b.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f10274b.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7444a(int i) {
        if (!m7442i() || this.f10274b.getVisibility() != 0) {
            m7446c();
            return;
        }
        if (this.f10274b.getAnimationMode() == 1) {
            ValueAnimator m7431a = m7431a(1.0f, 0.0f);
            m7431a.setDuration(75L);
            m7431a.addListener(new C2328c(this, i));
            m7431a.start();
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m7441h());
        valueAnimator.setInterpolator(C2032a.f8974b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C2333h(this, i));
        valueAnimator.addUpdateListener(new C2334i(this));
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7445b() {
        C2345t.m7457a().m7465c(this.f10275c);
        if (this.f10287r != null) {
            for (int size = this.f10287r.size() - 1; size >= 0; size--) {
                this.f10287r.get(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m7446c() {
        C2345t.m7457a().m7464b(this.f10275c);
        if (this.f10287r != null) {
            for (int size = this.f10287r.size() - 1; size >= 0; size--) {
                this.f10287r.get(size);
            }
        }
        ViewParent parent = this.f10274b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f10274b);
        }
    }

    /* renamed from: i */
    private boolean m7442i() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f10289t.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* loaded from: classes.dex */
    public class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: a */
        private static final View.OnTouchListener f10291a = new ViewOnTouchListenerC2343r();

        /* renamed from: b */
        private InterfaceC2342q f10292b;

        /* renamed from: c */
        private InterfaceC2341p f10293c;

        /* renamed from: d */
        private int f10294d;

        /* renamed from: e */
        private final float f10295e;

        /* renamed from: f */
        private final float f10296f;

        /* renamed from: g */
        private ColorStateList f10297g;

        /* renamed from: h */
        private PorterDuff.Mode f10298h;

        /* JADX INFO: Access modifiers changed from: protected */
        public SnackbarBaseLayout(Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(C2402a.m7691a(context, attributeSet, 0, 0), attributeSet);
            Drawable m1933f;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_elevation)) {
                C0538w.m1839a(this, obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_elevation, 0));
            }
            this.f10294d = obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_animationMode, 0);
            this.f10295e = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(C2221d.m7045a(context2, obtainStyledAttributes, R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(C2250as.m7109a(obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f10296f = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f10291a);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(C2063a.m6339a(C2220c.m7042a(this, R.attr.colorSurface), C2220c.m7042a(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
                if (this.f10297g != null) {
                    m1933f = C0546a.m1933f(gradientDrawable);
                    C0546a.m1922a(m1933f, this.f10297g);
                } else {
                    m1933f = C0546a.m1933f(gradientDrawable);
                }
                C0538w.m1846a(this, m1933f);
            }
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f10297g != null) {
                drawable = C0546a.m1933f(drawable.mutate());
                C0546a.m1922a(drawable, this.f10297g);
                C0546a.m1925a(drawable, this.f10298h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f10297g = colorStateList;
            if (getBackground() != null) {
                Drawable m1933f = C0546a.m1933f(getBackground().mutate());
                C0546a.m1922a(m1933f, colorStateList);
                C0546a.m1925a(m1933f, this.f10298h);
                if (m1933f != getBackground()) {
                    super.setBackgroundDrawable(m1933f);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f10298h = mode;
            if (getBackground() != null) {
                Drawable m1933f = C0546a.m1933f(getBackground().mutate());
                C0546a.m1925a(m1933f, mode);
                if (m1933f != getBackground()) {
                    super.setBackgroundDrawable(m1933f);
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f10291a);
            super.setOnClickListener(onClickListener);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f10292b != null) {
                this.f10292b.mo7454a();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f10293c != null) {
                this.f10293c.mo7452a();
            }
            C0538w.m1892u(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f10293c != null) {
                this.f10293c.mo7453b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(InterfaceC2342q interfaceC2342q) {
            this.f10292b = interfaceC2342q;
        }

        void setOnAttachStateChangeListener(InterfaceC2341p interfaceC2341p) {
            this.f10293c = interfaceC2341p;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f10294d;
        }

        void setAnimationMode(int i) {
            this.f10294d = i;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f10295e;
        }

        float getActionTextColorAlpha() {
            return this.f10296f;
        }
    }

    /* loaded from: classes.dex */
    public class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: g */
        private final C2340o f10290g = new C2340o(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final boolean mo1418a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f10290g.m7455a(coordinatorLayout, view, motionEvent);
            return super.mo1418a(coordinatorLayout, (CoordinatorLayout) view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: a */
        public final boolean mo6392a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        /* renamed from: a */
        static /* synthetic */ void m7447a(Behavior behavior, BaseTransientBottomBar baseTransientBottomBar) {
            behavior.f10290g.m7456a(baseTransientBottomBar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m7434c(BaseTransientBottomBar baseTransientBottomBar) {
        ValueAnimator m7431a = baseTransientBottomBar.m7431a(0.0f, 1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C2032a.f8976d);
        ofFloat.addUpdateListener(new C2330e(baseTransientBottomBar));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m7431a, ofFloat);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new C2327b(baseTransientBottomBar));
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m7435d(BaseTransientBottomBar baseTransientBottomBar) {
        int m7441h = baseTransientBottomBar.m7441h();
        if (f10271d) {
            C0538w.m1869c((View) baseTransientBottomBar.f10274b, m7441h);
        } else {
            baseTransientBottomBar.f10274b.setTranslationY(m7441h);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(m7441h, 0);
        valueAnimator.setInterpolator(C2032a.f8974b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C2331f(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new C2332g(baseTransientBottomBar, m7441h));
        valueAnimator.start();
    }
}
