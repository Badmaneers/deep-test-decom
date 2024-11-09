package com.color.support.widget.snackbar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorSnackBar extends RelativeLayout {

    /* renamed from: a */
    private static final PathInterpolator f7778a = new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f);

    /* renamed from: b */
    private static final PathInterpolator f7779b = new PathInterpolator(0.0f, 0.0f, 0.15f, 1.0f);

    /* renamed from: n */
    private static int f7780n;

    /* renamed from: c */
    private final int f7781c;

    /* renamed from: d */
    private final int f7782d;

    /* renamed from: e */
    private final int f7783e;

    /* renamed from: f */
    private final int f7784f;

    /* renamed from: g */
    private final int f7785g;

    /* renamed from: h */
    private final int f7786h;

    /* renamed from: i */
    private final int f7787i;

    /* renamed from: j */
    private final int f7788j;

    /* renamed from: k */
    private final int f7789k;

    /* renamed from: l */
    private final int f7790l;

    /* renamed from: m */
    private final int f7791m;

    /* renamed from: o */
    private ViewGroup f7792o;

    /* renamed from: p */
    private TextView f7793p;

    /* renamed from: q */
    private TextView f7794q;

    /* renamed from: r */
    private ImageView f7795r;

    /* renamed from: s */
    private View f7796s;

    /* renamed from: t */
    private int f7797t;

    /* renamed from: u */
    private int f7798u;

    /* renamed from: v */
    private int f7799v;

    /* renamed from: w */
    private String f7800w;

    /* renamed from: x */
    private Runnable f7801x;

    /* renamed from: y */
    private InterfaceC1630c f7802y;

    public ColorSnackBar(Context context) {
        super(context);
        this.f7781c = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_max_width);
        this.f7782d = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_action_max_width);
        this.f7783e = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_icon_width);
        this.f7784f = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_icon_height);
        this.f7785g = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_single_line_margin_top);
        this.f7786h = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_single_line_margin_bottom);
        this.f7787i = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_multi_line_margin_top);
        this.f7788j = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_multi_line_margin_bottom);
        this.f7789k = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_margin_start);
        this.f7790l = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_content_action_min_margin);
        this.f7791m = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_action_multi_line_interval);
        m5439a(context, null);
    }

    public ColorSnackBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7781c = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_max_width);
        this.f7782d = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_action_max_width);
        this.f7783e = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_icon_width);
        this.f7784f = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_icon_height);
        this.f7785g = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_single_line_margin_top);
        this.f7786h = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_single_line_margin_bottom);
        this.f7787i = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_multi_line_margin_top);
        this.f7788j = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_multi_line_margin_bottom);
        this.f7789k = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_margin_start);
        this.f7790l = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_content_action_min_margin);
        this.f7791m = getResources().getDimensionPixelSize(R.dimen.color_snack_bar_action_multi_line_interval);
        m5439a(context, attributeSet);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f7794q.setEnabled(z);
        this.f7793p.setEnabled(z);
        this.f7795r.setEnabled(z);
        if (getDuration() == 0 || this.f7801x == null) {
            return;
        }
        removeCallbacks(this.f7801x);
        postDelayed(this.f7801x, getDuration());
    }

    /* renamed from: a */
    public final void m5442a() {
        if (this.f7801x != null) {
            removeCallbacks(this.f7801x);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7796s, "translationY", this.f7796s.getHeight() + f7780n);
        ofFloat.setInterpolator(f7778a);
        ofFloat.setDuration(120L);
        ofFloat.addListener(new C1628a(this));
        ofFloat.start();
    }

    public void setContentText(int i) {
        setContentText(getResources().getString(i));
    }

    public void setContentText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f7793p.setVisibility(8);
            if (this.f7801x != null) {
                removeCallbacks(this.f7801x);
                return;
            }
            return;
        }
        this.f7793p.setText(str);
        this.f7800w = str;
    }

    public void setOnStatusChangeListener(InterfaceC1630c interfaceC1630c) {
        this.f7802y = interfaceC1630c;
    }

    private void setActionText(String str) {
        this.f7794q.setText(str);
    }

    public String getContentText() {
        return String.valueOf(this.f7793p.getText());
    }

    public TextView getContentView() {
        return this.f7793p;
    }

    public TextView getActionView() {
        return this.f7794q;
    }

    public String getActionText() {
        return String.valueOf(this.f7794q.getText());
    }

    public int getDuration() {
        return this.f7798u;
    }

    public void setDuration(int i) {
        this.f7798u = i;
    }

    private void setParent(ViewGroup viewGroup) {
        this.f7792o = viewGroup;
    }

    public void setIconDrawable(int i) {
        setIconDrawable(getResources().getDrawable(i, getContext().getTheme()));
    }

    public void setIconDrawable(Drawable drawable) {
        if (drawable == null) {
            this.f7795r.setVisibility(8);
        } else {
            this.f7795r.setVisibility(0);
            this.f7795r.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    private void m5439a(Context context, AttributeSet attributeSet) {
        this.f7796s = inflate(context, R.layout.color_snack_bar_item, this);
        this.f7793p = (TextView) this.f7796s.findViewById(R.id.tv_color_snack_bar_content);
        this.f7794q = (TextView) this.f7796s.findViewById(R.id.tv_color_snack_bar_action);
        this.f7795r = (ImageView) this.f7796s.findViewById(R.id.iv_color_snack_bar_icon);
        f7780n = new ViewGroup.MarginLayoutParams(context, attributeSet).bottomMargin;
        setVisibility(8);
        this.f7801x = new RunnableC1629b(this, (byte) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorSnackBar, 0, 0);
        try {
            if (obtainStyledAttributes.getString(R.styleable.ColorSnackBar_defaultSnackBarContentText) != null) {
                setContentText(obtainStyledAttributes.getString(R.styleable.ColorSnackBar_defaultSnackBarContentText));
                setDuration(obtainStyledAttributes.getInt(R.styleable.ColorSnackBar_snackBarDisappearTime, 0));
            }
            setIconDrawable(obtainStyledAttributes.getDrawable(R.styleable.ColorSnackBar_colorSnackBarIcon));
        } catch (Exception e) {
            Log.e("ColorSnackbar", "Failure setting ColorSnackBar " + e.getMessage());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f7797t = (int) this.f7793p.getPaint().measureText(this.f7800w);
        this.f7799v = (this.f7781c - (this.f7790l * 3)) - this.f7794q.getMeasuredWidth();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f7795r.getDrawable() != null) {
            if (this.f7794q.getMeasuredWidth() >= this.f7782d) {
                if (this.f7793p.getLineCount() > 1) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f7794q.getLayoutParams();
                    layoutParams.bottomMargin = this.f7788j;
                    layoutParams.topMargin = this.f7787i + getResources().getDimensionPixelSize(R.dimen.color_snack_bar_action_multi_line_content_long_interval) + this.f7793p.getMeasuredHeight();
                    this.f7794q.setLayoutParams(layoutParams);
                    ((RelativeLayout.LayoutParams) this.f7795r.getLayoutParams()).topMargin = this.f7787i + ((this.f7793p.getMeasuredHeight() - this.f7784f) / 2);
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f7793p.getLayoutParams();
                    layoutParams2.width = ((this.f7781c - (this.f7790l * 2)) - this.f7790l) - this.f7783e;
                    layoutParams2.topMargin = this.f7787i;
                    layoutParams2.setMarginStart(this.f7790l + this.f7789k + this.f7783e);
                    layoutParams2.setMarginEnd(0);
                    this.f7793p.setLayoutParams(layoutParams2);
                    return;
                }
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f7794q.getLayoutParams();
                layoutParams3.bottomMargin = this.f7788j;
                layoutParams3.topMargin = this.f7787i + this.f7791m + this.f7783e;
                this.f7794q.setLayoutParams(layoutParams3);
                ((RelativeLayout.LayoutParams) this.f7795r.getLayoutParams()).topMargin = this.f7787i;
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f7793p.getLayoutParams();
                layoutParams4.width = ((this.f7781c - (this.f7790l * 2)) - this.f7790l) - this.f7783e;
                layoutParams4.topMargin = this.f7785g;
                layoutParams4.setMarginStart(this.f7790l + this.f7789k + this.f7783e);
                layoutParams4.setMarginEnd(0);
                this.f7793p.setLayoutParams(layoutParams4);
                return;
            }
            this.f7793p.setMaxWidth(this.f7799v);
            if (this.f7797t > this.f7799v) {
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f7794q.getLayoutParams();
                layoutParams5.topMargin = (((this.f7787i + this.f7788j) + this.f7793p.getMeasuredHeight()) - this.f7794q.getMeasuredHeight()) / 2;
                layoutParams5.bottomMargin = layoutParams5.topMargin;
                this.f7794q.setLayoutParams(layoutParams5);
                ((RelativeLayout.LayoutParams) this.f7795r.getLayoutParams()).topMargin = (getMeasuredHeight() - this.f7783e) / 2;
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f7793p.getLayoutParams();
                layoutParams6.width = (((this.f7781c - (this.f7790l * 3)) - this.f7794q.getMeasuredWidth()) - this.f7790l) - this.f7783e;
                layoutParams6.setMarginStart(this.f7790l + this.f7789k + this.f7783e);
                layoutParams6.topMargin = this.f7787i;
                layoutParams6.bottomMargin = this.f7788j;
                layoutParams6.setMarginEnd(this.f7790l);
                this.f7793p.setLayoutParams(layoutParams6);
                return;
            }
            RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) this.f7794q.getLayoutParams();
            layoutParams7.topMargin = this.f7785g;
            layoutParams7.bottomMargin = this.f7786h;
            this.f7794q.setLayoutParams(layoutParams7);
            ((RelativeLayout.LayoutParams) this.f7795r.getLayoutParams()).topMargin = this.f7787i;
            RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) this.f7793p.getLayoutParams();
            layoutParams8.width = (((this.f7781c - (this.f7790l * 3)) - this.f7794q.getMeasuredWidth()) - this.f7790l) - this.f7783e;
            layoutParams8.setMarginStart(this.f7790l + this.f7789k + this.f7783e);
            layoutParams8.topMargin = this.f7785g;
            layoutParams8.bottomMargin = this.f7786h;
            this.f7793p.setLayoutParams(layoutParams8);
            return;
        }
        if (this.f7794q.getMeasuredWidth() >= this.f7782d) {
            if (this.f7793p.getLineCount() > 1) {
                RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) this.f7794q.getLayoutParams();
                layoutParams9.bottomMargin = this.f7788j;
                layoutParams9.topMargin = this.f7787i + getResources().getDimensionPixelSize(R.dimen.color_snack_bar_action_multi_line_content_long_interval) + this.f7793p.getMeasuredHeight();
                this.f7794q.setLayoutParams(layoutParams9);
                RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) this.f7793p.getLayoutParams();
                layoutParams10.width = this.f7781c - (this.f7790l * 2);
                layoutParams10.topMargin = this.f7787i;
                layoutParams10.setMarginStart(this.f7789k);
                layoutParams10.setMarginEnd(0);
                this.f7793p.setLayoutParams(layoutParams10);
                return;
            }
            RelativeLayout.LayoutParams layoutParams11 = (RelativeLayout.LayoutParams) this.f7794q.getLayoutParams();
            layoutParams11.bottomMargin = this.f7788j;
            layoutParams11.topMargin = this.f7787i + this.f7791m + this.f7793p.getMeasuredHeight();
            this.f7794q.setLayoutParams(layoutParams11);
            RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) this.f7793p.getLayoutParams();
            layoutParams12.width = this.f7781c - (this.f7790l * 2);
            layoutParams12.topMargin = this.f7787i;
            layoutParams12.setMarginEnd(0);
            this.f7793p.setLayoutParams(layoutParams12);
            return;
        }
        if (this.f7797t > this.f7799v) {
            RelativeLayout.LayoutParams layoutParams13 = (RelativeLayout.LayoutParams) this.f7794q.getLayoutParams();
            layoutParams13.topMargin = (((this.f7787i + this.f7788j) + this.f7793p.getMeasuredHeight()) - this.f7794q.getMeasuredHeight()) / 2;
            layoutParams13.bottomMargin = layoutParams13.topMargin;
            this.f7794q.setLayoutParams(layoutParams13);
            RelativeLayout.LayoutParams layoutParams14 = (RelativeLayout.LayoutParams) this.f7793p.getLayoutParams();
            layoutParams14.width = (this.f7781c - (this.f7790l * 3)) - this.f7794q.getMeasuredWidth();
            layoutParams14.topMargin = this.f7787i;
            layoutParams14.bottomMargin = this.f7788j;
            layoutParams14.setMarginEnd(this.f7790l);
            this.f7793p.setLayoutParams(layoutParams14);
            return;
        }
        RelativeLayout.LayoutParams layoutParams15 = (RelativeLayout.LayoutParams) this.f7794q.getLayoutParams();
        layoutParams15.topMargin = this.f7785g;
        layoutParams15.bottomMargin = this.f7786h;
        this.f7794q.setLayoutParams(layoutParams15);
        RelativeLayout.LayoutParams layoutParams16 = (RelativeLayout.LayoutParams) this.f7793p.getLayoutParams();
        layoutParams16.topMargin = this.f7785g;
        layoutParams16.bottomMargin = this.f7786h;
        this.f7793p.setLayoutParams(layoutParams16);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
            case 2:
                if (this.f7801x == null) {
                    return true;
                }
                removeCallbacks(this.f7801x);
                return true;
            case 1:
            case 3:
                if (this.f7801x == null || getDuration() == 0) {
                    return true;
                }
                removeCallbacks(this.f7801x);
                postDelayed(this.f7801x, getDuration());
                return true;
            default:
                return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f7801x);
        this.f7792o = null;
    }
}
