package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.C2243al;
import com.google.android.material.p082k.C2299l;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.InterfaceC2288ad;
import com.google.android.material.theme.p084a.C2402a;

/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC2288ad {

    /* renamed from: e */
    private static final int[] f9371e = {R.attr.state_checkable};

    /* renamed from: f */
    private static final int[] f9372f = {R.attr.state_checked};

    /* renamed from: g */
    private static final int[] f9373g = {com.google.android.material.R.attr.state_dragged};

    /* renamed from: h */
    private static final int f9374h = com.google.android.material.R.style.Widget_MaterialComponents_CardView;

    /* renamed from: i */
    private final C2109b f9375i;

    /* renamed from: j */
    private boolean f9376j;

    /* renamed from: k */
    private boolean f9377k;

    /* renamed from: l */
    private boolean f9378l;

    /* renamed from: m */
    private InterfaceC2108a f9379m;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9374h), attributeSet, i);
        this.f9377k = false;
        this.f9378l = false;
        this.f9376j = true;
        TypedArray m7095a = C2243al.m7095a(getContext(), attributeSet, com.google.android.material.R.styleable.MaterialCardView, i, f9374h, new int[0]);
        this.f9375i = new C2109b(this, attributeSet, i, f9374h);
        this.f9375i.m6592b(super.getCardBackgroundColor());
        this.f9375i.m6583a(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        this.f9375i.m6585a(m7095a);
        m7095a.recycle();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m6561a());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f9375i.m6582a(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setStrokeColor(int i) {
        this.f9375i.m6584a(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f9375i.m6584a(colorStateList);
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f9375i.m6593c();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f9375i.m6595d();
    }

    public void setStrokeWidth(int i) {
        this.f9375i.m6581a(i);
    }

    public int getStrokeWidth() {
        return this.f9375i.m6597e();
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.f9375i.m6580a(f);
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f9375i.m6604k();
    }

    public void setProgress(float f) {
        this.f9375i.m6591b(f);
    }

    public float getProgress() {
        return this.f9375i.m6605l();
    }

    @Override // androidx.cardview.widget.CardView
    /* renamed from: a */
    public final void mo1083a(int i, int i2, int i3, int i4) {
        this.f9375i.m6583a(i, i2, i3, i4);
    }

    /* renamed from: b */
    public final void m6563b(int i, int i2, int i3, int i4) {
        super.mo1083a(i, i2, i3, i4);
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f9375i.m6602i().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f9375i.m6602i().top;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f9375i.m6602i().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f9375i.m6602i().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f9375i.m6592b(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f9375i.m6592b(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f9375i.m6600g();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f9375i.m6594c(colorStateList);
    }

    public ColorStateList getCardForegroundColor() {
        return this.f9375i.m6601h();
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f9375i.m6603j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2299l.m7295a(this, this.f9375i.m6599f());
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f9375i.m6606m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f9375i.m6607n();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f9375i.m6607n();
        this.f9375i.m6608o();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f9375i.m6607n();
        this.f9375i.m6608o();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f9376j) {
            if (!this.f9375i.m6589a()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f9375i.m6590b();
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9377k;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f9377k != z) {
            toggle();
        }
    }

    public void setDragged(boolean z) {
        if (this.f9378l != z) {
            this.f9378l = z;
            refreshDrawableState();
            m6562b();
            invalidate();
        }
    }

    /* renamed from: a */
    private boolean m6561a() {
        return this.f9375i != null && this.f9375i.m6609p();
    }

    public void setCheckable(boolean z) {
        this.f9375i.m6588a(z);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m6561a() && isEnabled()) {
            this.f9377k = !this.f9377k;
            refreshDrawableState();
            m6562b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (m6561a()) {
            mergeDrawableStates(onCreateDrawableState, f9371e);
        }
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f9372f);
        }
        if (this.f9378l) {
            mergeDrawableStates(onCreateDrawableState, f9373g);
        }
        return onCreateDrawableState;
    }

    public void setOnCheckedChangeListener(InterfaceC2108a interfaceC2108a) {
        this.f9379m = interfaceC2108a;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f9375i.m6596d(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f9375i.m6596d(C0057a.m45a(getContext(), i));
    }

    public ColorStateList getRippleColor() {
        return this.f9375i.m6611r();
    }

    public Drawable getCheckedIcon() {
        return this.f9375i.m6612s();
    }

    public void setCheckedIconResource(int i) {
        this.f9375i.m6586a(C0057a.m46b(getContext(), i));
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f9375i.m6586a(drawable);
    }

    public ColorStateList getCheckedIconTint() {
        return this.f9375i.m6610q();
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f9375i.m6598e(colorStateList);
    }

    @Override // com.google.android.material.p082k.InterfaceC2288ad
    public void setShapeAppearanceModel(C2303p c2303p) {
        this.f9375i.m6587a(c2303p);
    }

    public C2303p getShapeAppearanceModel() {
        return this.f9375i.m6614u();
    }

    /* renamed from: b */
    private void m6562b() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f9375i.m6613t();
        }
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }
}
