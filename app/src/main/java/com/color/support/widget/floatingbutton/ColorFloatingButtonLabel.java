package com.color.support.widget.floatingbutton;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.p020a.C0431k;
import androidx.recyclerview.widget.RecyclerView;
import color.support.p043v7.appcompat.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.p082k.C2303p;

/* loaded from: classes.dex */
public class ColorFloatingButtonLabel extends LinearLayout {

    /* renamed from: a */
    private static final String f7221a = "ColorFloatingButtonLabel";

    /* renamed from: b */
    private TextView f7222b;

    /* renamed from: c */
    private ShapeableImageView f7223c;

    /* renamed from: d */
    private CardView f7224d;

    /* renamed from: e */
    private boolean f7225e;

    /* renamed from: f */
    private ColorFloatingButtonItem f7226f;

    /* renamed from: g */
    private InterfaceC1517l f7227g;

    /* renamed from: h */
    private float f7228h;

    /* renamed from: i */
    private PathInterpolator f7229i;

    /* renamed from: j */
    private PathInterpolator f7230j;

    public ColorFloatingButtonLabel(Context context) {
        super(context);
        this.f7229i = new PathInterpolator(0.25f, 0.1f, 0.1f, 1.0f);
        this.f7230j = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        m5130a(context, null);
    }

    public ColorFloatingButtonLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7229i = new PathInterpolator(0.25f, 0.1f, 0.1f, 1.0f);
        this.f7230j = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        m5130a(context, attributeSet);
    }

    public ColorFloatingButtonLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7229i = new PathInterpolator(0.25f, 0.1f, 0.1f, 1.0f);
        this.f7230j = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        m5130a(context, attributeSet);
    }

    @Override // android.view.View
    @SuppressLint({"RestrictedApi"})
    public void setVisibility(int i) {
        super.setVisibility(i);
        getChildColorFloatingButton().setVisibility(i);
        if (this.f7225e) {
            getColorFloatingButtonLabelBackground().setVisibility(i);
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        LinearLayout.LayoutParams layoutParams;
        super.setOrientation(i);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.color_floating_button_fab_normal_size);
        getContext().getResources().getDimensionPixelSize(R.dimen.color_floating_button_fab_side_margin);
        getContext().getResources().getDimensionPixelSize(R.dimen.color_floating_button_item_normal_bottom_margin);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f7223c.getLayoutParams();
        if (getOrientation() == 0) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
        } else {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dimensionPixelSize, -2);
            layoutParams3.gravity = 16;
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams = layoutParams3;
        }
        setLayoutParams(layoutParams);
        this.f7223c.setLayoutParams(layoutParams2);
        if (i == 1) {
            setLabelEnabled(false);
        } else {
            setLabel(this.f7222b.getText().toString());
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f7222b.setEnabled(z);
        this.f7223c.setEnabled(z);
        this.f7224d.setEnabled(z);
    }

    private void setLabelEnabled(boolean z) {
        this.f7225e = z;
        this.f7224d.setVisibility(z ? 0 : 8);
    }

    public TextView getColorFloatingButtonLabelText() {
        return this.f7222b;
    }

    public CardView getColorFloatingButtonLabelBackground() {
        return this.f7224d;
    }

    public ImageView getChildColorFloatingButton() {
        return this.f7223c;
    }

    public ColorFloatingButtonItem getColorFloatingButtonItem() {
        if (this.f7226f == null) {
            throw new IllegalStateException("SpeedDialActionItem not set yet!");
        }
        return this.f7226f;
    }

    public C1521p getColorFloatingButtonItemBuilder() {
        return new C1521p(getColorFloatingButtonItem());
    }

    public void setColorFloatingButtonItem(ColorFloatingButtonItem colorFloatingButtonItem) {
        this.f7226f = colorFloatingButtonItem;
        setId(colorFloatingButtonItem.m5120a());
        setLabel(colorFloatingButtonItem.m5121a(getContext()));
        getColorFloatingButtonItem();
        setFabIcon(colorFloatingButtonItem.m5123b(getContext()));
        ColorStateList m5122b = colorFloatingButtonItem.m5122b();
        if (m5122b == ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION)) {
            m5122b = C0431k.m1531b(getResources(), R.color.color_floating_button_label_background_color, getContext().getTheme());
        }
        setFabBackgroundColor(m5122b);
        ColorStateList m5124c = colorFloatingButtonItem.m5124c();
        if (m5124c == ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION)) {
            m5124c = C0431k.m1531b(getResources(), R.color.color_floating_button_label_text_color, getContext().getTheme());
        }
        setLabelTextColor(m5124c);
        ColorStateList m5126d = colorFloatingButtonItem.m5126d();
        if (m5126d == ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION)) {
            m5126d = C0431k.m1531b(getResources(), R.color.color_floating_button_label_background_color, getContext().getTheme());
        }
        setLabelBackgroundColor(m5126d);
        if (colorFloatingButtonItem.m5127e()) {
            this.f7223c.setOnTouchListener(new ViewOnTouchListenerC1526u(this));
        }
    }

    public void setOnActionSelectedListener(InterfaceC1517l interfaceC1517l) {
        this.f7227g = interfaceC1517l;
        if (this.f7227g != null) {
            getChildColorFloatingButton().setOnClickListener(new ViewOnClickListenerC1522q(this));
            getColorFloatingButtonLabelBackground().setOnClickListener(new ViewOnClickListenerC1523r(this));
        } else {
            getChildColorFloatingButton().setOnClickListener(null);
            getColorFloatingButtonLabelBackground().setOnClickListener(null);
        }
    }

    /* renamed from: a */
    private void m5130a(Context context, AttributeSet attributeSet) {
        View inflate = inflate(context, R.layout.color_floating_button_item_label, this);
        this.f7223c = (ShapeableImageView) inflate.findViewById(R.id.color_floating_button_child_fab);
        this.f7222b = (TextView) inflate.findViewById(R.id.color_floating_button_label);
        this.f7224d = (CardView) inflate.findViewById(R.id.color_floating_button_label_container);
        this.f7223c.setElevation(24.0f);
        this.f7223c.setOutlineProvider(new C1524s(this));
        this.f7223c.setShapeAppearanceModel(C2303p.m7297a().m7329a(C2303p.f10117a).m7327a());
        this.f7224d.setCardElevation(24.0f);
        this.f7224d.setOutlineProvider(new C1525t(this));
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorFloatingButtonLabel, 0, 0);
        try {
            try {
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.ColorFloatingButtonLabel_srcCompat, RecyclerView.UNDEFINED_DURATION);
                if (resourceId == Integer.MIN_VALUE) {
                    resourceId = obtainStyledAttributes.getResourceId(R.styleable.ColorFloatingButtonLabel_android_src, RecyclerView.UNDEFINED_DURATION);
                }
                C1521p c1521p = new C1521p(getId(), resourceId);
                c1521p.m5146a(obtainStyledAttributes.getString(R.styleable.ColorFloatingButtonLabel_fabLabel));
                c1521p.m5145a(ColorStateList.valueOf(obtainStyledAttributes.getColor(R.styleable.ColorFloatingButtonLabel_fabBackgroundColor, getResources().getColor(R.color.color_floating_button_label_background_color))));
                c1521p.m5147b(ColorStateList.valueOf(obtainStyledAttributes.getColor(R.styleable.ColorFloatingButtonLabel_fabLabelColor, RecyclerView.UNDEFINED_DURATION)));
                c1521p.m5148c(ColorStateList.valueOf(obtainStyledAttributes.getColor(R.styleable.ColorFloatingButtonLabel_fabLabelBackgroundColor, RecyclerView.UNDEFINED_DURATION)));
                setColorFloatingButtonItem(c1521p.m5144a());
            } catch (Exception e) {
                Log.e(f7221a, "Failure setting FabWithLabelView icon" + e.getMessage());
            }
            obtainStyledAttributes.recycle();
            setClipChildren(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void setFabIcon(Drawable drawable) {
        this.f7223c.setImageDrawable(drawable);
    }

    private void setLabel(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f7222b.setText(charSequence);
            setLabelEnabled(getOrientation() == 0);
        } else {
            setLabelEnabled(false);
        }
    }

    private void setFabBackgroundColor(ColorStateList colorStateList) {
        this.f7223c.setBackgroundTintList(colorStateList);
    }

    private void setLabelTextColor(ColorStateList colorStateList) {
        this.f7222b.setTextColor(colorStateList);
    }

    private void setLabelBackgroundColor(ColorStateList colorStateList) {
        if (colorStateList == ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION)) {
            this.f7224d.setCardBackgroundColor(0);
            this.f7228h = this.f7224d.getElevation();
            this.f7224d.setElevation(0.0f);
        } else {
            this.f7224d.setCardBackgroundColor(colorStateList);
            if (this.f7228h != 0.0f) {
                this.f7224d.setElevation(this.f7228h);
                this.f7228h = 0.0f;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m5131b(ColorFloatingButtonLabel colorFloatingButtonLabel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(colorFloatingButtonLabel.f7223c, "scaleX", 1.0f, 1.1f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(colorFloatingButtonLabel.f7223c, "scaleY", 1.0f, 1.1f);
        ofFloat.setInterpolator(colorFloatingButtonLabel.f7229i);
        ofFloat2.setInterpolator(colorFloatingButtonLabel.f7229i);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(66L);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m5132c(ColorFloatingButtonLabel colorFloatingButtonLabel) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(colorFloatingButtonLabel.f7223c, "scaleX", 1.1f, 1.0f), ObjectAnimator.ofFloat(colorFloatingButtonLabel.f7223c, "scaleY", 1.1f, 1.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(colorFloatingButtonLabel.f7230j);
        animatorSet.start();
    }
}
