package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f894a;

    /* renamed from: b */
    private int f895b;

    /* renamed from: c */
    private int f896c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f895b = -1;
        this.f896c = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ButtonBarLayout);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, R.styleable.ButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f894a = obtainStyledAttributes.getBoolean(R.styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    public void setAllowStacking(boolean z) {
        if (this.f894a != z) {
            this.f894a = z;
            if (!this.f894a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f894a) {
            if (size > this.f895b && m580a()) {
                setStacked(false);
            }
            this.f895b = size;
        }
        if (m580a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f894a && !m580a()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int m579a = m579a(0);
        if (m579a >= 0) {
            View childAt = getChildAt(m579a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m580a()) {
                int m579a2 = m579a(m579a + 1);
                if (m579a2 >= 0) {
                    paddingTop += getChildAt(m579a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C0538w.m1886o(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    /* renamed from: a */
    private int m579a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f896c, super.getMinimumHeight());
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    private boolean m580a() {
        return getOrientation() == 1;
    }
}
