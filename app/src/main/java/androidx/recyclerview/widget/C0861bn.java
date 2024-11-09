package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.bn */
/* loaded from: classes.dex */
public class C0861bn extends ViewGroup.MarginLayoutParams {

    /* renamed from: c */
    AbstractC0879ce f3550c;

    /* renamed from: d */
    final Rect f3551d;

    /* renamed from: e */
    boolean f3552e;

    /* renamed from: f */
    boolean f3553f;

    public C0861bn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3551d = new Rect();
        this.f3552e = true;
        this.f3553f = false;
    }

    public C0861bn(int i, int i2) {
        super(i, i2);
        this.f3551d = new Rect();
        this.f3552e = true;
        this.f3553f = false;
    }

    public C0861bn(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3551d = new Rect();
        this.f3552e = true;
        this.f3553f = false;
    }

    public C0861bn(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3551d = new Rect();
        this.f3552e = true;
        this.f3553f = false;
    }

    public C0861bn(C0861bn c0861bn) {
        super((ViewGroup.LayoutParams) c0861bn);
        this.f3551d = new Rect();
        this.f3552e = true;
        this.f3553f = false;
    }
}
