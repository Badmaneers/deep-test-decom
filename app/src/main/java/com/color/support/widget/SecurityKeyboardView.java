package com.color.support.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Handler;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import color.support.p043v7.widget.C1301v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class SecurityKeyboardView extends View implements View.OnClickListener {

    /* renamed from: aJ */
    private static int[][][] f6765aJ;

    /* renamed from: aK */
    private static int[][] f6766aK;

    /* renamed from: A */
    private C1546gd[] f6772A;

    /* renamed from: B */
    private InterfaceC1553gk f6773B;

    /* renamed from: C */
    private int f6774C;

    /* renamed from: D */
    private int f6775D;

    /* renamed from: E */
    private boolean f6776E;

    /* renamed from: F */
    private boolean f6777F;

    /* renamed from: G */
    private boolean f6778G;

    /* renamed from: H */
    private int f6779H;

    /* renamed from: I */
    private int f6780I;

    /* renamed from: J */
    private int f6781J;

    /* renamed from: K */
    private int f6782K;

    /* renamed from: L */
    private int f6783L;

    /* renamed from: M */
    private int f6784M;

    /* renamed from: N */
    private boolean f6785N;

    /* renamed from: O */
    private Paint f6786O;

    /* renamed from: P */
    private Rect f6787P;

    /* renamed from: Q */
    private long f6788Q;

    /* renamed from: R */
    private long f6789R;

    /* renamed from: S */
    private int f6790S;

    /* renamed from: T */
    private int f6791T;

    /* renamed from: U */
    private int f6792U;

    /* renamed from: V */
    private int f6793V;

    /* renamed from: W */
    private int f6794W;

    /* renamed from: a */
    Handler f6795a;

    /* renamed from: aA */
    private StringBuilder f6796aA;

    /* renamed from: aB */
    private boolean f6797aB;

    /* renamed from: aC */
    private Rect f6798aC;

    /* renamed from: aD */
    private Bitmap f6799aD;

    /* renamed from: aE */
    private boolean f6800aE;

    /* renamed from: aF */
    private Canvas f6801aF;

    /* renamed from: aG */
    private AccessibilityManager f6802aG;

    /* renamed from: aH */
    private AudioManager f6803aH;

    /* renamed from: aM */
    private int f6804aM;

    /* renamed from: aN */
    private int f6805aN;

    /* renamed from: aO */
    private ColorStateList f6806aO;

    /* renamed from: aP */
    private ColorStateList f6807aP;

    /* renamed from: aQ */
    private Drawable f6808aQ;

    /* renamed from: aR */
    private Drawable f6809aR;

    /* renamed from: aS */
    private Typeface f6810aS;

    /* renamed from: aT */
    private InterfaceC1554gl f6811aT;

    /* renamed from: aU */
    private int f6812aU;

    /* renamed from: aV */
    private int f6813aV;

    /* renamed from: aW */
    private int f6814aW;

    /* renamed from: aX */
    private int f6815aX;

    /* renamed from: aY */
    private int f6816aY;

    /* renamed from: aZ */
    private int f6817aZ;

    /* renamed from: aa */
    private long f6818aa;

    /* renamed from: ab */
    private long f6819ab;

    /* renamed from: ac */
    private int[] f6820ac;

    /* renamed from: ad */
    private GestureDetector f6821ad;

    /* renamed from: ae */
    private int f6822ae;

    /* renamed from: af */
    private int f6823af;

    /* renamed from: ag */
    private int f6824ag;

    /* renamed from: ah */
    private int f6825ah;

    /* renamed from: ai */
    private boolean f6826ai;

    /* renamed from: aj */
    private C1546gd f6827aj;

    /* renamed from: ak */
    private Rect f6828ak;

    /* renamed from: al */
    private boolean f6829al;

    /* renamed from: am */
    private C1555gm f6830am;

    /* renamed from: an */
    private int f6831an;

    /* renamed from: ao */
    private boolean f6832ao;

    /* renamed from: ap */
    private int f6833ap;

    /* renamed from: aq */
    private float f6834aq;

    /* renamed from: ar */
    private float f6835ar;

    /* renamed from: as */
    private Drawable f6836as;

    /* renamed from: av */
    private int[] f6837av;

    /* renamed from: aw */
    private int f6838aw;

    /* renamed from: ax */
    private int f6839ax;

    /* renamed from: ay */
    private long f6840ay;

    /* renamed from: az */
    private boolean f6841az;

    /* renamed from: b */
    protected List<Integer> f6842b;

    /* renamed from: ba */
    private boolean f6843ba;

    /* renamed from: bb */
    private int f6844bb;

    /* renamed from: bc */
    private boolean f6845bc;

    /* renamed from: bd */
    private float f6846bd;

    /* renamed from: be */
    private int f6847be;

    /* renamed from: bf */
    private int f6848bf;

    /* renamed from: bg */
    private String[] f6849bg;

    /* renamed from: bh */
    private int f6850bh;

    /* renamed from: bi */
    private ColorStateList f6851bi;

    /* renamed from: bj */
    private int f6852bj;

    /* renamed from: bk */
    private int f6853bk;

    /* renamed from: bl */
    private int f6854bl;

    /* renamed from: bm */
    private ArrayList<C1552gj> f6855bm;

    /* renamed from: bn */
    private ArrayList<Drawable> f6856bn;

    /* renamed from: bo */
    private Drawable f6857bo;

    /* renamed from: bp */
    private List<int[]> f6858bp;

    /* renamed from: e */
    private C1545gc f6859e;

    /* renamed from: f */
    private int f6860f;

    /* renamed from: g */
    private int f6861g;

    /* renamed from: h */
    private int f6862h;

    /* renamed from: i */
    private int f6863i;

    /* renamed from: j */
    private float f6864j;

    /* renamed from: k */
    private int f6865k;

    /* renamed from: l */
    private float f6866l;

    /* renamed from: m */
    private TextView f6867m;

    /* renamed from: n */
    private C1301v f6868n;

    /* renamed from: o */
    private int f6869o;

    /* renamed from: p */
    private int f6870p;

    /* renamed from: q */
    private int f6871q;

    /* renamed from: r */
    private final int[] f6872r;

    /* renamed from: s */
    private PopupWindow f6873s;

    /* renamed from: t */
    private View f6874t;

    /* renamed from: u */
    private SecurityKeyboardView f6875u;

    /* renamed from: v */
    private boolean f6876v;

    /* renamed from: w */
    private View f6877w;

    /* renamed from: x */
    private int f6878x;

    /* renamed from: y */
    private int f6879y;

    /* renamed from: z */
    private Map<C1546gd, View> f6880z;

    /* renamed from: c */
    private static final int[] f6770c = {-5};

    /* renamed from: d */
    private static final int[] f6771d = {R.attr.state_long_pressable};

    /* renamed from: at */
    private static final int f6768at = ViewConfiguration.getLongPressTimeout();

    /* renamed from: au */
    private static int f6769au = 12;

    /* renamed from: aI */
    private static final int[] f6764aI = {R.attr.state_window_focused, 1, R.attr.state_selected, 2, R.attr.state_focused, 4, R.attr.state_enabled, 8, R.attr.state_pressed, 16, R.attr.state_activated, 32, R.attr.state_accelerated, 64, R.attr.state_hovered, 128, R.attr.state_drag_can_accept, 256, R.attr.state_drag_hovered, 512};

    /* renamed from: aL */
    private static int f6767aL = color.support.p043v7.appcompat.R.styleable.ViewDrawableStates.length;

    public void setVerticalCorrection(int i) {
    }

    static {
        int length = f6764aI.length / 2;
        if (length != f6767aL) {
            throw new IllegalStateException("VIEW_STATE_IDS array length does not match ViewDrawableStates style array");
        }
        int[] iArr = new int[f6764aI.length];
        for (int i = 0; i < f6767aL; i++) {
            int i2 = color.support.p043v7.appcompat.R.styleable.ViewDrawableStates[i];
            for (int i3 = 0; i3 < f6764aI.length; i3 += 2) {
                if (f6764aI[i3] == i2) {
                    int i4 = i * 2;
                    iArr[i4] = i2;
                    iArr[i4 + 1] = f6764aI[i3 + 1];
                }
            }
        }
        int i5 = 1 << length;
        f6765aJ = new int[i5][];
        f6766aK = new int[i5];
        for (int i6 = 0; i6 < f6766aK.length; i6++) {
            f6766aK[i6] = new int[Integer.bitCount(i6)];
            int i7 = 0;
            for (int i8 = 0; i8 < iArr.length; i8 += 2) {
                if ((iArr[i8 + 1] & i6) != 0) {
                    f6766aK[i6][i7] = iArr[i8];
                    i7++;
                }
            }
        }
    }

    public SecurityKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SecurityKeyboardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, color.support.p043v7.appcompat.R.style.SecurityKeyboardView);
    }

    public SecurityKeyboardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6860f = -1;
        this.f6872r = new int[2];
        this.f6776E = false;
        this.f6777F = true;
        this.f6778G = true;
        this.f6793V = -1;
        this.f6794W = -1;
        this.f6820ac = new int[12];
        this.f6824ag = -1;
        this.f6828ak = new Rect(0, 0, 0, 0);
        this.f6830am = new C1555gm((byte) 0);
        this.f6833ap = 1;
        this.f6837av = new int[f6769au];
        this.f6796aA = new StringBuilder(1);
        this.f6798aC = new Rect();
        this.f6842b = new ArrayList();
        this.f6805aN = 0;
        this.f6808aQ = null;
        this.f6809aR = null;
        this.f6810aS = null;
        this.f6812aU = 0;
        this.f6813aV = 0;
        this.f6814aW = 0;
        this.f6815aX = 0;
        this.f6816aY = 0;
        this.f6817aZ = 0;
        this.f6843ba = true;
        this.f6844bb = -1;
        this.f6845bc = false;
        this.f6846bd = -1.0f;
        this.f6847be = -1;
        this.f6848bf = -1;
        this.f6849bg = null;
        this.f6852bj = -1;
        this.f6853bk = 2;
        this.f6854bl = -1;
        this.f6855bm = new ArrayList<>();
        this.f6856bn = new ArrayList<>();
        this.f6858bp = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView, i, color.support.p043v7.appcompat.R.style.SecurityKeyboardView);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f6836as = obtainStyledAttributes.getDrawable(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorKeyBackground);
        this.f6774C = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorVerticalCorrection, 0);
        int resourceId = obtainStyledAttributes.getResourceId(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorKeyPreviewLayout, 0);
        this.f6870p = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorKeyPreviewOffset, 0);
        this.f6871q = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorKeyPreviewHeight, 80);
        this.f6804aM = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorKeyPreviewWidth, 80);
        this.f6862h = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorKeyTextSize, 18);
        this.f6863i = obtainStyledAttributes.getColor(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorKeyTextColor, -16777216);
        this.f6861g = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorLabelTextSize, 14);
        this.f6825ah = obtainStyledAttributes.getResourceId(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorPopupLayout, 0);
        this.f6865k = obtainStyledAttributes.getColor(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorShadowColor, 0);
        this.f6864j = obtainStyledAttributes.getFloat(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorShadowRadius, 0.0f);
        this.f6805aN = obtainStyledAttributes.getInt(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorKeyBoardType, 0);
        this.f6806aO = obtainStyledAttributes.getColorStateList(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorTextColor);
        this.f6807aP = obtainStyledAttributes.getColorStateList(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorGoTextColor);
        this.f6808aQ = obtainStyledAttributes.getDrawable(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorSpecialKeyBg);
        this.f6809aR = obtainStyledAttributes.getDrawable(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorEndKeyBg);
        this.f6851bi = obtainStyledAttributes.getColorStateList(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorItemSymbolsColor);
        this.f6857bo = obtainStyledAttributes.getDrawable(color.support.p043v7.appcompat.R.styleable.SecurityKeyboardView_colorSpecialItemBg);
        this.f6866l = 0.5f;
        this.f6868n = new C1301v(context);
        if (resourceId != 0) {
            this.f6867m = (TextView) layoutInflater.inflate(resourceId, (ViewGroup) null);
            this.f6869o = (int) this.f6867m.getTextSize();
            this.f6868n.setContentView(this.f6867m);
            this.f6868n.setBackgroundDrawable(null);
        } else {
            this.f6777F = false;
        }
        this.f6868n.setTouchable(false);
        this.f6868n.m4281a(new C1548gf(this));
        this.f6873s = new PopupWindow(context);
        this.f6873s.setBackgroundDrawable(null);
        this.f6877w = this;
        this.f6786O = new Paint();
        this.f6786O.setAntiAlias(true);
        this.f6786O.setTextSize(0.0f);
        this.f6786O.setTextAlign(Paint.Align.CENTER);
        this.f6786O.setAlpha(255);
        this.f6787P = new Rect(0, 0, 0, 0);
        this.f6880z = new HashMap();
        if (this.f6836as != null) {
            this.f6836as.getPadding(this.f6787P);
        }
        this.f6831an = (int) (getResources().getDisplayMetrics().density * 500.0f);
        this.f6832ao = true;
        this.f6802aG = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f6803aH = (AudioManager) context.getSystemService("audio");
        m4847f();
        setKeyboardType(1);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    @SuppressLint({"HandlerLeak"})
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6821ad == null) {
            this.f6821ad = new GestureDetector(getContext(), new C1550gh(this));
            this.f6821ad.setIsLongpressEnabled(false);
        }
        if (this.f6795a == null) {
            this.f6795a = new HandlerC1549gg(this);
        }
    }

    protected InterfaceC1553gk getOnKeyboardActionListener() {
        return this.f6773B;
    }

    public void setOnKeyboardActionListener(InterfaceC1553gk interfaceC1553gk) {
        this.f6773B = interfaceC1553gk;
    }

    public C1545gc getKeyboard() {
        return this.f6859e;
    }

    public void setKeyboard(C1545gc c1545gc) {
        C1546gd[] c1546gdArr;
        if (this.f6859e != null) {
            m4821a(-1);
        }
        m4840d();
        this.f6859e = c1545gc;
        List<C1546gd> m5168a = this.f6859e.m5168a();
        this.f6772A = (C1546gd[]) m5168a.toArray(new C1546gd[m5168a.size()]);
        requestLayout();
        this.f6800aE = true;
        m4859a();
        if (c1545gc != null && (c1546gdArr = this.f6772A) != null) {
            int length = c1546gdArr.length;
            int i = 0;
            for (C1546gd c1546gd : c1546gdArr) {
                i += Math.min(c1546gd.f7326e, c1546gd.f7327f) + c1546gd.f7328g;
            }
            if (i >= 0 && length != 0) {
                this.f6775D = (int) ((i * 1.4f) / length);
                this.f6775D *= this.f6775D;
            }
        }
        this.f6880z.clear();
        this.f6824ag = -1;
        this.f6826ai = true;
    }

    public void setNewShifted(int i) {
        if (this.f6859e != null) {
            this.f6859e.m5169a(i);
            m4859a();
        }
    }

    public int getNewShifted() {
        if (this.f6859e != null) {
            return this.f6859e.m5173d();
        }
        return -1;
    }

    public void setPreviewEnabled(boolean z) {
        this.f6777F = z;
    }

    public void setPopupParent(View view) {
        this.f6877w = view;
    }

    public void setProximityCorrectionEnabled(boolean z) {
        this.f6785N = z;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m4844e();
    }

    /* renamed from: a */
    private CharSequence m4820a(CharSequence charSequence) {
        return (getNewShifted() <= 0 || charSequence == null || charSequence.length() >= 3 || !Character.isLowerCase(charSequence.charAt(0))) ? charSequence : charSequence.toString().toUpperCase();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f6859e == null) {
            setMeasuredDimension(getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.f6859e.m5171b() + getPaddingTop() + getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6799aD = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        TextPaint textPaint;
        super.onDraw(canvas);
        if (this.f6797aB || this.f6799aD == null || this.f6800aE) {
            m4833b();
        }
        canvas.drawBitmap(this.f6799aD, 0.0f, 0.0f, (Paint) null);
        if (m4849g()) {
            int i = this.f6850bh;
            float length = (this.f6848bf - ((this.f6849bg.length - 1) * this.f6846bd)) / this.f6849bg.length;
            for (int i2 = 0; i2 < this.f6849bg.length; i2++) {
                Drawable m5188d = this.f6855bm.get(i2).m5188d();
                if (m5188d != null) {
                    int paddingLeft = getPaddingLeft() + i;
                    int i3 = this.f6847be + paddingLeft;
                    float f = i2;
                    float f2 = length * f;
                    int paddingTop = (int) (getPaddingTop() + f2 + (this.f6846bd * f));
                    float paddingTop2 = getPaddingTop() + f2 + (f * this.f6846bd);
                    m5188d.setBounds(paddingLeft, paddingTop, i3, (int) (paddingTop + length));
                    m5188d.draw(canvas);
                    this.f6855bm.get(i2).m5186b(paddingTop2 + length);
                    this.f6855bm.get(i2).m5184a(paddingTop2);
                }
            }
            for (int i4 = 0; i4 < this.f6849bg.length; i4++) {
                textPaint = this.f6855bm.get(i4).f7361h;
                Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
                if (this.f6849bg[i4] != null) {
                    canvas.drawText(this.f6849bg[i4], getPaddingLeft() + ((this.f6847be - ((int) textPaint.measureText(r5))) / 2) + i, (int) (((((getPaddingTop() + this.f6853bk) + (i4 * (this.f6846bd + length))) + (length / 2.0f)) - ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2)) - fontMetricsInt.ascent), textPaint);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4833b() {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.SecurityKeyboardView.m4833b():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:            if (r10 >= r18.f6775D) goto L140;     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m4817a(int r19, int r20, int[] r21) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.SecurityKeyboardView.m4817a(int, int, int[]):int");
    }

    /* renamed from: a */
    public void m4823a(int i, int i2, int i3, long j) {
        if (i == -1 || i >= this.f6772A.length) {
            return;
        }
        C1546gd c1546gd = this.f6772A[i];
        if (c1546gd.f7334m != null) {
            this.f6773B.mo4866a(c1546gd.f7334m);
            this.f6773B.mo4867b(-1);
        } else {
            int i4 = c1546gd.f7322a[0];
            int[] iArr = new int[f6769au];
            Arrays.fill(iArr, -1);
            m4817a(i2, i3, iArr);
            if (this.f6841az) {
                if (this.f6839ax != -1) {
                    this.f6773B.mo4865a(-5, f6770c);
                    m4826a(i4, c1546gd);
                } else {
                    this.f6839ax = 0;
                }
                i4 = c1546gd.f7322a[this.f6839ax];
            }
            m4826a(i4, c1546gd);
            this.f6773B.mo4865a(i4, iArr);
            this.f6773B.mo4867b(i4);
        }
        this.f6838aw = i;
        this.f6840ay = j;
    }

    /* renamed from: a */
    private CharSequence m4819a(C1546gd c1546gd) {
        if (this.f6841az) {
            this.f6796aA.setLength(0);
            this.f6796aA.append((char) c1546gd.f7322a[this.f6839ax >= 0 ? this.f6839ax : 0]);
            return m4820a(this.f6796aA);
        }
        return m4820a(c1546gd.f7323b);
    }

    /* renamed from: a */
    private void m4821a(int i) {
        int i2 = this.f6860f;
        C1301v c1301v = this.f6868n;
        this.f6860f = i;
        C1546gd[] c1546gdArr = this.f6772A;
        if (i2 != this.f6860f) {
            if (i2 != -1 && c1546gdArr.length > i2) {
                C1546gd c1546gd = c1546gdArr[i2];
                c1546gd.m5179a(this.f6860f == -1);
                m4837c(i2);
                int i3 = c1546gd.f7322a[0];
                m4822a(256, i3);
                m4822a(65536, i3);
            }
            if (this.f6860f != -1 && c1546gdArr.length > this.f6860f) {
                C1546gd c1546gd2 = c1546gdArr[this.f6860f];
                c1546gd2.m5178a();
                m4837c(this.f6860f);
                int i4 = c1546gd2.f7322a[0];
                m4824a(128, i4, c1546gd2);
                m4824a(32768, i4, c1546gd2);
            }
        }
        boolean m4850g = m4850g(this.f6860f);
        if (i2 != this.f6860f && this.f6777F && m4850g) {
            this.f6795a.removeMessages(1);
            if (c1301v.isShowing() && i == -1) {
                this.f6795a.sendMessageDelayed(this.f6795a.obtainMessage(2), 75L);
            }
            if (i != -1) {
                if (c1301v.isShowing()) {
                    this.f6867m.getVisibility();
                }
                m4834b(i);
            }
        }
    }

    /* renamed from: b */
    public void m4834b(int i) {
        C1301v c1301v = this.f6868n;
        C1546gd[] c1546gdArr = this.f6772A;
        if (i < 0 || i >= this.f6772A.length) {
            return;
        }
        C1546gd c1546gd = c1546gdArr[i];
        if (c1546gd.f7324c != null) {
            this.f6867m.setCompoundDrawables(null, null, null, c1546gd.f7325d != null ? c1546gd.f7325d : c1546gd.f7324c);
            this.f6867m.setText((CharSequence) null);
        } else {
            this.f6867m.setCompoundDrawables(null, null, null, null);
            this.f6867m.setText(m4819a(c1546gd));
            if (c1546gd.f7323b.length() > 1 && c1546gd.f7322a.length < 2) {
                this.f6867m.setTextSize(0, this.f6862h);
                this.f6867m.setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                this.f6867m.setTextSize(0, this.f6869o);
                this.f6867m.setTypeface(this.f6810aS);
            }
        }
        this.f6867m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int i2 = this.f6804aM;
        int i3 = this.f6871q;
        ViewGroup.LayoutParams layoutParams = this.f6867m.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i2;
            layoutParams.height = i3;
        }
        if (!this.f6776E) {
            this.f6779H = ((c1546gd.f7330i + (c1546gd.f7326e / 2)) - (this.f6804aM / 2)) + getPaddingLeft();
            this.f6780I = (c1546gd.f7331j - i3) + this.f6870p;
        } else {
            this.f6779H = 160 - (this.f6867m.getMeasuredWidth() / 2);
            this.f6780I = -this.f6867m.getMeasuredHeight();
        }
        this.f6795a.removeMessages(2);
        getLocationInWindow(this.f6872r);
        int[] iArr = this.f6872r;
        iArr[0] = iArr[0] + this.f6878x;
        int[] iArr2 = this.f6872r;
        iArr2[1] = iArr2[1] + this.f6879y;
        this.f6867m.getBackground().setState(c1546gd.f7339r != 0 ? f6771d : EMPTY_STATE_SET);
        this.f6779H += this.f6872r[0];
        this.f6780I += this.f6872r[1];
        getLocationOnScreen(this.f6872r);
        if (this.f6780I + this.f6872r[1] < 0) {
            if (c1546gd.f7330i + c1546gd.f7326e <= getWidth() / 2) {
                this.f6779H += (int) (c1546gd.f7326e * 2.5d);
            } else {
                this.f6779H -= (int) (c1546gd.f7326e * 2.5d);
            }
            this.f6780I += i3;
        }
        if (c1301v.isShowing()) {
            c1301v.update(this.f6779H, this.f6780I, i2, i3);
        } else {
            c1301v.setWidth(i2);
            c1301v.setHeight(i3);
            c1301v.showAtLocation(this.f6877w, 0, this.f6779H, this.f6780I);
        }
        this.f6867m.setVisibility(0);
    }

    /* renamed from: a */
    private void m4822a(int i, int i2) {
        String string;
        if (this.f6802aG == null || !this.f6802aG.isEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        onInitializeAccessibilityEvent(obtain);
        if (i2 != 10) {
            switch (i2) {
                case -6:
                    string = getContext().getString(color.support.p043v7.appcompat.R.string.keyboardview_keycode_alt);
                    break;
                case -5:
                    string = getContext().getString(color.support.p043v7.appcompat.R.string.keyboardview_keycode_delete);
                    break;
                case -4:
                    string = getContext().getString(color.support.p043v7.appcompat.R.string.keyboardview_keycode_done);
                    break;
                case -3:
                    string = getContext().getString(color.support.p043v7.appcompat.R.string.keyboardview_keycode_cancel);
                    break;
                case -2:
                    string = getContext().getString(color.support.p043v7.appcompat.R.string.keyboardview_keycode_mode_change);
                    break;
                case -1:
                    string = getContext().getString(color.support.p043v7.appcompat.R.string.keyboardview_keycode_shift);
                    break;
                default:
                    string = String.valueOf((char) i2);
                    break;
            }
        } else {
            string = getContext().getString(color.support.p043v7.appcompat.R.string.keyboardview_keycode_enter);
        }
        obtain.getText().add(string);
        this.f6802aG.sendAccessibilityEvent(obtain);
    }

    /* renamed from: a */
    public final void m4859a() {
        this.f6798aC.union(0, 0, getWidth(), getHeight());
        this.f6797aB = true;
        invalidate();
    }

    /* renamed from: c */
    private void m4837c(int i) {
        if (this.f6772A != null && i >= 0 && i < this.f6772A.length) {
            C1546gd c1546gd = this.f6772A[i];
            this.f6827aj = c1546gd;
            this.f6798aC.union(c1546gd.f7330i + getPaddingLeft(), c1546gd.f7331j + getPaddingTop(), c1546gd.f7330i + c1546gd.f7326e + getPaddingLeft(), c1546gd.f7331j + c1546gd.f7327f + getPaddingTop());
            m4833b();
            invalidate(c1546gd.f7330i + getPaddingLeft(), c1546gd.f7331j + getPaddingTop(), c1546gd.f7330i + c1546gd.f7326e + getPaddingLeft(), c1546gd.f7331j + c1546gd.f7327f + getPaddingTop());
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.f6802aG != null && this.f6802aG.isTouchExplorationEnabled() && motionEvent.getPointerCount() == 1) {
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
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction();
        long eventTime = motionEvent.getEventTime();
        boolean z = true;
        if (pointerCount != this.f6833ap) {
            if (pointerCount == 1) {
                MotionEvent obtain = MotionEvent.obtain(eventTime, eventTime, 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
                boolean m4831a = m4831a(obtain, false);
                obtain.recycle();
                z = action == 1 ? m4831a(motionEvent, true) : m4831a;
            } else {
                MotionEvent obtain2 = MotionEvent.obtain(eventTime, eventTime, 1, this.f6834aq, this.f6835ar, motionEvent.getMetaState());
                z = m4831a(obtain2, true);
                obtain2.recycle();
            }
        } else if (pointerCount == 1) {
            z = m4831a(motionEvent, false);
            this.f6834aq = motionEvent.getX();
            this.f6835ar = motionEvent.getY();
        }
        this.f6833ap = pointerCount;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0148  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m4831a(android.view.MotionEvent r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.color.support.widget.SecurityKeyboardView.m4831a(android.view.MotionEvent, boolean):boolean");
    }

    /* renamed from: d */
    private void m4841d(int i) {
        String string;
        if (this.f6802aG == null || !this.f6802aG.isEnabled()) {
            return;
        }
        switch (i) {
            case 0:
                string = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_asterisk);
                break;
            case 1:
                string = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_minus);
                break;
            case 2:
                string = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_atsymbol);
                break;
            case 3:
                string = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_dollar);
                break;
            default:
                string = null;
                break;
        }
        if (string != null) {
            announceForAccessibility(string);
        }
    }

    /* renamed from: c */
    public boolean m4838c() {
        C1546gd c1546gd = this.f6772A[this.f6824ag];
        m4823a(this.f6793V, c1546gd.f7330i, c1546gd.f7331j, this.f6840ay);
        return true;
    }

    /* renamed from: d */
    private void m4840d() {
        if (this.f6795a != null) {
            this.f6795a.removeMessages(3);
            this.f6795a.removeMessages(4);
            this.f6795a.removeMessages(1);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6868n.isShowing()) {
            this.f6868n.dismiss();
        }
        this.f6844bb = -1;
        m4840d();
        m4844e();
        this.f6799aD = null;
        this.f6801aF = null;
        this.f6880z.clear();
    }

    /* renamed from: e */
    public void m4844e() {
        if (this.f6873s.isShowing()) {
            this.f6873s.dismiss();
            this.f6876v = false;
            m4859a();
        }
    }

    /* renamed from: f */
    private void m4847f() {
        this.f6838aw = -1;
        this.f6839ax = 0;
        this.f6840ay = -1L;
        this.f6841az = false;
    }

    /* renamed from: a */
    private void m4828a(long j, int i) {
        if (i == -1) {
            return;
        }
        C1546gd c1546gd = this.f6772A[i];
        if (c1546gd.f7322a.length <= 1) {
            if (j > this.f6840ay + 800 || i != this.f6838aw) {
                m4847f();
                return;
            }
            return;
        }
        this.f6841az = true;
        if (j < this.f6840ay + 800 && i == this.f6838aw) {
            this.f6839ax = (this.f6839ax + 1) % c1546gd.f7322a.length;
        } else {
            this.f6839ax = -1;
        }
    }

    /* renamed from: a */
    private void m4826a(int i, C1546gd c1546gd) {
        if (this.f6811aT == null || i == -1 || i == -2 || i == -6 || i == -7 || i == 10 || i == 32 || i == -5 || c1546gd.f7323b == null) {
            return;
        }
        m4820a(c1546gd.f7323b).toString();
    }

    /* renamed from: a */
    private void m4825a(int i, Drawable drawable) {
        this.f6842b.set(i, Integer.valueOf(this.f6842b.get(i).intValue() | 1024));
        m4835b(i, drawable);
    }

    /* renamed from: b */
    private void m4835b(int i, Drawable drawable) {
        int[] m4845e = m4845e(i);
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(m4845e);
    }

    /* renamed from: e */
    private int[] m4845e(int i) {
        int intValue = this.f6842b.get(i).intValue();
        if ((intValue & 1024) != 0) {
            this.f6858bp.set(i, m4848f(i));
            this.f6842b.set(i, Integer.valueOf(intValue & (-1025)));
        }
        return this.f6858bp.get(i);
    }

    /* renamed from: f */
    private int[] m4848f(int i) {
        int intValue = this.f6842b.get(i).intValue();
        int i2 = (this.f6842b.get(i).intValue() & 16384) != 0 ? 16 : 0;
        if ((intValue & 32) == 0) {
            i2 |= 8;
        }
        if (hasWindowFocus()) {
            i2 |= 1;
        }
        return f6765aJ[i][i2];
    }

    /* renamed from: a */
    private void m4827a(int i, boolean z) {
        int intValue = this.f6842b.get(i).intValue();
        this.f6842b.set(i, Integer.valueOf(z ? intValue | 16384 : intValue & (-16385)));
    }

    /* renamed from: b */
    private int m4832b(int i, int i2) {
        int length;
        if (!m4849g() || this.f6849bg == null || (length = this.f6849bg.length) <= 0) {
            return -1;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (i >= getPaddingLeft() && i <= this.f6847be + getPaddingLeft()) {
                float f = i2;
                if (f >= this.f6855bm.get(i3).m5183a() && f <= this.f6855bm.get(i3).m5185b()) {
                    return i3;
                }
            }
        }
        return -1;
    }

    private void setItemRestore(int i) {
        TextPaint textPaint;
        m4827a(i, false);
        Drawable m5188d = this.f6855bm.get(i).m5188d();
        String m5187c = this.f6855bm.get(i).m5187c();
        m4825a(i, m5188d);
        if (m5187c == null || this.f6851bi == null) {
            return;
        }
        int colorForState = this.f6851bi.getColorForState(m4845e(i), this.f6851bi.getDefaultColor());
        textPaint = this.f6855bm.get(i).f7361h;
        textPaint.setColor(colorForState);
        invalidate();
    }

    public void setKeyboardViewEnabled(boolean z) {
        this.f6843ba = z;
    }

    public void setOnKeyboardCharListener(InterfaceC1554gl interfaceC1554gl) {
        this.f6811aT = interfaceC1554gl;
    }

    public void setKeyboardType(int i) {
        TextPaint textPaint;
        this.f6810aS = Typeface.DEFAULT;
        this.f6812aU = getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_security_keyboard_lower_letter_text_size);
        this.f6814aW = getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_security_keyboard_space_label_text_size);
        this.f6813aV = getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_security_keyboard_lower_letter_text_size);
        this.f6815aX = getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_security_keyboard_end_label_text_size);
        this.f6852bj = getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_security_numeric_keyboard_special_text_size);
        this.f6816aY = getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.oppo_password_kbd_symbols_special_symbols_textSize);
        this.f6817aZ = getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.oppo_password_kbd_skip_symbols_key_labelSize);
        this.f6846bd = getResources().getDimension(color.support.p043v7.appcompat.R.dimen.oppo_password_numeric_keyboard_line_width);
        this.f6849bg = getResources().getStringArray(color.support.p043v7.appcompat.R.array.color_security_numeric_keyboard_special_symbol);
        this.f6850bh = getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.color_security_numeric_keyboard_special_symbol_offset);
        this.f6847be = getResources().getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.color_security_password_numeric_delete_dimen_keyWidth);
        this.f6848bf = getResources().getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.color_security_password_numeric_special_height);
        this.f6847be = (int) (this.f6847be * C1545gc.m5158a(getContext()));
        this.f6848bf = (int) (this.f6848bf * C1545gc.m5158a(getContext()));
        this.f6846bd *= C1545gc.m5158a(getContext());
        this.f6850bh = (int) (this.f6850bh * C1545gc.m5158a(getContext()));
        int length = this.f6849bg.length;
        if (length >= 0) {
            for (int i2 = 0; i2 < length; i2++) {
                this.f6856bn.add(this.f6857bo.getConstantState().newDrawable());
                this.f6855bm.add(new C1552gj(this, this.f6856bn.get(i2), this.f6849bg[i2]));
            }
            for (int i3 = 0; i3 < length; i3++) {
                f6765aJ[i3] = new int[f6766aK.length];
                System.arraycopy(f6766aK, 0, f6765aJ[i3], 0, f6766aK.length);
            }
            this.f6858bp.clear();
            this.f6842b.clear();
            for (int i4 = 0; i4 < length; i4++) {
                this.f6858bp.add(new int[f6767aL]);
                this.f6842b.add(0);
                m4825a(i4, this.f6855bm.get(i4).m5188d());
                if (this.f6851bi != null) {
                    int colorForState = this.f6851bi.getColorForState(m4845e(i4), this.f6851bi.getDefaultColor());
                    textPaint = this.f6855bm.get(i4).f7361h;
                    textPaint.setColor(colorForState);
                }
            }
        }
    }

    /* renamed from: g */
    private boolean m4849g() {
        return this.f6859e.m5175f() == 3;
    }

    /* renamed from: a */
    private void m4824a(int i, int i2, C1546gd c1546gd) {
        if (this.f6802aG == null || !this.f6802aG.isEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        onInitializeAccessibilityEvent(obtain);
        String str = null;
        String charSequence = c1546gd.f7323b == null ? null : m4820a(c1546gd.f7323b).toString();
        if (i2 == 10) {
            str = getContext().getString(color.support.p043v7.appcompat.R.string.keyboardview_keycode_enter);
        } else {
            switch (i2) {
                case -7:
                    if (charSequence != null && charSequence.equals("?#+")) {
                        str = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_symbol);
                        break;
                    } else if (charSequence != null && charSequence.equals("$¥€")) {
                        str = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_moresymbols);
                        break;
                    }
                    break;
                case -6:
                    if (charSequence != null && charSequence.equals("ABC")) {
                        str = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_letters);
                        break;
                    } else if (charSequence != null && charSequence.equals("123")) {
                        str = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_number);
                        break;
                    }
                    break;
                case -5:
                    str = getContext().getString(color.support.p043v7.appcompat.R.string.keyboardview_keycode_delete);
                    break;
                default:
                    switch (i2) {
                        case -2:
                            if (charSequence != null && charSequence.equals("ABC")) {
                                str = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_letters);
                                break;
                            } else if (charSequence != null && charSequence.equals("?#+")) {
                                str = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_symbol);
                                break;
                            }
                            break;
                        case -1:
                            if (getNewShifted() == 2) {
                                str = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboard_view_keycode_low_shift);
                                break;
                            } else if (getNewShifted() == 0) {
                                str = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_initialcapitalization);
                                break;
                            } else if (getNewShifted() == 1) {
                                str = getContext().getString(color.support.p043v7.appcompat.R.string.color_keyboardview_keycode_capslock);
                                break;
                            }
                            break;
                        default:
                            str = String.valueOf((char) i2);
                            break;
                    }
            }
        }
        if (i2 == -5 || i2 == -2 || i2 == -1 || i2 == 10 || i2 == -6 || i2 == -7) {
            announceForAccessibility(str);
            return;
        }
        if (c1546gd.f7336o != null) {
            announceForAccessibility(c1546gd.f7336o.toString());
        } else if (c1546gd.f7323b != null) {
            announceForAccessibility(c1546gd.f7323b.toString());
        } else {
            obtain.getText().add(String.valueOf((char) i2));
            this.f6802aG.sendAccessibilityEvent(obtain);
        }
    }

    /* renamed from: g */
    private boolean m4850g(int i) {
        if (this.f6795a == null) {
            Log.d("SecurityKeyboardView", "handler is null");
            return false;
        }
        if (i == -1) {
            Log.d("SecurityKeyboardView", "handler isn't null and keyIndex is -1");
            this.f6795a.sendMessageDelayed(this.f6795a.obtainMessage(2), 75L);
            return false;
        }
        int i2 = this.f6772A[i].f7322a[0];
        if (this.f6772A[i].f7323b != null && i2 != -1 && i2 != -5 && i2 != -2 && i2 != 10 && i2 != 32 && i2 != -6 && i2 != -7) {
            return true;
        }
        this.f6795a.sendMessageDelayed(this.f6795a.obtainMessage(2), 75L);
        return false;
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m4839c(SecurityKeyboardView securityKeyboardView) {
        C1545gc c1545gc;
        boolean z = false;
        if (securityKeyboardView.f6825ah == 0 || securityKeyboardView.f6793V < 0 || securityKeyboardView.f6793V >= securityKeyboardView.f6772A.length) {
            return false;
        }
        C1546gd c1546gd = securityKeyboardView.f6772A[securityKeyboardView.f6793V];
        int i = c1546gd.f7339r;
        if (i != 0) {
            securityKeyboardView.f6874t = securityKeyboardView.f6880z.get(c1546gd);
            if (securityKeyboardView.f6874t == null) {
                securityKeyboardView.f6874t = ((LayoutInflater) securityKeyboardView.getContext().getSystemService("layout_inflater")).inflate(securityKeyboardView.f6825ah, (ViewGroup) null);
                securityKeyboardView.f6875u = (SecurityKeyboardView) securityKeyboardView.f6874t.findViewById(R.id.keyboardView);
                View findViewById = securityKeyboardView.f6874t.findViewById(R.id.closeButton);
                if (findViewById != null) {
                    findViewById.setOnClickListener(securityKeyboardView);
                }
                securityKeyboardView.f6875u.setOnKeyboardActionListener(new C1551gi(securityKeyboardView));
                if (c1546gd.f7335n != null) {
                    c1545gc = new C1545gc(securityKeyboardView.getContext(), i, c1546gd.f7335n, securityKeyboardView.getPaddingLeft() + securityKeyboardView.getPaddingRight());
                } else {
                    c1545gc = new C1545gc(securityKeyboardView.getContext(), i);
                }
                securityKeyboardView.f6875u.setKeyboard(c1545gc);
                securityKeyboardView.f6875u.setPopupParent(securityKeyboardView);
                securityKeyboardView.f6874t.measure(View.MeasureSpec.makeMeasureSpec(securityKeyboardView.getWidth(), RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(securityKeyboardView.getHeight(), RecyclerView.UNDEFINED_DURATION));
                securityKeyboardView.f6880z.put(c1546gd, securityKeyboardView.f6874t);
            } else {
                securityKeyboardView.f6875u = (SecurityKeyboardView) securityKeyboardView.f6874t.findViewById(R.id.keyboardView);
            }
            securityKeyboardView.getLocationInWindow(securityKeyboardView.f6872r);
            securityKeyboardView.f6822ae = c1546gd.f7330i + securityKeyboardView.getPaddingLeft();
            securityKeyboardView.f6823af = c1546gd.f7331j + securityKeyboardView.getPaddingTop();
            securityKeyboardView.f6822ae = (securityKeyboardView.f6822ae + c1546gd.f7326e) - securityKeyboardView.f6874t.getMeasuredWidth();
            securityKeyboardView.f6823af -= securityKeyboardView.f6874t.getMeasuredHeight();
            int paddingRight = securityKeyboardView.f6822ae + securityKeyboardView.f6874t.getPaddingRight() + securityKeyboardView.f6872r[0];
            int paddingBottom = securityKeyboardView.f6823af + securityKeyboardView.f6874t.getPaddingBottom() + securityKeyboardView.f6872r[1];
            SecurityKeyboardView securityKeyboardView2 = securityKeyboardView.f6875u;
            securityKeyboardView2.f6878x = paddingRight < 0 ? 0 : paddingRight;
            securityKeyboardView2.f6879y = paddingBottom;
            if (securityKeyboardView2.f6868n.isShowing()) {
                Log.d("SecurityKeyboardView", "PopupView is Showing");
                securityKeyboardView2.f6868n.dismiss();
            }
            securityKeyboardView.f6875u.setNewShifted(securityKeyboardView.getNewShifted());
            securityKeyboardView.f6873s.setContentView(securityKeyboardView.f6874t);
            securityKeyboardView.f6873s.setWidth(securityKeyboardView.f6874t.getMeasuredWidth());
            securityKeyboardView.f6873s.setHeight(securityKeyboardView.f6874t.getMeasuredHeight());
            securityKeyboardView.f6873s.showAtLocation(securityKeyboardView, 0, paddingRight, paddingBottom);
            securityKeyboardView.f6876v = true;
            securityKeyboardView.m4859a();
            z = true;
        }
        if (z) {
            securityKeyboardView.f6826ai = true;
            securityKeyboardView.m4821a(-1);
        }
        return z;
    }
}
