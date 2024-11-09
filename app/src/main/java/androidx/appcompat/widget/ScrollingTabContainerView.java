package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.R;
import androidx.appcompat.app.AbstractC0088c;
import androidx.appcompat.view.C0127a;

/* loaded from: classes.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: k */
    private static final Interpolator f928k = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f929a;

    /* renamed from: b */
    LinearLayoutCompat f930b;

    /* renamed from: c */
    int f931c;

    /* renamed from: d */
    int f932d;

    /* renamed from: e */
    protected ViewPropertyAnimator f933e;

    /* renamed from: f */
    protected final C0250co f934f;

    /* renamed from: g */
    private Spinner f935g;

    /* renamed from: h */
    private boolean f936h;

    /* renamed from: i */
    private int f937i;

    /* renamed from: j */
    private int f938j;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        this.f934f = new C0250co(this);
        setHorizontalScrollBarEnabled(false);
        C0127a m301a = C0127a.m301a(context);
        setContentHeight(m301a.m306e());
        this.f932d = m301a.m308g();
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new C0227bs(-2, -1));
        this.f930b = linearLayoutCompat;
        addView(this.f930b, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f930b.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f931c = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f931c = View.MeasureSpec.getSize(i) / 2;
            }
            this.f931c = Math.min(this.f931c, this.f932d);
        } else {
            this.f931c = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f937i, 1073741824);
        if (!z && this.f936h) {
            this.f930b.measure(0, makeMeasureSpec);
            if (this.f930b.getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                m598b();
            } else if (!m597a()) {
                if (this.f935g == null) {
                    AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                    appCompatSpinner.setLayoutParams(new C0227bs(-2, -1));
                    appCompatSpinner.setOnItemSelectedListener(this);
                    this.f935g = appCompatSpinner;
                }
                removeView(this.f930b);
                addView(this.f935g, new ViewGroup.LayoutParams(-2, -1));
                if (this.f935g.getAdapter() == null) {
                    this.f935g.setAdapter((SpinnerAdapter) new C0248cm(this));
                }
                if (this.f929a != null) {
                    removeCallbacks(this.f929a);
                    this.f929a = null;
                }
                this.f935g.setSelection(this.f938j);
            }
        } else {
            m598b();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f938j);
    }

    /* renamed from: a */
    private boolean m597a() {
        return this.f935g != null && this.f935g.getParent() == this;
    }

    public void setAllowCollapse(boolean z) {
        this.f936h = z;
    }

    /* renamed from: b */
    private boolean m598b() {
        if (!m597a()) {
            return false;
        }
        removeView(this.f935g);
        addView(this.f930b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f935g.getSelectedItemPosition());
        return false;
    }

    public void setTabSelected(int i) {
        this.f938j = i;
        int childCount = this.f930b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f930b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                View childAt2 = this.f930b.getChildAt(i);
                if (this.f929a != null) {
                    removeCallbacks(this.f929a);
                }
                this.f929a = new RunnableC0247cl(this, childAt2);
                post(this.f929a);
            }
            i2++;
        }
        if (this.f935g == null || i < 0) {
            return;
        }
        this.f935g.setSelection(i);
    }

    public void setContentHeight(int i) {
        this.f937i = i;
        requestLayout();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0127a m301a = C0127a.m301a(getContext());
        setContentHeight(m301a.m306e());
        this.f932d = m301a.m308g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f929a != null) {
            post(this.f929a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f929a != null) {
            removeCallbacks(this.f929a);
        }
    }

    /* renamed from: a */
    public final C0249cn m599a(AbstractC0088c abstractC0088c) {
        C0249cn c0249cn = new C0249cn(this, getContext(), abstractC0088c);
        c0249cn.setBackgroundDrawable(null);
        c0249cn.setLayoutParams(new AbsListView.LayoutParams(-1, this.f937i));
        return c0249cn;
    }
}
