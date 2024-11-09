package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: SlidingPaneLayout.java */
/* renamed from: androidx.slidingpanelayout.widget.d */
/* loaded from: classes.dex */
public final class C0978d extends ViewGroup.MarginLayoutParams {

    /* renamed from: e */
    private static final int[] f3982e = {R.attr.layout_weight};

    /* renamed from: a */
    public float f3983a;

    /* renamed from: b */
    boolean f3984b;

    /* renamed from: c */
    boolean f3985c;

    /* renamed from: d */
    Paint f3986d;

    public C0978d() {
        super(-1, -1);
        this.f3983a = 0.0f;
    }

    public C0978d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3983a = 0.0f;
    }

    public C0978d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3983a = 0.0f;
    }

    public C0978d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3983a = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3982e);
        this.f3983a = obtainStyledAttributes.getFloat(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
