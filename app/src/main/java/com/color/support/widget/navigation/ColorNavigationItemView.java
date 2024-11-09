package com.color.support.widget.navigation;

import android.R;
import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0147ag;
import androidx.appcompat.widget.C0287dy;
import androidx.core.content.C0420a;
import androidx.core.p024g.C0536u;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p026b.C0517b;
import com.color.support.util.C1342g;
import com.color.support.widget.ColorHintRedDot;

/* loaded from: classes.dex */
public class ColorNavigationItemView extends FrameLayout implements InterfaceC0147ag {

    /* renamed from: a */
    private static final int[] f7444a = {R.attr.state_checked};

    /* renamed from: b */
    private final float f7445b;

    /* renamed from: c */
    private final float f7446c;

    /* renamed from: d */
    private final float f7447d;

    /* renamed from: e */
    private final float f7448e;

    /* renamed from: f */
    private final TextView f7449f;

    /* renamed from: g */
    private int f7450g;

    /* renamed from: h */
    private ImageView f7451h;

    /* renamed from: i */
    private C0172s f7452i;

    /* renamed from: j */
    private ColorStateList f7453j;

    /* renamed from: k */
    private ColorStateList f7454k;

    /* renamed from: l */
    private ColorHintRedDot f7455l;

    /* renamed from: m */
    private Animator f7456m;

    /* renamed from: n */
    private Animator f7457n;

    /* renamed from: o */
    private ScaleAnimation f7458o;

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    /* renamed from: a */
    public final boolean mo339a() {
        return false;
    }

    public ColorNavigationItemView(Context context) {
        this(context, null);
    }

    public ColorNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7445b = 0.0f;
        this.f7446c = 1.0f;
        this.f7447d = 0.3f;
        this.f7448e = 0.5f;
        this.f7450g = -1;
        View inflate = LayoutInflater.from(context).inflate(C1342g.m4385a(context) ? color.support.p043v7.appcompat.R.layout.color_navigation_item_layout : color.support.p043v7.appcompat.R.layout.color_navigation_item_layout_land, (ViewGroup) this, true);
        this.f7451h = (ImageView) inflate.findViewById(color.support.p043v7.appcompat.R.id.icon);
        this.f7449f = (TextView) inflate.findViewById(color.support.p043v7.appcompat.R.id.normalLable);
        this.f7455l = (ColorHintRedDot) inflate.findViewById(color.support.p043v7.appcompat.R.id.tips);
        setWillNotDraw(false);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    /* renamed from: a */
    public final void mo338a(C0172s c0172s) {
        this.f7452i = c0172s;
        setCheckable(c0172s.isCheckable());
        setChecked(c0172s.isChecked());
        setEnabled(c0172s.isEnabled());
        setIcon(c0172s.getIcon());
        setTitle(c0172s.getTitle());
        setId(c0172s.getItemId());
        if (Build.VERSION.SDK_INT >= 26) {
            setContentDescription(c0172s.getContentDescription());
            C0287dy.m973a(this, c0172s.getTooltipText());
        }
    }

    public void setItemPosition(int i) {
        this.f7450g = i;
    }

    public int getItemPosition() {
        return this.f7450g;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0147ag
    public C0172s getItemData() {
        return this.f7452i;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null || charSequence.toString().isEmpty()) {
            this.f7449f.setVisibility(8);
        } else {
            this.f7449f.setVisibility(0);
            this.f7449f.setText(charSequence);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f7451h.setSelected(z);
        this.f7449f.setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f7451h.setEnabled(z);
        this.f7449f.setEnabled(z);
        if (z) {
            C0538w.m1851a(this, C0536u.m1815a(getContext()));
        } else {
            C0538w.m1851a(this, (C0536u) null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f7452i != null && this.f7452i.isCheckable() && this.f7452i.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f7444a);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Context context = getContext();
        boolean z = false;
        if (context != null && Build.VERSION.SDK_INT > 16 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
            z = true;
        }
        int left = z ? this.f7451h.getLeft() - (this.f7455l.getWidth() / 2) : (this.f7451h.getLeft() - (this.f7455l.getWidth() / 2)) + this.f7451h.getWidth();
        int top = this.f7451h.getTop() - (this.f7455l.getHeight() / 2);
        this.f7455l.setX(left);
        this.f7455l.setY(top);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            this.f7451h.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 21 ? drawable instanceof StateListDrawable : false) {
                int[] iArr = new int[1];
                iArr[0] = (this.f7452i.isChecked() ? 1 : -1) * R.attr.state_checked;
                this.f7451h.setImageState(iArr, true);
            }
        } else {
            this.f7451h.setVisibility(8);
            this.f7449f.setMaxLines(2);
        }
        this.f7451h.setImageDrawable(drawable);
    }

    @Deprecated
    public void setIconTintList(ColorStateList colorStateList) {
        this.f7453j = colorStateList;
        if (this.f7452i != null) {
            setIcon(this.f7452i.getIcon());
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        this.f7454k = colorStateList;
        this.f7449f.setTextColor(colorStateList);
    }

    public void setTextSize(int i) {
        this.f7449f.setTextSize(0, i);
    }

    public void setItemBackground(int i) {
        C0538w.m1846a(this, i == 0 ? null : C0420a.m1483a(getContext(), i));
    }

    public void setMaxTextWidth(int i) {
        if (i <= 0) {
            return;
        }
        this.f7449f.setMaxWidth(i);
    }

    public TextView getTextView() {
        return this.f7449f;
    }

    /* renamed from: a */
    public final void m5291a(int i, int i2) {
        if (i2 < 0) {
            return;
        }
        if (i2 == 3) {
            if (this.f7455l.getVisibility() == 8) {
                return;
            }
            if (this.f7458o == null) {
                this.f7458o = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                this.f7458o.setDuration(400L);
                if (Build.VERSION.SDK_INT > 21) {
                    this.f7458o.setInterpolator(C0517b.m1773a(1.0f, 0.4f, 0.0f, 0.0f));
                }
                this.f7458o.setAnimationListener(new AnimationAnimationListenerC1569b(this));
            }
            this.f7455l.startAnimation(this.f7458o);
            return;
        }
        if (i2 == 1) {
            this.f7455l.setPointMode(1);
            this.f7455l.setVisibility(0);
        } else if (i2 == 2) {
            this.f7455l.setPointNumber(i);
            this.f7455l.setPointMode(2);
            this.f7455l.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void m5292b() {
        if (this.f7456m == null) {
            m5290d();
        }
        this.f7456m.start();
    }

    /* renamed from: c */
    public final void m5293c() {
        if (this.f7457n == null) {
            m5290d();
        }
        this.f7457n.start();
    }

    /* renamed from: d */
    private void m5290d() {
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.3f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.5f, 0.5f);
        this.f7456m = ObjectAnimator.ofPropertyValuesHolder(this.f7449f, PropertyValuesHolder.ofKeyframe(View.ALPHA, ofFloat, ofFloat2, Keyframe.ofFloat(1.0f, 1.0f)));
        this.f7456m.setInterpolator(new AccelerateInterpolator());
        this.f7456m.setDuration(300L);
        this.f7457n = ObjectAnimator.ofPropertyValuesHolder(this.f7449f, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 1.0f), ofFloat2, Keyframe.ofFloat(1.0f, 0.3f)));
        this.f7457n.setInterpolator(new AccelerateInterpolator());
        this.f7457n.setDuration(300L);
        this.f7457n.addListener(new C1568a(this));
    }
}
