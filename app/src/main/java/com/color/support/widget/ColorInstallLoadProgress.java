package com.color.support.widget;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ProgressBar;
import androidx.appcompat.widget.C0295ef;
import androidx.core.p024g.p026b.C0517b;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1336a;
import com.color.support.util.C1337b;
import com.color.support.util.C1338c;
import com.color.support.util.C1344i;
import java.util.Locale;

/* loaded from: classes.dex */
public class ColorInstallLoadProgress extends ColorLoadProgress {

    /* renamed from: A */
    private Bitmap f6051A;

    /* renamed from: B */
    private Bitmap f6052B;

    /* renamed from: C */
    private Bitmap f6053C;

    /* renamed from: D */
    private Paint f6054D;

    /* renamed from: E */
    private Drawable f6055E;

    /* renamed from: F */
    private int f6056F;

    /* renamed from: G */
    private int f6057G;

    /* renamed from: H */
    private int f6058H;

    /* renamed from: I */
    private int f6059I;

    /* renamed from: J */
    private int f6060J;

    /* renamed from: K */
    private int f6061K;

    /* renamed from: L */
    private int f6062L;

    /* renamed from: M */
    private int f6063M;

    /* renamed from: N */
    private float f6064N;

    /* renamed from: O */
    private float f6065O;

    /* renamed from: P */
    private Locale f6066P;

    /* renamed from: Q */
    private int f6067Q;

    /* renamed from: R */
    private int f6068R;

    /* renamed from: g */
    private final String f6069g;

    /* renamed from: h */
    private final boolean f6070h;

    /* renamed from: i */
    private TextPaint f6071i;

    /* renamed from: j */
    private String f6072j;

    /* renamed from: k */
    private int f6073k;

    /* renamed from: l */
    private int f6074l;

    /* renamed from: m */
    private ColorStateList f6075m;

    /* renamed from: n */
    private int f6076n;

    /* renamed from: o */
    private String f6077o;

    /* renamed from: p */
    private Paint.FontMetricsInt f6078p;

    /* renamed from: q */
    private int f6079q;

    /* renamed from: r */
    private int f6080r;

    /* renamed from: s */
    private int f6081s;

    /* renamed from: t */
    private Paint f6082t;

    /* renamed from: u */
    private int f6083u;

    /* renamed from: v */
    private boolean f6084v;

    /* renamed from: w */
    private Path f6085w;

    /* renamed from: x */
    private int f6086x;

    /* renamed from: y */
    private int f6087y;

    /* renamed from: z */
    private int f6088z;

    public ColorInstallLoadProgress(Context context) {
        this(context, null);
    }

    public ColorInstallLoadProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorInstallLoadProgressStyle);
    }

    public ColorInstallLoadProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6069g = "ColorInstallLoadProgress";
        this.f6070h = true;
        this.f6071i = null;
        this.f6074l = 0;
        this.f6076n = 0;
        this.f6077o = null;
        this.f6078p = null;
        this.f6081s = 0;
        this.f6082t = null;
        this.f6083u = 0;
        this.f6084v = false;
        this.f6086x = 0;
        this.f6087y = 0;
        this.f6088z = 0;
        this.f6054D = null;
        this.f6055E = null;
        this.f6060J = 0;
        this.f6064N = 1.0f;
        this.f6067Q = -1;
        C1338c.m4375a(this, false);
        this.f6066P = Locale.getDefault();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorLoadProgress, i, 0);
        this.f6061K = C1337b.m4374a(context, R.attr.colorTintControlNormal);
        this.f6062L = C1337b.m4374a(context, R.attr.colorTintLightNormal);
        this.f6063M = getResources().getColor(R.color.color_install_load_progress_text_color_in_progress);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ColorLoadProgress_colorDefaultDrawable);
        if (drawable != null) {
            setButtonDrawable(drawable);
        }
        setState(obtainStyledAttributes.getInteger(R.styleable.ColorLoadProgress_colorState, 0));
        obtainStyledAttributes.recycle();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.color_install_download_progress_textsize);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.ColorInstallLoadProgress, i, 0);
        setColorLoadStyle(obtainStyledAttributes2.getInteger(R.styleable.ColorInstallLoadProgress_colorStyle, 0));
        this.f6055E = obtainStyledAttributes2.getDrawable(R.styleable.ColorInstallLoadProgress_colorInstallGiftBg);
        this.f6058H = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.ColorInstallLoadProgress_colorInstallViewHeight, 0);
        this.f6056F = obtainStyledAttributes2.getDimensionPixelOffset(R.styleable.ColorInstallLoadProgress_colorInstallViewWidth, 0);
        this.f6059I = m4492a(this.f6058H, false);
        this.f6057G = m4492a(this.f6056F, false);
        this.f6079q = this.f6057G;
        this.f6080r = this.f6059I;
        this.f6065O = obtainStyledAttributes.getFloat(R.styleable.ColorInstallLoadProgress_brightness, 0.9f);
        if (this.f6060J != 2) {
            if (this.f6060J == 1) {
                this.f6081s = getResources().getDimensionPixelSize(R.dimen.color_install_download_progress_round_border_radius);
            } else {
                this.f6081s = getResources().getDimensionPixelSize(R.dimen.color_install_download_progress_round_border_radius_small);
                if (!m4502a(this.f6066P)) {
                    int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.color_install_download_progress_width_in_foreign_language);
                    this.f6056F += dimensionPixelSize2;
                    this.f6057G += dimensionPixelSize2;
                    this.f6079q += dimensionPixelSize2;
                }
            }
            this.f6075m = obtainStyledAttributes2.getColorStateList(R.styleable.ColorInstallLoadProgress_colorInstallDefaultColor);
            this.f6076n = obtainStyledAttributes2.getDimensionPixelOffset(R.styleable.ColorInstallLoadProgress_colorInstallPadding, 0);
            this.f6072j = obtainStyledAttributes2.getString(R.styleable.ColorInstallLoadProgress_colorInstallTextview);
            this.f6073k = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.ColorInstallLoadProgress_colorInstallTextsize, dimensionPixelSize);
            this.f6073k = (int) C1336a.m4370a(this.f6073k, getResources().getConfiguration().fontScale, 2);
            if (this.f6077o == null) {
                this.f6077o = getResources().getString(R.string.color_internet_label_apostrophe);
            }
        } else {
            this.f6081s = getResources().getDimensionPixelSize(R.dimen.color_install_download_progress_circle_round_border_radius);
        }
        obtainStyledAttributes2.recycle();
        setOnTouchListener(new ViewOnTouchListenerC1379au(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.color.support.widget.ColorLoadProgress, androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public void setTextId(int i) {
        setText(getResources().getString(i));
    }

    public void setText(String str) {
        if (str.equals(this.f6072j)) {
            return;
        }
        this.f6072j = str;
        invalidate();
    }

    public void setTextSize(int i) {
        if (i != 0) {
            this.f6074l = i;
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        if (i != 0) {
            this.f6067Q = i;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        int lastIndexOf;
        setMeasuredDimension(this.f6056F, this.f6058H);
        if (this.f6060J != 2) {
            this.f6071i = new TextPaint(1);
            this.f6071i.setAntiAlias(true);
            int i3 = this.f6074l;
            if (i3 == 0) {
                i3 = this.f6073k;
            }
            this.f6068R = this.f6067Q;
            if (this.f6068R == -1) {
                this.f6068R = this.f6075m.getColorForState(getDrawableState(), C1337b.m4374a(getContext(), R.attr.colorDefaultTextColor));
            }
            this.f6071i.setTextSize(i3);
            C1336a.m4371a(this.f6071i);
            this.f6078p = this.f6071i.getFontMetricsInt();
            m4501a(this.f6072j);
            String m4495a = m4495a(this.f6072j, this.f6057G - (this.f6076n * 2));
            if (m4495a.length() <= 0 || m4495a.length() >= this.f6072j.length()) {
                return;
            }
            String m4495a2 = m4495a(m4495a, (this.f6057G - (this.f6076n * 2)) - ((int) this.f6071i.measureText(this.f6077o)));
            if (!m4501a(m4495a2) && (lastIndexOf = m4495a2.lastIndexOf(32)) > 0) {
                m4495a2 = m4495a2.substring(0, lastIndexOf);
            }
            this.f6072j = m4495a2 + this.f6077o;
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(this.f6149c);
        accessibilityEvent.setCurrentItemIndex(this.f6148b);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if ((this.f6147a == 0 || this.f6147a == 3 || this.f6147a == 2) && this.f6072j != null) {
            accessibilityNodeInfo.setContentDescription(this.f6072j);
        }
    }

    public void setColorLoadStyle(int i) {
        if (i == 2) {
            this.f6060J = 2;
            this.f6054D = new Paint(1);
            this.f6054D.setAntiAlias(true);
            this.f6051A = m4504b(R.drawable.color_install_load_progress_circle_load);
            this.f6052B = m4504b(R.drawable.color_install_load_progress_circle_reload);
            this.f6053C = m4504b(R.drawable.color_install_load_progress_circle_pause);
            this.f6086x = getResources().getDimensionPixelSize(R.dimen.color_install_download_progress_default_circle_radius);
            this.f6087y = m4492a(this.f6086x, true);
            this.f6088z = this.f6087y;
            return;
        }
        this.f6060J = i;
        this.f6082t = new Paint(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.color.support.widget.ColorLoadProgress, android.view.View
    public void onDetachedFromWindow() {
        if (this.f6060J == 2) {
            if (this.f6051A != null && !this.f6051A.isRecycled()) {
                this.f6051A.recycle();
            }
            if (this.f6053C != null && !this.f6053C.isRecycled()) {
                this.f6053C.recycle();
            }
            if (this.f6052B != null && !this.f6052B.isRecycled()) {
                this.f6052B.recycle();
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6060J == 2) {
            if (this.f6051A == null || this.f6051A.isRecycled()) {
                this.f6051A = m4504b(R.drawable.color_install_load_progress_circle_load);
            }
            if (this.f6052B == null || this.f6052B.isRecycled()) {
                this.f6052B = m4504b(R.drawable.color_install_load_progress_circle_reload);
            }
            if (this.f6053C == null || this.f6053C.isRecycled()) {
                this.f6053C = m4504b(R.drawable.color_install_load_progress_circle_pause);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Locale locale = Locale.getDefault();
        if (this.f6060J != 0 || this.f6066P.getLanguage().equalsIgnoreCase(locale.getLanguage())) {
            return;
        }
        this.f6066P = locale;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.color_install_download_progress_width_in_foreign_language);
        if (!m4502a(this.f6066P)) {
            this.f6056F += dimensionPixelSize;
            this.f6057G += dimensionPixelSize;
            this.f6079q += dimensionPixelSize;
        } else {
            this.f6056F -= dimensionPixelSize;
            this.f6057G -= dimensionPixelSize;
            this.f6079q -= dimensionPixelSize;
        }
        invalidate();
    }

    /* renamed from: a */
    private String m4495a(String str, int i) {
        int breakText = this.f6071i.breakText(str, true, i, null);
        return (breakText == 0 || breakText == str.length()) ? str : str.substring(0, breakText - 1);
    }

    /* renamed from: a */
    private static boolean m4501a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.toString(str.charAt(i2)).matches("^[一-龥]{1}$")) {
                i++;
            }
        }
        return i > 0;
    }

    /* renamed from: a */
    private void m4497a(Canvas canvas, float f, float f2, boolean z, float f3, float f4) {
        canvas.translate(f3, f4);
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        this.f6082t.setColor(m4491a(this.f6061K));
        if (!z) {
            this.f6082t.setColor(m4491a(this.f6062L));
        }
        this.f6085w = C1344i.m4397a().m4400a(rectF, this.f6081s);
        canvas.drawPath(this.f6085w, this.f6082t);
        canvas.translate(-f3, -f4);
    }

    /* renamed from: a */
    private void m4498a(Canvas canvas, float f, float f2, boolean z, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f6054D.setColor(m4491a(this.f6061K));
        if (!z) {
            this.f6054D.setColor(m4491a(this.f6062L));
        }
        this.f6085w = C1344i.m4397a().m4400a(new RectF(f - this.f6088z, f2 - this.f6088z, f + this.f6088z, f2 + this.f6088z), this.f6081s);
        canvas.drawPath(this.f6085w, this.f6054D);
        canvas.drawBitmap(bitmap, (this.f6056F - bitmap.getWidth()) / 2, (this.f6058H - bitmap.getHeight()) / 2, (Paint) null);
        canvas.save();
    }

    /* renamed from: a */
    private void m4496a(Canvas canvas, float f, float f2) {
        if (this.f6072j != null) {
            float measureText = this.f6076n + 0.0f + (((f - this.f6071i.measureText(this.f6072j)) - (this.f6076n * 2)) / 2.0f);
            float f3 = ((f2 - (this.f6078p.bottom - this.f6078p.top)) / 2.0f) - this.f6078p.top;
            canvas.drawText(this.f6072j, measureText, f3, this.f6071i);
            if (this.f6084v) {
                this.f6071i.setColor(this.f6063M);
                canvas.save();
                if (!C0295ef.m987a(this)) {
                    canvas.clipRect(0.0f, 0.0f, this.f6083u, f2);
                } else {
                    canvas.clipRect(f - this.f6083u, 0.0f, f, f2);
                }
                canvas.drawText(this.f6072j, measureText, f3, this.f6071i);
                canvas.restore();
                this.f6084v = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.color.support.widget.ColorLoadProgress, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        float f;
        super.onDraw(canvas);
        float f2 = (this.f6056F - this.f6079q) / 2.0f;
        float f3 = (this.f6058H - this.f6080r) / 2.0f;
        float f4 = this.f6079q;
        float f5 = this.f6080r;
        if (this.f6147a == 3) {
            if (this.f6060J == 2) {
                m4498a(canvas, (float) ((this.f6056F * 1.0d) / 2.0d), (float) ((this.f6058H * 1.0d) / 2.0d), true, this.f6052B);
                return;
            }
            m4497a(canvas, f4, f5, true, f2, f3);
            this.f6071i.setColor(this.f6063M);
            this.f6084v = false;
            m4496a(canvas, this.f6056F, this.f6058H);
            return;
        }
        if (this.f6147a == 0) {
            if (this.f6060J == 2) {
                m4498a(canvas, (float) ((this.f6056F * 1.0d) / 2.0d), (float) ((this.f6058H * 1.0d) / 2.0d), false, this.f6051A);
                z = true;
            } else if (this.f6060J == 1) {
                z = true;
                m4497a(canvas, f4, f5, true, f2, f3);
            } else {
                z = true;
                m4497a(canvas, f4, f5, false, f2, f3);
            }
            if (this.f6060J == z) {
                this.f6071i.setColor(this.f6063M);
            } else if (this.f6060J == 0) {
                this.f6071i.setColor(this.f6061K);
            }
        } else {
            z = true;
        }
        if (this.f6147a == z || this.f6147a == 2) {
            if (this.f6060J == 2) {
                if (this.f6147a == z) {
                    m4498a(canvas, (float) ((this.f6056F * 1.0d) / 2.0d), (float) ((this.f6058H * 1.0d) / 2.0d), true, this.f6053C);
                } else if (this.f6147a == 2) {
                    m4498a(canvas, (float) ((this.f6056F * 1.0d) / 2.0d), (float) ((this.f6058H * 1.0d) / 2.0d), true, this.f6052B);
                }
            } else {
                if (this.f6150e) {
                    f = this.f6151f / this.f6149c;
                } else {
                    f = this.f6148b / this.f6149c;
                }
                this.f6083u = (int) (f * this.f6056F);
                m4497a(canvas, f4, f5, false, f2, f3);
                canvas.save();
                if (!C0295ef.m987a(this)) {
                    canvas.clipRect(0.0f, 0.0f, this.f6083u, this.f6058H);
                } else {
                    canvas.translate(f2, 0.0f);
                    canvas.clipRect((f4 - this.f6083u) + f2, 0.0f, f4, this.f6058H);
                    canvas.translate(-f2, 0.0f);
                }
                if (this.f6060J != 2) {
                    m4497a(canvas, f4, f5, true, f2, f3);
                    canvas.restore();
                }
                this.f6084v = z;
                this.f6071i.setColor(this.f6061K);
            }
        }
        if (this.f6060J != 2) {
            m4496a(canvas, this.f6056F, this.f6058H);
        }
    }

    /* renamed from: a */
    private static int m4493a(Context context) {
        return (int) ((context.getResources().getDisplayMetrics().density * 1.5f) + 0.5f);
    }

    /* renamed from: a */
    private int m4492a(int i, boolean z) {
        return i - (z ? m4493a(getContext()) : m4493a(getContext()) * 2);
    }

    /* renamed from: a */
    private int m4491a(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        int i2 = (int) (red * this.f6064N);
        int i3 = (int) (green * this.f6064N);
        int i4 = (int) (blue * this.f6064N);
        if (i2 > 255) {
            i2 = 255;
        }
        if (i3 > 255) {
            i3 = 255;
        }
        if (i4 > 255) {
            i4 = 255;
        }
        return Color.argb(alpha, i2, i3, i4);
    }

    /* renamed from: b */
    private Bitmap m4504b(int i) {
        Drawable drawable = getContext().getDrawable(i);
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    private static boolean m4502a(Locale locale) {
        return "zh".equalsIgnoreCase(locale.getLanguage());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m4507c(ColorInstallLoadProgress colorInstallLoadProgress) {
        switch (colorInstallLoadProgress.f6060J) {
            case 0:
            case 1:
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("widthHolder", colorInstallLoadProgress.f6079q, colorInstallLoadProgress.f6056F), PropertyValuesHolder.ofInt("heightHolder", colorInstallLoadProgress.f6080r, colorInstallLoadProgress.f6058H), PropertyValuesHolder.ofFloat("brightnessHolder", colorInstallLoadProgress.f6064N, colorInstallLoadProgress.f6065O));
                if (Build.VERSION.SDK_INT > 21) {
                    ofPropertyValuesHolder.setInterpolator(C0517b.m1773a(0.25f, 0.1f, 0.1f, 1.0f));
                }
                ofPropertyValuesHolder.setDuration(66L);
                ofPropertyValuesHolder.addUpdateListener(new C1373ao(colorInstallLoadProgress));
                ofPropertyValuesHolder.start();
                return;
            case 2:
                ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("circleRadiusHolder", colorInstallLoadProgress.f6088z, colorInstallLoadProgress.f6086x), PropertyValuesHolder.ofFloat("circleBrightnessHolder", colorInstallLoadProgress.f6064N, colorInstallLoadProgress.f6065O));
                if (Build.VERSION.SDK_INT > 21) {
                    ofPropertyValuesHolder2.setInterpolator(C0517b.m1773a(0.25f, 0.1f, 0.1f, 1.0f));
                }
                ofPropertyValuesHolder2.setDuration(66L);
                ofPropertyValuesHolder2.addUpdateListener(new C1374ap(colorInstallLoadProgress));
                ofPropertyValuesHolder2.start();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m4499a(ColorInstallLoadProgress colorInstallLoadProgress, boolean z) {
        switch (colorInstallLoadProgress.f6060J) {
            case 0:
            case 1:
                ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("widthHolder", colorInstallLoadProgress.f6079q, colorInstallLoadProgress.f6057G), PropertyValuesHolder.ofInt("heightHolder", colorInstallLoadProgress.f6080r, colorInstallLoadProgress.f6059I), PropertyValuesHolder.ofFloat("brightnessHolder", colorInstallLoadProgress.f6064N, 1.0f));
                if (Build.VERSION.SDK_INT > 21) {
                    ofPropertyValuesHolder.setInterpolator(C0517b.m1773a(0.25f, 0.1f, 0.25f, 1.0f));
                }
                ofPropertyValuesHolder.setDuration(300L);
                ofPropertyValuesHolder.addUpdateListener(new C1375aq(colorInstallLoadProgress));
                ofPropertyValuesHolder.addListener(new C1376ar(colorInstallLoadProgress, z));
                ofPropertyValuesHolder.start();
                return;
            case 2:
                ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("circleRadiusHolder", colorInstallLoadProgress.f6088z, colorInstallLoadProgress.f6087y), PropertyValuesHolder.ofFloat("circleBrightnessHolder", colorInstallLoadProgress.f6064N, 1.0f));
                if (Build.VERSION.SDK_INT > 21) {
                    ofPropertyValuesHolder2.setInterpolator(C0517b.m1773a(0.25f, 0.1f, 0.25f, 1.0f));
                }
                ofPropertyValuesHolder2.setDuration(300L);
                ofPropertyValuesHolder2.addUpdateListener(new C1377as(colorInstallLoadProgress));
                ofPropertyValuesHolder2.addListener(new C1378at(colorInstallLoadProgress, z));
                ofPropertyValuesHolder2.start();
                return;
            default:
                return;
        }
    }
}
