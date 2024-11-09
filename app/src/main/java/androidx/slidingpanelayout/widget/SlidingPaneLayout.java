package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0420a;
import androidx.core.p024g.C0538w;
import androidx.customview.p027a.C0590i;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: a */
    View f3953a;

    /* renamed from: b */
    float f3954b;

    /* renamed from: c */
    int f3955c;

    /* renamed from: d */
    boolean f3956d;

    /* renamed from: e */
    final C0590i f3957e;

    /* renamed from: f */
    boolean f3958f;

    /* renamed from: g */
    final ArrayList<RunnableC0976b> f3959g;

    /* renamed from: h */
    private int f3960h;

    /* renamed from: i */
    private int f3961i;

    /* renamed from: j */
    private Drawable f3962j;

    /* renamed from: k */
    private Drawable f3963k;

    /* renamed from: l */
    private final int f3964l;

    /* renamed from: m */
    private boolean f3965m;

    /* renamed from: n */
    private float f3966n;

    /* renamed from: o */
    private int f3967o;

    /* renamed from: p */
    private float f3968p;

    /* renamed from: q */
    private float f3969q;

    /* renamed from: r */
    private InterfaceC0979e f3970r;

    /* renamed from: s */
    private boolean f3971s;

    /* renamed from: t */
    private final Rect f3972t;

    /* renamed from: u */
    private Method f3973u;

    /* renamed from: v */
    private Field f3974v;

    /* renamed from: w */
    private boolean f3975w;

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3960h = -858993460;
        this.f3971s = true;
        this.f3972t = new Rect();
        this.f3959g = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f3964l = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C0538w.m1849a(this, new C0975a(this));
        C0538w.m1840a((View) this, 1);
        this.f3957e = C0590i.m2104a(this, 0.5f, new C0977c(this));
        this.f3957e.m2122a(f * 400.0f);
    }

    public void setParallaxDistance(int i) {
        this.f3967o = i;
        requestLayout();
    }

    public int getParallaxDistance() {
        return this.f3967o;
    }

    public void setSliderFadeColor(int i) {
        this.f3960h = i;
    }

    public int getSliderFadeColor() {
        return this.f3960h;
    }

    public void setCoveredFadeColor(int i) {
        this.f3961i = i;
    }

    public int getCoveredFadeColor() {
        return this.f3961i;
    }

    public void setPanelSlideListener(InterfaceC0979e interfaceC0979e) {
        this.f3970r = interfaceC0979e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3431a(android.view.View r18) {
        /*
            r17 = this;
            r0 = r18
            boolean r1 = r17.m3433b()
            if (r1 == 0) goto L12
            int r2 = r17.getWidth()
            int r3 = r17.getPaddingRight()
            int r2 = r2 - r3
            goto L16
        L12:
            int r2 = r17.getPaddingLeft()
        L16:
            if (r1 == 0) goto L1d
            int r3 = r17.getPaddingLeft()
            goto L26
        L1d:
            int r3 = r17.getWidth()
            int r4 = r17.getPaddingRight()
            int r3 = r3 - r4
        L26:
            int r4 = r17.getPaddingTop()
            int r5 = r17.getHeight()
            int r6 = r17.getPaddingBottom()
            int r5 = r5 - r6
            if (r0 == 0) goto L65
            boolean r7 = r18.isOpaque()
            r8 = 1
            if (r7 == 0) goto L3d
            goto L52
        L3d:
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 18
            if (r7 >= r9) goto L51
            android.graphics.drawable.Drawable r7 = r18.getBackground()
            if (r7 == 0) goto L51
            int r7 = r7.getOpacity()
            r9 = -1
            if (r7 != r9) goto L51
            goto L52
        L51:
            r8 = 0
        L52:
            if (r8 == 0) goto L65
            int r7 = r18.getLeft()
            int r8 = r18.getRight()
            int r9 = r18.getTop()
            int r10 = r18.getBottom()
            goto L69
        L65:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L69:
            int r11 = r17.getChildCount()
            r12 = 0
        L6e:
            if (r12 >= r11) goto Lc6
            r13 = r17
            android.view.View r14 = r13.getChildAt(r12)
            if (r14 == r0) goto Lc6
            int r15 = r14.getVisibility()
            r6 = 8
            if (r15 == r6) goto Lbd
            if (r1 == 0) goto L84
            r6 = r3
            goto L85
        L84:
            r6 = r2
        L85:
            int r15 = r14.getLeft()
            int r6 = java.lang.Math.max(r6, r15)
            int r15 = r14.getTop()
            int r15 = java.lang.Math.max(r4, r15)
            if (r1 == 0) goto L9b
            r16 = r1
            r0 = r2
            goto L9e
        L9b:
            r16 = r1
            r0 = r3
        L9e:
            int r1 = r14.getRight()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r14.getBottom()
            int r1 = java.lang.Math.min(r5, r1)
            if (r6 < r7) goto Lb8
            if (r15 < r9) goto Lb8
            if (r0 > r8) goto Lb8
            if (r1 > r10) goto Lb8
            r6 = 4
            goto Lb9
        Lb8:
            r6 = 0
        Lb9:
            r14.setVisibility(r6)
            goto Lbf
        Lbd:
            r16 = r1
        Lbf:
            int r12 = r12 + 1
            r1 = r16
            r0 = r18
            goto L6e
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.m3431a(android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3429a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3971s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3971s = true;
        int size = this.f3959g.size();
        for (int i = 0; i < size; i++) {
            this.f3959g.get(i).run();
        }
        this.f3959g.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0200  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean m3433b = m3433b();
        if (m3433b) {
            this.f3957e.m2123a(2);
        } else {
            this.f3957e.m2123a(1);
        }
        int i9 = i3 - i;
        int paddingRight = m3433b ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = m3433b ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f3971s) {
            this.f3954b = (this.f3965m && this.f3958f) ? 1.0f : 0.0f;
        }
        int i10 = paddingRight;
        int i11 = i10;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0978d c0978d = (C0978d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c0978d.f3984b) {
                    int i13 = i9 - paddingLeft;
                    int min = (Math.min(i10, i13 - this.f3964l) - i11) - (c0978d.leftMargin + c0978d.rightMargin);
                    this.f3955c = min;
                    int i14 = m3433b ? c0978d.rightMargin : c0978d.leftMargin;
                    c0978d.f3985c = ((i11 + i14) + min) + (measuredWidth / 2) > i13;
                    int i15 = (int) (min * this.f3954b);
                    i6 = i14 + i15 + i11;
                    this.f3954b = i15 / this.f3955c;
                    i5 = 0;
                } else {
                    i5 = (!this.f3965m || this.f3967o == 0) ? 0 : (int) ((1.0f - this.f3954b) * this.f3967o);
                    i6 = i10;
                }
                if (m3433b) {
                    i8 = (i9 - i6) + i5;
                    i7 = i8 - measuredWidth;
                } else {
                    i7 = i6 - i5;
                    i8 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                i10 += childAt.getWidth();
                i11 = i6;
            }
        }
        if (this.f3971s) {
            if (this.f3965m) {
                if (this.f3967o != 0) {
                    m3427b(this.f3954b);
                }
                if (((C0978d) this.f3953a.getLayoutParams()).f3985c) {
                    m3425a(this.f3953a, this.f3954b, this.f3960h);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    m3425a(getChildAt(i16), 0.0f, this.f3960h);
                }
            }
            m3431a(this.f3953a);
        }
        this.f3971s = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f3971s = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f3965m) {
            return;
        }
        this.f3958f = view == this.f3953a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f3965m && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f3958f = !C0590i.m2115b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f3965m || (this.f3956d && actionMasked != 0)) {
            this.f3957e.m2134e();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f3957e.m2134e();
            return false;
        }
        if (actionMasked == 0) {
            this.f3956d = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f3968p = x;
            this.f3969q = y;
            if (C0590i.m2115b(this.f3953a, (int) x, (int) y) && m3434c(this.f3953a)) {
                z = true;
                return !this.f3957e.m2126a(motionEvent) || z;
            }
        } else if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float abs = Math.abs(x2 - this.f3968p);
            float abs2 = Math.abs(y2 - this.f3969q);
            if (abs > this.f3957e.m2133d() && abs2 > abs) {
                this.f3957e.m2134e();
                this.f3956d = true;
                return false;
            }
        }
        z = false;
        if (this.f3957e.m2126a(motionEvent)) {
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3965m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f3957e.m2131b(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f3968p = x;
                this.f3969q = y;
                return true;
            case 1:
                if (!m3434c(this.f3953a)) {
                    return true;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f = x2 - this.f3968p;
                float f2 = y2 - this.f3969q;
                int m2133d = this.f3957e.m2133d();
                if ((f * f) + (f2 * f2) >= m2133d * m2133d || !C0590i.m2115b(this.f3953a, (int) x2, (int) y2)) {
                    return true;
                }
                m3428c();
                return true;
            default:
                return true;
        }
    }

    /* renamed from: c */
    private boolean m3428c() {
        if (!this.f3971s && !m3426a(0.0f)) {
            return false;
        }
        this.f3958f = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3430a(int i) {
        if (this.f3953a == null) {
            this.f3954b = 0.0f;
            return;
        }
        boolean m3433b = m3433b();
        C0978d c0978d = (C0978d) this.f3953a.getLayoutParams();
        int width = this.f3953a.getWidth();
        if (m3433b) {
            i = (getWidth() - i) - width;
        }
        this.f3954b = (i - ((m3433b ? getPaddingRight() : getPaddingLeft()) + (m3433b ? c0978d.rightMargin : c0978d.leftMargin))) / this.f3955c;
        if (this.f3967o != 0) {
            m3427b(this.f3954b);
        }
        if (c0978d.f3985c) {
            m3425a(this.f3953a, this.f3954b, this.f3960h);
        }
    }

    /* renamed from: a */
    private void m3425a(View view, float f, int i) {
        C0978d c0978d = (C0978d) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (i & 16777215);
            if (c0978d.f3986d == null) {
                c0978d.f3986d = new Paint();
            }
            c0978d.f3986d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, c0978d.f3986d);
            }
            m3432b(view);
            return;
        }
        if (view.getLayerType() != 0) {
            if (c0978d.f3986d != null) {
                c0978d.f3986d.setColorFilter(null);
            }
            RunnableC0976b runnableC0976b = new RunnableC0976b(this, view);
            this.f3959g.add(runnableC0976b);
            C0538w.m1852a(this, runnableC0976b);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        C0978d c0978d = (C0978d) view.getLayoutParams();
        int save = canvas.save();
        if (this.f3965m && !c0978d.f3984b && this.f3953a != null) {
            canvas.getClipBounds(this.f3972t);
            if (m3433b()) {
                this.f3972t.left = Math.max(this.f3972t.left, this.f3953a.getRight());
            } else {
                this.f3972t.right = Math.min(this.f3972t.right, this.f3953a.getLeft());
            }
            canvas.clipRect(this.f3972t);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3432b(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            C0538w.m1843a(view, ((C0978d) view.getLayoutParams()).f3986d);
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (!this.f3975w) {
                try {
                    this.f3973u = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException e) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
                }
                try {
                    this.f3974v = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f3974v.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
                }
                this.f3975w = true;
            }
            if (this.f3973u == null || this.f3974v == null) {
                view.invalidate();
                return;
            }
            try {
                this.f3974v.setBoolean(view, true);
                this.f3973u.invoke(view, null);
            } catch (Exception e3) {
                Log.e("SlidingPaneLayout", "Error refreshing display list state", e3);
            }
        }
        C0538w.m1841a(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: a */
    private boolean m3426a(float f) {
        int paddingLeft;
        if (!this.f3965m) {
            return false;
        }
        boolean m3433b = m3433b();
        C0978d c0978d = (C0978d) this.f3953a.getLayoutParams();
        if (m3433b) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + c0978d.rightMargin) + (f * this.f3955c)) + this.f3953a.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + c0978d.leftMargin + (f * this.f3955c));
        }
        if (!this.f3957e.m2127a(this.f3953a, paddingLeft, this.f3953a.getTop())) {
            return false;
        }
        m3429a();
        C0538w.m1874f(this);
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f3957e.m2136g()) {
            if (!this.f3965m) {
                this.f3957e.m2135f();
            } else {
                C0538w.m1874f(this);
            }
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f3962j = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f3963k = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0420a.m1483a(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0420a.m1483a(getContext(), i));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        super.draw(canvas);
        if (m3433b()) {
            drawable = this.f3963k;
        } else {
            drawable = this.f3962j;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (m3433b()) {
            i2 = childAt.getRight();
            i = intrinsicWidth + i2;
        } else {
            int left = childAt.getLeft();
            int i3 = left - intrinsicWidth;
            i = left;
            i2 = i3;
        }
        drawable.setBounds(i2, top, i, bottom);
        drawable.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3427b(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.m3433b()
            android.view.View r1 = r9.f3953a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.d r1 = (androidx.slidingpanelayout.widget.C0978d) r1
            boolean r2 = r1.f3985c
            r3 = 0
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L16
            int r1 = r1.rightMargin
            goto L18
        L16:
            int r1 = r1.leftMargin
        L18:
            if (r1 > 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = r3
        L1d:
            int r2 = r9.getChildCount()
        L21:
            if (r3 >= r2) goto L5a
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f3953a
            if (r4 == r5) goto L57
            float r5 = r9.f3966n
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f3967o
            float r7 = (float) r7
            float r5 = r5 * r7
            int r5 = (int) r5
            r9.f3966n = r10
            float r7 = r6 - r10
            int r8 = r9.f3967o
            float r8 = (float) r8
            float r7 = r7 * r8
            int r7 = (int) r7
            int r5 = r5 - r7
            if (r0 == 0) goto L43
            int r5 = -r5
        L43:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L57
            if (r0 == 0) goto L4e
            float r5 = r9.f3966n
            float r5 = r5 - r6
            goto L52
        L4e:
            float r5 = r9.f3966n
            float r5 = r6 - r5
        L52:
            int r6 = r9.f3961i
            r9.m3425a(r4, r5, r6)
        L57:
            int r3 = r3 + 1
            goto L21
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.m3427b(float):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m3434c(View view) {
        if (view == null) {
            return false;
        }
        return this.f3965m && ((C0978d) view.getLayoutParams()).f3985c && this.f3954b > 0.0f;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0978d();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0978d((ViewGroup.MarginLayoutParams) layoutParams) : new C0978d(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0978d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0978d(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (!this.f3965m) {
            z = this.f3958f;
        } else {
            z = !this.f3965m || this.f3954b == 1.0f;
        }
        savedState.f3976a = z;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        if (savedState.f3976a) {
            if (this.f3971s || m3426a(1.0f)) {
                this.f3958f = true;
            }
        } else {
            m3428c();
        }
        this.f3958f = savedState.f3976a;
    }

    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0980f();

        /* renamed from: a */
        boolean f3976a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f3976a = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3976a ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m3433b() {
        return C0538w.m1878h(this) == 1;
    }
}
