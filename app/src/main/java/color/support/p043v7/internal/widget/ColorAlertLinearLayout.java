package color.support.p043v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import color.support.p043v7.appcompat.R;

/* loaded from: classes.dex */
public class ColorAlertLinearLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f5123a;

    /* renamed from: b */
    private int f5124b;

    /* renamed from: c */
    private int f5125c;

    /* renamed from: d */
    private int f5126d;

    /* renamed from: e */
    private int f5127e;

    /* renamed from: f */
    private int f5128f;

    /* renamed from: g */
    private Drawable f5129g;

    /* renamed from: h */
    private Drawable f5130h;

    /* renamed from: i */
    private int f5131i;

    /* renamed from: j */
    private int f5132j;

    /* renamed from: k */
    private int f5133k;

    /* renamed from: l */
    private int f5134l;

    /* renamed from: m */
    private boolean f5135m;

    public ColorAlertLinearLayout(Context context) {
        this(context, null);
    }

    public ColorAlertLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorAlertLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5124b = 0;
        this.f5125c = 0;
        this.f5126d = 0;
        this.f5127e = 0;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.color_alert_dialog_bg_radius);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorAlertLinearLayout, i, 0);
        this.f5128f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorAlertLinearLayout_alertCornerRadius, dimensionPixelSize);
        this.f5129g = context.getResources().getDrawable(R.drawable.color_bottom_alert_dialog_bg_with_shadow);
        if (obtainStyledAttributes.hasValue(R.styleable.ColorAlertLinearLayout_alertShadowDrawable)) {
            this.f5129g = obtainStyledAttributes.getDrawable(R.styleable.ColorAlertLinearLayout_alertShadowDrawable);
        }
        this.f5130h = context.getDrawable(R.drawable.color_bottom_alert_dialog_bg_landscape);
        if (obtainStyledAttributes.hasValue(R.styleable.ColorAlertLinearLayout_alertBackgroundDrawable)) {
            this.f5130h = obtainStyledAttributes.getDrawable(R.styleable.ColorAlertLinearLayout_alertBackgroundDrawable);
        }
        obtainStyledAttributes.recycle();
    }

    public void setHasShadow(boolean z) {
        this.f5123a = z;
        if (z) {
            setBackground(this.f5129g);
            this.f5124b = getPaddingLeft();
            this.f5126d = getPaddingRight();
            this.f5125c = getPaddingTop();
            this.f5127e = getPaddingBottom();
        } else {
            setBackground(null);
            setPadding(0, 0, 0, 0);
            this.f5124b = 0;
            this.f5125c = 0;
            this.f5126d = 0;
            this.f5127e = 0;
        }
        requestLayout();
    }

    public void setType(int i) {
        setHasShadow(i == 0);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5131i = this.f5124b;
        this.f5132j = this.f5125c;
        this.f5133k = i - this.f5126d;
        this.f5134l = i2 - this.f5127e;
        if (!this.f5135m) {
            setClipToOutline(false);
            return;
        }
        C1241h c1241h = new C1241h(this);
        setClipToOutline(true);
        setOutlineProvider(c1241h);
    }

    public void setNeedClip(boolean z) {
        this.f5135m = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        canvas.save();
        this.f5130h = this.f5123a ? this.f5130h : getContext().getDrawable(R.drawable.color_bottom_alert_dialog_bg_portrait);
        if (this.f5130h != null) {
            this.f5130h.setBounds(this.f5131i, this.f5132j, this.f5133k, this.f5134l);
            this.f5130h.draw(canvas);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
