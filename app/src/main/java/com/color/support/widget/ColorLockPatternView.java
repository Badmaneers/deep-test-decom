package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.p024g.C0538w;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1338c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class ColorLockPatternView extends View {

    /* renamed from: A */
    private int f6194A;

    /* renamed from: B */
    private int f6195B;

    /* renamed from: C */
    private int f6196C;

    /* renamed from: D */
    private final Interpolator f6197D;

    /* renamed from: E */
    private C1408bw f6198E;

    /* renamed from: F */
    private boolean f6199F;

    /* renamed from: G */
    private Drawable f6200G;

    /* renamed from: H */
    private Drawable f6201H;

    /* renamed from: I */
    private ValueAnimator f6202I;

    /* renamed from: J */
    private boolean f6203J;

    /* renamed from: K */
    private Context f6204K;

    /* renamed from: L */
    private AccessibilityManager f6205L;

    /* renamed from: M */
    private AnimatorListenerAdapter f6206M;

    /* renamed from: a */
    private final C1405bt[][] f6207a;

    /* renamed from: b */
    private final int f6208b;

    /* renamed from: c */
    private float f6209c;

    /* renamed from: d */
    private boolean f6210d;

    /* renamed from: e */
    private final Paint f6211e;

    /* renamed from: f */
    private final Paint f6212f;

    /* renamed from: g */
    private InterfaceC1407bv f6213g;

    /* renamed from: h */
    private final ArrayList<C1404bs> f6214h;

    /* renamed from: i */
    private final boolean[][] f6215i;

    /* renamed from: j */
    private float f6216j;

    /* renamed from: k */
    private float f6217k;

    /* renamed from: l */
    private long f6218l;

    /* renamed from: m */
    private EnumC1406bu f6219m;

    /* renamed from: n */
    private boolean f6220n;

    /* renamed from: o */
    private boolean f6221o;

    /* renamed from: p */
    private boolean f6222p;

    /* renamed from: q */
    private boolean f6223q;

    /* renamed from: r */
    private float f6224r;

    /* renamed from: s */
    private float f6225s;

    /* renamed from: t */
    private float f6226t;

    /* renamed from: u */
    private final float f6227u;

    /* renamed from: v */
    private final Path f6228v;

    /* renamed from: w */
    private final Rect f6229w;

    /* renamed from: x */
    private final Rect f6230x;

    /* renamed from: y */
    private int f6231y;

    /* renamed from: z */
    private int f6232z;

    public ColorLockPatternView(Context context) {
        this(context, null);
    }

    public ColorLockPatternView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6209c = 1.0f;
        this.f6210d = false;
        this.f6211e = new Paint();
        this.f6212f = new Paint();
        this.f6214h = new ArrayList<>(9);
        this.f6215i = (boolean[][]) Array.newInstance((Class<?>) boolean.class, 3, 3);
        this.f6216j = -1.0f;
        this.f6217k = -1.0f;
        this.f6219m = EnumC1406bu.Correct;
        this.f6220n = true;
        this.f6221o = false;
        this.f6222p = true;
        this.f6223q = false;
        this.f6224r = 0.6f;
        this.f6228v = new Path();
        this.f6229w = new Rect();
        this.f6230x = new Rect();
        this.f6199F = false;
        this.f6206M = new C1398bm(this);
        C1338c.m4375a(this, false);
        this.f6204K = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorLockPatternView, R.attr.colorLockPatternViewStyle, 0);
        setClickable(true);
        this.f6212f.setAntiAlias(true);
        this.f6212f.setDither(true);
        this.f6231y = obtainStyledAttributes.getColor(R.styleable.ColorLockPatternView_colorRegularColor, 0);
        this.f6232z = obtainStyledAttributes.getColor(R.styleable.ColorLockPatternView_colorErrorColor, 0);
        this.f6194A = obtainStyledAttributes.getColor(R.styleable.ColorLockPatternView_colorSuccessColor, 0);
        this.f6212f.setColor(obtainStyledAttributes.getColor(R.styleable.ColorLockPatternView_colorPathColor, this.f6231y));
        this.f6212f.setStyle(Paint.Style.STROKE);
        this.f6212f.setStrokeJoin(Paint.Join.ROUND);
        this.f6212f.setStrokeCap(Paint.Cap.ROUND);
        this.f6208b = getResources().getDimensionPixelSize(R.dimen.lock_pattern_dot_line_width);
        this.f6212f.setStrokeWidth(this.f6208b);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.lock_pattern_dot_size);
        this.f6211e.setAntiAlias(true);
        this.f6211e.setDither(true);
        this.f6207a = (C1405bt[][]) Array.newInstance((Class<?>) C1405bt.class, 3, 3);
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.f6207a[i][i2] = new C1405bt();
                this.f6207a[i][i2].f6983d = dimensionPixelSize / 2;
                this.f6207a[i][i2].f6980a = i;
                this.f6207a[i][i2].f6981b = i2;
                this.f6207a[i][i2].f6984e = 0.4f;
                this.f6207a[i][i2].f6990k = 0.0f;
                this.f6207a[i][i2].f6988i = 1.0f;
                this.f6207a[i][i2].f6991l = 0.0f;
                this.f6207a[i][i2].f6989j = 1.0f;
                this.f6207a[i][i2].f6992m = true;
            }
        }
        this.f6200G = getResources().getDrawable(R.drawable.color_lock_pattern_inner_circle);
        this.f6201H = getResources().getDrawable(R.drawable.color_lock_pattern_outer_circle);
        this.f6195B = getResources().getDimensionPixelSize(R.dimen.oppo_lock_pattern_view_width);
        this.f6196C = getResources().getDimensionPixelSize(R.dimen.oppo_lock_pattern_view_height);
        this.f6227u = obtainStyledAttributes.getFloat(R.styleable.ColorLockPatternView_colorOuterCircleMaxAlpha, 0.0f);
        this.f6197D = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_slow_in);
        this.f6198E = new C1408bw(this, this);
        C0538w.m1849a(this, this.f6198E);
        this.f6205L = (AccessibilityManager) this.f6204K.getSystemService("accessibility");
        obtainStyledAttributes.recycle();
        this.f6203J = context.getPackageManager().hasSystemFeature("oppo.feature.vibrator.waveform.support");
    }

    public C1405bt[][] getCellStates() {
        return this.f6207a;
    }

    public void setInStealthMode(boolean z) {
        this.f6221o = z;
    }

    public void setTactileFeedbackEnabled(boolean z) {
        this.f6222p = z;
    }

    public void setOnPatternListener(InterfaceC1407bv interfaceC1407bv) {
        this.f6213g = interfaceC1407bv;
    }

    /* renamed from: a */
    private void m4542a(EnumC1406bu enumC1406bu, List<C1404bs> list) {
        this.f6214h.clear();
        this.f6214h.addAll(list);
        m4547b();
        for (C1404bs c1404bs : list) {
            this.f6215i[c1404bs.m4920a()][c1404bs.m4921b()] = true;
        }
        setDisplayMode(enumC1406bu);
    }

    public void setDisplayMode(EnumC1406bu enumC1406bu) {
        this.f6219m = enumC1406bu;
        if (enumC1406bu == EnumC1406bu.Animate) {
            if (this.f6214h.size() == 0) {
                throw new IllegalStateException("you must have a pattern to animate if you want to set the display mode to animate");
            }
            this.f6218l = SystemClock.elapsedRealtime();
            C1404bs c1404bs = this.f6214h.get(0);
            this.f6216j = m4543b(c1404bs.m4921b());
            this.f6217k = m4551c(c1404bs.m4920a());
            m4547b();
        }
        if (enumC1406bu == EnumC1406bu.Wrong) {
            if (this.f6214h.size() > 1 && this.f6222p) {
                if (this.f6203J) {
                    performHapticFeedback(ResponseCode.CODE_3XX_NOT_MODIFIED, 3);
                } else {
                    performHapticFeedback(ResponseCode.CODE_3XX_MULTIPLE_CHOICES, 3);
                }
            }
            this.f6202I = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("pathAlpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, 0.35f), Keyframe.ofFloat(0.4f, 1.0f), Keyframe.ofFloat(0.6f, 0.15f), Keyframe.ofFloat(0.8f, 0.5f), Keyframe.ofFloat(1.0f, 0.0f)));
            this.f6202I.setDuration(1000L);
            this.f6202I.addUpdateListener(new C1396bk(this));
            this.f6202I.start();
        }
        if (enumC1406bu == EnumC1406bu.FingerprintNoMatch) {
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("pathAlpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, 0.35f), Keyframe.ofFloat(0.4f, 1.0f), Keyframe.ofFloat(0.6f, 0.15f), Keyframe.ofFloat(0.8f, 0.5f), Keyframe.ofFloat(1.0f, 0.0f)));
            ofPropertyValuesHolder.setDuration(1000L);
            ofPropertyValuesHolder.addUpdateListener(new C1397bl(this));
            ofPropertyValuesHolder.start();
        }
        invalidate();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f6198E.m2082a(motionEvent) | super.dispatchHoverEvent(motionEvent);
    }

    /* renamed from: a */
    public void m4537a() {
        this.f6214h.clear();
        m4547b();
        this.f6219m = EnumC1406bu.Correct;
        invalidate();
    }

    /* renamed from: b */
    private void m4547b() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.f6215i[i][i2] = false;
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f6225s = ((i - getPaddingLeft()) - getPaddingRight()) / 3.0f;
        this.f6226t = ((i2 - getPaddingTop()) - getPaddingBottom()) / 3.0f;
        this.f6198E.m2071a();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f6195B, this.f6196C);
    }

    /* renamed from: a */
    private void m4539a(C1404bs c1404bs) {
        this.f6215i[c1404bs.m4920a()][c1404bs.m4921b()] = true;
        this.f6214h.add(c1404bs);
        if (!this.f6221o) {
            m4548b(c1404bs);
        }
        this.f6198E.m2071a();
    }

    /* renamed from: b */
    private void m4548b(C1404bs c1404bs) {
        int i;
        int i2;
        int i3;
        int i4;
        C1405bt[][] c1405btArr = this.f6207a;
        i = c1404bs.f6978b;
        C1405bt[] c1405btArr2 = c1405btArr[i];
        i2 = c1404bs.f6979c;
        C1405bt c1405bt = c1405btArr2[i2];
        m4540a(c1405bt);
        m4549b(c1405bt);
        float f = this.f6216j;
        float f2 = this.f6217k;
        i3 = c1404bs.f6979c;
        float m4543b = m4543b(i3);
        i4 = c1404bs.f6978b;
        m4541a(c1405bt, f, f2, m4543b, m4551c(i4));
    }

    /* renamed from: a */
    private void m4541a(C1405bt c1405bt, float f, float f2, float f3, float f4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C1399bn(this, c1405bt, f, f3, f2, f4));
        ofFloat.addListener(new C1400bo(this, c1405bt));
        ofFloat.setInterpolator(this.f6197D);
        ofFloat.setDuration(100L);
        ofFloat.start();
        c1405bt.f6987h = ofFloat;
    }

    /* renamed from: a */
    private void m4540a(C1405bt c1405bt) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(460L);
        animatorSet.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.1f, 1.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 7.0f);
        ofFloat.addUpdateListener(new C1401bp(this, c1405bt));
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.5f, this.f6227u), Keyframe.ofFloat(1.0f, 0.0f)));
        ofPropertyValuesHolder.addUpdateListener(new C1402bq(this, c1405bt));
        animatorSet.play(ofFloat).with(ofPropertyValuesHolder);
        animatorSet.start();
    }

    /* renamed from: b */
    private void m4549b(C1405bt c1405bt) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new PathInterpolator(0.3f, 0.0f, 0.7f, 0.0f));
        ofFloat.setDuration(230L);
        ofFloat.addUpdateListener(new C1403br(this, c1405bt));
        ofFloat.start();
    }

    /* renamed from: a */
    public int m4534a(float f) {
        float f2 = this.f6226t;
        float f3 = this.f6224r * f2;
        float paddingTop = getPaddingTop() + ((f2 - f3) / 2.0f);
        for (int i = 0; i < 3; i++) {
            float f4 = (i * f2) + paddingTop;
            if (f >= f4 && f <= f4 + f3) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m4545b(float f) {
        float f2 = this.f6225s;
        float f3 = this.f6224r * f2;
        float paddingLeft = getPaddingLeft() + ((f2 - f3) / 2.0f);
        for (int i = 0; i < 3; i++) {
            float f4 = (i * f2) + paddingLeft;
            if (f >= f4 && f <= f4 + f3) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.f6205L.isTouchExplorationEnabled()) {
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
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (!this.f6220n || !isEnabled()) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f6202I != null && this.f6202I.isRunning()) {
                    this.f6202I.end();
                }
                this.f6209c = 1.0f;
                m4537a();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                C1404bs m4535a = m4535a(x, y);
                if (m4535a != null) {
                    setPatternInProgress(true);
                    this.f6219m = EnumC1406bu.Correct;
                    m4538a(R.string.lockscreen_access_pattern_start);
                } else if (this.f6223q) {
                    setPatternInProgress(false);
                    m4538a(R.string.lockscreen_access_pattern_cleared);
                }
                if (m4535a != null) {
                    i = m4535a.f6979c;
                    float m4543b = m4543b(i);
                    i2 = m4535a.f6978b;
                    float m4551c = m4551c(i2);
                    float f = this.f6225s / 2.0f;
                    float f2 = this.f6226t / 2.0f;
                    invalidate((int) (m4543b - f), (int) (m4551c - f2), (int) (m4543b + f), (int) (m4551c + f2));
                }
                this.f6216j = x;
                this.f6217k = y;
                return true;
            case 1:
                if (!this.f6214h.isEmpty()) {
                    setPatternInProgress(false);
                    for (int i8 = 0; i8 < 3; i8++) {
                        for (int i9 = 0; i9 < 3; i9++) {
                            C1405bt c1405bt = this.f6207a[i8][i9];
                            if (c1405bt.f6987h != null) {
                                c1405bt.f6987h.cancel();
                                c1405bt.f6985f = Float.MIN_VALUE;
                                c1405bt.f6986g = Float.MIN_VALUE;
                            }
                        }
                    }
                    m4538a(R.string.lockscreen_access_pattern_detected);
                    invalidate();
                }
                return true;
            case 2:
                float f3 = this.f6208b;
                int historySize = motionEvent.getHistorySize();
                this.f6230x.setEmpty();
                boolean z = false;
                while (i7 < historySize + 1) {
                    float historicalX = i7 < historySize ? motionEvent.getHistoricalX(i7) : motionEvent.getX();
                    float historicalY = i7 < historySize ? motionEvent.getHistoricalY(i7) : motionEvent.getY();
                    C1404bs m4535a2 = m4535a(historicalX, historicalY);
                    int size = this.f6214h.size();
                    if (m4535a2 != null && size == 1) {
                        setPatternInProgress(true);
                        m4538a(R.string.lockscreen_access_pattern_start);
                    }
                    float abs = Math.abs(historicalX - this.f6216j);
                    float abs2 = Math.abs(historicalY - this.f6217k);
                    if (abs > 0.0f || abs2 > 0.0f) {
                        z = true;
                    }
                    if (this.f6223q && size > 0) {
                        C1404bs c1404bs = this.f6214h.get(size - 1);
                        i3 = c1404bs.f6979c;
                        float m4543b2 = m4543b(i3);
                        i4 = c1404bs.f6978b;
                        float m4551c2 = m4551c(i4);
                        float min = Math.min(m4543b2, historicalX) - f3;
                        float max = Math.max(m4543b2, historicalX) + f3;
                        float min2 = Math.min(m4551c2, historicalY) - f3;
                        float max2 = Math.max(m4551c2, historicalY) + f3;
                        if (m4535a2 != null) {
                            float f4 = this.f6225s * 0.5f;
                            float f5 = this.f6226t * 0.5f;
                            i5 = m4535a2.f6979c;
                            float m4543b3 = m4543b(i5);
                            i6 = m4535a2.f6978b;
                            float m4551c3 = m4551c(i6);
                            min = Math.min(m4543b3 - f4, min);
                            max = Math.max(m4543b3 + f4, max);
                            min2 = Math.min(m4551c3 - f5, min2);
                            max2 = Math.max(m4551c3 + f5, max2);
                        }
                        this.f6230x.union(Math.round(min), Math.round(min2), Math.round(max), Math.round(max2));
                    }
                    i7++;
                }
                this.f6216j = motionEvent.getX();
                this.f6217k = motionEvent.getY();
                if (z) {
                    this.f6229w.union(this.f6230x);
                    invalidate(this.f6229w);
                    this.f6229w.set(this.f6230x);
                }
                return true;
            case 3:
                if (this.f6223q) {
                    setPatternInProgress(false);
                    m4537a();
                    m4538a(R.string.lockscreen_access_pattern_cleared);
                }
                return true;
            default:
                return false;
        }
    }

    private void setPatternInProgress(boolean z) {
        this.f6223q = z;
        this.f6198E.m2071a();
    }

    /* renamed from: a */
    private void m4538a(int i) {
        announceForAccessibility(this.f6204K.getString(i));
    }

    /* renamed from: b */
    public float m4543b(int i) {
        return getPaddingLeft() + (i * this.f6225s) + (this.f6225s / 2.0f);
    }

    /* renamed from: c */
    public float m4551c(int i) {
        return getPaddingTop() + (i * this.f6226t) + (this.f6226t / 2.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        boolean[][] zArr;
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ArrayList<C1404bs> arrayList = this.f6214h;
        int size = arrayList.size();
        boolean[][] zArr2 = this.f6215i;
        if (this.f6219m == EnumC1406bu.Animate) {
            int elapsedRealtime = (((int) (SystemClock.elapsedRealtime() - this.f6218l)) % ((size + 1) * 700)) / 700;
            m4547b();
            for (int i13 = 0; i13 < elapsedRealtime; i13++) {
                C1404bs c1404bs = arrayList.get(i13);
                zArr2[c1404bs.m4920a()][c1404bs.m4921b()] = true;
            }
            if (elapsedRealtime > 0 && elapsedRealtime < size) {
                float f = (r6 % 700) / 700.0f;
                C1404bs c1404bs2 = arrayList.get(elapsedRealtime - 1);
                i9 = c1404bs2.f6979c;
                float m4543b = m4543b(i9);
                i10 = c1404bs2.f6978b;
                float m4551c = m4551c(i10);
                C1404bs c1404bs3 = arrayList.get(elapsedRealtime);
                i11 = c1404bs3.f6979c;
                float m4543b2 = (m4543b(i11) - m4543b) * f;
                i12 = c1404bs3.f6978b;
                float m4551c2 = f * (m4551c(i12) - m4551c);
                this.f6216j = m4543b + m4543b2;
                this.f6217k = m4551c + m4551c2;
            }
            invalidate();
        }
        Path path = this.f6228v;
        path.rewind();
        char c2 = 0;
        if (!this.f6221o) {
            this.f6212f.setColor(getCurrentColor$1385f2());
            this.f6212f.setAlpha((int) (this.f6209c * 255.0f));
            float f2 = 0.0f;
            float f3 = 0.0f;
            int i14 = 0;
            boolean z = false;
            while (i14 < size) {
                C1404bs c1404bs4 = arrayList.get(i14);
                i3 = c1404bs4.f6978b;
                boolean[] zArr3 = zArr2[i3];
                i4 = c1404bs4.f6979c;
                if (!zArr3[i4]) {
                    break;
                }
                i5 = c1404bs4.f6979c;
                f2 = m4543b(i5);
                i6 = c1404bs4.f6978b;
                f3 = m4551c(i6);
                if (i14 == 0) {
                    path.rewind();
                    path.moveTo(f2, f3);
                }
                if (i14 != 0) {
                    C1405bt[][] c1405btArr = this.f6207a;
                    i7 = c1404bs4.f6978b;
                    C1405bt[] c1405btArr2 = c1405btArr[i7];
                    i8 = c1404bs4.f6979c;
                    C1405bt c1405bt = c1405btArr2[i8];
                    if (c1405bt.f6985f != Float.MIN_VALUE && c1405bt.f6986g != Float.MIN_VALUE) {
                        path.lineTo(c1405bt.f6985f, c1405bt.f6986g);
                    } else {
                        path.lineTo(f2, f3);
                    }
                }
                i14++;
                z = true;
            }
            if ((this.f6223q || this.f6219m == EnumC1406bu.Animate) && z) {
                path.moveTo(f2, f3);
                path.lineTo(this.f6216j, this.f6217k);
            }
            canvas.drawPath(path, this.f6212f);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= 3) {
                return;
            }
            float m4551c3 = m4551c(i15);
            int i16 = 0;
            for (int i17 = 3; i16 < i17; i17 = 3) {
                C1405bt c1405bt2 = this.f6207a[i15][i16];
                float m4543b3 = m4543b(i16);
                float f4 = c1405bt2.f6982c;
                if (zArr2[i15][i16] || this.f6219m == EnumC1406bu.FingerprintNoMatch) {
                    float f5 = ((int) m4551c3) + f4;
                    float f6 = c1405bt2.f6988i;
                    float f7 = c1405bt2.f6990k;
                    float f8 = c1405bt2.f6989j;
                    float f9 = c1405bt2.f6991l;
                    canvas.save();
                    int intrinsicWidth = this.f6200G.getIntrinsicWidth();
                    float f10 = intrinsicWidth / 2;
                    zArr = zArr2;
                    int i18 = (int) (m4543b3 - f10);
                    int i19 = (int) (f5 - f10);
                    i = i15;
                    canvas.scale(f6, f6, m4543b3, f5);
                    i2 = i16;
                    this.f6200G.setTint(getCurrentColor$1385f2());
                    this.f6200G.setBounds(i18, i19, i18 + intrinsicWidth, intrinsicWidth + i19);
                    this.f6200G.setAlpha((int) (f7 * 255.0f));
                    this.f6200G.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    int intrinsicWidth2 = this.f6201H.getIntrinsicWidth();
                    float f11 = intrinsicWidth2 / 2;
                    int i20 = (int) (m4543b3 - f11);
                    int i21 = (int) (f5 - f11);
                    canvas.scale(f8, f8, m4543b3, f5);
                    this.f6201H.setTint(getCurrentColor$1385f2());
                    this.f6201H.setBounds(i20, i21, i20 + intrinsicWidth2, intrinsicWidth2 + i21);
                    this.f6201H.setAlpha((int) (f9 * 255.0f));
                    this.f6201H.draw(canvas);
                    canvas.restore();
                } else {
                    i = i15;
                    zArr = zArr2;
                    i2 = i16;
                }
                if (c1405bt2.f6992m) {
                    float f12 = c1405bt2.f6983d;
                    float f13 = c1405bt2.f6984e;
                    this.f6211e.setColor(this.f6231y);
                    c = 0;
                    this.f6211e.setAlpha((int) (f13 * 255.0f));
                    canvas.drawCircle((int) m4543b3, ((int) m4551c3) + f4, f12, this.f6211e);
                } else {
                    c = 0;
                }
                i16 = i2 + 1;
                c2 = c;
                zArr2 = zArr;
                i15 = i;
            }
            i15++;
        }
    }

    private int getCurrentColor$1385f2() {
        if (this.f6219m == EnumC1406bu.Wrong || this.f6219m == EnumC1406bu.FingerprintNoMatch) {
            return this.f6232z;
        }
        if (this.f6219m == EnumC1406bu.Correct || this.f6219m == EnumC1406bu.Animate || this.f6219m == EnumC1406bu.FingerprintMatch) {
            return this.f6194A;
        }
        if (this.f6221o || this.f6223q) {
            return this.f6231y;
        }
        throw new IllegalStateException("unknown display mode " + this.f6219m);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6202I != null) {
            this.f6202I.removeAllUpdateListeners();
            this.f6202I.removeAllListeners();
            this.f6202I = null;
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), C1395bj.m4915a(this.f6214h), this.f6219m.ordinal(), this.f6220n, this.f6221o, this.f6222p, (byte) 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        ArrayList arrayList;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        EnumC1406bu enumC1406bu = EnumC1406bu.Correct;
        String m4561a = savedState.m4561a();
        if (m4561a == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (byte b : m4561a.getBytes()) {
                byte b2 = (byte) (b - 49);
                arrayList2.add(C1404bs.m4917a(b2 / 3, b2 % 3));
            }
            arrayList = arrayList2;
        }
        m4542a(enumC1406bu, arrayList);
        this.f6219m = EnumC1406bu.values()[savedState.m4562b()];
        this.f6220n = savedState.m4563c();
        this.f6221o = savedState.m4564d();
        this.f6222p = savedState.m4565e();
    }

    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1410by();

        /* renamed from: a */
        private final String f6233a;

        /* renamed from: b */
        private final int f6234b;

        /* renamed from: c */
        private final boolean f6235c;

        /* renamed from: d */
        private final boolean f6236d;

        /* renamed from: e */
        private final boolean f6237e;

        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        /* synthetic */ SavedState(Parcelable parcelable, String str, int i, boolean z, boolean z2, boolean z3, byte b) {
            this(parcelable, str, i, z, z2, z3);
        }

        private SavedState(Parcelable parcelable, String str, int i, boolean z, boolean z2, boolean z3) {
            super(parcelable);
            this.f6233a = str;
            this.f6234b = i;
            this.f6235c = z;
            this.f6236d = z2;
            this.f6237e = z3;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f6233a = parcel.readString();
            this.f6234b = parcel.readInt();
            this.f6235c = ((Boolean) parcel.readValue(null)).booleanValue();
            this.f6236d = ((Boolean) parcel.readValue(null)).booleanValue();
            this.f6237e = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        /* renamed from: a */
        public final String m4561a() {
            return this.f6233a;
        }

        /* renamed from: b */
        public final int m4562b() {
            return this.f6234b;
        }

        /* renamed from: c */
        public final boolean m4563c() {
            return this.f6235c;
        }

        /* renamed from: d */
        public final boolean m4564d() {
            return this.f6236d;
        }

        /* renamed from: e */
        public final boolean m4565e() {
            return this.f6237e;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f6233a);
            parcel.writeInt(this.f6234b);
            parcel.writeValue(Boolean.valueOf(this.f6235c));
            parcel.writeValue(Boolean.valueOf(this.f6236d));
            parcel.writeValue(Boolean.valueOf(this.f6237e));
        }
    }

    public void setLockPassword(boolean z) {
        this.f6199F = z;
    }

    @Deprecated
    public Animator getFailAnimator() {
        return ValueAnimator.ofFloat(0.0f, 1.0f);
    }

    @Deprecated
    public Animator getSuccessAnimator() {
        return ValueAnimator.ofInt(255, 0);
    }

    /* renamed from: a */
    private C1404bs m4535a(float f, float f2) {
        int m4545b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int m4534a = m4534a(f2);
        C1404bs c1404bs = null;
        C1404bs m4917a = (m4534a >= 0 && (m4545b = m4545b(f)) >= 0 && !this.f6215i[m4534a][m4545b]) ? C1404bs.m4917a(m4534a, m4545b) : null;
        if (m4917a == null) {
            return null;
        }
        ArrayList<C1404bs> arrayList = this.f6214h;
        if (!arrayList.isEmpty()) {
            C1404bs c1404bs2 = arrayList.get(arrayList.size() - 1);
            i3 = m4917a.f6978b;
            i4 = c1404bs2.f6978b;
            int i11 = i3 - i4;
            i5 = m4917a.f6979c;
            i6 = c1404bs2.f6979c;
            int i12 = i5 - i6;
            i7 = c1404bs2.f6978b;
            i8 = c1404bs2.f6979c;
            if (Math.abs(i11) == 2 && Math.abs(i12) != 1) {
                i10 = c1404bs2.f6978b;
                i7 = i10 + (i11 > 0 ? 1 : -1);
            }
            if (Math.abs(i12) == 2 && Math.abs(i11) != 1) {
                i9 = c1404bs2.f6979c;
                i8 = i9 + (i12 > 0 ? 1 : -1);
            }
            c1404bs = C1404bs.m4917a(i7, i8);
        }
        if (c1404bs != null) {
            boolean[][] zArr = this.f6215i;
            i = c1404bs.f6978b;
            boolean[] zArr2 = zArr[i];
            i2 = c1404bs.f6979c;
            if (!zArr2[i2]) {
                m4539a(c1404bs);
            }
        }
        m4539a(m4917a);
        if (this.f6222p) {
            if (this.f6203J) {
                performHapticFeedback(ResponseCode.CODE_3XX_FOUND);
            } else {
                performHapticFeedback(1);
            }
        }
        return m4917a;
    }
}
