package com.color.support.dialog.panel;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
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
import androidx.coordinatorlayout.widget.C0394f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0483d;
import androidx.customview.p027a.AbstractC0593l;
import androidx.customview.p027a.C0590i;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2303p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ColorGuideBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: T */
    private static final int f5624T = R.style.Widget_Design_BottomSheet_Modal;

    /* renamed from: F */
    private int f5625F;

    /* renamed from: G */
    private boolean f5626G;

    /* renamed from: H */
    private boolean f5627H;

    /* renamed from: I */
    private float f5628I;

    /* renamed from: J */
    private int f5629J;

    /* renamed from: K */
    private boolean f5630K;

    /* renamed from: L */
    private int f5631L;

    /* renamed from: M */
    private boolean f5632M;

    /* renamed from: N */
    private C2295h f5633N;

    /* renamed from: O */
    private boolean f5634O;

    /* renamed from: P */
    private C2303p f5635P;

    /* renamed from: Q */
    private boolean f5636Q;

    /* renamed from: R */
    private ColorGuideBehavior<V>.RunnableC1329l f5637R;

    /* renamed from: S */
    private ValueAnimator f5638S;

    /* renamed from: U */
    private boolean f5639U;

    /* renamed from: V */
    private boolean f5640V;

    /* renamed from: W */
    private boolean f5641W;

    /* renamed from: X */
    private int f5642X;

    /* renamed from: Y */
    private boolean f5643Y;

    /* renamed from: Z */
    private final ArrayList<Object> f5644Z;

    /* renamed from: a */
    int f5645a;

    /* renamed from: aa */
    private VelocityTracker f5646aa;

    /* renamed from: ab */
    private int f5647ab;

    /* renamed from: ac */
    private int f5648ac;

    /* renamed from: ad */
    private Map<View, Integer> f5649ad;

    /* renamed from: ae */
    private boolean f5650ae;

    /* renamed from: af */
    private final AbstractC0593l f5651af;

    /* renamed from: b */
    int f5652b;

    /* renamed from: c */
    int f5653c;

    /* renamed from: d */
    float f5654d;

    /* renamed from: e */
    int f5655e;

    /* renamed from: f */
    float f5656f;

    /* renamed from: g */
    boolean f5657g;

    /* renamed from: h */
    int f5658h;

    /* renamed from: i */
    C0590i f5659i;

    /* renamed from: j */
    int f5660j;

    /* renamed from: k */
    int f5661k;

    /* renamed from: l */
    WeakReference<V> f5662l;

    /* renamed from: m */
    WeakReference<View> f5663m;

    /* renamed from: n */
    int f5664n;

    /* renamed from: o */
    boolean f5665o;

    /* renamed from: p */
    InterfaceC1330m f5666p;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1410a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public ColorGuideBehavior() {
        this.f5625F = 0;
        this.f5626G = true;
        this.f5627H = false;
        this.f5637R = null;
        this.f5654d = 0.5f;
        this.f5656f = -1.0f;
        this.f5640V = true;
        this.f5658h = 4;
        this.f5644Z = new ArrayList<>();
        this.f5651af = new C1326i(this);
    }

    public ColorGuideBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5625F = 0;
        this.f5626G = true;
        this.f5627H = false;
        this.f5637R = null;
        this.f5654d = 0.5f;
        this.f5656f = -1.0f;
        this.f5640V = true;
        this.f5658h = 4;
        this.f5644Z = new ArrayList<>();
        this.f5651af = new C1326i(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        this.f5632M = obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            m4334a(context, attributeSet, hasValue, C2221d.m7045a(context, obtainStyledAttributes, R.styleable.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            m4334a(context, attributeSet, hasValue, (ColorStateList) null);
        }
        this.f5638S = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5638S.setDuration(500L);
        this.f5638S.addUpdateListener(new C1325h(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5656f = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && peekValue.data == -1) {
            m4343f(peekValue.data);
        } else {
            m4343f(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        mo4326b(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.f5634O = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        mo4322a(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.f5639U = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.f5640V = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f5625F = obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        mo4318a(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            mo4319a(peekValue2.data);
        } else {
            mo4319a(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        obtainStyledAttributes.recycle();
        this.f5628I = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f5650ae = false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: b */
    public final Parcelable mo1422b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1422b(coordinatorLayout, v), (ColorGuideBehavior<?>) this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1408a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1408a(coordinatorLayout, (CoordinatorLayout) v, savedState.m2149a());
        if (this.f5625F != 0) {
            if (this.f5625F == -1 || (this.f5625F & 1) == 1) {
                this.f5629J = savedState.f5668b;
            }
            if (this.f5625F == -1 || (this.f5625F & 2) == 2) {
                this.f5626G = savedState.f5669d;
            }
            if (this.f5625F == -1 || (this.f5625F & 4) == 4) {
                this.f5657g = savedState.f5670e;
            }
            if (this.f5625F == -1 || (this.f5625F & 8) == 8) {
                this.f5639U = savedState.f5671f;
            }
        }
        if (savedState.f5667a == 1 || savedState.f5667a == 2) {
            this.f5658h = 4;
        } else {
            this.f5658h = savedState.f5667a;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1412a(C0394f c0394f) {
        super.mo1412a(c0394f);
        this.f5662l = null;
        this.f5659i = null;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1406a() {
        super.mo1406a();
        this.f5662l = null;
        this.f5659i = null;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1414a(CoordinatorLayout coordinatorLayout, V v, int i) {
        WindowInsets rootWindowInsets;
        if (C0538w.m1893v(coordinatorLayout) && !C0538w.m1893v(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f5662l == null) {
            this.f5631L = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f5634O && (rootWindowInsets = coordinatorLayout.getRootWindowInsets()) != null) {
                this.f5629J += rootWindowInsets.getSystemGestureInsets().bottom;
            }
            this.f5662l = new WeakReference<>(v);
            if (this.f5632M && this.f5633N != null) {
                C0538w.m1846a(v, this.f5633N);
            }
            if (this.f5633N != null) {
                this.f5633N.m7288r(this.f5656f == -1.0f ? C0538w.m1888q(v) : this.f5656f);
                this.f5636Q = this.f5658h == 3;
                this.f5633N.m7286p(this.f5636Q ? 0.0f : 1.0f);
            }
            m4349i();
            if (C0538w.m1876g(v) == 0) {
                C0538w.m1840a((View) v, 1);
            }
        }
        if (this.f5659i == null) {
            this.f5659i = C0590i.m2105a(coordinatorLayout, this.f5651af);
        }
        int top = v.getTop();
        coordinatorLayout.m1404b(v, i);
        this.f5660j = coordinatorLayout.getWidth();
        this.f5661k = coordinatorLayout.getHeight();
        this.f5652b = Math.max(0, this.f5661k - v.getHeight());
        m4345g();
        m4342f();
        if (this.f5658h == 3) {
            C0538w.m1869c((View) v, mo4324b());
        } else if (this.f5658h == 6) {
            C0538w.m1869c((View) v, this.f5653c);
        } else if (this.f5657g && this.f5658h == 5) {
            C0538w.m1869c((View) v, this.f5661k);
        } else if (this.f5658h == 4) {
            C0538w.m1869c((View) v, this.f5655e);
        } else if (this.f5658h == 1 || this.f5658h == 2) {
            C0538w.m1869c((View) v, top - v.getTop());
        }
        this.f5663m = new WeakReference<>(m4350a(v));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1418a(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.dialog.panel.ColorGuideBehavior.mo1418a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: b */
    public final boolean mo1423b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5658h == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f5659i != null) {
            this.f5659i.m2131b(motionEvent);
        }
        if (actionMasked == 0) {
            m4347h();
        }
        if (this.f5646aa == null) {
            this.f5646aa = VelocityTracker.obtain();
        }
        this.f5646aa.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f5641W && Math.abs(this.f5648ac - motionEvent.getY()) > this.f5659i.m2133d()) {
            this.f5659i.m2124a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f5641W;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1421a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f5642X = 0;
        this.f5643Y = false;
        return (i & 2) != 0;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1411a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        if (view != (this.f5663m != null ? this.f5663m.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < mo4324b()) {
                iArr[1] = top - mo4324b();
                C0538w.m1869c((View) v, -iArr[1]);
                m4356d(3);
            } else {
                if (!this.f5640V) {
                    return;
                }
                iArr[1] = i2;
                C0538w.m1869c((View) v, -i2);
                m4356d(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            if (i4 <= this.f5655e || this.f5657g) {
                if (!this.f5640V) {
                    return;
                }
                iArr[1] = i2;
                C0538w.m1869c((View) v, -i2);
                m4356d(1);
            } else {
                iArr[1] = top - this.f5655e;
                C0538w.m1869c((View) v, -iArr[1]);
                m4356d(4);
            }
        }
        v.getTop();
        m4355d();
        this.f5642X = i2;
        this.f5643Y = true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1409a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == mo4324b()) {
            m4356d(3);
            return;
        }
        if (this.f5663m != null && view == this.f5663m.get() && this.f5643Y) {
            if (this.f5642X > 0) {
                if (this.f5626G) {
                    i2 = this.f5652b;
                } else if (v.getTop() > this.f5653c) {
                    i2 = this.f5653c;
                    i3 = 6;
                } else {
                    i2 = this.f5645a;
                }
            } else {
                if (this.f5657g) {
                    if (this.f5646aa == null) {
                        yVelocity = 0.0f;
                    } else {
                        this.f5646aa.computeCurrentVelocity(1000, this.f5628I);
                        yVelocity = this.f5646aa.getYVelocity(this.f5664n);
                    }
                    if (m4353a(v, yVelocity)) {
                        if (this.f5666p != null && this.f5666p.m4363a()) {
                            i2 = this.f5652b;
                            this.f5650ae = false;
                        } else {
                            i2 = this.f5661k;
                            i3 = 5;
                            this.f5650ae = true;
                        }
                    }
                }
                if (this.f5642X == 0) {
                    int top = v.getTop();
                    if (this.f5626G) {
                        if (Math.abs(top - this.f5652b) < Math.abs(top - this.f5655e)) {
                            i2 = this.f5652b;
                        } else {
                            i2 = this.f5655e;
                            i3 = 4;
                        }
                    } else {
                        if (top < this.f5653c) {
                            if (top < Math.abs(top - this.f5655e)) {
                                i2 = this.f5645a;
                            } else {
                                i2 = this.f5653c;
                            }
                        } else if (Math.abs(top - this.f5653c) < Math.abs(top - this.f5655e)) {
                            i2 = this.f5653c;
                        } else {
                            i2 = this.f5655e;
                            i3 = 4;
                        }
                        i3 = 6;
                    }
                } else {
                    if (!this.f5626G) {
                        int top2 = v.getTop();
                        if (Math.abs(top2 - this.f5653c) < Math.abs(top2 - this.f5655e)) {
                            i2 = this.f5653c;
                            i3 = 6;
                        }
                    }
                    i2 = this.f5655e;
                    i3 = 4;
                }
            }
            m4352a((View) v, i3, i2, false);
            this.f5643Y = false;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1420a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return this.f5663m != null && view == this.f5663m.get() && (this.f5658h != 3 || super.mo1420a(coordinatorLayout, v, view, f, f2));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: a */
    public final void mo4322a(boolean z) {
        if (this.f5626G == z) {
            return;
        }
        this.f5626G = z;
        if (this.f5662l != null) {
            m4342f();
        }
        m4356d((this.f5626G && this.f5658h == 6) ? 3 : this.f5658h);
        m4349i();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: a_ */
    public final void mo4354a_(int i) {
        m4343f(i);
    }

    /* renamed from: f */
    private void m4343f(int i) {
        V v;
        boolean z = true;
        if (i == -1) {
            if (!this.f5630K) {
                this.f5630K = true;
            }
            z = false;
        } else {
            if (this.f5630K || this.f5629J != i) {
                this.f5630K = false;
                this.f5629J = Math.max(0, i);
            }
            z = false;
        }
        if (!z || this.f5662l == null) {
            return;
        }
        m4342f();
        if (this.f5658h != 4 || (v = this.f5662l.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: a */
    public final void mo4318a(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f5654d = f;
        if (this.f5662l != null) {
            m4345g();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: a */
    public final void mo4319a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f5645a = i;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: b */
    public final int mo4324b() {
        return this.f5626G ? this.f5652b : this.f5645a;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public final void mo4326b(boolean z) {
        if (this.f5657g != z) {
            this.f5657g = z;
            if (!z && this.f5658h == 5) {
                mo4357e(4);
            }
            m4349i();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: e */
    public final void mo4358e(boolean z) {
        this.f5639U = z;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: c */
    public final void mo4328c(boolean z) {
        this.f5640V = z;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: b */
    public final void mo4325b(int i) {
        this.f5625F = i;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: e */
    public final void mo4357e(int i) {
        if (i == this.f5658h) {
            return;
        }
        if (this.f5662l == null) {
            if (i == 4 || i == 3 || i == 6 || (this.f5657g && i == 5)) {
                this.f5658h = i;
                return;
            }
            return;
        }
        m4346g(i);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: d */
    public final void mo4332d(boolean z) {
        this.f5634O = z;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: c */
    public final boolean mo4329c() {
        return this.f5634O;
    }

    /* renamed from: g */
    private void m4346g(int i) {
        V v = this.f5662l.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C0538w.m1822F(v)) {
            v.post(new RunnableC1324g(this, v, i));
        } else {
            m4351a((View) v, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m4356d(int i) {
        if (this.f5658h == i) {
            return;
        }
        this.f5658h = i;
        if (this.f5662l == null || this.f5662l.get() == null) {
            return;
        }
        if (i == 3) {
            m4344f(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m4344f(false);
        }
        m4348h(i);
        for (int i2 = 0; i2 < this.f5644Z.size(); i2++) {
            this.f5644Z.get(i2);
        }
        m4349i();
    }

    /* renamed from: h */
    private void m4348h(int i) {
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f5636Q != z) {
            this.f5636Q = z;
            if (this.f5633N == null || this.f5638S == null) {
                return;
            }
            if (this.f5638S.isRunning()) {
                this.f5638S.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.f5638S.setFloatValues(1.0f - f, f);
            this.f5638S.start();
        }
    }

    /* renamed from: e */
    private int m4340e() {
        if (this.f5630K) {
            return Math.max(this.f5631L, this.f5661k - ((this.f5660j * 9) / 16));
        }
        return this.f5629J;
    }

    /* renamed from: f */
    private void m4342f() {
        int m4340e = m4340e();
        if (this.f5626G) {
            this.f5655e = Math.max(this.f5661k - m4340e, this.f5652b);
        } else {
            this.f5655e = this.f5661k - m4340e;
        }
    }

    /* renamed from: g */
    private void m4345g() {
        this.f5653c = (int) (this.f5661k * (1.0f - this.f5654d));
    }

    /* renamed from: h */
    private void m4347h() {
        this.f5664n = -1;
        if (this.f5646aa != null) {
            this.f5646aa.recycle();
            this.f5646aa = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m4353a(View view, float f) {
        if (this.f5639U) {
            return true;
        }
        if (view.getTop() < this.f5655e) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f5655e)) / ((float) m4340e()) > 0.5f;
    }

    /* renamed from: a */
    final View m4350a(View view) {
        if (C0538w.m1817A(view) && view.getVisibility() == 0) {
            return view;
        }
        if (!(view instanceof ViewGroup) || view.getVisibility() != 0) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View m4350a = m4350a(viewGroup.getChildAt(i));
            if (m4350a != null) {
                return m4350a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m4334a(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f5632M) {
            this.f5635P = C2303p.m7300a(context, attributeSet, R.attr.bottomSheetStyle, f5624T).m7327a();
            this.f5633N = new C2295h(this.f5635P);
            this.f5633N.m7276a(context);
            if (z && colorStateList != null) {
                this.f5633N.m7282g(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.f5633N.setTint(typedValue.data);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4351a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f5655e;
        } else if (i == 6) {
            int i3 = this.f5653c;
            if (!this.f5626G || i3 > this.f5652b) {
                i2 = i3;
            } else {
                i2 = this.f5652b;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo4324b();
        } else if (this.f5657g && i == 5) {
            i2 = this.f5661k;
        } else {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
        }
        m4352a(view, i, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4352a(View view, int i, int i2, boolean z) {
        boolean m2127a;
        if (z) {
            m2127a = this.f5659i.m2125a(view.getLeft(), i2);
        } else {
            m2127a = this.f5659i.m2127a(view, view.getLeft(), i2);
        }
        if (m2127a) {
            m4356d(2);
            m4348h(i);
            if (this.f5637R == null) {
                this.f5637R = new RunnableC1329l(view, i);
            }
            if (!((RunnableC1329l) this.f5637R).f5693d) {
                this.f5637R.f5690a = i;
                C0538w.m1852a(view, (Runnable) this.f5637R);
                RunnableC1329l.m4362b(this.f5637R);
                return;
            }
            this.f5637R.f5690a = i;
            return;
        }
        m4356d(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m4355d() {
        if (this.f5662l.get() == null || this.f5644Z.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.f5644Z.size(); i++) {
            this.f5644Z.get(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ColorGuideBehavior.java */
    /* renamed from: com.color.support.dialog.panel.l */
    /* loaded from: classes.dex */
    public final class RunnableC1329l implements Runnable {

        /* renamed from: a */
        int f5690a;

        /* renamed from: c */
        private final View f5692c;

        /* renamed from: d */
        private boolean f5693d;

        /* renamed from: b */
        static /* synthetic */ boolean m4362b(RunnableC1329l runnableC1329l) {
            runnableC1329l.f5693d = true;
            return true;
        }

        RunnableC1329l(View view, int i) {
            this.f5692c = view;
            this.f5690a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ColorGuideBehavior.this.f5659i != null && ColorGuideBehavior.this.f5659i.m2136g()) {
                C0538w.m1852a(this.f5692c, this);
            } else {
                ColorGuideBehavior.this.m4356d(this.f5690a);
            }
            this.f5693d = false;
        }
    }

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1328k();

        /* renamed from: a */
        final int f5667a;

        /* renamed from: b */
        int f5668b;

        /* renamed from: d */
        boolean f5669d;

        /* renamed from: e */
        boolean f5670e;

        /* renamed from: f */
        boolean f5671f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5667a = parcel.readInt();
            this.f5668b = parcel.readInt();
            this.f5669d = parcel.readInt() == 1;
            this.f5670e = parcel.readInt() == 1;
            this.f5671f = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, ColorGuideBehavior<?> colorGuideBehavior) {
            super(parcelable);
            this.f5667a = colorGuideBehavior.f5658h;
            this.f5668b = ((ColorGuideBehavior) colorGuideBehavior).f5629J;
            this.f5669d = ((ColorGuideBehavior) colorGuideBehavior).f5626G;
            this.f5670e = colorGuideBehavior.f5657g;
            this.f5671f = ((ColorGuideBehavior) colorGuideBehavior).f5639U;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5667a);
            parcel.writeInt(this.f5668b);
            parcel.writeInt(this.f5669d ? 1 : 0);
            parcel.writeInt(this.f5670e ? 1 : 0);
            parcel.writeInt(this.f5671f ? 1 : 0);
        }
    }

    /* renamed from: f */
    private void m4344f(boolean z) {
        if (this.f5662l == null) {
            return;
        }
        ViewParent parent = this.f5662l.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.f5649ad != null) {
                    return;
                } else {
                    this.f5649ad = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f5662l.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f5649ad.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f5627H) {
                            C0538w.m1840a(childAt, 4);
                        }
                    } else if (this.f5627H && this.f5649ad != null && this.f5649ad.containsKey(childAt)) {
                        C0538w.m1840a(childAt, this.f5649ad.get(childAt).intValue());
                    }
                }
            }
            if (z) {
                return;
            }
            this.f5649ad = null;
        }
    }

    /* renamed from: i */
    private void m4349i() {
        V v;
        if (this.f5662l == null || (v = this.f5662l.get()) == null) {
            return;
        }
        C0538w.m1862b((View) v, 524288);
        C0538w.m1862b((View) v, 262144);
        C0538w.m1862b((View) v, 1048576);
        if (this.f5657g && this.f5658h != 5) {
            m4335a((ColorGuideBehavior<V>) v, C0483d.f2319u, 5);
        }
        int i = this.f5658h;
        if (i != 6) {
            switch (i) {
                case 3:
                    m4335a((ColorGuideBehavior<V>) v, C0483d.f2318t, this.f5626G ? 4 : 6);
                    return;
                case 4:
                    m4335a((ColorGuideBehavior<V>) v, C0483d.f2317s, this.f5626G ? 3 : 6);
                    return;
                default:
                    return;
            }
        }
        m4335a((ColorGuideBehavior<V>) v, C0483d.f2318t, 4);
        m4335a((ColorGuideBehavior<V>) v, C0483d.f2317s, 3);
    }

    /* renamed from: a */
    private void m4335a(V v, C0483d c0483d, int i) {
        C0538w.m1848a(v, c0483d, new C1327j(this, i));
    }
}
