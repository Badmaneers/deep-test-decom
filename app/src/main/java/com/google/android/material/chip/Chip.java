package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0485f;
import androidx.customview.p027a.AbstractC0582a;
import androidx.recyclerview.widget.RecyclerView;
import com.coloros.neton.BuildConfig;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2250as;
import com.google.android.material.p072a.C2039h;
import com.google.android.material.p079h.AbstractC2226i;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p079h.C2222e;
import com.google.android.material.p080i.C2229c;
import com.google.android.material.p082k.C2299l;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.InterfaceC2288ad;
import com.google.android.material.theme.p084a.C2402a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements InterfaceC2115e, InterfaceC2288ad {

    /* renamed from: a */
    private static final int f9406a = R.style.Widget_MaterialComponents_Chip_Action;

    /* renamed from: b */
    private static final Rect f9407b = new Rect();

    /* renamed from: c */
    private static final int[] f9408c = {android.R.attr.state_selected};

    /* renamed from: d */
    private static final int[] f9409d = {android.R.attr.state_checkable};

    /* renamed from: e */
    private C2114d f9410e;

    /* renamed from: f */
    private InsetDrawable f9411f;

    /* renamed from: g */
    private RippleDrawable f9412g;

    /* renamed from: h */
    private View.OnClickListener f9413h;

    /* renamed from: i */
    private CompoundButton.OnCheckedChangeListener f9414i;

    /* renamed from: j */
    private boolean f9415j;

    /* renamed from: k */
    private boolean f9416k;

    /* renamed from: l */
    private boolean f9417l;

    /* renamed from: m */
    private boolean f9418m;

    /* renamed from: n */
    private boolean f9419n;

    /* renamed from: o */
    private int f9420o;

    /* renamed from: p */
    private int f9421p;

    /* renamed from: q */
    private final C2113c f9422q;

    /* renamed from: r */
    private final Rect f9423r;

    /* renamed from: s */
    private final RectF f9424s;

    /* renamed from: t */
    private final AbstractC2226i f9425t;

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f9406a), attributeSet, i);
        this.f9423r = new Rect();
        this.f9424s = new RectF();
        this.f9425t = new C2111a(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C2114d m6648a = C2114d.m6648a(context2, attributeSet, i, f9406a);
        TypedArray m7095a = C2243al.m7095a(context2, attributeSet, R.styleable.Chip, i, f9406a, new int[0]);
        this.f9419n = m7095a.getBoolean(R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.f9421p = (int) Math.ceil(m7095a.getDimension(R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(C2250as.m7108a(getContext(), 48))));
        m7095a.recycle();
        setChipDrawable(m6648a);
        m6648a.m7288r(C0538w.m1888q(this));
        TypedArray m7095a2 = C2243al.m7095a(context2, attributeSet, R.styleable.Chip, i, f9406a, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(C2221d.m7045a(context2, m7095a2, R.styleable.Chip_android_textColor));
        }
        boolean hasValue = m7095a2.hasValue(R.styleable.Chip_shapeAppearance);
        m7095a2.recycle();
        this.f9422q = new C2113c(this, this);
        m6625f();
        if (!hasValue && Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C2112b(this));
        }
        setChecked(this.f9415j);
        setText(m6648a.m6735l());
        setEllipsize(m6648a.m6741n());
        setIncludeFontPadding(false);
        m6630k();
        if (!this.f9410e.m6678J()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m6626g();
        if (this.f9419n) {
            setMinHeight(this.f9421p);
        }
        this.f9420o = C0538w.m1878h(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2299l.m7295a(this, this.f9410e);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (this.f9410e != null) {
            this.f9410e.m7288r(f);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (m6635d() || isClickable()) {
            accessibilityNodeInfo.setClassName(m6635d() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(m6635d());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C0482c m1635a = C0482c.m1635a(accessibilityNodeInfo);
            int i = -1;
            if (chipGroup.mo6645a()) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        break;
                    }
                    if (chipGroup.getChildAt(i2) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i2)) == this) {
                            i = i3;
                            break;
                        }
                        i3++;
                    }
                    i2++;
                }
            }
            m1635a.m1661b(C0485f.m1715a(ChipGroup.m7071a(this), 1, i, 1, isChecked()));
        }
    }

    /* renamed from: f */
    private void m6625f() {
        if (m6629j() && m6634c() && this.f9413h != null) {
            C0538w.m1849a(this, this.f9422q);
        } else {
            C0538w.m1849a(this, (C0479a) null);
        }
    }

    /* renamed from: g */
    private void m6626g() {
        if (TextUtils.isEmpty(getText()) || this.f9410e == null) {
            return;
        }
        int m6677I = (int) (this.f9410e.m6677I() + this.f9410e.m6674F() + this.f9410e.m6706d());
        int m6668B = (int) (this.f9410e.m6668B() + this.f9410e.m6673E() + this.f9410e.m6700c());
        if (this.f9411f != null) {
            Rect rect = new Rect();
            this.f9411f.getPadding(rect);
            m6668B += rect.left;
            m6677I += rect.right;
        }
        C0538w.m1863b(this, m6668B, getPaddingTop(), m6677I, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f9420o != i) {
            this.f9420o = i;
            m6626g();
        }
    }

    public Drawable getChipDrawable() {
        return this.f9410e;
    }

    public void setChipDrawable(C2114d c2114d) {
        if (this.f9410e != c2114d) {
            C2114d c2114d2 = this.f9410e;
            if (c2114d2 != null) {
                c2114d2.m6687a((InterfaceC2115e) null);
            }
            this.f9410e = c2114d;
            this.f9410e.m6679K();
            this.f9410e.m6687a(this);
            m6617a(this.f9421p);
        }
    }

    /* renamed from: h */
    private void m6627h() {
        if (C2229c.f9843a) {
            m6628i();
            return;
        }
        this.f9410e.m6690a(true);
        C0538w.m1846a(this, getBackgroundDrawable());
        m6626g();
        if (getBackgroundDrawable() == this.f9411f && this.f9410e.getCallback() == null) {
            this.f9410e.setCallback(this.f9411f);
        }
    }

    public Drawable getBackgroundDrawable() {
        if (this.f9411f == null) {
            return this.f9410e;
        }
        return this.f9411f;
    }

    /* renamed from: i */
    private void m6628i() {
        this.f9412g = new RippleDrawable(C2229c.m7066b(this.f9410e.m6732k()), getBackgroundDrawable(), null);
        this.f9410e.m6690a(false);
        C0538w.m1846a(this, this.f9412g);
        m6626g();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f9408c);
        }
        if (m6635d()) {
            mergeDrawableStates(onCreateDrawableState, f9409d);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f9412g) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f9412g) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        if (this.f9410e != null) {
            return this.f9410e.m6741n();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f9410e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        if (this.f9410e != null) {
            this.f9410e.m6685a(truncateAt);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        if (this.f9410e != null) {
            this.f9410e.m6671C(i);
        }
    }

    @Override // com.google.android.material.chip.InterfaceC2115e
    /* renamed from: a */
    public final void mo6632a() {
        m6617a(this.f9421p);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f9410e == null) {
            this.f9415j = z;
            return;
        }
        if (this.f9410e.m6760w()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || this.f9414i == null) {
                return;
            }
            this.f9414i.onCheckedChanged(this, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f9414i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f9413h = onClickListener;
        m6625f();
    }

    /* renamed from: b */
    public final boolean m6633b() {
        boolean z = false;
        playSoundEffect(0);
        if (this.f9413h != null) {
            this.f9413h.onClick(this);
            z = true;
        }
        this.f9422q.m2079a(1, 1);
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        switch (actionMasked) {
            case 0:
                if (contains) {
                    setCloseIconPressed(true);
                    z = true;
                    break;
                }
                z = false;
                break;
            case 1:
                if (this.f9416k) {
                    m6633b();
                    z = true;
                    setCloseIconPressed(false);
                    break;
                }
                z = false;
                setCloseIconPressed(false);
            case 2:
                if (this.f9416k) {
                    if (!contains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                    break;
                }
                z = false;
                break;
            case 3:
                z = false;
                setCloseIconPressed(false);
                break;
            default:
                z = false;
                break;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private boolean m6618a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC0582a.class.getDeclaredField("k");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f9422q)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC0582a.class.getDeclaredMethod("d", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f9422q, Integer.valueOf(RecyclerView.UNDEFINED_DURATION));
                    return true;
                }
            } catch (IllegalAccessException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (NoSuchFieldException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (NoSuchMethodException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (InvocationTargetException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return false;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m6618a(motionEvent) || this.f9422q.m2082a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f9422q.m2081a(keyEvent) || this.f9422q.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f9422q.m2078a(z, i, rect);
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f9422q.getKeyboardFocusedVirtualViewId() == 1 || this.f9422q.getAccessibilityFocusedVirtualViewId() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f9416k != z) {
            this.f9416k = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f9417l != z) {
            this.f9417l = z;
            refreshDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        boolean z = false;
        int i = 0;
        z = false;
        if (this.f9410e != null && this.f9410e.m6715e()) {
            C2114d c2114d = this.f9410e;
            int i2 = isEnabled() ? 1 : 0;
            if (this.f9418m) {
                i2++;
            }
            if (this.f9417l) {
                i2++;
            }
            if (this.f9416k) {
                i2++;
            }
            if (isChecked()) {
                i2++;
            }
            int[] iArr = new int[i2];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f9418m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f9417l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f9416k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = c2114d.m6692a(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public boolean m6629j() {
        return (this.f9410e == null || this.f9410e.m6751s() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f9424s.setEmpty();
        if (m6629j()) {
            this.f9410e.m6683a(this.f9424s);
        }
        return this.f9424s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f9423r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f9423r;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        if (this.f9410e != null) {
            return this.f9410e.m6716f();
        }
        return null;
    }

    public void setChipBackgroundColorResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6681a(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        if (this.f9410e != null) {
            this.f9410e.m6682a(colorStateList);
        }
    }

    public float getChipMinHeight() {
        if (this.f9410e != null) {
            return this.f9410e.m6720g();
        }
        return 0.0f;
    }

    public void setChipMinHeightResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6694b(i);
        }
    }

    public void setChipMinHeight(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6680a(f);
        }
    }

    public float getChipCornerRadius() {
        if (this.f9410e != null) {
            return Math.max(0.0f, this.f9410e.m6723h());
        }
        return 0.0f;
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6702c(i);
        }
    }

    @Override // com.google.android.material.p082k.InterfaceC2288ad
    public void setShapeAppearanceModel(C2303p c2303p) {
        this.f9410e.setShapeAppearanceModel(c2303p);
    }

    public C2303p getShapeAppearanceModel() {
        return this.f9410e.m7258L();
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6693b(f);
        }
    }

    public ColorStateList getChipStrokeColor() {
        if (this.f9410e != null) {
            return this.f9410e.m6726i();
        }
        return null;
    }

    public void setChipStrokeColorResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6708d(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        if (this.f9410e != null) {
            this.f9410e.m6695b(colorStateList);
        }
    }

    public float getChipStrokeWidth() {
        if (this.f9410e != null) {
            return this.f9410e.m6729j();
        }
        return 0.0f;
    }

    public void setChipStrokeWidthResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6712e(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6701c(f);
        }
    }

    public ColorStateList getRippleColor() {
        if (this.f9410e != null) {
            return this.f9410e.m6732k();
        }
        return null;
    }

    public void setRippleColorResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6718f(i);
            if (this.f9410e.m6691a()) {
                return;
            }
            m6628i();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f9410e != null) {
            this.f9410e.m6703c(colorStateList);
        }
        if (this.f9410e.m6691a()) {
            return;
        }
        m6628i();
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f9410e != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f9410e == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        super.setText(this.f9410e.m6678J() ? null : charSequence, bufferType);
        if (this.f9410e != null) {
            this.f9410e.m6689a(charSequence);
        }
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextAppearance(C2222e c2222e) {
        if (this.f9410e != null) {
            this.f9410e.m6688a(c2222e);
        }
        m6630k();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f9410e != null) {
            this.f9410e.m6722g(i);
        }
        m6630k();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        if (this.f9410e != null) {
            this.f9410e.m6722g(i);
        }
        m6630k();
    }

    /* renamed from: k */
    private void m6630k() {
        TextPaint paint = getPaint();
        if (this.f9410e != null) {
            paint.drawableState = this.f9410e.getState();
        }
        C2222e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m7057a(getContext(), paint, this.f9425t);
        }
    }

    private C2222e getTextAppearance() {
        if (this.f9410e != null) {
            return this.f9410e.m6738m();
        }
        return null;
    }

    public void setChipIconVisible(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6725h(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        if (this.f9410e != null) {
            this.f9410e.m6699b(z);
        }
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    public Drawable getChipIcon() {
        if (this.f9410e != null) {
            return this.f9410e.m6743o();
        }
        return null;
    }

    public void setChipIconResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6728i(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        if (this.f9410e != null) {
            this.f9410e.m6684a(drawable);
        }
    }

    public ColorStateList getChipIconTint() {
        if (this.f9410e != null) {
            return this.f9410e.m6745p();
        }
        return null;
    }

    public void setChipIconTintResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6731j(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        if (this.f9410e != null) {
            this.f9410e.m6709d(colorStateList);
        }
    }

    public float getChipIconSize() {
        if (this.f9410e != null) {
            return this.f9410e.m6747q();
        }
        return 0.0f;
    }

    public void setChipIconSizeResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6734k(i);
        }
    }

    public void setChipIconSize(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6707d(f);
        }
    }

    /* renamed from: c */
    public final boolean m6634c() {
        return this.f9410e != null && this.f9410e.m6750r();
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        if (this.f9410e != null) {
            this.f9410e.m6705c(z);
        }
        m6625f();
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    public Drawable getCloseIcon() {
        if (this.f9410e != null) {
            return this.f9410e.m6751s();
        }
        return null;
    }

    public void setCloseIconResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6737l(i);
        }
        m6625f();
    }

    public void setCloseIcon(Drawable drawable) {
        if (this.f9410e != null) {
            this.f9410e.m6696b(drawable);
        }
        m6625f();
    }

    public ColorStateList getCloseIconTint() {
        if (this.f9410e != null) {
            return this.f9410e.m6753t();
        }
        return null;
    }

    public void setCloseIconTintResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6740m(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        if (this.f9410e != null) {
            this.f9410e.m6713e(colorStateList);
        }
    }

    public float getCloseIconSize() {
        if (this.f9410e != null) {
            return this.f9410e.m6755u();
        }
        return 0.0f;
    }

    public void setCloseIconSizeResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6742n(i);
        }
    }

    public void setCloseIconSize(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6711e(f);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        if (this.f9410e != null) {
            this.f9410e.m6698b(charSequence);
        }
    }

    public CharSequence getCloseIconContentDescription() {
        if (this.f9410e != null) {
            return this.f9410e.m6757v();
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m6635d() {
        return this.f9410e != null && this.f9410e.m6760w();
    }

    public void setCheckableResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6744o(i);
        }
    }

    public void setCheckable(boolean z) {
        if (this.f9410e != null) {
            this.f9410e.m6710d(z);
        }
    }

    public void setCheckedIconVisible(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6746p(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        if (this.f9410e != null) {
            this.f9410e.m6714e(z);
        }
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    public Drawable getCheckedIcon() {
        if (this.f9410e != null) {
            return this.f9410e.m6761x();
        }
        return null;
    }

    public void setCheckedIconResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6748q(i);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        if (this.f9410e != null) {
            this.f9410e.m6704c(drawable);
        }
    }

    public ColorStateList getCheckedIconTint() {
        if (this.f9410e != null) {
            return this.f9410e.m6763y();
        }
        return null;
    }

    public void setCheckedIconTintResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6749r(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        if (this.f9410e != null) {
            this.f9410e.m6719f(colorStateList);
        }
    }

    public C2039h getShowMotionSpec() {
        if (this.f9410e != null) {
            return this.f9410e.m6765z();
        }
        return null;
    }

    public void setShowMotionSpecResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6752s(i);
        }
    }

    public void setShowMotionSpec(C2039h c2039h) {
        if (this.f9410e != null) {
            this.f9410e.m6686a(c2039h);
        }
    }

    public C2039h getHideMotionSpec() {
        if (this.f9410e != null) {
            return this.f9410e.m6666A();
        }
        return null;
    }

    public void setHideMotionSpecResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6754t(i);
        }
    }

    public void setHideMotionSpec(C2039h c2039h) {
        if (this.f9410e != null) {
            this.f9410e.m6697b(c2039h);
        }
    }

    public float getChipStartPadding() {
        if (this.f9410e != null) {
            return this.f9410e.m6668B();
        }
        return 0.0f;
    }

    public void setChipStartPaddingResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6756u(i);
        }
    }

    public void setChipStartPadding(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6717f(f);
        }
    }

    public float getIconStartPadding() {
        if (this.f9410e != null) {
            return this.f9410e.m6670C();
        }
        return 0.0f;
    }

    public void setIconStartPaddingResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6758v(i);
        }
    }

    public void setIconStartPadding(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6721g(f);
        }
    }

    public float getIconEndPadding() {
        if (this.f9410e != null) {
            return this.f9410e.m6672D();
        }
        return 0.0f;
    }

    public void setIconEndPaddingResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6759w(i);
        }
    }

    public void setIconEndPadding(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6724h(f);
        }
    }

    public float getTextStartPadding() {
        if (this.f9410e != null) {
            return this.f9410e.m6673E();
        }
        return 0.0f;
    }

    public void setTextStartPaddingResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6762x(i);
        }
    }

    public void setTextStartPadding(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6727i(f);
        }
    }

    public float getTextEndPadding() {
        if (this.f9410e != null) {
            return this.f9410e.m6674F();
        }
        return 0.0f;
    }

    public void setTextEndPaddingResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6764y(i);
        }
    }

    public void setTextEndPadding(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6730j(f);
        }
    }

    public float getCloseIconStartPadding() {
        if (this.f9410e != null) {
            return this.f9410e.m6675G();
        }
        return 0.0f;
    }

    public void setCloseIconStartPaddingResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6766z(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6733k(f);
        }
    }

    public float getCloseIconEndPadding() {
        if (this.f9410e != null) {
            return this.f9410e.m6676H();
        }
        return 0.0f;
    }

    public void setCloseIconEndPaddingResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6667A(i);
        }
    }

    public void setCloseIconEndPadding(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6736l(f);
        }
    }

    public float getChipEndPadding() {
        if (this.f9410e != null) {
            return this.f9410e.m6677I();
        }
        return 0.0f;
    }

    public void setChipEndPaddingResource(int i) {
        if (this.f9410e != null) {
            this.f9410e.m6669B(i);
        }
    }

    public void setChipEndPadding(float f) {
        if (this.f9410e != null) {
            this.f9410e.m6739m(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f9419n = z;
        m6617a(this.f9421p);
    }

    /* renamed from: a */
    private boolean m6617a(int i) {
        this.f9421p = i;
        if (!this.f9419n) {
            if (this.f9411f != null) {
                m6631l();
            } else {
                m6627h();
            }
            return false;
        }
        int max = Math.max(0, i - this.f9410e.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f9410e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f9411f != null) {
                m6631l();
            } else {
                m6627h();
            }
            return false;
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f9411f != null) {
            Rect rect = new Rect();
            this.f9411f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m6627h();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
        } else {
            setMinHeight(i);
            setMinWidth(i);
        }
        m6616a(i2, i3, i2, i3);
        m6627h();
        return true;
    }

    /* renamed from: l */
    private void m6631l() {
        if (this.f9411f != null) {
            this.f9411f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m6627h();
        }
    }

    /* renamed from: a */
    private void m6616a(int i, int i2, int i3, int i4) {
        this.f9411f = new InsetDrawable((Drawable) this.f9410e, i, i2, i3, i4);
    }
}
