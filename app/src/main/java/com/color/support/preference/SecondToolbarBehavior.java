package com.color.support.preference;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.coordinatorlayout.widget.AbstractC0391c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import color.support.design.widget.ColorAppBarLayout;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class SecondToolbarBehavior extends AbstractC0391c<ColorAppBarLayout> implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public int f5777a;

    /* renamed from: b */
    private View f5778b;

    /* renamed from: c */
    private View f5779c;

    /* renamed from: d */
    private View f5780d;

    /* renamed from: e */
    private int f5781e;

    /* renamed from: f */
    private int f5782f;

    /* renamed from: g */
    private int f5783g;

    /* renamed from: h */
    private int[] f5784h;

    /* renamed from: i */
    private int f5785i;

    /* renamed from: j */
    private ViewGroup.LayoutParams f5786j;

    /* renamed from: k */
    private int f5787k;

    /* renamed from: l */
    private int f5788l;

    /* renamed from: m */
    private int f5789m;

    /* renamed from: n */
    private int f5790n;

    /* renamed from: o */
    private int f5791o;

    /* renamed from: p */
    private int f5792p;

    /* renamed from: q */
    private int f5793q;

    /* renamed from: r */
    private float f5794r;

    /* renamed from: s */
    private float f5795s;

    /* renamed from: t */
    private Resources f5796t;

    /* renamed from: u */
    private boolean f5797u;

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final /* synthetic */ boolean mo1421a(CoordinatorLayout coordinatorLayout, ColorAppBarLayout colorAppBarLayout, View view, View view2, int i, int i2) {
        ColorAppBarLayout colorAppBarLayout2 = colorAppBarLayout;
        boolean z = (i & 2) != 0 && coordinatorLayout.getHeight() - view.getHeight() <= colorAppBarLayout2.getHeight();
        if (!this.f5797u && z) {
            if (this.f5788l <= 0) {
                this.f5788l = colorAppBarLayout2.getMeasuredHeight();
                this.f5779c = view2;
                this.f5778b = colorAppBarLayout2.findViewById(R.id.divider_line);
                this.f5777a = this.f5778b.getWidth();
                this.f5786j = this.f5778b.getLayoutParams();
                this.f5785i = colorAppBarLayout2.getMeasuredWidth();
                this.f5789m = this.f5788l - this.f5790n;
                this.f5792p = this.f5788l - this.f5796t.getDimensionPixelOffset(R.dimen.preference_divider_width_start_count_offset);
                this.f5791o = this.f5792p - this.f5793q;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                view2.setOnScrollChangeListener(new ViewOnScrollChangeListenerC1335e(this));
            } else if (view2 instanceof AbsListView) {
                ((AbsListView) view2).setOnScrollListener(this);
            }
        }
        return false;
    }

    public SecondToolbarBehavior() {
        this.f5784h = new int[2];
    }

    public SecondToolbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5784h = new int[2];
        this.f5796t = context.getResources();
        this.f5787k = this.f5796t.getDimensionPixelOffset(R.dimen.preference_divider_margin_horizontal) * 2;
        this.f5790n = this.f5796t.getDimensionPixelOffset(R.dimen.preference_line_alpha_range_change_offset);
        this.f5793q = this.f5796t.getDimensionPixelOffset(R.dimen.preference_divider_width_change_offset);
        this.f5797u = this.f5796t.getBoolean(R.bool.is_dialog_preference_immersive);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        m4369b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4369b() {
        this.f5780d = null;
        if (this.f5779c instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.f5779c;
            if (viewGroup.getChildCount() > 0) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    if (viewGroup.getChildAt(i).getVisibility() == 0) {
                        this.f5780d = viewGroup.getChildAt(i);
                        break;
                    }
                    i++;
                }
            }
        }
        if (this.f5780d == null) {
            this.f5780d = this.f5779c;
        }
        this.f5780d.getLocationOnScreen(this.f5784h);
        this.f5781e = this.f5784h[1];
        this.f5782f = 0;
        if (this.f5781e < this.f5789m) {
            this.f5782f = this.f5790n;
        } else if (this.f5781e > this.f5788l) {
            this.f5782f = 0;
        } else {
            this.f5782f = this.f5788l - this.f5781e;
        }
        this.f5783g = this.f5782f;
        if (this.f5794r <= 1.0f) {
            this.f5794r = Math.abs(this.f5783g) / this.f5790n;
            this.f5778b.setAlpha(this.f5794r);
        }
        if (this.f5781e < this.f5791o) {
            this.f5782f = this.f5793q;
        } else if (this.f5781e > this.f5792p) {
            this.f5782f = 0;
        } else {
            this.f5782f = this.f5792p - this.f5781e;
        }
        this.f5783g = this.f5782f;
        this.f5795s = Math.abs(this.f5783g) / this.f5793q;
        this.f5786j.width = (int) (this.f5777a + (this.f5787k * this.f5795s));
        this.f5778b.setLayoutParams(this.f5786j);
    }
}
