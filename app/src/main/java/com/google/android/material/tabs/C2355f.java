package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0538w;
import com.google.android.material.internal.C2250as;
import com.google.android.material.p072a.C2032a;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabLayout.java */
/* renamed from: com.google.android.material.tabs.f */
/* loaded from: classes.dex */
public final class C2355f extends LinearLayout {

    /* renamed from: a */
    int f10400a;

    /* renamed from: b */
    float f10401b;

    /* renamed from: c */
    int f10402c;

    /* renamed from: d */
    int f10403d;

    /* renamed from: e */
    ValueAnimator f10404e;

    /* renamed from: f */
    final /* synthetic */ TabLayout f10405f;

    /* renamed from: g */
    private int f10406g;

    /* renamed from: h */
    private final Paint f10407h;

    /* renamed from: i */
    private final GradientDrawable f10408i;

    /* renamed from: j */
    private int f10409j;

    /* renamed from: k */
    private int f10410k;

    /* renamed from: l */
    private int f10411l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2355f(TabLayout tabLayout, Context context) {
        super(context);
        this.f10405f = tabLayout;
        this.f10400a = -1;
        this.f10409j = -1;
        this.f10402c = -1;
        this.f10403d = -1;
        this.f10410k = -1;
        this.f10411l = -1;
        setWillNotDraw(false);
        this.f10407h = new Paint();
        this.f10408i = new GradientDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7527a(int i) {
        if (this.f10407h.getColor() != i) {
            this.f10407h.setColor(i);
            C0538w.m1874f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7530b(int i) {
        if (this.f10406g != i) {
            this.f10406g = i;
            C0538w.m1874f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7528a(int i, float f) {
        if (this.f10404e != null && this.f10404e.isRunning()) {
            this.f10404e.cancel();
        }
        this.f10400a = i;
        this.f10401b = f;
        m7523a();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT >= 23 || this.f10409j == i) {
            return;
        }
        requestLayout();
        this.f10409j = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        if (this.f10405f.f10376p == 1 || this.f10405f.f10379s == 2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (((int) C2250as.m7108a(getContext(), 16)) * 2)) {
                z = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z = true;
                    }
                }
            } else {
                this.f10405f.f10376p = 0;
                this.f10405f.m7498a(false);
                z = true;
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f10404e != null && this.f10404e.isRunning()) {
            m7525a(false, this.f10400a, -1);
        } else {
            m7523a();
        }
    }

    /* renamed from: a */
    private void m7523a() {
        int i;
        int i2;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        View childAt = getChildAt(this.f10400a);
        if (childAt == null || childAt.getWidth() <= 0) {
            i = -1;
            i2 = -1;
        } else {
            i = childAt.getLeft();
            i2 = childAt.getRight();
            if (!this.f10405f.f10381u && (childAt instanceof TabLayout.TabView)) {
                rectF4 = this.f10405f.f10346B;
                m7524a((TabLayout.TabView) childAt, rectF4);
                rectF5 = this.f10405f.f10346B;
                i = (int) rectF5.left;
                rectF6 = this.f10405f.f10346B;
                i2 = (int) rectF6.right;
            }
            if (this.f10401b > 0.0f && this.f10400a < getChildCount() - 1) {
                View childAt2 = getChildAt(this.f10400a + 1);
                int left = childAt2.getLeft();
                int right = childAt2.getRight();
                if (!this.f10405f.f10381u && (childAt2 instanceof TabLayout.TabView)) {
                    rectF = this.f10405f.f10346B;
                    m7524a((TabLayout.TabView) childAt2, rectF);
                    rectF2 = this.f10405f.f10346B;
                    left = (int) rectF2.left;
                    rectF3 = this.f10405f.f10346B;
                    right = (int) rectF3.right;
                }
                i = (int) ((this.f10401b * left) + ((1.0f - this.f10401b) * i));
                i2 = (int) ((this.f10401b * right) + ((1.0f - this.f10401b) * i2));
            }
        }
        m7529a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7529a(int i, int i2) {
        if (i == this.f10402c && i2 == this.f10403d) {
            return;
        }
        this.f10402c = i;
        this.f10403d = i2;
        C0538w.m1874f(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7531b(int i, int i2) {
        if (this.f10404e != null && this.f10404e.isRunning()) {
            this.f10404e.cancel();
        }
        m7525a(true, i, i2);
    }

    /* renamed from: a */
    private void m7525a(boolean z, int i, int i2) {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        View childAt = getChildAt(i);
        if (childAt == null) {
            m7523a();
            return;
        }
        int left = childAt.getLeft();
        int right = childAt.getRight();
        if (!this.f10405f.f10381u && (childAt instanceof TabLayout.TabView)) {
            rectF = this.f10405f.f10346B;
            m7524a((TabLayout.TabView) childAt, rectF);
            rectF2 = this.f10405f.f10346B;
            left = (int) rectF2.left;
            rectF3 = this.f10405f.f10346B;
            right = (int) rectF3.right;
        }
        int i3 = this.f10402c;
        int i4 = this.f10403d;
        if (i3 == left && i4 == right) {
            return;
        }
        if (z) {
            this.f10410k = i3;
            this.f10411l = i4;
        }
        C2356g c2356g = new C2356g(this, left, right);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10404e = valueAnimator;
            valueAnimator.setInterpolator(C2032a.f8974b);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(c2356g);
            valueAnimator.addListener(new C2357h(this, i));
            valueAnimator.start();
            return;
        }
        this.f10404e.removeAllUpdateListeners();
        this.f10404e.addUpdateListener(c2356g);
    }

    /* renamed from: a */
    private void m7524a(TabLayout.TabView tabView, RectF rectF) {
        int contentWidth;
        contentWidth = tabView.getContentWidth();
        int m7108a = (int) C2250as.m7108a(getContext(), 24);
        if (contentWidth >= m7108a) {
            m7108a = contentWidth;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int i = m7108a / 2;
        rectF.set(left - i, 0.0f, left + i, 0.0f);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i = 0;
        int intrinsicHeight = this.f10405f.f10370j != null ? this.f10405f.f10370j.getIntrinsicHeight() : 0;
        if (this.f10406g >= 0) {
            intrinsicHeight = this.f10406g;
        }
        switch (this.f10405f.f10378r) {
            case 0:
                i = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
                break;
            case 1:
                i = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
                break;
            case 2:
                break;
            case 3:
                intrinsicHeight = getHeight();
                break;
            default:
                intrinsicHeight = 0;
                break;
        }
        if (this.f10402c >= 0 && this.f10403d > this.f10402c) {
            Drawable mutate = C0546a.m1933f(this.f10405f.f10370j != null ? this.f10405f.f10370j : this.f10408i).mutate();
            mutate.setBounds(this.f10402c, i, this.f10403d, intrinsicHeight);
            if (this.f10407h != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    mutate.setColorFilter(this.f10407h.getColor(), PorterDuff.Mode.SRC_IN);
                } else {
                    C0546a.m1920a(mutate, this.f10407h.getColor());
                }
            }
            mutate.draw(canvas);
        }
        super.draw(canvas);
    }
}
