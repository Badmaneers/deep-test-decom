package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f751a;

    /* renamed from: b */
    Drawable f752b;

    /* renamed from: c */
    Drawable f753c;

    /* renamed from: d */
    boolean f754d;

    /* renamed from: e */
    boolean f755e;

    /* renamed from: f */
    private boolean f756f;

    /* renamed from: g */
    private View f757g;

    /* renamed from: h */
    private View f758h;

    /* renamed from: i */
    private View f759i;

    /* renamed from: j */
    private int f760j;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0538w.m1846a(this, new C0235c(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBar);
        this.f751a = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_background);
        this.f752b = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundStacked);
        this.f760j = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
        if (getId() == R.id.split_action_bar) {
            this.f754d = true;
            this.f753c = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f754d ? !(this.f751a != null || this.f752b != null) : this.f753c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f758h = findViewById(R.id.action_bar);
        this.f759i = findViewById(R.id.action_context_bar);
    }

    public void setPrimaryBackground(Drawable drawable) {
        if (this.f751a != null) {
            this.f751a.setCallback(null);
            unscheduleDrawable(this.f751a);
        }
        this.f751a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f758h != null) {
                this.f751a.setBounds(this.f758h.getLeft(), this.f758h.getTop(), this.f758h.getRight(), this.f758h.getBottom());
            }
        }
        boolean z = false;
        if (!this.f754d ? !(this.f751a != null || this.f752b != null) : this.f753c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        if (this.f752b != null) {
            this.f752b.setCallback(null);
            unscheduleDrawable(this.f752b);
        }
        this.f752b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f755e && this.f752b != null) {
                this.f752b.setBounds(this.f757g.getLeft(), this.f757g.getTop(), this.f757g.getRight(), this.f757g.getBottom());
            }
        }
        boolean z = false;
        if (!this.f754d ? !(this.f751a != null || this.f752b != null) : this.f753c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        if (this.f753c != null) {
            this.f753c.setCallback(null);
            unscheduleDrawable(this.f753c);
        }
        this.f753c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f754d && this.f753c != null) {
                this.f753c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f754d ? !(this.f751a != null || this.f752b != null) : this.f753c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f751a != null) {
            this.f751a.setVisible(z, false);
        }
        if (this.f752b != null) {
            this.f752b.setVisible(z, false);
        }
        if (this.f753c != null) {
            this.f753c.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f751a && !this.f754d) {
            return true;
        }
        if (drawable == this.f752b && this.f755e) {
            return true;
        }
        return (drawable == this.f753c && this.f754d) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f751a != null && this.f751a.isStateful()) {
            this.f751a.setState(getDrawableState());
        }
        if (this.f752b != null && this.f752b.isStateful()) {
            this.f752b.setState(getDrawableState());
        }
        if (this.f753c == null || !this.f753c.isStateful()) {
            return;
        }
        this.f753c.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f751a != null) {
            this.f751a.jumpToCurrentState();
        }
        if (this.f752b != null) {
            this.f752b.jumpToCurrentState();
        }
        if (this.f753c != null) {
            this.f753c.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.f756f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f756f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        if (this.f757g != null) {
            removeView(this.f757g);
        }
        this.f757g = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f757g;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m507a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: b */
    private static int m508b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int m508b;
        if (this.f758h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f760j >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.f760j, View.MeasureSpec.getSize(i2)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i2);
        if (this.f758h == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (this.f757g == null || this.f757g.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!m507a(this.f758h)) {
            m508b = m508b(this.f758h);
        } else {
            m508b = !m507a(this.f759i) ? m508b(this.f759i) : 0;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(m508b + m508b(this.f757g), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f757g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f754d) {
            if (this.f753c != null) {
                this.f753c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z2 = z3;
        } else {
            if (this.f751a != null) {
                if (this.f758h.getVisibility() == 0) {
                    this.f751a.setBounds(this.f758h.getLeft(), this.f758h.getTop(), this.f758h.getRight(), this.f758h.getBottom());
                } else if (this.f759i != null && this.f759i.getVisibility() == 0) {
                    this.f751a.setBounds(this.f759i.getLeft(), this.f759i.getTop(), this.f759i.getRight(), this.f759i.getBottom());
                } else {
                    this.f751a.setBounds(0, 0, 0, 0);
                }
                z3 = true;
            }
            this.f755e = z4;
            if (z4 && this.f752b != null) {
                this.f752b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }
}
