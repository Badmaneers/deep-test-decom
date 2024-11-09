package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0147ag;
import androidx.appcompat.widget.C0227bs;
import androidx.appcompat.widget.C0287dy;
import androidx.core.content.p020a.C0431k;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.C0538w;
import androidx.core.widget.C0577o;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC0147ag {

    /* renamed from: d */
    private static final int[] f9884d = {R.attr.state_checked};

    /* renamed from: c */
    boolean f9885c;

    /* renamed from: e */
    private int f9886e;

    /* renamed from: f */
    private boolean f9887f;

    /* renamed from: g */
    private final CheckedTextView f9888g;

    /* renamed from: h */
    private FrameLayout f9889h;

    /* renamed from: i */
    private C0172s f9890i;

    /* renamed from: j */
    private ColorStateList f9891j;

    /* renamed from: k */
    private boolean f9892k;

    /* renamed from: l */
    private Drawable f9893l;

    /* renamed from: m */
    private final C0479a f9894m;

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    /* renamed from: a */
    public final boolean mo339a() {
        return false;
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9894m = new C2264i(this);
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_navigation_icon_size));
        this.f9888g = (CheckedTextView) findViewById(com.google.android.material.R.id.design_menu_item_text);
        this.f9888g.setDuplicateParentStateEnabled(true);
        C0538w.m1849a(this.f9888g, this.f9894m);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    /* renamed from: a */
    public final void mo338a(C0172s c0172s) {
        StateListDrawable stateListDrawable;
        this.f9890i = c0172s;
        if (c0172s.getItemId() > 0) {
            setId(c0172s.getItemId());
        }
        setVisibility(c0172s.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f9884d, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            C0538w.m1846a(this, stateListDrawable);
        }
        setCheckable(c0172s.isCheckable());
        setChecked(c0172s.isChecked());
        setEnabled(c0172s.isEnabled());
        setTitle(c0172s.getTitle());
        setIcon(c0172s.getIcon());
        setActionView(c0172s.getActionView());
        setContentDescription(c0172s.getContentDescription());
        C0287dy.m973a(this, c0172s.getTooltipText());
        if (this.f9890i.getTitle() == null && this.f9890i.getIcon() == null && this.f9890i.getActionView() != null) {
            this.f9888g.setVisibility(8);
            if (this.f9889h != null) {
                C0227bs c0227bs = (C0227bs) this.f9889h.getLayoutParams();
                c0227bs.width = -1;
                this.f9889h.setLayoutParams(c0227bs);
                return;
            }
            return;
        }
        this.f9888g.setVisibility(0);
        if (this.f9889h != null) {
            C0227bs c0227bs2 = (C0227bs) this.f9889h.getLayoutParams();
            c0227bs2.width = -2;
            this.f9889h.setLayoutParams(c0227bs2);
        }
    }

    /* renamed from: b */
    public final void m7073b() {
        if (this.f9889h != null) {
            this.f9889h.removeAllViews();
        }
        this.f9888g.setCompoundDrawables(null, null, null, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f9889h == null) {
                this.f9889h = (FrameLayout) ((ViewStub) findViewById(com.google.android.material.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f9889h.removeAllViews();
            this.f9889h.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    public C0172s getItemData() {
        return this.f9890i;
    }

    public void setTitle(CharSequence charSequence) {
        this.f9888g.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f9885c != z) {
            this.f9885c = z;
            this.f9894m.mo1624a(this.f9888g, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f9888g.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f9892k) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0546a.m1933f(drawable).mutate();
                C0546a.m1922a(drawable, this.f9891j);
            }
            drawable.setBounds(0, 0, this.f9886e, this.f9886e);
        } else if (this.f9887f) {
            if (this.f9893l == null) {
                this.f9893l = C0431k.m1529a(getResources(), com.google.android.material.R.drawable.navigation_empty_icon, getContext().getTheme());
                if (this.f9893l != null) {
                    this.f9893l.setBounds(0, 0, this.f9886e, this.f9886e);
                }
            }
            drawable = this.f9893l;
        }
        C0577o.m2049a(this.f9888g, drawable, null, null, null);
    }

    public void setIconSize(int i) {
        this.f9886e = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f9890i != null && this.f9890i.isCheckable() && this.f9890i.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f9884d);
        }
        return onCreateDrawableState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f9891j = colorStateList;
        this.f9892k = this.f9891j != null;
        if (this.f9890i != null) {
            setIcon(this.f9890i.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        C0577o.m2048a(this.f9888g, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f9888g.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f9887f = z;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIconPadding(int i) {
        this.f9888g.setCompoundDrawablePadding(i);
    }

    public void setMaxLines(int i) {
        this.f9888g.setMaxLines(i);
    }
}
