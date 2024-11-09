package com.color.support.widget;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import color.support.p043v7.appcompat.R;
import java.util.ArrayList;

/* compiled from: SecurityKeyboard.java */
/* renamed from: com.color.support.widget.ge */
/* loaded from: classes.dex */
public final class C1547ge {

    /* renamed from: a */
    public int f7342a;

    /* renamed from: b */
    public int f7343b;

    /* renamed from: c */
    public int f7344c;

    /* renamed from: d */
    public int f7345d;

    /* renamed from: e */
    ArrayList<C1546gd> f7346e = new ArrayList<>();

    /* renamed from: f */
    public int f7347f;

    /* renamed from: g */
    public int f7348g;

    /* renamed from: h */
    private C1545gc f7349h;

    public C1547ge(C1545gc c1545gc) {
        this.f7349h = c1545gc;
    }

    public C1547ge(Resources resources, C1545gc c1545gc, XmlResourceParser xmlResourceParser) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.f7349h = c1545gc;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.SecurityKeyboard);
        int i9 = R.styleable.SecurityKeyboard_colorKeyWidth;
        i = c1545gc.f7307l;
        i2 = c1545gc.f7297b;
        this.f7342a = C1545gc.m5159a(obtainAttributes, i9, i, i2);
        int i10 = R.styleable.SecurityKeyboard_colorKeyHeight;
        i3 = c1545gc.f7308m;
        i4 = c1545gc.f7298c;
        this.f7343b = C1545gc.m5159a(obtainAttributes, i10, i3, i4);
        int i11 = R.styleable.SecurityKeyboard_colorHorizontalGap;
        i5 = c1545gc.f7307l;
        i6 = c1545gc.f7296a;
        this.f7344c = C1545gc.m5159a(obtainAttributes, i11, i5, i6);
        int i12 = R.styleable.SecurityKeyboard_colorVerticalGap;
        i7 = c1545gc.f7308m;
        i8 = c1545gc.f7299d;
        this.f7345d = C1545gc.m5159a(obtainAttributes, i12, i7, i8);
        obtainAttributes.recycle();
        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.SecurityKeyboard_Row);
        this.f7347f = obtainAttributes2.getInt(R.styleable.SecurityKeyboard_Row_colorRowEdgeFlags, 0);
        this.f7348g = obtainAttributes2.getResourceId(R.styleable.SecurityKeyboard_Row_colorKeyboardMode, 0);
    }
}
