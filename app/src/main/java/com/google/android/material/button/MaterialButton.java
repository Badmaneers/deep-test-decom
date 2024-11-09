package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p024g.C0538w;
import androidx.core.widget.C0577o;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2250as;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p082k.C2299l;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.InterfaceC2288ad;
import com.google.android.material.theme.p084a.C2402a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC2288ad {

    /* renamed from: a */
    private static final int[] f9311a = {R.attr.state_checkable};

    /* renamed from: b */
    private static final int[] f9312b = {R.attr.state_checked};

    /* renamed from: c */
    private static final int f9313c = com.google.android.material.R.style.Widget_MaterialComponents_Button;

    /* renamed from: e */
    private final C2101d f9314e;

    /* renamed from: f */
    private final LinkedHashSet<InterfaceC2098a> f9315f;

    /* renamed from: g */
    private InterfaceC2099b f9316g;

    /* renamed from: h */
    private PorterDuff.Mode f9317h;

    /* renamed from: i */
    private ColorStateList f9318i;

    /* renamed from: j */
    private Drawable f9319j;

    /* renamed from: k */
    private int f9320k;

    /* renamed from: l */
    private int f9321l;

    /* renamed from: m */
    private int f9322m;

    /* renamed from: n */
    private boolean f9323n;

    /* renamed from: o */
    private boolean f9324o;

    /* renamed from: p */
    private int f9325p;

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9313c), attributeSet, i);
        this.f9315f = new LinkedHashSet<>();
        this.f9323n = false;
        this.f9324o = false;
        Context context2 = getContext();
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, com.google.android.material.R.styleable.MaterialButton, i, f9313c, new int[0]);
        this.f9322m = m7095a.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconPadding, 0);
        this.f9317h = C2250as.m7109a(m7095a.getInt(com.google.android.material.R.styleable.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f9318i = C2221d.m7045a(getContext(), m7095a, com.google.android.material.R.styleable.MaterialButton_iconTint);
        this.f9319j = C2221d.m7047b(getContext(), m7095a, com.google.android.material.R.styleable.MaterialButton_icon);
        this.f9325p = m7095a.getInteger(com.google.android.material.R.styleable.MaterialButton_iconGravity, 1);
        this.f9320k = m7095a.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconSize, 0);
        this.f9314e = new C2101d(this, C2303p.m7300a(context2, attributeSet, i, f9313c).m7327a());
        this.f9314e.m6537a(m7095a);
        m7095a.recycle();
        setCompoundDrawablePadding(this.f9322m);
        m6502a(this.f9319j != null);
    }

    private String getA11yClassName() {
        return (m6505c() ? CompoundButton.class : Button.class).getName();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m6505c());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9326a = this.f9323n;
        return savedState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        setChecked(savedState.f9326a);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m6506d()) {
            this.f9314e.m6536a(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.p024g.InterfaceC0537v
    public ColorStateList getSupportBackgroundTintList() {
        if (m6506d()) {
            return this.f9314e.m6545c();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.p024g.InterfaceC0537v
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m6506d()) {
            this.f9314e.m6538a(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.p024g.InterfaceC0537v
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m6506d()) {
            return this.f9314e.m6547d();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m6506d()) {
            C2101d c2101d = this.f9314e;
            if (c2101d.m6552i() != null) {
                c2101d.m6552i().setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0057a.m46b(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m6506d()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.f9314e.m6533a();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || this.f9314e == null) {
            return;
        }
        this.f9314e.m6535a(i4 - i2, i3 - i);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m6501a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m6501a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m6506d()) {
            C2299l.m7295a(this, this.f9314e.m6552i());
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m6506d()) {
            this.f9314e.m6552i().m7288r(f);
        }
    }

    /* renamed from: a */
    private void m6501a() {
        if (this.f9319j == null || getLayout() == null) {
            return;
        }
        if (this.f9325p == 1 || this.f9325p == 3) {
            this.f9321l = 0;
            m6502a(false);
            return;
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        int measuredWidth = (((((getMeasuredWidth() - Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth())) - C0538w.m1884m(this)) - (this.f9320k == 0 ? this.f9319j.getIntrinsicWidth() : this.f9320k)) - this.f9322m) - C0538w.m1883l(this)) / 2;
        if (m6504b() != (this.f9325p == 4)) {
            measuredWidth = -measuredWidth;
        }
        if (this.f9321l != measuredWidth) {
            this.f9321l = measuredWidth;
            m6502a(false);
        }
    }

    /* renamed from: b */
    private boolean m6504b() {
        return C0538w.m1878h(this) == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setIconPadding(int i) {
        if (this.f9322m != i) {
            this.f9322m = i;
            setCompoundDrawablePadding(i);
        }
    }

    public int getIconPadding() {
        return this.f9322m;
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f9320k != i) {
            this.f9320k = i;
            m6502a(true);
        }
    }

    public int getIconSize() {
        return this.f9320k;
    }

    public void setIcon(Drawable drawable) {
        if (this.f9319j != drawable) {
            this.f9319j = drawable;
            m6502a(true);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C0057a.m46b(getContext(), i) : null);
    }

    public Drawable getIcon() {
        return this.f9319j;
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f9318i != colorStateList) {
            this.f9318i = colorStateList;
            m6502a(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C0057a.m45a(getContext(), i));
    }

    public ColorStateList getIconTint() {
        return this.f9318i;
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f9317h != mode) {
            this.f9317h = mode;
            m6502a(false);
        }
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f9317h;
    }

    /* renamed from: a */
    private void m6502a(boolean z) {
        boolean z2 = false;
        if (this.f9319j != null) {
            this.f9319j = C0546a.m1933f(this.f9319j).mutate();
            C0546a.m1922a(this.f9319j, this.f9318i);
            if (this.f9317h != null) {
                C0546a.m1925a(this.f9319j, this.f9317h);
            }
            this.f9319j.setBounds(this.f9321l, 0, this.f9321l + (this.f9320k != 0 ? this.f9320k : this.f9319j.getIntrinsicWidth()), this.f9320k != 0 ? this.f9320k : this.f9319j.getIntrinsicHeight());
        }
        boolean z3 = this.f9325p == 1 || this.f9325p == 2;
        if (z) {
            m6503b(z3);
            return;
        }
        Drawable[] m2052b = C0577o.m2052b(this);
        Drawable drawable = m2052b[0];
        Drawable drawable2 = m2052b[2];
        if ((z3 && drawable != this.f9319j) || (!z3 && drawable2 != this.f9319j)) {
            z2 = true;
        }
        if (z2) {
            m6503b(z3);
        }
    }

    /* renamed from: b */
    private void m6503b(boolean z) {
        if (z) {
            C0577o.m2049a(this, this.f9319j, null, null, null);
        } else {
            C0577o.m2049a(this, null, null, this.f9319j, null);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m6506d()) {
            this.f9314e.m6542b(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m6506d()) {
            setRippleColor(C0057a.m45a(getContext(), i));
        }
    }

    public ColorStateList getRippleColor() {
        if (m6506d()) {
            return this.f9314e.m6548e();
        }
        return null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m6506d()) {
            this.f9314e.m6546c(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m6506d()) {
            setStrokeColor(C0057a.m45a(getContext(), i));
        }
    }

    public ColorStateList getStrokeColor() {
        if (m6506d()) {
            return this.f9314e.m6549f();
        }
        return null;
    }

    public void setStrokeWidth(int i) {
        if (m6506d()) {
            this.f9314e.m6534a(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m6506d()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public int getStrokeWidth() {
        if (m6506d()) {
            return this.f9314e.m6550g();
        }
        return 0;
    }

    public void setCornerRadius(int i) {
        if (m6506d()) {
            this.f9314e.m6541b(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m6506d()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public int getCornerRadius() {
        if (m6506d()) {
            return this.f9314e.m6551h();
        }
        return 0;
    }

    public int getIconGravity() {
        return this.f9325p;
    }

    public void setIconGravity(int i) {
        if (this.f9325p != i) {
            this.f9325p = i;
            m6501a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m6505c()) {
            mergeDrawableStates(onCreateDrawableState, f9311a);
        }
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f9312b);
        }
        return onCreateDrawableState;
    }

    /* renamed from: a */
    public final void m6507a(InterfaceC2098a interfaceC2098a) {
        this.f9315f.add(interfaceC2098a);
    }

    /* renamed from: b */
    public final void m6508b(InterfaceC2098a interfaceC2098a) {
        this.f9315f.remove(interfaceC2098a);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m6505c() && isEnabled() && this.f9323n != z) {
            this.f9323n = z;
            refreshDrawableState();
            if (this.f9324o) {
                return;
            }
            this.f9324o = true;
            Iterator<InterfaceC2098a> it = this.f9315f.iterator();
            while (it.hasNext()) {
                it.next().mo6526a(this, this.f9323n);
            }
            this.f9324o = false;
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9323n;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f9323n);
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    /* renamed from: c */
    private boolean m6505c() {
        return this.f9314e != null && this.f9314e.m6553j();
    }

    public void setCheckable(boolean z) {
        if (m6506d()) {
            this.f9314e.m6543b(z);
        }
    }

    @Override // com.google.android.material.p082k.InterfaceC2288ad
    public void setShapeAppearanceModel(C2303p c2303p) {
        if (m6506d()) {
            this.f9314e.m6539a(c2303p);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public C2303p getShapeAppearanceModel() {
        if (m6506d()) {
            return this.f9314e.m6554k();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(InterfaceC2099b interfaceC2099b) {
        this.f9316g = interfaceC2099b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f9316g != null) {
            this.f9316g.mo6527a(this);
        }
        super.setPressed(z);
    }

    /* renamed from: d */
    private boolean m6506d() {
        return (this.f9314e == null || this.f9314e.m6544b()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m6506d()) {
            this.f9314e.m6540a(z);
        }
    }

    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2100c();

        /* renamed from: a */
        boolean f9326a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9326a = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9326a ? 1 : 0);
        }
    }
}
