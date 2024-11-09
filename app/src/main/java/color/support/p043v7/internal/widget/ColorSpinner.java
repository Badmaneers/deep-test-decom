package color.support.p043v7.internal.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0295ef;
import androidx.core.p024g.p026b.C0517b;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1336a;
import com.color.support.util.C1337b;
import com.color.support.widget.InterfaceC1478el;
import com.color.support.widget.InterfaceC1479em;

/* loaded from: classes.dex */
public class ColorSpinner extends ColorBaseSpinner implements InterfaceC1478el {

    /* renamed from: H */
    private static final Interpolator f5172H;

    /* renamed from: I */
    private static final Interpolator f5173I;

    /* renamed from: J */
    private static final Interpolator f5174J;

    /* renamed from: K */
    private static final Interpolator f5175K;

    /* renamed from: L */
    private static final Interpolator f5176L;

    /* renamed from: M */
    private final Rect f5177M;

    /* renamed from: N */
    private AnimatorSet f5178N;

    /* renamed from: O */
    private RotateDrawable f5179O;

    /* renamed from: P */
    private int f5180P;

    /* renamed from: Q */
    private int f5181Q;

    /* renamed from: R */
    private boolean f5182R;

    /* renamed from: S */
    private boolean f5183S;

    /* renamed from: T */
    private boolean f5184T;

    /* renamed from: U */
    private boolean f5185U;

    /* renamed from: V */
    private boolean f5186V;

    /* renamed from: W */
    private InterfaceC1479em f5187W;

    /* renamed from: aa */
    private TextView f5188aa;

    /* renamed from: ab */
    private int f5189ab;

    /* renamed from: ac */
    private float f5190ac;

    /* renamed from: ad */
    private ColorStateList f5191ad;

    /* renamed from: ae */
    private int f5192ae;

    /* renamed from: af */
    private int f5193af;

    /* renamed from: ag */
    private InterfaceC1255v f5194ag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ boolean m4046c(ColorSpinner colorSpinner) {
        colorSpinner.f5183S = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ boolean m4053h(ColorSpinner colorSpinner) {
        colorSpinner.f5186V = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ boolean m4057j(ColorSpinner colorSpinner) {
        colorSpinner.f5185U = false;
        return false;
    }

    @Override // color.support.p043v7.internal.widget.AbsSpinnerCompat, color.support.p043v7.internal.widget.AdapterViewCompat
    public /* bridge */ /* synthetic */ SpinnerAdapter getAdapter() {
        return super.getAdapter();
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, android.view.View
    public /* bridge */ /* synthetic */ int getBaseline() {
        return super.getBaseline();
    }

    @Override // color.support.p043v7.internal.widget.AbsSpinnerCompat, color.support.p043v7.internal.widget.AdapterViewCompat
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ int getDropDownHorizontalOffset() {
        return super.getDropDownHorizontalOffset();
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ int getDropDownVerticalOffset() {
        return super.getDropDownVerticalOffset();
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ int getDropDownWidth() {
        return super.getDropDownWidth();
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ Drawable getPopupBackground() {
        return super.getPopupBackground();
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ CharSequence getPrompt() {
        return super.getPrompt();
    }

    @Override // color.support.p043v7.internal.widget.AbsSpinnerCompat, color.support.p043v7.internal.widget.AdapterViewCompat
    public /* bridge */ /* synthetic */ View getSelectedView() {
        return super.getSelectedView();
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, android.content.DialogInterface.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        super.onClick(dialogInterface, i);
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, color.support.p043v7.internal.widget.AbsSpinnerCompat, android.view.View
    public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, android.view.View
    public /* bridge */ /* synthetic */ boolean performClick() {
        return super.performClick();
    }

    @Override // color.support.p043v7.internal.widget.AbsSpinnerCompat, android.view.View, android.view.ViewParent
    public /* bridge */ /* synthetic */ void requestLayout() {
        super.requestLayout();
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, color.support.p043v7.internal.widget.AbsSpinnerCompat
    public /* bridge */ /* synthetic */ void setAdapter(SpinnerAdapter spinnerAdapter) {
        super.setAdapter(spinnerAdapter);
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ void setDropDownHorizontalOffset(int i) {
        super.setDropDownHorizontalOffset(i);
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ void setDropDownVerticalOffset(int i) {
        super.setDropDownVerticalOffset(i);
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ void setDropDownWidth(int i) {
        super.setDropDownWidth(i);
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ void setGravity(int i) {
        super.setGravity(i);
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ void setPopupBackgroundDrawable(Drawable drawable) {
        super.setPopupBackgroundDrawable(drawable);
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ void setPopupBackgroundResource(int i) {
        super.setPopupBackgroundResource(i);
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ void setPrompt(CharSequence charSequence) {
        super.setPrompt(charSequence);
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    public /* bridge */ /* synthetic */ void setPromptId(int i) {
        super.setPromptId(i);
    }

    static {
        Interpolator m1773a = C0517b.m1773a(0.133f, 0.0f, 0.3f, 1.0f);
        f5172H = m1773a;
        f5173I = m1773a;
        f5174J = f5172H;
        f5175K = C0517b.m1773a(0.15f, 0.0f, 0.0f, 1.0f);
        f5176L = C0517b.m1773a(0.33f, 0.0f, 0.66f, 1.0f);
    }

    public ColorSpinner(Context context) {
        this(context, null);
    }

    public ColorSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public ColorSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private ColorSpinner(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i);
        this.f5177M = new Rect();
        this.f5178N = null;
        this.f5179O = null;
        this.f5180P = 0;
        this.f5181Q = -2;
        this.f5182R = false;
        this.f5183S = true;
        this.f5184T = true;
        this.f5185U = false;
        this.f5186V = false;
        this.f5187W = null;
        this.f5190ac = 0.0f;
        this.f5191ad = ColorStateList.valueOf(-16777216);
        this.f5192ae = -16777216;
        this.f5193af = -16777216;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorSpinner, i, 0);
        if (obtainStyledAttributes.getInt(R.styleable.ColorSpinner_supportSpinnerMode, 0) == 1) {
            this.f5180P = obtainStyledAttributes.getLayoutDimension(R.styleable.ColorSpinner_android_dropDownHeight, -2);
            this.f5179O = (RotateDrawable) obtainStyledAttributes.getDrawable(R.styleable.ColorSpinner_colorExpandIcon);
            this.f5181Q = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSpinner_colorExpandIconMargin, 0);
            obtainStyledAttributes.recycle();
            C1256w.m4098a((C1256w) this.f5137F);
        }
        this.f5190ac = getResources().getDimensionPixelSize(R.dimen.TF07);
        int m4374a = C1337b.m4374a(context, R.attr.colorPrimaryColor);
        this.f5191ad = ColorStateList.valueOf(m4374a);
        this.f5193af = m4374a;
        this.f5192ae = m4374a;
        this.f5136E = null;
    }

    public InterfaceC1255v getOnPopupWindowActionListener() {
        return this.f5194ag;
    }

    public void setOnPopupWindowActionListener(InterfaceC1255v interfaceC1255v) {
        this.f5194ag = interfaceC1255v;
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, color.support.p043v7.internal.widget.AdapterViewCompat
    public void setOnItemClickListener(InterfaceC1237d interfaceC1237d) {
        setOnItemClickListenerInt(interfaceC1237d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, color.support.p043v7.internal.widget.AbsSpinnerCompat, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5179O == null || !this.f5182R) {
            return;
        }
        int intrinsicWidth = this.f5179O.getIntrinsicWidth();
        int intrinsicHeight = this.f5179O.getIntrinsicHeight();
        int i3 = this.f5189ab + intrinsicWidth + this.f5181Q;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 && this.f5188aa != null) {
            measureChild(this.f5188aa, i, i2);
            size = Math.max(this.f5188aa.getMeasuredHeight(), getMeasuredHeight());
        }
        setMeasuredDimension(i3, size);
        boolean z = !C0295ef.m987a(this);
        int measuredWidth = z ? (getMeasuredWidth() - intrinsicWidth) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop() + ((((getMeasuredHeight() - intrinsicHeight) - getPaddingTop()) - getPaddingBottom()) / 2);
        if (z) {
            intrinsicWidth += measuredWidth;
        }
        this.f5179O.setBounds(measuredWidth, paddingTop, intrinsicWidth, intrinsicHeight + paddingTop);
        this.f5182R = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, color.support.p043v7.internal.widget.AdapterViewCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f5183S = true;
        TextView textView = (TextView) findViewById(android.R.id.text1);
        if (textView != null) {
            textView.setTextColor(this.f5191ad);
            m4058k();
            if (textView.getPaint() != null) {
                C1336a.m4372a(textView);
                this.f5188aa = textView;
                m4056j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, color.support.p043v7.internal.widget.AbsSpinnerCompat
    /* renamed from: a */
    public final void mo4012a(int i, boolean z) {
        int i2;
        if (this.f5069h == null || this.f5179O == null) {
            i2 = 0;
        } else {
            i2 = this.f5181Q + this.f5179O.getMinimumWidth();
            if (getLayoutDirection() == 1) {
                this.f5069h.left += i2;
            } else {
                this.f5069h.right += i2;
            }
        }
        super.mo4012a(i, z);
        this.f5069h.right -= i2;
    }

    /* renamed from: j */
    private void m4056j() {
        if (this.f5188aa == null) {
            return;
        }
        float textSize = this.f5188aa.getTextSize();
        this.f5188aa.setTextSize(0, (int) this.f5190ac);
        if (Build.VERSION.SDK_INT >= 21 || textSize == this.f5190ac) {
            return;
        }
        post(new RunnableC1254u(this));
    }

    public void setSpinnerTextSize(float f) {
        this.f5190ac = f;
    }

    public void setSpinnerColorResource(int i) {
        setSpinnerColor(getResources().getColorStateList(i));
    }

    public void setSpinnerColor(int i) {
        setSpinnerColor(ColorStateList.valueOf(i));
    }

    public void setSpinnerColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        try {
            this.f5191ad = colorStateList;
            this.f5192ae = this.f5191ad.getDefaultColor();
            this.f5193af = this.f5191ad.getColorForState(new int[]{-16842910}, -16777216);
            if (this.f5188aa != null) {
                this.f5188aa.setTextColor(this.f5191ad);
            }
            if (this.f5179O != null) {
                m4058k();
                invalidate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m4058k() {
        int i;
        if (isEnabled()) {
            i = this.f5192ae;
        } else {
            i = this.f5193af;
        }
        this.f5179O.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f5188aa != null) {
            this.f5188aa.setEnabled(z);
        }
        if (this.f5179O != null) {
            m4058k();
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5185U = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, color.support.p043v7.internal.widget.AdapterViewCompat, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f5185U = true;
        if (this.f5178N != null) {
            this.f5178N.end();
        }
        super.onDetachedFromWindow();
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner, color.support.p043v7.internal.widget.AbsSpinnerCompat, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        this.f5186V = true;
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f5179O != null) {
            this.f5179O.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    /* renamed from: a */
    public final int mo4035a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i;
        this.f5182R = true;
        if (spinnerAdapter == null) {
            return 0;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition < 0 || selectedItemPosition >= spinnerAdapter.getCount()) {
            return super.mo4035a(spinnerAdapter, drawable);
        }
        int mode = View.MeasureSpec.getMode(this.f5064c);
        int size = View.MeasureSpec.getSize(this.f5064c) - (this.f5179O.getMinimumWidth() + this.f5181Q);
        if (size > 0) {
            i = View.MeasureSpec.makeMeasureSpec(size, mode);
        } else {
            i = this.f5064c;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        spinnerAdapter.getItemViewType(selectedItemPosition);
        View view = spinnerAdapter.getView(selectedItemPosition, null, this);
        if (view instanceof TextView) {
            this.f5188aa = (TextView) view;
            C1336a.m4372a(this.f5188aa);
            m4056j();
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        view.measure(i, makeMeasureSpec);
        int measuredWidth = view.getMeasuredWidth();
        this.f5189ab = measuredWidth;
        if (drawable == null) {
            return measuredWidth;
        }
        drawable.getPadding(this.f5177M);
        return measuredWidth + this.f5177M.left + this.f5177M.right;
    }

    @Override // color.support.p043v7.internal.widget.ColorBaseSpinner
    /* renamed from: a */
    final C1246m mo4036a(Context context, AttributeSet attributeSet, int i) {
        return new C1256w(this, context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // color.support.p043v7.internal.widget.AdapterViewCompat
    /* renamed from: c */
    public final void mo4021c() {
        if (this.f5183S) {
            super.mo4021c();
        }
    }

    @Override // color.support.p043v7.internal.widget.AbsSpinnerCompat, color.support.p043v7.internal.widget.AdapterViewCompat
    public void setSelection(int i) {
        if (this.f5184T && this.f5137F != null && this.f5137F.mo4087b() && (this.f5137F instanceof C1256w)) {
            C1256w.m4096a((C1256w) this.f5137F, i);
        } else {
            super.setSelection(i);
        }
    }

    public void setDropdownDismissCallback(InterfaceC1479em interfaceC1479em) {
        this.f5187W = interfaceC1479em;
    }

    public void setDropdownItemClickListener(InterfaceC1237d interfaceC1237d) {
        setOnItemClickListener(interfaceC1237d);
    }

    public void setDropdownUpdateAfterAnim(boolean z) {
        this.f5184T = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m4043a(ColorSpinner colorSpinner, float f) {
        if (colorSpinner.f5179O != null) {
            colorSpinner.f5179O.setLevel((int) (f * 10000.0f));
            colorSpinner.invalidate();
        }
    }
}
