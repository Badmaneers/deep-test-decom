package color.support.p043v7.widget.pageindicator;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1338c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ColorPageIndicator extends FrameLayout {

    /* renamed from: A */
    private RectF f5462A;

    /* renamed from: B */
    private ValueAnimator f5463B;

    /* renamed from: C */
    private Handler f5464C;

    /* renamed from: D */
    private int f5465D;

    /* renamed from: E */
    private InterfaceC1295f f5466E;

    /* renamed from: a */
    private int f5467a;

    /* renamed from: b */
    private int f5468b;

    /* renamed from: c */
    private int f5469c;

    /* renamed from: d */
    private int f5470d;

    /* renamed from: e */
    private int f5471e;

    /* renamed from: f */
    private int f5472f;

    /* renamed from: g */
    private boolean f5473g;

    /* renamed from: h */
    private boolean f5474h;

    /* renamed from: i */
    private int f5475i;

    /* renamed from: j */
    private int f5476j;

    /* renamed from: k */
    private int f5477k;

    /* renamed from: l */
    private int f5478l;

    /* renamed from: m */
    private float f5479m;

    /* renamed from: n */
    private float f5480n;

    /* renamed from: o */
    private float f5481o;

    /* renamed from: p */
    private float f5482p;

    /* renamed from: q */
    private boolean f5483q;

    /* renamed from: r */
    private boolean f5484r;

    /* renamed from: s */
    private boolean f5485s;

    /* renamed from: t */
    private boolean f5486t;

    /* renamed from: u */
    private boolean f5487u;

    /* renamed from: v */
    private boolean f5488v;

    /* renamed from: w */
    private boolean f5489w;

    /* renamed from: x */
    private LinearLayout f5490x;

    /* renamed from: y */
    private List<View> f5491y;

    /* renamed from: z */
    private Paint f5492z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ boolean m4250j(ColorPageIndicator colorPageIndicator) {
        colorPageIndicator.f5485s = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ boolean m4251k(ColorPageIndicator colorPageIndicator) {
        colorPageIndicator.f5486t = false;
        return false;
    }

    public ColorPageIndicator(Context context) {
        this(context, null);
    }

    public ColorPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorPageIndicatorStyle);
    }

    @TargetApi(21)
    public ColorPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5478l = 0;
        this.f5479m = 0.0f;
        this.f5480n = 0.0f;
        this.f5481o = 0.0f;
        this.f5482p = 0.0f;
        this.f5483q = false;
        this.f5484r = false;
        this.f5485s = false;
        this.f5486t = false;
        this.f5487u = false;
        this.f5488v = false;
        this.f5489w = false;
        this.f5462A = new RectF();
        C1338c.m4375a(this, false);
        this.f5491y = new ArrayList();
        this.f5474h = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPageIndicator, i, 0);
            this.f5472f = obtainStyledAttributes.getColor(R.styleable.ColorPageIndicator_traceDotColor, 0);
            this.f5469c = obtainStyledAttributes.getColor(R.styleable.ColorPageIndicator_dotColor, 0);
            this.f5467a = (int) obtainStyledAttributes.getDimension(R.styleable.ColorPageIndicator_dotSize, 0.0f);
            this.f5468b = (int) obtainStyledAttributes.getDimension(R.styleable.ColorPageIndicator_dotSpacing, 0.0f);
            this.f5471e = (int) obtainStyledAttributes.getDimension(R.styleable.ColorPageIndicator_dotCornerRadius, this.f5467a / 2);
            this.f5473g = obtainStyledAttributes.getBoolean(R.styleable.ColorPageIndicator_dotClickable, true);
            this.f5470d = (int) obtainStyledAttributes.getDimension(R.styleable.ColorPageIndicator_dotStrokeWidth, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.f5462A.top = 0.0f;
        this.f5462A.bottom = this.f5467a;
        this.f5463B = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5463B.setDuration(240L);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5463B.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f));
        }
        this.f5463B.addUpdateListener(new C1290a(this));
        this.f5463B.addListener(new C1291b(this));
        this.f5492z = new Paint(1);
        this.f5492z.setStyle(Paint.Style.FILL);
        this.f5492z.setColor(this.f5472f);
        this.f5478l = this.f5467a + (this.f5468b * 2);
        this.f5464C = new HandlerC1292c(this);
        this.f5490x = new LinearLayout(context);
        this.f5490x.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f5490x.setOrientation(0);
        addView(this.f5490x);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1293d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4241b() {
        int i = this.f5476j;
        if (isLayoutRtl()) {
            this.f5482p = this.f5465D - (this.f5468b + (i * this.f5478l));
            this.f5481o = this.f5482p - this.f5467a;
        } else {
            this.f5482p = this.f5468b + this.f5467a + (i * this.f5478l);
            this.f5481o = this.f5482p - this.f5467a;
        }
        this.f5462A.left = this.f5481o;
        this.f5462A.right = this.f5482p;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawRoundRect(this.f5462A, this.f5471e, this.f5471e, this.f5492z);
    }

    /* renamed from: a */
    private void m4236a(boolean z, View view, int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
        if (z) {
            gradientDrawable.setStroke(this.f5470d, i);
        } else {
            gradientDrawable.setColor(i);
        }
        gradientDrawable.setCornerRadius(this.f5471e);
    }

    /* renamed from: a */
    public final void m4256a() {
        if (!this.f5486t) {
            this.f5486t = true;
        }
        if (this.f5463B == null || !this.f5463B.isRunning()) {
            return;
        }
        this.f5463B.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(this.f5465D, this.f5467a);
    }

    public void setDotsCount(int i) {
        int i2 = this.f5475i;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5490x.removeViewAt(this.f5490x.getChildCount() - 1);
            this.f5491y.remove(this.f5491y.size() - 1);
        }
        this.f5475i = i;
        if (this.f5475i > 0) {
            this.f5465D = this.f5478l * this.f5475i;
            requestLayout();
        }
        for (int i4 = 0; i4 < i; i4++) {
            boolean z = this.f5474h;
            int i5 = this.f5469c;
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.color_page_indicator_dot_layout, (ViewGroup) this, false);
            View findViewById = inflate.findViewById(R.id.color_page_indicator_dot);
            if (Build.VERSION.SDK_INT > 16) {
                findViewById.setBackground(getContext().getResources().getDrawable(z ? R.drawable.color_page_indicator_dot_stroke : R.drawable.color_page_indicator_dot));
            } else {
                findViewById.setBackgroundDrawable(getContext().getResources().getDrawable(z ? R.drawable.color_page_indicator_dot_stroke : R.drawable.color_page_indicator_dot));
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
            int i6 = this.f5467a;
            layoutParams.height = i6;
            layoutParams.width = i6;
            findViewById.setLayoutParams(layoutParams);
            layoutParams.setMargins(this.f5468b, 0, this.f5468b, 0);
            m4236a(z, findViewById, i5);
            if (this.f5473g) {
                inflate.setOnClickListener(new ViewOnClickListenerC1294e(this, i4));
            }
            this.f5491y.add(inflate.findViewById(R.id.color_page_indicator_dot));
            this.f5490x.addView(inflate);
        }
    }

    public void setCurrentPosition(int i) {
        this.f5476j = i;
        this.f5477k = i;
        m4241b();
    }

    public void setTraceDotColor(int i) {
        this.f5472f = i;
        this.f5492z.setColor(i);
    }

    public void setPageIndicatorDotsColor(int i) {
        this.f5469c = i;
        if (this.f5491y == null || this.f5491y.isEmpty()) {
            return;
        }
        Iterator<View> it = this.f5491y.iterator();
        while (it.hasNext()) {
            m4236a(this.f5474h, it.next(), i);
        }
    }

    public void setOnDotClickListener(InterfaceC1295f interfaceC1295f) {
        this.f5466E = interfaceC1295f;
    }

    public boolean isLayoutRtl() {
        return Build.VERSION.SDK_INT > 16 && getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static /* synthetic */ void m4252l(ColorPageIndicator colorPageIndicator) {
        if (colorPageIndicator.f5463B != null) {
            colorPageIndicator.m4256a();
            colorPageIndicator.f5463B.start();
        }
    }
}
