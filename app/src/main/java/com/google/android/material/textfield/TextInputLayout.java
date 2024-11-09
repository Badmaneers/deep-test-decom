package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0192ak;
import androidx.appcompat.widget.C0218bj;
import androidx.appcompat.widget.C0276dn;
import androidx.core.content.C0420a;
import androidx.core.graphics.C0542a;
import androidx.core.graphics.drawable.C0546a;
import androidx.core.p022e.C0454a;
import androidx.core.p024g.C0525j;
import androidx.core.p024g.C0538w;
import androidx.core.widget.C0577o;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.C2243al;
import com.google.android.material.internal.C2250as;
import com.google.android.material.internal.C2258c;
import com.google.android.material.internal.C2261f;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.p072a.C2032a;
import com.google.android.material.p073b.C2063a;
import com.google.android.material.p079h.C2221d;
import com.google.android.material.p082k.C2295h;
import com.google.android.material.p082k.C2303p;
import com.google.android.material.p082k.C2304q;
import com.google.android.material.theme.p084a.C2402a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: d */
    private static final int f10437d = R.style.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private boolean f10438A;

    /* renamed from: B */
    private CharSequence f10439B;

    /* renamed from: C */
    private boolean f10440C;

    /* renamed from: D */
    private C2295h f10441D;

    /* renamed from: E */
    private C2295h f10442E;

    /* renamed from: F */
    private C2303p f10443F;

    /* renamed from: G */
    private final int f10444G;

    /* renamed from: H */
    private int f10445H;

    /* renamed from: I */
    private final int f10446I;

    /* renamed from: J */
    private int f10447J;

    /* renamed from: K */
    private final int f10448K;

    /* renamed from: L */
    private final int f10449L;

    /* renamed from: M */
    private int f10450M;

    /* renamed from: N */
    private int f10451N;

    /* renamed from: O */
    private final Rect f10452O;

    /* renamed from: P */
    private final Rect f10453P;

    /* renamed from: Q */
    private final RectF f10454Q;

    /* renamed from: R */
    private Typeface f10455R;

    /* renamed from: S */
    private final CheckableImageButton f10456S;

    /* renamed from: T */
    private ColorStateList f10457T;

    /* renamed from: U */
    private boolean f10458U;

    /* renamed from: V */
    private PorterDuff.Mode f10459V;

    /* renamed from: W */
    private boolean f10460W;

    /* renamed from: a */
    EditText f10461a;

    /* renamed from: aA */
    private final int f10462aA;

    /* renamed from: aB */
    private final int f10463aB;

    /* renamed from: aC */
    private int f10464aC;

    /* renamed from: aD */
    private boolean f10465aD;

    /* renamed from: aE */
    private boolean f10466aE;

    /* renamed from: aF */
    private ValueAnimator f10467aF;

    /* renamed from: aG */
    private boolean f10468aG;

    /* renamed from: aH */
    private boolean f10469aH;

    /* renamed from: aa */
    private Drawable f10470aa;

    /* renamed from: ab */
    private int f10471ab;

    /* renamed from: ac */
    private View.OnLongClickListener f10472ac;

    /* renamed from: ad */
    private final LinkedHashSet<InterfaceC2374al> f10473ad;

    /* renamed from: ae */
    private int f10474ae;

    /* renamed from: af */
    private final SparseArray<AbstractC2398w> f10475af;

    /* renamed from: ag */
    private final CheckableImageButton f10476ag;

    /* renamed from: ah */
    private final LinkedHashSet<InterfaceC2375am> f10477ah;

    /* renamed from: ai */
    private ColorStateList f10478ai;

    /* renamed from: aj */
    private boolean f10479aj;

    /* renamed from: ak */
    private PorterDuff.Mode f10480ak;

    /* renamed from: al */
    private boolean f10481al;

    /* renamed from: am */
    private Drawable f10482am;

    /* renamed from: an */
    private int f10483an;

    /* renamed from: ao */
    private Drawable f10484ao;

    /* renamed from: ap */
    private View.OnLongClickListener f10485ap;

    /* renamed from: aq */
    private final CheckableImageButton f10486aq;

    /* renamed from: ar */
    private ColorStateList f10487ar;

    /* renamed from: as */
    private ColorStateList f10488as;

    /* renamed from: at */
    private ColorStateList f10489at;

    /* renamed from: au */
    private int f10490au;

    /* renamed from: av */
    private int f10491av;

    /* renamed from: aw */
    private int f10492aw;

    /* renamed from: ax */
    private ColorStateList f10493ax;

    /* renamed from: ay */
    private int f10494ay;

    /* renamed from: az */
    private final int f10495az;

    /* renamed from: b */
    boolean f10496b;

    /* renamed from: c */
    final C2258c f10497c;

    /* renamed from: e */
    private final FrameLayout f10498e;

    /* renamed from: f */
    private final LinearLayout f10499f;

    /* renamed from: g */
    private final LinearLayout f10500g;

    /* renamed from: h */
    private final FrameLayout f10501h;

    /* renamed from: i */
    private CharSequence f10502i;

    /* renamed from: j */
    private final C2399x f10503j;

    /* renamed from: k */
    private int f10504k;

    /* renamed from: l */
    private boolean f10505l;

    /* renamed from: m */
    private TextView f10506m;

    /* renamed from: n */
    private int f10507n;

    /* renamed from: o */
    private int f10508o;

    /* renamed from: p */
    private CharSequence f10509p;

    /* renamed from: q */
    private boolean f10510q;

    /* renamed from: r */
    private TextView f10511r;

    /* renamed from: s */
    private ColorStateList f10512s;

    /* renamed from: t */
    private int f10513t;

    /* renamed from: u */
    private ColorStateList f10514u;

    /* renamed from: v */
    private ColorStateList f10515v;

    /* renamed from: w */
    private CharSequence f10516w;

    /* renamed from: x */
    private final TextView f10517x;

    /* renamed from: y */
    private CharSequence f10518y;

    /* renamed from: z */
    private final TextView f10519z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(C2402a.m7691a(context, attributeSet, i, f10437d), attributeSet, i);
        this.f10503j = new C2399x(this);
        this.f10452O = new Rect();
        this.f10453P = new Rect();
        this.f10454Q = new RectF();
        this.f10473ad = new LinkedHashSet<>();
        this.f10474ae = 0;
        this.f10475af = new SparseArray<>();
        this.f10477ah = new LinkedHashSet<>();
        this.f10497c = new C2258c(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.f10498e = new FrameLayout(context2);
        this.f10498e.setAddStatesFromChildren(true);
        addView(this.f10498e);
        this.f10499f = new LinearLayout(context2);
        this.f10499f.setOrientation(0);
        this.f10499f.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        this.f10498e.addView(this.f10499f);
        this.f10500g = new LinearLayout(context2);
        this.f10500g.setOrientation(0);
        this.f10500g.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        this.f10498e.addView(this.f10500g);
        this.f10501h = new FrameLayout(context2);
        this.f10501h.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.f10497c.m7148a(C2032a.f8973a);
        this.f10497c.m7160b(C2032a.f8973a);
        this.f10497c.m7158b(8388659);
        C0276dn m7100b = C2243al.m7100b(context2, attributeSet, R.styleable.TextInputLayout, i, f10437d, R.styleable.TextInputLayout_counterTextAppearance, R.styleable.TextInputLayout_counterOverflowTextAppearance, R.styleable.TextInputLayout_errorTextAppearance, R.styleable.TextInputLayout_helperTextTextAppearance, R.styleable.TextInputLayout_hintTextAppearance);
        this.f10438A = m7100b.m949a(R.styleable.TextInputLayout_hintEnabled, true);
        setHint(m7100b.m954c(R.styleable.TextInputLayout_android_hint));
        this.f10466aE = m7100b.m949a(R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.f10443F = C2303p.m7300a(context2, attributeSet, i, f10437d).m7327a();
        this.f10444G = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f10446I = m7100b.m955d(R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f10448K = m7100b.m958e(R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f10449L = m7100b.m958e(R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f10447J = this.f10448K;
        float m961g = m7100b.m961g(R.styleable.TextInputLayout_boxCornerRadiusTopStart);
        float m961g2 = m7100b.m961g(R.styleable.TextInputLayout_boxCornerRadiusTopEnd);
        float m961g3 = m7100b.m961g(R.styleable.TextInputLayout_boxCornerRadiusBottomEnd);
        float m961g4 = m7100b.m961g(R.styleable.TextInputLayout_boxCornerRadiusBottomStart);
        C2304q m7313k = this.f10443F.m7313k();
        if (m961g >= 0.0f) {
            m7313k.m7336c(m961g);
        }
        if (m961g2 >= 0.0f) {
            m7313k.m7339d(m961g2);
        }
        if (m961g3 >= 0.0f) {
            m7313k.m7342e(m961g3);
        }
        if (m961g4 >= 0.0f) {
            m7313k.m7344f(m961g4);
        }
        this.f10443F = m7313k.m7327a();
        ColorStateList m7046a = C2221d.m7046a(context2, m7100b, R.styleable.TextInputLayout_boxBackgroundColor);
        if (m7046a != null) {
            this.f10494ay = m7046a.getDefaultColor();
            this.f10451N = this.f10494ay;
            if (m7046a.isStateful()) {
                this.f10495az = m7046a.getColorForState(new int[]{-16842910}, -1);
                this.f10462aA = m7046a.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.f10463aB = m7046a.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.f10462aA = this.f10494ay;
                ColorStateList m45a = C0057a.m45a(context2, R.color.mtrl_filled_background_color);
                this.f10495az = m45a.getColorForState(new int[]{-16842910}, -1);
                this.f10463aB = m45a.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.f10451N = 0;
            this.f10494ay = 0;
            this.f10495az = 0;
            this.f10462aA = 0;
            this.f10463aB = 0;
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList m960f = m7100b.m960f(R.styleable.TextInputLayout_android_textColorHint);
            this.f10489at = m960f;
            this.f10488as = m960f;
        }
        ColorStateList m7046a2 = C2221d.m7046a(context2, m7100b, R.styleable.TextInputLayout_boxStrokeColor);
        this.f10492aw = m7100b.m950b(R.styleable.TextInputLayout_boxStrokeColor, 0);
        this.f10490au = C0420a.m1488c(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f10464aC = C0420a.m1488c(context2, R.color.mtrl_textinput_disabled_color);
        this.f10491av = C0420a.m1488c(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (m7046a2 != null) {
            setBoxStrokeColorStateList(m7046a2);
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(C2221d.m7046a(context2, m7100b, R.styleable.TextInputLayout_boxStrokeErrorColor));
        }
        if (m7100b.m962g(R.styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(m7100b.m962g(R.styleable.TextInputLayout_hintTextAppearance, 0));
        }
        int m962g = m7100b.m962g(R.styleable.TextInputLayout_errorTextAppearance, 0);
        CharSequence m954c = m7100b.m954c(R.styleable.TextInputLayout_errorContentDescription);
        boolean m949a = m7100b.m949a(R.styleable.TextInputLayout_errorEnabled, false);
        this.f10486aq = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) this.f10500g, false);
        this.f10486aq.setVisibility(8);
        if (m7100b.m964i(R.styleable.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(m7100b.m948a(R.styleable.TextInputLayout_errorIconDrawable));
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(C2221d.m7046a(context2, m7100b, R.styleable.TextInputLayout_errorIconTint));
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(C2250as.m7109a(m7100b.m946a(R.styleable.TextInputLayout_errorIconTintMode, -1), (PorterDuff.Mode) null));
        }
        this.f10486aq.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        C0538w.m1840a((View) this.f10486aq, 2);
        this.f10486aq.setClickable(false);
        this.f10486aq.setPressable(false);
        this.f10486aq.setFocusable(false);
        int m962g2 = m7100b.m962g(R.styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean m949a2 = m7100b.m949a(R.styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence m954c2 = m7100b.m954c(R.styleable.TextInputLayout_helperText);
        int m962g3 = m7100b.m962g(R.styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence m954c3 = m7100b.m954c(R.styleable.TextInputLayout_placeholderText);
        int m962g4 = m7100b.m962g(R.styleable.TextInputLayout_prefixTextAppearance, 0);
        CharSequence m954c4 = m7100b.m954c(R.styleable.TextInputLayout_prefixText);
        int m962g5 = m7100b.m962g(R.styleable.TextInputLayout_suffixTextAppearance, 0);
        CharSequence m954c5 = m7100b.m954c(R.styleable.TextInputLayout_suffixText);
        boolean m949a3 = m7100b.m949a(R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(m7100b.m946a(R.styleable.TextInputLayout_counterMaxLength, -1));
        this.f10508o = m7100b.m962g(R.styleable.TextInputLayout_counterTextAppearance, 0);
        this.f10507n = m7100b.m962g(R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        this.f10456S = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this.f10499f, false);
        this.f10456S.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (m7100b.m964i(R.styleable.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(m7100b.m948a(R.styleable.TextInputLayout_startIconDrawable));
            if (m7100b.m964i(R.styleable.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(m7100b.m954c(R.styleable.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(m7100b.m949a(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_startIconTint)) {
            setStartIconTintList(C2221d.m7046a(context2, m7100b, R.styleable.TextInputLayout_startIconTint));
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(C2250as.m7109a(m7100b.m946a(R.styleable.TextInputLayout_startIconTintMode, -1), (PorterDuff.Mode) null));
        }
        setBoxBackgroundMode(m7100b.m946a(R.styleable.TextInputLayout_boxBackgroundMode, 0));
        this.f10476ag = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) this.f10501h, false);
        this.f10501h.addView(this.f10476ag);
        this.f10476ag.setVisibility(8);
        this.f10475af.append(-1, new C2385j(this));
        this.f10475af.append(0, new C2363aa(this));
        this.f10475af.append(1, new C2364ab(this));
        this.f10475af.append(2, new C2362a(this));
        this.f10475af.append(3, new C2387l(this));
        if (m7100b.m964i(R.styleable.TextInputLayout_endIconMode)) {
            setEndIconMode(m7100b.m946a(R.styleable.TextInputLayout_endIconMode, 0));
            if (m7100b.m964i(R.styleable.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(m7100b.m948a(R.styleable.TextInputLayout_endIconDrawable));
            }
            if (m7100b.m964i(R.styleable.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(m7100b.m954c(R.styleable.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(m7100b.m949a(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (m7100b.m964i(R.styleable.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(m7100b.m949a(R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(m7100b.m948a(R.styleable.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(m7100b.m954c(R.styleable.TextInputLayout_passwordToggleContentDescription));
            if (m7100b.m964i(R.styleable.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(C2221d.m7046a(context2, m7100b, R.styleable.TextInputLayout_passwordToggleTint));
            }
            if (m7100b.m964i(R.styleable.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(C2250as.m7109a(m7100b.m946a(R.styleable.TextInputLayout_passwordToggleTintMode, -1), (PorterDuff.Mode) null));
            }
        }
        if (!m7100b.m964i(R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (m7100b.m964i(R.styleable.TextInputLayout_endIconTint)) {
                setEndIconTintList(C2221d.m7046a(context2, m7100b, R.styleable.TextInputLayout_endIconTint));
            }
            if (m7100b.m964i(R.styleable.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(C2250as.m7109a(m7100b.m946a(R.styleable.TextInputLayout_endIconTintMode, -1), (PorterDuff.Mode) null));
            }
        }
        this.f10517x = new AppCompatTextView(context2);
        this.f10517x.setId(R.id.textinput_prefix_text);
        this.f10517x.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        C0538w.m1882k(this.f10517x);
        this.f10499f.addView(this.f10456S);
        this.f10499f.addView(this.f10517x);
        this.f10519z = new AppCompatTextView(context2);
        this.f10519z.setId(R.id.textinput_suffix_text);
        this.f10519z.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        C0538w.m1882k(this.f10519z);
        this.f10500g.addView(this.f10519z);
        this.f10500g.addView(this.f10486aq);
        this.f10500g.addView(this.f10501h);
        setHelperTextEnabled(m949a2);
        setHelperText(m954c2);
        setHelperTextTextAppearance(m962g2);
        setErrorEnabled(m949a);
        setErrorTextAppearance(m962g);
        setErrorContentDescription(m954c);
        setCounterTextAppearance(this.f10508o);
        setCounterOverflowTextAppearance(this.f10507n);
        setPlaceholderText(m954c3);
        setPlaceholderTextAppearance(m962g3);
        setPrefixText(m954c4);
        setPrefixTextAppearance(m962g4);
        setSuffixText(m954c5);
        setSuffixTextAppearance(m962g5);
        if (m7100b.m964i(R.styleable.TextInputLayout_errorTextColor)) {
            setErrorTextColor(m7100b.m960f(R.styleable.TextInputLayout_errorTextColor));
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(m7100b.m960f(R.styleable.TextInputLayout_helperTextTextColor));
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_hintTextColor)) {
            setHintTextColor(m7100b.m960f(R.styleable.TextInputLayout_hintTextColor));
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_counterTextColor)) {
            setCounterTextColor(m7100b.m960f(R.styleable.TextInputLayout_counterTextColor));
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(m7100b.m960f(R.styleable.TextInputLayout_counterOverflowTextColor));
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(m7100b.m960f(R.styleable.TextInputLayout_placeholderTextColor));
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(m7100b.m960f(R.styleable.TextInputLayout_prefixTextColor));
        }
        if (m7100b.m964i(R.styleable.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(m7100b.m960f(R.styleable.TextInputLayout_suffixTextColor));
        }
        setCounterEnabled(m949a3);
        setEnabled(m7100b.m949a(R.styleable.TextInputLayout_android_enabled, true));
        m7100b.m952b();
        C0538w.m1840a((View) this, 2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f10498e.addView(view, layoutParams2);
            this.f10498e.setLayoutParams(layoutParams);
            m7589i();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public C2295h getBoxBackground() {
        if (this.f10445H == 1 || this.f10445H == 2) {
            return this.f10441D;
        }
        throw new IllegalStateException();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f10445H) {
            return;
        }
        this.f10445H = i;
        if (this.f10461a != null) {
            m7585e();
        }
    }

    public int getBoxBackgroundMode() {
        return this.f10445H;
    }

    /* renamed from: e */
    private void m7585e() {
        m7586f();
        m7587g();
        m7615d();
        if (this.f10445H != 0) {
            m7589i();
        }
    }

    /* renamed from: f */
    private void m7586f() {
        switch (this.f10445H) {
            case 0:
                this.f10441D = null;
                this.f10442E = null;
                return;
            case 1:
                this.f10441D = new C2295h(this.f10443F);
                this.f10442E = new C2295h();
                return;
            case 2:
                if (this.f10438A && !(this.f10441D instanceof C2386k)) {
                    this.f10441D = new C2386k(this.f10443F);
                } else {
                    this.f10441D = new C2295h(this.f10443F);
                }
                this.f10442E = null;
                return;
            default:
                throw new IllegalArgumentException(this.f10445H + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: g */
    private void m7587g() {
        if (m7588h()) {
            C0538w.m1846a(this.f10461a, this.f10441D);
        }
    }

    /* renamed from: h */
    private boolean m7588h() {
        return (this.f10461a == null || this.f10441D == null || this.f10461a.getBackground() != null || this.f10445H == 0) ? false : true;
    }

    public void setBoxStrokeColor(int i) {
        if (this.f10492aw != i) {
            this.f10492aw = i;
            m7615d();
        }
    }

    public int getBoxStrokeColor() {
        return this.f10492aw;
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f10490au = colorStateList.getDefaultColor();
            this.f10464aC = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f10491av = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.f10492aw = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.f10492aw != colorStateList.getDefaultColor()) {
            this.f10492aw = colorStateList.getDefaultColor();
        }
        m7615d();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f10493ax != colorStateList) {
            this.f10493ax = colorStateList;
            m7615d();
        }
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f10493ax;
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0420a.m1488c(getContext(), i));
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f10451N != i) {
            this.f10451N = i;
            this.f10494ay = i;
            m7601u();
        }
    }

    public int getBoxBackgroundColor() {
        return this.f10451N;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f10441D.m7269W();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f10441D.m7270X();
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f10441D.m7271Y();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f10441D.m7272Z();
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f10455R) {
            this.f10455R = typeface;
            this.f10497c.m7166c(typeface);
            this.f10503j.m7668a(typeface);
            if (this.f10506m != null) {
                this.f10506m.setTypeface(typeface);
            }
        }
    }

    public Typeface getTypeface() {
        return this.f10455R;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f10502i == null || this.f10461a == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f10440C;
        this.f10440C = false;
        CharSequence hint = this.f10461a.getHint();
        this.f10461a.setHint(this.f10502i);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f10461a.setHint(hint);
            this.f10440C = z;
        }
    }

    private void setEditText(EditText editText) {
        if (this.f10461a != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f10474ae != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f10461a = editText;
        m7585e();
        setTextInputAccessibilityDelegate(new C2373ak(this));
        this.f10497c.m7166c(this.f10461a.getTypeface());
        this.f10497c.m7145a(this.f10461a.getTextSize());
        int gravity = this.f10461a.getGravity();
        this.f10497c.m7158b((gravity & (-113)) | 48);
        this.f10497c.m7146a(gravity);
        this.f10461a.addTextChangedListener(new C2369ag(this));
        if (this.f10488as == null) {
            this.f10488as = this.f10461a.getHintTextColors();
        }
        if (this.f10438A) {
            if (TextUtils.isEmpty(this.f10439B)) {
                this.f10502i = this.f10461a.getHint();
                setHint(this.f10502i);
                this.f10461a.setHint((CharSequence) null);
            }
            this.f10440C = true;
        }
        if (this.f10506m != null) {
            m7607a(this.f10461a.getText().length());
        }
        m7613b();
        this.f10503j.m7672b();
        this.f10499f.bringToFront();
        this.f10500g.bringToFront();
        this.f10501h.bringToFront();
        this.f10486aq.bringToFront();
        m7606z();
        m7594n();
        m7596p();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m7573a(false, true);
    }

    /* renamed from: i */
    private void m7589i() {
        if (this.f10445H != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10498e.getLayoutParams();
            int m7598r = m7598r();
            if (m7598r != layoutParams.topMargin) {
                layoutParams.topMargin = m7598r;
                this.f10498e.requestLayout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        if (this.f10461a != null) {
            return this.f10461a.getBaseline() + getPaddingTop() + m7598r();
        }
        return super.getBaseline();
    }

    /* renamed from: a */
    public final void m7611a(boolean z) {
        m7573a(z, false);
    }

    /* renamed from: a */
    private void m7573a(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        boolean z3 = (this.f10461a == null || TextUtils.isEmpty(this.f10461a.getText())) ? false : true;
        boolean z4 = this.f10461a != null && this.f10461a.hasFocus();
        boolean m7681e = this.f10503j.m7681e();
        if (this.f10488as != null) {
            this.f10497c.m7149a(this.f10488as);
            this.f10497c.m7161b(this.f10488as);
        }
        if (!isEnabled) {
            int colorForState = this.f10488as != null ? this.f10488as.getColorForState(new int[]{-16842910}, this.f10464aC) : this.f10464aC;
            this.f10497c.m7149a(ColorStateList.valueOf(colorForState));
            this.f10497c.m7161b(ColorStateList.valueOf(colorForState));
        } else if (m7681e) {
            this.f10497c.m7149a(this.f10503j.m7685i());
        } else if (this.f10505l && this.f10506m != null) {
            this.f10497c.m7149a(this.f10506m.getTextColors());
        } else if (z4 && this.f10489at != null) {
            this.f10497c.m7149a(this.f10489at);
        }
        if (z3 || (isEnabled() && (z4 || m7681e))) {
            if (z2 || this.f10465aD) {
                m7583c(z);
                return;
            }
            return;
        }
        if (z2 || !this.f10465aD) {
            m7584d(z);
        }
    }

    public EditText getEditText() {
        return this.f10461a;
    }

    public void setHint(CharSequence charSequence) {
        if (this.f10438A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f10439B)) {
            return;
        }
        this.f10439B = charSequence;
        this.f10497c.m7154a(charSequence);
        if (this.f10465aD) {
            return;
        }
        m7560H();
    }

    public CharSequence getHint() {
        if (this.f10438A) {
            return this.f10439B;
        }
        return null;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f10438A) {
            this.f10438A = z;
            if (!this.f10438A) {
                this.f10440C = false;
                if (!TextUtils.isEmpty(this.f10439B) && TextUtils.isEmpty(this.f10461a.getHint())) {
                    this.f10461a.setHint(this.f10439B);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f10461a.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f10439B)) {
                        setHint(hint);
                    }
                    this.f10461a.setHint((CharSequence) null);
                }
                this.f10440C = true;
            }
            if (this.f10461a != null) {
                m7589i();
            }
        }
    }

    /* renamed from: a */
    public final boolean m7612a() {
        return this.f10440C;
    }

    public void setHintTextAppearance(int i) {
        this.f10497c.m7165c(i);
        this.f10489at = this.f10497c.m7177l();
        if (this.f10461a != null) {
            m7573a(false, false);
            m7589i();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f10489at != colorStateList) {
            if (this.f10488as == null) {
                this.f10497c.m7149a(colorStateList);
            }
            this.f10489at = colorStateList;
            if (this.f10461a != null) {
                m7573a(false, false);
            }
        }
    }

    public ColorStateList getHintTextColor() {
        return this.f10489at;
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f10488as = colorStateList;
        this.f10489at = colorStateList;
        if (this.f10461a != null) {
            m7573a(false, false);
        }
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f10488as;
    }

    public void setErrorEnabled(boolean z) {
        this.f10503j.m7671a(z);
    }

    public void setErrorTextAppearance(int i) {
        this.f10503j.m7666a(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f10503j.m7667a(colorStateList);
    }

    public int getErrorCurrentTextColors() {
        return this.f10503j.m7684h();
    }

    public void setHelperTextTextAppearance(int i) {
        this.f10503j.m7673b(i);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f10503j.m7674b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f10503j.m7677b(z);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f10503j.m7680d()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!this.f10503j.m7680d()) {
                setHelperTextEnabled(true);
            }
            this.f10503j.m7670a(charSequence);
        }
    }

    public int getHelperTextCurrentTextColor() {
        return this.f10503j.m7687k();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f10503j.m7678c(charSequence);
    }

    public CharSequence getErrorContentDescription() {
        return this.f10503j.m7686j();
    }

    public void setError(CharSequence charSequence) {
        if (!this.f10503j.m7679c()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f10503j.m7676b(charSequence);
        } else {
            this.f10503j.m7665a();
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C0057a.m46b(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f10486aq.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f10503j.m7679c());
    }

    public Drawable getErrorIconDrawable() {
        return this.f10486aq.getDrawable();
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f10487ar = colorStateList;
        Drawable drawable = this.f10486aq.getDrawable();
        if (drawable != null) {
            drawable = C0546a.m1933f(drawable).mutate();
            C0546a.m1922a(drawable, colorStateList);
        }
        if (this.f10486aq.getDrawable() != drawable) {
            this.f10486aq.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10486aq.getDrawable();
        if (drawable != null) {
            drawable = C0546a.m1933f(drawable).mutate();
            C0546a.m1925a(drawable, mode);
        }
        if (this.f10486aq.getDrawable() != drawable) {
            this.f10486aq.setImageDrawable(drawable);
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f10496b != z) {
            if (z) {
                this.f10506m = new AppCompatTextView(getContext());
                this.f10506m.setId(R.id.textinput_counter);
                if (this.f10455R != null) {
                    this.f10506m.setTypeface(this.f10455R);
                }
                this.f10506m.setMaxLines(1);
                this.f10503j.m7669a(this.f10506m, 2);
                C0525j.m1786a((ViewGroup.MarginLayoutParams) this.f10506m.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                m7597q();
                m7590j();
            } else {
                this.f10503j.m7675b(this.f10506m, 2);
                this.f10506m = null;
            }
            this.f10496b = z;
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f10508o != i) {
            this.f10508o = i;
            m7597q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f10514u != colorStateList) {
            this.f10514u = colorStateList;
            m7597q();
        }
    }

    public ColorStateList getCounterTextColor() {
        return this.f10514u;
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f10507n != i) {
            this.f10507n = i;
            m7597q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f10515v != colorStateList) {
            this.f10515v = colorStateList;
            m7597q();
        }
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f10514u;
    }

    public void setCounterMaxLength(int i) {
        if (this.f10504k != i) {
            if (i > 0) {
                this.f10504k = i;
            } else {
                this.f10504k = -1;
            }
            if (this.f10496b) {
                m7590j();
            }
        }
    }

    /* renamed from: j */
    private void m7590j() {
        if (this.f10506m != null) {
            m7607a(this.f10461a == null ? 0 : this.f10461a.getText().length());
        }
    }

    /* renamed from: a */
    public final void m7607a(int i) {
        boolean z = this.f10505l;
        if (this.f10504k == -1) {
            this.f10506m.setText(String.valueOf(i));
            this.f10506m.setContentDescription(null);
            this.f10505l = false;
        } else {
            this.f10505l = i > this.f10504k;
            m7565a(getContext(), this.f10506m, i, this.f10504k, this.f10505l);
            if (z != this.f10505l) {
                m7597q();
            }
            this.f10506m.setText(C0454a.m1578a().m1584a(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f10504k))));
        }
        if (this.f10461a == null || z == this.f10505l) {
            return;
        }
        m7573a(false, false);
        m7615d();
        m7613b();
    }

    /* renamed from: a */
    private static void m7565a(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f10510q && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f10510q) {
                setPlaceholderTextEnabled(true);
            }
            this.f10509p = charSequence;
        }
        m7576b(this.f10461a != null ? this.f10461a.getText().length() : 0);
    }

    public CharSequence getPlaceholderText() {
        if (this.f10510q) {
            return this.f10509p;
        }
        return null;
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f10510q == z) {
            return;
        }
        if (z) {
            this.f10511r = new AppCompatTextView(getContext());
            this.f10511r.setId(R.id.textinput_placeholder);
            C0538w.m1882k(this.f10511r);
            setPlaceholderTextAppearance(this.f10513t);
            setPlaceholderTextColor(this.f10512s);
            if (this.f10511r != null) {
                this.f10498e.addView(this.f10511r);
                this.f10511r.setVisibility(0);
            }
        } else {
            if (this.f10511r != null) {
                this.f10511r.setVisibility(8);
            }
            this.f10511r = null;
        }
        this.f10510q = z;
    }

    /* renamed from: b */
    public void m7576b(int i) {
        if (i == 0 && !this.f10465aD) {
            m7591k();
        } else {
            m7592l();
        }
    }

    /* renamed from: k */
    private void m7591k() {
        if (this.f10511r == null || !this.f10510q) {
            return;
        }
        this.f10511r.setText(this.f10509p);
        this.f10511r.setVisibility(0);
        this.f10511r.bringToFront();
    }

    /* renamed from: l */
    private void m7592l() {
        if (this.f10511r == null || !this.f10510q) {
            return;
        }
        this.f10511r.setText((CharSequence) null);
        this.f10511r.setVisibility(4);
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f10512s != colorStateList) {
            this.f10512s = colorStateList;
            if (this.f10511r == null || colorStateList == null) {
                return;
            }
            this.f10511r.setTextColor(colorStateList);
        }
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f10512s;
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f10513t = i;
        if (this.f10511r != null) {
            C0577o.m2048a(this.f10511r, i);
        }
    }

    public int getPlaceholderTextAppearance() {
        return this.f10513t;
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f10516w = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f10517x.setText(charSequence);
        m7593m();
    }

    public CharSequence getPrefixText() {
        return this.f10516w;
    }

    public TextView getPrefixTextView() {
        return this.f10517x;
    }

    /* renamed from: m */
    private void m7593m() {
        this.f10517x.setVisibility((this.f10516w == null || this.f10465aD) ? 8 : 0);
        m7556D();
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f10517x.setTextColor(colorStateList);
    }

    public ColorStateList getPrefixTextColor() {
        return this.f10517x.getTextColors();
    }

    public void setPrefixTextAppearance(int i) {
        C0577o.m2048a(this.f10517x, i);
    }

    /* renamed from: n */
    private void m7594n() {
        if (this.f10461a == null) {
            return;
        }
        this.f10517x.setPadding(m7605y() ? 0 : this.f10461a.getPaddingLeft(), this.f10461a.getCompoundPaddingTop(), this.f10517x.getCompoundPaddingRight(), this.f10461a.getCompoundPaddingBottom());
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f10518y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f10519z.setText(charSequence);
        m7595o();
    }

    public CharSequence getSuffixText() {
        return this.f10518y;
    }

    public TextView getSuffixTextView() {
        return this.f10519z;
    }

    /* renamed from: o */
    private void m7595o() {
        int visibility = this.f10519z.getVisibility();
        boolean z = (this.f10518y == null || this.f10465aD) ? false : true;
        this.f10519z.setVisibility(z ? 0 : 8);
        if (visibility != this.f10519z.getVisibility()) {
            getEndIconDelegate().mo7622a(z);
        }
        m7556D();
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f10519z.setTextColor(colorStateList);
    }

    public ColorStateList getSuffixTextColor() {
        return this.f10519z.getTextColors();
    }

    public void setSuffixTextAppearance(int i) {
        C0577o.m2048a(this.f10519z, i);
    }

    /* renamed from: p */
    private void m7596p() {
        if (this.f10461a == null) {
            return;
        }
        this.f10519z.setPadding(this.f10519z.getPaddingLeft(), this.f10461a.getPaddingTop(), (m7614c() || m7562J()) ? 0 : this.f10461a.getPaddingRight(), this.f10461a.getPaddingBottom());
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m7567a(this, z);
        super.setEnabled(z);
    }

    /* renamed from: a */
    private static void m7567a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m7567a((ViewGroup) childAt, z);
            }
        }
    }

    public int getCounterMaxLength() {
        return this.f10504k;
    }

    public CharSequence getCounterOverflowDescription() {
        if (this.f10496b && this.f10505l && this.f10506m != null) {
            return this.f10506m.getContentDescription();
        }
        return null;
    }

    /* renamed from: q */
    private void m7597q() {
        if (this.f10506m != null) {
            m7608a(this.f10506m, this.f10505l ? this.f10507n : this.f10508o);
            if (!this.f10505l && this.f10514u != null) {
                this.f10506m.setTextColor(this.f10514u);
            }
            if (!this.f10505l || this.f10515v == null) {
                return;
            }
            this.f10506m.setTextColor(this.f10515v);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:            if (r3.getTextColors().getDefaultColor() == (-65281)) goto L27;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7608a(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.C0577o.m2048a(r3, r4)     // Catch: java.lang.Exception -> L1a
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1a
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1a
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1a
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1a
        L18:
            r4 = 0
            r0 = r4
        L1a:
            if (r0 == 0) goto L2e
            int r4 = com.google.android.material.R.style.TextAppearance_AppCompat_Caption
            androidx.core.widget.C0577o.m2048a(r3, r4)
            android.content.Context r2 = r2.getContext()
            int r4 = com.google.android.material.R.color.design_error
            int r2 = androidx.core.content.C0420a.m1488c(r2, r4)
            r3.setTextColor(r2)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m7608a(android.widget.TextView, int):void");
    }

    /* renamed from: r */
    private int m7598r() {
        if (!this.f10438A) {
            return 0;
        }
        switch (this.f10445H) {
            case 0:
            case 1:
                return (int) this.f10497c.m7156b();
            case 2:
                return (int) (this.f10497c.m7156b() / 2.0f);
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private int m7563a(int i, boolean z) {
        int compoundPaddingLeft = i + this.f10461a.getCompoundPaddingLeft();
        return (this.f10516w == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f10517x.getMeasuredWidth()) + this.f10517x.getPaddingLeft();
    }

    /* renamed from: b */
    private int m7575b(int i, boolean z) {
        int compoundPaddingRight = i - this.f10461a.getCompoundPaddingRight();
        return (this.f10516w == null || !z) ? compoundPaddingRight : compoundPaddingRight + this.f10517x.getMeasuredWidth() + this.f10517x.getPaddingRight();
    }

    /* renamed from: s */
    private boolean m7599s() {
        if (this.f10445H == 1) {
            return Build.VERSION.SDK_INT < 16 || this.f10461a.getMinLines() <= 1;
        }
        return false;
    }

    /* renamed from: t */
    private int m7600t() {
        int i = this.f10451N;
        if (this.f10445H != 1) {
            return i;
        }
        return C0542a.m1900a(this.f10451N, C2063a.m6340a(getContext(), R.attr.colorSurface));
    }

    /* renamed from: u */
    private void m7601u() {
        if (this.f10441D == null) {
            return;
        }
        this.f10441D.setShapeAppearanceModel(this.f10443F);
        if (m7603w()) {
            this.f10441D.m7273a(this.f10447J, this.f10450M);
        }
        this.f10451N = m7600t();
        this.f10441D.m7282g(ColorStateList.valueOf(this.f10451N));
        if (this.f10474ae == 3) {
            this.f10461a.getBackground().invalidateSelf();
        }
        m7602v();
        invalidate();
    }

    /* renamed from: v */
    private void m7602v() {
        if (this.f10442E == null) {
            return;
        }
        if (m7604x()) {
            this.f10442E.m7282g(ColorStateList.valueOf(this.f10450M));
        }
        invalidate();
    }

    /* renamed from: w */
    private boolean m7603w() {
        return this.f10445H == 2 && m7604x();
    }

    /* renamed from: x */
    private boolean m7604x() {
        return this.f10447J >= 0 && this.f10450M != 0;
    }

    /* renamed from: b */
    public final void m7613b() {
        Drawable background;
        if (this.f10461a == null || this.f10445H != 0 || (background = this.f10461a.getBackground()) == null) {
            return;
        }
        if (C0218bj.m849c(background)) {
            background = background.mutate();
        }
        if (this.f10503j.m7681e()) {
            background.setColorFilter(C0192ak.m706a(this.f10503j.m7684h(), PorterDuff.Mode.SRC_IN));
        } else if (this.f10505l && this.f10506m != null) {
            background.setColorFilter(C0192ak.m706a(this.f10506m.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C0546a.m1932e(background);
            this.f10461a.refreshDrawableState();
        }
    }

    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2376an();

        /* renamed from: a */
        CharSequence f10520a;

        /* renamed from: b */
        boolean f10521b;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10520a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10521b = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f10520a, parcel, i);
            parcel.writeInt(this.f10521b ? 1 : 0);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f10520a) + "}";
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f10503j.m7681e()) {
            savedState.f10520a = getError();
        }
        savedState.f10521b = m7554B() && this.f10476ag.isChecked();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        setError(savedState.f10520a);
        if (savedState.f10521b) {
            this.f10476ag.post(new RunnableC2370ah(this));
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f10469aH = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f10469aH = false;
    }

    public CharSequence getError() {
        if (this.f10503j.m7679c()) {
            return this.f10503j.m7682f();
        }
        return null;
    }

    public CharSequence getHelperText() {
        if (this.f10503j.m7680d()) {
            return this.f10503j.m7683g();
        }
        return null;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f10466aE = z;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        int max;
        super.onMeasure(i, i2);
        if (this.f10461a == null || this.f10461a.getMeasuredHeight() >= (max = Math.max(this.f10500g.getMeasuredHeight(), this.f10499f.getMeasuredHeight()))) {
            z = false;
        } else {
            this.f10461a.setMinimumHeight(max);
            z = true;
        }
        boolean m7556D = m7556D();
        if (z || m7556D) {
            this.f10461a.post(new RunnableC2371ai(this));
        }
        if (this.f10511r == null || this.f10461a == null) {
            return;
        }
        this.f10511r.setGravity(this.f10461a.getGravity());
        this.f10511r.setPadding(this.f10461a.getCompoundPaddingLeft(), this.f10461a.getCompoundPaddingTop(), this.f10461a.getCompoundPaddingRight(), this.f10461a.getCompoundPaddingBottom());
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C0057a.m46b(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f10456S.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m7553A();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public Drawable getStartIconDrawable() {
        return this.f10456S.getDrawable();
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m7569a(this.f10456S, onClickListener, this.f10472ac);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10472ac = onLongClickListener;
        m7570a(this.f10456S, onLongClickListener);
    }

    public void setStartIconVisible(boolean z) {
        if (m7605y() != z) {
            this.f10456S.setVisibility(z ? 0 : 8);
            m7594n();
            m7556D();
        }
    }

    /* renamed from: y */
    private boolean m7605y() {
        return this.f10456S.getVisibility() == 0;
    }

    public void setStartIconCheckable(boolean z) {
        this.f10456S.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f10456S.setContentDescription(charSequence);
        }
    }

    public CharSequence getStartIconContentDescription() {
        return this.f10456S.getContentDescription();
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f10457T != colorStateList) {
            this.f10457T = colorStateList;
            this.f10458U = true;
            m7553A();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f10459V != mode) {
            this.f10459V = mode;
            this.f10460W = true;
            m7553A();
        }
    }

    public void setEndIconMode(int i) {
        int i2 = this.f10474ae;
        this.f10474ae = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo7649a(this.f10445H)) {
            getEndIconDelegate().mo7621a();
            m7555C();
            m7582c(i2);
        } else {
            throw new IllegalStateException("The current box background mode " + this.f10445H + " is not supported by the end icon mode " + i);
        }
    }

    public int getEndIconMode() {
        return this.f10474ae;
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m7569a(this.f10476ag, onClickListener, this.f10485ap);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10485ap = onLongClickListener;
        m7570a(this.f10476ag, onLongClickListener);
    }

    public void setEndIconVisible(boolean z) {
        if (m7614c() != z) {
            this.f10476ag.setVisibility(z ? 0 : 8);
            m7596p();
            m7556D();
        }
    }

    /* renamed from: c */
    public final boolean m7614c() {
        return this.f10501h.getVisibility() == 0 && this.f10476ag.getVisibility() == 0;
    }

    public void setEndIconActivated(boolean z) {
        this.f10476ag.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f10476ag.setCheckable(z);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C0057a.m46b(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f10476ag.setImageDrawable(drawable);
    }

    public Drawable getEndIconDrawable() {
        return this.f10476ag.getDrawable();
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f10476ag.setContentDescription(charSequence);
        }
    }

    public CharSequence getEndIconContentDescription() {
        return this.f10476ag.getContentDescription();
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f10478ai != colorStateList) {
            this.f10478ai = colorStateList;
            this.f10479aj = true;
            m7555C();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f10480ak != mode) {
            this.f10480ak = mode;
            this.f10481al = true;
            m7555C();
        }
    }

    /* renamed from: a */
    public final void m7610a(InterfaceC2375am interfaceC2375am) {
        this.f10477ah.add(interfaceC2375am);
    }

    /* renamed from: a */
    public final void m7609a(InterfaceC2374al interfaceC2374al) {
        this.f10473ad.add(interfaceC2374al);
        if (this.f10461a != null) {
            interfaceC2374al.mo7625a(this);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0057a.m46b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f10476ag.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f10476ag.setContentDescription(charSequence);
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f10476ag.getDrawable();
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f10476ag.getContentDescription();
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f10474ae != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f10478ai = colorStateList;
        this.f10479aj = true;
        m7555C();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f10480ak = mode;
        this.f10481al = true;
        m7555C();
    }

    public void setTextInputAccessibilityDelegate(C2373ak c2373ak) {
        if (this.f10461a != null) {
            C0538w.m1849a(this.f10461a, c2373ak);
        }
    }

    public CheckableImageButton getEndIconView() {
        return this.f10476ag;
    }

    private AbstractC2398w getEndIconDelegate() {
        AbstractC2398w abstractC2398w = this.f10475af.get(this.f10474ae);
        return abstractC2398w != null ? abstractC2398w : this.f10475af.get(0);
    }

    /* renamed from: z */
    private void m7606z() {
        Iterator<InterfaceC2374al> it = this.f10473ad.iterator();
        while (it.hasNext()) {
            it.next().mo7625a(this);
        }
    }

    /* renamed from: A */
    private void m7553A() {
        m7571a(this.f10456S, this.f10458U, this.f10457T, this.f10460W, this.f10459V);
    }

    /* renamed from: B */
    private boolean m7554B() {
        return this.f10474ae != 0;
    }

    /* renamed from: c */
    private void m7582c(int i) {
        Iterator<InterfaceC2375am> it = this.f10477ah.iterator();
        while (it.hasNext()) {
            it.next().mo7626a(this, i);
        }
    }

    /* renamed from: b */
    private void m7578b(boolean z) {
        if (z && getEndIconDrawable() != null) {
            Drawable mutate = C0546a.m1933f(getEndIconDrawable()).mutate();
            C0546a.m1920a(mutate, this.f10503j.m7684h());
            this.f10476ag.setImageDrawable(mutate);
            return;
        }
        m7555C();
    }

    /* renamed from: C */
    private void m7555C() {
        m7571a(this.f10476ag, this.f10479aj, this.f10478ai, this.f10481al, this.f10480ak);
    }

    /* renamed from: D */
    private boolean m7556D() {
        boolean z;
        if (this.f10461a == null) {
            return false;
        }
        boolean z2 = true;
        if (m7557E()) {
            int measuredWidth = this.f10499f.getMeasuredWidth() - this.f10461a.getPaddingLeft();
            if (this.f10470aa == null || this.f10471ab != measuredWidth) {
                this.f10470aa = new ColorDrawable();
                this.f10471ab = measuredWidth;
                this.f10470aa.setBounds(0, 0, this.f10471ab, 1);
            }
            Drawable[] m2052b = C0577o.m2052b(this.f10461a);
            if (m2052b[0] != this.f10470aa) {
                C0577o.m2049a(this.f10461a, this.f10470aa, m2052b[1], m2052b[2], m2052b[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f10470aa != null) {
                Drawable[] m2052b2 = C0577o.m2052b(this.f10461a);
                C0577o.m2049a(this.f10461a, null, m2052b2[1], m2052b2[2], m2052b2[3]);
                this.f10470aa = null;
                z = true;
            }
            z = false;
        }
        if (m7558F()) {
            int measuredWidth2 = this.f10519z.getMeasuredWidth() - this.f10461a.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + C0525j.m1785a((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] m2052b3 = C0577o.m2052b(this.f10461a);
            if (this.f10482am != null && this.f10483an != measuredWidth2) {
                this.f10483an = measuredWidth2;
                this.f10482am.setBounds(0, 0, this.f10483an, 1);
                C0577o.m2049a(this.f10461a, m2052b3[0], m2052b3[1], this.f10482am, m2052b3[3]);
                return true;
            }
            if (this.f10482am == null) {
                this.f10482am = new ColorDrawable();
                this.f10483an = measuredWidth2;
                this.f10482am.setBounds(0, 0, this.f10483an, 1);
            }
            if (m2052b3[2] != this.f10482am) {
                this.f10484ao = m2052b3[2];
                C0577o.m2049a(this.f10461a, m2052b3[0], m2052b3[1], this.f10482am, m2052b3[3]);
                return true;
            }
        } else if (this.f10482am != null) {
            Drawable[] m2052b4 = C0577o.m2052b(this.f10461a);
            if (m2052b4[2] == this.f10482am) {
                C0577o.m2049a(this.f10461a, m2052b4[0], m2052b4[1], this.f10484ao, m2052b4[3]);
            } else {
                z2 = z;
            }
            this.f10482am = null;
            return z2;
        }
        return z;
    }

    /* renamed from: E */
    private boolean m7557E() {
        return !(getStartIconDrawable() == null && this.f10516w == null) && this.f10499f.getMeasuredWidth() > 0;
    }

    /* renamed from: F */
    private boolean m7558F() {
        return (this.f10486aq.getVisibility() == 0 || ((m7554B() && m7614c()) || this.f10518y != null)) && this.f10500g.getMeasuredWidth() > 0;
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f10486aq.getVisibility() == 0) {
            return this.f10486aq;
        }
        if (m7554B() && m7614c()) {
            return this.f10476ag;
        }
        return null;
    }

    /* renamed from: a */
    private static void m7571a(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0546a.m1933f(drawable).mutate();
            if (z) {
                C0546a.m1922a(drawable, colorStateList);
            }
            if (z2) {
                C0546a.m1925a(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    private static void m7569a(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m7577b(checkableImageButton, onLongClickListener);
    }

    /* renamed from: a */
    private static void m7570a(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m7577b(checkableImageButton, onLongClickListener);
    }

    /* renamed from: b */
    private static void m7577b(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean m1823G = C0538w.m1823G(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = m1823G || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(m1823G);
        checkableImageButton.setPressable(m1823G);
        checkableImageButton.setLongClickable(z);
        C0538w.m1840a((View) checkableImageButton, z2 ? 1 : 2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f10461a != null) {
            Rect rect = this.f10452O;
            C2261f.m7180b(this, this.f10461a, rect);
            if (this.f10442E != null) {
                this.f10442E.setBounds(rect.left, rect.bottom - this.f10449L, rect.right, rect.bottom);
            }
            if (this.f10438A) {
                this.f10497c.m7145a(this.f10461a.getTextSize());
                int gravity = this.f10461a.getGravity();
                this.f10497c.m7158b((gravity & (-113)) | 48);
                this.f10497c.m7146a(gravity);
                C2258c c2258c = this.f10497c;
                if (this.f10461a == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.f10453P;
                boolean z2 = C0538w.m1878h(this) == 1;
                rect2.bottom = rect.bottom;
                switch (this.f10445H) {
                    case 1:
                        rect2.left = m7563a(rect.left, z2);
                        rect2.top = rect.top + this.f10446I;
                        rect2.right = m7575b(rect.right, z2);
                        break;
                    case 2:
                        rect2.left = rect.left + this.f10461a.getPaddingLeft();
                        rect2.top = rect.top - m7598r();
                        rect2.right = rect.right - this.f10461a.getPaddingRight();
                        break;
                    default:
                        rect2.left = m7563a(rect.left, z2);
                        rect2.top = getPaddingTop();
                        rect2.right = m7575b(rect.right, z2);
                        break;
                }
                c2258c.m7162b(rect2);
                C2258c c2258c2 = this.f10497c;
                if (this.f10461a == null) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.f10453P;
                float m7144a = this.f10497c.m7144a();
                rect3.left = rect.left + this.f10461a.getCompoundPaddingLeft();
                if (m7599s()) {
                    compoundPaddingTop = (int) (rect.centerY() - (m7144a / 2.0f));
                } else {
                    compoundPaddingTop = rect.top + this.f10461a.getCompoundPaddingTop();
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f10461a.getCompoundPaddingRight();
                if (m7599s()) {
                    compoundPaddingBottom = (int) (rect3.top + m7144a);
                } else {
                    compoundPaddingBottom = rect.bottom - this.f10461a.getCompoundPaddingBottom();
                }
                rect3.bottom = compoundPaddingBottom;
                c2258c2.m7151a(rect3);
                this.f10497c.m7174i();
                if (!m7559G() || this.f10465aD) {
                    return;
                }
                m7560H();
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f10438A) {
            this.f10497c.m7150a(canvas);
        }
        if (this.f10442E != null) {
            Rect bounds = this.f10442E.getBounds();
            bounds.top = bounds.bottom - this.f10447J;
            this.f10442E.draw(canvas);
        }
    }

    /* renamed from: c */
    private void m7583c(boolean z) {
        if (this.f10467aF != null && this.f10467aF.isRunning()) {
            this.f10467aF.cancel();
        }
        if (z && this.f10466aE) {
            m7564a(1.0f);
        } else {
            this.f10497c.m7157b(1.0f);
        }
        this.f10465aD = false;
        if (m7559G()) {
            m7560H();
        }
        m7591k();
        m7593m();
        m7595o();
    }

    /* renamed from: G */
    private boolean m7559G() {
        return this.f10438A && !TextUtils.isEmpty(this.f10439B) && (this.f10441D instanceof C2386k);
    }

    /* renamed from: H */
    private void m7560H() {
        if (m7559G()) {
            RectF rectF = this.f10454Q;
            this.f10497c.m7152a(rectF, this.f10461a.getWidth(), this.f10461a.getGravity());
            m7566a(rectF);
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            ((C2386k) this.f10441D).m7628a(rectF);
        }
    }

    /* renamed from: I */
    private void m7561I() {
        if (m7559G()) {
            ((C2386k) this.f10441D).m7630b();
        }
    }

    /* renamed from: a */
    private void m7566a(RectF rectF) {
        rectF.left -= this.f10444G;
        rectF.top -= this.f10444G;
        rectF.right += this.f10444G;
        rectF.bottom += this.f10444G;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f10468aG) {
            return;
        }
        this.f10468aG = true;
        super.drawableStateChanged();
        boolean m7155a = this.f10497c != null ? this.f10497c.m7155a(getDrawableState()) | false : false;
        if (this.f10461a != null) {
            m7573a(C0538w.m1819C(this) && isEnabled(), false);
        }
        m7613b();
        m7615d();
        if (m7155a) {
            invalidate();
        }
        this.f10468aG = false;
    }

    /* renamed from: d */
    public final void m7615d() {
        if (this.f10441D == null || this.f10445H == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || (this.f10461a != null && this.f10461a.hasFocus());
        boolean z3 = isHovered() || (this.f10461a != null && this.f10461a.isHovered());
        if (!isEnabled()) {
            this.f10450M = this.f10464aC;
        } else if (this.f10503j.m7681e()) {
            if (this.f10493ax != null) {
                m7579b(z2, z3);
            } else {
                this.f10450M = this.f10503j.m7684h();
            }
        } else if (!this.f10505l || this.f10506m == null) {
            if (z2) {
                this.f10450M = this.f10492aw;
            } else if (z3) {
                this.f10450M = this.f10491av;
            } else {
                this.f10450M = this.f10490au;
            }
        } else if (this.f10493ax != null) {
            m7579b(z2, z3);
        } else {
            this.f10450M = this.f10506m.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && this.f10503j.m7679c() && this.f10503j.m7681e()) {
            z = true;
        }
        setErrorIconVisible(z);
        m7568a(this.f10486aq, this.f10487ar);
        m7568a(this.f10456S, this.f10457T);
        m7568a(this.f10476ag, this.f10478ai);
        if (getEndIconDelegate().mo7650b()) {
            m7578b(this.f10503j.m7681e());
        }
        if (z2 && isEnabled()) {
            this.f10447J = this.f10449L;
        } else {
            this.f10447J = this.f10448K;
        }
        if (this.f10445H == 1) {
            if (!isEnabled()) {
                this.f10451N = this.f10495az;
            } else if (z3 && !z2) {
                this.f10451N = this.f10463aB;
            } else if (z2) {
                this.f10451N = this.f10462aA;
            } else {
                this.f10451N = this.f10494ay;
            }
        }
        m7601u();
    }

    /* renamed from: b */
    private void m7579b(boolean z, boolean z2) {
        int defaultColor = this.f10493ax.getDefaultColor();
        int colorForState = this.f10493ax.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f10493ax.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f10450M = colorForState2;
        } else if (z2) {
            this.f10450M = colorForState;
        } else {
            this.f10450M = defaultColor;
        }
    }

    private void setErrorIconVisible(boolean z) {
        this.f10486aq.setVisibility(z ? 0 : 8);
        this.f10501h.setVisibility(z ? 8 : 0);
        m7596p();
        if (m7554B()) {
            return;
        }
        m7556D();
    }

    /* renamed from: J */
    private boolean m7562J() {
        return this.f10486aq.getVisibility() == 0;
    }

    /* renamed from: a */
    private void m7568a(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        Drawable mutate = C0546a.m1933f(drawable).mutate();
        C0546a.m1922a(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: d */
    private void m7584d(boolean z) {
        if (this.f10467aF != null && this.f10467aF.isRunning()) {
            this.f10467aF.cancel();
        }
        if (z && this.f10466aE) {
            m7564a(0.0f);
        } else {
            this.f10497c.m7157b(0.0f);
        }
        if (m7559G() && ((C2386k) this.f10441D).m7629a()) {
            m7561I();
        }
        this.f10465aD = true;
        m7592l();
        m7593m();
        m7595o();
    }

    /* renamed from: a */
    private void m7564a(float f) {
        if (this.f10497c.m7172g() == f) {
            return;
        }
        if (this.f10467aF == null) {
            this.f10467aF = new ValueAnimator();
            this.f10467aF.setInterpolator(C2032a.f8974b);
            this.f10467aF.setDuration(167L);
            this.f10467aF.addUpdateListener(new C2372aj(this));
        }
        this.f10467aF.setFloatValues(this.f10497c.m7172g(), f);
        this.f10467aF.start();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f10497c.m7173h();
    }

    final float getHintCollapsedTextHeight() {
        return this.f10497c.m7156b();
    }

    final int getErrorTextCurrentColor() {
        return this.f10503j.m7684h();
    }
}
