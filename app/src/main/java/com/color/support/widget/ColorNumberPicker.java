package com.color.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1338c;
import com.color.support.util.C1345j;
import com.color.support.util.C1348m;
import com.coloros.neton.BuildConfig;
import java.util.Locale;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class ColorNumberPicker extends LinearLayout {

    /* renamed from: A */
    private int f6265A;

    /* renamed from: B */
    private int f6266B;

    /* renamed from: C */
    private RunnableC1419cg f6267C;

    /* renamed from: D */
    private float f6268D;

    /* renamed from: E */
    private long f6269E;

    /* renamed from: F */
    private float f6270F;

    /* renamed from: G */
    private VelocityTracker f6271G;

    /* renamed from: H */
    private int f6272H;

    /* renamed from: I */
    private int f6273I;

    /* renamed from: J */
    private int f6274J;

    /* renamed from: K */
    private int f6275K;

    /* renamed from: L */
    private boolean f6276L;

    /* renamed from: M */
    private int f6277M;

    /* renamed from: N */
    private int f6278N;

    /* renamed from: O */
    private int f6279O;

    /* renamed from: P */
    private boolean f6280P;

    /* renamed from: Q */
    private boolean f6281Q;

    /* renamed from: R */
    private C1418cf f6282R;

    /* renamed from: S */
    private int f6283S;

    /* renamed from: T */
    private AccessibilityManager f6284T;

    /* renamed from: U */
    private C1345j f6285U;

    /* renamed from: V */
    private HandlerThread f6286V;

    /* renamed from: W */
    private Handler f6287W;

    /* renamed from: a */
    private final int f6288a;

    /* renamed from: aa */
    private int f6289aa;

    /* renamed from: ab */
    private int f6290ab;

    /* renamed from: ac */
    private int f6291ac;

    /* renamed from: ad */
    private int f6292ad;

    /* renamed from: ae */
    private int f6293ae;

    /* renamed from: af */
    private int f6294af;

    /* renamed from: ag */
    private int f6295ag;

    /* renamed from: ah */
    private int f6296ah;

    /* renamed from: ai */
    private int f6297ai;

    /* renamed from: aj */
    private int f6298aj;

    /* renamed from: ak */
    private int f6299ak;

    /* renamed from: al */
    private int f6300al;

    /* renamed from: am */
    private int f6301am;

    /* renamed from: an */
    private int f6302an;

    /* renamed from: ao */
    private int f6303ao;

    /* renamed from: ap */
    private int f6304ap;

    /* renamed from: aq */
    private int f6305aq;

    /* renamed from: ar */
    private int f6306ar;

    /* renamed from: as */
    private float f6307as;

    /* renamed from: at */
    private float f6308at;

    /* renamed from: au */
    private String f6309au;

    /* renamed from: av */
    private boolean f6310av;

    /* renamed from: aw */
    private boolean f6311aw;

    /* renamed from: ax */
    private float f6312ax;

    /* renamed from: ay */
    private float f6313ay;

    /* renamed from: az */
    private float f6314az;

    /* renamed from: b */
    private final int f6315b;

    /* renamed from: c */
    private final int f6316c;

    /* renamed from: d */
    private final int f6317d;

    /* renamed from: e */
    private final SparseArray<String> f6318e;

    /* renamed from: f */
    private final Paint f6319f;

    /* renamed from: g */
    private final Paint f6320g;

    /* renamed from: h */
    private final Scroller f6321h;

    /* renamed from: i */
    private final Scroller f6322i;

    /* renamed from: j */
    private final RunnableC1423ck f6323j;

    /* renamed from: k */
    private int f6324k;

    /* renamed from: l */
    private int f6325l;

    /* renamed from: m */
    private String[] f6326m;

    /* renamed from: n */
    private int f6327n;

    /* renamed from: o */
    private int f6328o;

    /* renamed from: p */
    private int f6329p;

    /* renamed from: q */
    private InterfaceC1422cj f6330q;

    /* renamed from: r */
    private InterfaceC1421ci f6331r;

    /* renamed from: s */
    private C1425cm f6332s;

    /* renamed from: t */
    private boolean f6333t;

    /* renamed from: u */
    private boolean f6334u;

    /* renamed from: v */
    private InterfaceC1420ch f6335v;

    /* renamed from: w */
    private long f6336w;

    /* renamed from: x */
    private int[] f6337x;

    /* renamed from: y */
    private int f6338y;

    /* renamed from: z */
    private int f6339z;

    /* renamed from: a */
    private static int m4591a(int i, int i2, float f) {
        return i2 - ((int) (((i2 - i) * 2) * f));
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public ColorNumberPicker(Context context) {
        this(context, null);
    }

    public ColorNumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorNumberPickerStyle);
    }

    public ColorNumberPicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ColorNumberPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6318e = new SparseArray<>();
        this.f6333t = true;
        this.f6336w = 300L;
        this.f6339z = RecyclerView.UNDEFINED_DURATION;
        this.f6275K = 0;
        this.f6283S = -1;
        C1338c.m4375a(this, false);
        context.setTheme(R.style.ColorNumberPicker);
        this.f6284T = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f6285U = C1345j.m4401a();
        this.f6291ac = this.f6285U.m4402a(context, R.raw.color_numberpicker_click);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorNumberPicker, i, 0);
        this.f6289aa = obtainStyledAttributes.getInteger(R.styleable.ColorNumberPicker_colorPickerRowNumber, 5);
        this.f6290ab = this.f6289aa / 2;
        this.f6337x = new int[this.f6289aa];
        this.f6288a = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorNumberPicker_internalMinHeight, -1);
        this.f6315b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorNumberPicker_internalMaxHeight, -1);
        if (this.f6288a != -1 && this.f6315b != -1 && this.f6288a > this.f6315b) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.f6316c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorNumberPicker_internalMinWidth, -1);
        this.f6324k = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorNumberPicker_internalMaxWidth, -1);
        if (this.f6316c != -1 && this.f6324k != -1 && this.f6316c > this.f6324k) {
            throw new IllegalArgumentException("minWidth > maxWidth");
        }
        this.f6303ao = obtainStyledAttributes.getInteger(R.styleable.ColorNumberPicker_colorPickerAlignPosition, -1);
        this.f6304ap = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorNumberPicker_focusTextSize, -1);
        this.f6317d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorNumberPicker_startTextSize, -1);
        this.f6302an = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorNumberPicker_colorPickerVisualWidth, -1);
        this.f6305aq = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorNumberPicker_colorNOPickerPaddingLeft, 0);
        this.f6306ar = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorNumberPicker_colorNOPickerPaddingRight, 0);
        int color2 = obtainStyledAttributes.getColor(R.styleable.ColorNumberPicker_colorNormalTextColor, -1);
        int color3 = obtainStyledAttributes.getColor(R.styleable.ColorNumberPicker_colorFocusTextColor, -1);
        this.f6294af = Color.alpha(color2);
        this.f6298aj = Color.alpha(color3);
        this.f6295ag = Color.red(color2);
        this.f6299ak = Color.red(color3);
        this.f6296ah = Color.green(color2);
        this.f6300al = Color.green(color3);
        this.f6297ai = Color.blue(color2);
        this.f6301am = Color.blue(color3);
        obtainStyledAttributes.recycle();
        this.f6312ax = getResources().getDimension(R.dimen.color_numberpicker_ignore_bar_width);
        this.f6313ay = getResources().getDimension(R.dimen.color_numberpicker_ignore_bar_height);
        this.f6314az = getResources().getDimension(R.dimen.color_numberpicker_ignore_bar_spacing);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6272H = viewConfiguration.getScaledTouchSlop();
        this.f6273I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6274J = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint = new Paint();
        paint.setTextSize(this.f6317d);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        paint.setTypeface(Typeface.create("sys-sans-en", 0));
        this.f6307as = fontMetrics.top;
        this.f6308at = fontMetrics.bottom;
        this.f6319f = paint;
        this.f6320g = paint;
        this.f6320g.setTextSize(getResources().getDimensionPixelSize(R.dimen.oppo_numberpicker_textSize_big));
        this.f6321h = new Scroller(getContext(), null, true);
        this.f6322i = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f6323j = new RunnableC1423ck(this);
        setWillNotDraw(false);
        setVerticalScrollBarEnabled(false);
    }

    /* renamed from: a */
    private static String m4593a(int i) {
        return String.format(Locale.getDefault(), "%d", Integer.valueOf(i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(m4590a(i, this.f6324k), m4590a(i2, this.f6315b));
        setMeasuredDimension(m4592a(this.f6316c, getMeasuredWidth(), i) + ((this.f6306ar + this.f6305aq) * 2), m4592a(this.f6288a, getMeasuredHeight(), i2));
    }

    /* renamed from: a */
    private boolean m4597a(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i = this.f6339z - ((this.f6265A + finalY) % this.f6338y);
        if (i == 0) {
            return false;
        }
        if (Math.abs(i) > this.f6338y / 2) {
            if (i > 0) {
                i -= this.f6338y;
            } else {
                i += this.f6338y;
            }
        }
        scrollBy(0, finalY + i);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        m4610d();
        float y = motionEvent.getY();
        this.f6268D = y;
        this.f6270F = y;
        this.f6269E = motionEvent.getEventTime();
        this.f6276L = false;
        if (this.f6268D < this.f6277M) {
            if (this.f6275K == 0) {
                this.f6323j.m4954a(2);
            }
        } else if (this.f6268D > this.f6278N && this.f6275K == 0) {
            this.f6323j.m4954a(1);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.f6321h.isFinished()) {
            this.f6321h.forceFinished(true);
            this.f6322i.forceFinished(true);
            m4602b(0);
        } else if (!this.f6322i.isFinished()) {
            this.f6321h.forceFinished(true);
            this.f6322i.forceFinished(true);
        } else if (this.f6268D < this.f6277M) {
            m4596a(false, ViewConfiguration.getLongPressTimeout());
        } else if (this.f6268D > this.f6278N) {
            m4596a(true, ViewConfiguration.getLongPressTimeout());
        } else {
            this.f6276L = true;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f6271G == null) {
            this.f6271G = VelocityTracker.obtain();
        }
        this.f6271G.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 1:
                if (this.f6267C != null) {
                    removeCallbacks(this.f6267C);
                }
                this.f6323j.m4953a();
                VelocityTracker velocityTracker = this.f6271G;
                velocityTracker.computeCurrentVelocity(1000, this.f6274J);
                int yVelocity = (int) velocityTracker.getYVelocity();
                if (Math.abs(yVelocity) <= this.f6273I) {
                    int y = (int) motionEvent.getY();
                    int abs = (int) Math.abs(y - this.f6268D);
                    long eventTime = motionEvent.getEventTime() - this.f6269E;
                    if (abs <= this.f6272H && eventTime < ViewConfiguration.getTapTimeout()) {
                        if (this.f6276L) {
                            this.f6276L = false;
                            performClick();
                        } else {
                            int i = (y / this.f6338y) - this.f6290ab;
                            if (i > 0) {
                                m4595a(true);
                                this.f6323j.m4955b(1);
                            } else if (i < 0) {
                                m4595a(false);
                                this.f6323j.m4955b(2);
                            }
                            m4613e();
                        }
                    } else {
                        m4613e();
                    }
                    m4602b(0);
                } else {
                    int i2 = yVelocity * 2;
                    this.f6266B = 0;
                    if (i2 > 0) {
                        this.f6321h.fling(0, 0, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
                    } else {
                        this.f6321h.fling(0, Integer.MAX_VALUE, 0, i2, 0, 0, 0, Integer.MAX_VALUE);
                    }
                    invalidate();
                    m4602b(2);
                }
                this.f6271G.recycle();
                this.f6271G = null;
                break;
            case 2:
                float y2 = motionEvent.getY();
                if (this.f6275K != 1) {
                    if (((int) Math.abs(y2 - this.f6268D)) > this.f6272H) {
                        m4610d();
                        m4602b(1);
                    }
                } else {
                    scrollBy(0, (int) (y2 - this.f6270F));
                    invalidate();
                }
                this.f6270F = y2;
                break;
            case 3:
                m4613e();
                break;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m4610d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 23 || keyCode == 66) {
            m4610d();
        } else {
            switch (keyCode) {
                case 19:
                case 20:
                    switch (keyEvent.getAction()) {
                        case 0:
                            if (this.f6334u || (keyCode != 20 ? getValue() > getMinValue() : getValue() < getMaxValue())) {
                                requestFocus();
                                this.f6283S = keyCode;
                                m4610d();
                                if (this.f6321h.isFinished()) {
                                    m4595a(keyCode == 20);
                                }
                                return true;
                            }
                        case 1:
                            if (this.f6283S == keyCode) {
                                this.f6283S = -1;
                                return true;
                            }
                            break;
                    }
                    break;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m4610d();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.ViewGroup, android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f6284T.isEnabled()) {
            int actionMasked = motionEvent.getActionMasked();
            C1418cf c1418cf = (C1418cf) getAccessibilityNodeProvider();
            if (actionMasked != 7) {
                switch (actionMasked) {
                    case 9:
                        c1418cf.m4950a(0, 128);
                        this.f6279O = 0;
                        c1418cf.performAction(0, 64, null);
                        break;
                    case 10:
                        c1418cf.m4950a(0, 256);
                        this.f6279O = -1;
                        break;
                }
            } else if (this.f6279O != 0 && this.f6279O != -1) {
                c1418cf.m4950a(this.f6279O, 256);
                c1418cf.m4950a(0, 128);
                this.f6279O = 0;
                c1418cf.performAction(0, 64, null);
            }
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.f6321h;
        if (scroller.isFinished()) {
            scroller = this.f6322i;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.f6266B == 0) {
            this.f6266B = scroller.getStartY();
        }
        scrollBy(0, currY - this.f6266B);
        this.f6266B = currY;
        if (!scroller.isFinished()) {
            invalidate();
        } else if (scroller == this.f6321h) {
            m4613e();
            m4602b(0);
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        int[] iArr = this.f6337x;
        int i3 = this.f6265A;
        if (!this.f6334u && i2 > 0 && iArr[this.f6290ab] <= this.f6327n) {
            this.f6265A = this.f6339z;
            return;
        }
        if (!this.f6334u && i2 < 0 && iArr[this.f6290ab] >= this.f6328o) {
            this.f6265A = this.f6339z;
            return;
        }
        this.f6265A += i2;
        while (this.f6265A - this.f6339z > this.f6325l) {
            this.f6265A -= this.f6338y;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr[i4] = m4600b(iArr[i4], -1);
            }
            m4605c(iArr[0]);
            m4594a(iArr[this.f6290ab], true);
            if (!this.f6334u && iArr[this.f6290ab] <= this.f6327n) {
                this.f6265A = this.f6339z;
            }
        }
        while (this.f6265A - this.f6339z < (-this.f6325l)) {
            this.f6265A += this.f6338y;
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr[i5] = m4600b(iArr[i5], 1);
            }
            m4605c(iArr[iArr.length - 1]);
            m4594a(iArr[this.f6290ab], true);
            if (!this.f6334u && iArr[this.f6290ab] >= this.f6328o) {
                this.f6265A = this.f6339z;
            }
        }
        if (i3 != this.f6265A) {
            onScrollChanged(0, this.f6265A, 0, i3);
        }
    }

    @Override // android.view.View
    protected int computeVerticalScrollOffset() {
        return this.f6265A;
    }

    @Override // android.view.View
    protected int computeVerticalScrollRange() {
        return ((this.f6328o - this.f6327n) + 1) * this.f6338y;
    }

    @Override // android.view.View
    protected int computeVerticalScrollExtent() {
        return getHeight();
    }

    public void setOnValueChangedListener(InterfaceC1422cj interfaceC1422cj) {
        this.f6330q = interfaceC1422cj;
    }

    public void setOnScrollListener(InterfaceC1421ci interfaceC1421ci) {
        this.f6331r = interfaceC1421ci;
    }

    public void setFormatter(InterfaceC1420ch interfaceC1420ch) {
        if (interfaceC1420ch == this.f6335v) {
            return;
        }
        this.f6335v = interfaceC1420ch;
        m4604c();
    }

    /* renamed from: a */
    public final void m4620a() {
        if (this.f6332s == null) {
            this.f6332s = new C1425cm(this);
        }
        this.f6335v = this.f6332s;
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.f6336w = j;
    }

    public int getValue() {
        return this.f6329p;
    }

    public void setValue(int i) {
        m4594a(i, false);
    }

    public int getMinValue() {
        return this.f6327n;
    }

    public void setMinValue(int i) {
        if (this.f6327n == i) {
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.f6327n = i;
        if (this.f6327n > this.f6329p) {
            this.f6329p = this.f6327n;
        }
        m4604c();
        invalidate();
    }

    public boolean getWrapSelectorWheel() {
        return this.f6334u;
    }

    public void setWrapSelectorWheel(boolean z) {
        this.f6333t = z;
        boolean z2 = false;
        if ((this.f6328o - this.f6327n >= this.f6337x.length) && this.f6333t) {
            z2 = true;
        }
        this.f6334u = z2;
    }

    public int getMaxValue() {
        return this.f6328o;
    }

    public void setMaxValue(int i) {
        if (this.f6328o == i) {
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.f6328o = i;
        if (this.f6328o < this.f6329p) {
            this.f6329p = this.f6328o;
        }
        m4604c();
        invalidate();
    }

    public String[] getDisplayedValues() {
        return this.f6326m;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.f6326m == strArr) {
            return;
        }
        this.f6326m = strArr;
        m4604c();
    }

    public void setPickerRowNumber(int i) {
        this.f6289aa = i;
        this.f6290ab = i / 2;
        this.f6337x = new int[this.f6289aa];
    }

    public void setAlignPosition(int i) {
        this.f6303ao = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6286V = new HandlerThread("touchEffect", -16);
        this.f6286V.start();
        this.f6287W = new HandlerC1424cl(this, this.f6286V.getLooper());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4610d();
        if (this.f6286V != null) {
            this.f6286V.quit();
            this.f6286V = null;
        }
        if (this.f6287W != null) {
            this.f6287W.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        float f2;
        int i6;
        float right = (getRight() - getLeft()) / 2;
        int i7 = this.f6265A;
        if (this.f6302an != -1 && this.f6302an < getRight() - getLeft()) {
            switch (this.f6303ao) {
                case 1:
                    right = this.f6302an / 2;
                    break;
                case 2:
                    right = ((getRight() - getLeft()) - this.f6302an) + (this.f6302an / 2);
                    break;
            }
        }
        if (this.f6305aq != 0) {
            right += this.f6305aq;
        }
        if (this.f6306ar != 0) {
            right -= this.f6306ar;
        }
        int[] iArr = this.f6337x;
        int i8 = 0;
        while (i8 < iArr.length) {
            int i9 = iArr[i8];
            if (i7 <= this.f6292ad || i7 >= this.f6293ae) {
                i = this.f6294af;
                i2 = this.f6295ag;
                i3 = this.f6296ah;
                i4 = this.f6297ai;
            } else {
                float abs = Math.abs((i7 - this.f6339z) - (this.f6290ab * this.f6338y)) / this.f6338y;
                i = m4591a(this.f6294af, this.f6298aj, abs);
                i2 = m4591a(this.f6295ag, this.f6299ak, abs);
                i3 = m4591a(this.f6296ah, this.f6300al, abs);
                i4 = m4591a(this.f6297ai, this.f6301am, abs);
            }
            int argb = Color.argb(i, i2, i3, i4);
            int i10 = this.f6317d;
            int i11 = this.f6304ap;
            int i12 = this.f6317d;
            int i13 = this.f6317d;
            int i14 = this.f6339z + (this.f6290ab * this.f6338y);
            int i15 = this.f6339z;
            int length = this.f6339z + ((this.f6337x.length - 1) * this.f6338y);
            double d = i7;
            int[] iArr2 = iArr;
            int i16 = i8;
            double d2 = i14;
            float f3 = right;
            if (d > d2 - (this.f6338y * 0.5d) && d < d2 + (this.f6338y * 0.5d)) {
                f = i11 - ((((i11 - i10) * 2.0f) * Math.abs(i7 - i14)) / this.f6338y);
            } else if (i7 <= i14 - this.f6338y) {
                f = i12 + (((((i13 - i12) * 1.0f) * (i7 - i15)) / this.f6338y) / 2.0f);
            } else {
                f = i7 >= i14 + this.f6338y ? i12 + (((((i13 - i12) * 1.0f) * (length - i7)) / this.f6338y) / 2.0f) : i13;
            }
            this.f6319f.setColor(argb);
            String str = this.f6318e.get(i9);
            if (!this.f6311aw) {
                this.f6319f.setTextSize(f);
                if (this.f6320g.measureText(str) >= getMeasuredWidth()) {
                    this.f6319f.setTextSize(this.f6317d);
                    this.f6311aw = true;
                }
            }
            if (i9 != Integer.MIN_VALUE) {
                i5 = i16;
                if (i5 == this.f6290ab) {
                    Paint.FontMetrics fontMetrics = this.f6319f.getFontMetrics();
                    i6 = ((int) ((((i7 + i7) + this.f6338y) - fontMetrics.top) - fontMetrics.bottom)) / 2;
                } else {
                    i6 = ((int) ((((i7 + i7) + this.f6338y) - this.f6307as) - this.f6308at)) / 2;
                }
                f2 = f3;
                canvas.drawText(str, f2, i6, this.f6319f);
            } else {
                i5 = i16;
                f2 = f3;
                float f4 = f / this.f6304ap;
                float f5 = 1.0f;
                for (float f6 = -0.5f; f6 < f5; f6 += 1.0f) {
                    float f7 = ((this.f6312ax + this.f6314az) * f6 * f4) + f2;
                    float f8 = (this.f6312ax * f4) / 2.0f;
                    float f9 = i7;
                    float f10 = (this.f6313ay * f4) / 2.0f;
                    canvas.drawRect(f7 - f8, ((this.f6338y / 2.0f) + f9) - f10, f7 + f8, f9 + (this.f6338y / 2.0f) + f10, this.f6319f);
                    f5 = 1.0f;
                }
            }
            i7 += this.f6338y;
            i8 = i5 + 1;
            right = f2;
            iArr = iArr2;
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.f6282R == null) {
            this.f6282R = new C1418cf(this);
        }
        return this.f6282R;
    }

    public float getTextSize() {
        return this.f6319f.getTextSize();
    }

    /* renamed from: a */
    private static int m4590a(int i, int i2) {
        if (i2 == -1) {
            return i;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        if (mode == 1073741824) {
            return i;
        }
        throw new IllegalArgumentException("Unknown measure mode: ".concat(String.valueOf(mode)));
    }

    /* renamed from: a */
    private static int m4592a(int i, int i2, int i3) {
        return i != -1 ? resolveSizeAndState(Math.max(i, i2), i3, 0) : i2;
    }

    /* renamed from: c */
    private void m4604c() {
        this.f6318e.clear();
        int[] iArr = this.f6337x;
        int value = getValue();
        for (int i = 0; i < this.f6337x.length; i++) {
            int i2 = i - this.f6290ab;
            int m4600b = this.f6310av ? m4600b(value, i2) : i2 + value;
            if (this.f6334u) {
                m4600b = m4600b(m4600b, 0);
            }
            iArr[i] = m4600b;
            m4605c(iArr[i]);
        }
    }

    /* renamed from: a */
    private void m4594a(int i, boolean z) {
        int min;
        if (this.f6329p == i) {
            m4604c();
            return;
        }
        if (!this.f6334u) {
            min = Math.min(Math.max(i, this.f6327n), this.f6328o);
        } else {
            min = m4600b(i, 0);
        }
        int i2 = this.f6329p;
        this.f6329p = min;
        if (z) {
            m4612e(i2);
            this.f6287W.removeMessages(0);
            this.f6287W.sendEmptyMessage(0);
            if (this.f6284T != null && this.f6284T.isEnabled()) {
                Message message = new Message();
                message.what = 1;
                message.obj = Integer.valueOf(min);
                this.f6287W.sendMessage(message);
            }
        }
        m4604c();
        invalidate();
    }

    /* renamed from: a */
    public final void m4621a(String str) {
        this.f6309au = str;
    }

    /* renamed from: a */
    public void m4595a(boolean z) {
        if (!m4597a(this.f6321h)) {
            m4597a(this.f6322i);
        }
        this.f6266B = 0;
        if (z) {
            this.f6321h.startScroll(0, 0, 0, -this.f6338y, ResponseCode.CODE_3XX_MULTIPLE_CHOICES);
        } else {
            this.f6321h.startScroll(0, 0, 0, this.f6338y, ResponseCode.CODE_3XX_MULTIPLE_CHOICES);
        }
        invalidate();
    }

    /* renamed from: b */
    private void m4602b(int i) {
        if (this.f6275K == i) {
            return;
        }
        this.f6275K = i;
    }

    /* renamed from: b */
    private int m4600b(int i, int i2) {
        if (this.f6328o - this.f6327n <= 0) {
            return -1;
        }
        if (i == Integer.MIN_VALUE) {
            i = this.f6327n - 1;
        }
        int m4406a = C1348m.m4406a((i - this.f6327n) + i2, (this.f6328o - this.f6327n) + 1 + (this.f6310av ? 1 : 0));
        return m4406a < (this.f6328o - this.f6327n) + 1 ? this.f6327n + m4406a : RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: c */
    private void m4605c(int i) {
        String str;
        SparseArray<String> sparseArray = this.f6318e;
        if (sparseArray.get(i) != null) {
            return;
        }
        if (i < this.f6327n || i > this.f6328o) {
            str = BuildConfig.FLAVOR;
        } else if (this.f6326m != null) {
            str = this.f6326m[i - this.f6327n];
        } else {
            str = m4609d(i);
        }
        sparseArray.put(i, str);
    }

    /* renamed from: d */
    private String m4609d(int i) {
        return this.f6335v != null ? this.f6335v.mo4952a(i) : m4593a(i);
    }

    /* renamed from: e */
    private void m4612e(int i) {
        if (this.f6330q != null) {
            this.f6330q.mo4924a(this, i, this.f6329p);
        }
    }

    /* renamed from: a */
    private void m4596a(boolean z, long j) {
        if (this.f6267C == null) {
            this.f6267C = new RunnableC1419cg(this);
        } else {
            removeCallbacks(this.f6267C);
        }
        this.f6267C.f7025b = z;
        postDelayed(this.f6267C, j);
    }

    /* renamed from: d */
    private void m4610d() {
        if (this.f6267C != null) {
            removeCallbacks(this.f6267C);
        }
        this.f6323j.m4953a();
    }

    /* renamed from: e */
    private boolean m4613e() {
        int i = this.f6339z - this.f6265A;
        if (i == 0) {
            return false;
        }
        this.f6266B = 0;
        if (Math.abs(i) > this.f6338y / 2) {
            i += i > 0 ? -this.f6338y : this.f6338y;
        }
        this.f6322i.startScroll(0, 0, 0, i, 800);
        invalidate();
        return true;
    }

    public void setPickerNormalColor(int i) {
        this.f6294af = Color.alpha(i);
        this.f6295ag = Color.red(i);
        this.f6296ah = Color.green(i);
        this.f6297ai = Color.green(i);
    }

    public void setPickerFocusColor(int i) {
        this.f6298aj = Color.alpha(i);
        this.f6299ak = Color.red(i);
        this.f6300al = Color.green(i);
        this.f6301am = Color.green(i);
    }

    /* renamed from: b */
    public final boolean m4622b() {
        return this.f6284T != null && this.f6284T.isEnabled();
    }

    public void setIgnorable(boolean z) {
        if (this.f6310av == z) {
            return;
        }
        this.f6310av = z;
        m4604c();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            m4604c();
            int[] iArr = this.f6337x;
            this.f6325l = (int) ((((getBottom() - getTop()) - (iArr.length * this.f6317d)) / iArr.length) + 0.5f);
            this.f6338y = this.f6317d + this.f6325l;
            this.f6339z = 0;
            this.f6265A = 0;
            this.f6277M = (getHeight() / 2) - (this.f6338y / 2);
            this.f6278N = (getHeight() / 2) + (this.f6338y / 2);
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - this.f6317d) / 2);
        }
        this.f6292ad = (int) (this.f6339z + (this.f6338y * (this.f6290ab - 0.5d)));
        this.f6293ae = (int) (this.f6339z + (this.f6338y * (this.f6290ab + 0.5d)));
    }
}
