package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.p023f.C0478i;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2303p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalendarItemStyle.java */
/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
public final class C2155c {

    /* renamed from: a */
    private final Rect f9595a;

    /* renamed from: b */
    private final ColorStateList f9596b;

    /* renamed from: c */
    private final ColorStateList f9597c;

    /* renamed from: d */
    private final ColorStateList f9598d;

    /* renamed from: e */
    private final int f9599e;

    /* renamed from: f */
    private final C2303p f9600f;

    private C2155c(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C2303p c2303p, Rect rect) {
        C0478i.m1619a(rect.left);
        C0478i.m1619a(rect.top);
        C0478i.m1619a(rect.right);
        C0478i.m1619a(rect.bottom);
        this.f9595a = rect;
        this.f9596b = colorStateList2;
        this.f9597c = colorStateList;
        this.f9598d = colorStateList3;
        this.f9599e = i;
        this.f9600f = c2303p;
    }

    /* renamed from: a */
    public static C2155c m6867a(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.MaterialCalendarItem);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetBottom, 0));
            ColorStateList m7045a = C2221d.m7045a(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemFillColor);
            ColorStateList m7045a2 = C2221d.m7045a(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemTextColor);
            ColorStateList m7045a3 = C2221d.m7045a(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemStrokeColor);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
            C2303p m7327a = C2303p.m7298a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m7327a();
            obtainStyledAttributes.recycle();
            return new C2155c(m7045a, m7045a2, m7045a3, dimensionPixelSize, m7327a, rect);
        }
        throw new IllegalArgumentException(String.valueOf("Cannot create a CalendarItemStyle with a styleResId of 0"));
    }

    /* renamed from: a */
    public final void m6869a(TextView textView) {
        C2295h c2295h = new C2295h();
        C2295h c2295h2 = new C2295h();
        c2295h.setShapeAppearanceModel(this.f9600f);
        c2295h2.setShapeAppearanceModel(this.f9600f);
        c2295h.m7282g(this.f9597c);
        c2295h.m7274a(this.f9599e, this.f9598d);
        textView.setTextColor(this.f9596b);
        C0538w.m1846a(textView, new InsetDrawable(Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f9596b.withAlpha(30), c2295h, c2295h2) : c2295h, this.f9595a.left, this.f9595a.top, this.f9595a.right, this.f9595a.bottom));
    }

    /* renamed from: a */
    public final int m6868a() {
        return this.f9595a.top;
    }

    /* renamed from: b */
    public final int m6870b() {
        return this.f9595a.bottom;
    }
}
