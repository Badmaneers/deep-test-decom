package color.support.p043v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0295ef;
import androidx.appcompat.widget.C0310s;
import androidx.core.p024g.C0538w;
import color.support.p043v7.appcompat.R;
import com.color.support.C1306a;
import com.color.support.widget.popupwindow.C1589e;
import com.color.support.widget.popupwindow.ViewOnLayoutChangeListenerC1585a;
import com.coloros.neton.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ColorActionMenuViewV6 extends ActionMenuView {

    /* renamed from: c */
    public ViewOnLayoutChangeListenerC1585a f5293c;

    /* renamed from: d */
    private C0168o f5294d;

    /* renamed from: e */
    private List<Class<?>> f5295e;

    /* renamed from: f */
    private int f5296f;

    /* renamed from: g */
    private int f5297g;

    /* renamed from: h */
    private ArrayList f5298h;

    /* renamed from: i */
    private C0172s f5299i;

    /* renamed from: j */
    private int f5300j;

    /* renamed from: k */
    private boolean f5301k;

    /* renamed from: l */
    private int f5302l;

    public ColorActionMenuViewV6(Context context) {
        this(context, null);
    }

    public ColorActionMenuViewV6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5294d = null;
        this.f5295e = new ArrayList();
        this.f5301k = true;
        this.f5302l = 0;
        this.f5302l = getResources().getDimensionPixelSize(R.dimen.color_actionbar_menuview_padding);
        this.f5300j = getResources().getDimensionPixelSize(R.dimen.color_action_menu_item_min_width);
        this.f5297g = getResources().getDimensionPixelSize(R.dimen.color_action_menu_text_extra_padding);
        this.f5296f = getResources().getDimensionPixelSize(R.dimen.color_actionbar_menuitemview_item_spacing);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.setOnLongClickListener(new ViewOnLongClickListenerC1260a(this));
        view.setHapticFeedbackEnabled(false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.color_toolbar_menu_bg_radius);
        Drawable drawable = getContext().getDrawable(R.drawable.color_toolbar_menu_bg);
        if (Build.VERSION.SDK_INT < 23 && (drawable instanceof RippleDrawable)) {
            C1306a.m4283a((RippleDrawable) drawable, dimensionPixelSize);
        }
        view.setBackground(drawable);
        if (view.getClass().getName().equals("androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton")) {
            layoutParams.height = -1;
            view.setMinimumWidth(this.f5300j);
            view.setOnTouchListener(null);
            view.setOnClickListener(new ViewOnClickListenerC1264b(this, view));
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.ActionMenuView, androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f5294d == null) {
            super.onMeasure(i, i2);
            return;
        }
        this.f5301k = true;
        if ((getParent() instanceof Toolbar) && ((Toolbar) getParent()).getIsTitleCenterStyle()) {
            this.f5301k = false;
        }
        setPadding(0, getPaddingTop(), 0, getPaddingBottom());
        boolean z = C0538w.m1878h(this) == 1;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i5 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + i5 + i3, marginLayoutParams.width), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
            i3 += childAt.getMeasuredWidth() + i5;
        }
        if (this.f5301k) {
            int childCount = getChildCount();
            if (childCount > 0) {
                int i6 = -1;
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    if (getChildAt(i8).getVisibility() != 8) {
                        i7++;
                        i6 = i8;
                    }
                }
                int i9 = i3 + ((i7 - 1) * this.f5296f);
                if (i6 != -1) {
                    View childAt2 = getChildAt(i6);
                    if ((childAt2 instanceof TextView) && !TextUtils.isEmpty(((TextView) childAt2).getText())) {
                        i9 += this.f5297g;
                    }
                }
                size = i9;
            } else {
                size = 0;
            }
            if (z) {
                setPadding(getPaddingLeft(), getPaddingTop(), 0, getPaddingBottom());
            }
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.ActionMenuView, androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (getChildAt(i7).getVisibility() != 8) {
                i6++;
            }
        }
        if (i6 > 5) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        boolean m987a = C0295ef.m987a(this);
        int i8 = (i4 - i2) / 2;
        if (this.f5301k) {
            if (m987a) {
                int width = getWidth() - getPaddingRight();
                while (i5 < childCount) {
                    View childAt = getChildAt(i5);
                    C0310s c0310s = (C0310s) childAt.getLayoutParams();
                    if (childAt.getVisibility() != 8) {
                        int i9 = width - c0310s.rightMargin;
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i10 = i8 - (measuredHeight / 2);
                        childAt.layout(i9 - measuredWidth, i10, i9, measuredHeight + i10);
                        width = i9 - ((measuredWidth + c0310s.leftMargin) + this.f5296f);
                    }
                    i5++;
                }
                return;
            }
            int paddingLeft = getPaddingLeft();
            while (i5 < childCount) {
                View childAt2 = getChildAt(i5);
                C0310s c0310s2 = (C0310s) childAt2.getLayoutParams();
                if (childAt2.getVisibility() != 8) {
                    int i11 = paddingLeft + c0310s2.leftMargin;
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    int i12 = i8 - (measuredHeight2 / 2);
                    childAt2.layout(i11, i12, i11 + measuredWidth2, measuredHeight2 + i12);
                    paddingLeft = i11 + measuredWidth2 + c0310s2.rightMargin + this.f5296f;
                }
                i5++;
            }
            return;
        }
        if (m987a) {
            int paddingLeft2 = getPaddingLeft();
            boolean z2 = true;
            for (int i13 = childCount - 1; i13 >= 0; i13--) {
                View childAt3 = getChildAt(i13);
                C0310s c0310s3 = (C0310s) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8) {
                    paddingLeft2 += c0310s3.leftMargin;
                    if (z2) {
                        if ((childAt3 instanceof TextView) && !TextUtils.isEmpty(((TextView) childAt3).getText())) {
                            paddingLeft2 += this.f5297g;
                        }
                        z2 = false;
                    }
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i14 = i8 - (measuredHeight3 / 2);
                    if (i13 == 0 && i6 > 1) {
                        int width2 = ((getWidth() - getPaddingRight()) - c0310s3.rightMargin) - measuredWidth3;
                        if ((childAt3 instanceof TextView) && !TextUtils.isEmpty(((TextView) childAt3).getText())) {
                            width2 -= this.f5302l;
                        }
                        childAt3.layout(width2, i14, measuredWidth3 + width2, measuredHeight3 + i14);
                    } else {
                        childAt3.layout(paddingLeft2, i14, paddingLeft2 + measuredWidth3, measuredHeight3 + i14);
                        paddingLeft2 += measuredWidth3 + c0310s3.rightMargin + this.f5296f;
                    }
                }
            }
            return;
        }
        int width3 = getWidth() - getPaddingRight();
        boolean z3 = true;
        for (int i15 = childCount - 1; i15 >= 0; i15--) {
            View childAt4 = getChildAt(i15);
            C0310s c0310s4 = (C0310s) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8) {
                width3 -= c0310s4.rightMargin;
                if (z3) {
                    if ((childAt4 instanceof TextView) && !TextUtils.isEmpty(((TextView) childAt4).getText())) {
                        width3 -= this.f5297g;
                    }
                    z3 = false;
                }
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i16 = i8 - (measuredHeight4 / 2);
                if (i15 == 0 && i6 > 1) {
                    int paddingLeft3 = getPaddingLeft() + c0310s4.leftMargin;
                    if ((childAt4 instanceof TextView) && !TextUtils.isEmpty(((TextView) childAt4).getText())) {
                        paddingLeft3 += this.f5302l;
                    }
                    childAt4.layout(paddingLeft3, i16, measuredWidth4 + paddingLeft3, measuredHeight4 + i16);
                } else {
                    childAt4.layout(width3 - measuredWidth4, i16, width3, measuredHeight4 + i16);
                    width3 -= (measuredWidth4 + c0310s4.leftMargin) + this.f5296f;
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView
    public void setOverflowReserved(boolean z) {
        super.setOverflowReserved(z);
        if (this.f5293c == null || !this.f5293c.isShowing()) {
            return;
        }
        this.f5298h.clear();
        if (this.f5294d.m471o().size() == 0) {
            ((BaseAdapter) this.f5293c.m5331b().getAdapter()).notifyDataSetChanged();
            this.f5293c.dismiss();
            return;
        }
        for (int i = 0; i < this.f5294d.m471o().size(); i++) {
            this.f5299i = this.f5294d.m471o().get(i);
            if (this.f5299i.getIcon() != null) {
                this.f5298h.add(i, new C1589e(this.f5299i.getIcon(), this.f5299i.getTitle() != null ? this.f5299i.getTitle().toString() : BuildConfig.FLAVOR, this.f5299i.isEnabled()));
            } else {
                this.f5298h.add(i, new C1589e(this.f5299i.getTitle() != null ? this.f5299i.getTitle().toString() : BuildConfig.FLAVOR, this.f5299i.isEnabled()));
            }
        }
        ((BaseAdapter) this.f5293c.m5331b().getAdapter()).notifyDataSetChanged();
        this.f5293c.m5327a();
        this.f5293c.update(this.f5293c.getWidth(), this.f5293c.getHeight());
    }

    @Override // androidx.appcompat.widget.ActionMenuView
    public Menu getMenu() {
        this.f5294d = (C0168o) super.getMenu();
        return this.f5294d;
    }

    @Override // androidx.appcompat.widget.ActionMenuView, androidx.appcompat.view.menu.InterfaceC0146af
    /* renamed from: a */
    public final void mo343a(C0168o c0168o) {
        this.f5294d = c0168o;
        super.mo343a(c0168o);
    }
}
