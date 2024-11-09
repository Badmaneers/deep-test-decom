package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.appcompat.view.menu.InterfaceC0146af;
import androidx.appcompat.view.menu.InterfaceC0169p;
import androidx.appcompat.view.menu.InterfaceC0170q;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements InterfaceC0146af, InterfaceC0170q {

    /* renamed from: a */
    InterfaceC0169p f823a;

    /* renamed from: b */
    InterfaceC0312u f824b;

    /* renamed from: c */
    private C0168o f825c;

    /* renamed from: d */
    private Context f826d;

    /* renamed from: e */
    private int f827e;

    /* renamed from: f */
    private boolean f828f;

    /* renamed from: g */
    private ActionMenuPresenter f829g;

    /* renamed from: h */
    private InterfaceC0145ae f830h;

    /* renamed from: i */
    private boolean f831i;

    /* renamed from: j */
    private int f832j;

    /* renamed from: k */
    private int f833k;

    /* renamed from: l */
    private int f834l;

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: b */
    public final /* synthetic */ C0227bs generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m556a(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m560j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m556a(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: i */
    public final /* synthetic */ C0227bs generateDefaultLayoutParams() {
        return m560j();
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f833k = (int) (56.0f * f);
        this.f834l = (int) (f * 4.0f);
        this.f826d = context;
        this.f827e = 0;
    }

    public void setPopupTheme(int i) {
        if (this.f827e != i) {
            this.f827e = i;
            if (i == 0) {
                this.f826d = getContext();
            } else {
                this.f826d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f827e;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f829g = actionMenuPresenter;
        this.f829g.m544a(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f829g != null) {
            this.f829g.mo387a(false);
            if (this.f829g.m554l()) {
                this.f829g.m551i();
                this.f829g.m550h();
            }
        }
    }

    public void setOnMenuItemClickListener(InterfaceC0312u interfaceC0312u) {
        this.f824b = interfaceC0312u;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02aa  */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    /* renamed from: a */
    public static int m555a(View view, int i, int i2, int i3, int i4) {
        C0310s c0310s = (C0310s) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.m340b();
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        }
        c0310s.f1435d = !c0310s.f1432a && z;
        c0310s.f1433b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int width;
        int i7;
        if (!this.f831i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean m987a = C0295ef.m987a(this);
        int i10 = paddingRight;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0310s c0310s = (C0310s) childAt.getLayoutParams();
                if (c0310s.f1432a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m559b(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m987a) {
                        i7 = getPaddingLeft() + c0310s.leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - c0310s.rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i14 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i14, width, measuredHeight + i14);
                    i10 -= measuredWidth;
                    i11 = 1;
                } else {
                    i10 -= (childAt.getMeasuredWidth() + c0310s.leftMargin) + c0310s.rightMargin;
                    m559b(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i9 / 2) - (measuredWidth2 / 2);
            int i16 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        if (i17 > 0) {
            i6 = i10 / i17;
            i5 = 0;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int max = Math.max(i5, i6);
        if (m987a) {
            int width2 = getWidth() - getPaddingRight();
            while (i5 < childCount) {
                View childAt3 = getChildAt(i5);
                C0310s c0310s2 = (C0310s) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0310s2.f1432a) {
                    int i18 = width2 - c0310s2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + c0310s2.leftMargin) + max);
                }
                i5++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i5 < childCount) {
            View childAt4 = getChildAt(i5);
            C0310s c0310s3 = (C0310s) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0310s3.f1432a) {
                int i20 = paddingLeft + c0310s3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + c0310s3.rightMargin + max;
            }
            i5++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m570h();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f829g.m543a(drawable);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f829g.m549g();
    }

    /* renamed from: a */
    public final boolean m563a() {
        return this.f828f;
    }

    public void setOverflowReserved(boolean z) {
        this.f828f = z;
    }

    /* renamed from: j */
    private static C0310s m560j() {
        C0310s c0310s = new C0310s();
        c0310s.f1229h = 16;
        return c0310s;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: b */
    public C0310s generateLayoutParams(AttributeSet attributeSet) {
        return new C0310s(getContext(), attributeSet);
    }

    /* renamed from: a */
    public static C0310s m556a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            C0310s c0310s = layoutParams instanceof C0310s ? new C0310s((C0310s) layoutParams) : new C0310s(layoutParams);
            if (c0310s.f1229h <= 0) {
                c0310s.f1229h = 16;
            }
            return c0310s;
        }
        return m560j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0310s;
    }

    /* renamed from: b */
    public static C0310s m557b() {
        C0310s m560j = m560j();
        m560j.f1432a = true;
        return m560j;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0170q
    /* renamed from: a */
    public final boolean mo344a(C0172s c0172s) {
        return this.f825c.m453a(c0172s, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0146af
    /* renamed from: a */
    public void mo343a(C0168o c0168o) {
        this.f825c = c0168o;
    }

    public Menu getMenu() {
        if (this.f825c == null) {
            Context context = getContext();
            this.f825c = new C0168o(context);
            this.f825c.mo395a(new C0311t(this));
            this.f829g = new ActionMenuPresenter(context);
            this.f829g.m548e();
            this.f829g.mo385a(this.f830h != null ? this.f830h : new C0309r());
            this.f825c.m451a(this.f829g, this.f826d);
            this.f829g.m544a(this);
        }
        return this.f825c;
    }

    /* renamed from: a */
    public final void m562a(InterfaceC0145ae interfaceC0145ae, InterfaceC0169p interfaceC0169p) {
        this.f830h = interfaceC0145ae;
        this.f823a = interfaceC0169p;
    }

    /* renamed from: c */
    public final C0168o m565c() {
        return this.f825c;
    }

    /* renamed from: d */
    public final boolean m566d() {
        return this.f829g != null && this.f829g.m550h();
    }

    /* renamed from: e */
    public final boolean m567e() {
        return this.f829g != null && this.f829g.m551i();
    }

    /* renamed from: f */
    public final boolean m568f() {
        return this.f829g != null && this.f829g.m554l();
    }

    /* renamed from: g */
    public final boolean m569g() {
        if (this.f829g != null) {
            ActionMenuPresenter actionMenuPresenter = this.f829g;
            if (actionMenuPresenter.f803j != null || actionMenuPresenter.m554l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m570h() {
        if (this.f829g != null) {
            this.f829g.m552j();
        }
    }

    /* renamed from: b */
    private boolean m559b(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0308q)) {
            z = false | ((InterfaceC0308q) childAt).mo342d();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0308q)) ? z : z | ((InterfaceC0308q) childAt2).mo341c();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f829g.m545b(z);
    }
}
