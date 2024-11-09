package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: ViewPager.java */
/* renamed from: androidx.viewpager.widget.l */
/* loaded from: classes.dex */
public final class C1105l extends ViewGroup.LayoutParams {

    /* renamed from: a */
    public boolean f4479a;

    /* renamed from: b */
    public int f4480b;

    /* renamed from: c */
    float f4481c;

    /* renamed from: d */
    boolean f4482d;

    /* renamed from: e */
    int f4483e;

    /* renamed from: f */
    int f4484f;

    public C1105l() {
        super(-1, -1);
        this.f4481c = 0.0f;
    }

    public C1105l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4481c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f4402a);
        this.f4480b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
