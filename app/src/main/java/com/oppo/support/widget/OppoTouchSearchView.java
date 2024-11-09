package com.oppo.support.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import com.color.support.util.C1336a;
import com.color.support.util.C1338c;
import com.coloros.neton.BuildConfig;
import com.facebook.rebound.C1875f;
import com.facebook.rebound.C1879j;
import com.facebook.rebound.C1885p;
import com.facebook.rebound.InterfaceC1883n;
import com.oppo.util.ColorOSHapticFeedbackUtils;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import neton.client.Utils.ResponseCode;

/* loaded from: classes.dex */
public class OppoTouchSearchView extends View implements View.OnClickListener {

    /* renamed from: e */
    private static int[][][] f10749e;

    /* renamed from: f */
    private static int[][] f10750f;

    /* renamed from: A */
    private boolean f10752A;

    /* renamed from: B */
    private CharSequence f10753B;

    /* renamed from: C */
    private CharSequence f10754C;

    /* renamed from: D */
    private int f10755D;

    /* renamed from: E */
    private int f10756E;

    /* renamed from: F */
    private int f10757F;

    /* renamed from: G */
    private PopupWindow f10758G;

    /* renamed from: H */
    private PopupWindow f10759H;

    /* renamed from: I */
    private int f10760I;

    /* renamed from: J */
    private int f10761J;

    /* renamed from: K */
    private int f10762K;

    /* renamed from: L */
    private int f10763L;

    /* renamed from: M */
    private int f10764M;

    /* renamed from: N */
    private int f10765N;

    /* renamed from: O */
    private int f10766O;

    /* renamed from: P */
    private int f10767P;

    /* renamed from: Q */
    private int f10768Q;

    /* renamed from: R */
    private int f10769R;

    /* renamed from: S */
    private int f10770S;

    /* renamed from: T */
    private int f10771T;

    /* renamed from: U */
    private int f10772U;

    /* renamed from: V */
    private int f10773V;

    /* renamed from: W */
    private int f10774W;

    /* renamed from: aA */
    private final C1879j f10775aA;

    /* renamed from: aB */
    private final InterfaceC1883n f10776aB;

    /* renamed from: aC */
    private Runnable f10777aC;

    /* renamed from: aD */
    private Handler f10778aD;

    /* renamed from: aE */
    private int[] f10779aE;

    /* renamed from: aa */
    private int f10780aa;

    /* renamed from: ab */
    private int f10781ab;

    /* renamed from: ac */
    private int f10782ac;

    /* renamed from: ad */
    private Rect f10783ad;

    /* renamed from: ae */
    private int f10784ae;

    /* renamed from: af */
    private TextView f10785af;

    /* renamed from: ag */
    private ScrollView f10786ag;

    /* renamed from: ah */
    private ViewGroup f10787ah;

    /* renamed from: ai */
    private LayoutInflater f10788ai;

    /* renamed from: aj */
    private int f10789aj;

    /* renamed from: ak */
    private int f10790ak;

    /* renamed from: al */
    private Drawable f10791al;

    /* renamed from: am */
    private ArrayList<C2471d> f10792am;

    /* renamed from: an */
    private ArrayList<C2471d> f10793an;

    /* renamed from: ao */
    private int f10794ao;

    /* renamed from: ap */
    private boolean f10795ap;

    /* renamed from: aq */
    private boolean f10796aq;

    /* renamed from: ar */
    private boolean f10797ar;

    /* renamed from: as */
    private ColorStateList f10798as;

    /* renamed from: at */
    private ColorStateList f10799at;

    /* renamed from: au */
    private ColorStateList f10800au;

    /* renamed from: av */
    private int f10801av;

    /* renamed from: aw */
    private int f10802aw;

    /* renamed from: ax */
    private Typeface f10803ax;

    /* renamed from: ay */
    private Drawable f10804ay;

    /* renamed from: az */
    private final C1875f f10805az;

    /* renamed from: b */
    protected List<Integer> f10806b;

    /* renamed from: h */
    private List<int[]> f10807h;

    /* renamed from: i */
    private Context f10808i;

    /* renamed from: j */
    private int f10809j;

    /* renamed from: k */
    private int f10810k;

    /* renamed from: l */
    private int f10811l;

    /* renamed from: m */
    private int f10812m;

    /* renamed from: n */
    private int f10813n;

    /* renamed from: o */
    private int f10814o;

    /* renamed from: p */
    private int f10815p;

    /* renamed from: q */
    private String[] f10816q;

    /* renamed from: r */
    private String[] f10817r;

    /* renamed from: s */
    private boolean f10818s;

    /* renamed from: t */
    private String[] f10819t;

    /* renamed from: u */
    private Drawable f10820u;

    /* renamed from: v */
    private InterfaceC2472e f10821v;

    /* renamed from: w */
    private boolean f10822w;

    /* renamed from: x */
    private boolean f10823x;

    /* renamed from: y */
    private boolean f10824y;

    /* renamed from: z */
    private boolean f10825z;

    /* renamed from: a */
    public static final Comparator<CharSequence> f10746a = new C2468a();

    /* renamed from: c */
    private static final Collator f10747c = Collator.getInstance();

    /* renamed from: d */
    private static final int[] f10748d = {R.attr.state_window_focused, 1, R.attr.state_selected, 2, R.attr.state_focused, 4, R.attr.state_enabled, 8, R.attr.state_pressed, 16, R.attr.state_activated, 32, R.attr.state_accelerated, 64, R.attr.state_hovered, 128, R.attr.state_drag_can_accept, 256, R.attr.state_drag_hovered, 512};

    /* renamed from: g */
    private static int f10751g = color.support.p043v7.appcompat.R.styleable.ViewDrawableStates.length;

    static {
        int length = f10748d.length / 2;
        if (length != f10751g) {
            throw new IllegalStateException("VIEW_STATE_IDS array length does not match ViewDrawableStates style array");
        }
        int[] iArr = new int[f10748d.length];
        for (int i = 0; i < f10751g; i++) {
            int i2 = color.support.p043v7.appcompat.R.styleable.ViewDrawableStates[i];
            for (int i3 = 0; i3 < f10748d.length; i3 += 2) {
                if (f10748d[i3] == i2) {
                    int i4 = i * 2;
                    iArr[i4] = i2;
                    iArr[i4 + 1] = f10748d[i3 + 1];
                }
            }
        }
        int i5 = 1 << length;
        f10749e = new int[i5][];
        f10750f = new int[i5];
        for (int i6 = 0; i6 < f10750f.length; i6++) {
            f10750f[i6] = new int[Integer.bitCount(i6)];
            int i7 = 0;
            for (int i8 = 0; i8 < iArr.length; i8 += 2) {
                if ((iArr[i8 + 1] & i6) != 0) {
                    f10750f[i6][i7] = iArr[i8];
                    i7++;
                }
            }
        }
    }

    public OppoTouchSearchView(Context context) {
        this(context, null);
    }

    public OppoTouchSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, color.support.p043v7.appcompat.R.attr.oppoTouchSearchViewStyle);
    }

    public OppoTouchSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10806b = new ArrayList();
        this.f10807h = new ArrayList();
        this.f10815p = 0;
        this.f10818s = false;
        this.f10822w = true;
        this.f10823x = false;
        this.f10824y = false;
        this.f10825z = false;
        this.f10752A = false;
        this.f10754C = BuildConfig.FLAVOR;
        this.f10782ac = -1;
        this.f10784ae = -1;
        this.f10789aj = -1;
        this.f10790ak = -1;
        this.f10791al = null;
        this.f10792am = new ArrayList<>();
        this.f10793an = new ArrayList<>();
        this.f10794ao = -1;
        this.f10795ap = false;
        this.f10796aq = false;
        this.f10797ar = false;
        this.f10798as = null;
        this.f10799at = null;
        this.f10800au = null;
        this.f10801av = 0;
        this.f10802aw = 0;
        this.f10803ax = null;
        this.f10805az = C1885p.m6031b();
        this.f10775aA = this.f10805az.m6006a();
        this.f10776aB = new C2469b(this);
        this.f10777aC = new RunnableC2470c(this);
        this.f10778aD = new Handler();
        this.f10779aE = new int[2];
        C1338c.m4375a(this, false);
        this.f10808i = context;
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView, i, 0);
        this.f10752A = obtainStyledAttributes.getBoolean(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoUnionEnable, true);
        this.f10755D = obtainStyledAttributes.getInt(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoBackgroundAlignMode, 0);
        this.f10756E = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoMarginLeft, 0);
        this.f10757F = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoMarginRigh, 0);
        this.f10763L = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoPopupWinFirstHeight, -1);
        if (-1 == this.f10763L) {
            this.f10763L = resources.getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_popup_first_default_height);
        }
        this.f10764M = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoPopupWinFirstWidth, -1);
        if (-1 == this.f10764M) {
            this.f10764M = resources.getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_popup_first_default_width);
        }
        this.f10765N = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoPopupWinSecondHeight, -1);
        if (-1 == this.f10765N) {
            this.f10765N = this.f10763L;
        }
        this.f10766O = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoPopupWinSecondWidth, -1);
        if (-1 == this.f10766O) {
            this.f10766O = this.f10764M;
        }
        this.f10761J = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoPopupWinSecondOffset, -1);
        if (-1 == this.f10761J) {
            this.f10761J = resources.getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_popupwin_default_offset);
        }
        this.f10762K = obtainStyledAttributes.getDimensionPixelOffset(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoPopupWinSecondMargin, -1);
        if (-1 == this.f10762K) {
            this.f10762K = resources.getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_popupwin_second_marginEnd);
        }
        this.f10772U = obtainStyledAttributes.getInteger(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoPopupWinMinTop, -1);
        if (-1 == this.f10772U) {
            this.f10772U = resources.getInteger(color.support.p043v7.appcompat.R.integer.oppo_touchsearch_popupwin_default_top_mincoordinate);
        }
        this.f10771T = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoPopupWinSecondTextSize, -1);
        if (-1 == this.f10771T) {
            this.f10771T = context.getResources().getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_popupwin_second_textsize);
        }
        this.f10774W = resources.getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_popupname_max_height);
        this.f10780aa = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoPopupWinFirstTextSize, -1);
        if (-1 == this.f10780aa) {
            this.f10780aa = resources.getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_popupwin_first_textsize);
        }
        this.f10781ab = resources.getColor(color.support.p043v7.appcompat.R.color.color_touchsearch_popup_text_color);
        this.f10781ab = obtainStyledAttributes.getColor(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoPopupWinFirstTextColor, this.f10781ab);
        this.f10757F += resources.getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_right_margin);
        this.f10773V = resources.getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_popupwin_right_margin);
        this.f10815p = resources.getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_char_offset);
        this.f10753B = resources.getString(color.support.p043v7.appcompat.R.string.oppo_touchsearch_dot);
        this.f10804ay = resources.getDrawable(color.support.p043v7.appcompat.R.drawable.oppo_touchsearch_point);
        this.f10791al = obtainStyledAttributes.getDrawable(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoKeyCollect);
        this.f10798as = obtainStyledAttributes.getColorStateList(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoKeyTextColor);
        this.f10795ap = obtainStyledAttributes.getBoolean(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoFirstIsCharacter, false);
        this.f10820u = resources.getDrawable(color.support.p043v7.appcompat.R.drawable.color_touchsearch_first_popup_bg, this.f10808i.getTheme());
        if (this.f10791al != null) {
            this.f10813n = this.f10791al.getIntrinsicWidth();
            this.f10814o = this.f10791al.getIntrinsicHeight();
        }
        this.f10801av = obtainStyledAttributes.getDimensionPixelSize(color.support.p043v7.appcompat.R.styleable.OppoTouchSearchView_oppoKeyTextSize, -1);
        if (-1 == this.f10801av) {
            this.f10801av = resources.getDimensionPixelSize(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_key_textsize);
        }
        if (-1 == this.f10784ae) {
            this.f10784ae = resources.getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.oppo_touchsearch_background_width);
        }
        if (!this.f10795ap) {
            this.f10816q = resources.getStringArray(color.support.p043v7.appcompat.R.array.normal_touchsearch_keys);
        } else {
            this.f10816q = resources.getStringArray(color.support.p043v7.appcompat.R.array.special_touchsearch_keys);
        }
        this.f10817r = resources.getStringArray(color.support.p043v7.appcompat.R.array.union_touchsearch_keys);
        this.f10788ai = (LayoutInflater) context.getSystemService("layout_inflater");
        View inflate = this.f10788ai.inflate(color.support.p043v7.appcompat.R.layout.oppo_touchsearch_poppup_firstkey, (ViewGroup) null);
        this.f10785af = (TextView) inflate.findViewById(color.support.p043v7.appcompat.R.id.touchsearch_popup_content_textview);
        this.f10780aa = (int) C1336a.m4370a(this.f10780aa, context.getResources().getConfiguration().fontScale, 4);
        this.f10785af.setTextSize(0, this.f10780aa);
        ViewGroup.LayoutParams layoutParams = this.f10785af.getLayoutParams();
        layoutParams.height = this.f10763L;
        layoutParams.width = this.f10764M;
        this.f10785af.setLayoutParams(layoutParams);
        this.f10785af.setBackground(this.f10820u);
        this.f10758G = new PopupWindow(context);
        C1338c.m4375a(this.f10785af, false);
        this.f10758G.setWidth(this.f10764M);
        this.f10758G.setHeight(this.f10763L);
        this.f10758G.setBackgroundDrawable(null);
        this.f10758G.setContentView(inflate);
        this.f10758G.setAnimationStyle(0);
        this.f10758G.setFocusable(false);
        this.f10758G.setOutsideTouchable(false);
        this.f10758G.setTouchable(false);
        View inflate2 = this.f10788ai.inflate(color.support.p043v7.appcompat.R.layout.oppo_touchsearch_second_name, (ViewGroup) null);
        this.f10786ag = (ScrollView) inflate2.findViewById(color.support.p043v7.appcompat.R.id.touchsearch_popup_content_scrollview);
        this.f10787ah = (ViewGroup) inflate2.findViewById(color.support.p043v7.appcompat.R.id.touchsearch_popup_content_name);
        this.f10759H = new PopupWindow(context);
        this.f10759H.setWidth(this.f10764M);
        this.f10759H.setContentView(inflate2);
        this.f10759H.setAnimationStyle(0);
        this.f10759H.setBackgroundDrawable(null);
        this.f10759H.setFocusable(false);
        this.f10759H.setOutsideTouchable(false);
        if (Build.VERSION.SDK_INT > 23) {
            this.f10758G.setEnterTransition(null);
            this.f10758G.setExitTransition(null);
            this.f10759H.setEnterTransition(null);
            this.f10759H.setExitTransition(null);
        }
        obtainStyledAttributes.recycle();
        if (!this.f10825z) {
            m7823c();
        } else {
            m7819b();
        }
    }

    /* renamed from: b */
    private void m7819b() {
        int length = this.f10817r.length;
        if (length <= 0) {
            return;
        }
        if (!this.f10795ap && this.f10791al != null) {
            this.f10793an.add(new C2471d(this, this.f10791al, null));
        }
        for (int characterStartIndex = getCharacterStartIndex(); characterStartIndex < length - 1; characterStartIndex += 2) {
            this.f10793an.add(new C2471d(this, null, this.f10817r[characterStartIndex]));
        }
        if (this.f10804ay != null) {
            for (int characterStartIndex2 = getCharacterStartIndex() + 1; characterStartIndex2 < length - 2; characterStartIndex2 += 2) {
                this.f10793an.add(new C2471d(this, this.f10804ay, null));
                C2471d c2471d = new C2471d(this);
                if (characterStartIndex2 == 2) {
                    c2471d.f10829b = "B";
                    c2471d.f10830c = "C";
                } else if (characterStartIndex2 == 4) {
                    c2471d.f10829b = "E";
                    c2471d.f10830c = "F";
                } else if (characterStartIndex2 == 6) {
                    c2471d.f10829b = "H";
                } else if (characterStartIndex2 == 8) {
                    c2471d.f10829b = "J";
                    c2471d.f10830c = "K";
                } else if (characterStartIndex2 == 10) {
                    c2471d.f10829b = "M";
                    c2471d.f10830c = "N";
                } else if (characterStartIndex2 == 12) {
                    c2471d.f10829b = "P";
                    c2471d.f10830c = "Q";
                } else if (characterStartIndex2 == 14) {
                    c2471d.f10829b = "S";
                } else if (characterStartIndex2 == 16) {
                    c2471d.f10829b = "U";
                    c2471d.f10830c = "V";
                } else if (characterStartIndex2 == 18) {
                    c2471d.f10829b = "X";
                    c2471d.f10830c = "Y";
                }
            }
        }
        this.f10793an.add(new C2471d(this, null, "#"));
    }

    /* renamed from: c */
    private void m7823c() {
        TextPaint textPaint;
        int length = this.f10816q.length;
        if (length <= 0) {
            return;
        }
        this.f10792am.clear();
        for (int i = 0; i < length; i++) {
            this.f10792am.add(new C2471d(this));
        }
        this.f10803ax = Typeface.DEFAULT;
        this.f10793an.clear();
        if (!this.f10795ap && this.f10791al != null) {
            this.f10793an.add(new C2471d(this, this.f10791al, null));
        }
        for (int characterStartIndex = getCharacterStartIndex(); characterStartIndex < length; characterStartIndex++) {
            this.f10793an.add(new C2471d(this, null, this.f10816q[characterStartIndex]));
        }
        this.f10793an.add(new C2471d(this, null, "#"));
        for (int i2 = 0; i2 < length; i2++) {
            f10749e[i2] = new int[f10750f.length];
            System.arraycopy(f10750f, 0, f10749e[i2], 0, f10750f.length);
        }
        this.f10807h.clear();
        this.f10806b.clear();
        for (int i3 = 0; i3 < length; i3++) {
            this.f10807h.add(new int[f10751g]);
            this.f10806b.add(0);
            m7815a(i3, this.f10793an.get(i3).m7838a());
            if (this.f10800au != null) {
                int colorForState = this.f10800au.getColorForState(m7817a(i3), this.f10800au.getDefaultColor());
                textPaint = this.f10793an.get(i3).f10836i;
                textPaint.setColor(colorForState);
            }
        }
    }

    /* renamed from: a */
    private void m7815a(int i, Drawable drawable) {
        this.f10806b.set(i, Integer.valueOf(this.f10806b.get(i).intValue() | 1024));
        m7820b(i, drawable);
    }

    /* renamed from: b */
    private void m7820b(int i, Drawable drawable) {
        int[] m7817a = m7817a(i);
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(m7817a);
    }

    /* renamed from: a */
    private int[] m7817a(int i) {
        int intValue = this.f10806b.get(i).intValue();
        if ((intValue & 1024) != 0) {
            this.f10807h.set(i, m7821b(i));
            this.f10806b.set(i, Integer.valueOf(intValue & (-1025)));
        }
        return this.f10807h.get(i);
    }

    /* renamed from: b */
    private int[] m7821b(int i) {
        int intValue = this.f10806b.get(i).intValue();
        int i2 = (this.f10806b.get(i).intValue() & 16384) != 0 ? 16 : 0;
        if ((intValue & 32) == 0) {
            i2 |= 8;
        }
        if (hasWindowFocus()) {
            i2 |= 1;
        }
        return f10749e[i][i2];
    }

    /* renamed from: a */
    private void m7816a(int i, boolean z) {
        int intValue = this.f10806b.get(i).intValue();
        this.f10806b.set(i, Integer.valueOf(z ? intValue | 16384 : intValue & (-16385)));
    }

    private void setItemRestore(int i) {
        TextPaint textPaint;
        m7816a(i, false);
        m7815a(i, this.f10793an.get(i).m7838a());
        m7827e();
        if (this.f10800au != null) {
            int colorForState = this.f10800au.getColorForState(m7817a(i), this.f10800au.getDefaultColor());
            textPaint = this.f10793an.get(i).f10836i;
            textPaint.setColor(colorForState);
            m7827e();
        }
        invalidate();
    }

    private int getCharacterStartIndex() {
        return !this.f10795ap ? 1 : 0;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f10824y = true;
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10775aA.m6017a(this.f10776aB);
        this.f10775aA.m6019b();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10775aA.m6025g();
        if (-1 != this.f10794ao && this.f10789aj != this.f10794ao && this.f10794ao < this.f10816q.length) {
            setItemRestore(this.f10794ao);
        }
        if (!this.f10825z) {
            int length = this.f10816q.length;
            if (this.f10789aj >= 0 && this.f10789aj < length) {
                setItemRestore(this.f10789aj);
                m7827e();
            }
            this.f10794ao = -1;
        }
        if (this.f10758G.isShowing()) {
            m7834i();
        }
        if (this.f10759H.isShowing()) {
            this.f10759H.dismiss();
        }
    }

    /* renamed from: d */
    private void m7825d() {
        if (!this.f10752A) {
            this.f10825z = false;
            return;
        }
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        this.f10809j = getWidth();
        this.f10810k = height / this.f10816q.length;
        if (this.f10810k < this.f10814o && this.f10810k < 0) {
            this.f10814o = this.f10810k;
            this.f10813n = this.f10810k;
        }
        this.f10825z = false;
    }

    /* renamed from: e */
    private void m7827e() {
        m7825d();
        if (m7833h()) {
            int length = this.f10816q.length;
            int paddingTop = getPaddingTop();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            this.f10809j = getWidth();
            this.f10810k = height / length;
            int i = paddingTop + ((height % length) >> 1);
            this.f10812m = (this.f10810k - this.f10814o) / 2;
            if (this.f10783ad != null) {
                this.f10811l = this.f10783ad.left + (((this.f10783ad.right - this.f10783ad.left) - this.f10813n) / 2);
            }
            int i2 = i;
            for (int i3 = 0; i3 < length; i3++) {
                this.f10792am.get(i3).f10831d = this.f10811l + 0;
                this.f10792am.get(i3).f10832e = this.f10812m + i2;
                i2 += this.f10810k;
            }
        }
    }

    public void setPopupTextView(String str) {
        m7835j();
        setTouchBarSelectedText(str);
    }

    public void setTouchBarSelectedText(String str) {
        this.f10785af.setText(str);
        this.f10794ao = this.f10789aj;
        this.f10789aj = (str.charAt(0) - 'A') + 1;
        this.f10754C = str;
        if (str.equals("#")) {
            this.f10789aj = 1;
        }
        int length = this.f10816q.length;
        if (this.f10789aj < 0 || this.f10789aj > length - 1) {
            return;
        }
        m7829f();
    }

    public PopupWindow getPopupWindow() {
        return this.f10758G;
    }

    public void setTouchSearchActionListener(InterfaceC2472e interfaceC2472e) {
        this.f10821v = interfaceC2472e;
    }

    public InterfaceC2472e getTouchSearchActionListener() {
        return this.f10821v;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f10822w || this.f10824y) {
            if (this.f10755D == 0) {
                i5 = (getWidth() - this.f10784ae) / 2;
                i6 = this.f10784ae + i5;
            } else if (this.f10755D == 2) {
                i6 = getWidth() - this.f10757F;
                i5 = i6 - this.f10784ae;
            } else {
                i5 = this.f10756E;
                i6 = this.f10784ae + i5;
            }
            this.f10783ad = new Rect(i5, 0, i6, getBottom() - getTop());
            m7827e();
            if (this.f10822w) {
                this.f10822w = false;
            }
            if (this.f10824y) {
                this.f10824y = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppo.support.widget.OppoTouchSearchView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: f */
    private void m7829f() {
        TextPaint textPaint;
        if (this.f10789aj != this.f10794ao && -1 != this.f10789aj) {
            m7831g();
        }
        if (this.f10825z) {
            return;
        }
        if (this.f10789aj != this.f10794ao && -1 != this.f10789aj) {
            this.f10796aq = true;
            m7816a(this.f10789aj, true);
            Drawable m7838a = this.f10793an.get(this.f10789aj).m7838a();
            this.f10793an.get(this.f10789aj);
            m7815a(this.f10789aj, m7838a);
            if (this.f10800au != null) {
                int colorForState = this.f10800au.getColorForState(m7817a(this.f10789aj), this.f10800au.getDefaultColor());
                textPaint = this.f10793an.get(this.f10789aj).f10836i;
                textPaint.setColor(colorForState);
                invalidate();
            }
            m7827e();
        }
        if (-1 != this.f10794ao && this.f10789aj != this.f10794ao && this.f10794ao < this.f10816q.length) {
            setItemRestore(this.f10794ao);
        }
        this.f10794ao = this.f10789aj;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        TextPaint textPaint;
        TextPaint textPaint2;
        TextPaint textPaint3;
        TextPaint textPaint4;
        TextPaint textPaint5;
        TextPaint textPaint6;
        TextPaint textPaint7;
        TextPaint textPaint8;
        super.onDraw(canvas);
        if (!this.f10825z) {
            if (m7833h()) {
                if (!this.f10795ap && this.f10792am.size() > 0 && this.f10793an.get(0).m7838a() != null) {
                    int i2 = this.f10792am.get(0).f10831d;
                    int i3 = this.f10792am.get(0).f10832e;
                    this.f10791al.setBounds(i2, i3, this.f10813n + i2, this.f10814o + i3);
                    this.f10791al.draw(canvas);
                }
                int length = this.f10816q.length;
                for (int characterStartIndex = getCharacterStartIndex(); characterStartIndex < length; characterStartIndex++) {
                    textPaint7 = this.f10793an.get(characterStartIndex).f10836i;
                    Paint.FontMetricsInt fontMetricsInt = textPaint7.getFontMetricsInt();
                    textPaint8 = this.f10793an.get(characterStartIndex).f10836i;
                    String str = this.f10816q[characterStartIndex];
                    if (str != null && this.f10792am.size() > 0) {
                        canvas.drawText(str, this.f10792am.get(characterStartIndex).f10831d + ((this.f10813n - ((int) textPaint8.measureText(str))) / 2), this.f10792am.get(characterStartIndex).f10832e + (((this.f10814o - (fontMetricsInt.bottom - fontMetricsInt.top)) / 2) - fontMetricsInt.top), textPaint8);
                    }
                }
                int i4 = length - 1;
                if (this.f10792am.size() <= 0 || this.f10793an.get(i4).m7838a() == null) {
                    return;
                }
                textPaint5 = this.f10793an.get(i4).f10836i;
                Paint.FontMetricsInt fontMetricsInt2 = textPaint5.getFontMetricsInt();
                textPaint6 = this.f10793an.get(i4).f10836i;
                canvas.drawText("#", this.f10792am.get(i4).f10831d + ((this.f10813n - ((int) textPaint6.measureText("#"))) / 2), this.f10792am.get(i4).f10832e + (((this.f10814o - (fontMetricsInt2.bottom - fontMetricsInt2.top)) / 2) - fontMetricsInt2.top), textPaint6);
                return;
            }
            return;
        }
        if (!this.f10795ap && this.f10793an.get(0).m7838a() != null) {
            int i5 = this.f10792am.get(0).f10831d;
            int i6 = this.f10792am.get(0).f10832e;
            this.f10791al.setBounds(i5, i6, this.f10813n + i5, this.f10814o + i6);
            this.f10791al.draw(canvas);
        }
        int length2 = this.f10817r.length;
        int characterStartIndex2 = getCharacterStartIndex();
        while (true) {
            i = length2 - 1;
            if (characterStartIndex2 >= i) {
                break;
            }
            textPaint3 = this.f10793an.get(characterStartIndex2).f10836i;
            Paint.FontMetricsInt fontMetricsInt3 = textPaint3.getFontMetricsInt();
            textPaint4 = this.f10793an.get(characterStartIndex2).f10836i;
            String str2 = this.f10816q[characterStartIndex2];
            if (str2 != null) {
                canvas.drawText(str2, this.f10792am.get(characterStartIndex2).f10831d + ((this.f10813n - ((int) textPaint4.measureText(str2))) / 2), this.f10792am.get(characterStartIndex2).f10832e + (((this.f10814o - (fontMetricsInt3.bottom - fontMetricsInt3.top)) / 2) - fontMetricsInt3.top), textPaint4);
            }
            characterStartIndex2 += 2;
        }
        for (int characterStartIndex3 = getCharacterStartIndex() + 1; characterStartIndex3 < length2 - 2; characterStartIndex3 += 2) {
            if (this.f10793an.get(characterStartIndex3).m7838a() != null) {
                int i7 = this.f10792am.get(characterStartIndex3).f10831d;
                int i8 = this.f10792am.get(characterStartIndex3).f10832e;
                this.f10804ay.setBounds(i7, i8, this.f10813n + i7, this.f10814o + i8);
                this.f10804ay.draw(canvas);
            }
        }
        if (this.f10793an.get(i).m7838a() != null) {
            textPaint = this.f10793an.get(i).f10836i;
            Paint.FontMetricsInt fontMetricsInt4 = textPaint.getFontMetricsInt();
            textPaint2 = this.f10793an.get(i).f10836i;
            canvas.drawText("#", this.f10792am.get(i).f10831d + ((this.f10813n - ((int) textPaint2.measureText("#"))) / 2), this.f10792am.get(i).f10832e + (((this.f10814o - (fontMetricsInt4.bottom - fontMetricsInt4.top)) / 2) - fontMetricsInt4.top), textPaint2);
        }
    }

    /* renamed from: g */
    private void m7831g() {
        ColorOSHapticFeedbackUtils.performHapticFeedback(this, ResponseCode.CODE_3XX_FOUND, 0);
    }

    public void setUnionEnable(boolean z) {
        if (this.f10752A != z) {
            this.f10752A = z;
            m7827e();
            invalidate();
        }
    }

    public void setFirstKeyPopupDrawable(Drawable drawable) {
        if (drawable != null) {
            this.f10785af.setText((CharSequence) null);
            this.f10785af.setBackground(drawable);
        } else {
            this.f10785af.setText(this.f10793an.get(this.f10789aj).f10834g);
            this.f10785af.setBackground(this.f10820u);
        }
    }

    public void setPopupWindowTopMinCoordinate(int i) {
        if (this.f10772U != i) {
            this.f10772U = i;
        }
    }

    public void setPopupWindowFirstTextSize(int i) {
        if (this.f10780aa != i) {
            this.f10780aa = i;
            this.f10785af.setTextSize(0, this.f10780aa);
        }
    }

    public void setPopupWindowTextColor(int i) {
        if (this.f10781ab != i) {
            this.f10781ab = i;
            this.f10785af.setTextColor(this.f10781ab);
            invalidate();
        }
    }

    public void setCharTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f10799at = colorStateList;
        }
    }

    public void setCharTextSize(int i) {
        if (i != 0) {
            this.f10802aw = i;
        }
    }

    /* renamed from: h */
    private boolean m7833h() {
        if (this.f10819t == null) {
            return true;
        }
        return !this.f10819t[0].equals(" ") && this.f10819t.length >= 5;
    }

    /* renamed from: i */
    private void m7834i() {
        this.f10775aA.m6015a(0.0d);
        this.f10778aD.postDelayed(this.f10777aC, 1000L);
    }

    /* renamed from: j */
    private void m7835j() {
        if (!this.f10758G.isShowing()) {
            this.f10758G.showAtLocation(this, 0, this.f10767P, this.f10768Q);
        }
        this.f10775aA.m6019b();
        this.f10775aA.m6015a(1.0d);
        this.f10778aD.removeCallbacks(this.f10777aC);
    }

    public void setName(String[] strArr) {
        int length = strArr == null ? 0 : strArr.length;
        if (length == 0) {
            return;
        }
        int childCount = this.f10787ah.getChildCount();
        if (length > childCount) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.f10764M, this.f10763L);
            for (int i = 0; i < length - childCount; i++) {
                TextView textView = (TextView) this.f10788ai.inflate(color.support.p043v7.appcompat.R.layout.oppo_touchsearch_popup_content_item, (ViewGroup) null);
                textView.setTextSize(0, (int) C1336a.m4370a(this.f10771T, this.f10808i.getResources().getConfiguration().fontScale, 4));
                this.f10787ah.addView(textView, layoutParams);
                textView.setOnClickListener(this);
            }
        } else {
            for (int i2 = 0; i2 < childCount - length; i2++) {
                this.f10787ah.removeViewAt((childCount - i2) - 1);
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            ((TextView) this.f10787ah.getChildAt(i3)).setText(strArr[i3]);
        }
        int i4 = ((ViewGroup.MarginLayoutParams) this.f10785af.getLayoutParams()).topMargin;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10786ag.getLayoutParams();
        this.f10760I = length * this.f10765N;
        this.f10760I = Math.min(this.f10760I, this.f10774W);
        marginLayoutParams.height = this.f10760I;
        this.f10786ag.setLayoutParams(marginLayoutParams);
        this.f10770S = (this.f10768Q + i4) - ((this.f10760I - this.f10763L) / 2);
        int height = ((this.f10779aE[1] + getHeight()) + this.f10761J) - this.f10760I;
        int i5 = this.f10779aE[1] - this.f10761J;
        if (this.f10770S < i5) {
            this.f10770S = i5;
        } else if (this.f10770S > height) {
            this.f10770S = height;
        }
        m7836k();
    }

    /* renamed from: k */
    private void m7836k() {
        if (this.f10759H.isShowing()) {
            this.f10759H.update(this.f10769R, this.f10770S, this.f10766O, this.f10760I);
            return;
        }
        this.f10759H.setWidth(this.f10766O);
        this.f10759H.setHeight(this.f10760I);
        this.f10759H.showAtLocation(this, 0, this.f10769R, this.f10770S);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ((TextView) view).getText();
    }

    public void setFirstKeyIsCharacter(boolean z) {
        this.f10795ap = z;
    }
}
