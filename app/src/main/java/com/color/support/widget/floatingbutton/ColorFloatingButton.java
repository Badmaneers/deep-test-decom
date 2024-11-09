package com.color.support.widget.floatingbutton;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.coordinatorlayout.widget.AbstractC0391c;
import androidx.coordinatorlayout.widget.C0394f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p024g.C0538w;
import androidx.dynamicanimation.p031a.AbstractC0619i;
import androidx.dynamicanimation.p031a.C0610ab;
import androidx.recyclerview.widget.RecyclerView;
import color.support.p043v7.appcompat.R;
import com.coloros.neton.BuildConfig;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.AbstractC2206p;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.p082k.C2303p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class ColorFloatingButton extends LinearLayout {

    /* renamed from: a */
    private static final String f7177a = "ColorFloatingButton";

    /* renamed from: b */
    private final InstanceState f7178b;

    /* renamed from: c */
    private List<ColorFloatingButtonLabel> f7179c;

    /* renamed from: d */
    private Drawable f7180d;

    /* renamed from: e */
    private ShapeableImageView f7181e;

    /* renamed from: f */
    private float f7182f;

    /* renamed from: g */
    private int f7183g;

    /* renamed from: h */
    private int f7184h;

    /* renamed from: i */
    private Runnable f7185i;

    /* renamed from: j */
    private PathInterpolator f7186j;

    /* renamed from: k */
    private PathInterpolator f7187k;

    /* renamed from: l */
    private PathInterpolator f7188l;

    /* renamed from: m */
    private PathInterpolator f7189m;

    /* renamed from: n */
    private PathInterpolator f7190n;

    /* renamed from: o */
    private PathInterpolator f7191o;

    /* renamed from: p */
    private PathInterpolator f7192p;

    /* renamed from: q */
    private PathInterpolator f7193q;

    /* renamed from: r */
    private PathInterpolator f7194r;

    /* renamed from: s */
    private PathInterpolator f7195s;

    /* renamed from: t */
    private InterfaceC1518m f7196t;

    /* renamed from: u */
    private InterfaceC1517l f7197u;

    /* renamed from: v */
    private InterfaceC1517l f7198v;

    /* renamed from: w */
    private InterfaceC1517l f7199w;

    public ColorFloatingButton(Context context) {
        super(context);
        this.f7178b = new InstanceState();
        this.f7179c = new ArrayList();
        this.f7180d = null;
        this.f7186j = new PathInterpolator(0.25f, 0.1f, 0.1f, 1.0f);
        this.f7187k = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7188l = new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f);
        this.f7189m = new PathInterpolator(0.0f, 0.0f, 0.15f, 1.0f);
        this.f7190n = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7191o = new PathInterpolator(0.3f, 0.0f, 0.2f, 1.0f);
        this.f7192p = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7193q = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7194r = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7195s = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7199w = new C1506a(this);
        m5059a(context, (AttributeSet) null);
    }

    public ColorFloatingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7178b = new InstanceState();
        this.f7179c = new ArrayList();
        this.f7180d = null;
        this.f7186j = new PathInterpolator(0.25f, 0.1f, 0.1f, 1.0f);
        this.f7187k = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7188l = new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f);
        this.f7189m = new PathInterpolator(0.0f, 0.0f, 0.15f, 1.0f);
        this.f7190n = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7191o = new PathInterpolator(0.3f, 0.0f, 0.2f, 1.0f);
        this.f7192p = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7193q = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7194r = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7195s = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7199w = new C1506a(this);
        m5059a(context, attributeSet);
    }

    public ColorFloatingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7178b = new InstanceState();
        this.f7179c = new ArrayList();
        this.f7180d = null;
        this.f7186j = new PathInterpolator(0.25f, 0.1f, 0.1f, 1.0f);
        this.f7187k = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7188l = new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f);
        this.f7189m = new PathInterpolator(0.0f, 0.0f, 0.15f, 1.0f);
        this.f7190n = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7191o = new PathInterpolator(0.3f, 0.0f, 0.2f, 1.0f);
        this.f7192p = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7193q = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7194r = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7195s = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f7199w = new C1506a(this);
        m5059a(context, attributeSet);
    }

    /* renamed from: j */
    private void m5078j() {
        setOrientation(1);
        Iterator<ColorFloatingButtonLabel> it = this.f7179c.iterator();
        while (it.hasNext()) {
            it.next().setOrientation(0);
        }
        m5085c();
        ArrayList<ColorFloatingButtonItem> actionItems = getActionItems();
        Iterator<ColorFloatingButtonLabel> it2 = this.f7179c.iterator();
        while (it2.hasNext()) {
            m5053a(it2.next(), it2);
        }
        m5058a(actionItems);
    }

    /* renamed from: a */
    private Collection<ColorFloatingButtonLabel> m5058a(Collection<ColorFloatingButtonItem> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<ColorFloatingButtonItem> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m5054a(it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private ColorFloatingButtonLabel m5054a(ColorFloatingButtonItem colorFloatingButtonItem) {
        return m5055a(colorFloatingButtonItem, this.f7179c.size());
    }

    /* renamed from: a */
    private ColorFloatingButtonLabel m5055a(ColorFloatingButtonItem colorFloatingButtonItem, int i) {
        ColorFloatingButtonLabel m5066b = m5066b(colorFloatingButtonItem.m5120a());
        if (m5066b != null) {
            return m5056a(m5066b.getColorFloatingButtonItem(), colorFloatingButtonItem);
        }
        ColorFloatingButtonLabel m5125c = colorFloatingButtonItem.m5125c(getContext());
        m5125c.setOrientation(getOrientation() == 1 ? 0 : 1);
        m5125c.setOnActionSelectedListener(this.f7199w);
        int m5051a = m5051a(i);
        if (i == 0) {
            m5125c.setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.color_floating_button_item_first_bottom_margin));
            addView(m5125c, m5051a);
        } else {
            m5125c.setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.color_floating_button_item_normal_bottom_margin));
            addView(m5125c, m5051a);
        }
        this.f7179c.add(i, m5125c);
        m5062a(m5125c, 0, i, ResponseCode.CODE_3XX_MULTIPLE_CHOICES, false);
        return m5125c;
    }

    /* renamed from: a */
    private ColorFloatingButtonLabel m5056a(ColorFloatingButtonItem colorFloatingButtonItem, ColorFloatingButtonItem colorFloatingButtonItem2) {
        ColorFloatingButtonLabel m5066b;
        int indexOf;
        if (colorFloatingButtonItem == null || (m5066b = m5066b(colorFloatingButtonItem.m5120a())) == null || (indexOf = this.f7179c.indexOf(m5066b)) < 0) {
            return null;
        }
        m5053a(m5066b(colorFloatingButtonItem2.m5120a()), (Iterator<ColorFloatingButtonLabel>) null);
        m5053a(m5066b(colorFloatingButtonItem.m5120a()), (Iterator<ColorFloatingButtonLabel>) null);
        return m5055a(colorFloatingButtonItem2, indexOf);
    }

    /* renamed from: a */
    private ColorFloatingButtonItem m5053a(ColorFloatingButtonLabel colorFloatingButtonLabel, Iterator<ColorFloatingButtonLabel> it) {
        if (colorFloatingButtonLabel == null) {
            return null;
        }
        ColorFloatingButtonItem colorFloatingButtonItem = colorFloatingButtonLabel.getColorFloatingButtonItem();
        if (it != null) {
            it.remove();
        } else {
            this.f7179c.remove(colorFloatingButtonLabel);
        }
        removeView(colorFloatingButtonLabel);
        return colorFloatingButtonItem;
    }

    public ArrayList<ColorFloatingButtonItem> getActionItems() {
        ArrayList<ColorFloatingButtonItem> arrayList = new ArrayList<>(this.f7179c.size());
        Iterator<ColorFloatingButtonLabel> it = this.f7179c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getColorFloatingButtonItem());
        }
        return arrayList;
    }

    public void setOnActionSelectedListener(InterfaceC1517l interfaceC1517l) {
        this.f7197u = interfaceC1517l;
        if (interfaceC1517l != null) {
            this.f7198v = this.f7197u;
        }
        for (int i = 0; i < this.f7179c.size(); i++) {
            this.f7179c.get(i).setOnActionSelectedListener(this.f7199w);
        }
    }

    public void setOnChangeListener(InterfaceC1518m interfaceC1518m) {
        this.f7196t = interfaceC1518m;
    }

    /* renamed from: a */
    public final void m5083a() {
        m5063a(true, true, ResponseCode.CODE_3XX_MULTIPLE_CHOICES, false);
    }

    /* renamed from: b */
    public final void m5084b() {
        m5063a(false, true, ResponseCode.CODE_3XX_MULTIPLE_CHOICES, false);
    }

    /* renamed from: c */
    public final void m5085c() {
        m5063a(false, false, ResponseCode.CODE_3XX_MULTIPLE_CHOICES, false);
    }

    /* renamed from: d */
    public final void m5086d() {
        m5063a(false, true, 250, true);
    }

    /* renamed from: e */
    public final boolean m5087e() {
        return this.f7178b.f7203a;
    }

    public ShapeableImageView getMainColorFloatingButton() {
        return this.f7181e;
    }

    public void setMainFabDrawable(Drawable drawable) {
        this.f7180d = drawable;
        m5068b(false);
    }

    public ColorStateList getMainColorFloatingButtonBackgroundColor() {
        return this.f7178b.f7205c;
    }

    public void setMainColorFloatingButtonBackgroundColor(ColorStateList colorStateList) {
        this.f7178b.f7205c = colorStateList;
        m5080l();
    }

    public void setColorFloatingButtonExpandEnable(boolean z) {
        if (z) {
            this.f7181e.setOnTouchListener(new ViewOnTouchListenerC1507b(this));
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        this.f7178b.f7207e = getActionItems();
        bundle.putParcelable(InstanceState.class.getName(), this.f7178b);
        bundle.putParcelable("superState", super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            InstanceState instanceState = (InstanceState) bundle.getParcelable(InstanceState.class.getName());
            if (instanceState != null && instanceState.f7207e != null && !instanceState.f7207e.isEmpty()) {
                setMainColorFloatingButtonBackgroundColor(instanceState.f7205c);
                m5058a(instanceState.f7207e);
                m5063a(instanceState.f7203a, false, ResponseCode.CODE_3XX_MULTIPLE_CHOICES, false);
            }
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getMainColorFloatingButton().setEnabled(z);
    }

    /* renamed from: a */
    private int m5051a(int i) {
        return this.f7179c.size() - i;
    }

    /* renamed from: a */
    private void m5059a(Context context, AttributeSet attributeSet) {
        this.f7181e = m5079k();
        C1508c c1508c = new C1508c(this);
        this.f7181e.setElevation(24.0f);
        this.f7181e.setOutlineProvider(c1508c);
        this.f7181e.setBackgroundColor(getResources().getColor(R.color.color_floating_button_label_background_color));
        addView(this.f7181e);
        setClipChildren(false);
        setClipToPadding(false);
        this.f7185i = new RunnableC1515j(this, (byte) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorFloatingButton, 0, 0);
        try {
            setEnabled(obtainStyledAttributes.getBoolean(R.styleable.ColorFloatingButton_android_enabled, isEnabled()));
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.ColorFloatingButton_mainFloatingButtonSrc, RecyclerView.UNDEFINED_DURATION);
            if (resourceId != Integer.MIN_VALUE) {
                setMainFabDrawable(C0057a.m46b(getContext(), resourceId));
            }
            m5078j();
            setMainColorFloatingButtonBackgroundColor(obtainStyledAttributes.getColorStateList(R.styleable.ColorFloatingButton_mainFloatingButtonBackgroundColor));
            setColorFloatingButtonExpandEnable(obtainStyledAttributes.getBoolean(R.styleable.ColorFloatingButton_fabExpandAnimationEnable, false));
        } catch (Exception e) {
            Log.e(f7177a, "Failure setting FabWithLabelView icon" + e.getMessage());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: k */
    private ShapeableImageView m5079k() {
        ShapeableImageView shapeableImageView = new ShapeableImageView(getContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.color_floating_button_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.color_floating_button_item_stroke_width);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 8388613;
        int m5065b = m5065b(getContext(), 0.0f);
        m5065b(getContext(), 8.0f);
        layoutParams.setMargins(m5065b, 0, m5065b, 0);
        shapeableImageView.setId(R.id.color_floating_button_main_fab);
        shapeableImageView.setLayoutParams(layoutParams);
        shapeableImageView.setStrokeWidth(dimensionPixelSize2);
        shapeableImageView.setPaddingRelative(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        shapeableImageView.setStrokeColorResource(R.color.color_floating_button_label_broader_color);
        shapeableImageView.setShapeAppearanceModel(C2303p.m7297a().m7329a(C2303p.f10117a).m7327a());
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER);
        shapeableImageView.setClickable(true);
        shapeableImageView.setFocusable(true);
        shapeableImageView.setBackgroundTintList(getResources().getColorStateList(R.color.color_floating_button_label_background_color));
        shapeableImageView.setOnClickListener(new ViewOnClickListenerC1509d(this));
        return shapeableImageView;
    }

    /* renamed from: a */
    private void m5063a(boolean z, boolean z2, int i, boolean z3) {
        if (z && this.f7179c.isEmpty()) {
            z = false;
        }
        if (this.f7178b.f7203a == z || this.f7178b.f7204b) {
            return;
        }
        m5069b(z, z2, i, z3);
        m5068b(z3);
        m5080l();
    }

    /* renamed from: l */
    private void m5080l() {
        ColorStateList mainColorFloatingButtonBackgroundColor = getMainColorFloatingButtonBackgroundColor();
        if (mainColorFloatingButtonBackgroundColor != ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION)) {
            this.f7181e.setBackgroundTintList(mainColorFloatingButtonBackgroundColor);
        } else {
            this.f7181e.setBackgroundTintList(getResources().getColorStateList(R.color.color_floating_button_label_background_color));
        }
    }

    /* renamed from: b */
    private ColorFloatingButtonLabel m5066b(int i) {
        for (ColorFloatingButtonLabel colorFloatingButtonLabel : this.f7179c) {
            if (colorFloatingButtonLabel.getId() == i) {
                return colorFloatingButtonLabel;
            }
        }
        return null;
    }

    /* renamed from: c */
    private ColorFloatingButtonLabel m5072c(int i) {
        if (i < this.f7179c.size()) {
            return this.f7179c.get(i);
        }
        return null;
    }

    /* renamed from: b */
    private void m5069b(boolean z, boolean z2, int i, boolean z3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int size = this.f7179c.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = (size - 1) - i2;
                ColorFloatingButtonLabel colorFloatingButtonLabel = this.f7179c.get(i3);
                if (this.f7183g != 0) {
                    if (m5065b(getContext(), (i3 * 72) + 88) + marginLayoutParams.bottomMargin + this.f7181e.getHeight() > this.f7183g + this.f7184h) {
                        colorFloatingButtonLabel.setVisibility(8);
                        if (z2) {
                            m5061a(colorFloatingButtonLabel, i2 * 50, i3, 8);
                        }
                    } else {
                        colorFloatingButtonLabel.setVisibility(0);
                        if (z2) {
                            m5061a(colorFloatingButtonLabel, i2 * 50, i3, 0);
                        }
                    }
                } else if (z2) {
                    m5061a(colorFloatingButtonLabel, i2 * 50, i3, 0);
                }
            }
            this.f7178b.f7203a = true;
            return;
        }
        for (int i4 = 0; i4 < size; i4++) {
            ColorFloatingButtonLabel colorFloatingButtonLabel2 = this.f7179c.get(i4);
            if (z2) {
                m5062a(colorFloatingButtonLabel2, i4 * 50, i4, i, z3);
            }
        }
        this.f7178b.f7203a = false;
    }

    /* renamed from: f */
    public final void m5088f() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7181e, "scaleX", 1.0f, 1.1f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f7181e, "scaleY", 1.0f, 1.1f);
        ofFloat.setInterpolator(this.f7186j);
        ofFloat2.setInterpolator(this.f7186j);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(66L);
        animatorSet.start();
    }

    /* renamed from: g */
    public final void m5089g() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7181e, "scaleX", 1.1f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f7181e, "scaleY", 1.1f, 1.0f);
        ofFloat2.setInterpolator(this.f7187k);
        ofFloat.setInterpolator(this.f7187k);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    /* renamed from: h */
    public final void m5090h() {
        C0538w.m1887p(this.f7181e).m1761c();
        this.f7181e.setVisibility(0);
        this.f7181e.animate().translationY(0.0f).setInterpolator(this.f7189m).setDuration(200L).setListener(new C1510e(this));
    }

    /* renamed from: i */
    public final ObjectAnimator m5091i() {
        C0538w.m1887p(this.f7181e).m1761c();
        int i = this.f7178b.f7203a ? 150 : 140;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7181e, "translationY", ((ViewGroup.MarginLayoutParams) getLayoutParams()).bottomMargin + this.f7181e.getHeight());
        ofFloat.setInterpolator(this.f7188l);
        ofFloat.setDuration(i);
        ofFloat.addListener(new C1511f(this));
        return ofFloat;
    }

    /* renamed from: a */
    private void m5061a(ColorFloatingButtonLabel colorFloatingButtonLabel, int i, int i2, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        C0610ab c0610ab = new C0610ab(colorFloatingButtonLabel, AbstractC0619i.f2669b, (byte) 0);
        c0610ab.m2187d().m2191a(500.0f);
        c0610ab.m2187d().m2195b(0.8f);
        c0610ab.m2202a();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getChildColorFloatingButton(), "scaleX", 0.6f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getChildColorFloatingButton(), "scaleY", 0.6f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getColorFloatingButtonLabelBackground(), "scaleX", 0.6f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getColorFloatingButtonLabelBackground(), "scaleY", 0.6f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getChildColorFloatingButton(), "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getColorFloatingButtonLabelBackground(), "alpha", 0.0f, 1.0f);
        ofFloat6.setInterpolator(this.f7190n);
        ofFloat6.setDuration(350L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat5, ofFloat3, ofFloat4);
        animatorSet.setInterpolator(this.f7190n);
        animatorSet.setDuration(300L);
        animatorSet.setStartDelay(i);
        if (colorFloatingButtonLabel.getColorFloatingButtonLabelText().getText() != BuildConfig.FLAVOR) {
            if (m5081m()) {
                colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().setPivotX(0.0f);
                colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().setPivotY(0.0f);
            } else {
                colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().setPivotX(colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().getWidth());
                colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().setPivotY(0.0f);
            }
        }
        animatorSet.addListener(new C1512g(this, i2, ofFloat6, c0610ab, colorFloatingButtonLabel, i3));
        animatorSet.start();
    }

    /* renamed from: a */
    private void m5062a(ColorFloatingButtonLabel colorFloatingButtonLabel, int i, int i2, int i3, boolean z) {
        int m5065b;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        if (z) {
            m5065b = marginLayoutParams.bottomMargin + this.f7181e.getHeight() + m5065b(getContext(), (i2 * 72) + 88);
        } else {
            m5065b = m5065b(getContext(), (i2 * 72) + 88);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(colorFloatingButtonLabel, "translationY", m5065b);
        ofFloat.setStartDelay(i);
        ofFloat.setDuration(i3);
        ofFloat.setInterpolator(this.f7191o);
        if (colorFloatingButtonLabel.getColorFloatingButtonLabelText().getText() != BuildConfig.FLAVOR) {
            if (m5081m()) {
                colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().setPivotX(0.0f);
                colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().setPivotY(colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().getHeight());
            } else {
                colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().setPivotX(colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().getWidth());
                colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().setPivotY(colorFloatingButtonLabel.getColorFloatingButtonLabelBackground().getHeight());
            }
        }
        ofFloat.addListener(new C1513h(this, i2, z, colorFloatingButtonLabel, i3));
        ofFloat.start();
    }

    /* renamed from: c */
    private void m5073c(boolean z) {
        this.f7182f = 45.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7181e, "rotation", 0.0f, 45.0f);
        ofFloat.setInterpolator(this.f7194r);
        ofFloat.setDuration(z ? 250L : 300L);
        ofFloat.start();
    }

    /* renamed from: a */
    public final ObjectAnimator m5082a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7181e, "rotation", this.f7182f, 0.0f);
        ofFloat.setInterpolator(this.f7195s);
        ofFloat.setDuration(z ? 250L : 300L);
        return ofFloat;
    }

    /* renamed from: m */
    private boolean m5081m() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class InstanceState implements Parcelable {
        public static final Parcelable.Creator<InstanceState> CREATOR = new C1516k();

        /* renamed from: a */
        private boolean f7203a;

        /* renamed from: b */
        private boolean f7204b;

        /* renamed from: c */
        private ColorStateList f7205c;

        /* renamed from: d */
        private boolean f7206d;

        /* renamed from: e */
        private ArrayList<ColorFloatingButtonItem> f7207e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f7203a ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7204b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7206d ? (byte) 1 : (byte) 0);
            parcel.writeTypedList(this.f7207e);
        }

        public InstanceState() {
            this.f7203a = false;
            this.f7204b = false;
            this.f7205c = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
            this.f7206d = false;
            this.f7207e = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public InstanceState(Parcel parcel) {
            this.f7203a = false;
            this.f7204b = false;
            this.f7205c = ColorStateList.valueOf(RecyclerView.UNDEFINED_DURATION);
            this.f7206d = false;
            this.f7207e = new ArrayList<>();
            this.f7203a = parcel.readByte() != 0;
            this.f7204b = parcel.readByte() != 0;
            this.f7206d = parcel.readByte() != 0;
            this.f7207e = parcel.createTypedArrayList(ColorFloatingButtonItem.CREATOR);
        }
    }

    /* loaded from: classes.dex */
    public class ColorFloatingButtonBehavior extends AbstractC0391c<View> {

        /* renamed from: a */
        private Rect f7200a;

        /* renamed from: b */
        private AbstractC2206p f7201b;

        /* renamed from: c */
        private boolean f7202c;

        public ColorFloatingButtonBehavior() {
            this.f7202c = true;
        }

        public ColorFloatingButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.f7202c = obtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private static boolean m5093a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0394f) {
                return ((C0394f) layoutParams).m1430b() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final void mo1412a(C0394f c0394f) {
            if (c0394f.f2087h == 0) {
                c0394f.f2087h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final boolean mo1419a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                m5094a(coordinatorLayout, (AppBarLayout) view2, view);
                return false;
            }
            if (!m5093a(view2)) {
                return false;
            }
            m5098c(view2, view);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final boolean mo1414a(CoordinatorLayout coordinatorLayout, View view, int i) {
            List<View> m1403b = coordinatorLayout.m1403b(view);
            int size = m1403b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = m1403b.get(i2);
                if (view2 instanceof AppBarLayout) {
                    if (m5094a(coordinatorLayout, (AppBarLayout) view2, view)) {
                        break;
                    }
                } else {
                    if (m5093a(view2) && m5098c(view2, view)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1404b(view, i);
            return true;
        }

        /* renamed from: b */
        private void m5095b(View view) {
            if (view instanceof FloatingActionButton) {
                ((FloatingActionButton) view).m6941a(this.f7201b);
            } else {
                view.setVisibility(0);
            }
        }

        /* renamed from: c */
        private void m5097c(View view) {
            if (view instanceof FloatingActionButton) {
                ((FloatingActionButton) view).m6946b(this.f7201b);
            } else if (view instanceof ColorFloatingButton) {
                ColorFloatingButton.m5077g((ColorFloatingButton) view);
            } else {
                view.setVisibility(4);
            }
        }

        /* renamed from: b */
        private boolean m5096b(View view, View view2) {
            return this.f7202c && ((C0394f) view2.getLayoutParams()).m1425a() == view.getId() && view2.getVisibility() == 0;
        }

        /* renamed from: a */
        private boolean m5094a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (!m5096b(appBarLayout, view)) {
                return false;
            }
            if (this.f7200a == null) {
                this.f7200a = new Rect();
            }
            Rect rect = this.f7200a;
            C1527v.m5149a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= m5092a(appBarLayout)) {
                view.setVisibility(8);
                return true;
            }
            view.setVisibility(0);
            return true;
        }

        /* renamed from: a */
        private static int m5092a(AppBarLayout appBarLayout) {
            int m1886o = C0538w.m1886o(appBarLayout);
            if (m1886o != 0) {
                return m1886o * 2;
            }
            int childCount = appBarLayout.getChildCount();
            if (childCount > 0) {
                return C0538w.m1886o(appBarLayout.getChildAt(childCount - 1)) * 2;
            }
            return 0;
        }

        /* renamed from: c */
        private boolean m5098c(View view, View view2) {
            if (!m5096b(view, view2)) {
                return false;
            }
            if (view.getTop() < (view2.getHeight() / 2) + ((C0394f) view2.getLayoutParams()).topMargin) {
                m5097c(view2);
                return true;
            }
            m5095b(view2);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class ScrollViewBehavior extends ColorFloatingButtonBehavior {

        /* renamed from: a */
        ObjectAnimator f7208a;

        /* renamed from: b */
        private boolean f7209b;

        /* renamed from: c */
        private int f7210c;

        /* renamed from: d */
        private boolean f7211d;

        public ScrollViewBehavior() {
            this.f7208a = new ObjectAnimator();
            this.f7209b = false;
            this.f7211d = false;
        }

        public ScrollViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7208a = new ObjectAnimator();
            this.f7209b = false;
            this.f7211d = false;
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final boolean mo1421a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (view3 instanceof RecyclerView) {
                this.f7210c = 0;
                RecyclerView recyclerView = (RecyclerView) view3;
                int mo3020b = recyclerView.getAdapter().mo3020b();
                if (recyclerView.getChildCount() == 0 || mo3020b == 0) {
                    return false;
                }
                this.f7209b = recyclerView.getLayoutManager().m3111f(0).getTop() >= view3.getTop() - view3.getPaddingTop() || recyclerView.getLayoutManager().m3111f(recyclerView.getLayoutManager().m3121v() - 1).getBottom() <= view3.getBottom() - view3.getPaddingBottom();
                if (!this.f7211d) {
                    recyclerView.addOnScrollListener(new C1519n(this, view));
                    this.f7211d = true;
                }
                return (this.f7209b && this.f7210c == 0) ? false : true;
            }
            if (!(view3 instanceof AbsListView)) {
                return true;
            }
            AbsListView absListView = (AbsListView) view3;
            int count = absListView.getCount();
            int childCount = absListView.getChildCount();
            View childAt = absListView.getChildAt(0);
            int top = view3.getTop() - view3.getPaddingTop();
            int bottom = view3.getBottom() - view3.getPaddingBottom();
            View childAt2 = absListView.getChildAt(childCount - 1);
            if (childCount > 0 && count > 0) {
                if (absListView.getFirstVisiblePosition() == 0 && childAt.getTop() >= (-top)) {
                    return false;
                }
                if (childAt2 != null && absListView.getLastVisiblePosition() == count - 1 && childAt2.getBottom() <= bottom) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.AbstractC0391c
        /* renamed from: a */
        public final void mo1411a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            super.mo1411a(coordinatorLayout, view, view2, i, i2, iArr, i3);
            if (view instanceof ColorFloatingButton) {
                m5109a((ColorFloatingButton) view, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m5109a(ColorFloatingButton colorFloatingButton, int i) {
            if (i <= 10 || colorFloatingButton.getVisibility() != 0) {
                if (i < -10) {
                    colorFloatingButton.m5090h();
                }
            } else {
                if (colorFloatingButton.m5087e() && !this.f7208a.isRunning()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f7208a = colorFloatingButton.m5091i();
                    animatorSet.playTogether(this.f7208a, colorFloatingButton.m5082a(true));
                    animatorSet.setDuration(150L);
                    colorFloatingButton.m5086d();
                    animatorSet.start();
                    return;
                }
                if (this.f7208a.isRunning()) {
                    return;
                }
                this.f7208a = colorFloatingButton.m5091i();
                this.f7208a.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m5065b(Context context, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    /* renamed from: b */
    private void m5068b(boolean z) {
        if (this.f7178b.f7203a) {
            m5073c(z);
            return;
        }
        m5082a(z).start();
        if (this.f7180d != null) {
            this.f7181e.setImageDrawable(this.f7180d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m5064a(ColorFloatingButton colorFloatingButton, int i) {
        ColorFloatingButtonLabel m5072c = colorFloatingButton.m5072c(i);
        return m5072c != null && colorFloatingButton.indexOfChild(m5072c) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ boolean m5070b(ColorFloatingButton colorFloatingButton, int i) {
        ColorFloatingButtonLabel m5072c = colorFloatingButton.m5072c(i);
        return m5072c != null && colorFloatingButton.indexOfChild(m5072c) == colorFloatingButton.f7179c.size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m5060a(ColorFloatingButton colorFloatingButton, ColorFloatingButtonLabel colorFloatingButtonLabel, int i) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getChildColorFloatingButton(), "scaleX", 1.0f, 0.6f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getChildColorFloatingButton(), "scaleY", 1.0f, 0.6f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getColorFloatingButtonLabelBackground(), "scaleX", 1.0f, 0.6f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getColorFloatingButtonLabelBackground(), "scaleY", 1.0f, 0.6f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getChildColorFloatingButton(), "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(colorFloatingButtonLabel.getColorFloatingButtonLabelBackground(), "alpha", 1.0f, 0.0f);
        ofFloat6.setInterpolator(colorFloatingButton.f7193q);
        ofFloat6.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat5, ofFloat4, ofFloat3);
        animatorSet.setInterpolator(colorFloatingButton.f7191o);
        animatorSet.setDuration(i);
        animatorSet.addListener(new C1514i(colorFloatingButton, ofFloat6));
        animatorSet.start();
    }

    /* renamed from: g */
    static /* synthetic */ void m5077g(ColorFloatingButton colorFloatingButton) {
        if (colorFloatingButton.f7178b.f7203a) {
            colorFloatingButton.m5084b();
            C0538w.m1887p(colorFloatingButton.f7181e).m1758b().m1754a(0L).m1762d();
        }
    }
}
