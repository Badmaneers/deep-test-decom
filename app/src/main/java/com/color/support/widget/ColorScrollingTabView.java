package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0546a;
import androidx.viewpager.widget.AbstractC1094a;
import androidx.viewpager.widget.InterfaceC1108o;
import androidx.viewpager.widget.ViewPager;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1336a;
import com.color.support.util.C1337b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ColorScrollingTabView extends HorizontalScrollView implements InterfaceC1108o {

    /* renamed from: A */
    private int f6437A;

    /* renamed from: a */
    private ViewPager f6438a;

    /* renamed from: b */
    private int f6439b;

    /* renamed from: c */
    private int f6440c;

    /* renamed from: d */
    private int f6441d;

    /* renamed from: e */
    private int f6442e;

    /* renamed from: f */
    private C1430cr f6443f;

    /* renamed from: g */
    private Drawable f6444g;

    /* renamed from: h */
    private Drawable f6445h;

    /* renamed from: i */
    private int f6446i;

    /* renamed from: j */
    private int f6447j;

    /* renamed from: k */
    private ArrayList<Integer> f6448k;

    /* renamed from: l */
    private ArrayList<Integer> f6449l;

    /* renamed from: m */
    private ArrayList<Integer> f6450m;

    /* renamed from: n */
    private ArrayList<String> f6451n;

    /* renamed from: o */
    private int f6452o;

    /* renamed from: p */
    private int f6453p;

    /* renamed from: q */
    private int f6454q;

    /* renamed from: r */
    private int f6455r;

    /* renamed from: s */
    private int f6456s;

    /* renamed from: t */
    private int f6457t;

    /* renamed from: u */
    private int f6458u;

    /* renamed from: v */
    private int f6459v;

    /* renamed from: w */
    private int f6460w;

    /* renamed from: x */
    private int f6461x;

    /* renamed from: y */
    private int f6462y;

    /* renamed from: z */
    private Paint f6463z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m4670a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ int m4672c(int i) {
        return i;
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: b */
    public final void mo3707b(int i) {
    }

    public ColorScrollingTabView(Context context) {
        this(context, null);
    }

    public ColorScrollingTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorScrollingTabViewStyle);
    }

    public ColorScrollingTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6439b = -1;
        this.f6441d = 0;
        this.f6442e = 3;
        this.f6444g = null;
        this.f6445h = null;
        this.f6446i = 0;
        this.f6447j = 0;
        this.f6448k = new ArrayList<>();
        this.f6449l = new ArrayList<>();
        this.f6450m = new ArrayList<>();
        this.f6451n = new ArrayList<>();
        this.f6452o = 0;
        this.f6453p = 0;
        this.f6456s = 0;
        this.f6457t = 0;
        this.f6458u = 0;
        this.f6459v = 0;
        this.f6460w = 0;
        this.f6461x = 0;
        this.f6462y = 0;
        this.f6463z = null;
        this.f6437A = 0;
        setFillViewport(true);
        setOverScrollMode(2);
        setHorizontalScrollBarEnabled(false);
        this.f6446i = getResources().getDimensionPixelOffset(R.dimen.color_actionbar_tab_view_max_width);
        this.f6440c = getResources().getDimensionPixelSize(R.dimen.color_actionbar_tab_view_margin);
        this.f6459v = getResources().getDimensionPixelSize(R.dimen.color_tabwidget_maxwidth_first_level);
        this.f6460w = getResources().getDimensionPixelSize(R.dimen.color_tabwidget_maxwidth_second_level);
        this.f6462y = getResources().getDimensionPixelOffset(R.dimen.color_tabwidget_min_width);
        this.f6454q = getResources().getDimensionPixelSize(R.dimen.f5030M3);
        this.f6455r = getResources().getDimensionPixelSize(R.dimen.f5034M7);
        this.f6456s = getResources().getDimensionPixelSize(R.dimen.TD08);
        this.f6456s = (int) C1336a.m4370a(this.f6456s, getResources().getConfiguration().fontScale, 2);
        this.f6457t = this.f6456s;
        this.f6458u = this.f6456s;
        this.f6463z = new TextPaint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorScrollingTabView, i, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.ColorScrollingTabView_colorScrollingTabViewBackground) {
                this.f6444g = obtainStyledAttributes.getDrawable(index);
            } else if (index == R.styleable.ColorScrollingTabView_colorScrollingTabViewFocusLineColor) {
                this.f6441d = obtainStyledAttributes.getColor(index, 0);
            } else if (index == R.styleable.ColorScrollingTabView_colorScrollingTabViewHeight) {
                this.f6447j = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == R.styleable.ColorScrollingTabView_colorScrollingTabViewFocusLineHeight) {
                this.f6442e = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            }
        }
        this.f6445h = getResources().getDrawable(R.drawable.oppo_tab_selected);
        Drawable drawable = this.f6445h;
        int m4374a = C1337b.m4374a(context, R.attr.colorTintControlNormal);
        Drawable m1933f = C0546a.m1933f(drawable);
        C0546a.m1920a(m1933f.mutate(), m4374a);
        this.f6445h = m1933f;
        this.f6443f = new C1430cr(this, context);
        addView(this.f6443f, new FrameLayout.LayoutParams(-2, -1));
        setBackgroundDrawable(this.f6444g);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        this.f6453p = View.MeasureSpec.getSize(i);
        int i3 = 0;
        if (this.f6443f.getChildCount() > 4) {
            setPadding(0, getPaddingTop(), 0, getPaddingBottom());
        } else {
            setPadding(this.f6455r, getPaddingTop(), this.f6455r, getPaddingBottom());
            this.f6453p -= this.f6455r * 2;
        }
        int childCount = this.f6443f.getChildCount();
        switch (childCount) {
            case 1:
                this.f6452o = this.f6453p;
                break;
            case 2:
                this.f6452o = this.f6453p / 2;
                break;
            case 3:
                this.f6452o = this.f6453p / 3;
                break;
            case 4:
                this.f6452o = this.f6453p / 4;
                break;
            default:
                this.f6452o = this.f6460w;
                break;
        }
        int i4 = this.f6452o - ((childCount > 4 ? this.f6455r : this.f6454q) * 2);
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            if (this.f6448k.get(i6).intValue() > i4) {
                i5++;
                this.f6461x = this.f6448k.get(i6).intValue() + ((childCount > 4 ? this.f6455r : this.f6454q) * 2);
            }
        }
        if (i5 > 0) {
            i5 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                if (this.f6449l.get(i7).intValue() > i4) {
                    i5++;
                    this.f6461x = this.f6449l.get(i7).intValue() + ((childCount > 4 ? this.f6455r : this.f6454q) * 2);
                }
            }
            if (i5 > 0) {
                i5 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    if (this.f6450m.get(i8).intValue() > i4) {
                        i5++;
                        this.f6461x = this.f6450m.get(i8).intValue() + ((childCount > 4 ? this.f6455r : this.f6454q) * 2);
                    }
                }
                this.f6437A = this.f6458u;
            } else {
                this.f6437A = this.f6457t;
            }
        } else {
            this.f6437A = this.f6456s;
        }
        if (childCount != 2 && childCount != 3) {
            i3 = i5;
        }
        switch (childCount) {
            case 1:
            case 2:
            case 3:
                this.f6446i = this.f6452o;
                break;
            case 4:
                if (i3 == 1) {
                    this.f6446i = Math.min(this.f6461x, this.f6459v);
                    int i9 = childCount - 1;
                    this.f6452o = (this.f6453p - this.f6446i) / i9;
                    this.f6446i = Math.max(this.f6453p - (this.f6452o * i9), this.f6446i);
                    break;
                } else {
                    this.f6446i = this.f6452o;
                    break;
                }
            default:
                this.f6452o = this.f6460w;
                this.f6446i = this.f6460w;
                break;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f6447j, 1073741824));
    }

    public void setViewPager(ViewPager viewPager) {
        this.f6438a = viewPager;
        AbstractC1094a adapter = this.f6438a.getAdapter();
        this.f6443f.removeAllViews();
        this.f6448k.clear();
        this.f6449l.clear();
        this.f6450m.clear();
        int m3699a = adapter.m3699a();
        for (int i = 0; i < m3699a; i++) {
            CharSequence charSequence = null;
            if (!TextUtils.isEmpty(null)) {
                m4668a(i, charSequence.toString());
            } else {
                m4668a(i, " ");
            }
            C1431cs c1431cs = new C1431cs(this, getContext(), R.attr.colorScrollingTabViewTextStyle);
            c1431cs.setText((CharSequence) null);
            c1431cs.setGravity(17);
            c1431cs.setEllipsize(TextUtils.TruncateAt.END);
            c1431cs.setOnClickListener(new ViewOnClickListenerC1429cq(this, i));
            this.f6443f.addView(c1431cs, new LinearLayout.LayoutParams(-2, -1));
            if (i == 0) {
                this.f6439b = 0;
                m4669a((TextView) c1431cs, true);
            }
        }
    }

    /* renamed from: a */
    private void m4668a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f6463z.setTextSize(this.f6456s);
        int measureText = (int) this.f6463z.measureText(str);
        this.f6448k.add(i, Integer.valueOf(measureText));
        this.f6449l.add(i, Integer.valueOf(measureText));
        this.f6450m.add(i, Integer.valueOf(measureText));
    }

    public boolean isLayoutRtl() {
        return Build.VERSION.SDK_INT > 16 && getLayoutDirection() == 1;
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: a */
    public final void mo3705a(int i, float f) {
        int childCount = this.f6443f.getChildCount();
        if (childCount == 0 || i < 0 || i >= childCount) {
            return;
        }
        this.f6443f.m4991a(i, f);
    }

    @Override // androidx.viewpager.widget.InterfaceC1108o
    /* renamed from: a */
    public final void mo3704a(int i) {
        int childCount = this.f6443f.getChildCount();
        if (childCount == 0 || i < 0 || i >= childCount) {
            return;
        }
        if (this.f6439b >= 0 && this.f6439b < childCount) {
            m4669a((TextView) this.f6443f.getChildAt(this.f6439b), false);
        }
        m4669a((TextView) this.f6443f.getChildAt(i), true);
        this.f6439b = i;
    }

    /* renamed from: a */
    private static void m4669a(TextView textView, boolean z) {
        if (textView != null) {
            textView.setSelected(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ int m4666a(ColorScrollingTabView colorScrollingTabView, int i, int i2) {
        int intValue = colorScrollingTabView.f6448k.get(i2).intValue() + ((i > 4 ? colorScrollingTabView.f6455r : colorScrollingTabView.f6454q) * 2);
        if (i > 4) {
            return intValue > colorScrollingTabView.f6446i ? colorScrollingTabView.f6446i : colorScrollingTabView.f6462y > intValue ? colorScrollingTabView.f6462y : intValue;
        }
        if (intValue > colorScrollingTabView.f6452o) {
            return colorScrollingTabView.f6453p - (colorScrollingTabView.f6452o * (i - 1));
        }
        return intValue > colorScrollingTabView.f6446i ? colorScrollingTabView.f6446i : intValue > colorScrollingTabView.f6452o ? intValue : colorScrollingTabView.f6452o;
    }
}
