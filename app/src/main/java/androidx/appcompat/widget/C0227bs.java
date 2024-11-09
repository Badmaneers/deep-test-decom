package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.R;

/* compiled from: LinearLayoutCompat.java */
/* renamed from: androidx.appcompat.widget.bs */
/* loaded from: classes.dex */
public class C0227bs extends ViewGroup.MarginLayoutParams {

    /* renamed from: g */
    public float f1228g;

    /* renamed from: h */
    public int f1229h;

    public C0227bs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1229h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LinearLayoutCompat_Layout);
        this.f1228g = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
        this.f1229h = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
        obtainStyledAttributes.recycle();
    }

    public C0227bs(int i, int i2) {
        super(i, i2);
        this.f1229h = -1;
        this.f1228g = 0.0f;
    }

    public C0227bs(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1229h = -1;
    }
}
