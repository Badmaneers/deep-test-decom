package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.R;

/* compiled from: ActionBar.java */
/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class C0086b extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f285a;

    public C0086b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f285a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBarLayout);
        this.f285a = obtainStyledAttributes.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
        obtainStyledAttributes.recycle();
    }

    public C0086b(int i, int i2) {
        super(i, i2);
        this.f285a = 0;
        this.f285a = 8388627;
    }

    public C0086b(C0086b c0086b) {
        super((ViewGroup.MarginLayoutParams) c0086b);
        this.f285a = 0;
        this.f285a = c0086b.f285a;
    }

    public C0086b(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f285a = 0;
    }
}
