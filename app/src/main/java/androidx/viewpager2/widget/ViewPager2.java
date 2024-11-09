package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.AbstractC0845ay;
import androidx.recyclerview.widget.AbstractC0848ba;
import androidx.recyclerview.widget.AbstractC0851bd;
import androidx.recyclerview.widget.C0837aq;
import androidx.recyclerview.widget.InterfaceC0862bo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.R;
import androidx.viewpager2.adapter.InterfaceC1117e;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a */
    static boolean f4502a = true;

    /* renamed from: b */
    int f4503b;

    /* renamed from: c */
    boolean f4504c;

    /* renamed from: d */
    RecyclerView f4505d;

    /* renamed from: e */
    C1123f f4506e;

    /* renamed from: f */
    AbstractC1129l f4507f;

    /* renamed from: g */
    private final Rect f4508g;

    /* renamed from: h */
    private final Rect f4509h;

    /* renamed from: i */
    private C1120c f4510i;

    /* renamed from: j */
    private AbstractC0848ba f4511j;

    /* renamed from: k */
    private LinearLayoutManager f4512k;

    /* renamed from: l */
    private int f4513l;

    /* renamed from: m */
    private Parcelable f4514m;

    /* renamed from: n */
    private C0837aq f4515n;

    /* renamed from: o */
    private C1120c f4516o;

    /* renamed from: p */
    private C1121d f4517p;

    /* renamed from: q */
    private C1122e f4518q;

    /* renamed from: r */
    private AbstractC0851bd f4519r;

    /* renamed from: s */
    private boolean f4520s;

    /* renamed from: t */
    private boolean f4521t;

    /* renamed from: u */
    private int f4522u;

    public ViewPager2(Context context) {
        super(context);
        this.f4508g = new Rect();
        this.f4509h = new Rect();
        this.f4510i = new C1120c();
        this.f4504c = false;
        this.f4511j = new C1125h(this);
        this.f4513l = -1;
        this.f4519r = null;
        this.f4520s = false;
        this.f4521t = true;
        this.f4522u = -1;
        m3714a(context, null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4508g = new Rect();
        this.f4509h = new Rect();
        this.f4510i = new C1120c();
        this.f4504c = false;
        this.f4511j = new C1125h(this);
        this.f4513l = -1;
        this.f4519r = null;
        this.f4520s = false;
        this.f4521t = true;
        this.f4522u = -1;
        m3714a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4508g = new Rect();
        this.f4509h = new Rect();
        this.f4510i = new C1120c();
        this.f4504c = false;
        this.f4511j = new C1125h(this);
        this.f4513l = -1;
        this.f4519r = null;
        this.f4520s = false;
        this.f4521t = true;
        this.f4522u = -1;
        m3714a(context, attributeSet);
    }

    /* renamed from: a */
    private void m3714a(Context context, AttributeSet attributeSet) {
        this.f4507f = f4502a ? new C1134q(this) : new C1130m(this);
        this.f4505d = new C1140w(this, context);
        this.f4505d.setId(C0538w.m1834a());
        this.f4505d.setDescendantFocusability(131072);
        this.f4512k = new C1132o(this);
        this.f4505d.setLayoutManager(this.f4512k);
        this.f4505d.setScrollingTouchSlop(1);
        m3715b(context, attributeSet);
        this.f4505d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f4505d.addOnChildAttachStateChangeListener(m3716e());
        this.f4506e = new C1123f(this);
        this.f4517p = new C1121d(this, this.f4506e, this.f4505d);
        this.f4515n = new C1139v(this);
        this.f4515n.m3240a(this.f4505d);
        this.f4505d.addOnScrollListener(this.f4506e);
        this.f4516o = new C1120c();
        this.f4506e.m3742a(this.f4516o);
        C1126i c1126i = new C1126i(this);
        C1127j c1127j = new C1127j(this);
        this.f4516o.m3729a(c1126i);
        this.f4516o.m3729a(c1127j);
        this.f4507f.mo3751a(this.f4505d);
        this.f4516o.m3729a(this.f4510i);
        this.f4518q = new C1122e(this.f4512k);
        this.f4516o.m3729a(this.f4518q);
        attachViewToParent(this.f4505d, 0, this.f4505d.getLayoutParams());
    }

    /* renamed from: e */
    private InterfaceC0862bo m3716e() {
        return new C1128k(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (this.f4507f.mo3753a()) {
            return this.f4507f.mo3755b();
        }
        return super.getAccessibilityClassName();
    }

    /* renamed from: b */
    private void m3715b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewPager2);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, R.styleable.ViewPager2, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(R.styleable.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4523a = this.f4505d.getId();
        savedState.f4524b = this.f4513l == -1 ? this.f4503b : this.f4513l;
        if (this.f4514m != null) {
            savedState.f4525c = this.f4514m;
        } else {
            Object adapter = this.f4505d.getAdapter();
            if (adapter instanceof InterfaceC1117e) {
                savedState.f4525c = ((InterfaceC1117e) adapter).m3713a();
            }
        }
        return savedState;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4513l = savedState.f4524b;
        this.f4514m = savedState.f4525c;
    }

    /* renamed from: f */
    private void m3717f() {
        AbstractC0845ay adapter;
        if (this.f4513l == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f4514m != null) {
            this.f4514m = null;
        }
        this.f4503b = Math.max(0, Math.min(this.f4513l, adapter.mo3020b() - 1));
        this.f4513l = -1;
        this.f4505d.scrollToPosition(this.f4503b);
        this.f4507f.mo3758c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f4523a;
            sparseArray.put(this.f4505d.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m3717f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1141x();

        /* renamed from: a */
        int f4523a;

        /* renamed from: b */
        int f4524b;

        /* renamed from: c */
        Parcelable f4525c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m3722a(parcel, classLoader);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            m3722a(parcel, null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m3722a(Parcel parcel, ClassLoader classLoader) {
            this.f4523a = parcel.readInt();
            this.f4524b = parcel.readInt();
            this.f4525c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4523a);
            parcel.writeInt(this.f4524b);
            parcel.writeParcelable(this.f4525c, i);
        }
    }

    public final void setAdapter(AbstractC0845ay abstractC0845ay) {
        AbstractC0845ay<?> adapter = this.f4505d.getAdapter();
        this.f4507f.mo3756b(adapter);
        if (adapter != null) {
            adapter.m3023b(this.f4511j);
        }
        this.f4505d.setAdapter(abstractC0845ay);
        this.f4503b = 0;
        m3717f();
        this.f4507f.mo3752a((AbstractC0845ay<?>) abstractC0845ay);
        if (abstractC0845ay != null) {
            abstractC0845ay.m3017a(this.f4511j);
        }
    }

    public final AbstractC0845ay getAdapter() {
        return this.f4505d.getAdapter();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(getClass().getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.f4505d, i, i2);
        int measuredWidth = this.f4505d.getMeasuredWidth();
        int measuredHeight = this.f4505d.getMeasuredHeight();
        int measuredState = this.f4505d.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f4505d.getMeasuredWidth();
        int measuredHeight = this.f4505d.getMeasuredHeight();
        this.f4508g.left = getPaddingLeft();
        this.f4508g.right = (i3 - i) - getPaddingRight();
        this.f4508g.top = getPaddingTop();
        this.f4508g.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f4508g, this.f4509h);
        this.f4505d.layout(this.f4509h.left, this.f4509h.top, this.f4509h.right, this.f4509h.bottom);
        if (this.f4504c) {
            m3718a();
        }
    }

    /* renamed from: a */
    public final void m3718a() {
        if (this.f4515n == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View mo2963a = this.f4515n.mo2963a(this.f4512k);
        if (mo2963a == null) {
            return;
        }
        int e = LinearLayoutManager.m3069e(mo2963a);
        if (e != this.f4503b && getScrollState() == 0) {
            this.f4516o.mo3727a(e);
        }
        this.f4504c = false;
    }

    public final int getPageSize() {
        RecyclerView recyclerView = this.f4505d;
        if (getOrientation() == 0) {
            return (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        }
        return (recyclerView.getHeight() - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom();
    }

    public final void setOrientation(int i) {
        this.f4512k.m2823a(i);
        this.f4507f.mo3760d();
    }

    public final int getOrientation() {
        return this.f4512k.m2844i();
    }

    /* renamed from: b */
    public final boolean m3719b() {
        return this.f4512k.m3120u() == 1;
    }

    public final void setCurrentItemInternal$2563266(int i) {
        AbstractC0845ay adapter = getAdapter();
        if (adapter == null) {
            if (this.f4513l != -1) {
                this.f4513l = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.mo3020b() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i, 0), adapter.mo3020b() - 1);
        if ((min == this.f4503b && this.f4506e.m3744c()) || min == this.f4503b) {
            return;
        }
        double d = this.f4503b;
        this.f4503b = min;
        this.f4507f.mo3762e();
        if (!this.f4506e.m3744c()) {
            d = this.f4506e.m3746e();
        }
        this.f4506e.m3741a(min);
        double d2 = min;
        if (Math.abs(d2 - d) > 3.0d) {
            this.f4505d.scrollToPosition(d2 > d ? min - 3 : min + 3);
            this.f4505d.post(new RunnableC1142y(min, this.f4505d));
        } else {
            this.f4505d.smoothScrollToPosition(min);
        }
    }

    public final int getCurrentItem() {
        return this.f4503b;
    }

    public final int getScrollState() {
        return this.f4506e.m3743b();
    }

    /* renamed from: c */
    public final boolean m3720c() {
        return this.f4517p.m3731a();
    }

    public final void setUserInputEnabled(boolean z) {
        this.f4521t = z;
        this.f4507f.mo3763f();
    }

    /* renamed from: d */
    public final boolean m3721d() {
        return this.f4521t;
    }

    public final void setOffscreenPageLimit(int i) {
        if (i <= 0 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f4522u = i;
        this.f4505d.requestLayout();
    }

    public final int getOffscreenPageLimit() {
        return this.f4522u;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f4505d.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f4505d.canScrollVertically(i);
    }

    public final void setPageTransformer(InterfaceC1138u interfaceC1138u) {
        if (interfaceC1138u != null) {
            if (!this.f4520s) {
                this.f4519r = this.f4505d.getItemAnimator();
                this.f4520s = true;
            }
            this.f4505d.setItemAnimator(null);
        } else if (this.f4520s) {
            this.f4505d.setItemAnimator(this.f4519r);
            this.f4519r = null;
            this.f4520s = false;
        }
        if (interfaceC1138u == this.f4518q.m3732a()) {
            return;
        }
        this.f4518q.m3733a(interfaceC1138u);
        if (this.f4518q.m3732a() != null) {
            double m3746e = this.f4506e.m3746e();
            int i = (int) m3746e;
            float f = (float) (m3746e - i);
            this.f4518q.mo3728a(i, f, Math.round(getPageSize() * f));
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f4507f.mo3764g();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f4507f.mo3749a(accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f4507f.mo3754a(i)) {
            return this.f4507f.mo3757b(i);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public final int getItemDecorationCount() {
        return this.f4505d.getItemDecorationCount();
    }

    public final void setCurrentItem(int i) {
        if (this.f4517p.m3731a()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        setCurrentItemInternal$2563266(i);
    }
}
