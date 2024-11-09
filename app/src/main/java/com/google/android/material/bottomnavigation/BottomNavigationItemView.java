package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0147ag;
import androidx.appcompat.widget.C0287dy;
import androidx.core.content.C0420a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0536u;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;
import androidx.core.p024g.p025a.C0485f;
import androidx.core.widget.C0577o;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C2065b;

/* loaded from: classes.dex */
public class BottomNavigationItemView extends FrameLayout implements InterfaceC0147ag {

    /* renamed from: a */
    private static final int[] f9193a = {R.attr.state_checked};

    /* renamed from: b */
    private final int f9194b;

    /* renamed from: c */
    private float f9195c;

    /* renamed from: d */
    private float f9196d;

    /* renamed from: e */
    private float f9197e;

    /* renamed from: f */
    private int f9198f;

    /* renamed from: g */
    private boolean f9199g;

    /* renamed from: h */
    private ImageView f9200h;

    /* renamed from: i */
    private final TextView f9201i;

    /* renamed from: j */
    private final TextView f9202j;

    /* renamed from: k */
    private int f9203k;

    /* renamed from: l */
    private C0172s f9204l;

    /* renamed from: m */
    private ColorStateList f9205m;

    /* renamed from: n */
    private Drawable f9206n;

    /* renamed from: o */
    private Drawable f9207o;

    /* renamed from: p */
    private BadgeDrawable f9208p;

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    /* renamed from: a */
    public final boolean mo339a() {
        return false;
    }

    public BottomNavigationItemView(Context context) {
        this(context, null);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9203k = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(com.google.android.material.R.drawable.design_bottom_navigation_item_background);
        this.f9194b = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_margin);
        this.f9200h = (ImageView) findViewById(com.google.android.material.R.id.icon);
        this.f9201i = (TextView) findViewById(com.google.android.material.R.id.smallLabel);
        this.f9202j = (TextView) findViewById(com.google.android.material.R.id.largeLabel);
        C0538w.m1840a((View) this.f9201i, 2);
        C0538w.m1840a((View) this.f9202j, 2);
        setFocusable(true);
        m6459a(this.f9201i.getTextSize(), this.f9202j.getTextSize());
        if (this.f9200h != null) {
            this.f9200h.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2083a(this));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    /* renamed from: a */
    public final void mo338a(C0172s c0172s) {
        CharSequence title;
        this.f9204l = c0172s;
        setCheckable(c0172s.isCheckable());
        setChecked(c0172s.isChecked());
        setEnabled(c0172s.isEnabled());
        setIcon(c0172s.getIcon());
        setTitle(c0172s.getTitle());
        setId(c0172s.getItemId());
        if (!TextUtils.isEmpty(c0172s.getContentDescription())) {
            setContentDescription(c0172s.getContentDescription());
        }
        if (!TextUtils.isEmpty(c0172s.getTooltipText())) {
            title = c0172s.getTooltipText();
        } else {
            title = c0172s.getTitle();
        }
        C0287dy.m973a(this, title);
        setVisibility(c0172s.isVisible() ? 0 : 8);
    }

    public void setItemPosition(int i) {
        this.f9203k = i;
    }

    public int getItemPosition() {
        return this.f9203k;
    }

    public void setShifting(boolean z) {
        if (this.f9199g != z) {
            this.f9199g = z;
            if (this.f9204l != null) {
                setChecked(this.f9204l.isChecked());
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f9198f != i) {
            this.f9198f = i;
            if (this.f9204l != null) {
                setChecked(this.f9204l.isChecked());
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    public C0172s getItemData() {
        return this.f9204l;
    }

    public void setTitle(CharSequence charSequence) {
        this.f9201i.setText(charSequence);
        this.f9202j.setText(charSequence);
        if (this.f9204l == null || TextUtils.isEmpty(this.f9204l.getContentDescription())) {
            setContentDescription(charSequence);
        }
        if (this.f9204l != null && !TextUtils.isEmpty(this.f9204l.getTooltipText())) {
            charSequence = this.f9204l.getTooltipText();
        }
        C0287dy.m973a(this, charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        this.f9202j.setPivotX(this.f9202j.getWidth() / 2);
        this.f9202j.setPivotY(this.f9202j.getBaseline());
        this.f9201i.setPivotX(this.f9201i.getWidth() / 2);
        this.f9201i.setPivotY(this.f9201i.getBaseline());
        switch (this.f9198f) {
            case -1:
                if (!this.f9199g) {
                    if (z) {
                        m6461a(this.f9200h, (int) (this.f9194b + this.f9195c), 49);
                        m6460a(this.f9202j, 1.0f, 1.0f, 0);
                        m6460a(this.f9201i, this.f9196d, this.f9196d, 4);
                        break;
                    } else {
                        m6461a(this.f9200h, this.f9194b, 49);
                        m6460a(this.f9202j, this.f9197e, this.f9197e, 4);
                        m6460a(this.f9201i, 1.0f, 1.0f, 0);
                        break;
                    }
                } else {
                    if (z) {
                        m6461a(this.f9200h, this.f9194b, 49);
                        m6460a(this.f9202j, 1.0f, 1.0f, 0);
                    } else {
                        m6461a(this.f9200h, this.f9194b, 17);
                        m6460a(this.f9202j, 0.5f, 0.5f, 4);
                    }
                    this.f9201i.setVisibility(4);
                    break;
                }
            case 0:
                if (z) {
                    m6461a(this.f9200h, this.f9194b, 49);
                    m6460a(this.f9202j, 1.0f, 1.0f, 0);
                } else {
                    m6461a(this.f9200h, this.f9194b, 17);
                    m6460a(this.f9202j, 0.5f, 0.5f, 4);
                }
                this.f9201i.setVisibility(4);
                break;
            case 1:
                if (z) {
                    m6461a(this.f9200h, (int) (this.f9194b + this.f9195c), 49);
                    m6460a(this.f9202j, 1.0f, 1.0f, 0);
                    m6460a(this.f9201i, this.f9196d, this.f9196d, 4);
                    break;
                } else {
                    m6461a(this.f9200h, this.f9194b, 49);
                    m6460a(this.f9202j, this.f9197e, this.f9197e, 4);
                    m6460a(this.f9201i, 1.0f, 1.0f, 0);
                    break;
                }
            case 2:
                m6461a(this.f9200h, this.f9194b, 17);
                this.f9202j.setVisibility(8);
                this.f9201i.setVisibility(8);
                break;
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f9208p != null && this.f9208p.isVisible()) {
            CharSequence title = this.f9204l.getTitle();
            if (!TextUtils.isEmpty(this.f9204l.getContentDescription())) {
                title = this.f9204l.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f9208p.m6360c()));
        }
        C0482c m1635a = C0482c.m1635a(accessibilityNodeInfo);
        m1635a.m1661b(C0485f.m1715a(0, 1, getItemPosition(), 1, isSelected()));
        if (isSelected()) {
            m1635a.m1685h(false);
            m1635a.m1663b(C0483d.f2303e);
        }
        m1635a.m1687i("Tab");
    }

    /* renamed from: a */
    private static void m6461a(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static void m6460a(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f9201i.setEnabled(z);
        this.f9202j.setEnabled(z);
        this.f9200h.setEnabled(z);
        if (z) {
            C0538w.m1851a(this, C0536u.m1815a(getContext()));
        } else {
            C0538w.m1851a(this, (C0536u) null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f9204l != null && this.f9204l.isCheckable() && this.f9204l.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f9193a);
        }
        return onCreateDrawableState;
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f9206n) {
            return;
        }
        this.f9206n = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C0546a.m1933f(drawable).mutate();
            this.f9207o = drawable;
            if (this.f9205m != null) {
                C0546a.m1922a(this.f9207o, this.f9205m);
            }
        }
        this.f9200h.setImageDrawable(drawable);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f9205m = colorStateList;
        if (this.f9204l == null || this.f9207o == null) {
            return;
        }
        C0546a.m1922a(this.f9207o, this.f9205m);
        this.f9207o.invalidateSelf();
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9200h.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f9200h.setLayoutParams(layoutParams);
    }

    public void setTextAppearanceInactive(int i) {
        C0577o.m2048a(this.f9201i, i);
        m6459a(this.f9201i.getTextSize(), this.f9202j.getTextSize());
    }

    public void setTextAppearanceActive(int i) {
        C0577o.m2048a(this.f9202j, i);
        m6459a(this.f9201i.getTextSize(), this.f9202j.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f9201i.setTextColor(colorStateList);
            this.f9202j.setTextColor(colorStateList);
        }
    }

    /* renamed from: a */
    private void m6459a(float f, float f2) {
        this.f9195c = f - f2;
        this.f9196d = (f2 * 1.0f) / f;
        this.f9197e = (f * 1.0f) / f2;
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C0420a.m1483a(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C0538w.m1846a(this, drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadge(BadgeDrawable badgeDrawable) {
        this.f9208p = badgeDrawable;
        if (this.f9200h != null) {
            ImageView imageView = this.f9200h;
            if (!m6463c() || imageView == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            C2065b.m6382a(this.f9208p, imageView, m6457a(imageView));
        }
    }

    BadgeDrawable getBadge() {
        return this.f9208p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m6464b() {
        ImageView imageView = this.f9200h;
        if (m6463c()) {
            if (imageView != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C2065b.m6383b(this.f9208p, imageView, m6457a(imageView));
            }
            this.f9208p = null;
        }
    }

    /* renamed from: c */
    private boolean m6463c() {
        return this.f9208p != null;
    }

    /* renamed from: a */
    private FrameLayout m6457a(View view) {
        if (view == this.f9200h && C2065b.f9124a) {
            return (FrameLayout) this.f9200h.getParent();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m6462a(BottomNavigationItemView bottomNavigationItemView, View view) {
        if (bottomNavigationItemView.m6463c()) {
            C2065b.m6384c(bottomNavigationItemView.f9208p, view, bottomNavigationItemView.m6457a(view));
        }
    }
}
