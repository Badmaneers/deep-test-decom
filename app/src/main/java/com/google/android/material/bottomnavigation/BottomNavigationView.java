package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.C0135i;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.widget.C0276dn;
import androidx.core.content.C0420a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0538w;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2250as;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p080i.C2229c;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2299l;
import com.google.android.material.theme.p084a.C2402a;

/* loaded from: classes.dex */
public class BottomNavigationView extends FrameLayout {

    /* renamed from: b */
    private static final int f9242b = R.style.Widget_Design_BottomNavigationView;

    /* renamed from: a */
    final BottomNavigationMenuView f9243a;

    /* renamed from: c */
    private final C0168o f9244c;

    /* renamed from: d */
    private final BottomNavigationPresenter f9245d;

    /* renamed from: e */
    private ColorStateList f9246e;

    /* renamed from: f */
    private MenuInflater f9247f;

    /* renamed from: g */
    private InterfaceC2090h f9248g;

    /* renamed from: h */
    private InterfaceC2089g f9249h;

    public int getMaxItemCount() {
        return 5;
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9242b), attributeSet, i);
        this.f9245d = new BottomNavigationPresenter();
        Context context2 = getContext();
        this.f9244c = new C2084b(context2);
        this.f9243a = new BottomNavigationMenuView(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f9243a.setLayoutParams(layoutParams);
        this.f9245d.m6474a(this.f9243a);
        this.f9245d.m6473a();
        this.f9243a.setPresenter(this.f9245d);
        this.f9244c.m450a(this.f9245d);
        this.f9245d.mo357a(getContext(), this.f9244c);
        C0276dn m7100b = C2243al.m7100b(context2, attributeSet, R.styleable.BottomNavigationView, i, R.style.Widget_Design_BottomNavigationView, R.styleable.BottomNavigationView_itemTextAppearanceInactive, R.styleable.BottomNavigationView_itemTextAppearanceActive);
        if (m7100b.m964i(R.styleable.BottomNavigationView_itemIconTint)) {
            this.f9243a.setIconTintList(m7100b.m960f(R.styleable.BottomNavigationView_itemIconTint));
        } else {
            this.f9243a.setIconTintList(this.f9243a.m6470b());
        }
        setItemIconSize(m7100b.m958e(R.styleable.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_icon_size)));
        if (m7100b.m964i(R.styleable.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(m7100b.m962g(R.styleable.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (m7100b.m964i(R.styleable.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(m7100b.m962g(R.styleable.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (m7100b.m964i(R.styleable.BottomNavigationView_itemTextColor)) {
            setItemTextColor(m7100b.m960f(R.styleable.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C2295h c2295h = new C2295h();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                c2295h.m7282g(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c2295h.m7276a(context2);
            C0538w.m1846a(this, c2295h);
        }
        if (m7100b.m964i(R.styleable.BottomNavigationView_elevation)) {
            C0538w.m1839a(this, m7100b.m958e(R.styleable.BottomNavigationView_elevation, 0));
        }
        C0546a.m1922a(getBackground().mutate(), C2221d.m7046a(context2, m7100b, R.styleable.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(m7100b.m953c(R.styleable.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(m7100b.m949a(R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int m962g = m7100b.m962g(R.styleable.BottomNavigationView_itemBackground, 0);
        if (m962g != 0) {
            this.f9243a.setItemBackgroundRes(m962g);
        } else {
            setItemRippleColor(C2221d.m7046a(context2, m7100b, R.styleable.BottomNavigationView_itemRippleColor));
        }
        if (m7100b.m964i(R.styleable.BottomNavigationView_menu)) {
            int m962g2 = m7100b.m962g(R.styleable.BottomNavigationView_menu, 0);
            this.f9245d.m6475b(true);
            getMenuInflater().inflate(m962g2, this.f9244c);
            this.f9245d.m6475b(false);
            this.f9245d.mo387a(true);
        }
        m7100b.m952b();
        addView(this.f9243a, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            View view = new View(context2);
            view.setBackgroundColor(C0420a.m1488c(context2, R.color.design_bottom_navigation_shadow_color));
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
            addView(view);
        }
        this.f9244c.mo395a(new C2087e(this));
        C2250as.m7111a(this, new C2088f(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2299l.m7293a(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C2299l.m7294a(this, f);
    }

    public void setOnNavigationItemSelectedListener(InterfaceC2090h interfaceC2090h) {
        this.f9248g = interfaceC2090h;
    }

    public void setOnNavigationItemReselectedListener(InterfaceC2089g interfaceC2089g) {
        this.f9249h = interfaceC2089g;
    }

    public Menu getMenu() {
        return this.f9244c;
    }

    public ColorStateList getItemIconTintList() {
        return this.f9243a.getIconTintList();
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f9243a.setIconTintList(colorStateList);
    }

    public void setItemIconSize(int i) {
        this.f9243a.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public int getItemIconSize() {
        return this.f9243a.getItemIconSize();
    }

    public ColorStateList getItemTextColor() {
        return this.f9243a.getItemTextColor();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f9243a.setItemTextColor(colorStateList);
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f9243a.getItemBackgroundRes();
    }

    public void setItemBackgroundResource(int i) {
        this.f9243a.setItemBackgroundRes(i);
        this.f9246e = null;
    }

    public Drawable getItemBackground() {
        return this.f9243a.getItemBackground();
    }

    public void setItemBackground(Drawable drawable) {
        this.f9243a.setItemBackground(drawable);
        this.f9246e = null;
    }

    public ColorStateList getItemRippleColor() {
        return this.f9246e;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f9246e == colorStateList) {
            if (colorStateList != null || this.f9243a.getItemBackground() == null) {
                return;
            }
            this.f9243a.setItemBackground(null);
            return;
        }
        this.f9246e = colorStateList;
        if (colorStateList == null) {
            this.f9243a.setItemBackground(null);
            return;
        }
        ColorStateList m7064a = C2229c.m7064a(colorStateList);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f9243a.setItemBackground(new RippleDrawable(m7064a, null, null));
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(1.0E-5f);
        Drawable m1933f = C0546a.m1933f(gradientDrawable);
        C0546a.m1922a(m1933f, m7064a);
        this.f9243a.setItemBackground(m1933f);
    }

    public int getSelectedItemId() {
        return this.f9243a.getSelectedItemId();
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f9244c.findItem(i);
        if (findItem == null || this.f9244c.m454a(findItem, this.f9245d, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f9243a.getLabelVisibilityMode() != i) {
            this.f9243a.setLabelVisibilityMode(i);
            this.f9245d.mo387a(false);
        }
    }

    public int getLabelVisibilityMode() {
        return this.f9243a.getLabelVisibilityMode();
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f9243a.setItemTextAppearanceInactive(i);
    }

    public int getItemTextAppearanceInactive() {
        return this.f9243a.getItemTextAppearanceInactive();
    }

    public void setItemTextAppearanceActive(int i) {
        this.f9243a.setItemTextAppearanceActive(i);
    }

    public int getItemTextAppearanceActive() {
        return this.f9243a.getItemTextAppearanceActive();
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f9243a.m6469a() != z) {
            this.f9243a.setItemHorizontalTranslationEnabled(z);
            this.f9245d.mo387a(false);
        }
    }

    private MenuInflater getMenuInflater() {
        if (this.f9247f == null) {
            this.f9247f = new C0135i(getContext());
        }
        return this.f9247f;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9250a = new Bundle();
        this.f9244c.m448a(savedState.f9250a);
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
        this.f9244c.m456b(savedState.f9250a);
    }

    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2091i();

        /* renamed from: a */
        Bundle f9250a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9250a = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f9250a);
        }
    }
}
