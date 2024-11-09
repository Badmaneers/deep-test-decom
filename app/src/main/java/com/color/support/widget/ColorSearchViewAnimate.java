package com.color.support.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.view.InterfaceC0130d;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.SearchView;
import androidx.core.graphics.drawable.C0546a;
import color.support.p043v7.appcompat.R;
import color.support.p043v7.widget.C1263ac;
import color.support.p043v7.widget.Toolbar;
import com.color.support.C1306a;
import com.color.support.util.C1336a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ColorSearchViewAnimate extends LinearLayout implements InterfaceC0130d {

    /* renamed from: a */
    private static boolean f6466a = false;

    /* renamed from: b */
    private ImageView f6467b;

    /* renamed from: c */
    private TextView f6468c;

    /* renamed from: d */
    private ColorSearchView f6469d;

    /* renamed from: e */
    private SearchCancelButton f6470e;

    /* renamed from: f */
    private ImageView f6471f;

    /* renamed from: g */
    private LinearLayout f6472g;

    /* renamed from: h */
    private volatile C1441db f6473h;

    /* renamed from: i */
    private AtomicInteger f6474i;

    /* renamed from: j */
    private List<InterfaceC1457dr> f6475j;

    /* renamed from: k */
    private InterfaceC1455dp f6476k;

    /* renamed from: l */
    private List<InterfaceC1456dq> f6477l;

    /* renamed from: m */
    private long f6478m;

    /* renamed from: n */
    private MenuItem f6479n;

    /* renamed from: o */
    private Toolbar f6480o;

    /* renamed from: p */
    private int f6481p;

    /* renamed from: q */
    private boolean f6482q;

    /* renamed from: r */
    private boolean f6483r;

    /* renamed from: s */
    private int f6484s;

    /* renamed from: t */
    private boolean f6485t;

    /* renamed from: u */
    private Runnable f6486u;

    /* renamed from: v */
    private InterfaceC1457dr f6487v;

    /* renamed from: w */
    private int f6488w;

    /* renamed from: x */
    private View.OnClickListener f6489x;

    @Override // androidx.appcompat.view.InterfaceC0130d
    /* renamed from: a */
    public final void mo312a() {
    }

    @Override // androidx.appcompat.view.InterfaceC0130d
    /* renamed from: b */
    public final void mo313b() {
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m4685e(ColorSearchViewAnimate colorSearchViewAnimate) {
        colorSearchViewAnimate.f6483r = false;
        return false;
    }

    public ColorSearchViewAnimate(Context context) {
        this(context, null);
    }

    public ColorSearchViewAnimate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorSearchViewAnimate(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        Drawable drawable;
        this.f6474i = new AtomicInteger(0);
        this.f6478m = 150L;
        this.f6481p = 48;
        this.f6484s = 0;
        this.f6485t = true;
        this.f6486u = new RunnableC1432ct(this);
        this.f6487v = new C1433cu(this);
        this.f6488w = 16;
        this.f6489x = new ViewOnClickListenerC1440da(this);
        inflate(context, R.layout.color_search_view_animate_layout, this);
        this.f6467b = (ImageView) findViewById(R.id.animated_search_icon);
        this.f6468c = (TextView) findViewById(R.id.animated_hint);
        this.f6469d = (ColorSearchView) findViewById(R.id.animated_search_view);
        this.f6470e = (SearchCancelButton) findViewById(R.id.animated_cancel_button);
        this.f6471f = (ImageView) findViewById(R.id.cancel_divider);
        this.f6472g = (LinearLayout) findViewById(R.id.animated_hint_layout);
        this.f6472g.setClickable(true);
        this.f6472g.setOnClickListener(this.f6489x);
        Drawable background = this.f6470e.getBackground();
        if (background instanceof RippleDrawable) {
            C1306a.m4283a((RippleDrawable) background, getResources().getDimensionPixelSize(R.dimen.color_searchview_cancel_button_bg_radius));
        }
        this.f6470e.setOnClickListener(this.f6489x);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorSearchViewAnimate, i, 0);
        float f = context.getResources().getConfiguration().fontScale;
        this.f6469d.getSearchAutoComplete().setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSearchViewAnimate_inputTextSize, getResources().getDimensionPixelSize(R.dimen.color_search_view_input_text_size)));
        SearchView.SearchAutoComplete searchAutoComplete = this.f6469d.getSearchAutoComplete();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.color_search_view_cancel_margin);
        if (Build.VERSION.SDK_INT >= 16) {
            searchAutoComplete.setPaddingRelative(0, 0, dimensionPixelSize, 0);
        } else if (!m4691h()) {
            searchAutoComplete.setPadding(0, 0, dimensionPixelSize, 0);
        } else {
            searchAutoComplete.setPadding(dimensionPixelSize, 0, 0, 0);
        }
        searchAutoComplete.setTextColor(obtainStyledAttributes.getColor(R.styleable.ColorSearchViewAnimate_inputTextColor, getResources().getColor(R.color.color_search_view_input_text_color)));
        searchAutoComplete.setHintTextColor(obtainStyledAttributes.getColor(R.styleable.ColorSearchViewAnimate_inputHintTextColor, getResources().getColor(R.color.color_search_view_hint_color)));
        if (obtainStyledAttributes.hasValue(R.styleable.ColorSearchViewAnimate_colorSearchIcon)) {
            this.f6467b.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.ColorSearchViewAnimate_colorSearchIcon));
        } else if (Build.VERSION.SDK_INT > 19) {
            this.f6467b.setImageDrawable(getResources().getDrawable(R.drawable.color_search_view_icon));
        } else {
            Drawable drawable2 = getResources().getDrawable(R.drawable.color_search_view_icon);
            ImageView imageView = this.f6467b;
            ColorStateList colorStateList2 = getResources().getColorStateList(R.color.color_search_icon_color);
            Drawable m1933f = C0546a.m1933f(drawable2);
            C0546a.m1922a(m1933f.mutate(), colorStateList2);
            imageView.setImageDrawable(m1933f);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.ColorSearchViewAnimate_normalHintColor)) {
            colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.ColorSearchViewAnimate_normalHintColor);
        } else {
            colorStateList = getResources().getColorStateList(R.color.color_search_view_hint_color_selector);
        }
        this.f6468c.setHintTextColor(colorStateList);
        this.f6468c.setTextColor(colorStateList);
        this.f6468c.setTextSize(0, C1336a.m4370a(this.f6468c.getTextSize(), f, 2));
        if (obtainStyledAttributes.hasValue(R.styleable.ColorSearchViewAnimate_normalBackground)) {
            this.f6472g.setBackgroundDrawable(obtainStyledAttributes.getDrawable(R.styleable.ColorSearchViewAnimate_normalBackground));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.ColorSearchViewAnimate_searchHint)) {
            setQueryHint(obtainStyledAttributes.getString(R.styleable.ColorSearchViewAnimate_searchHint));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.ColorSearchViewAnimate_cancelTextColor)) {
            this.f6470e.setTextColor(obtainStyledAttributes.getColor(R.styleable.ColorSearchViewAnimate_cancelTextColor, 0));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.ColorSearchViewAnimate_cancelText)) {
            this.f6470e.setText(obtainStyledAttributes.getString(R.styleable.ColorSearchViewAnimate_cancelText));
        } else {
            this.f6470e.setText(R.string.color_search_view_cancel);
        }
        this.f6470e.setTextSize(0, C1336a.m4370a(this.f6470e.getTextSize(), f, 2));
        if (obtainStyledAttributes.hasValue(R.styleable.ColorSearchViewAnimate_cancelDivider) && (drawable = obtainStyledAttributes.getDrawable(R.styleable.ColorSearchViewAnimate_cancelDivider)) != null) {
            this.f6471f.setImageDrawable(drawable);
        }
        this.f6469d.setBackgroundColor(obtainStyledAttributes.getColor(R.styleable.ColorSearchViewAnimate_searchBackground, getResources().getColor(R.color.color_search_view_search_background)));
        ImageView imageView2 = (ImageView) this.f6469d.findViewById(R.id.search_close_btn);
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.oppo_search_clear_selector);
        }
        int i2 = obtainStyledAttributes.getInt(R.styleable.ColorSearchViewAnimate_android_gravity, 16);
        if (f6466a) {
            Log.i("ColorSearchViewAnimate", "gravity ".concat(String.valueOf(i2)));
        }
        setGravity(i2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i) {
        if (this.f6488w != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 16;
            }
            this.f6488w = i;
            m4678a(this.f6472g, this.f6488w);
        }
    }

    /* renamed from: a */
    private static void m4678a(View view, int i) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        Arrays.fill(layoutParams2.getRules(), 0);
        layoutParams2.alignWithParent = true;
        int i2 = i & 112;
        int i3 = 15;
        if (i2 != 16) {
            if (i2 == 48) {
                i3 = 10;
            } else if (i2 == 80) {
                i3 = 12;
            }
        }
        layoutParams2.addRule(i3);
        view.requestLayout();
    }

    @Override // android.widget.LinearLayout
    public int getGravity() {
        return this.f6488w;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setOnAnimationListener(InterfaceC1455dp interfaceC1455dp) {
        this.f6476k = interfaceC1455dp;
    }

    public void setIconCanAnimate(boolean z) {
        this.f6485t = z;
    }

    public long getAnimatorDuration() {
        return this.f6478m;
    }

    public ColorSearchView getSearchView() {
        return this.f6469d;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f6467b != null) {
            this.f6467b.setEnabled(z);
        }
        if (this.f6468c != null) {
            this.f6468c.setEnabled(z);
        }
        if (this.f6472g != null) {
            this.f6472g.setEnabled(z);
        }
        if (this.f6469d != null) {
            this.f6469d.setEnabled(z);
        }
        if (this.f6470e != null) {
            this.f6470e.setEnabled(z);
        }
    }

    public int getSearchState() {
        return this.f6474i.get();
    }

    public void setToolBarChildVisibility(int i) {
        if (this.f6480o != null) {
            int childCount = this.f6480o.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f6480o.getChildAt(i2);
                if (childAt != this) {
                    childAt.setVisibility(i);
                }
            }
        }
    }

    public void setToolBarAlpha(float f) {
        if (this.f6480o != null) {
            int childCount = this.f6480o.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f6480o.getChildAt(i);
                if (childAt != this) {
                    childAt.setAlpha(f);
                }
            }
        }
    }

    private void setMenuItem(MenuItem menuItem) {
        this.f6479n = menuItem;
        if (this.f6479n == null || this.f6479n.getActionView() != this) {
            return;
        }
        this.f6479n.setActionView((View) null);
    }

    /* renamed from: a */
    public final void m4703a(boolean z) {
        if (this.f6469d == null || this.f6469d.getSearchAutoComplete() == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (f6466a) {
            Log.d("ColorSearchViewAnimate", "openSoftInput: ".concat(String.valueOf(z)));
        }
        if (z) {
            m4692i();
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f6469d.getSearchAutoComplete(), 0);
                return;
            }
            return;
        }
        if (inputMethodManager == null || !inputMethodManager.isActive()) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.f6469d.getSearchAutoComplete().getWindowToken(), 0);
    }

    /* renamed from: c */
    public final void m4704c() {
        if (this.f6483r) {
            return;
        }
        this.f6483r = true;
        m4686f();
        if (this.f6484s == 1) {
            setVisibility(0);
            setAlpha(0.0f);
            this.f6470e.setVisibility(0);
            this.f6471f.setVisibility(0);
            animate().alpha(1.0f).setDuration(this.f6478m).setListener(null).start();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(this.f6478m);
        ofFloat.addUpdateListener(new C1434cv(this));
        ofFloat.addListener(new C1435cw(this));
        ofFloat.start();
        m4703a(true);
    }

    public boolean getCancelIconAnimating() {
        return this.f6483r;
    }

    /* renamed from: d */
    public final void m4705d() {
        if (this.f6483r) {
            return;
        }
        this.f6483r = true;
        this.f6470e.setVisibility(4);
        this.f6471f.setVisibility(4);
        m4686f();
        if (this.f6484s == 1) {
            animate().alpha(0.0f).setDuration(this.f6478m).setListener(new C1436cx(this)).start();
        }
        setToolBarChildVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.f6478m);
        ofFloat.addUpdateListener(new C1437cy(this));
        ofFloat.addListener(new C1438cz(this));
        ofFloat.start();
        m4703a(false);
    }

    /* renamed from: f */
    private void m4686f() {
        if (this.f6482q) {
            return;
        }
        this.f6482q = true;
        if (this.f6480o != null) {
            m4688g();
            C1263ac c1263ac = new C1263ac(-1, this.f6480o.getHeight() - this.f6480o.getPaddingTop());
            c1263ac.f285a = this.f6481p;
            this.f6480o.m4142a(this, c1263ac);
        }
    }

    /* renamed from: g */
    private void m4688g() {
        int childCount = this.f6480o.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getClass().isInstance(this.f6480o.getChildAt(i))) {
                this.f6480o.removeViewAt(i);
                return;
            }
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        if (this.f6468c != null) {
            this.f6468c.setText(charSequence);
        }
        if (this.f6469d != null) {
            this.f6469d.setQueryHint(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m4678a(this.f6472g, this.f6488w);
    }

    /* renamed from: h */
    public boolean m4691h() {
        return Build.VERSION.SDK_INT >= 17 && getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1441db getAnimatorHelper() {
        if (this.f6473h == null) {
            synchronized (this) {
                if (this.f6473h == null) {
                    this.f6473h = new C1441db(this);
                }
            }
        }
        return this.f6473h;
    }

    /* renamed from: i */
    public void m4692i() {
        SearchView.SearchAutoComplete searchAutoComplete;
        if (this.f6469d == null || (searchAutoComplete = this.f6469d.getSearchAutoComplete()) == null) {
            return;
        }
        searchAutoComplete.setFocusable(true);
        searchAutoComplete.setFocusableInTouchMode(true);
        searchAutoComplete.requestFocus();
    }

    /* loaded from: classes.dex */
    public class SearchCancelButton extends AppCompatButton {

        /* renamed from: a */
        volatile boolean f6490a;

        /* renamed from: b */
        InterfaceC1458ds f6491b;

        public void setPerformClickCallback(InterfaceC1458ds interfaceC1458ds) {
            this.f6491b = interfaceC1458ds;
        }

        public SearchCancelButton(Context context) {
            super(context);
            this.f6490a = false;
        }

        public SearchCancelButton(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6490a = false;
        }

        public SearchCancelButton(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f6490a = false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (this.f6491b != null) {
                this.f6490a = true;
            }
            return super.performClick();
        }

        public void setPerformClicked(boolean z) {
            this.f6490a = z;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m4689g(ColorSearchViewAnimate colorSearchViewAnimate) {
        if (colorSearchViewAnimate.f6469d != null) {
            colorSearchViewAnimate.f6469d.clearFocus();
            colorSearchViewAnimate.f6469d.setFocusable(false);
            colorSearchViewAnimate.f6469d.onWindowFocusChanged(false);
            SearchView.SearchAutoComplete searchAutoComplete = colorSearchViewAnimate.f6469d.getSearchAutoComplete();
            if (searchAutoComplete != null) {
                searchAutoComplete.setFocusable(false);
            }
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m4695k(ColorSearchViewAnimate colorSearchViewAnimate) {
        boolean z;
        if (colorSearchViewAnimate.f6477l != null) {
            z = false;
            for (InterfaceC1456dq interfaceC1456dq : colorSearchViewAnimate.f6477l) {
                if (interfaceC1456dq != null) {
                    z |= interfaceC1456dq.m4999a();
                }
            }
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        colorSearchViewAnimate.getAnimatorHelper().m4998a(0);
    }

    /* renamed from: a */
    public static /* synthetic */ void m4680a(ColorSearchViewAnimate colorSearchViewAnimate, int i) {
        if (colorSearchViewAnimate.f6475j != null) {
            for (InterfaceC1457dr interfaceC1457dr : colorSearchViewAnimate.f6475j) {
                if (interfaceC1457dr != null) {
                    interfaceC1457dr.mo4992a(i);
                }
            }
        }
    }
}
