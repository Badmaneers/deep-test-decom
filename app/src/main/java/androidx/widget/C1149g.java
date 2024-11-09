package androidx.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: ColorDrawerLayout.java */
/* renamed from: androidx.widget.g */
/* loaded from: classes.dex */
public final class C1149g extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f4641a;

    /* renamed from: b */
    float f4642b;

    /* renamed from: c */
    boolean f4643c;

    /* renamed from: d */
    int f4644d;

    public C1149g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4641a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ColorDrawerLayout.f4569a);
        this.f4641a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C1149g() {
        super(-1, -1);
        this.f4641a = 0;
    }

    public C1149g(C1149g c1149g) {
        super((ViewGroup.MarginLayoutParams) c1149g);
        this.f4641a = 0;
        this.f4641a = c1149g.f4641a;
    }

    public C1149g(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4641a = 0;
    }

    public C1149g(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4641a = 0;
    }
}
