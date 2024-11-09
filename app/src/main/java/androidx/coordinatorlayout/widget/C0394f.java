package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.R;

/* compiled from: CoordinatorLayout.java */
/* renamed from: androidx.coordinatorlayout.widget.f */
/* loaded from: classes.dex */
public final class C0394f extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    AbstractC0391c f2080a;

    /* renamed from: b */
    boolean f2081b;

    /* renamed from: c */
    public int f2082c;

    /* renamed from: d */
    public int f2083d;

    /* renamed from: e */
    public int f2084e;

    /* renamed from: f */
    int f2085f;

    /* renamed from: g */
    public int f2086g;

    /* renamed from: h */
    public int f2087h;

    /* renamed from: i */
    int f2088i;

    /* renamed from: j */
    int f2089j;

    /* renamed from: k */
    View f2090k;

    /* renamed from: l */
    View f2091l;

    /* renamed from: m */
    final Rect f2092m;

    /* renamed from: n */
    Object f2093n;

    /* renamed from: o */
    private boolean f2094o;

    /* renamed from: p */
    private boolean f2095p;

    /* renamed from: q */
    private boolean f2096q;

    /* renamed from: r */
    private boolean f2097r;

    public C0394f() {
        super(-2, -2);
        this.f2081b = false;
        this.f2082c = 0;
        this.f2083d = 0;
        this.f2084e = -1;
        this.f2085f = -1;
        this.f2086g = 0;
        this.f2087h = 0;
        this.f2092m = new Rect();
    }

    public C0394f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2081b = false;
        this.f2082c = 0;
        this.f2083d = 0;
        this.f2084e = -1;
        this.f2085f = -1;
        this.f2086g = 0;
        this.f2087h = 0;
        this.f2092m = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout_Layout);
        this.f2082c = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f2085f = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
        this.f2083d = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.f2084e = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
        this.f2086g = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.f2087h = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        this.f2081b = obtainStyledAttributes.hasValue(R.styleable.CoordinatorLayout_Layout_layout_behavior);
        if (this.f2081b) {
            this.f2080a = CoordinatorLayout.m1382a(context, attributeSet, obtainStyledAttributes.getString(R.styleable.CoordinatorLayout_Layout_layout_behavior));
        }
        obtainStyledAttributes.recycle();
        if (this.f2080a != null) {
            this.f2080a.mo1412a(this);
        }
    }

    public C0394f(C0394f c0394f) {
        super((ViewGroup.MarginLayoutParams) c0394f);
        this.f2081b = false;
        this.f2082c = 0;
        this.f2083d = 0;
        this.f2084e = -1;
        this.f2085f = -1;
        this.f2086g = 0;
        this.f2087h = 0;
        this.f2092m = new Rect();
    }

    public C0394f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2081b = false;
        this.f2082c = 0;
        this.f2083d = 0;
        this.f2084e = -1;
        this.f2085f = -1;
        this.f2086g = 0;
        this.f2087h = 0;
        this.f2092m = new Rect();
    }

    public C0394f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2081b = false;
        this.f2082c = 0;
        this.f2083d = 0;
        this.f2084e = -1;
        this.f2085f = -1;
        this.f2086g = 0;
        this.f2087h = 0;
        this.f2092m = new Rect();
    }

    /* renamed from: a */
    public final int m1425a() {
        return this.f2085f;
    }

    /* renamed from: b */
    public final AbstractC0391c m1430b() {
        return this.f2080a;
    }

    /* renamed from: a */
    public final void m1428a(AbstractC0391c abstractC0391c) {
        if (this.f2080a != abstractC0391c) {
            if (this.f2080a != null) {
                this.f2080a.mo1406a();
            }
            this.f2080a = abstractC0391c;
            this.f2093n = null;
            this.f2081b = true;
            if (abstractC0391c != null) {
                abstractC0391c.mo1412a(this);
            }
        }
    }

    /* renamed from: c */
    public final boolean m1432c() {
        if (this.f2080a == null) {
            this.f2094o = false;
        }
        return this.f2094o;
    }

    /* renamed from: d */
    public final boolean m1433d() {
        if (this.f2094o) {
            return true;
        }
        boolean z = this.f2094o | false;
        this.f2094o = z;
        return z;
    }

    /* renamed from: e */
    public final void m1434e() {
        this.f2094o = false;
    }

    /* renamed from: a */
    public final void m1426a(int i) {
        m1427a(i, false);
    }

    /* renamed from: a */
    public final void m1427a(int i, boolean z) {
        switch (i) {
            case 0:
                this.f2095p = z;
                return;
            case 1:
                this.f2096q = z;
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public final boolean m1431b(int i) {
        switch (i) {
            case 0:
                return this.f2095p;
            case 1:
                return this.f2096q;
            default:
                return false;
        }
    }

    /* renamed from: f */
    public final boolean m1435f() {
        return this.f2097r;
    }

    /* renamed from: a */
    public final void m1429a(boolean z) {
        this.f2097r = z;
    }

    /* renamed from: g */
    public final void m1436g() {
        this.f2097r = false;
    }
}
