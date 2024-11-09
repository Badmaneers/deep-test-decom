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
public class ColorBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: T */
    private static final int f5576T = R.style.Widget_Design_BottomSheet_Modal;

    /* renamed from: F */
    private int f5577F;

    /* renamed from: G */
    private boolean f5578G;

    /* renamed from: H */
    private boolean f5579H;

    /* renamed from: I */
    private float f5580I;

    /* renamed from: J */
    private int f5581J;

    /* renamed from: K */
    private boolean f5582K;

    /* renamed from: L */
    private int f5583L;

    /* renamed from: M */
    private boolean f5584M;

    /* renamed from: N */
    private C2295h f5585N;

    /* renamed from: O */
    private boolean f5586O;

    /* renamed from: P */
    private C2303p f5587P;

    /* renamed from: Q */
    private boolean f5588Q;

    /* renamed from: R */
    private ColorBottomSheetBehavior<V>.RunnableC1323f f5589R;

    /* renamed from: S */
    private ValueAnimator f5590S;

    /* renamed from: U */
    private boolean f5591U;

    /* renamed from: V */
    private boolean f5592V;

    /* renamed from: W */
    private boolean f5593W;

    /* renamed from: X */
    private int f5594X;

    /* renamed from: Y */
    private boolean f5595Y;

    /* renamed from: Z */
    private final ArrayList<Object> f5596Z;

    /* renamed from: a */
    int f5597a;

    /* renamed from: aa */
    private VelocityTracker f5598aa;

    /* renamed from: ab */
    private int f5599ab;

    /* renamed from: ac */
    private int f5600ac;

    /* renamed from: ad */
    private Map<View, Integer> f5601ad;

    /* renamed from: ae */
    private boolean f5602ae;

    /* renamed from: af */
    private final AbstractC0593l f5603af;

    /* renamed from: b */
    int f5604b;

    /* renamed from: c */
    int f5605c;

    /* renamed from: d */
    float f5606d;

    /* renamed from: e */
    int f5607e;

    /* renamed from: f */
    float f5608f;

    /* renamed from: g */
    boolean f5609g;

    /* renamed from: h */
    int f5610h;

    /* renamed from: i */
    C0590i f5611i;

    /* renamed from: j */
    int f5612j;

    /* renamed from: k */
    int f5613k;

    /* renamed from: l */
    WeakReference<V> f5614l;

    /* renamed from: m */
    WeakReference<View> f5615m;

    /* renamed from: n */
    int f5616n;

    /* renamed from: o */
    boolean f5617o;

    /* renamed from: p */
    InterfaceC1330m f5618p;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1410a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public ColorBottomSheetBehavior() {
        this.f5577F = 0;
        this.f5578G = true;
        this.f5579H = false;
        this.f5589R = null;
        this.f5606d = 0.5f;
        this.f5608f = -1.0f;
        this.f5592V = true;
        this.f5610h = 4;
        this.f5596Z = new ArrayList<>();
        this.f5603af = new C1320c(this);
    }

    public ColorBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5577F = 0;
        this.f5578G = true;
        this.f5579H = false;
        this.f5589R = null;
        this.f5606d = 0.5f;
        this.f5608f = -1.0f;
        this.f5592V = true;
        this.f5610h = 4;
        this.f5596Z = new ArrayList<>();
        this.f5603af = new C1320c(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        this.f5584M = obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            m4301a(context, attributeSet, hasValue, C2221d.m7045a(context, obtainStyledAttributes, R.styleable.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            m4301a(context, attributeSet, hasValue, (ColorStateList) null);
        }
        this.f5590S = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5590S.setDuration(500L);
        this.f5590S.addUpdateListener(new C1319b(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5608f = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && peekValue.data == -1) {
            m4310f(peekValue.data);
        } else {
            m4310f(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        mo4326b(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.f5586O = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        mo4322a(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.f5591U = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.f5592V = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f5577F = obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, -1);
        mo4318a(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            mo4319a(peekValue2.data);
        } else {
            mo4319a(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        obtainStyledAttributes.recycle();
        this.f5580I = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f5602ae = false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: b */
    public final Parcelable mo1422b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1422b(coordinatorLayout, v), (ColorBottomSheetBehavior<?>) this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1408a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1408a(coordinatorLayout, (CoordinatorLayout) v, savedState.m2149a());
        if (this.f5577F != 0) {
            if (this.f5577F == -1 || (this.f5577F & 1) == 1) {
                this.f5581J = savedState.f5620b;
            }
            if (this.f5577F == -1 || (this.f5577F & 2) == 2) {
                this.f5578G = savedState.f5621d;
            }
            if (this.f5577F == -1 || (this.f5577F & 4) == 4) {
                this.f5609g = savedState.f5622e;
            }
            if (this.f5577F == -1 || (this.f5577F & 8) == 8) {
                this.f5591U = savedState.f5623f;
            }
        }
        if (savedState.f5619a == 1 || savedState.f5619a == 2) {
            this.f5610h = 4;
        } else {
            this.f5610h = savedState.f5619a;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1412a(C0394f c0394f) {
        super.mo1412a(c0394f);
        this.f5614l = null;
        this.f5611i = null;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1406a() {
        super.mo1406a();
        this.f5614l = null;
        this.f5611i = null;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1414a(CoordinatorLayout coordinatorLayout, V v, int i) {
        WindowInsets rootWindowInsets;
        if (C0538w.m1893v(coordinatorLayout) && !C0538w.m1893v(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f5614l == null) {
            this.f5583L = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f5586O && (rootWindowInsets = coordinatorLayout.getRootWindowInsets()) != null) {
                this.f5581J += rootWindowInsets.getSystemGestureInsets().bottom;
            }
            this.f5614l = new WeakReference<>(v);
            if (this.f5584M && this.f5585N != null) {
                C0538w.m1846a(v, this.f5585N);
            }
            if (this.f5585N != null) {
                this.f5585N.m7288r(this.f5608f == -1.0f ? C0538w.m1888q(v) : this.f5608f);
                this.f5588Q = this.f5610h == 3;
                this.f5585N.m7286p(this.f5588Q ? 0.0f : 1.0f);
            }
            m4316i();
            if (C0538w.m1876g(v) == 0) {
                C0538w.m1840a((View) v, 1);
            }
        }
        if (this.f5611i == null) {
            this.f5611i = C0590i.m2105a(coordinatorLayout, this.f5603af);
        }
        int top = v.getTop();
        coordinatorLayout.m1404b(v, i);
        this.f5612j = coordinatorLayout.getWidth();
        this.f5613k = coordinatorLayout.getHeight();
        this.f5604b = Math.max(0, this.f5613k - v.getHeight());
        m4312g();
        m4309f();
        if (this.f5610h == 3) {
            C0538w.m1869c((View) v, mo4324b());
        } else if (this.f5610h == 6) {
            C0538w.m1869c((View) v, this.f5605c);
        } else if (this.f5609g && this.f5610h == 5) {
            C0538w.m1869c((View) v, this.f5613k);
        } else if (this.f5610h == 4) {
            C0538w.m1869c((View) v, this.f5607e);
        } else if (this.f5610h == 1 || this.f5610h == 2) {
            C0538w.m1869c((View) v, top - v.getTop());
        }
        this.f5615m = new WeakReference<>(m4317a(v));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1418a(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.dialog.panel.ColorBottomSheetBehavior.mo1418a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: b */
    public final boolean mo1423b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5610h == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f5611i != null) {
            this.f5611i.m2131b(motionEvent);
        }
        if (actionMasked == 0) {
            m4314h();
        }
        if (this.f5598aa == null) {
            this.f5598aa = VelocityTracker.obtain();
        }
        this.f5598aa.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f5593W && Math.abs(this.f5600ac - motionEvent.getY()) > this.f5611i.m2133d()) {
            this.f5611i.m2124a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f5593W;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1421a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f5594X = 0;
        this.f5595Y = false;
        return (i & 2) != 0;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1411a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        if (view != (this.f5615m != null ? this.f5615m.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < mo4324b()) {
                iArr[1] = top - mo4324b();
                C0538w.m1869c((View) v, -iArr[1]);
                m4331d(3);
            } else {
                if (!this.f5592V) {
                    return;
                }
                iArr[1] = i2;
                C0538w.m1869c((View) v, -i2);
                m4331d(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            if (i4 <= this.f5607e || this.f5609g) {
                if (!this.f5592V) {
                    return;
                }
                iArr[1] = i2;
                C0538w.m1869c((View) v, -i2);
                m4331d(1);
            } else {
                iArr[1] = top - this.f5607e;
                C0538w.m1869c((View) v, -iArr[1]);
                m4331d(4);
            }
        }
        v.getTop();
        m4330d();
        this.f5594X = i2;
        this.f5595Y = true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final void mo1409a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == mo4324b()) {
            m4331d(3);
            return;
        }
        if (this.f5615m != null && view == this.f5615m.get() && this.f5595Y) {
            if (this.f5594X > 0) {
                if (this.f5578G) {
                    i2 = this.f5604b;
                } else if (v.getTop() > this.f5605c) {
                    i2 = this.f5605c;
                    i3 = 6;
                } else {
                    i2 = this.f5597a;
                }
            } else {
                if (this.f5609g) {
                    if (this.f5598aa == null) {
                        yVelocity = 0.0f;
                    } else {
                        this.f5598aa.computeCurrentVelocity(1000, this.f5580I);
                        yVelocity = this.f5598aa.getYVelocity(this.f5616n);
                    }
                    if (m4323a(v, yVelocity)) {
                        if (this.f5618p != null && this.f5618p.m4363a()) {
                            i2 = this.f5604b;
                            this.f5602ae = false;
                        } else {
                            i2 = this.f5613k;
                            this.f5602ae = true;
                            i3 = 5;
                        }
                    }
                }
                if (this.f5594X == 0) {
                    int top = v.getTop();
                    if (this.f5578G) {
                        if (Math.abs(top - this.f5604b) < Math.abs(top - this.f5607e)) {
                            i2 = this.f5604b;
                        } else {
                            i2 = this.f5607e;
                            i3 = 4;
                        }
                    } else {
                        if (top < this.f5605c) {
                            if (top < Math.abs(top - this.f5607e)) {
                                i2 = this.f5597a;
                            } else {
                                i2 = this.f5605c;
                            }
                        } else if (Math.abs(top - this.f5605c) < Math.abs(top - this.f5607e)) {
                            i2 = this.f5605c;
                        } else {
                            i2 = this.f5607e;
                            i3 = 4;
                        }
                        i3 = 6;
                    }
                } else {
                    if (this.f5578G) {
                        if (this.f5618p != null) {
                            if (this.f5618p.m4363a()) {
                                i2 = this.f5604b;
                            } else {
                                i2 = this.f5613k;
                                i3 = 5;
                            }
                        } else {
                            i2 = this.f5607e;
                        }
                    } else {
                        int top2 = v.getTop();
                        if (Math.abs(top2 - this.f5605c) < Math.abs(top2 - this.f5607e)) {
                            i2 = this.f5605c;
                            i3 = 6;
                        } else {
                            i2 = this.f5607e;
                        }
                    }
                    i3 = 4;
                }
            }
            m4321a((View) v, i3, i2, false);
            this.f5595Y = false;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1420a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return this.f5615m != null && view == this.f5615m.get() && (this.f5610h != 3 || super.mo1420a(coordinatorLayout, v, view, f, f2));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: a */
    public final void mo4322a(boolean z) {
        if (this.f5578G == z) {
            return;
        }
        this.f5578G = z;
        if (this.f5614l != null) {
            m4309f();
        }
        m4331d((this.f5578G && this.f5610h == 6) ? 3 : this.f5610h);
        m4316i();
    }

    /* renamed from: f */
    private void m4310f(int i) {
        V v;
        boolean z = true;
        if (i == -1) {
            if (!this.f5582K) {
                this.f5582K = true;
            }
            z = false;
        } else {
            if (this.f5582K || this.f5581J != i) {
                this.f5582K = false;
                this.f5581J = Math.max(0, i);
            }
            z = false;
        }
        if (!z || this.f5614l == null) {
            return;
        }
        m4309f();
        if (this.f5610h != 4 || (v = this.f5614l.get()) == null) {
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
        this.f5606d = f;
        if (this.f5614l != null) {
            m4312g();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: a */
    public final void mo4319a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f5597a = i;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: b */
    public final int mo4324b() {
        return this.f5578G ? this.f5604b : this.f5597a;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public final void mo4326b(boolean z) {
        if (this.f5609g != z) {
            this.f5609g = z;
            if (!z && this.f5610h == 5) {
                m4327c(4);
            }
            m4316i();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: c */
    public final void mo4328c(boolean z) {
        this.f5592V = z;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: b */
    public final void mo4325b(int i) {
        this.f5577F = i;
    }

    /* renamed from: c */
    public final void m4327c(int i) {
        if (i == this.f5610h) {
            return;
        }
        if (this.f5614l == null) {
            if (i == 4 || i == 3 || i == 6 || (this.f5609g && i == 5)) {
                this.f5610h = i;
                return;
            }
            return;
        }
        m4313g(i);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: d */
    public final void mo4332d(boolean z) {
        this.f5586O = z;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    /* renamed from: c */
    public final boolean mo4329c() {
        return this.f5586O;
    }

    /* renamed from: g */
    private void m4313g(int i) {
        V v = this.f5614l.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C0538w.m1822F(v)) {
            v.post(new RunnableC1318a(this, v, i));
        } else {
            m4320a((View) v, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m4331d(int i) {
        if (this.f5610h == i) {
            return;
        }
        this.f5610h = i;
        if (this.f5614l == null || this.f5614l.get() == null) {
            return;
        }
        if (i == 3) {
            m4311f(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m4311f(false);
        }
        m4315h(i);
        for (int i2 = 0; i2 < this.f5596Z.size(); i2++) {
            this.f5596Z.get(i2);
        }
        m4316i();
    }

    /* renamed from: h */
    private void m4315h(int i) {
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f5588Q != z) {
            this.f5588Q = z;
            if (this.f5585N == null || this.f5590S == null) {
                return;
            }
            if (this.f5590S.isRunning()) {
                this.f5590S.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.f5590S.setFloatValues(1.0f - f, f);
            this.f5590S.start();
        }
    }

    /* renamed from: e */
    private int m4307e() {
        if (this.f5582K) {
            return Math.max(this.f5583L, this.f5613k - ((this.f5612j * 9) / 16));
        }
        return this.f5581J;
    }

    /* renamed from: f */
    private void m4309f() {
        int m4307e = m4307e();
        if (this.f5578G) {
            this.f5607e = Math.max(this.f5613k - m4307e, this.f5604b);
        } else {
            this.f5607e = this.f5613k - m4307e;
        }
    }

    /* renamed from: g */
    private void m4312g() {
        this.f5605c = (int) (this.f5613k * (1.0f - this.f5606d));
    }

    /* renamed from: h */
    private void m4314h() {
        this.f5616n = -1;
        if (this.f5598aa != null) {
            this.f5598aa.recycle();
            this.f5598aa = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m4323a(View view, float f) {
        if (this.f5591U) {
            return true;
        }
        if (view.getTop() < this.f5607e) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f5607e)) / ((float) m4307e()) > 0.5f;
    }

    /* renamed from: a */
    final View m4317a(View view) {
        if (C0538w.m1817A(view) && view.getVisibility() == 0) {
            return view;
        }
        if (!(view instanceof ViewGroup) || view.getVisibility() != 0) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View m4317a = m4317a(viewGroup.getChildAt(i));
            if (m4317a != null) {
                return m4317a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m4301a(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f5584M) {
            this.f5587P = C2303p.m7300a(context, attributeSet, R.attr.bottomSheetStyle, f5576T).m7327a();
            this.f5585N = new C2295h(this.f5587P);
            this.f5585N.m7276a(context);
            if (z && colorStateList != null) {
                this.f5585N.m7282g(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.f5585N.setTint(typedValue.data);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4320a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f5607e;
        } else if (i == 6) {
            int i3 = this.f5605c;
            if (!this.f5578G || i3 > this.f5604b) {
                i2 = i3;
            } else {
                i2 = this.f5604b;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo4324b();
        } else if (this.f5609g && i == 5) {
            i2 = this.f5613k;
        } else {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
        }
        m4321a(view, i, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4321a(View view, int i, int i2, boolean z) {
        boolean m2127a;
        if (z) {
            m2127a = this.f5611i.m2125a(view.getLeft(), i2);
        } else {
            m2127a = this.f5611i.m2127a(view, view.getLeft(), i2);
        }
        if (m2127a) {
            m4331d(2);
            m4315h(i);
            if (this.f5589R == null) {
                this.f5589R = new RunnableC1323f(view, i);
            }
            if (!((RunnableC1323f) this.f5589R).f5682d) {
                this.f5589R.f5679a = i;
                C0538w.m1852a(view, (Runnable) this.f5589R);
                RunnableC1323f.m4360b(this.f5589R);
                return;
            }
            this.f5589R.f5679a = i;
            return;
        }
        m4331d(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m4330d() {
        if (this.f5614l.get() == null || this.f5596Z.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.f5596Z.size(); i++) {
            this.f5596Z.get(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ColorBottomSheetBehavior.java */
    /* renamed from: com.color.support.dialog.panel.f */
    /* loaded from: classes.dex */
    public final class RunnableC1323f implements Runnable {

        /* renamed from: a */
        int f5679a;

        /* renamed from: c */
        private final View f5681c;

        /* renamed from: d */
        private boolean f5682d;

        /* renamed from: b */
        static /* synthetic */ boolean m4360b(RunnableC1323f runnableC1323f) {
            runnableC1323f.f5682d = true;
            return true;
        }

        RunnableC1323f(View view, int i) {
            this.f5681c = view;
            this.f5679a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ColorBottomSheetBehavior.this.f5611i != null && ColorBottomSheetBehavior.this.f5611i.m2136g()) {
                C0538w.m1852a(this.f5681c, this);
            } else {
                ColorBottomSheetBehavior.this.m4331d(this.f5679a);
            }
            this.f5682d = false;
        }
    }

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1322e();

        /* renamed from: a */
        final int f5619a;

        /* renamed from: b */
        int f5620b;

        /* renamed from: d */
        boolean f5621d;

        /* renamed from: e */
        boolean f5622e;

        /* renamed from: f */
        boolean f5623f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5619a = parcel.readInt();
            this.f5620b = parcel.readInt();
            this.f5621d = parcel.readInt() == 1;
            this.f5622e = parcel.readInt() == 1;
            this.f5623f = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, ColorBottomSheetBehavior<?> colorBottomSheetBehavior) {
            super(parcelable);
            this.f5619a = colorBottomSheetBehavior.f5610h;
            this.f5620b = ((ColorBottomSheetBehavior) colorBottomSheetBehavior).f5581J;
            this.f5621d = ((ColorBottomSheetBehavior) colorBottomSheetBehavior).f5578G;
            this.f5622e = colorBottomSheetBehavior.f5609g;
            this.f5623f = ((ColorBottomSheetBehavior) colorBottomSheetBehavior).f5591U;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5619a);
            parcel.writeInt(this.f5620b);
            parcel.writeInt(this.f5621d ? 1 : 0);
            parcel.writeInt(this.f5622e ? 1 : 0);
            parcel.writeInt(this.f5623f ? 1 : 0);
        }
    }

    /* renamed from: f */
    private void m4311f(boolean z) {
        if (this.f5614l == null) {
            return;
        }
        ViewParent parent = this.f5614l.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.f5601ad != null) {
                    return;
                } else {
                    this.f5601ad = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f5614l.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f5601ad.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f5579H) {
                            C0538w.m1840a(childAt, 4);
                        }
                    } else if (this.f5579H && this.f5601ad != null && this.f5601ad.containsKey(childAt)) {
                        C0538w.m1840a(childAt, this.f5601ad.get(childAt).intValue());
                    }
                }
            }
            if (z) {
                return;
            }
            this.f5601ad = null;
        }
    }

    /* renamed from: i */
    private void m4316i() {
        V v;
        if (this.f5614l == null || (v = this.f5614l.get()) == null) {
            return;
        }
        C0538w.m1862b((View) v, 524288);
        C0538w.m1862b((View) v, 262144);
        C0538w.m1862b((View) v, 1048576);
        if (this.f5609g && this.f5610h != 5) {
            m4302a((ColorBottomSheetBehavior<V>) v, C0483d.f2319u, 5);
        }
        int i = this.f5610h;
        if (i != 6) {
            switch (i) {
                case 3:
                    m4302a((ColorBottomSheetBehavior<V>) v, C0483d.f2318t, this.f5578G ? 4 : 6);
                    return;
                case 4:
                    m4302a((ColorBottomSheetBehavior<V>) v, C0483d.f2317s, this.f5578G ? 3 : 6);
                    return;
                default:
                    return;
            }
        }
        m4302a((ColorBottomSheetBehavior<V>) v, C0483d.f2318t, 4);
        m4302a((ColorBottomSheetBehavior<V>) v, C0483d.f2317s, 3);
    }

    /* renamed from: a */
    private void m4302a(V v, C0483d c0483d, int i) {
        C0538w.m1848a(v, c0483d, new C1321d(this, i));
    }
}
