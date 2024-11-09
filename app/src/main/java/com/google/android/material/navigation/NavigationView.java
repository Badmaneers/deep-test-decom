package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.view.C0135i;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.widget.C0276dn;
import androidx.core.content.C0420a;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0538w;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2263h;
import com.google.android.material.internal.C2265j;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2299l;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.theme.p084a.C2402a;

/* loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: d */
    private static final int[] f10195d = {R.attr.state_checked};

    /* renamed from: e */
    private static final int[] f10196e = {-16842910};

    /* renamed from: f */
    private static final int f10197f = com.google.android.material.R.style.Widget_Design_NavigationView;

    /* renamed from: c */
    InterfaceC2318c f10198c;

    /* renamed from: g */
    private final C2263h f10199g;

    /* renamed from: h */
    private final C2265j f10200h;

    /* renamed from: i */
    private final int f10201i;

    /* renamed from: j */
    private final int[] f10202j;

    /* renamed from: k */
    private MenuInflater f10203k;

    /* renamed from: l */
    private ViewTreeObserver.OnGlobalLayoutListener f10204l;

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f10197f), attributeSet, i);
        ColorStateList m7383a;
        boolean z;
        int i2;
        this.f10200h = new C2265j();
        this.f10202j = new int[2];
        Context context2 = getContext();
        this.f10199g = new C2263h(context2);
        C0276dn m7100b = C2243al.m7100b(context2, attributeSet, com.google.android.material.R.styleable.NavigationView, i, f10197f, new int[0]);
        if (m7100b.m964i(com.google.android.material.R.styleable.NavigationView_android_background)) {
            C0538w.m1846a(this, m7100b.m948a(com.google.android.material.R.styleable.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            C2295h c2295h = new C2295h();
            if (background instanceof ColorDrawable) {
                c2295h.m7282g(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c2295h.m7276a(context2);
            C0538w.m1846a(this, c2295h);
        }
        if (m7100b.m964i(com.google.android.material.R.styleable.NavigationView_elevation)) {
            setElevation(m7100b.m958e(com.google.android.material.R.styleable.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(m7100b.m949a(com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.f10201i = m7100b.m958e(com.google.android.material.R.styleable.NavigationView_android_maxWidth, 0);
        if (m7100b.m964i(com.google.android.material.R.styleable.NavigationView_itemIconTint)) {
            m7383a = m7100b.m960f(com.google.android.material.R.styleable.NavigationView_itemIconTint);
        } else {
            m7383a = m7383a(R.attr.textColorSecondary);
        }
        if (m7100b.m964i(com.google.android.material.R.styleable.NavigationView_itemTextAppearance)) {
            i2 = m7100b.m962g(com.google.android.material.R.styleable.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        if (m7100b.m964i(com.google.android.material.R.styleable.NavigationView_itemIconSize)) {
            setItemIconSize(m7100b.m958e(com.google.android.material.R.styleable.NavigationView_itemIconSize, 0));
        }
        ColorStateList m960f = m7100b.m964i(com.google.android.material.R.styleable.NavigationView_itemTextColor) ? m7100b.m960f(com.google.android.material.R.styleable.NavigationView_itemTextColor) : null;
        if (!z && m960f == null) {
            m960f = m7383a(R.attr.textColorPrimary);
        }
        Drawable m948a = m7100b.m948a(com.google.android.material.R.styleable.NavigationView_itemBackground);
        if (m948a == null) {
            if (m7100b.m964i(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance) || m7100b.m964i(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay)) {
                C2295h c2295h2 = new C2295h(C2303p.m7298a(getContext(), m7100b.m962g(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0), m7100b.m962g(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).m7327a());
                c2295h2.m7282g(C2221d.m7046a(getContext(), m7100b, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
                m948a = new InsetDrawable((Drawable) c2295h2, m7100b.m958e(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), m7100b.m958e(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), m7100b.m958e(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), m7100b.m958e(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
            }
        }
        if (m7100b.m964i(com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding)) {
            this.f10200h.m7195c(m7100b.m958e(com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding, 0));
        }
        int m958e = m7100b.m958e(com.google.android.material.R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(m7100b.m946a(com.google.android.material.R.styleable.NavigationView_itemMaxLines, 1));
        this.f10199g.mo395a(new C2316a(this));
        this.f10200h.m7187a();
        this.f10200h.mo357a(context2, this.f10199g);
        this.f10200h.m7188a(m7383a);
        this.f10200h.m7203g(getOverScrollMode());
        if (z) {
            this.f10200h.m7192b(i2);
        }
        this.f10200h.m7193b(m960f);
        this.f10200h.m7189a(m948a);
        this.f10200h.m7198d(m958e);
        this.f10199g.m450a(this.f10200h);
        addView((View) this.f10200h.m7186a(this));
        if (m7100b.m964i(com.google.android.material.R.styleable.NavigationView_menu)) {
            int m962g = m7100b.m962g(com.google.android.material.R.styleable.NavigationView_menu, 0);
            this.f10200h.m7194b(true);
            getMenuInflater().inflate(m962g, this.f10199g);
            this.f10200h.m7194b(false);
            this.f10200h.mo387a(false);
        }
        if (m7100b.m964i(com.google.android.material.R.styleable.NavigationView_headerLayout)) {
            this.f10200h.m7185a(m7100b.m962g(com.google.android.material.R.styleable.NavigationView_headerLayout, 0));
        }
        m7100b.m952b();
        this.f10204l = new ViewTreeObserverOnGlobalLayoutListenerC2317b(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f10204l);
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        if (this.f10200h != null) {
            this.f10200h.m7203g(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2299l.m7293a(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C2299l.m7294a(this, f);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10205a = new Bundle();
        this.f10199g.m448a(savedState.f10205a);
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
        this.f10199g.m456b(savedState.f10205a);
    }

    public void setNavigationItemSelectedListener(InterfaceC2318c interfaceC2318c) {
        this.f10198c = interfaceC2318c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f10201i), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f10201i, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    /* renamed from: a */
    public final void mo7074a(C0514ao c0514ao) {
        this.f10200h.m7191a(c0514ao);
    }

    public Menu getMenu() {
        return this.f10199g;
    }

    public int getHeaderCount() {
        return this.f10200h.m7199e();
    }

    public ColorStateList getItemIconTintList() {
        return this.f10200h.m7202g();
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f10200h.m7188a(colorStateList);
    }

    public ColorStateList getItemTextColor() {
        return this.f10200h.m7204h();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f10200h.m7193b(colorStateList);
    }

    public Drawable getItemBackground() {
        return this.f10200h.m7205i();
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0420a.m1483a(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        this.f10200h.m7189a(drawable);
    }

    public int getItemHorizontalPadding() {
        return this.f10200h.m7206j();
    }

    public void setItemHorizontalPadding(int i) {
        this.f10200h.m7195c(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f10200h.m7195c(getResources().getDimensionPixelSize(i));
    }

    public int getItemIconPadding() {
        return this.f10200h.m7207k();
    }

    public void setItemIconPadding(int i) {
        this.f10200h.m7198d(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f10200h.m7198d(getResources().getDimensionPixelSize(i));
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f10199g.findItem(i);
        if (findItem != null) {
            this.f10200h.m7190a((C0172s) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f10199g.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f10200h.m7190a((C0172s) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public MenuItem getCheckedItem() {
        return this.f10200h.m7197d();
    }

    public void setItemTextAppearance(int i) {
        this.f10200h.m7192b(i);
    }

    public void setItemIconSize(int i) {
        this.f10200h.m7201f(i);
    }

    public void setItemMaxLines(int i) {
        this.f10200h.m7200e(i);
    }

    public int getItemMaxLines() {
        return this.f10200h.m7208l();
    }

    private MenuInflater getMenuInflater() {
        if (this.f10203k == null) {
            this.f10203k = new C0135i(getContext());
        }
        return this.f10203k;
    }

    /* renamed from: a */
    private ColorStateList m7383a(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList m45a = C0057a.m45a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = m45a.getDefaultColor();
        return new ColorStateList(new int[][]{f10196e, f10195d, EMPTY_STATE_SET}, new int[]{m45a.getColorForState(f10196e, defaultColor), i2, defaultColor});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f10204l);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f10204l);
        }
    }

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2319d();

        /* renamed from: a */
        public Bundle f10205a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10205a = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f10205a);
        }
    }
}
