package color.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p023f.C0472c;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0538w;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorAppBarLayout extends LinearLayout {

    /* renamed from: a */
    private int f4653a;

    /* renamed from: b */
    private int f4654b;

    /* renamed from: c */
    private int f4655c;

    /* renamed from: d */
    private boolean f4656d;

    /* renamed from: e */
    private int f4657e;

    /* renamed from: f */
    private C0514ao f4658f;

    /* renamed from: g */
    private boolean f4659g;

    /* renamed from: h */
    private boolean f4660h;

    /* renamed from: i */
    private int[] f4661i;

    /* renamed from: j */
    private int f4662j;

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m3819a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m3819a(layoutParams);
    }

    public ColorAppBarLayout(Context context) {
        this(context, null);
    }

    public ColorAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4653a = -1;
        this.f4654b = -1;
        this.f4655c = -1;
        this.f4657e = 0;
        this.f4662j = -1;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            C1189r.m3945a(this);
            C1189r.m3947a(this, attributeSet, R.style.Widget_Design_ColorAppBarLayout);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorAppBarLayout, 0, R.style.Widget_Design_ColorAppBarLayout);
        if (obtainStyledAttributes.hasValue(R.styleable.ColorAppBarLayout_android_background)) {
            C0538w.m1846a(this, obtainStyledAttributes.getDrawable(R.styleable.ColorAppBarLayout_android_background));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.ColorAppBarLayout_colorExpanded)) {
            m3821a(obtainStyledAttributes.getBoolean(R.styleable.ColorAppBarLayout_colorExpanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && obtainStyledAttributes.hasValue(R.styleable.ColorAppBarLayout_colorElevation)) {
            C1189r.m3946a(this, obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorAppBarLayout_colorElevation, 0));
        }
        obtainStyledAttributes.recycle();
        C0538w.m1850a(this, new C1164b(this));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m3820a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m3820a();
        boolean z2 = false;
        this.f4656d = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            if (((C1174c) getChildAt(i5).getLayoutParams()).f4768b != null) {
                this.f4656d = true;
                break;
            }
            i5++;
        }
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            }
            C1174c c1174c = (C1174c) getChildAt(i6).getLayoutParams();
            if ((c1174c.f4767a & 1) == 1 && (c1174c.f4767a & 10) != 0) {
                z2 = true;
                break;
            }
            i6++;
        }
        if (this.f4659g != z2) {
            this.f4659g = z2;
            refreshDrawableState();
        }
    }

    /* renamed from: a */
    private void m3820a() {
        this.f4653a = -1;
        this.f4654b = -1;
        this.f4655c = -1;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setExpanded(boolean z) {
        m3821a(z, C0538w.m1819C(this), true);
    }

    /* renamed from: a */
    private void m3821a(boolean z, boolean z2, boolean z3) {
        this.f4657e = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1174c;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public C1174c generateLayoutParams(AttributeSet attributeSet) {
        return new C1174c(getContext(), attributeSet);
    }

    /* renamed from: a */
    private static C1174c m3819a(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new C1174c((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1174c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1174c(layoutParams);
    }

    public final int getTotalScrollRange() {
        if (this.f4653a != -1) {
            return this.f4653a;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            C1174c c1174c = (C1174c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c1174c.f4767a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight + c1174c.topMargin + c1174c.bottomMargin;
            if ((i3 & 2) != 0) {
                i2 -= C0538w.m1886o(childAt);
                break;
            }
            i++;
        }
        int max = Math.max(0, i2 - getTopInset());
        this.f4653a = max;
        return max;
    }

    public final int getTotalScaleRange() {
        if (this.f4662j != -1) {
            return this.f4662j;
        }
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1174c c1174c = (C1174c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c1174c.f4767a;
            if ((i3 & 1) != 0) {
                i += measuredHeight + c1174c.topMargin + c1174c.bottomMargin;
                if ((i3 & 2) != 0) {
                    i -= C0538w.m1886o(childAt);
                }
            }
        }
        int max = Math.max(0, i - getTopInset());
        this.f4662j = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    int getDownNestedPreScrollRange() {
        if (this.f4654b != -1) {
            return this.f4654b;
        }
        int i = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C1174c c1174c = (C1174c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = c1174c.f4767a;
            if ((i2 & 5) != 5) {
                if (i > 0) {
                    break;
                }
            } else {
                int i3 = i + c1174c.topMargin + c1174c.bottomMargin;
                if ((i2 & 8) != 0) {
                    i = i3 + C0538w.m1886o(childAt);
                } else if ((i2 & 2) != 0) {
                    i = i3 + (measuredHeight - C0538w.m1886o(childAt));
                } else {
                    i = i3 + (measuredHeight - getTopInset());
                }
            }
        }
        int max = Math.max(0, i);
        this.f4654b = max;
        return max;
    }

    int getDownNestedScrollRange() {
        if (this.f4655c != -1) {
            return this.f4655c;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            C1174c c1174c = (C1174c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + c1174c.topMargin + c1174c.bottomMargin;
            int i3 = c1174c.f4767a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i3 & 2) != 0) {
                i2 -= C0538w.m1886o(childAt) + getTopInset();
                break;
            }
            i++;
        }
        int max = Math.max(0, i2);
        this.f4655c = max;
        return max;
    }

    final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m1886o = C0538w.m1886o(this);
        if (m1886o != 0) {
            return (m1886o * 2) + topInset;
        }
        int childCount = getChildCount();
        int m1886o2 = childCount > 0 ? C0538w.m1886o(getChildAt(childCount - 1)) : 0;
        return m1886o2 != 0 ? (m1886o2 * 2) + topInset : getHeight() / 3;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.f4661i == null) {
            this.f4661i = new int[2];
        }
        int[] iArr = this.f4661i;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f4659g ? R.attr.colorStateCollapsible : -R.attr.colorStateCollapsible;
        iArr[1] = (this.f4659g && this.f4660h) ? R.attr.colorStateCollapsed : -R.attr.colorStateCollapsed;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1189r.m3946a(this, f);
        }
    }

    int getPendingAction() {
        return this.f4657e;
    }

    final int getTopInset() {
        if (this.f4658f != null) {
            return this.f4658f.m1766b();
        }
        return 0;
    }

    /* renamed from: a */
    public final C0514ao m3822a(C0514ao c0514ao) {
        C0514ao c0514ao2 = C0538w.m1893v(this) ? c0514ao : null;
        if (!C0472c.m1615a(this.f4658f, c0514ao2)) {
            this.f4658f = c0514ao2;
            m3820a();
        }
        return c0514ao;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C1174c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1174c();
    }
}
