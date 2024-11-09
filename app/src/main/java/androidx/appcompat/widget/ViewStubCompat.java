package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f1079a;

    /* renamed from: b */
    private int f1080b;

    /* renamed from: c */
    private WeakReference<View> f1081c;

    /* renamed from: d */
    private LayoutInflater f1082d;

    /* renamed from: e */
    private InterfaceC0294ee f1083e;

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1079a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewStubCompat, i, 0);
        this.f1080b = obtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_inflatedId, -1);
        this.f1079a = obtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final int getInflatedId() {
        return this.f1080b;
    }

    public final void setInflatedId(int i) {
        this.f1080b = i;
    }

    public final int getLayoutResource() {
        return this.f1079a;
    }

    public final void setLayoutResource(int i) {
        this.f1079a = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1082d = layoutInflater;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.f1082d;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (this.f1081c != null) {
            View view = this.f1081c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m669a();
        }
    }

    /* renamed from: a */
    public final View m669a() {
        LayoutInflater from;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1079a != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (this.f1082d != null) {
                    from = this.f1082d;
                } else {
                    from = LayoutInflater.from(getContext());
                }
                View inflate = from.inflate(this.f1079a, viewGroup, false);
                if (this.f1080b != -1) {
                    inflate.setId(this.f1080b);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f1081c = new WeakReference<>(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public final void setOnInflateListener(InterfaceC0294ee interfaceC0294ee) {
        this.f1083e = interfaceC0294ee;
    }
}
