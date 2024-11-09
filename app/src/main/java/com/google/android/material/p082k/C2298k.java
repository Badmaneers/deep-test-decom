package com.google.android.material.p082k;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.p076e.C2179a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialShapeDrawable.java */
/* renamed from: com.google.android.material.k.k */
/* loaded from: classes.dex */
public final class C2298k extends Drawable.ConstantState {

    /* renamed from: a */
    public C2303p f10091a;

    /* renamed from: b */
    public C2179a f10092b;

    /* renamed from: c */
    public ColorFilter f10093c;

    /* renamed from: d */
    public ColorStateList f10094d;

    /* renamed from: e */
    public ColorStateList f10095e;

    /* renamed from: f */
    public ColorStateList f10096f;

    /* renamed from: g */
    public ColorStateList f10097g;

    /* renamed from: h */
    public PorterDuff.Mode f10098h;

    /* renamed from: i */
    public Rect f10099i;

    /* renamed from: j */
    public float f10100j;

    /* renamed from: k */
    public float f10101k;

    /* renamed from: l */
    public float f10102l;

    /* renamed from: m */
    public int f10103m;

    /* renamed from: n */
    public float f10104n;

    /* renamed from: o */
    public float f10105o;

    /* renamed from: p */
    public float f10106p;

    /* renamed from: q */
    public int f10107q;

    /* renamed from: r */
    public int f10108r;

    /* renamed from: s */
    public int f10109s;

    /* renamed from: t */
    public int f10110t;

    /* renamed from: u */
    public boolean f10111u;

    /* renamed from: v */
    public Paint.Style f10112v;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public C2298k(C2303p c2303p) {
        this.f10094d = null;
        this.f10095e = null;
        this.f10096f = null;
        this.f10097g = null;
        this.f10098h = PorterDuff.Mode.SRC_IN;
        this.f10099i = null;
        this.f10100j = 1.0f;
        this.f10101k = 1.0f;
        this.f10103m = 255;
        this.f10104n = 0.0f;
        this.f10105o = 0.0f;
        this.f10106p = 0.0f;
        this.f10107q = 0;
        this.f10108r = 0;
        this.f10109s = 0;
        this.f10110t = 0;
        this.f10111u = false;
        this.f10112v = Paint.Style.FILL_AND_STROKE;
        this.f10091a = c2303p;
        this.f10092b = null;
    }

    public C2298k(C2298k c2298k) {
        this.f10094d = null;
        this.f10095e = null;
        this.f10096f = null;
        this.f10097g = null;
        this.f10098h = PorterDuff.Mode.SRC_IN;
        this.f10099i = null;
        this.f10100j = 1.0f;
        this.f10101k = 1.0f;
        this.f10103m = 255;
        this.f10104n = 0.0f;
        this.f10105o = 0.0f;
        this.f10106p = 0.0f;
        this.f10107q = 0;
        this.f10108r = 0;
        this.f10109s = 0;
        this.f10110t = 0;
        this.f10111u = false;
        this.f10112v = Paint.Style.FILL_AND_STROKE;
        this.f10091a = c2298k.f10091a;
        this.f10092b = c2298k.f10092b;
        this.f10102l = c2298k.f10102l;
        this.f10093c = c2298k.f10093c;
        this.f10094d = c2298k.f10094d;
        this.f10095e = c2298k.f10095e;
        this.f10098h = c2298k.f10098h;
        this.f10097g = c2298k.f10097g;
        this.f10103m = c2298k.f10103m;
        this.f10100j = c2298k.f10100j;
        this.f10109s = c2298k.f10109s;
        this.f10107q = c2298k.f10107q;
        this.f10111u = c2298k.f10111u;
        this.f10101k = c2298k.f10101k;
        this.f10104n = c2298k.f10104n;
        this.f10105o = c2298k.f10105o;
        this.f10106p = c2298k.f10106p;
        this.f10108r = c2298k.f10108r;
        this.f10110t = c2298k.f10110t;
        this.f10096f = c2298k.f10096f;
        this.f10112v = c2298k.f10112v;
        if (c2298k.f10099i != null) {
            this.f10099i = new Rect(c2298k.f10099i);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C2295h c2295h = new C2295h(this, (byte) 0);
        C2295h.m7253d(c2295h);
        return c2295h;
    }
}
