package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: DrawerLayout.java */
/* renamed from: androidx.drawerlayout.widget.e */
/* loaded from: classes.dex */
public final class C0604e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f2629a;

    /* renamed from: b */
    float f2630b;

    /* renamed from: c */
    boolean f2631c;

    /* renamed from: d */
    int f2632d;

    public C0604e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2629a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f2580a);
        this.f2629a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C0604e() {
        super(-1, -1);
        this.f2629a = 0;
    }

    public C0604e(C0604e c0604e) {
        super((ViewGroup.MarginLayoutParams) c0604e);
        this.f2629a = 0;
        this.f2629a = c0604e.f2629a;
    }

    public C0604e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2629a = 0;
    }

    public C0604e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2629a = 0;
    }
}
