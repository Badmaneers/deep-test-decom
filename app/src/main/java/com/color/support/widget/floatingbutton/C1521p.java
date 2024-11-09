package com.color.support.widget.floatingbutton;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ColorFloatingButtonItem.java */
/* renamed from: com.color.support.widget.floatingbutton.p */
/* loaded from: classes.dex */
public final class C1521p {

    /* renamed from: a */
    private final int f7253a;

    /* renamed from: b */
    private final int f7254b;

    /* renamed from: c */
    private Drawable f7255c;

    /* renamed from: d */
    private String f7256d;

    /* renamed from: e */
    private int f7257e;

    /* renamed from: f */
    private ColorStateList f7258f;

    /* renamed from: g */
    private ColorStateList f7259g;

    /* renamed from: h */
    private ColorStateList f7260h;

    /* renamed from: i */
    private boolean f7261i;

    public C1521p(int i, int i2) {
        this.f7257e = RecyclerView.UNDEFINED_DURATION;
        this.f7258f = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        this.f7259g = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        this.f7260h = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        this.f7261i = false;
        this.f7253a = i;
        this.f7254b = i2;
        this.f7255c = null;
    }

    public C1521p(ColorFloatingButtonItem colorFloatingButtonItem) {
        this.f7257e = RecyclerView.UNDEFINED_DURATION;
        this.f7258f = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        this.f7259g = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        this.f7260h = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
        this.f7261i = false;
        this.f7256d = ColorFloatingButtonItem.m5111a(colorFloatingButtonItem);
        this.f7257e = ColorFloatingButtonItem.m5112b(colorFloatingButtonItem);
        this.f7254b = ColorFloatingButtonItem.m5113c(colorFloatingButtonItem);
        this.f7255c = ColorFloatingButtonItem.m5114d(colorFloatingButtonItem);
        this.f7258f = ColorFloatingButtonItem.m5115e(colorFloatingButtonItem);
        this.f7259g = ColorFloatingButtonItem.m5116f(colorFloatingButtonItem);
        this.f7260h = ColorFloatingButtonItem.m5117g(colorFloatingButtonItem);
        this.f7261i = ColorFloatingButtonItem.m5118h(colorFloatingButtonItem);
        this.f7253a = ColorFloatingButtonItem.m5119i(colorFloatingButtonItem);
    }

    /* renamed from: a */
    public final C1521p m5146a(String str) {
        this.f7256d = str;
        return this;
    }

    /* renamed from: a */
    public final C1521p m5145a(ColorStateList colorStateList) {
        this.f7258f = colorStateList;
        return this;
    }

    /* renamed from: b */
    public final C1521p m5147b(ColorStateList colorStateList) {
        this.f7259g = colorStateList;
        return this;
    }

    /* renamed from: c */
    public final C1521p m5148c(ColorStateList colorStateList) {
        this.f7260h = colorStateList;
        return this;
    }

    /* renamed from: a */
    public final ColorFloatingButtonItem m5144a() {
        return new ColorFloatingButtonItem(this, (byte) 0);
    }
}
