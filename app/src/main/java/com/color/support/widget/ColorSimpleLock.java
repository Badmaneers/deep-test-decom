package com.color.support.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.p024g.C0538w;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1338c;
import java.util.LinkedList;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class ColorSimpleLock extends View {

    /* renamed from: A */
    private int f6492A;

    /* renamed from: B */
    private int f6493B;

    /* renamed from: C */
    private boolean f6494C;

    /* renamed from: D */
    private ValueAnimator f6495D;

    /* renamed from: E */
    private ValueAnimator f6496E;

    /* renamed from: F */
    private Animator f6497F;

    /* renamed from: G */
    private float f6498G;

    /* renamed from: H */
    private float f6499H;

    /* renamed from: I */
    private int f6500I;

    /* renamed from: J */
    private float f6501J;

    /* renamed from: K */
    private float f6502K;

    /* renamed from: L */
    private boolean f6503L;

    /* renamed from: M */
    private int f6504M;

    /* renamed from: N */
    private int f6505N;

    /* renamed from: O */
    private LinkedList<String> f6506O;

    /* renamed from: P */
    private C1467ea f6507P;

    /* renamed from: Q */
    private String f6508Q;

    /* renamed from: R */
    private boolean f6509R;

    /* renamed from: S */
    private boolean f6510S;

    /* renamed from: a */
    public int f6511a;

    /* renamed from: b */
    private final int f6512b;

    /* renamed from: c */
    private final int f6513c;

    /* renamed from: d */
    private final int f6514d;

    /* renamed from: e */
    private final int f6515e;

    /* renamed from: f */
    private final int f6516f;

    /* renamed from: g */
    private final int f6517g;

    /* renamed from: h */
    private final int f6518h;

    /* renamed from: i */
    private final int f6519i;

    /* renamed from: j */
    private final int f6520j;

    /* renamed from: k */
    private final int f6521k;

    /* renamed from: l */
    private final float[] f6522l;

    /* renamed from: m */
    private final float[] f6523m;

    /* renamed from: n */
    private final float[] f6524n;

    /* renamed from: o */
    private int f6525o;

    /* renamed from: p */
    private int f6526p;

    /* renamed from: q */
    private int f6527q;

    /* renamed from: r */
    private int f6528r;

    /* renamed from: s */
    private Drawable f6529s;

    /* renamed from: t */
    private Drawable f6530t;

    /* renamed from: u */
    private Drawable f6531u;

    /* renamed from: v */
    private int f6532v;

    /* renamed from: w */
    private int f6533w;

    /* renamed from: x */
    private boolean f6534x;

    /* renamed from: y */
    private boolean f6535y;

    /* renamed from: z */
    private boolean f6536z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ int m4719c(ColorSimpleLock colorSimpleLock) {
        colorSimpleLock.f6492A = 5;
        return 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* synthetic */ boolean m4728g(ColorSimpleLock colorSimpleLock) {
        colorSimpleLock.f6503L = false;
        return false;
    }

    public ColorSimpleLock(Context context) {
        this(context, null);
    }

    public ColorSimpleLock(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.colorSimpleLockStyle);
    }

    public ColorSimpleLock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6511a = -1;
        this.f6512b = 1;
        this.f6513c = 2;
        this.f6514d = 3;
        this.f6515e = 4;
        this.f6516f = 5;
        this.f6517g = 230;
        this.f6518h = 230;
        this.f6519i = 800;
        this.f6520j = 250;
        this.f6521k = 150;
        this.f6522l = new float[]{0.0f, 30.0f, -28.0f, 14.0f, -8.0f, 4.0f, -3.0f, 0.0f};
        this.f6523m = new float[]{0.0f, 38.5f, 91.0f, 63.0f};
        this.f6524n = new float[]{0.0f, 38.5f, 91.0f, 63.0f, 38.5f, 70.0f};
        this.f6526p = 0;
        this.f6531u = null;
        this.f6534x = false;
        this.f6535y = false;
        this.f6536z = false;
        this.f6492A = 0;
        this.f6494C = false;
        this.f6495D = null;
        this.f6496E = null;
        this.f6497F = null;
        this.f6498G = 0.0f;
        this.f6499H = 0.0f;
        this.f6500I = 0;
        this.f6501J = 0.0f;
        this.f6502K = 0.0f;
        this.f6503L = false;
        this.f6504M = -1;
        this.f6505N = -1;
        this.f6506O = null;
        this.f6507P = null;
        this.f6508Q = null;
        this.f6509R = true;
        C1338c.m4375a(this, false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorSimpleLock, i, 0);
        this.f6525o = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ColorSimpleLock_colorRectanglePadding, 0);
        this.f6529s = obtainStyledAttributes.getDrawable(R.styleable.ColorSimpleLock_colorOutLinedRectangleIconDrawable);
        this.f6530t = obtainStyledAttributes.getDrawable(R.styleable.ColorSimpleLock_colorFilledRectangleIconDrawable);
        this.f6504M = obtainStyledAttributes.getInteger(R.styleable.ColorSimpleLock_colorCircleNum, 0);
        obtainStyledAttributes.recycle();
        if (this.f6530t != null) {
            this.f6531u = this.f6530t;
            this.f6527q = this.f6531u.getIntrinsicWidth();
            this.f6528r = this.f6531u.getIntrinsicHeight();
            if (this.f6504M == 0) {
                this.f6505N = 4;
                this.f6526p = (this.f6527q * 4) + (this.f6525o * 3);
            } else if (this.f6504M == 1) {
                this.f6505N = 6;
                this.f6526p = (this.f6527q * 6) + (this.f6525o * 5);
            }
        }
        this.f6507P = new C1467ea(this, this);
        C0538w.m1849a(this, this.f6507P);
        this.f6506O = new LinkedList<>();
        this.f6506O.clear();
        this.f6508Q = context.getResources().getString(R.string.color_simple_lock_access_description);
        setImportantForAccessibility(1);
        this.f6510S = context.getPackageManager().hasSystemFeature("oppo.feature.vibrator.waveform.support");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i = 0;
        switch (this.f6492A) {
            case 1:
                int i2 = this.f6511a + 1;
                int i3 = this.f6533w;
                int i4 = this.f6528r + 0;
                if (this.f6534x) {
                    this.f6492A = 0;
                    m4709a(canvas, this.f6511a);
                    return;
                }
                int m4714b = m4714b();
                int i5 = i3;
                while (i < m4714b) {
                    int i6 = this.f6527q + i5;
                    m4716b(canvas, i5, i6, i4);
                    if (i < i2) {
                        m4710a(canvas, i5, i6, i4);
                    }
                    if (i == i2) {
                        m4717b(canvas, i5, i6, i4, this.f6500I);
                    }
                    i5 = i6 + this.f6525o;
                    i++;
                }
                return;
            case 2:
                int i7 = this.f6511a;
                int i8 = this.f6533w;
                int i9 = this.f6528r + 0;
                if (this.f6535y) {
                    this.f6492A = 0;
                    m4709a(canvas, this.f6511a);
                    return;
                }
                int m4714b2 = m4714b();
                while (i < m4714b2) {
                    int i10 = i8 + this.f6527q;
                    m4716b(canvas, i8, i10, i9);
                    if (i < i7) {
                        m4710a(canvas, i8, i10, i9);
                    }
                    if (i == i7) {
                        m4717b(canvas, i8, i10, i9, this.f6500I);
                    }
                    if (this.f6494C) {
                        m4711a(canvas, i8, i10, i9, i);
                    }
                    i8 = i8 + this.f6527q + this.f6525o;
                    i++;
                }
                return;
            case 3:
                int i11 = this.f6493B;
                int i12 = this.f6533w;
                int i13 = this.f6528r + 0;
                if (this.f6534x) {
                    m4709a(canvas, this.f6511a);
                    this.f6492A = 0;
                    return;
                }
                int m4714b3 = m4714b();
                int i14 = i12;
                while (i < m4714b3) {
                    int i15 = this.f6527q + i14;
                    m4716b(canvas, i14, i15, i13);
                    if (i <= i11) {
                        m4717b(canvas, i14, i15, i13, this.f6500I);
                    }
                    i14 = i15 + this.f6525o;
                    i++;
                }
                return;
            case 4:
                int i16 = this.f6493B;
                int i17 = this.f6533w;
                int i18 = this.f6528r + 0;
                if (this.f6535y) {
                    m4709a(canvas, this.f6511a);
                    this.f6492A = 0;
                    return;
                }
                int m4714b4 = m4714b();
                int i19 = i17;
                while (i < m4714b4) {
                    int i20 = this.f6527q + i19;
                    m4716b(canvas, i19, i20, i18);
                    if (i <= i16) {
                        m4710a(canvas, i19, i20, i18);
                    }
                    if (i > i16) {
                        m4717b(canvas, i19, i20, i18, this.f6500I);
                    }
                    i19 = i20 + this.f6525o;
                    i++;
                }
                return;
            case 5:
                int i21 = this.f6511a;
                int i22 = this.f6533w;
                int i23 = this.f6528r + 0;
                if (this.f6536z) {
                    this.f6492A = 0;
                    this.f6494C = false;
                    this.f6511a = -1;
                    m4709a(canvas, this.f6511a);
                    return;
                }
                int m4714b5 = m4714b();
                int i24 = i22;
                for (int i25 = 0; i25 < m4714b5; i25++) {
                    int i26 = i24 + this.f6527q;
                    this.f6531u = this.f6529s.getConstantState().newDrawable();
                    this.f6531u.setBounds((int) (i24 + this.f6501J), 0, (int) (i26 + this.f6501J), i23);
                    this.f6531u.draw(canvas);
                    if (i25 <= i21) {
                        m4711a(canvas, i24, i26, i23, i25);
                    }
                    i24 = i24 + this.f6527q + this.f6525o;
                }
                return;
            default:
                m4709a(canvas, this.f6511a);
                return;
        }
    }

    /* renamed from: b */
    private int m4714b() {
        if (this.f6505N == 4) {
            return 4;
        }
        return this.f6505N == 6 ? 6 : -1;
    }

    public void setSimpleLockType(int i) {
        if (i == 0) {
            this.f6505N = 4;
            this.f6526p = (this.f6527q * 4) + (this.f6525o * 3);
        } else if (i == 1) {
            this.f6505N = 6;
            this.f6526p = (this.f6527q * 6) + (this.f6525o * 5);
        }
        this.f6533w = (this.f6532v - this.f6526p) / 2;
        invalidate();
    }

    /* renamed from: a */
    private void m4709a(Canvas canvas, int i) {
        int i2 = this.f6533w;
        int i3 = this.f6528r + 0;
        int m4714b = m4714b();
        for (int i4 = 0; i4 < m4714b; i4++) {
            int i5 = this.f6527q + i2;
            if (i4 <= i) {
                m4710a(canvas, i2, i5, i3);
            }
            if (i4 > i) {
                m4716b(canvas, i2, i5, i3);
            }
            i2 = this.f6525o + i5;
        }
    }

    public Animator getFailedAnimator() {
        this.f6509R = true;
        return m4734a();
    }

    public Animator getAddAnimator() {
        return m4720c();
    }

    public Animator getDeleteAnimator() {
        return m4722d();
    }

    public void setFingerprintRecognition(boolean z) {
        this.f6503L = z;
    }

    /* renamed from: a */
    private void m4710a(Canvas canvas, int i, int i2, int i3) {
        this.f6531u = this.f6530t.getConstantState().newDrawable();
        this.f6531u.setBounds((int) (i + this.f6501J), 0, (int) (i2 + this.f6501J), i3);
        this.f6531u.draw(canvas);
    }

    /* renamed from: b */
    private void m4716b(Canvas canvas, int i, int i2, int i3) {
        this.f6531u = this.f6529s.getConstantState().newDrawable();
        this.f6531u.setBounds((int) (i + this.f6501J), 0, (int) (i2 + this.f6501J), i3);
        this.f6531u.draw(canvas);
    }

    /* renamed from: a */
    private void m4711a(Canvas canvas, int i, int i2, int i3, int i4) {
        this.f6531u = this.f6530t.getConstantState().newDrawable();
        this.f6531u.setBounds((int) (i + this.f6501J), (int) (m4706a(i4, this.f6502K) + 0.0f), (int) (i2 + this.f6501J), (int) (i3 + m4706a(i4, this.f6502K)));
        int m4706a = (int) ((1.0f - (m4706a(i4, this.f6502K) / 150.0f)) * 140.0f);
        Drawable drawable = this.f6531u;
        if (m4706a <= 0) {
            m4706a = 0;
        }
        drawable.setAlpha(m4706a);
        this.f6531u.draw(canvas);
    }

    /* renamed from: b */
    private void m4717b(Canvas canvas, int i, int i2, int i3, int i4) {
        this.f6531u = this.f6530t.getConstantState().newDrawable();
        this.f6531u.setBounds((int) (i + this.f6501J), 0, (int) (i2 + this.f6501J), i3);
        this.f6531u.setAlpha(i4 > 0 ? 140 : 0);
        this.f6531u.draw(canvas);
    }

    /* renamed from: a */
    private float m4706a(int i, float f) {
        if (this.f6505N == 4) {
            float f2 = f - this.f6523m[i];
            if (f2 >= 0.0f) {
                return f2;
            }
            return 0.0f;
        }
        if (this.f6505N != 6) {
            return f;
        }
        float f3 = f - this.f6524n[i];
        if (f3 >= 0.0f) {
            return f3;
        }
        return 0.0f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        this.f6532v = View.MeasureSpec.getSize(i);
        this.f6533w = (this.f6532v - this.f6526p) / 2;
        setMeasuredDimension(this.f6532v, this.f6528r + 150);
    }

    public void setOneCode(int i) {
        if (this.f6505N == 4) {
            if (this.f6511a > 3) {
                return;
            }
        } else if (this.f6505N == 6 && this.f6511a > 5) {
            return;
        }
        if (this.f6505N == 4) {
            if (this.f6511a == 3) {
                this.f6511a = -1;
            }
        } else if (this.f6505N == 6 && this.f6511a == 5) {
            this.f6511a = -1;
        }
        if (this.f6496E != null && this.f6496E.isRunning()) {
            this.f6496E.end();
        }
        if (this.f6495D != null && this.f6495D.isRunning()) {
            this.f6495D.end();
        }
        this.f6492A = 2;
        this.f6511a++;
        this.f6495D = m4720c();
        this.f6495D.start();
        if (this.f6506O != null) {
            String valueOf = String.valueOf(i);
            if (this.f6511a != this.f6505N - 1) {
                this.f6506O.addFirst(valueOf);
            } else {
                this.f6506O.clear();
            }
        }
    }

    public void setAllCode(boolean z) {
        if (this.f6505N == 4) {
            if (this.f6494C || this.f6511a >= 3) {
                return;
            }
            if (this.f6497F != null && this.f6497F.isRunning()) {
                return;
            }
        } else if (this.f6505N == 6) {
            if (this.f6494C || this.f6511a >= 5) {
                return;
            }
            if (this.f6497F != null && this.f6497F.isRunning()) {
                return;
            }
        }
        if (z) {
            if (this.f6496E != null && this.f6496E.isRunning()) {
                this.f6496E.end();
            }
            if (this.f6495D != null && this.f6495D.isRunning()) {
                this.f6495D.end();
            }
            this.f6492A = 4;
            this.f6493B = this.f6511a;
            if (this.f6505N == 4) {
                this.f6511a = 3;
            } else if (this.f6505N == 6) {
                this.f6511a = 5;
            }
            this.f6495D = m4720c();
            this.f6495D.start();
        }
    }

    public void setFailed(boolean z) {
        this.f6494C = z;
    }

    public void setDeleteLast(boolean z) {
        if (this.f6506O != null && !this.f6506O.isEmpty()) {
            this.f6506O.removeFirst();
            if (this.f6508Q != null && this.f6506O != null) {
                this.f6508Q = this.f6508Q.replace('y', String.valueOf(this.f6505N).charAt(0));
                announceForAccessibility(this.f6508Q.replace('x', String.valueOf(this.f6506O.size()).charAt(0)));
            }
        }
        if (this.f6505N == 4) {
            if (this.f6511a == -1 || this.f6494C || this.f6511a >= 3 || !z) {
                return;
            }
            if (this.f6497F != null && this.f6497F.isRunning()) {
                return;
            }
        } else if (this.f6505N == 6) {
            if (this.f6511a == -1 || this.f6494C || this.f6511a >= 5 || !z) {
                return;
            }
            if (this.f6497F != null && this.f6497F.isRunning()) {
                return;
            }
        }
        this.f6511a--;
        if (this.f6511a >= -1) {
            if (this.f6496E != null && this.f6496E.isRunning()) {
                this.f6496E.end();
            }
            if (this.f6495D != null && this.f6495D.isRunning()) {
                this.f6495D.end();
            }
            this.f6492A = 1;
            this.f6496E = m4722d();
            this.f6496E.start();
            return;
        }
        this.f6511a = -1;
    }

    public void setClearAll(boolean z) {
        if (this.f6505N == 4) {
            if (this.f6511a == -1 || this.f6494C || this.f6511a > 3 || !z) {
                return;
            }
            if (this.f6497F != null && this.f6497F.isRunning()) {
                return;
            }
        } else if (this.f6505N == 6) {
            if (this.f6511a == -1 || this.f6494C || this.f6511a > 5 || !z) {
                return;
            }
            if (this.f6497F != null && this.f6497F.isRunning()) {
                return;
            }
        }
        if (this.f6496E != null && this.f6496E.isRunning()) {
            this.f6496E.end();
        }
        if (this.f6495D != null && this.f6495D.isRunning()) {
            this.f6495D.end();
        }
        if (this.f6506O != null) {
            this.f6506O.clear();
        }
        this.f6492A = 3;
        this.f6493B = this.f6511a;
        this.f6511a = -1;
        this.f6496E = m4722d();
        this.f6496E.start();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f6498G = f;
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f6499H = f;
    }

    public void setOpacity(int i) {
        this.f6500I = i;
    }

    public void setInternalTranslationX(float f) {
        this.f6501J = f;
    }

    public void setInternalTranslationY(float f) {
        this.f6502K = f;
    }

    /* renamed from: c */
    private ValueAnimator m4720c() {
        if (this.f6495D != null) {
            return this.f6495D;
        }
        this.f6495D = ValueAnimator.ofInt(0, 255);
        this.f6495D.setDuration(230L);
        this.f6495D.addUpdateListener(new C1459dt(this));
        this.f6495D.addListener(new C1460du(this));
        return this.f6495D;
    }

    /* renamed from: d */
    private ValueAnimator m4722d() {
        if (this.f6496E != null) {
            return this.f6496E;
        }
        this.f6496E = ValueAnimator.ofInt(255, 0);
        this.f6496E.setDuration(230L);
        this.f6496E.addUpdateListener(new C1461dv(this));
        this.f6496E.addListener(new C1462dw(this));
        return this.f6496E;
    }

    /* renamed from: a */
    public final Animator m4734a() {
        if (this.f6497F != null) {
            return this.f6497F;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 30.0f, -28.0f, 14.0f, -8.0f, 4.0f, -3.0f, 0.0f);
        ofFloat.addUpdateListener(new C1463dx(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 250.0f);
        ofFloat2.addUpdateListener(new C1464dy(this));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(800L);
        ofFloat2.setDuration(800L);
        ofFloat.addListener(new C1465dz(this, ofFloat2));
        this.f6497F = ofFloat;
        return ofFloat;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f6507P == null || !this.f6507P.m2082a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ void m4727f(ColorSimpleLock colorSimpleLock) {
        if (colorSimpleLock.f6510S) {
            colorSimpleLock.performHapticFeedback(ResponseCode.CODE_3XX_NOT_MODIFIED, 3);
        } else {
            colorSimpleLock.performHapticFeedback(ResponseCode.CODE_3XX_MULTIPLE_CHOICES, 3);
        }
    }
}
