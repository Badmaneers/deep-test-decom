package color.support.p043v7.internal.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.graphics.C0542a;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1338c;
import com.color.support.util.C1344i;

/* loaded from: classes.dex */
public class ColorGradientLinearLayout extends LinearLayout {

    /* renamed from: a */
    public static final C1253t f5145a = new C1253t(true, true);

    /* renamed from: b */
    public static final C1253t f5146b = new C1253t(false, false);

    /* renamed from: c */
    private static final String f5147c = ColorGradientLinearLayout.class.getSimpleName();

    /* renamed from: A */
    private int f5148A;

    /* renamed from: d */
    private C1253t f5149d;

    /* renamed from: e */
    private boolean f5150e;

    /* renamed from: f */
    private boolean f5151f;

    /* renamed from: g */
    private int f5152g;

    /* renamed from: h */
    private int f5153h;

    /* renamed from: i */
    private int f5154i;

    /* renamed from: j */
    private int f5155j;

    /* renamed from: k */
    private int f5156k;

    /* renamed from: l */
    private int f5157l;

    /* renamed from: m */
    private Paint f5158m;

    /* renamed from: n */
    private Paint f5159n;

    /* renamed from: o */
    private int f5160o;

    /* renamed from: p */
    private RectF f5161p;

    /* renamed from: q */
    private LinearGradient f5162q;

    /* renamed from: r */
    private int[] f5163r;

    /* renamed from: s */
    private float[] f5164s;

    /* renamed from: t */
    private Drawable f5165t;

    /* renamed from: u */
    private int f5166u;

    /* renamed from: v */
    private int f5167v;

    /* renamed from: w */
    private int f5168w;

    /* renamed from: x */
    private int f5169x;

    /* renamed from: y */
    private int f5170y;

    /* renamed from: z */
    private boolean f5171z;

    public ColorGradientLinearLayout(Context context) {
        this(context, null);
    }

    public ColorGradientLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorGradientLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f5149d = f5145a;
        this.f5152g = 0;
        this.f5153h = 0;
        this.f5154i = 0;
        this.f5155j = 0;
        this.f5156k = 0;
        this.f5157l = 0;
        this.f5163r = new int[3];
        this.f5164s = new float[]{0.0f, 0.8f, 1.0f};
        this.f5156k = context.getResources().getDimensionPixelSize(R.dimen.color_alert_dialog_bg_padding_left);
        this.f5166u = getContext().getResources().getColor(R.color.oppo_transparence);
        this.f5163r[0] = this.f5166u;
        this.f5163r[1] = context.getResources().getColor(R.color.oppo_transparence);
        this.f5163r[2] = context.getResources().getColor(R.color.oppo_transparence);
        this.f5158m = new Paint(1);
        this.f5158m.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f5158m.setAlpha(10);
        this.f5148A = context.getResources().getColor(R.color.color_gradient_linearlayout_bg_color);
        this.f5159n = new Paint(1);
        Paint paint = this.f5159n;
        if (!C1338c.m4376a(context)) {
            i2 = this.f5148A;
        } else {
            i2 = this.f5148A;
            float[] fArr = new float[3];
            C0542a.m1903a(i2, fArr);
            float max = Math.max(0.2f, 1.0f - fArr[2]);
            if (max < fArr[2]) {
                fArr[2] = max;
                i2 = C0542a.m1902a(fArr);
            }
        }
        paint.setColor(i2);
        this.f5159n.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f5159n.setAlpha(255);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.color_alert_dialog_bg_radius);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorGradientLinearLayout, i, 0);
        this.f5160o = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorGradientLinearLayout_colorCornerRadius, dimensionPixelSize);
        this.f5165t = context.getResources().getDrawable(R.drawable.color_bottom_alert_dialog_bg_with_shadow);
        if (obtainStyledAttributes.hasValue(R.styleable.ColorGradientLinearLayout_colorShadowDrawable)) {
            this.f5165t = obtainStyledAttributes.getDrawable(R.styleable.ColorGradientLinearLayout_colorShadowDrawable);
        }
        obtainStyledAttributes.recycle();
    }

    public void setThemeColor(int i) {
        this.f5166u = i;
        this.f5163r[0] = i;
        invalidate();
    }

    public void setHasGradient(boolean z) {
        this.f5150e = z;
    }

    public void setHasShadow(boolean z) {
        this.f5151f = z;
        if (z) {
            this.f5152g = 40;
            this.f5154i = 40;
            this.f5153h = 20;
            this.f5155j = 60;
            setBackground(this.f5165t);
            setPadding(this.f5152g, this.f5153h, this.f5154i, this.f5155j - this.f5153h);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setPadding((int) (this.f5156k - 40.0f), 0, (int) (this.f5156k - 40.0f), 0);
            }
        } else {
            setBackground(null);
            setPadding(0, 0, 0, 0);
            this.f5152g = 0;
            this.f5153h = 0;
            this.f5154i = 0;
            this.f5155j = 0;
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (viewGroup2 != null) {
                viewGroup2.setPadding(0, 0, 0, 0);
            }
        }
        requestLayout();
    }

    public void setCornerStyle(C1253t c1253t) {
        this.f5149d = c1253t;
        requestLayout();
    }

    @TargetApi(21)
    public void setType(int i) {
        boolean z = i == 0;
        boolean z2 = i == 0 || i == -1;
        setHasShadow(z);
        setHasGradient(z2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5167v = this.f5152g;
        this.f5168w = this.f5153h + this.f5157l;
        this.f5169x = i - this.f5154i;
        this.f5170y = i2 - (this.f5155j - this.f5153h);
        this.f5161p = new RectF(this.f5167v, this.f5168w, this.f5169x, this.f5170y);
        this.f5162q = new LinearGradient(this.f5167v, this.f5168w, this.f5167v, this.f5170y, this.f5163r, this.f5164s, Shader.TileMode.MIRROR);
        this.f5158m.setShader(this.f5162q);
        if (this.f5171z) {
            C1252s c1252s = new C1252s(this);
            setClipToOutline(true);
            setOutlineProvider(c1252s);
        }
    }

    public void setNeedClip(boolean z) {
        this.f5171z = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path m4399a = C1344i.m4397a().m4399a(this.f5167v, this.f5168w, this.f5169x, this.f5170y, this.f5160o, this.f5149d.f5274a, this.f5149d.f5275b, this.f5149d.f5276c, this.f5149d.f5277d);
        canvas.drawPath(m4399a, this.f5159n);
        if (this.f5150e) {
            canvas.drawPath(m4399a, this.f5158m);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }

    public void setTopOffset(int i) {
        this.f5157l = i;
        if (this.f5161p != null) {
            this.f5161p.top = this.f5153h + this.f5157l;
            this.f5162q = new LinearGradient(this.f5161p.left, this.f5161p.top, this.f5161p.left, this.f5161p.bottom, this.f5163r, this.f5164s, Shader.TileMode.MIRROR);
            this.f5158m.setShader(this.f5162q);
        }
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.f5160o = i;
    }

    public int getCornerRadius() {
        return this.f5160o;
    }
}
