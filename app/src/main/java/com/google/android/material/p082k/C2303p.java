package com.google.android.material.p082k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;

/* compiled from: ShapeAppearanceModel.java */
/* renamed from: com.google.android.material.k.p */
/* loaded from: classes.dex */
public final class C2303p {

    /* renamed from: a */
    public static final InterfaceC2290c f10117a = new C2301n(0.5f);

    /* renamed from: b */
    C2291d f10118b;

    /* renamed from: c */
    C2291d f10119c;

    /* renamed from: d */
    C2291d f10120d;

    /* renamed from: e */
    C2291d f10121e;

    /* renamed from: f */
    InterfaceC2290c f10122f;

    /* renamed from: g */
    InterfaceC2290c f10123g;

    /* renamed from: h */
    InterfaceC2290c f10124h;

    /* renamed from: i */
    InterfaceC2290c f10125i;

    /* renamed from: j */
    C2293f f10126j;

    /* renamed from: k */
    C2293f f10127k;

    /* renamed from: l */
    C2293f f10128l;

    /* renamed from: m */
    C2293f f10129m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2303p(C2304q c2304q, byte b) {
        this(c2304q);
    }

    /* renamed from: a */
    public static C2304q m7297a() {
        return new C2304q();
    }

    /* renamed from: a */
    public static C2304q m7301a(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC2290c interfaceC2290c) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m7299a(context, resourceId, resourceId2, interfaceC2290c);
    }

    /* renamed from: a */
    private static C2304q m7299a(Context context, int i, int i2, InterfaceC2290c interfaceC2290c) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
            InterfaceC2290c m7296a = m7296a(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, interfaceC2290c);
            InterfaceC2290c m7296a2 = m7296a(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, m7296a);
            InterfaceC2290c m7296a3 = m7296a(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, m7296a);
            InterfaceC2290c m7296a4 = m7296a(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, m7296a);
            return new C2304q().m7330a(C2299l.m7292a(i4)).m7333b(m7296a2).m7334b(C2299l.m7292a(i5)).m7337c(m7296a3).m7338c(C2299l.m7292a(i6)).m7340d(m7296a4).m7341d(C2299l.m7292a(i7)).m7343e(m7296a(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, m7296a));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private static InterfaceC2290c m7296a(TypedArray typedArray, int i, InterfaceC2290c interfaceC2290c) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC2290c;
        }
        if (peekValue.type == 5) {
            return new C2284a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return peekValue.type == 6 ? new C2301n(peekValue.getFraction(1.0f, 1.0f)) : interfaceC2290c;
    }

    private C2303p(C2304q c2304q) {
        this.f10118b = C2304q.m7314a(c2304q);
        this.f10119c = C2304q.m7315b(c2304q);
        this.f10120d = C2304q.m7316c(c2304q);
        this.f10121e = C2304q.m7317d(c2304q);
        this.f10122f = C2304q.m7319e(c2304q);
        this.f10123g = C2304q.m7320f(c2304q);
        this.f10124h = C2304q.m7321g(c2304q);
        this.f10125i = C2304q.m7322h(c2304q);
        this.f10126j = C2304q.m7323i(c2304q);
        this.f10127k = C2304q.m7324j(c2304q);
        this.f10128l = C2304q.m7325k(c2304q);
        this.f10129m = C2304q.m7326l(c2304q);
    }

    public C2303p() {
        this.f10118b = new C2302o();
        this.f10119c = new C2302o();
        this.f10120d = new C2302o();
        this.f10121e = new C2302o();
        this.f10122f = new C2284a(0.0f);
        this.f10123g = new C2284a(0.0f);
        this.f10124h = new C2284a(0.0f);
        this.f10125i = new C2284a(0.0f);
        this.f10126j = new C2293f();
        this.f10127k = new C2293f();
        this.f10128l = new C2293f();
        this.f10129m = new C2293f();
    }

    /* renamed from: b */
    public final C2291d m7304b() {
        return this.f10118b;
    }

    /* renamed from: c */
    public final C2291d m7305c() {
        return this.f10119c;
    }

    /* renamed from: d */
    public final C2291d m7306d() {
        return this.f10120d;
    }

    /* renamed from: e */
    public final C2291d m7307e() {
        return this.f10121e;
    }

    /* renamed from: f */
    public final InterfaceC2290c m7308f() {
        return this.f10122f;
    }

    /* renamed from: g */
    public final InterfaceC2290c m7309g() {
        return this.f10123g;
    }

    /* renamed from: h */
    public final InterfaceC2290c m7310h() {
        return this.f10124h;
    }

    /* renamed from: i */
    public final InterfaceC2290c m7311i() {
        return this.f10125i;
    }

    /* renamed from: j */
    public final C2293f m7312j() {
        return this.f10126j;
    }

    /* renamed from: k */
    public final C2304q m7313k() {
        return new C2304q(this);
    }

    /* renamed from: a */
    public final C2303p m7302a(float f) {
        return m7313k().m7332b(f).m7327a();
    }

    /* renamed from: a */
    public final boolean m7303a(RectF rectF) {
        boolean z = this.f10129m.getClass().equals(C2293f.class) && this.f10127k.getClass().equals(C2293f.class) && this.f10126j.getClass().equals(C2293f.class) && this.f10128l.getClass().equals(C2293f.class);
        float mo7225a = this.f10122f.mo7225a(rectF);
        return z && ((this.f10123g.mo7225a(rectF) > mo7225a ? 1 : (this.f10123g.mo7225a(rectF) == mo7225a ? 0 : -1)) == 0 && (this.f10125i.mo7225a(rectF) > mo7225a ? 1 : (this.f10125i.mo7225a(rectF) == mo7225a ? 0 : -1)) == 0 && (this.f10124h.mo7225a(rectF) > mo7225a ? 1 : (this.f10124h.mo7225a(rectF) == mo7225a ? 0 : -1)) == 0) && ((this.f10119c instanceof C2302o) && (this.f10118b instanceof C2302o) && (this.f10120d instanceof C2302o) && (this.f10121e instanceof C2302o));
    }

    /* renamed from: a */
    public static C2304q m7300a(Context context, AttributeSet attributeSet, int i, int i2) {
        return m7301a(context, attributeSet, i, i2, new C2284a(0.0f));
    }

    /* renamed from: a */
    public static C2304q m7298a(Context context, int i, int i2) {
        return m7299a(context, i, i2, new C2284a(0.0f));
    }
}
