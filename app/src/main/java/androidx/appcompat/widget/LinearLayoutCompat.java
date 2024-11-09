package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a */
    private boolean f907a;

    /* renamed from: b */
    private int f908b;

    /* renamed from: c */
    private int f909c;

    /* renamed from: d */
    private int f910d;

    /* renamed from: e */
    private int f911e;

    /* renamed from: f */
    private int f912f;

    /* renamed from: g */
    private float f913g;

    /* renamed from: h */
    private boolean f914h;

    /* renamed from: i */
    private int[] f915i;

    /* renamed from: j */
    private int[] f916j;

    /* renamed from: k */
    private Drawable f917k;

    /* renamed from: l */
    private int f918l;

    /* renamed from: m */
    private int f919m;

    /* renamed from: n */
    private int f920n;

    /* renamed from: o */
    private int f921o;

    private static int getChildrenSkipCount$5359dca7() {
        return 0;
    }

    private static int getLocationOffset$3c7ec8d0() {
        return 0;
    }

    private static int getNextLocationOffset$3c7ec8d0() {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f907a = true;
        this.f908b = -1;
        this.f909c = 0;
        this.f911e = 8388659;
        C0276dn m944a = C0276dn.m944a(context, attributeSet, R.styleable.LinearLayoutCompat, i, 0);
        int m946a = m944a.m946a(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (m946a >= 0) {
            setOrientation(m946a);
        }
        int m946a2 = m944a.m946a(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (m946a2 >= 0) {
            setGravity(m946a2);
        }
        boolean m949a = m944a.m949a(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!m949a) {
            setBaselineAligned(m949a);
        }
        this.f913g = m944a.m957e(R.styleable.LinearLayoutCompat_android_weightSum);
        this.f908b = m944a.m946a(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f914h = m944a.m949a(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(m944a.m948a(R.styleable.LinearLayoutCompat_divider));
        this.f920n = m944a.m946a(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.f921o = m944a.m958e(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        m944a.m952b();
    }

    public void setShowDividers(int i) {
        if (i != this.f920n) {
            requestLayout();
        }
        this.f920n = i;
    }

    public int getShowDividers() {
        return this.f920n;
    }

    public Drawable getDividerDrawable() {
        return this.f917k;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f917k) {
            return;
        }
        this.f917k = drawable;
        if (drawable != null) {
            this.f918l = drawable.getIntrinsicWidth();
            this.f919m = drawable.getIntrinsicHeight();
        } else {
            this.f918l = 0;
            this.f919m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f921o = i;
    }

    public int getDividerPadding() {
        return this.f921o;
    }

    public int getDividerWidth() {
        return this.f918l;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int right;
        int left;
        int bottom;
        if (this.f917k == null) {
            return;
        }
        int i = 0;
        if (this.f910d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i < virtualChildCount) {
                View childAt = getChildAt(i);
                if (childAt != null && childAt.getVisibility() != 8 && m589a(i)) {
                    m584a(canvas, (childAt.getTop() - ((C0227bs) childAt.getLayoutParams()).topMargin) - this.f919m);
                }
                i++;
            }
            if (m589a(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f919m;
                } else {
                    bottom = childAt2.getBottom() + ((C0227bs) childAt2.getLayoutParams()).bottomMargin;
                }
                m584a(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean m987a = C0295ef.m987a(this);
        while (i < virtualChildCount2) {
            View childAt3 = getChildAt(i);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m589a(i)) {
                C0227bs c0227bs = (C0227bs) childAt3.getLayoutParams();
                if (m987a) {
                    left = childAt3.getRight() + c0227bs.rightMargin;
                } else {
                    left = (childAt3.getLeft() - c0227bs.leftMargin) - this.f918l;
                }
                m587b(canvas, left);
            }
            i++;
        }
        if (m589a(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0227bs c0227bs2 = (C0227bs) childAt4.getLayoutParams();
                if (m987a) {
                    right = (childAt4.getLeft() - c0227bs2.leftMargin) - this.f918l;
                } else {
                    right = childAt4.getRight() + c0227bs2.rightMargin;
                }
            } else if (m987a) {
                right = getPaddingLeft();
            } else {
                right = (getWidth() - getPaddingRight()) - this.f918l;
            }
            m587b(canvas, right);
        }
    }

    /* renamed from: a */
    private void m584a(Canvas canvas, int i) {
        this.f917k.setBounds(getPaddingLeft() + this.f921o, i, (getWidth() - getPaddingRight()) - this.f921o, this.f919m + i);
        this.f917k.draw(canvas);
    }

    /* renamed from: b */
    private void m587b(Canvas canvas, int i) {
        this.f917k.setBounds(i, getPaddingTop() + this.f921o, this.f918l + i, (getHeight() - getPaddingBottom()) - this.f921o);
        this.f917k.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.f907a = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f914h = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f908b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f908b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f908b);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f908b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i2 = this.f909c;
        if (this.f910d == 1 && (i = this.f911e & 112) != 48) {
            if (i == 16) {
                i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f912f) / 2;
            } else if (i == 80) {
                i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f912f;
            }
        }
        return i2 + ((C0227bs) childAt.getLayoutParams()).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f908b;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f908b = i;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f913g;
    }

    public void setWeightSum(float f) {
        this.f913g = Math.max(0.0f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r37, int r38) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m589a(int i) {
        if (i == 0) {
            return (this.f920n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f920n & 4) != 0;
        }
        if ((this.f920n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m583a(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0227bs c0227bs = (C0227bs) childAt.getLayoutParams();
                if (c0227bs.width == -1) {
                    int i4 = c0227bs.height;
                    c0227bs.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    c0227bs.height = i4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x0399, code lost:            if (r7 < 0) goto L159;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0225, code lost:            if (r13[3] != (-1)) goto L102;     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c6  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m586b(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.m586b(int, int):void");
    }

    /* renamed from: a */
    private void m585a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: b */
    private static void m588b(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.f910d != i) {
            this.f910d = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f910d;
    }

    public void setGravity(int i) {
        if (this.f911e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f911e = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.f911e;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((8388615 & this.f911e) != i2) {
            this.f911e = i2 | (this.f911e & (-8388616));
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.f911e & 112) != i2) {
            this.f911e = i2 | (this.f911e & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0227bs generateLayoutParams(AttributeSet attributeSet) {
        return new C0227bs(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0227bs generateDefaultLayoutParams() {
        if (this.f910d == 0) {
            return new C0227bs(-2, -2);
        }
        if (this.f910d == 1) {
            return new C0227bs(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0227bs generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0227bs(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0227bs;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }
}
