package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: Constraints.java */
/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes.dex */
public final class C0388e extends C0384a {

    /* renamed from: an */
    public float f2040an;

    /* renamed from: ao */
    public boolean f2041ao;

    /* renamed from: ap */
    public float f2042ap;

    /* renamed from: aq */
    public float f2043aq;

    /* renamed from: ar */
    public float f2044ar;

    /* renamed from: as */
    public float f2045as;

    /* renamed from: at */
    public float f2046at;

    /* renamed from: au */
    public float f2047au;

    /* renamed from: av */
    public float f2048av;

    /* renamed from: aw */
    public float f2049aw;

    /* renamed from: ax */
    public float f2050ax;

    /* renamed from: ay */
    public float f2051ay;

    /* renamed from: az */
    public float f2052az;

    public C0388e() {
        this.f2040an = 1.0f;
        this.f2041ao = false;
        this.f2042ap = 0.0f;
        this.f2043aq = 0.0f;
        this.f2044ar = 0.0f;
        this.f2045as = 0.0f;
        this.f2046at = 1.0f;
        this.f2047au = 1.0f;
        this.f2048av = 0.0f;
        this.f2049aw = 0.0f;
        this.f2050ax = 0.0f;
        this.f2051ay = 0.0f;
        this.f2052az = 0.0f;
    }

    public C0388e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2040an = 1.0f;
        this.f2041ao = false;
        this.f2042ap = 0.0f;
        this.f2043aq = 0.0f;
        this.f2044ar = 0.0f;
        this.f2045as = 0.0f;
        this.f2046at = 1.0f;
        this.f2047au = 1.0f;
        this.f2048av = 0.0f;
        this.f2049aw = 0.0f;
        this.f2050ax = 0.0f;
        this.f2051ay = 0.0f;
        this.f2052az = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.ConstraintSet_android_alpha) {
                this.f2040an = obtainStyledAttributes.getFloat(index, this.f2040an);
            } else if (index == R.styleable.ConstraintSet_android_elevation) {
                this.f2042ap = obtainStyledAttributes.getFloat(index, this.f2042ap);
                this.f2041ao = true;
            } else if (index == R.styleable.ConstraintSet_android_rotationX) {
                this.f2044ar = obtainStyledAttributes.getFloat(index, this.f2044ar);
            } else if (index == R.styleable.ConstraintSet_android_rotationY) {
                this.f2045as = obtainStyledAttributes.getFloat(index, this.f2045as);
            } else if (index == R.styleable.ConstraintSet_android_rotation) {
                this.f2043aq = obtainStyledAttributes.getFloat(index, this.f2043aq);
            } else if (index == R.styleable.ConstraintSet_android_scaleX) {
                this.f2046at = obtainStyledAttributes.getFloat(index, this.f2046at);
            } else if (index == R.styleable.ConstraintSet_android_scaleY) {
                this.f2047au = obtainStyledAttributes.getFloat(index, this.f2047au);
            } else if (index == R.styleable.ConstraintSet_android_transformPivotX) {
                this.f2048av = obtainStyledAttributes.getFloat(index, this.f2048av);
            } else if (index == R.styleable.ConstraintSet_android_transformPivotY) {
                this.f2049aw = obtainStyledAttributes.getFloat(index, this.f2049aw);
            } else if (index == R.styleable.ConstraintSet_android_translationX) {
                this.f2050ax = obtainStyledAttributes.getFloat(index, this.f2050ax);
            } else if (index == R.styleable.ConstraintSet_android_translationY) {
                this.f2051ay = obtainStyledAttributes.getFloat(index, this.f2051ay);
            } else if (index == R.styleable.ConstraintSet_android_translationZ) {
                this.f2050ax = obtainStyledAttributes.getFloat(index, this.f2052az);
            }
        }
    }
}
