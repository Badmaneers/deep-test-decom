package com.color.support.widget.navigation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Build;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0146af;
import androidx.p028d.p029a.p030a.C0597b;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1342g;

/* loaded from: classes.dex */
public class ColorNavigationMenuView extends ViewGroup implements InterfaceC0146af {

    /* renamed from: a */
    private final float f7459a;

    /* renamed from: b */
    private final float f7460b;

    /* renamed from: c */
    private TransitionSet f7461c;

    /* renamed from: d */
    private View.OnClickListener f7462d;

    /* renamed from: e */
    private ColorNavigationItemView[] f7463e;

    /* renamed from: f */
    private ColorStateList f7464f;

    /* renamed from: g */
    private ColorStateList f7465g;

    /* renamed from: h */
    private int f7466h;

    /* renamed from: i */
    private int f7467i;

    /* renamed from: j */
    private int f7468j;

    /* renamed from: k */
    private int f7469k;

    /* renamed from: l */
    private int f7470l;

    /* renamed from: m */
    private int f7471m;

    /* renamed from: n */
    private int f7472n;

    /* renamed from: o */
    private int[] f7473o;

    /* renamed from: p */
    private boolean f7474p;

    /* renamed from: q */
    private int f7475q;

    /* renamed from: r */
    private Animator f7476r;

    /* renamed from: s */
    private SparseArray<C1572e> f7477s;

    /* renamed from: t */
    private ColorNavigationPresenter f7478t;

    /* renamed from: u */
    private C0168o f7479u;

    public int getWindowAnimations() {
        return 0;
    }

    public ColorNavigationMenuView(Context context) {
        this(context, null);
    }

    public ColorNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7459a = 0.3f;
        this.f7460b = 1.0f;
        this.f7467i = 0;
        this.f7468j = 0;
        this.f7469k = 0;
        this.f7474p = false;
        this.f7477s = new SparseArray<>();
        this.f7472n = getResources().getDimensionPixelSize(R.dimen.color_navigation_item_padding);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f7461c = new TransitionSet();
            this.f7461c.addTransition(new Fade());
            this.f7461c.setOrdering(0);
            this.f7461c.setDuration(100L);
            this.f7461c.setInterpolator((TimeInterpolator) new C0597b());
            this.f7461c.addTransition(new C1581n());
        }
        this.f7462d = new ViewOnClickListenerC1571d(this);
        this.f7473o = new int[5];
        this.f7475q = C1342g.m4386b(context);
    }

    public ColorNavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.ColorNavigationViewStyle);
        this.f7459a = 0.3f;
        this.f7460b = 1.0f;
        this.f7467i = 0;
        this.f7468j = 0;
        this.f7469k = 0;
        this.f7474p = false;
        this.f7477s = new SparseArray<>();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0146af
    /* renamed from: a */
    public final void mo343a(C0168o c0168o) {
        this.f7479u = c0168o;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) - (this.f7472n * 2);
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f7466h, 1073741824);
        int i3 = size / (childCount == 0 ? 1 : childCount);
        int i4 = size - (i3 * childCount);
        for (int i5 = 0; i5 < childCount; i5++) {
            this.f7473o[i5] = i3;
            if (i4 > 0) {
                int[] iArr = this.f7473o;
                iArr[i5] = iArr[i5] + 1;
                i4--;
            }
        }
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (childCount == 1) {
                    childAt.setPadding(this.f7472n, 0, this.f7472n, 0);
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f7473o[i7] + (this.f7472n * 2), 1073741824), makeMeasureSpec);
                } else if (i7 == 0) {
                    childAt.setPadding(m5298d() ? 0 : this.f7472n, 0, m5298d() ? this.f7472n : 0, 0);
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f7473o[i7] + this.f7472n, 1073741824), makeMeasureSpec);
                } else if (i7 == childCount - 1) {
                    childAt.setPadding(m5298d() ? this.f7472n : 0, 0, m5298d() ? 0 : this.f7472n, 0);
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f7473o[i7] + this.f7472n, 1073741824), makeMeasureSpec);
                } else {
                    childAt.setPadding(0, 0, 0, 0);
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f7473o[i7], 1073741824), makeMeasureSpec);
                }
                childAt.getLayoutParams().width = childAt.getMeasuredWidth();
                i6 += childAt.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i6, View.MeasureSpec.makeMeasureSpec(i6, 1073741824), 0), View.resolveSizeAndState(this.f7466h, makeMeasureSpec, 0));
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
                if (m5298d()) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Deprecated
    public void setIconTintList(ColorStateList colorStateList) {
        this.f7465g = colorStateList;
        if (this.f7463e == null) {
            return;
        }
        for (ColorNavigationItemView colorNavigationItemView : this.f7463e) {
            colorNavigationItemView.setIconTintList(colorStateList);
        }
    }

    public ColorStateList getIconTintList() {
        return this.f7465g;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7464f = colorStateList;
        if (this.f7463e == null) {
            return;
        }
        for (ColorNavigationItemView colorNavigationItemView : this.f7463e) {
            colorNavigationItemView.setTextColor(colorStateList);
        }
    }

    public void setItemTextSize(int i) {
        this.f7471m = i;
        if (this.f7463e == null) {
            return;
        }
        for (ColorNavigationItemView colorNavigationItemView : this.f7463e) {
            colorNavigationItemView.setTextSize(i);
        }
    }

    public ColorStateList getItemTextColor() {
        return this.f7464f;
    }

    public void setItemBackgroundRes(int i) {
        this.f7470l = i;
        if (this.f7463e == null) {
            return;
        }
        for (ColorNavigationItemView colorNavigationItemView : this.f7463e) {
            colorNavigationItemView.setItemBackground(i);
        }
    }

    public int getItemBackgroundRes() {
        return this.f7470l;
    }

    public void setPresenter(ColorNavigationPresenter colorNavigationPresenter) {
        this.f7478t = colorNavigationPresenter;
    }

    /* renamed from: a */
    public final void m5299a() {
        int size = this.f7479u.size();
        if (size != 0) {
            removeAllViews();
        }
        if (size == 0) {
            this.f7467i = 0;
            this.f7468j = 0;
            this.f7463e = null;
            return;
        }
        this.f7463e = new ColorNavigationItemView[size];
        for (int i = 0; i < size; i++) {
            C0172s c0172s = (C0172s) this.f7479u.getItem(i);
            if (c0172s.isVisible()) {
                if (i >= 5) {
                    break;
                }
                ColorNavigationItemView newItem = getNewItem();
                this.f7463e[i] = newItem;
                newItem.setIconTintList(this.f7465g);
                newItem.setTextColor(this.f7464f);
                newItem.setTextSize(this.f7471m);
                newItem.setItemBackground(this.f7470l);
                newItem.mo338a(c0172s);
                newItem.setItemPosition(i);
                newItem.setOnClickListener(this.f7462d);
                C1572e c1572e = this.f7477s.get(c0172s.getItemId());
                if (c1572e != null) {
                    newItem.m5291a(c1572e.m5317a(), c1572e.m5319b());
                }
                addView(newItem);
            }
        }
        this.f7468j = Math.min(this.f7479u.size() - 1, this.f7468j);
        this.f7479u.getItem(this.f7468j).setChecked(true);
    }

    /* renamed from: b */
    public final void m5303b() {
        int size = this.f7479u.size();
        if (size != this.f7463e.length) {
            m5299a();
            return;
        }
        int i = this.f7467i;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f7479u.getItem(i2);
            if (item.isChecked()) {
                this.f7467i = item.getItemId();
                this.f7468j = i2;
            }
        }
        if (i != this.f7467i) {
            int i3 = Build.VERSION.SDK_INT;
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f7463e[i4] != null) {
                this.f7478t.m5307b(true);
                this.f7463e[i4].mo338a((C0172s) this.f7479u.getItem(i4));
                this.f7478t.m5307b(false);
            }
        }
    }

    public int getSelectedItemId() {
        return this.f7467i;
    }

    /* renamed from: a */
    public final void m5300a(int i) {
        int size = this.f7479u.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f7479u.getItem(i2);
            if (i == item.getItemId()) {
                this.f7467i = i;
                this.f7468j = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    public void setItemHeight(int i) {
        this.f7466h = i;
    }

    /* renamed from: a */
    public final void m5302a(MenuItem menuItem) {
        if (menuItem == null) {
            return;
        }
        this.f7469k = this.f7468j;
        for (int i = 0; i < this.f7479u.size(); i++) {
            if (this.f7479u.getItem(i).getItemId() == menuItem.getItemId()) {
                this.f7468j = i;
                return;
            }
        }
    }

    public void setNeedTextAnim(boolean z) {
        this.f7474p = z;
    }

    /* renamed from: a */
    public final void m5301a(int i, int i2) {
        MenuItem item;
        try {
            int size = this.f7479u.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 == this.f7468j && (item = this.f7479u.getItem(i3)) != null) {
                    if (item != null) {
                        C1572e c1572e = this.f7477s.get(item.getItemId());
                        if (c1572e == null) {
                            c1572e = new C1572e(i, i2);
                        } else {
                            c1572e.m5318a(i);
                            c1572e.m5320b(i2);
                        }
                        this.f7477s.put(item.getItemId(), c1572e);
                    }
                    this.f7463e[i3].m5291a(i, i2);
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void m5304c() {
        if (this.f7476r == null) {
            this.f7476r = ObjectAnimator.ofFloat(this, (Property<ColorNavigationMenuView, Float>) View.ALPHA, 0.3f, 1.0f);
            this.f7476r.setInterpolator(new LinearInterpolator());
            this.f7476r.setDuration(100L);
        }
        this.f7476r.start();
    }

    private ColorNavigationItemView getNewItem() {
        return new ColorNavigationItemView(getContext());
    }

    /* renamed from: d */
    private boolean m5298d() {
        return Build.VERSION.SDK_INT > 16 && getLayoutDirection() == 1;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int m4386b = C1342g.m4386b(getContext());
        if (m4386b != this.f7475q) {
            m5299a();
            this.f7475q = m4386b;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m5297d(ColorNavigationMenuView colorNavigationMenuView) {
        if (colorNavigationMenuView.f7468j != colorNavigationMenuView.f7469k) {
            colorNavigationMenuView.f7463e[colorNavigationMenuView.f7468j].m5292b();
            colorNavigationMenuView.f7463e[colorNavigationMenuView.f7469k].m5293c();
        }
    }
}
