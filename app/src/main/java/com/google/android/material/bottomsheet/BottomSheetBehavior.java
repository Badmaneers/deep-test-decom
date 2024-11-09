package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.AbstractC0391c;
import androidx.coordinatorlayout.widget.C0394f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0483d;
import androidx.customview.p027a.AbstractC0593l;
import androidx.customview.p027a.C0590i;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2303p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0391c<V> {

    /* renamed from: o */
    private static final int f9255o = R.style.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    int f9256A;

    /* renamed from: B */
    WeakReference<V> f9257B;

    /* renamed from: C */
    WeakReference<View> f9258C;

    /* renamed from: D */
    int f9259D;

    /* renamed from: E */
    boolean f9260E;

    /* renamed from: F */
    private boolean f9261F;

    /* renamed from: G */
    private boolean f9262G;

    /* renamed from: H */
    private int f9263H;

    /* renamed from: I */
    private boolean f9264I;

    /* renamed from: J */
    private final ArrayList<Object> f9265J;

    /* renamed from: K */
    private VelocityTracker f9266K;

    /* renamed from: L */
    private int f9267L;

    /* renamed from: M */
    private Map<View, Integer> f9268M;

    /* renamed from: N */
    private final AbstractC0593l f9269N;

    /* renamed from: a */
    private int f9270a;

    /* renamed from: b */
    private boolean f9271b;

    /* renamed from: c */
    private boolean f9272c;

    /* renamed from: d */
    private float f9273d;

    /* renamed from: e */
    private int f9274e;

    /* renamed from: f */
    private boolean f9275f;

    /* renamed from: g */
    private int f9276g;

    /* renamed from: h */
    private boolean f9277h;

    /* renamed from: i */
    private C2295h f9278i;

    /* renamed from: j */
    private boolean f9279j;

    /* renamed from: k */
    private C2303p f9280k;

    /* renamed from: l */
    private boolean f9281l;

    /* renamed from: m */
    private BottomSheetBehavior<V>.RunnableC2097f f9282m;

    /* renamed from: n */
    private ValueAnimator f9283n;

    /* renamed from: p */
    private boolean f9284p;

    /* renamed from: q */
    int f9285q;

    /* renamed from: r */
    int f9286r;

    /* renamed from: s */
    int f9287s;

    /* renamed from: t */
    float f9288t;

    /* renamed from: u */
    int f9289u;

    /* renamed from: v */
    float f9290v;

    /* renamed from: w */
    boolean f9291w;

    /* renamed from: x */
    int f9292x;

    /* renamed from: y */
    C0590i f9293y;

    /* renamed from: z */
    int f9294z;

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public void mo1410a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public BottomSheetBehavior() {
        this.f9270a = 0;
        this.f9271b = true;
        this.f9272c = false;
        this.f9282m = null;
        this.f9288t = 0.5f;
        this.f9290v = -1.0f;
        this.f9261F = true;
        this.f9292x = 4;
        this.f9265J = new ArrayList<>();
        this.f9269N = new C2094c(this);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9270a = 0;
        this.f9271b = true;
        this.f9272c = false;
        this.f9282m = null;
        this.f9288t = 0.5f;
        this.f9290v = -1.0f;
        this.f9261F = true;
        this.f9292x = 4;
        this.f9265J = new ArrayList<>();
        this.f9269N = new C2094c(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        this.f9277h = obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            m6480a(context, attributeSet, hasValue, C2221d.m7045a(context, obtainStyledAttributes, R.styleable.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            m6480a(context, attributeSet, hasValue, (ColorStateList) null);
        }
        this.f9283n = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f9283n.setDuration(500L);
        this.f9283n.addUpdateListener(new C2093b(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f9290v = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && peekValue.data == -1) {
            mo4354a_(peekValue.data);
        } else {
            mo4354a_(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        mo4326b(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo4332d(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        mo4322a(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo4358e(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        mo4328c(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        mo4325b(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        mo4318a(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            mo4319a(peekValue2.data);
        } else {
            mo4319a(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        obtainStyledAttributes.recycle();
        this.f9273d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: b */
    public Parcelable mo1422b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1422b(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public void mo1408a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1408a(coordinatorLayout, (CoordinatorLayout) v, savedState.m2149a());
        if (this.f9270a != 0) {
            if (this.f9270a == -1 || (this.f9270a & 1) == 1) {
                this.f9274e = savedState.f9296b;
            }
            if (this.f9270a == -1 || (this.f9270a & 2) == 2) {
                this.f9271b = savedState.f9297d;
            }
            if (this.f9270a == -1 || (this.f9270a & 4) == 4) {
                this.f9291w = savedState.f9298e;
            }
            if (this.f9270a == -1 || (this.f9270a & 8) == 8) {
                this.f9284p = savedState.f9299f;
            }
        }
        if (savedState.f9295a == 1 || savedState.f9295a == 2) {
            this.f9292x = 4;
        } else {
            this.f9292x = savedState.f9295a;
        }
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public void mo1412a(C0394f c0394f) {
        super.mo1412a(c0394f);
        this.f9257B = null;
        this.f9293y = null;
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public void mo1406a() {
        super.mo1406a();
        this.f9257B = null;
        this.f9293y = null;
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public boolean mo1414a(CoordinatorLayout coordinatorLayout, V v, int i) {
        WindowInsets rootWindowInsets;
        if (C0538w.m1893v(coordinatorLayout) && !C0538w.m1893v(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f9257B == null) {
            this.f9276g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !mo4329c() && (rootWindowInsets = coordinatorLayout.getRootWindowInsets()) != null) {
                this.f9274e += rootWindowInsets.getSystemGestureInsets().bottom;
            }
            this.f9257B = new WeakReference<>(v);
            if (this.f9277h && this.f9278i != null) {
                C0538w.m1846a(v, this.f9278i);
            }
            if (this.f9278i != null) {
                this.f9278i.m7288r(this.f9290v == -1.0f ? C0538w.m1888q(v) : this.f9290v);
                this.f9281l = this.f9292x == 3;
                this.f9278i.m7286p(this.f9281l ? 0.0f : 1.0f);
            }
            m6492i();
            if (C0538w.m1876g(v) == 0) {
                C0538w.m1840a((View) v, 1);
            }
        }
        if (this.f9293y == null) {
            this.f9293y = C0590i.m2105a(coordinatorLayout, this.f9269N);
        }
        int top = v.getTop();
        coordinatorLayout.m1404b(v, i);
        this.f9294z = coordinatorLayout.getWidth();
        this.f9256A = coordinatorLayout.getHeight();
        this.f9286r = Math.max(0, this.f9256A - v.getHeight());
        m6490g();
        m6487f();
        if (this.f9292x == 3) {
            C0538w.m1869c((View) v, mo4324b());
        } else if (this.f9292x == 6) {
            C0538w.m1869c((View) v, this.f9287s);
        } else if (this.f9291w && this.f9292x == 5) {
            C0538w.m1869c((View) v, this.f9256A);
        } else if (this.f9292x == 4) {
            C0538w.m1869c((View) v, this.f9289u);
        } else if (this.f9292x == 1 || this.f9292x == 2) {
            C0538w.m1869c((View) v, top - v.getTop());
        }
        this.f9258C = new WeakReference<>(m6493a(v));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo1418a(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1418a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: b */
    public boolean mo1423b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9292x == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f9293y != null) {
            this.f9293y.m2131b(motionEvent);
        }
        if (actionMasked == 0) {
            m6491h();
        }
        if (this.f9266K == null) {
            this.f9266K = VelocityTracker.obtain();
        }
        this.f9266K.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f9262G && Math.abs(this.f9267L - motionEvent.getY()) > this.f9293y.m2133d()) {
            this.f9293y.m2124a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f9262G;
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public boolean mo1421a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f9263H = 0;
        this.f9264I = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public void mo1411a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        if (view != (this.f9258C != null ? this.f9258C.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < mo4324b()) {
                iArr[1] = top - mo4324b();
                C0538w.m1869c((View) v, -iArr[1]);
                m6498d(3);
            } else {
                if (!this.f9261F) {
                    return;
                }
                iArr[1] = i2;
                C0538w.m1869c((View) v, -i2);
                m6498d(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            if (i4 <= this.f9289u || this.f9291w) {
                if (!this.f9261F) {
                    return;
                }
                iArr[1] = i2;
                C0538w.m1869c((View) v, -i2);
                m6498d(1);
            } else {
                iArr[1] = top - this.f9289u;
                C0538w.m1869c((View) v, -iArr[1]);
                m6498d(4);
            }
        }
        v.getTop();
        m6497d();
        this.f9263H = i2;
        this.f9264I = true;
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public void mo1409a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == mo4324b()) {
            m6498d(3);
            return;
        }
        if (this.f9258C != null && view == this.f9258C.get() && this.f9264I) {
            if (this.f9263H > 0) {
                if (this.f9271b) {
                    i2 = this.f9286r;
                } else if (v.getTop() > this.f9287s) {
                    i2 = this.f9287s;
                    i3 = 6;
                } else {
                    i2 = this.f9285q;
                }
            } else {
                if (this.f9291w) {
                    if (this.f9266K == null) {
                        yVelocity = 0.0f;
                    } else {
                        this.f9266K.computeCurrentVelocity(1000, this.f9273d);
                        yVelocity = this.f9266K.getYVelocity(this.f9259D);
                    }
                    if (m6496a(v, yVelocity)) {
                        i2 = this.f9256A;
                        i3 = 5;
                    }
                }
                if (this.f9263H == 0) {
                    int top = v.getTop();
                    if (this.f9271b) {
                        if (Math.abs(top - this.f9286r) < Math.abs(top - this.f9289u)) {
                            i2 = this.f9286r;
                        } else {
                            i2 = this.f9289u;
                            i3 = 4;
                        }
                    } else {
                        if (top < this.f9287s) {
                            if (top < Math.abs(top - this.f9289u)) {
                                i2 = this.f9285q;
                            } else {
                                i2 = this.f9287s;
                            }
                        } else if (Math.abs(top - this.f9287s) < Math.abs(top - this.f9289u)) {
                            i2 = this.f9287s;
                        } else {
                            i2 = this.f9289u;
                            i3 = 4;
                        }
                        i3 = 6;
                    }
                } else {
                    if (!this.f9271b) {
                        int top2 = v.getTop();
                        if (Math.abs(top2 - this.f9287s) < Math.abs(top2 - this.f9289u)) {
                            i2 = this.f9287s;
                            i3 = 6;
                        }
                    }
                    i2 = this.f9289u;
                    i3 = 4;
                }
            }
            m6495a((View) v, i3, i2, false);
            this.f9264I = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public boolean mo1420a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return this.f9258C != null && view == this.f9258C.get() && (this.f9292x != 3 || super.mo1420a(coordinatorLayout, v, view, f, f2));
    }

    /* renamed from: a */
    public void mo4322a(boolean z) {
        if (this.f9271b == z) {
            return;
        }
        this.f9271b = z;
        if (this.f9257B != null) {
            m6487f();
        }
        m6498d((this.f9271b && this.f9292x == 6) ? 3 : this.f9292x);
        m6492i();
    }

    /* renamed from: a */
    public void mo4318a(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f9288t = f;
        if (this.f9257B != null) {
            m6490g();
        }
    }

    /* renamed from: a */
    public void mo4319a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f9285q = i;
    }

    /* renamed from: b */
    public int mo4324b() {
        return this.f9271b ? this.f9286r : this.f9285q;
    }

    /* renamed from: b */
    public void mo4326b(boolean z) {
        if (this.f9291w != z) {
            this.f9291w = z;
            if (!z && this.f9292x == 5) {
                mo4357e(4);
            }
            m6492i();
        }
    }

    /* renamed from: e */
    public void mo4358e(boolean z) {
        this.f9284p = z;
    }

    /* renamed from: c */
    public void mo4328c(boolean z) {
        this.f9261F = z;
    }

    /* renamed from: b */
    public void mo4325b(int i) {
        this.f9270a = i;
    }

    /* renamed from: e */
    public void mo4357e(int i) {
        if (i == this.f9292x) {
            return;
        }
        if (this.f9257B == null) {
            if (i == 4 || i == 3 || i == 6 || (this.f9291w && i == 5)) {
                this.f9292x = i;
                return;
            }
            return;
        }
        V v = this.f9257B.get();
        if (v != null) {
            ViewParent parent = v.getParent();
            if (parent != null && parent.isLayoutRequested() && C0538w.m1822F(v)) {
                v.post(new RunnableC2092a(this, v, i));
            } else {
                m6494a((View) v, i);
            }
        }
    }

    /* renamed from: d */
    public void mo4332d(boolean z) {
        this.f9279j = z;
    }

    /* renamed from: c */
    public boolean mo4329c() {
        return this.f9279j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m6498d(int i) {
        if (this.f9292x == i) {
            return;
        }
        this.f9292x = i;
        if (this.f9257B == null || this.f9257B.get() == null) {
            return;
        }
        if (i == 3) {
            m6489f(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m6489f(false);
        }
        m6488f(i);
        for (int i2 = 0; i2 < this.f9265J.size(); i2++) {
            this.f9265J.get(i2);
        }
        m6492i();
    }

    /* renamed from: f */
    private void m6488f(int i) {
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f9281l != z) {
            this.f9281l = z;
            if (this.f9278i == null || this.f9283n == null) {
                return;
            }
            if (this.f9283n.isRunning()) {
                this.f9283n.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.f9283n.setFloatValues(1.0f - f, f);
            this.f9283n.start();
        }
    }

    /* renamed from: e */
    private int m6485e() {
        if (this.f9275f) {
            return Math.max(this.f9276g, this.f9256A - ((this.f9294z * 9) / 16));
        }
        return this.f9274e;
    }

    /* renamed from: f */
    private void m6487f() {
        int m6485e = m6485e();
        if (this.f9271b) {
            this.f9289u = Math.max(this.f9256A - m6485e, this.f9286r);
        } else {
            this.f9289u = this.f9256A - m6485e;
        }
    }

    /* renamed from: g */
    private void m6490g() {
        this.f9287s = (int) (this.f9256A * (1.0f - this.f9288t));
    }

    /* renamed from: h */
    private void m6491h() {
        this.f9259D = -1;
        if (this.f9266K != null) {
            this.f9266K.recycle();
            this.f9266K = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m6496a(View view, float f) {
        if (this.f9284p) {
            return true;
        }
        if (view.getTop() < this.f9289u) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f9289u)) / ((float) m6485e()) > 0.5f;
    }

    /* renamed from: a */
    View m6493a(View view) {
        if (C0538w.m1817A(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View m6493a = m6493a(viewGroup.getChildAt(i));
            if (m6493a != null) {
                return m6493a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m6480a(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f9277h) {
            this.f9280k = C2303p.m7300a(context, attributeSet, R.attr.bottomSheetStyle, f9255o).m7327a();
            this.f9278i = new C2295h(this.f9280k);
            this.f9278i.m7276a(context);
            if (z && colorStateList != null) {
                this.f9278i.m7282g(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.f9278i.setTint(typedValue.data);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6494a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f9289u;
        } else if (i == 6) {
            int i3 = this.f9287s;
            if (!this.f9271b || i3 > this.f9286r) {
                i2 = i3;
            } else {
                i2 = this.f9286r;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo4324b();
        } else if (this.f9291w && i == 5) {
            i2 = this.f9256A;
        } else {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
        }
        m6495a(view, i, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6495a(View view, int i, int i2, boolean z) {
        boolean m2127a;
        if (z) {
            m2127a = this.f9293y.m2125a(view.getLeft(), i2);
        } else {
            m2127a = this.f9293y.m2127a(view, view.getLeft(), i2);
        }
        if (m2127a) {
            m6498d(2);
            m6488f(i);
            if (this.f9282m == null) {
                this.f9282m = new RunnableC2097f(view, i);
            }
            if (!((RunnableC2097f) this.f9282m).f9310d) {
                this.f9282m.f9307a = i;
                C0538w.m1852a(view, (Runnable) this.f9282m);
                RunnableC2097f.m6500b(this.f9282m);
                return;
            }
            this.f9282m.f9307a = i;
            return;
        }
        m6498d(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m6497d() {
        if (this.f9257B.get() == null || this.f9265J.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.f9265J.size(); i++) {
            this.f9265J.get(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetBehavior.java */
    /* renamed from: com.google.android.material.bottomsheet.f */
    /* loaded from: classes.dex */
    public final class RunnableC2097f implements Runnable {

        /* renamed from: a */
        int f9307a;

        /* renamed from: c */
        private final View f9309c;

        /* renamed from: d */
        private boolean f9310d;

        /* renamed from: b */
        static /* synthetic */ boolean m6500b(RunnableC2097f runnableC2097f) {
            runnableC2097f.f9310d = true;
            return true;
        }

        RunnableC2097f(View view, int i) {
            this.f9309c = view;
            this.f9307a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (BottomSheetBehavior.this.f9293y != null && BottomSheetBehavior.this.f9293y.m2136g()) {
                C0538w.m1852a(this.f9309c, this);
            } else {
                BottomSheetBehavior.this.m6498d(this.f9307a);
            }
            this.f9310d = false;
        }
    }

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2096e();

        /* renamed from: a */
        final int f9295a;

        /* renamed from: b */
        int f9296b;

        /* renamed from: d */
        boolean f9297d;

        /* renamed from: e */
        boolean f9298e;

        /* renamed from: f */
        boolean f9299f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9295a = parcel.readInt();
            this.f9296b = parcel.readInt();
            this.f9297d = parcel.readInt() == 1;
            this.f9298e = parcel.readInt() == 1;
            this.f9299f = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f9295a = bottomSheetBehavior.f9292x;
            this.f9296b = ((BottomSheetBehavior) bottomSheetBehavior).f9274e;
            this.f9297d = ((BottomSheetBehavior) bottomSheetBehavior).f9271b;
            this.f9298e = bottomSheetBehavior.f9291w;
            this.f9299f = ((BottomSheetBehavior) bottomSheetBehavior).f9284p;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9295a);
            parcel.writeInt(this.f9296b);
            parcel.writeInt(this.f9297d ? 1 : 0);
            parcel.writeInt(this.f9298e ? 1 : 0);
            parcel.writeInt(this.f9299f ? 1 : 0);
        }
    }

    /* renamed from: f */
    private void m6489f(boolean z) {
        if (this.f9257B == null) {
            return;
        }
        ViewParent parent = this.f9257B.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.f9268M != null) {
                    return;
                } else {
                    this.f9268M = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f9257B.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f9268M.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f9272c) {
                            C0538w.m1840a(childAt, 4);
                        }
                    } else if (this.f9272c && this.f9268M != null && this.f9268M.containsKey(childAt)) {
                        C0538w.m1840a(childAt, this.f9268M.get(childAt).intValue());
                    }
                }
            }
            if (z) {
                return;
            }
            this.f9268M = null;
        }
    }

    /* renamed from: i */
    private void m6492i() {
        V v;
        if (this.f9257B == null || (v = this.f9257B.get()) == null) {
            return;
        }
        C0538w.m1862b((View) v, 524288);
        C0538w.m1862b((View) v, 262144);
        C0538w.m1862b((View) v, 1048576);
        if (this.f9291w && this.f9292x != 5) {
            m6481a((BottomSheetBehavior<V>) v, C0483d.f2319u, 5);
        }
        int i = this.f9292x;
        if (i != 6) {
            switch (i) {
                case 3:
                    m6481a((BottomSheetBehavior<V>) v, C0483d.f2318t, this.f9271b ? 4 : 6);
                    return;
                case 4:
                    m6481a((BottomSheetBehavior<V>) v, C0483d.f2317s, this.f9271b ? 3 : 6);
                    return;
                default:
                    return;
            }
        }
        m6481a((BottomSheetBehavior<V>) v, C0483d.f2318t, 4);
        m6481a((BottomSheetBehavior<V>) v, C0483d.f2317s, 3);
    }

    /* renamed from: a */
    private void m6481a(V v, C0483d c0483d, int i) {
        C0538w.m1848a(v, c0483d, new C2095d(this, i));
    }

    /* renamed from: a_ */
    public void mo4354a_(int i) {
        V v;
        boolean z = true;
        if (i == -1) {
            if (!this.f9275f) {
                this.f9275f = true;
            }
            z = false;
        } else {
            if (this.f9275f || this.f9274e != i) {
                this.f9275f = false;
                this.f9274e = Math.max(0, i);
            }
            z = false;
        }
        if (!z || this.f9257B == null) {
            return;
        }
        m6487f();
        if (this.f9292x != 4 || (v = this.f9257B.get()) == null) {
            return;
        }
        v.requestLayout();
    }
}
