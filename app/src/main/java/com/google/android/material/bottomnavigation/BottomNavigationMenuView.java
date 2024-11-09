package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0146af;
import androidx.core.p023f.C0477h;
import androidx.core.p023f.InterfaceC0475f;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0484e;
import androidx.p028d.p029a.p030a.C0597b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C1009al;
import androidx.transition.C1013ap;
import androidx.transition.C1046c;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C2241aj;
import java.util.HashSet;

/* loaded from: classes.dex */
public class BottomNavigationMenuView extends ViewGroup implements InterfaceC0146af {

    /* renamed from: a */
    private static final int[] f9209a = {R.attr.state_checked};

    /* renamed from: b */
    private static final int[] f9210b = {-16842910};

    /* renamed from: A */
    private C0168o f9211A;

    /* renamed from: c */
    private final C1013ap f9212c;

    /* renamed from: d */
    private final int f9213d;

    /* renamed from: e */
    private final int f9214e;

    /* renamed from: f */
    private final int f9215f;

    /* renamed from: g */
    private final int f9216g;

    /* renamed from: h */
    private final int f9217h;

    /* renamed from: i */
    private final View.OnClickListener f9218i;

    /* renamed from: j */
    private final InterfaceC0475f<BottomNavigationItemView> f9219j;

    /* renamed from: k */
    private boolean f9220k;

    /* renamed from: l */
    private int f9221l;

    /* renamed from: m */
    private BottomNavigationItemView[] f9222m;

    /* renamed from: n */
    private int f9223n;

    /* renamed from: o */
    private int f9224o;

    /* renamed from: p */
    private ColorStateList f9225p;

    /* renamed from: q */
    private int f9226q;

    /* renamed from: r */
    private ColorStateList f9227r;

    /* renamed from: s */
    private final ColorStateList f9228s;

    /* renamed from: t */
    private int f9229t;

    /* renamed from: u */
    private int f9230u;

    /* renamed from: v */
    private Drawable f9231v;

    /* renamed from: w */
    private int f9232w;

    /* renamed from: x */
    private int[] f9233x;

    /* renamed from: y */
    private SparseArray<BadgeDrawable> f9234y;

    /* renamed from: z */
    private BottomNavigationPresenter f9235z;

    /* renamed from: a */
    private static boolean m6466a(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public BottomNavigationMenuView(Context context) {
        this(context, null);
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9219j = new C0477h(5);
        this.f9223n = 0;
        this.f9224o = 0;
        this.f9234y = new SparseArray<>(5);
        Resources resources = getResources();
        this.f9213d = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_item_max_width);
        this.f9214e = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_item_min_width);
        this.f9215f = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_active_item_max_width);
        this.f9216g = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_active_item_min_width);
        this.f9217h = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_height);
        this.f9228s = m6470b();
        this.f9212c = new C1046c();
        this.f9212c.m3530a(0);
        this.f9212c.mo3482a(115L);
        this.f9212c.mo3483a(new C0597b());
        this.f9212c.m3531a(new C2241aj());
        this.f9218i = new ViewOnClickListenerC2085c(this);
        this.f9233x = new int[5];
        C0538w.m1840a((View) this, 1);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0146af
    /* renamed from: a */
    public final void mo343a(C0168o c0168o) {
        this.f9211A = c0168o;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f9211A.m468l().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f9217h, 1073741824);
        if (m6466a(this.f9221l, size2) && this.f9220k) {
            View childAt = getChildAt(this.f9224o);
            int i3 = this.f9216g;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f9215f, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
            int i4 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f9214e * i4), Math.min(i3, this.f9215f));
            int i5 = size - min;
            int min2 = Math.min(i5 / (i4 == 0 ? 1 : i4), this.f9213d);
            int i6 = i5 - (i4 * min2);
            int i7 = 0;
            while (i7 < childCount) {
                if (getChildAt(i7).getVisibility() != 8) {
                    this.f9233x[i7] = i7 == this.f9224o ? min : min2;
                    if (i6 > 0) {
                        int[] iArr = this.f9233x;
                        iArr[i7] = iArr[i7] + 1;
                        i6--;
                    }
                } else {
                    this.f9233x[i7] = 0;
                }
                i7++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.f9215f);
            int i8 = size - (size2 * min3);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getVisibility() != 8) {
                    this.f9233x[i9] = min3;
                    if (i8 > 0) {
                        int[] iArr2 = this.f9233x;
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f9233x[i9] = 0;
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f9233x[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.f9217h, makeMeasureSpec, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C0538w.m1878h(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0482c.m1635a(accessibilityNodeInfo).m1653a(C0484e.m1714a(1, this.f9211A.m468l().size(), 1));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f9225p = colorStateList;
        if (this.f9222m != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f9222m) {
                bottomNavigationItemView.setIconTintList(colorStateList);
            }
        }
    }

    public ColorStateList getIconTintList() {
        return this.f9225p;
    }

    public void setItemIconSize(int i) {
        this.f9226q = i;
        if (this.f9222m != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f9222m) {
                bottomNavigationItemView.setIconSize(i);
            }
        }
    }

    public int getItemIconSize() {
        return this.f9226q;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f9227r = colorStateList;
        if (this.f9222m != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f9222m) {
                bottomNavigationItemView.setTextColor(colorStateList);
            }
        }
    }

    public ColorStateList getItemTextColor() {
        return this.f9227r;
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f9229t = i;
        if (this.f9222m != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f9222m) {
                bottomNavigationItemView.setTextAppearanceInactive(i);
                if (this.f9227r != null) {
                    bottomNavigationItemView.setTextColor(this.f9227r);
                }
            }
        }
    }

    public int getItemTextAppearanceInactive() {
        return this.f9229t;
    }

    public void setItemTextAppearanceActive(int i) {
        this.f9230u = i;
        if (this.f9222m != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f9222m) {
                bottomNavigationItemView.setTextAppearanceActive(i);
                if (this.f9227r != null) {
                    bottomNavigationItemView.setTextColor(this.f9227r);
                }
            }
        }
    }

    public int getItemTextAppearanceActive() {
        return this.f9230u;
    }

    public void setItemBackgroundRes(int i) {
        this.f9232w = i;
        if (this.f9222m != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f9222m) {
                bottomNavigationItemView.setItemBackground(i);
            }
        }
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f9232w;
    }

    public void setItemBackground(Drawable drawable) {
        this.f9231v = drawable;
        if (this.f9222m != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f9222m) {
                bottomNavigationItemView.setItemBackground(drawable);
            }
        }
    }

    public Drawable getItemBackground() {
        if (this.f9222m != null && this.f9222m.length > 0) {
            return this.f9222m[0].getBackground();
        }
        return this.f9231v;
    }

    public void setLabelVisibilityMode(int i) {
        this.f9221l = i;
    }

    public int getLabelVisibilityMode() {
        return this.f9221l;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f9220k = z;
    }

    /* renamed from: a */
    public final boolean m6469a() {
        return this.f9220k;
    }

    /* renamed from: b */
    public final ColorStateList m6470b() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList m45a = C0057a.m45a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = m45a.getDefaultColor();
        return new ColorStateList(new int[][]{f9210b, f9209a, EMPTY_STATE_SET}, new int[]{m45a.getColorForState(f9210b, defaultColor), i, defaultColor});
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f9235z = bottomNavigationPresenter;
    }

    /* renamed from: c */
    public final void m6471c() {
        removeAllViews();
        if (this.f9222m != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f9222m) {
                if (bottomNavigationItemView != null) {
                    this.f9219j.mo1618a(bottomNavigationItemView);
                    bottomNavigationItemView.m6464b();
                }
            }
        }
        if (this.f9211A.size() == 0) {
            this.f9223n = 0;
            this.f9224o = 0;
            this.f9222m = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f9211A.size(); i++) {
            hashSet.add(Integer.valueOf(this.f9211A.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f9234y.size(); i2++) {
            int keyAt = this.f9234y.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f9234y.delete(keyAt);
            }
        }
        this.f9222m = new BottomNavigationItemView[this.f9211A.size()];
        boolean m6466a = m6466a(this.f9221l, this.f9211A.m468l().size());
        for (int i3 = 0; i3 < this.f9211A.size(); i3++) {
            this.f9235z.m6475b(true);
            this.f9211A.getItem(i3).setCheckable(true);
            this.f9235z.m6475b(false);
            BottomNavigationItemView newItem = getNewItem();
            this.f9222m[i3] = newItem;
            newItem.setIconTintList(this.f9225p);
            newItem.setIconSize(this.f9226q);
            newItem.setTextColor(this.f9228s);
            newItem.setTextAppearanceInactive(this.f9229t);
            newItem.setTextAppearanceActive(this.f9230u);
            newItem.setTextColor(this.f9227r);
            if (this.f9231v != null) {
                newItem.setItemBackground(this.f9231v);
            } else {
                newItem.setItemBackground(this.f9232w);
            }
            newItem.setShifting(m6466a);
            newItem.setLabelVisibilityMode(this.f9221l);
            newItem.mo338a((C0172s) this.f9211A.getItem(i3));
            newItem.setItemPosition(i3);
            newItem.setOnClickListener(this.f9218i);
            if (this.f9223n != 0 && this.f9211A.getItem(i3).getItemId() == this.f9223n) {
                this.f9224o = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        this.f9224o = Math.min(this.f9211A.size() - 1, this.f9224o);
        this.f9211A.getItem(this.f9224o).setChecked(true);
    }

    /* renamed from: d */
    public final void m6472d() {
        if (this.f9211A == null || this.f9222m == null) {
            return;
        }
        int size = this.f9211A.size();
        if (size != this.f9222m.length) {
            m6471c();
            return;
        }
        int i = this.f9223n;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f9211A.getItem(i2);
            if (item.isChecked()) {
                this.f9223n = item.getItemId();
                this.f9224o = i2;
            }
        }
        if (i != this.f9223n) {
            C1009al.m3525a(this, this.f9212c);
        }
        boolean m6466a = m6466a(this.f9221l, this.f9211A.m468l().size());
        for (int i3 = 0; i3 < size; i3++) {
            this.f9235z.m6475b(true);
            this.f9222m[i3].setLabelVisibilityMode(this.f9221l);
            this.f9222m[i3].setShifting(m6466a);
            this.f9222m[i3].mo338a((C0172s) this.f9211A.getItem(i3));
            this.f9235z.m6475b(false);
        }
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView mo1617a = this.f9219j.mo1617a();
        return mo1617a == null ? new BottomNavigationItemView(getContext()) : mo1617a;
    }

    public int getSelectedItemId() {
        return this.f9223n;
    }

    /* renamed from: a */
    public final void m6468a(int i) {
        int size = this.f9211A.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f9211A.getItem(i2);
            if (i == item.getItemId()) {
                this.f9223n = i;
                this.f9224o = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f9234y;
    }

    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f9234y = sparseArray;
        if (this.f9222m != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f9222m) {
                bottomNavigationItemView.setBadge(sparseArray.get(bottomNavigationItemView.getId()));
            }
        }
    }

    private void setBadgeIfNeeded(BottomNavigationItemView bottomNavigationItemView) {
        BadgeDrawable badgeDrawable;
        int id = bottomNavigationItemView.getId();
        if ((id != -1) && (badgeDrawable = this.f9234y.get(id)) != null) {
            bottomNavigationItemView.setBadge(badgeDrawable);
        }
    }
}
