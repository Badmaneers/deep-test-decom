package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;
import androidx.customview.p027a.AbstractC0582a;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1338c;
import com.coloros.neton.BuildConfig;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Locale;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class ColorNumericKeyboard extends View {

    /* renamed from: A */
    private float f6340A;

    /* renamed from: B */
    private float f6341B;

    /* renamed from: C */
    private float f6342C;

    /* renamed from: D */
    private int f6343D;

    /* renamed from: E */
    private int f6344E;

    /* renamed from: F */
    private TextPaint f6345F;

    /* renamed from: G */
    private float f6346G;

    /* renamed from: H */
    private float f6347H;

    /* renamed from: I */
    private float f6348I;

    /* renamed from: J */
    private float f6349J;

    /* renamed from: K */
    private SideStyle f6350K;

    /* renamed from: L */
    private SideStyle f6351L;

    /* renamed from: M */
    private AnimatorSet f6352M;

    /* renamed from: N */
    private AnimatorSet f6353N;

    /* renamed from: O */
    private boolean f6354O;

    /* renamed from: P */
    private Animator.AnimatorListener f6355P;

    /* renamed from: Q */
    private PatternExploreByTouchHelper f6356Q;

    /* renamed from: R */
    private final AccessibilityManager f6357R;

    /* renamed from: S */
    private Context f6358S;

    /* renamed from: a */
    @Deprecated
    public int f6359a;

    /* renamed from: b */
    @Deprecated
    public int f6360b;

    /* renamed from: c */
    public final SideStyle f6361c;

    /* renamed from: d */
    public final SideStyle f6362d;

    /* renamed from: e */
    private final float f6363e;

    /* renamed from: f */
    private int f6364f;

    /* renamed from: g */
    private Paint f6365g;

    /* renamed from: h */
    private Cell f6366h;

    /* renamed from: i */
    private int f6367i;

    /* renamed from: j */
    private OnClickItemListener f6368j;

    /* renamed from: k */
    private int f6369k;

    /* renamed from: l */
    private int f6370l;

    /* renamed from: m */
    private int f6371m;

    /* renamed from: n */
    private int f6372n;

    /* renamed from: o */
    private int f6373o;

    /* renamed from: p */
    private boolean f6374p;

    /* renamed from: q */
    private boolean f6375q;

    /* renamed from: r */
    private Cell[][] f6376r;

    /* renamed from: s */
    private Drawable f6377s;

    /* renamed from: t */
    private Drawable f6378t;

    /* renamed from: u */
    private Drawable f6379u;

    /* renamed from: v */
    private int[] f6380v;

    /* renamed from: w */
    private TextPaint f6381w;

    /* renamed from: x */
    private Paint.FontMetricsInt f6382x;

    /* renamed from: y */
    private Paint.FontMetricsInt f6383y;

    /* renamed from: z */
    private Paint f6384z;

    /* loaded from: classes.dex */
    public interface OnClickItemListener {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface OnItemTouchListener {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface OnTouchTextListener {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface OnTouchUpListener {
    }

    /* renamed from: a */
    static /* synthetic */ void m4630a() {
    }

    @Deprecated
    public int getTouchIndex() {
        return 0;
    }

    @Deprecated
    public void setHasFinishButton(boolean z) {
    }

    @Deprecated
    public void setItemTouchListener(OnItemTouchListener onItemTouchListener) {
    }

    @Deprecated
    public void setTouchTextListener(OnTouchTextListener onTouchTextListener) {
    }

    @Deprecated
    public void setTouchUpListener(OnTouchUpListener onTouchUpListener) {
    }

    @Deprecated
    public void setType(int i) {
    }

    /* renamed from: a */
    public final synchronized Cell m4646a(int i, int i2) {
        m4643c(i, i2);
        return this.f6376r[i][i2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m4643c(int i, int i2) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("row must be in range 0-3");
        }
        if (i2 < 0 || i2 > 2) {
            throw new IllegalArgumentException("column must be in range 0-2");
        }
    }

    /* loaded from: classes.dex */
    public class Cell {

        /* renamed from: a */
        int f6386a;

        /* renamed from: b */
        int f6387b;

        /* renamed from: c */
        String f6388c;

        /* renamed from: d */
        String f6389d;

        /* synthetic */ Cell(ColorNumericKeyboard colorNumericKeyboard, int i, int i2, byte b) {
            this(i, i2);
        }

        private Cell(int i, int i2) {
            this.f6388c = BuildConfig.FLAVOR;
            this.f6389d = BuildConfig.FLAVOR;
            ColorNumericKeyboard.m4643c(i, i2);
            this.f6386a = i;
            this.f6387b = i2;
        }

        public int getRow() {
            return this.f6386a;
        }

        public int getColumn() {
            return this.f6387b;
        }

        public String toString() {
            return "row " + this.f6386a + "column " + this.f6387b;
        }
    }

    public ColorNumericKeyboard(Context context) {
        this(context, null);
    }

    public ColorNumericKeyboard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorNumericKeyboardStyle);
    }

    public ColorNumericKeyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context createConfigurationContext;
        Typeface typeface;
        this.f6359a = 1;
        this.f6360b = 2;
        this.f6365g = null;
        this.f6366h = null;
        this.f6367i = -1;
        this.f6374p = true;
        byte b = 0;
        this.f6375q = false;
        int i2 = 4;
        int i3 = 3;
        this.f6376r = (Cell[][]) Array.newInstance((Class<?>) Cell.class, 4, 3);
        this.f6377s = null;
        this.f6380v = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, -1, 0, -1};
        this.f6381w = new TextPaint();
        this.f6382x = null;
        this.f6383y = null;
        this.f6384z = new Paint();
        this.f6340A = -1.0f;
        this.f6341B = -1.0f;
        this.f6342C = -1.0f;
        this.f6343D = -1;
        this.f6344E = -1;
        this.f6345F = new TextPaint();
        this.f6347H = 0.12f;
        this.f6355P = new AnimatorListenerAdapter() { // from class: com.color.support.widget.ColorNumericKeyboard.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ColorNumericKeyboard.this.f6353N.start();
            }
        };
        C1338c.m4375a(this, false);
        this.f6358S = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorNumericKeyboard, i, 0);
        this.f6369k = obtainStyledAttributes.getColor(R.styleable.ColorNumericKeyboard_colorNumPressColor, 0);
        int defaultDisplayDensity$134621 = getDefaultDisplayDensity$134621();
        if (defaultDisplayDensity$134621 == -1) {
            createConfigurationContext = context;
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            configuration.densityDpi = defaultDisplayDensity$134621;
            createConfigurationContext = context.createConfigurationContext(configuration);
        }
        Resources resources = createConfigurationContext.getResources();
        this.f6370l = resources.getDimensionPixelSize(R.dimen.color_numeric_keyboard_circle_diametor);
        this.f6372n = resources.getDimensionPixelSize(R.dimen.color_numeric_keyboard_level_space);
        this.f6373o = resources.getDimensionPixelSize(R.dimen.color_numeric_keyboard_vertical_space);
        this.f6341B = resources.getDimensionPixelSize(R.dimen.color_numeric_keyboard_line_height);
        this.f6340A = resources.getDimensionPixelSize(R.dimen.color_numeric_keyboard_line_width);
        this.f6342C = resources.getDimensionPixelSize(R.dimen.number_keyboard_number_size);
        this.f6364f = resources.getDimensionPixelSize(R.dimen.color_numeric_keyboard_height);
        this.f6343D = obtainStyledAttributes.getColor(R.styleable.ColorNumericKeyboard_colorNumberColor, 0);
        this.f6344E = obtainStyledAttributes.getColor(R.styleable.ColorNumericKeyboard_colorLineColor, 0);
        int color2 = obtainStyledAttributes.getColor(R.styleable.ColorNumericKeyboard_colorWordTextNormalColor, 0);
        this.f6363e = obtainStyledAttributes.getFloat(R.styleable.ColorNumericKeyboard_colorCircleMaxAlpha, 0.0f);
        obtainStyledAttributes.recycle();
        this.f6356Q = new PatternExploreByTouchHelper(this);
        C0538w.m1849a(this, this.f6356Q);
        setImportantForAccessibility(1);
        this.f6356Q.m2071a();
        String[] stringArray = context.getResources().getStringArray(R.array.color_number_keyboard_letters);
        this.f6377s = context.getResources().getDrawable(R.drawable.color_number_keyboard_delete);
        this.f6378t = getResources().getDrawable(R.drawable.color_number_keyboard_normal_circle);
        this.f6379u = getResources().getDrawable(R.drawable.color_number_keyboard_blur_circle);
        this.f6378t.setTint(this.f6369k);
        this.f6379u.setTint(this.f6369k);
        this.f6354O = context.getPackageManager().hasSystemFeature("oppo.feature.vibrator.waveform.support");
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            while (i5 < i3) {
                this.f6376r[i4][i5] = new Cell(this, i4, i5, b);
                int i6 = (i4 * 3) + i5;
                this.f6376r[i4][i5].f6389d = stringArray[i6];
                int i7 = this.f6380v[i6];
                if (i7 >= 0) {
                    this.f6376r[i4][i5].f6388c = String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
                }
                i5++;
                i3 = 3;
            }
            i4++;
            i2 = 4;
            i3 = 3;
        }
        String string = getResources().getString(R.string.color_numeric_keyboard_sure);
        this.f6362d = new SideStyle.Builder().m4661a(string).m4659a(color2).m4658a(resources.getDimensionPixelSize(R.dimen.color_number_keyboard_finish_text_size)).m4663b(string).m4662a();
        this.f6377s = context.getResources().getDrawable(R.drawable.color_number_keyboard_delete);
        this.f6377s.setTint(this.f6343D);
        this.f6361c = new SideStyle.Builder().m4660a(this.f6377s).m4663b(getResources().getString(R.string.color_number_keyboard_delete)).m4662a();
        this.f6357R = (AccessibilityManager) context.getSystemService("accessibility");
        this.f6371m = this.f6370l / 2;
        this.f6365g = new Paint(5);
        this.f6365g.setColor(this.f6369k);
        this.f6365g.setMaskFilter(new BlurMaskFilter(20.0f, BlurMaskFilter.Blur.NORMAL));
        this.f6365g.setAlpha(0);
        this.f6381w.setTextSize(this.f6342C);
        this.f6381w.setColor(this.f6343D);
        this.f6381w.setAntiAlias(true);
        try {
            typeface = Typeface.createFromFile("/system/fonts/SysSans-En-Regular.otf");
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        this.f6381w.setTypeface(typeface);
        this.f6382x = this.f6381w.getFontMetricsInt();
        this.f6384z.setColor(this.f6344E);
        this.f6384z.setAntiAlias(true);
        this.f6384z.setStyle(Paint.Style.STROKE);
        this.f6384z.setStrokeWidth(this.f6341B);
        this.f6345F.setFakeBoldText(true);
        this.f6345F.setAntiAlias(true);
        this.f6352M = new AnimatorSet();
        this.f6352M.setDuration(100L);
        this.f6352M.setInterpolator(new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f));
        this.f6352M.play(ObjectAnimator.ofFloat(this, "normalScale", 1.0f, 2.0f)).with(ObjectAnimator.ofFloat(this, "normalAlpha", 0.0f, this.f6363e));
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.6f, 1.0f);
        this.f6353N = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "normalScale", 2.0f, 2.5f);
        ofFloat.setDuration(160L);
        ofFloat.setInterpolator(pathInterpolator);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "normalAlpha", this.f6363e, 0.0f);
        ofFloat2.setDuration(160L);
        ofFloat2.setInterpolator(pathInterpolator);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("blurAlpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.5f, this.f6363e), Keyframe.ofFloat(1.0f, 0.0f)));
        ofPropertyValuesHolder.setDuration(400L);
        ofPropertyValuesHolder.setInterpolator(pathInterpolator);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "blurScale", 1.0f, 2.0f);
        ofPropertyValuesHolder.setDuration(400L);
        ofPropertyValuesHolder.setInterpolator(pathInterpolator);
        this.f6353N.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofPropertyValuesHolder);
    }

    private int getDefaultDisplayDensity$134621() {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((DisplayManager) this.f6358S.getSystemService("display")).getDisplay(0).getMetrics(displayMetrics);
            return displayMetrics.densityDpi;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(((this.f6370l + this.f6373o) * 3) + this.f6371m, ((int) ((this.f6370l * 4) + (this.f6341B * 5.0f))) + this.f6371m);
    }

    /* renamed from: b */
    private void m4638b() {
        if (this.f6354O) {
            performHapticFeedback(ResponseCode.CODE_3XX_FOUND);
        } else {
            performHapticFeedback(ResponseCode.CODE_3XX_MOVED_PERMANENTLY);
        }
    }

    /* renamed from: a */
    private void m4631a(MotionEvent motionEvent) {
        if (this.f6357R.isTouchExplorationEnabled()) {
            this.f6366h = m4628a(motionEvent.getX(), motionEvent.getY());
            if (this.f6366h != null) {
                int m4626a = m4626a(this.f6366h);
                this.f6356Q.m2071a();
                if (this.f6374p && m4626a != -1) {
                    m4638b();
                }
            } else {
                this.f6367i = -1;
            }
        }
        m4642c();
        if (m4625a(motionEvent.getY()) != -1) {
            m4636b(motionEvent.getX());
        }
        if (this.f6367i != -1 && isEnabled() && !hasOnClickListeners()) {
            playSoundEffect(0);
        }
        invalidate();
    }

    /* renamed from: c */
    private void m4642c() {
        if (this.f6352M.isRunning()) {
            this.f6352M.addListener(this.f6355P);
        } else {
            this.f6353N.start();
        }
    }

    /* renamed from: a */
    private int m4626a(Cell cell) {
        this.f6367i = (cell.getRow() * 3) + cell.getColumn();
        if (this.f6367i == 9 && m4640b(this.f6350K)) {
            this.f6367i = -1;
        }
        if (this.f6367i == 11 && m4640b(this.f6351L)) {
            this.f6367i = -1;
        }
        return this.f6367i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public float m4623a(int i) {
        float f = this.f6370l + this.f6373o;
        return getPaddingLeft() + (f / 2.0f) + (f * i) + (this.f6371m / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public float m4634b(int i) {
        float f = this.f6370l;
        return getPaddingTop() + (f / 2.0f) + (this.f6371m / 2) + (f * i) + (this.f6341B * (i + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Cell m4628a(float f, float f2) {
        int m4636b;
        int m4625a = m4625a(f2);
        if (m4625a >= 0 && (m4636b = m4636b(f)) >= 0) {
            return m4646a(m4625a, m4636b);
        }
        return null;
    }

    /* renamed from: a */
    private int m4625a(float f) {
        for (int i = 0; i < 4; i++) {
            int m4634b = (int) m4634b(i);
            int i2 = (int) ((m4634b - (this.f6370l / 2)) - (this.f6341B / 2.0f));
            int i3 = (int) (m4634b + (this.f6370l / 2) + (this.f6341B / 2.0f));
            if (i2 <= f && f <= i3) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private int m4636b(float f) {
        for (int i = 0; i < 3; i++) {
            int m4623a = (int) m4623a(i);
            int i2 = (m4623a - (this.f6370l / 2)) - (this.f6373o / 2);
            int i3 = m4623a + (this.f6370l / 2) + (this.f6373o / 2);
            if (i2 <= f && f <= i3) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6365g != null) {
            this.f6365g = null;
        }
        if (this.f6366h != null) {
            this.f6366h = null;
        }
        this.f6375q = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6366h != null) {
            float m4623a = m4623a(this.f6366h.f6387b);
            float m4634b = m4634b(this.f6366h.f6386a);
            if (m4626a(this.f6366h) != -1) {
                int i = (int) (m4623a - this.f6371m);
                int i2 = (int) (m4634b - this.f6371m);
                int i3 = (int) (this.f6371m + m4623a);
                int i4 = (int) (this.f6371m + m4634b);
                canvas.save();
                canvas.scale(this.f6349J, this.f6349J, m4623a, m4634b);
                this.f6378t.setAlpha((int) (this.f6347H * 255.0f));
                this.f6378t.setBounds(i, i2, i3, i4);
                this.f6378t.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.scale(this.f6348I, this.f6348I, m4623a, m4634b);
                this.f6379u.setBounds(i, i2, i3, i4);
                this.f6379u.setAlpha((int) (this.f6346G * 255.0f));
                this.f6379u.draw(canvas);
                canvas.restore();
            }
        }
        int i5 = -1;
        while (i5 < 4) {
            float measuredWidth = (getMeasuredWidth() - this.f6340A) / 2.0f;
            i5++;
            float f = (this.f6370l + this.f6373o) * i5;
            canvas.drawLine(measuredWidth, f, measuredWidth + this.f6340A, f, this.f6384z);
        }
        for (int i6 = 0; i6 < 4; i6++) {
            for (int i7 = 0; i7 < 3; i7++) {
                Cell cell = this.f6376r[i6][i7];
                float m4623a2 = m4623a(i7);
                float m4634b2 = m4634b(i6);
                int i8 = (i6 * 3) + i7;
                if (i8 == 9) {
                    m4632a(this.f6350K, canvas, m4623a2, m4634b2);
                } else if (i8 == 11) {
                    m4632a(this.f6351L, canvas, m4623a2, m4634b2);
                } else if (i8 != -1) {
                    canvas.drawText(cell.f6388c, m4623a2 - (this.f6381w.measureText(cell.f6388c) / 2.0f), m4634b2 - ((this.f6382x.descent + this.f6382x.ascent) / 2), this.f6381w);
                }
            }
        }
    }

    /* renamed from: a */
    private void m4632a(SideStyle sideStyle, Canvas canvas, float f, float f2) {
        if (m4640b(sideStyle)) {
            return;
        }
        if (sideStyle.f6393a != null) {
            int intrinsicWidth = (int) (f - (sideStyle.f6393a.getIntrinsicWidth() / 2));
            int intrinsicHeight = (int) (f2 - (sideStyle.f6393a.getIntrinsicHeight() / 2));
            sideStyle.f6393a.setBounds(intrinsicWidth, intrinsicHeight, sideStyle.f6393a.getIntrinsicWidth() + intrinsicWidth, sideStyle.f6393a.getIntrinsicHeight() + intrinsicHeight);
            sideStyle.f6393a.draw(canvas);
            return;
        }
        if (TextUtils.isEmpty(sideStyle.f6394b)) {
            return;
        }
        this.f6345F.setTextSize(sideStyle.f6396d);
        this.f6345F.setColor(sideStyle.f6395c);
        float measureText = this.f6345F.measureText(sideStyle.f6394b);
        this.f6383y = this.f6345F.getFontMetricsInt();
        canvas.drawText(sideStyle.f6394b, f - (measureText / 2.0f), f2 - ((this.f6383y.descent + this.f6383y.ascent) / 2), this.f6345F);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (!z && this.f6375q && this.f6365g != null) {
            this.f6365g.setAlpha(0);
            this.f6375q = false;
            invalidate();
        }
        super.setEnabled(z);
    }

    private void setBlurScale(float f) {
        this.f6348I = f;
        invalidate();
    }

    private void setNormalScale(float f) {
        this.f6349J = f;
        invalidate();
    }

    private void setBlurAlpha(float f) {
        this.f6346G = f;
        invalidate();
    }

    private void setNormalAlpha(float f) {
        this.f6347H = f;
        invalidate();
    }

    public void setOnClickItemListener(OnClickItemListener onClickItemListener) {
        this.f6368j = onClickItemListener;
    }

    public void setLeftStyle(SideStyle sideStyle) {
        this.f6350K = sideStyle;
        this.f6356Q.m2072a(9);
        invalidate();
    }

    public void setRightStyle(SideStyle sideStyle) {
        this.f6351L = sideStyle;
        this.f6356Q.m2072a(11);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m4640b(SideStyle sideStyle) {
        if (sideStyle != null) {
            return sideStyle.f6393a == null && TextUtils.isEmpty(sideStyle.f6394b);
        }
        return true;
    }

    public void setTactileFeedbackEnabled(boolean z) {
        this.f6374p = z;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.f6357R.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7) {
                switch (action) {
                    case 9:
                        motionEvent.setAction(0);
                        break;
                    case 10:
                        motionEvent.setAction(1);
                        break;
                }
            } else {
                motionEvent.setAction(2);
            }
            onTouchEvent(motionEvent);
            motionEvent.setAction(action);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f6356Q.m2082a(motionEvent) | super.dispatchHoverEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class PatternExploreByTouchHelper extends AbstractC0582a {

        /* renamed from: d */
        private Rect f6392d;

        public PatternExploreByTouchHelper(View view) {
            super(view);
            this.f6392d = new Rect();
        }

        @Override // androidx.customview.p027a.AbstractC0582a
        /* renamed from: a */
        protected final void mo2077a(List<Integer> list) {
            for (int i = 0; i < getItemCounts(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // androidx.customview.p027a.AbstractC0582a
        /* renamed from: a */
        protected final void mo2073a(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.getText().add(m4647d(i));
        }

        @Override // androidx.customview.p027a.AbstractC0582a
        /* renamed from: a */
        protected final void mo2074a(int i, C0482c c0482c) {
            int i2;
            c0482c.m1676e(m4647d(i));
            c0482c.m1649a(C0483d.f2303e);
            c0482c.m1685h(true);
            Rect rect = this.f6392d;
            int i3 = 0;
            if (i != -1) {
                Cell m4646a = ColorNumericKeyboard.this.m4646a(i / 3, i % 3);
                i3 = (int) ColorNumericKeyboard.this.m4623a(m4646a.f6387b);
                i2 = (int) ColorNumericKeyboard.this.m4634b(m4646a.f6386a);
            } else {
                i2 = 0;
            }
            rect.left = i3 - ColorNumericKeyboard.this.f6371m;
            rect.right = i3 + ColorNumericKeyboard.this.f6371m;
            rect.top = i2 - ColorNumericKeyboard.this.f6371m;
            rect.bottom = i2 + ColorNumericKeyboard.this.f6371m;
            c0482c.m1657b(rect);
        }

        @Override // androidx.core.p024g.C0479a
        /* renamed from: c */
        public final void mo1630c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1630c(view, accessibilityEvent);
        }

        public final int getItemCounts() {
            int i = ColorNumericKeyboard.m4640b(ColorNumericKeyboard.this.f6350K) ? 10 : 11;
            return ColorNumericKeyboard.m4640b(ColorNumericKeyboard.this.f6351L) ? i - 1 : i;
        }

        /* renamed from: d */
        private CharSequence m4647d(int i) {
            if (i != 9 || ColorNumericKeyboard.m4640b(ColorNumericKeyboard.this.f6350K)) {
                if (i == 11 && !ColorNumericKeyboard.m4640b(ColorNumericKeyboard.this.f6351L)) {
                    return ColorNumericKeyboard.this.f6351L.f6397e;
                }
                if (i == -1) {
                    return getClass().getSimpleName();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(ColorNumericKeyboard.this.f6380v[i]);
                return sb.toString();
            }
            return ColorNumericKeyboard.this.f6350K.f6397e;
        }

        @Override // androidx.customview.p027a.AbstractC0582a
        /* renamed from: a */
        protected final int mo2070a(float f, float f2) {
            Cell m4628a = ColorNumericKeyboard.this.m4628a(f, f2);
            if (m4628a == null) {
                return -1;
            }
            int column = m4628a.getColumn() + (m4628a.getRow() * 3);
            if (column == 9 && ColorNumericKeyboard.m4640b(ColorNumericKeyboard.this.f6350K)) {
                column = -1;
            }
            if (column == 11 && ColorNumericKeyboard.m4640b(ColorNumericKeyboard.this.f6351L)) {
                return -1;
            }
            return column;
        }

        @Override // androidx.customview.p027a.AbstractC0582a
        /* renamed from: b */
        protected final boolean mo2084b(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            m2072a(i);
            if (ColorNumericKeyboard.this.isEnabled()) {
                ColorNumericKeyboard.m4630a();
                ColorNumericKeyboard.this.announceForAccessibility(m4647d(i));
            }
            m2079a(i, 1);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class SideStyle {

        /* renamed from: a */
        private Drawable f6393a;

        /* renamed from: b */
        private String f6394b;

        /* renamed from: c */
        private int f6395c;

        /* renamed from: d */
        private float f6396d;

        /* renamed from: e */
        private String f6397e;

        /* synthetic */ SideStyle(Builder builder, byte b) {
            this(builder);
        }

        private SideStyle(Builder builder) {
            this.f6393a = builder.f6398a;
            this.f6394b = builder.f6399b;
            this.f6395c = builder.f6400c;
            this.f6396d = builder.f6401d;
            this.f6397e = builder.f6402e;
        }

        /* loaded from: classes.dex */
        public class Builder {

            /* renamed from: a */
            private Drawable f6398a;

            /* renamed from: b */
            private String f6399b;

            /* renamed from: c */
            private int f6400c;

            /* renamed from: d */
            private float f6401d;

            /* renamed from: e */
            private String f6402e;

            /* renamed from: a */
            public final Builder m4660a(Drawable drawable) {
                this.f6398a = drawable;
                return this;
            }

            /* renamed from: a */
            public final Builder m4661a(String str) {
                this.f6399b = str;
                return this;
            }

            /* renamed from: a */
            public final Builder m4659a(int i) {
                this.f6400c = i;
                return this;
            }

            /* renamed from: a */
            public final Builder m4658a(float f) {
                this.f6401d = f;
                return this;
            }

            /* renamed from: b */
            public final Builder m4663b(String str) {
                this.f6402e = str;
                return this;
            }

            /* renamed from: a */
            public final SideStyle m4662a() {
                return new SideStyle(this, (byte) 0);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getPointerId(motionEvent.getActionIndex()) > 0) {
            return true;
        }
        int action = motionEvent.getAction();
        if (!isEnabled()) {
            if (this.f6347H <= 0.0f || (1 != action && 3 != action && action != 0)) {
                z = false;
            }
            if (z) {
                m4642c();
            }
            return false;
        }
        if (action != 6) {
            switch (action) {
                case 0:
                    this.f6375q = true;
                    if (!this.f6357R.isTouchExplorationEnabled()) {
                        this.f6366h = m4628a(motionEvent.getX(), motionEvent.getY());
                        if (this.f6366h != null) {
                            int m4626a = m4626a(this.f6366h);
                            this.f6356Q.m2071a();
                            if (this.f6374p && m4626a != -1) {
                                m4638b();
                            }
                        } else {
                            this.f6367i = -1;
                        }
                    }
                    this.f6352M.removeListener(this.f6355P);
                    if (this.f6353N.isRunning()) {
                        this.f6353N.end();
                    }
                    if (this.f6352M.isRunning()) {
                        this.f6352M.end();
                    }
                    this.f6352M.start();
                    invalidate();
                    break;
                case 1:
                    this.f6375q = false;
                    m4631a(motionEvent);
                    break;
                case 3:
                    this.f6375q = false;
                    m4631a(motionEvent);
                    break;
            }
        } else {
            this.f6375q = false;
            m4631a(motionEvent);
        }
        return true;
    }
}
