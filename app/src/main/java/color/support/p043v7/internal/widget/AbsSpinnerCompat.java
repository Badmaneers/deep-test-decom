package color.support.p043v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
abstract class AbsSpinnerCompat extends AdapterViewCompat<SpinnerAdapter> {

    /* renamed from: E */
    private DataSetObserver f5061E;

    /* renamed from: a */
    SpinnerAdapter f5062a;

    /* renamed from: b */
    int f5063b;

    /* renamed from: c */
    int f5064c;

    /* renamed from: d */
    int f5065d;

    /* renamed from: e */
    int f5066e;

    /* renamed from: f */
    int f5067f;

    /* renamed from: g */
    int f5068g;

    /* renamed from: h */
    final Rect f5069h;

    /* renamed from: i */
    final C1217a f5070i;

    /* renamed from: a */
    abstract void mo4012a(int i, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbsSpinnerCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5065d = 0;
        this.f5066e = 0;
        this.f5067f = 0;
        this.f5068g = 0;
        this.f5069h = new Rect();
        this.f5070i = new C1217a(this);
        setFocusable(true);
        setWillNotDraw(false);
    }

    @Override // color.support.p043v7.internal.widget.AdapterViewCompat
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.f5062a != null) {
            this.f5062a.unregisterDataSetObserver(this.f5061E);
            m4011a();
        }
        this.f5062a = spinnerAdapter;
        this.f5074B = -1;
        this.f5075C = Long.MIN_VALUE;
        if (this.f5062a != null) {
            this.f5073A = this.f5098z;
            this.f5098z = this.f5062a.getCount();
            m4020b();
            this.f5061E = new C1236c(this);
            this.f5062a.registerDataSetObserver(this.f5061E);
            int i = this.f5098z > 0 ? 0 : -1;
            setSelectedPositionInt(i);
            setNextSelectedPositionInt(i);
            if (this.f5098z == 0) {
                m4023e();
            }
        } else {
            m4020b();
            m4011a();
            m4023e();
        }
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4011a() {
        this.f5093u = false;
        this.f5087o = false;
        removeAllViewsInLayout();
        this.f5074B = -1;
        this.f5075C = Long.MIN_VALUE;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r1 = r7.getPaddingLeft()
            int r2 = r7.getPaddingTop()
            int r3 = r7.getPaddingRight()
            int r4 = r7.getPaddingBottom()
            android.graphics.Rect r5 = r7.f5069h
            int r6 = r7.f5065d
            if (r1 <= r6) goto L1c
            r6 = r1
            goto L1e
        L1c:
            int r6 = r7.f5065d
        L1e:
            r5.left = r6
            android.graphics.Rect r5 = r7.f5069h
            int r6 = r7.f5066e
            if (r2 <= r6) goto L27
            goto L29
        L27:
            int r2 = r7.f5066e
        L29:
            r5.top = r2
            android.graphics.Rect r2 = r7.f5069h
            int r5 = r7.f5067f
            if (r3 <= r5) goto L32
            goto L34
        L32:
            int r3 = r7.f5067f
        L34:
            r2.right = r3
            android.graphics.Rect r2 = r7.f5069h
            int r3 = r7.f5068g
            if (r4 <= r3) goto L3d
            goto L3f
        L3d:
            int r4 = r7.f5068g
        L3f:
            r2.bottom = r4
            boolean r2 = r7.f5093u
            if (r2 == 0) goto L48
            r7.m4022d()
        L48:
            int r2 = r7.getSelectedItemPosition()
            r3 = 1
            r4 = 0
            if (r2 < 0) goto La4
            android.widget.SpinnerAdapter r5 = r7.f5062a
            if (r5 == 0) goto La4
            android.widget.SpinnerAdapter r5 = r7.f5062a
            int r5 = r5.getCount()
            if (r2 >= r5) goto La4
            color.support.v7.internal.widget.a r5 = r7.f5070i
            android.view.View r5 = r5.m4062a(r2)
            if (r5 != 0) goto L6b
            android.widget.SpinnerAdapter r5 = r7.f5062a
            r6 = 0
            android.view.View r5 = r5.getView(r2, r6, r7)
        L6b:
            if (r5 == 0) goto La4
            color.support.v7.internal.widget.a r1 = r7.f5070i
            r1.m4064a(r2, r5)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            if (r1 != 0) goto L83
            r7.f5076D = r3
            android.view.ViewGroup$LayoutParams r1 = r7.generateDefaultLayoutParams()
            r5.setLayoutParams(r1)
            r7.f5076D = r4
        L83:
            r7.measureChild(r5, r8, r9)
            int r1 = r5.getMeasuredHeight()
            android.graphics.Rect r2 = r7.f5069h
            int r2 = r2.top
            int r1 = r1 + r2
            android.graphics.Rect r2 = r7.f5069h
            int r2 = r2.bottom
            int r1 = r1 + r2
            int r2 = r5.getMeasuredWidth()
            android.graphics.Rect r3 = r7.f5069h
            int r3 = r3.left
            int r2 = r2 + r3
            android.graphics.Rect r3 = r7.f5069h
            int r3 = r3.right
            int r2 = r2 + r3
            r3 = r4
            goto La5
        La4:
            r2 = r4
        La5:
            if (r3 == 0) goto Lbb
            android.graphics.Rect r1 = r7.f5069h
            int r1 = r1.top
            android.graphics.Rect r3 = r7.f5069h
            int r3 = r3.bottom
            int r1 = r1 + r3
            if (r0 != 0) goto Lbb
            android.graphics.Rect r0 = r7.f5069h
            int r0 = r0.left
            android.graphics.Rect r2 = r7.f5069h
            int r2 = r2.right
            int r2 = r2 + r0
        Lbb:
            int r0 = r7.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r7.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = androidx.core.p024g.C0538w.m1835a(r0, r9, r4)
            int r1 = androidx.core.p024g.C0538w.m1835a(r1, r8, r4)
            r7.setMeasuredDimension(r1, r0)
            r7.f5063b = r9
            r7.f5064c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: color.support.p043v7.internal.widget.AbsSpinnerCompat.onMeasure(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-1, -2);
    }

    @Override // color.support.p043v7.internal.widget.AdapterViewCompat
    public void setSelection(int i) {
        setNextSelectedPositionInt(i);
        requestLayout();
        invalidate();
    }

    @Override // color.support.p043v7.internal.widget.AdapterViewCompat
    public View getSelectedView() {
        if (this.f5098z <= 0 || this.f5096x < 0) {
            return null;
        }
        return getChildAt(this.f5096x - this.f5082j);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f5076D) {
            return;
        }
        super.requestLayout();
    }

    @Override // color.support.p043v7.internal.widget.AdapterViewCompat
    public SpinnerAdapter getAdapter() {
        return this.f5062a;
    }

    @Override // color.support.p043v7.internal.widget.AdapterViewCompat
    public int getCount() {
        return this.f5098z;
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1235b();

        /* renamed from: a */
        long f5071a;

        /* renamed from: b */
        int f5072b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5071a = parcel.readLong();
            this.f5072b = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f5071a);
            parcel.writeInt(this.f5072b);
        }

        public String toString() {
            return "AbsSpinner.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.f5071a + " position=" + this.f5072b + "}";
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5071a = getSelectedItemId();
        if (savedState.f5071a >= 0) {
            savedState.f5072b = getSelectedItemPosition();
        } else {
            savedState.f5072b = -1;
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f5071a >= 0) {
            this.f5093u = true;
            this.f5087o = true;
            this.f5085m = savedState.f5071a;
            this.f5084l = savedState.f5072b;
            this.f5088p = 0;
            requestLayout();
        }
    }
}
