package com.color.support.widget.navigation;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.view.C0135i;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.widget.C0276dn;
import androidx.customview.view.AbsSavedState;
import com.color.support.util.C1336a;
import com.color.support.util.C1338c;
import com.color.support.util.C1342g;

/* loaded from: classes.dex */
public class ColorNavigationView extends FrameLayout {

    /* renamed from: a */
    private static final int[] f7485a = {R.attr.state_checked};

    /* renamed from: b */
    private static final int[] f7486b = {-16842910};

    /* renamed from: c */
    private final float f7487c;

    /* renamed from: d */
    private final float f7488d;

    /* renamed from: e */
    private final C0168o f7489e;

    /* renamed from: f */
    private final ColorNavigationMenuView f7490f;

    /* renamed from: g */
    private final ColorNavigationPresenter f7491g;

    /* renamed from: h */
    private MenuInflater f7492h;

    /* renamed from: i */
    private Animator f7493i;

    /* renamed from: j */
    private Animator f7494j;

    /* renamed from: k */
    private int f7495k;

    /* renamed from: l */
    private int f7496l;

    /* renamed from: m */
    private InterfaceC1579l f7497m;

    /* renamed from: n */
    private InterfaceC1578k f7498n;

    /* renamed from: o */
    private InterfaceC1577j f7499o;

    public int getMaxItemCount() {
        return 5;
    }

    public ColorNavigationView(Context context) {
        this(context, null);
    }

    public ColorNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, color.support.p043v7.appcompat.R.attr.colorNavigationViewStyle);
    }

    public ColorNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7487c = 0.0f;
        this.f7488d = 1.0f;
        this.f7491g = new ColorNavigationPresenter();
        setWillNotDraw(false);
        C0276dn m944a = C0276dn.m944a(context, attributeSet, color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView, i, 0);
        this.f7495k = m944a.m946a(color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView_navigationType, 0);
        this.f7489e = new C1570c(context);
        this.f7490f = this.f7495k == 0 ? new ColorToolNavigationMenuView(context) : new ColorTabNavigationMenuView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f7490f.setLayoutParams(layoutParams);
        this.f7491g.m5306a(this.f7490f);
        this.f7491g.m5305a();
        this.f7490f.setPresenter(this.f7491g);
        this.f7489e.m450a(this.f7491g);
        this.f7491g.mo357a(getContext(), this.f7489e);
        if (m944a.m964i(color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView_colorNaviIconTint)) {
            this.f7490f.setIconTintList(m944a.m960f(color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView_colorNaviIconTint));
        } else {
            this.f7490f.setIconTintList(getResources().getColorStateList(color.support.p043v7.appcompat.R.color.color_bottom_tool_navigation_item_selector));
        }
        if (m944a.m964i(color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView_colorNaviTextColor)) {
            this.f7490f.setItemTextColor(m944a.m960f(color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView_colorNaviTextColor));
        } else {
            this.f7490f.setItemTextColor(getResources().getColorStateList(color.support.p043v7.appcompat.R.color.color_bottom_tool_navigation_item_selector));
        }
        int m4370a = (int) C1336a.m4370a(m944a.m958e(color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView_colorNaviTextSize, getResources().getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.color_navigation_item_text_size)), getResources().getConfiguration().fontScale, 2);
        int m962g = m944a.m962g(color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView_colorNaviBackground, this.f7495k == 0 ? color.support.p043v7.appcompat.R.drawable.color_bottom_tool_navigation_item_bg : 0);
        int m953c = m944a.m953c(color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView_colorNaviTipsType, -1);
        int m953c2 = m944a.m953c(color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView_colorNaviTipsNumber, 0);
        this.f7490f.setItemTextSize(m4370a);
        this.f7496l = C1342g.m4386b(context);
        m5309a(C1342g.m4384a(this.f7496l));
        this.f7490f.setItemBackgroundRes(m962g);
        if (m944a.m964i(color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView_colorNaviMenu)) {
            int m962g2 = m944a.m962g(color.support.p043v7.appcompat.R.styleable.ColorNavigationMenuView_colorNaviMenu, 0);
            this.f7491g.m5307b(true);
            if (this.f7489e.size() > 0) {
                this.f7489e.clear();
                this.f7490f.m5304c();
            }
            getMenuInflater().inflate(m962g2, this.f7489e);
            this.f7491g.m5307b(false);
            this.f7491g.mo387a(true);
            this.f7490f.m5301a(m953c2, m953c);
        }
        m944a.m952b();
        addView(this.f7490f, layoutParams);
        if (getBackground() == null) {
            if (this.f7495k == 0) {
                setBackgroundResource(color.support.p043v7.appcompat.R.drawable.color_tool_navigation_view_bg);
            } else {
                setBackgroundResource(color.support.p043v7.appcompat.R.drawable.color_tab_navigation_view_bg);
                View view = new View(context);
                C1338c.m4375a(view, false);
                view.setBackgroundColor(getResources().getColor(color.support.p043v7.appcompat.R.color.color_navigation_divider_color));
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.color_navigation_shadow_height)));
                addView(view);
            }
        }
        this.f7489e.mo395a(new C1574g(this));
        this.f7493i = ObjectAnimator.ofFloat(this, (Property<ColorNavigationView, Float>) View.ALPHA, 0.0f, 1.0f);
        this.f7493i.setInterpolator(new LinearInterpolator());
        this.f7493i.setDuration(100L);
        this.f7493i.addListener(new C1575h(this));
        this.f7494j = ObjectAnimator.ofFloat(this, (Property<ColorNavigationView, Float>) View.ALPHA, 1.0f, 0.0f);
        this.f7494j.setInterpolator(new LinearInterpolator());
        this.f7494j.setDuration(100L);
        this.f7494j.addListener(new C1576i(this));
    }

    /* renamed from: a */
    private void m5309a(boolean z) {
        int dimensionPixelSize;
        if (this.f7495k == 0) {
            dimensionPixelSize = getResources().getDimensionPixelSize(z ? color.support.p043v7.appcompat.R.dimen.color_tool_navigation_item_height : color.support.p043v7.appcompat.R.dimen.color_tool_navigation_item_height_land);
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(z ? color.support.p043v7.appcompat.R.dimen.color_navigation_item_height : color.support.p043v7.appcompat.R.dimen.color_navigation_item_height_land);
        }
        this.f7490f.setItemHeight(dimensionPixelSize);
    }

    public void setOnNavigationItemSelectedListener(InterfaceC1579l interfaceC1579l) {
        this.f7497m = interfaceC1579l;
    }

    public void setOnNavigationItemReselectedListener(InterfaceC1578k interfaceC1578k) {
        this.f7498n = interfaceC1578k;
    }

    public Menu getMenu() {
        return this.f7489e;
    }

    public ColorStateList getItemIconTintList() {
        return this.f7490f.getIconTintList();
    }

    @Deprecated
    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f7490f.setIconTintList(colorStateList);
    }

    public ColorStateList getItemTextColor() {
        return this.f7490f.getItemTextColor();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7490f.setItemTextColor(colorStateList);
    }

    public int getItemBackgroundResource() {
        return this.f7490f.getItemBackgroundRes();
    }

    public void setItemBackgroundResource(int i) {
        this.f7490f.setItemBackgroundRes(i);
    }

    public int getSelectedItemId() {
        return this.f7490f.getSelectedItemId();
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f7489e.findItem(i);
        if (findItem == null || this.f7489e.m454a(findItem, this.f7491g, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    public void setAnimationType(int i) {
        if (i == 1) {
            this.f7493i.start();
        } else if (i == 2) {
            this.f7494j.start();
        }
    }

    public void setNeedTextAnim(boolean z) {
        this.f7490f.setNeedTextAnim(z);
    }

    public void setOnAnimatorListener(InterfaceC1577j interfaceC1577j) {
        this.f7499o = interfaceC1577j;
    }

    private MenuInflater getMenuInflater() {
        if (this.f7492h == null) {
            this.f7492h = new C0135i(getContext());
        }
        return this.f7492h;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7500a = new Bundle();
        this.f7489e.m448a(savedState.f7500a);
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        this.f7489e.m456b(savedState.f7500a);
    }

    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1580m();

        /* renamed from: a */
        Bundle f7500a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7500a = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f7500a);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int m4386b = C1342g.m4386b(getContext());
        if (this.f7496l != m4386b) {
            m5309a(C1342g.m4384a(m4386b));
            this.f7496l = m4386b;
        }
    }
}
