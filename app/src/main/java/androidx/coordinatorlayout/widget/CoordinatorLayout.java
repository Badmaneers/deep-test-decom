package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.R;
import androidx.core.content.C0420a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p023f.C0472c;
import androidx.core.p023f.C0477h;
import androidx.core.p023f.InterfaceC0475f;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0521f;
import androidx.core.p024g.C0533r;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0531p;
import androidx.core.p024g.InterfaceC0532q;
import androidx.core.p024g.InterfaceC0534s;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0531p, InterfaceC0532q {

    /* renamed from: a */
    static final String f2053a;

    /* renamed from: b */
    static final Class<?>[] f2054b;

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<AbstractC0391c>>> f2055c;

    /* renamed from: d */
    static final Comparator<View> f2056d;

    /* renamed from: f */
    private static final InterfaceC0475f<Rect> f2057f;

    /* renamed from: e */
    ViewGroup.OnHierarchyChangeListener f2058e;

    /* renamed from: g */
    private final List<View> f2059g;

    /* renamed from: h */
    private final C0398j<View> f2060h;

    /* renamed from: i */
    private final List<View> f2061i;

    /* renamed from: j */
    private final List<View> f2062j;

    /* renamed from: k */
    private final int[] f2063k;

    /* renamed from: l */
    private final int[] f2064l;

    /* renamed from: m */
    private boolean f2065m;

    /* renamed from: n */
    private boolean f2066n;

    /* renamed from: o */
    private int[] f2067o;

    /* renamed from: p */
    private View f2068p;

    /* renamed from: q */
    private View f2069q;

    /* renamed from: r */
    private ViewTreeObserverOnPreDrawListenerC0395g f2070r;

    /* renamed from: s */
    private boolean f2071s;

    /* renamed from: t */
    private C0514ao f2072t;

    /* renamed from: u */
    private boolean f2073u;

    /* renamed from: v */
    private Drawable f2074v;

    /* renamed from: w */
    private InterfaceC0534s f2075w;

    /* renamed from: x */
    private final C0533r f2076x;

    /* renamed from: c */
    private static int m1391c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m1394d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private static int m1397e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f2053a = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f2056d = new C0397i();
        } else {
            f2056d = null;
        }
        f2054b = new Class[]{Context.class, AttributeSet.class};
        f2055c = new ThreadLocal<>();
        f2057f = new C0477h(12);
    }

    /* renamed from: a */
    private static Rect m1381a() {
        Rect mo1617a = f2057f.mo1617a();
        return mo1617a == null ? new Rect() : mo1617a;
    }

    /* renamed from: a */
    private static void m1384a(Rect rect) {
        rect.setEmpty();
        f2057f.mo1618a(rect);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.f2059g = new ArrayList();
        this.f2060h = new C0398j<>();
        this.f2061i = new ArrayList();
        this.f2062j = new ArrayList();
        this.f2063k = new int[2];
        this.f2064l = new int[2];
        this.f2076x = new C0533r();
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, R.styleable.CoordinatorLayout, attributeSet, obtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, R.styleable.CoordinatorLayout, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2067o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2067o.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f2067o[i2] = (int) (r12[i2] * f);
            }
        }
        this.f2074v = obtainStyledAttributes.getDrawable(R.styleable.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m1392c();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0393e(this));
        if (C0538w.m1876g(this) == 0) {
            C0538w.m1840a((View) this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2058e = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1387a(false);
        if (this.f2071s) {
            if (this.f2070r == null) {
                this.f2070r = new ViewTreeObserverOnPreDrawListenerC0395g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2070r);
        }
        if (this.f2072t == null && C0538w.m1893v(this)) {
            C0538w.m1892u(this);
        }
        this.f2066n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1387a(false);
        if (this.f2071s && this.f2070r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2070r);
        }
        if (this.f2069q != null) {
            onStopNestedScroll(this.f2069q);
        }
        this.f2066n = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        if (this.f2074v != drawable) {
            if (this.f2074v != null) {
                this.f2074v.setCallback(null);
            }
            this.f2074v = drawable != null ? drawable.mutate() : null;
            if (this.f2074v != null) {
                if (this.f2074v.isStateful()) {
                    this.f2074v.setState(getDrawableState());
                }
                C0546a.m1929b(this.f2074v, C0538w.m1878h(this));
                this.f2074v.setVisible(getVisibility() == 0, false);
                this.f2074v.setCallback(this);
            }
            C0538w.m1874f(this);
        }
    }

    public Drawable getStatusBarBackground() {
        return this.f2074v;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2074v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2074v;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f2074v == null || this.f2074v.isVisible() == z) {
            return;
        }
        this.f2074v.setVisible(z, false);
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0420a.m1483a(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    /* renamed from: a */
    public final C0514ao m1398a(C0514ao c0514ao) {
        if (!C0472c.m1615a(this.f2072t, c0514ao)) {
            this.f2072t = c0514ao;
            this.f2073u = c0514ao != null && c0514ao.m1766b() > 0;
            setWillNotDraw(!this.f2073u && getBackground() == null);
            if (!c0514ao.m1770f()) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (C0538w.m1893v(childAt) && ((C0394f) childAt.getLayoutParams()).f2080a != null && c0514ao.m1770f()) {
                        break;
                    }
                }
            }
            requestLayout();
        }
        return c0514ao;
    }

    public final C0514ao getLastWindowInsets() {
        return this.f2072t;
    }

    /* renamed from: a */
    private void m1387a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0391c abstractC0391c = ((C0394f) childAt.getLayoutParams()).f2080a;
            if (abstractC0391c != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0391c.mo1418a(this, (CoordinatorLayout) childAt, obtain);
                } else {
                    abstractC0391c.mo1423b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0394f) getChildAt(i2).getLayoutParams()).m1434e();
        }
        this.f2068p = null;
        this.f2065m = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:            if (r7 == false) goto L85;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:            r21.f2068p = r10;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m1388a(android.view.MotionEvent r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            int r2 = r22.getActionMasked()
            java.util.List<android.view.View> r3 = r0.f2061i
            r3.clear()
            boolean r4 = r21.isChildrenDrawingOrderEnabled()
            int r5 = r21.getChildCount()
            int r6 = r5 + (-1)
        L17:
            if (r6 < 0) goto L2b
            if (r4 == 0) goto L20
            int r7 = r0.getChildDrawingOrder(r5, r6)
            goto L21
        L20:
            r7 = r6
        L21:
            android.view.View r7 = r0.getChildAt(r7)
            r3.add(r7)
            int r6 = r6 + (-1)
            goto L17
        L2b:
            java.util.Comparator<android.view.View> r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.f2056d
            if (r4 == 0) goto L34
            java.util.Comparator<android.view.View> r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.f2056d
            java.util.Collections.sort(r3, r4)
        L34:
            int r4 = r3.size()
            r5 = 0
            r6 = 0
            r7 = r5
            r8 = r7
            r9 = r6
            r6 = r8
        L3e:
            if (r6 >= r4) goto La0
            java.lang.Object r10 = r3.get(r6)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.f r11 = (androidx.coordinatorlayout.widget.C0394f) r11
            androidx.coordinatorlayout.widget.c r12 = r11.f2080a
            if (r7 != 0) goto L52
            if (r8 == 0) goto L75
        L52:
            if (r2 == 0) goto L75
            if (r12 == 0) goto L9d
            if (r9 != 0) goto L69
            long r15 = android.os.SystemClock.uptimeMillis()
            r17 = 3
            r18 = 0
            r19 = 0
            r20 = 0
            r13 = r15
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r13, r15, r17, r18, r19, r20)
        L69:
            switch(r23) {
                case 0: goto L71;
                case 1: goto L6d;
                default: goto L6c;
            }
        L6c:
            goto L9d
        L6d:
            r12.mo1423b(r0, r10, r9)
            goto L9d
        L71:
            r12.mo1418a(r0, r10, r9)
            goto L9d
        L75:
            if (r7 != 0) goto L8a
            if (r12 == 0) goto L8a
            switch(r23) {
                case 0: goto L82;
                case 1: goto L7d;
                default: goto L7c;
            }
        L7c:
            goto L86
        L7d:
            boolean r7 = r12.mo1423b(r0, r10, r1)
            goto L86
        L82:
            boolean r7 = r12.mo1418a(r0, r10, r1)
        L86:
            if (r7 == 0) goto L8a
            r0.f2068p = r10
        L8a:
            boolean r8 = r11.m1432c()
            boolean r10 = r11.m1433d()
            if (r10 == 0) goto L98
            if (r8 != 0) goto L98
            r8 = 1
            goto L99
        L98:
            r8 = r5
        L99:
            if (r10 == 0) goto L9d
            if (r8 == 0) goto La0
        L9d:
            int r6 = r6 + 1
            goto L3e
        La0:
            r3.clear()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1388a(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1387a(true);
        }
        boolean m1388a = m1388a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1387a(true);
        }
        return m1388a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:            if (r3 != false) goto L33;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2068p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m1388a(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f2068p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.f r6 = (androidx.coordinatorlayout.widget.C0394f) r6
            androidx.coordinatorlayout.widget.c r6 = r6.f2080a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f2068p
            boolean r6 = r6.mo1423b(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.f2068p
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.m1387a(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f2065m) {
            return;
        }
        m1387a(false);
        this.f2065m = true;
    }

    /* renamed from: b */
    private int m1389b(int i) {
        if (this.f2067o == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i < 0 || i >= this.f2067o.length) {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
        return this.f2067o[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static AbstractC0391c m1382a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f2053a)) {
            str = f2053a + '.' + str;
        }
        try {
            Map<String, Constructor<AbstractC0391c>> map = f2055c.get();
            if (map == null) {
                map = new HashMap<>();
                f2055c.set(map);
            }
            Constructor<AbstractC0391c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2054b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str)), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private static C0394f m1395d(View view) {
        C0394f c0394f = (C0394f) view.getLayoutParams();
        if (!c0394f.f2081b) {
            if (view instanceof InterfaceC0390b) {
                AbstractC0391c behavior = ((InterfaceC0390b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0394f.m1428a(behavior);
                c0394f.f2081b = true;
            } else {
                InterfaceC0392d interfaceC0392d = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC0392d = (InterfaceC0392d) cls.getAnnotation(InterfaceC0392d.class);
                    if (interfaceC0392d != null) {
                        break;
                    }
                }
                if (interfaceC0392d != null) {
                    try {
                        c0394f.m1428a(interfaceC0392d.m1424a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0392d.m1424a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                c0394f.f2081b = true;
            }
        }
        return c0394f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:            if (r5 != false) goto L148;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.view.ViewParent] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1390b() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1390b():void");
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: a */
    public final void m1401a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x015d, code lost:            if (r0.mo1415a(r30, (androidx.coordinatorlayout.widget.CoordinatorLayout) r20, r8, r21, r23, 0) == false) goto L151;     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* renamed from: b */
    public final void m1404b(View view, int i) {
        Rect m1381a;
        Rect m1381a2;
        C0394f c0394f = (C0394f) view.getLayoutParams();
        int i2 = 0;
        if (c0394f.f2090k == null && c0394f.f2085f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (c0394f.f2090k != null) {
            View view2 = c0394f.f2090k;
            m1381a = m1381a();
            m1381a2 = m1381a();
            try {
                C0399k.m1446a(this, view2, m1381a);
                C0394f c0394f2 = (C0394f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1383a(i, m1381a, m1381a2, c0394f2, measuredWidth, measuredHeight);
                m1386a(c0394f2, m1381a2, measuredWidth, measuredHeight);
                view.layout(m1381a2.left, m1381a2.top, m1381a2.right, m1381a2.bottom);
                return;
            } finally {
                m1384a(m1381a);
                m1384a(m1381a2);
            }
        }
        if (c0394f.f2084e >= 0) {
            int i3 = c0394f.f2084e;
            C0394f c0394f3 = (C0394f) view.getLayoutParams();
            int m1777a = C0521f.m1777a(m1394d(c0394f3.f2082c), i);
            int i4 = m1777a & 7;
            int i5 = m1777a & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            int m1389b = m1389b(i3) - measuredWidth2;
            if (i4 == 1) {
                m1389b += measuredWidth2 / 2;
            } else if (i4 == 5) {
                m1389b += measuredWidth2;
            }
            if (i5 == 16) {
                i2 = 0 + (measuredHeight2 / 2);
            } else if (i5 == 80) {
                i2 = measuredHeight2 + 0;
            }
            int max = Math.max(getPaddingLeft() + c0394f3.leftMargin, Math.min(m1389b, ((width - getPaddingRight()) - measuredWidth2) - c0394f3.rightMargin));
            int max2 = Math.max(getPaddingTop() + c0394f3.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - c0394f3.bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        C0394f c0394f4 = (C0394f) view.getLayoutParams();
        m1381a = m1381a();
        m1381a.set(getPaddingLeft() + c0394f4.leftMargin, getPaddingTop() + c0394f4.topMargin, (getWidth() - getPaddingRight()) - c0394f4.rightMargin, (getHeight() - getPaddingBottom()) - c0394f4.bottomMargin);
        if (this.f2072t != null && C0538w.m1893v(this) && !C0538w.m1893v(view)) {
            m1381a.left += this.f2072t.m1764a();
            m1381a.top += this.f2072t.m1766b();
            m1381a.right -= this.f2072t.m1767c();
            m1381a.bottom -= this.f2072t.m1768d();
        }
        m1381a2 = m1381a();
        C0521f.m1778a(m1391c(c0394f4.f2082c), view.getMeasuredWidth(), view.getMeasuredHeight(), m1381a, m1381a2, i);
        view.layout(m1381a2.left, m1381a2.top, m1381a2.right, m1381a2.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0391c abstractC0391c;
        int m1878h = C0538w.m1878h(this);
        int size = this.f2059g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2059g.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0391c = ((C0394f) view.getLayoutParams()).f2080a) == null || !abstractC0391c.mo1414a(this, (CoordinatorLayout) view, m1878h))) {
                m1404b(view, m1878h);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2073u || this.f2074v == null) {
            return;
        }
        int m1766b = this.f2072t != null ? this.f2072t.m1766b() : 0;
        if (m1766b > 0) {
            this.f2074v.setBounds(0, 0, getWidth(), m1766b);
            this.f2074v.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1392c();
    }

    /* renamed from: a */
    private void m1385a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (!z) {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            C0399k.m1446a(this, view, rect);
        }
    }

    /* renamed from: a */
    private static void m1383a(int i, Rect rect, Rect rect2, C0394f c0394f, int i2, int i3) {
        int width;
        int height;
        int m1777a = C0521f.m1777a(m1397e(c0394f.f2082c), i);
        int m1777a2 = C0521f.m1777a(m1391c(c0394f.f2083d), i);
        int i4 = m1777a & 7;
        int i5 = m1777a & 112;
        int i6 = m1777a2 & 7;
        int i7 = m1777a2 & 112;
        if (i6 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i6 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i7 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i7 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: a */
    private void m1386a(C0394f c0394f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + c0394f.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - c0394f.rightMargin));
        int max2 = Math.max(getPaddingTop() + c0394f.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - c0394f.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: a */
    public final void m1399a(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int height;
        int i5;
        int i6;
        C0394f c0394f;
        int i7;
        Rect rect2;
        int i8;
        C0394f c0394f2;
        int i9;
        AbstractC0391c abstractC0391c;
        int m1878h = C0538w.m1878h(this);
        int size = this.f2059g.size();
        Rect m1381a = m1381a();
        Rect m1381a2 = m1381a();
        Rect m1381a3 = m1381a();
        int i10 = 0;
        while (i10 < size) {
            View view = this.f2059g.get(i10);
            C0394f c0394f3 = (C0394f) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = m1381a3;
                i2 = i10;
            } else {
                int i11 = 0;
                while (i11 < i10) {
                    if (c0394f3.f2091l == this.f2059g.get(i11)) {
                        C0394f c0394f4 = (C0394f) view.getLayoutParams();
                        if (c0394f4.f2090k != null) {
                            Rect m1381a4 = m1381a();
                            Rect m1381a5 = m1381a();
                            Rect m1381a6 = m1381a();
                            C0399k.m1446a(this, c0394f4.f2090k, m1381a4);
                            m1385a(view, false, m1381a5);
                            int measuredWidth = view.getMeasuredWidth();
                            i7 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i8 = i10;
                            rect2 = m1381a3;
                            boolean z4 = true;
                            i6 = i11;
                            c0394f = c0394f3;
                            m1383a(m1878h, m1381a4, m1381a6, c0394f4, measuredWidth, measuredHeight);
                            if (m1381a6.left == m1381a5.left && m1381a6.top == m1381a5.top) {
                                c0394f2 = c0394f4;
                                i9 = measuredWidth;
                                z4 = false;
                            } else {
                                c0394f2 = c0394f4;
                                i9 = measuredWidth;
                            }
                            m1386a(c0394f2, m1381a6, i9, measuredHeight);
                            int i12 = m1381a6.left - m1381a5.left;
                            int i13 = m1381a6.top - m1381a5.top;
                            if (i12 != 0) {
                                C0538w.m1871d(view, i12);
                            }
                            if (i13 != 0) {
                                C0538w.m1869c(view, i13);
                            }
                            if (z4 && (abstractC0391c = c0394f2.f2080a) != null) {
                                abstractC0391c.mo1419a(this, (CoordinatorLayout) view, c0394f2.f2090k);
                            }
                            m1384a(m1381a4);
                            m1384a(m1381a5);
                            m1384a(m1381a6);
                            i11 = i6 + 1;
                            size = i7;
                            i10 = i8;
                            m1381a3 = rect2;
                            c0394f3 = c0394f;
                        }
                    }
                    i6 = i11;
                    c0394f = c0394f3;
                    i7 = size;
                    rect2 = m1381a3;
                    i8 = i10;
                    i11 = i6 + 1;
                    size = i7;
                    i10 = i8;
                    m1381a3 = rect2;
                    c0394f3 = c0394f;
                }
                C0394f c0394f5 = c0394f3;
                int i14 = size;
                Rect rect3 = m1381a3;
                i2 = i10;
                m1385a(view, true, m1381a2);
                if (c0394f5.f2086g != 0 && !m1381a2.isEmpty()) {
                    int m1777a = C0521f.m1777a(c0394f5.f2086g, m1878h);
                    int i15 = m1777a & 112;
                    if (i15 == 48) {
                        m1381a.top = Math.max(m1381a.top, m1381a2.bottom);
                    } else if (i15 == 80) {
                        m1381a.bottom = Math.max(m1381a.bottom, getHeight() - m1381a2.top);
                    }
                    int i16 = m1777a & 7;
                    if (i16 == 3) {
                        m1381a.left = Math.max(m1381a.left, m1381a2.right);
                    } else if (i16 == 5) {
                        m1381a.right = Math.max(m1381a.right, getWidth() - m1381a2.left);
                    }
                }
                if (c0394f5.f2087h != 0 && view.getVisibility() == 0 && C0538w.m1819C(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    C0394f c0394f6 = (C0394f) view.getLayoutParams();
                    AbstractC0391c abstractC0391c2 = c0394f6.f2080a;
                    Rect m1381a7 = m1381a();
                    Rect m1381a8 = m1381a();
                    m1381a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (abstractC0391c2 != null && abstractC0391c2.mo1416a(this, (CoordinatorLayout) view, m1381a7)) {
                        if (!m1381a8.contains(m1381a7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m1381a7.toShortString() + " | Bounds:" + m1381a8.toShortString());
                        }
                    } else {
                        m1381a7.set(m1381a8);
                    }
                    m1384a(m1381a8);
                    if (!m1381a7.isEmpty()) {
                        int m1777a2 = C0521f.m1777a(c0394f6.f2087h, m1878h);
                        if ((m1777a2 & 48) != 48 || (i5 = (m1381a7.top - c0394f6.topMargin) - c0394f6.f2089j) >= m1381a.top) {
                            z2 = false;
                        } else {
                            m1396d(view, m1381a.top - i5);
                            z2 = true;
                        }
                        if ((m1777a2 & 80) == 80 && (height = ((getHeight() - m1381a7.bottom) - c0394f6.bottomMargin) + c0394f6.f2089j) < m1381a.bottom) {
                            m1396d(view, height - m1381a.bottom);
                            z2 = true;
                        }
                        if (!z2) {
                            m1396d(view, 0);
                        }
                        if ((m1777a2 & 3) != 3 || (i4 = (m1381a7.left - c0394f6.leftMargin) - c0394f6.f2088i) >= m1381a.left) {
                            z3 = false;
                        } else {
                            m1393c(view, m1381a.left - i4);
                            z3 = true;
                        }
                        if ((m1777a2 & 5) == 5 && (width = ((getWidth() - m1381a7.right) - c0394f6.rightMargin) + c0394f6.f2088i) < m1381a.right) {
                            m1393c(view, width - m1381a.right);
                            z3 = true;
                        }
                        if (!z3) {
                            m1393c(view, 0);
                            m1384a(m1381a7);
                        }
                    }
                    m1384a(m1381a7);
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((C0394f) view.getLayoutParams()).f2092m);
                    if (rect.equals(m1381a2)) {
                        i3 = i14;
                    } else {
                        ((C0394f) view.getLayoutParams()).f2092m.set(m1381a2);
                    }
                } else {
                    rect = rect3;
                }
                i3 = i14;
                for (int i17 = i2 + 1; i17 < i3; i17++) {
                    View view2 = this.f2059g.get(i17);
                    C0394f c0394f7 = (C0394f) view2.getLayoutParams();
                    AbstractC0391c abstractC0391c3 = c0394f7.f2080a;
                    if (abstractC0391c3 != null && abstractC0391c3.mo1413a((AbstractC0391c) view2, view)) {
                        if (i == 0 && c0394f7.m1435f()) {
                            c0394f7.m1436g();
                        } else {
                            if (i == 2) {
                                abstractC0391c3.mo1407a(this, view);
                                z = true;
                            } else {
                                z = abstractC0391c3.mo1419a(this, (CoordinatorLayout) view2, view);
                            }
                            if (i == 1) {
                                c0394f7.m1429a(z);
                            }
                        }
                    }
                }
            }
            i10 = i2 + 1;
            size = i3;
            m1381a3 = rect;
        }
        m1384a(m1381a);
        m1384a(m1381a2);
        m1384a(m1381a3);
    }

    /* renamed from: c */
    private static void m1393c(View view, int i) {
        C0394f c0394f = (C0394f) view.getLayoutParams();
        if (c0394f.f2088i != i) {
            C0538w.m1871d(view, i - c0394f.f2088i);
            c0394f.f2088i = i;
        }
    }

    /* renamed from: d */
    private static void m1396d(View view, int i) {
        C0394f c0394f = (C0394f) view.getLayoutParams();
        if (c0394f.f2089j != i) {
            C0538w.m1869c(view, i - c0394f.f2089j);
            c0394f.f2089j = i;
        }
    }

    /* renamed from: a */
    public final void m1400a(View view) {
        List m1443c = this.f2060h.m1443c(view);
        if (m1443c == null || m1443c.isEmpty()) {
            return;
        }
        for (int i = 0; i < m1443c.size(); i++) {
            View view2 = (View) m1443c.get(i);
            AbstractC0391c abstractC0391c = ((C0394f) view2.getLayoutParams()).f2080a;
            if (abstractC0391c != null) {
                abstractC0391c.mo1419a(this, (CoordinatorLayout) view2, view);
            }
        }
    }

    /* renamed from: b */
    public final List<View> m1403b(View view) {
        List<View> m1444d = this.f2060h.m1444d(view);
        this.f2062j.clear();
        if (m1444d != null) {
            this.f2062j.addAll(m1444d);
        }
        return this.f2062j;
    }

    /* renamed from: c */
    public final List<View> m1405c(View view) {
        List m1443c = this.f2060h.m1443c(view);
        this.f2062j.clear();
        if (m1443c != null) {
            this.f2062j.addAll(m1443c);
        }
        return this.f2062j;
    }

    final List<View> getDependencySortedChildren() {
        m1390b();
        return Collections.unmodifiableList(this.f2059g);
    }

    /* renamed from: a */
    public final boolean m1402a(View view, int i, int i2) {
        Rect m1381a = m1381a();
        C0399k.m1446a(this, view, m1381a);
        try {
            return m1381a.contains(i, i2);
        } finally {
            m1384a(m1381a);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0394f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo527a(view, view2, i, 0);
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final boolean mo527a(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0394f c0394f = (C0394f) childAt.getLayoutParams();
                AbstractC0391c abstractC0391c = c0394f.f2080a;
                if (abstractC0391c != null) {
                    boolean mo1421a = abstractC0391c.mo1421a(this, (CoordinatorLayout) childAt, view, view2, i, i2);
                    c0394f.m1427a(i2, mo1421a);
                    z |= mo1421a;
                } else {
                    c0394f.m1427a(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo529b(view, view2, i, 0);
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: b */
    public final void mo529b(View view, View view2, int i, int i2) {
        this.f2076x.m1810a(i, i2);
        this.f2069q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onStopNestedScroll(View view) {
        mo522a(view, 0);
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final void mo522a(View view, int i) {
        this.f2076x.m1812b(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0394f c0394f = (C0394f) childAt.getLayoutParams();
            if (c0394f.m1431b(i)) {
                AbstractC0391c abstractC0391c = c0394f.f2080a;
                if (abstractC0391c != null) {
                    abstractC0391c.mo1409a(this, (CoordinatorLayout) childAt, view, i);
                }
                c0394f.m1426a(i);
                c0394f.m1436g();
            }
        }
        this.f2069q = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo523a(view, i, i2, i3, i4, 0);
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final void mo523a(View view, int i, int i2, int i3, int i4, int i5) {
        mo524a(view, i, i2, i3, i4, 0, this.f2064l);
    }

    @Override // androidx.core.p024g.InterfaceC0532q
    /* renamed from: a */
    public final void mo524a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0391c abstractC0391c;
        int min;
        boolean z;
        int min2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0394f c0394f = (C0394f) childAt.getLayoutParams();
                if (c0394f.m1431b(i5) && (abstractC0391c = c0394f.f2080a) != null) {
                    this.f2063k[0] = 0;
                    this.f2063k[1] = 0;
                    int i9 = i6;
                    abstractC0391c.mo1410a(this, childAt, view, i, i2, i3, i4, i5, this.f2063k);
                    if (i3 > 0) {
                        min = Math.max(i7, this.f2063k[0]);
                    } else {
                        min = Math.min(i7, this.f2063k[0]);
                    }
                    if (i4 > 0) {
                        z = true;
                        min2 = Math.max(i9, this.f2063k[1]);
                    } else {
                        z = true;
                        min2 = Math.min(i9, this.f2063k[1]);
                    }
                    i7 = min;
                    i6 = min2;
                    z2 = z;
                }
            }
            i6 = i6;
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i6;
        if (z2) {
            m1399a(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo525a(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.p024g.InterfaceC0531p
    /* renamed from: a */
    public final void mo525a(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0391c abstractC0391c;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0394f c0394f = (C0394f) childAt.getLayoutParams();
                if (c0394f.m1431b(i3) && (abstractC0391c = c0394f.f2080a) != null) {
                    this.f2063k[0] = 0;
                    this.f2063k[1] = 0;
                    abstractC0391c.mo1411a(this, childAt, view, i, i2, this.f2063k, i3);
                    if (i > 0) {
                        min = Math.max(i4, this.f2063k[0]);
                    } else {
                        min = Math.min(i4, this.f2063k[0]);
                    }
                    if (i2 > 0) {
                        min2 = Math.max(i5, this.f2063k[1]);
                    } else {
                        min2 = Math.min(i5, this.f2063k[1]);
                    }
                    i4 = min;
                    i5 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m1399a(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.p024g.InterfaceC0530o
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0391c abstractC0391c;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0394f c0394f = (C0394f) childAt.getLayoutParams();
                if (c0394f.m1431b(0) && (abstractC0391c = c0394f.f2080a) != null) {
                    z |= abstractC0391c.mo1420a(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2076x.m1808a();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        SparseArray<Parcelable> sparseArray = savedState.f2077a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0391c abstractC0391c = m1395d(childAt).f2080a;
            if (id != -1 && abstractC0391c != null && (parcelable2 = sparseArray.get(id)) != null) {
                abstractC0391c.mo1408a(this, (CoordinatorLayout) childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable mo1422b;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0391c abstractC0391c = ((C0394f) childAt.getLayoutParams()).f2080a;
            if (id != -1 && abstractC0391c != null && (mo1422b = abstractC0391c.mo1422b(this, childAt)) != null) {
                sparseArray.append(id, mo1422b);
            }
        }
        savedState.f2077a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0391c abstractC0391c = ((C0394f) view.getLayoutParams()).f2080a;
        if (abstractC0391c == null || !abstractC0391c.mo1417a(this, (CoordinatorLayout) view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* renamed from: c */
    private void m1392c() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (C0538w.m1893v(this)) {
            if (this.f2075w == null) {
                this.f2075w = new C0389a(this);
            }
            C0538w.m1850a(this, this.f2075w);
            setSystemUiVisibility(1280);
            return;
        }
        C0538w.m1850a(this, (InterfaceC0534s) null);
    }

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0396h();

        /* renamed from: a */
        SparseArray<Parcelable> f2077a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2077a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2077a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int size = this.f2077a != null ? this.f2077a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f2077a.keyAt(i2);
                parcelableArr[i2] = this.f2077a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0394f();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0394f) {
            return new C0394f((C0394f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0394f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0394f(layoutParams);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0394f(getContext(), attributeSet);
    }
}
