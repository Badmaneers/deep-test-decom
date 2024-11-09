package color.support.p043v7.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.C0276dn;
import androidx.core.p024g.C0521f;
import androidx.core.p024g.C0538w;
import color.support.p041a.p042a.C1154b;
import color.support.p043v7.appcompat.R;
import color.support.p043v7.internal.widget.AbsSpinnerCompat;
import color.support.p043v7.widget.AbstractViewOnTouchListenerC1282i;

/* loaded from: classes.dex */
public class ColorBaseSpinner extends AbsSpinnerCompat implements DialogInterface.OnClickListener {

    /* renamed from: E */
    protected AbstractViewOnTouchListenerC1282i f5136E;

    /* renamed from: F */
    InterfaceC1251r f5137F;

    /* renamed from: G */
    int f5138G;

    /* renamed from: H */
    private C1245l f5139H;

    /* renamed from: I */
    private int f5140I;

    /* renamed from: J */
    private boolean f5141J;

    /* renamed from: K */
    private Rect f5142K;

    /* renamed from: L */
    private final C1233ap f5143L;

    public ColorBaseSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5142K = new Rect();
        C0276dn m944a = C0276dn.m944a(context, attributeSet, R.styleable.ColorSpinner, i, 0);
        if (m944a.m964i(R.styleable.ColorSpinner_android_background)) {
            setBackgroundDrawable(m944a.m948a(R.styleable.ColorSpinner_android_background));
        }
        switch (m944a.m946a(R.styleable.ColorSpinner_supportSpinnerMode, 0)) {
            case 0:
                this.f5137F = new DialogInterfaceOnClickListenerC1244k(this, (byte) 0);
                break;
            case 1:
                C1246m mo4036a = mo4036a(context, attributeSet, i);
                this.f5138G = m944a.m959f(R.styleable.ColorSpinner_android_dropDownWidth, -2);
                mo4036a.m4206a(m944a.m948a(R.styleable.ColorSpinner_android_popupBackground));
                this.f5137F = mo4036a;
                this.f5136E = new C1242i(this, this, mo4036a);
                break;
        }
        this.f5140I = m944a.m946a(R.styleable.ColorSpinner_android_gravity, 17);
        if (this.f5137F != null) {
            this.f5137F.mo4085a(m944a.m956d(R.styleable.ColorSpinner_supportPrompt));
        }
        this.f5141J = m944a.m949a(R.styleable.ColorSpinner_supportDisableChildrenWhenDisabled, false);
        m944a.m952b();
        if (this.f5139H != null) {
            this.f5137F.mo4084a(this.f5139H);
            this.f5139H = null;
        }
        this.f5143L = C1233ap.m4077a(context);
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (!(this.f5137F instanceof C1246m)) {
            Log.e("ColorBaseSpinner", "setPopupBackgroundDrawable: incompatible spinner mode; ignoring...");
        } else {
            ((C1246m) this.f5137F).m4206a(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(this.f5143L.m4078a(i));
    }

    public Drawable getPopupBackground() {
        return this.f5137F.mo4089d();
    }

    public void setDropDownVerticalOffset(int i) {
        this.f5137F.mo4082a(i);
    }

    public int getDropDownVerticalOffset() {
        return this.f5137F.mo4090e();
    }

    public void setDropDownHorizontalOffset(int i) {
        this.f5137F.mo4086b(i);
    }

    public int getDropDownHorizontalOffset() {
        return this.f5137F.mo4091f();
    }

    public void setDropDownWidth(int i) {
        if (!(this.f5137F instanceof C1246m)) {
            Log.e("ColorBaseSpinner", "Cannot set dropdown width for MODE_DIALOG, ignoring");
        } else {
            this.f5138G = i;
        }
    }

    public int getDropDownWidth() {
        return this.f5138G;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f5141J) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).setEnabled(z);
            }
        }
    }

    public void setGravity(int i) {
        if (this.f5140I != i) {
            if ((i & 7) == 0) {
                i |= 8388611;
            }
            this.f5140I = i;
            requestLayout();
        }
    }

    @Override // color.support.p043v7.internal.widget.AbsSpinnerCompat, color.support.p043v7.internal.widget.AdapterViewCompat
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        super.setAdapter(spinnerAdapter);
        this.f5070i.m4063a();
        if (getContext().getApplicationInfo().targetSdkVersion >= 21 && spinnerAdapter != null && spinnerAdapter.getViewTypeCount() != 1) {
            throw new IllegalArgumentException("Spinner adapter view type count must be 1");
        }
        if (this.f5137F != null) {
            this.f5137F.mo4084a(new C1245l(spinnerAdapter));
        } else {
            this.f5139H = new C1245l(spinnerAdapter);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        View view;
        int baseline;
        if (getChildCount() > 0) {
            view = getChildAt(0);
        } else if (this.f5062a == null || this.f5062a.getCount() <= 0) {
            view = null;
        } else {
            View m4034b = m4034b(0, false);
            this.f5070i.m4064a(0, m4034b);
            view = m4034b;
        }
        if (view == null || (baseline = view.getBaseline()) < 0) {
            return -1;
        }
        return view.getTop() + baseline;
    }

    @Override // color.support.p043v7.internal.widget.AdapterViewCompat, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5137F == null || !this.f5137F.mo4087b()) {
            return;
        }
        this.f5137F.mo4081a();
    }

    @Override // color.support.p043v7.internal.widget.AdapterViewCompat
    public void setOnItemClickListener(InterfaceC1237d interfaceC1237d) {
        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
    }

    public void setOnItemClickListenerInt(InterfaceC1237d interfaceC1237d) {
        super.setOnItemClickListener(interfaceC1237d);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f5136E == null || !this.f5136E.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // color.support.p043v7.internal.widget.AbsSpinnerCompat, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5137F == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo4035a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // color.support.p043v7.internal.widget.AdapterViewCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f5089q = true;
        mo4012a(0, false);
        this.f5089q = false;
    }

    @Override // color.support.p043v7.internal.widget.AbsSpinnerCompat
    /* renamed from: a */
    public void mo4012a(int i, boolean z) {
        int i2 = this.f5069h.left;
        int right = ((getRight() - getLeft()) - this.f5069h.left) - this.f5069h.right;
        if (this.f5093u) {
            m4022d();
        }
        if (this.f5098z == 0) {
            m4011a();
            return;
        }
        if (this.f5094v >= 0) {
            setSelectedPositionInt(this.f5094v);
        }
        int childCount = getChildCount();
        C1217a c1217a = this.f5070i;
        int i3 = this.f5082j;
        for (int i4 = 0; i4 < childCount; i4++) {
            c1217a.m4064a(i3 + i4, getChildAt(i4));
        }
        removeAllViewsInLayout();
        this.f5082j = this.f5096x;
        if (this.f5062a != null) {
            View m4034b = m4034b(this.f5096x, true);
            int measuredWidth = m4034b.getMeasuredWidth();
            int m1777a = C0521f.m1777a(this.f5140I, C0538w.m1878h(this)) & 7;
            if (m1777a == 1) {
                i2 = (i2 + (right / 2)) - (measuredWidth / 2);
            } else if (m1777a == 5) {
                i2 = (i2 + right) - measuredWidth;
            }
            m4034b.offsetLeftAndRight(i2);
        }
        this.f5070i.m4063a();
        invalidate();
        m4023e();
        this.f5093u = false;
        this.f5087o = false;
        setNextSelectedPositionInt(this.f5096x);
    }

    /* renamed from: b */
    private View m4034b(int i, boolean z) {
        View m4062a;
        if (!this.f5093u && (m4062a = this.f5070i.m4062a(i)) != null) {
            m4033a(m4062a, z);
            return m4062a;
        }
        View view = this.f5062a.getView(i, null, this);
        m4033a(view, z);
        return view;
    }

    /* renamed from: a */
    private void m4033a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        if (z) {
            addViewInLayout(view, 0, layoutParams);
        }
        view.setSelected(hasFocus());
        if (this.f5141J) {
            view.setEnabled(isEnabled());
        }
        view.measure(ViewGroup.getChildMeasureSpec(this.f5064c, this.f5069h.left + this.f5069h.right, layoutParams.width), ViewGroup.getChildMeasureSpec(this.f5063b, this.f5069h.top + this.f5069h.bottom, layoutParams.height));
        int measuredHeight = this.f5069h.top + ((((getMeasuredHeight() - this.f5069h.bottom) - this.f5069h.top) - view.getMeasuredHeight()) / 2);
        view.layout(0, measuredHeight, view.getMeasuredWidth() + 0, view.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            performClick = true;
            if (!this.f5137F.mo4087b()) {
                this.f5137F.mo4083a(getTextDirection(), C1154b.m3809a(this));
            }
        }
        return performClick;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        setSelection(i);
        dialogInterface.dismiss();
    }

    public void setPrompt(CharSequence charSequence) {
        this.f5137F.mo4085a(charSequence);
    }

    public void setPromptId(int i) {
        setPrompt(getContext().getText(i));
    }

    public CharSequence getPrompt() {
        return this.f5137F.mo4088c();
    }

    /* renamed from: a */
    public int mo4035a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int i2 = 0;
        View view = null;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f5142K);
        return i2 + this.f5142K.left + this.f5142K.right;
    }

    @Override // color.support.p043v7.internal.widget.AbsSpinnerCompat, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5144c = this.f5137F != null && this.f5137F.mo4087b();
        return savedState;
    }

    @Override // color.support.p043v7.internal.widget.AbsSpinnerCompat, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f5144c || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1243j(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class SavedState extends AbsSpinnerCompat.SavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1250q();

        /* renamed from: c */
        boolean f5144c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5144c = parcel.readByte() != 0;
        }

        @Override // color.support.v7.internal.widget.AbsSpinnerCompat.SavedState, android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f5144c ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: a */
    C1246m mo4036a(Context context, AttributeSet attributeSet, int i) {
        return new C1246m(this, context, attributeSet, i);
    }
}
