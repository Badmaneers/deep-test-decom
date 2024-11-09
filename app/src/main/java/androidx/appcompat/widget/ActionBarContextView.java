package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.AbstractC0128b;
import androidx.appcompat.view.menu.C0168o;
import androidx.core.p024g.C0507ah;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0181a {

    /* renamed from: g */
    private CharSequence f761g;

    /* renamed from: h */
    private CharSequence f762h;

    /* renamed from: i */
    private View f763i;

    /* renamed from: j */
    private View f764j;

    /* renamed from: k */
    private LinearLayout f765k;

    /* renamed from: l */
    private TextView f766l;

    /* renamed from: m */
    private TextView f767m;

    /* renamed from: n */
    private int f768n;

    /* renamed from: o */
    private int f769o;

    /* renamed from: p */
    private boolean f770p;

    /* renamed from: q */
    private int f771q;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC0181a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0507ah mo510a(int i, long j) {
        return super.mo510a(i, j);
    }

    @Override // androidx.appcompat.widget.AbstractC0181a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0181a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // androidx.appcompat.widget.AbstractC0181a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0181a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0181a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0276dn m944a = C0276dn.m944a(context, attributeSet, R.styleable.ActionMode, i, 0);
        C0538w.m1846a(this, m944a.m948a(R.styleable.ActionMode_background));
        this.f768n = m944a.m962g(R.styleable.ActionMode_titleTextStyle, 0);
        this.f769o = m944a.m962g(R.styleable.ActionMode_subtitleTextStyle, 0);
        this.f1088e = m944a.m959f(R.styleable.ActionMode_height, 0);
        this.f771q = m944a.m962g(R.styleable.ActionMode_closeItemLayout, R.layout.abc_action_mode_close_item_material);
        m944a.m952b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1087d != null) {
            this.f1087d.m551i();
            this.f1087d.m553k();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0181a
    public void setContentHeight(int i) {
        this.f1088e = i;
    }

    public void setCustomView(View view) {
        if (this.f764j != null) {
            removeView(this.f764j);
        }
        this.f764j = view;
        if (view != null && this.f765k != null) {
            removeView(this.f765k);
            this.f765k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.f761g = charSequence;
        m509e();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f762h = charSequence;
        m509e();
    }

    public CharSequence getTitle() {
        return this.f761g;
    }

    public CharSequence getSubtitle() {
        return this.f762h;
    }

    /* renamed from: e */
    private void m509e() {
        if (this.f765k == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            this.f765k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f766l = (TextView) this.f765k.findViewById(R.id.action_bar_title);
            this.f767m = (TextView) this.f765k.findViewById(R.id.action_bar_subtitle);
            if (this.f768n != 0) {
                this.f766l.setTextAppearance(getContext(), this.f768n);
            }
            if (this.f769o != 0) {
                this.f767m.setTextAppearance(getContext(), this.f769o);
            }
        }
        this.f766l.setText(this.f761g);
        this.f767m.setText(this.f762h);
        boolean z = !TextUtils.isEmpty(this.f761g);
        boolean z2 = !TextUtils.isEmpty(this.f762h);
        this.f767m.setVisibility(z2 ? 0 : 8);
        this.f765k.setVisibility((z || z2) ? 0 : 8);
        if (this.f765k.getParent() == null) {
            addView(this.f765k);
        }
    }

    /* renamed from: a */
    public final void m511a(AbstractC0128b abstractC0128b) {
        if (this.f763i == null) {
            this.f763i = LayoutInflater.from(getContext()).inflate(this.f771q, (ViewGroup) this, false);
            addView(this.f763i);
        } else if (this.f763i.getParent() == null) {
            addView(this.f763i);
        }
        this.f763i.findViewById(R.id.action_mode_close_button).setOnClickListener(new ViewOnClickListenerC0262d(this, abstractC0128b));
        C0168o c0168o = (C0168o) abstractC0128b.mo217b();
        if (this.f1087d != null) {
            this.f1087d.m552j();
        }
        this.f1087d = new ActionMenuPresenter(getContext());
        this.f1087d.m548e();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0168o.m451a(this.f1087d, this.f1085b);
        this.f1086c = (ActionMenuView) this.f1087d.mo410a(this);
        C0538w.m1846a(this.f1086c, (Drawable) null);
        addView(this.f1086c, layoutParams);
    }

    /* renamed from: b */
    public final void m513b() {
        if (this.f763i == null) {
            m514c();
        }
    }

    /* renamed from: c */
    public final void m514c() {
        removeAllViews();
        this.f764j = null;
        this.f1086c = null;
    }

    @Override // androidx.appcompat.widget.AbstractC0181a
    /* renamed from: a */
    public final boolean mo512a() {
        if (this.f1087d != null) {
            return this.f1087d.m550h();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f1088e > 0 ? this.f1088e : View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i3 = size2 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, RecyclerView.UNDEFINED_DURATION);
        if (this.f763i != null) {
            int a2 = m671a(this.f763i, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f763i.getLayoutParams();
            paddingLeft = a2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        if (this.f1086c != null && this.f1086c.getParent() == this) {
            paddingLeft = m671a(this.f1086c, paddingLeft, makeMeasureSpec);
        }
        if (this.f765k != null && this.f764j == null) {
            if (this.f770p) {
                this.f765k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f765k.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f765k.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m671a(this.f765k, paddingLeft, makeMeasureSpec);
            }
        }
        if (this.f764j != null) {
            ViewGroup.LayoutParams layoutParams = this.f764j.getLayoutParams();
            int i4 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            int i5 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            if (layoutParams.height >= 0) {
                i3 = Math.min(layoutParams.height, i3);
            }
            this.f764j.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(i3, i5));
        }
        if (this.f1088e <= 0) {
            int childCount = getChildCount();
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i6) {
                    i6 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i6);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean m987a = C0295ef.m987a(this);
        int paddingRight = m987a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.f763i != null && this.f763i.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f763i.getLayoutParams();
            int i5 = m987a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = m987a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = m670a(paddingRight, i5, m987a);
            paddingRight = m670a(a2 + m672a(this.f763i, a2, paddingTop, paddingTop2, m987a), i6, m987a);
        }
        if (this.f765k != null && this.f764j == null && this.f765k.getVisibility() != 8) {
            paddingRight += m672a(this.f765k, paddingRight, paddingTop, paddingTop2, m987a);
        }
        if (this.f764j != null) {
            m672a(this.f764j, paddingRight, paddingTop, paddingTop2, m987a);
        }
        int paddingLeft = m987a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f1086c != null) {
            m672a(this.f1086c, paddingLeft, paddingTop, paddingTop2, !m987a);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f761g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f770p) {
            requestLayout();
        }
        this.f770p = z;
    }

    /* renamed from: d */
    public final boolean m515d() {
        return this.f770p;
    }
}
