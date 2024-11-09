package color.support.p043v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0086b;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.appcompat.view.menu.InterfaceC0169p;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0276dn;
import androidx.appcompat.widget.C0281ds;
import androidx.appcompat.widget.C0295ef;
import androidx.appcompat.widget.InterfaceC0282dt;
import androidx.appcompat.widget.InterfaceC0312u;
import androidx.core.p024g.C0521f;
import androidx.core.p024g.C0525j;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.RecyclerView;
import color.support.design.widget.C1188q;
import color.support.p043v7.appcompat.R;
import color.support.p043v7.internal.widget.C1231an;
import com.color.support.util.C1336a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends androidx.appcompat.widget.Toolbar {

    /* renamed from: A */
    private CharSequence f5303A;

    /* renamed from: B */
    private CharSequence f5304B;

    /* renamed from: C */
    private int f5305C;

    /* renamed from: D */
    private int f5306D;

    /* renamed from: E */
    private boolean f5307E;

    /* renamed from: F */
    private boolean f5308F;

    /* renamed from: G */
    private final ArrayList<View> f5309G;

    /* renamed from: H */
    private final int[] f5310H;

    /* renamed from: I */
    private InterfaceC0282dt f5311I;

    /* renamed from: J */
    private final InterfaceC0312u f5312J;

    /* renamed from: K */
    private C1262ab f5313K;

    /* renamed from: L */
    private InterfaceC0145ae f5314L;

    /* renamed from: M */
    private InterfaceC0169p f5315M;

    /* renamed from: N */
    private boolean f5316N;

    /* renamed from: O */
    private int f5317O;

    /* renamed from: P */
    private boolean f5318P;

    /* renamed from: Q */
    private int f5319Q;

    /* renamed from: R */
    private int[] f5320R;

    /* renamed from: S */
    private float f5321S;

    /* renamed from: T */
    private int f5322T;

    /* renamed from: U */
    private int f5323U;

    /* renamed from: V */
    private final int[] f5324V;

    /* renamed from: W */
    private final Runnable f5325W;

    /* renamed from: aa */
    private int f5326aa;

    /* renamed from: ab */
    private float f5327ab;

    /* renamed from: ac */
    private float f5328ac;

    /* renamed from: ad */
    private boolean f5329ad;

    /* renamed from: ae */
    private C1188q f5330ae;

    /* renamed from: e */
    View f5331e;

    /* renamed from: f */
    boolean f5332f;

    /* renamed from: g */
    private ActionMenuView f5333g;

    /* renamed from: h */
    private TextView f5334h;

    /* renamed from: i */
    private TextView f5335i;

    /* renamed from: j */
    private ImageButton f5336j;

    /* renamed from: k */
    private ImageView f5337k;

    /* renamed from: l */
    private Drawable f5338l;

    /* renamed from: m */
    private CharSequence f5339m;

    /* renamed from: n */
    private ImageButton f5340n;

    /* renamed from: o */
    private Context f5341o;

    /* renamed from: p */
    private int f5342p;

    /* renamed from: q */
    private int f5343q;

    /* renamed from: r */
    private int f5344r;

    /* renamed from: s */
    private int f5345s;

    /* renamed from: t */
    private int f5346t;

    /* renamed from: u */
    private int f5347u;

    /* renamed from: v */
    private int f5348v;

    /* renamed from: w */
    private int f5349w;

    /* renamed from: x */
    private int f5350x;

    /* renamed from: y */
    private final C1231an f5351y;

    /* renamed from: z */
    private int f5352z;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: a */
    public final /* synthetic */ C0281ds generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4129b(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4137m();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4129b(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: j */
    public final /* synthetic */ C0281ds generateDefaultLayoutParams() {
        return m4137m();
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5351y = new C1231an();
        this.f5352z = 8388627;
        this.f5309G = new ArrayList<>();
        this.f5310H = new int[2];
        this.f5312J = new C1304y(this);
        this.f5318P = false;
        this.f5320R = new int[2];
        this.f5321S = 0.0f;
        this.f5324V = new int[2];
        this.f5325W = new RunnableC1305z(this);
        this.f5332f = false;
        this.f5326aa = -1;
        this.f5329ad = false;
        C0276dn m944a = C0276dn.m944a(getContext(), attributeSet, R.styleable.Toolbar, i, 0);
        if (m944a.m964i(R.styleable.Toolbar_titleType)) {
            this.f5319Q = m944a.m946a(R.styleable.Toolbar_titleType, 0);
        }
        this.f5343q = m944a.m962g(R.styleable.Toolbar_supportTitleTextAppearance, 0);
        this.f5344r = m944a.m962g(R.styleable.Toolbar_supportSubtitleTextAppearance, 0);
        this.f5352z = m944a.m953c(R.styleable.Toolbar_android_gravity, this.f5352z);
        this.f5345s = m944a.m953c(R.styleable.Toolbar_supportButtonGravity, 48);
        int m955d = m944a.m955d(R.styleable.Toolbar_supportTitleMargins, 0);
        this.f5350x = m955d;
        this.f5349w = m955d;
        this.f5348v = m955d;
        this.f5347u = m955d;
        int m955d2 = m944a.m955d(R.styleable.Toolbar_supportTitleMarginStart, -1);
        if (m955d2 >= 0) {
            this.f5347u = m955d2;
        }
        int m955d3 = m944a.m955d(R.styleable.Toolbar_supportTitleMarginEnd, -1);
        if (m955d3 >= 0) {
            this.f5348v = m955d3;
        }
        int m955d4 = m944a.m955d(R.styleable.Toolbar_supportTitleMarginTop, -1);
        if (m955d4 >= 0) {
            this.f5349w = m955d4;
        }
        int m955d5 = m944a.m955d(R.styleable.Toolbar_supportTitleMarginBottom, -1);
        if (m955d5 >= 0) {
            this.f5350x = m955d5;
        }
        this.f5346t = m944a.m958e(R.styleable.Toolbar_supportMaxButtonHeight, -1);
        int m955d6 = m944a.m955d(R.styleable.Toolbar_supportContentInsetStart, RecyclerView.UNDEFINED_DURATION);
        int m955d7 = m944a.m955d(R.styleable.Toolbar_supportContentInsetEnd, RecyclerView.UNDEFINED_DURATION);
        this.f5351y.m4071b(m944a.m958e(R.styleable.Toolbar_supportContentInsetLeft, 0), m944a.m958e(R.styleable.Toolbar_supportContentInsetRight, 0));
        if (m955d6 != Integer.MIN_VALUE || m955d7 != Integer.MIN_VALUE) {
            this.f5351y.m4068a(m955d6, m955d7);
        }
        this.f5338l = m944a.m948a(R.styleable.Toolbar_supportCollapseIcon);
        this.f5339m = m944a.m954c(R.styleable.Toolbar_supportCollapseContentDescription);
        CharSequence m954c = m944a.m954c(R.styleable.Toolbar_supportTitle);
        if (!TextUtils.isEmpty(m954c)) {
            setTitle(m954c);
        }
        CharSequence m954c2 = m944a.m954c(R.styleable.Toolbar_supportSubtitle);
        if (!TextUtils.isEmpty(m954c2)) {
            setSubtitle(m954c2);
        }
        this.f5341o = getContext();
        setPopupTheme(m944a.m962g(R.styleable.Toolbar_supportPopupTheme, 0));
        Drawable m948a = m944a.m948a(R.styleable.Toolbar_supportNavigationIcon);
        if (m948a != null) {
            setNavigationIcon(m948a);
        }
        CharSequence m954c3 = m944a.m954c(R.styleable.Toolbar_supportNavigationContentDescription);
        if (!TextUtils.isEmpty(m954c3)) {
            setNavigationContentDescription(m954c3);
        }
        this.f5317O = m944a.m958e(R.styleable.Toolbar_android_minHeight, 0);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f5329ad = m944a.m949a(R.styleable.Toolbar_showBottomDivider, false);
        if (m944a.m964i(R.styleable.Toolbar_minTitleTextSize)) {
            this.f5328ac = m944a.m958e(R.styleable.Toolbar_minTitleTextSize, (int) (displayMetrics.scaledDensity * 16.0f));
        } else {
            this.f5328ac = displayMetrics.scaledDensity * 16.0f;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f5343q, new int[]{android.R.attr.textSize});
        if (obtainStyledAttributes != null) {
            this.f5327ab = obtainStyledAttributes.getDimensionPixelSize(0, (int) (displayMetrics.scaledDensity * 24.0f));
            obtainStyledAttributes.recycle();
        }
        if (this.f5319Q == 1) {
            this.f5327ab = C1336a.m4370a(this.f5327ab, getResources().getConfiguration().fontScale, 2);
            this.f5328ac = C1336a.m4370a(this.f5328ac, getResources().getConfiguration().fontScale, 2);
        }
        this.f5322T = getContext().getResources().getDimensionPixelOffset(R.dimen.toolbar_normal_menu_padding);
        this.f5323U = getContext().getResources().getDimensionPixelOffset(R.dimen.toolbar_overflow_menu_padding);
        this.f5330ae = new C1188q(this);
        if (m944a.m964i(R.styleable.Toolbar_dividerBackgroundColor)) {
            this.f5330ae.m3940b(m944a.m950b(R.styleable.Toolbar_dividerBackgroundColor, C1188q.f4831b));
        }
        if (m944a.m964i(R.styleable.Toolbar_dividerColor)) {
            this.f5330ae.m3936a(m944a.m950b(R.styleable.Toolbar_dividerColor, C1188q.f4830a));
        }
        if (m944a.m964i(R.styleable.Toolbar_titleCenter)) {
            this.f5318P = m944a.m949a(R.styleable.Toolbar_titleCenter, false);
        }
        setWillNotDraw(false);
        m944a.m952b();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setPopupTheme(int i) {
        if (this.f5342p != i) {
            this.f5342p = i;
            if (i == 0) {
                this.f5341o = getContext();
            } else {
                this.f5341o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSearchView(View view) {
        m4142a(view, view != null ? new C1263ac(view.getLayoutParams()) : null);
    }

    /* renamed from: a */
    public final void m4142a(View view, C1263ac c1263ac) {
        if (view == null) {
            this.f5332f = false;
            return;
        }
        this.f5332f = view != null;
        C1263ac c1263ac2 = new C1263ac(c1263ac);
        c1263ac2.f5359d = true;
        c1263ac2.f5358c = 0;
        addView(view, 0, c1263ac2);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public int getPopupTheme() {
        return this.f5342p;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        if (this.f5351y != null) {
            this.f5351y.m4069a(i == 1);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setLogo(int i) {
        setLogo(C0057a.m46b(getContext(), i));
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: f */
    public final void mo662f() {
        if (this.f5333g != null) {
            this.f5333g.m570h();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m4138n();
            if (this.f5337k.getParent() == null) {
                m4121a((View) this.f5337k);
                m4136e(this.f5337k);
            }
        } else if (this.f5337k != null && this.f5337k.getParent() != null) {
            removeView(this.f5337k);
        }
        if (this.f5337k != null) {
            this.f5337k.setImageDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public Drawable getLogo() {
        if (this.f5337k != null) {
            return this.f5337k.getDrawable();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4138n();
        }
        if (this.f5337k != null) {
            this.f5337k.setContentDescription(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public CharSequence getLogoDescription() {
        if (this.f5337k != null) {
            return this.f5337k.getContentDescription();
        }
        return null;
    }

    /* renamed from: n */
    private void m4138n() {
        if (this.f5337k == null) {
            this.f5337k = new ImageView(getContext());
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: h */
    public final void mo664h() {
        C0172s c0172s = this.f5313K == null ? null : this.f5313K.f5356b;
        if (c0172s != null) {
            c0172s.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public CharSequence getTitle() {
        return this.f5303A;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f5334h == null) {
                Context context = getContext();
                this.f5334h = new TextView(context);
                C1263ac m4137m = m4137m();
                m4137m.bottomMargin = this.f5350x;
                m4137m.f285a = 8388613 | (this.f5345s & 112);
                this.f5334h.setLayoutParams(m4137m);
                this.f5334h.setSingleLine();
                this.f5334h.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f5343q != 0) {
                    this.f5334h.setTextAppearance(context, this.f5343q);
                }
                if (this.f5305C != 0) {
                    this.f5334h.setTextColor(this.f5305C);
                }
                if (this.f5319Q == 1) {
                    this.f5334h.setTextSize(0, C1336a.m4370a(this.f5334h.getTextSize(), getContext().getResources().getConfiguration().fontScale, 2));
                }
            }
            if (this.f5334h.getParent() == null) {
                m4121a((View) this.f5334h);
                m4136e(this.f5334h);
            }
        } else if (this.f5334h != null && this.f5334h.getParent() != null) {
            removeView(this.f5334h);
        }
        if (this.f5334h != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                this.f5334h.setTextAlignment(5);
            }
            this.f5334h.setText(charSequence);
            this.f5321S = this.f5334h.getTextSize();
        }
        this.f5303A = charSequence;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public CharSequence getSubtitle() {
        return this.f5304B;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f5335i == null) {
                Context context = getContext();
                this.f5335i = new TextView(context);
                this.f5335i.setSingleLine();
                this.f5335i.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f5344r != 0) {
                    this.f5335i.setTextAppearance(context, this.f5344r);
                }
                if (this.f5306D != 0) {
                    this.f5335i.setTextColor(this.f5306D);
                }
            }
            if (this.f5335i.getParent() == null) {
                m4121a((View) this.f5335i);
                m4136e(this.f5335i);
            }
        } else if (this.f5335i != null && this.f5335i.getParent() != null) {
            removeView(this.f5335i);
        }
        if (this.f5335i != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                this.f5335i.setTextAlignment(5);
            }
            this.f5335i.setText(charSequence);
        }
        this.f5304B = charSequence;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: a */
    public final void mo653a(Context context, int i) {
        this.f5343q = i;
        if (this.f5334h != null) {
            this.f5334h.setTextAppearance(context, i);
            if (this.f5319Q == 1) {
                this.f5334h.setTextSize(0, C1336a.m4370a(this.f5334h.getTextSize(), getContext().getResources().getConfiguration().fontScale, 2));
            }
            this.f5327ab = this.f5334h.getTextSize();
            this.f5321S = this.f5334h.getTextSize();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: b */
    public final void mo657b(Context context, int i) {
        this.f5344r = i;
        if (this.f5335i != null) {
            this.f5335i.setTextAppearance(context, i);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(int i) {
        this.f5305C = i;
        if (this.f5334h != null) {
            this.f5334h.setTextColor(i);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitleTextColor(int i) {
        this.f5306D = i;
        if (this.f5335i != null) {
            this.f5335i.setTextColor(i);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public CharSequence getNavigationContentDescription() {
        if (this.f5336j != null) {
            return this.f5336j.getContentDescription();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4140p();
        }
        if (this.f5336j != null) {
            this.f5336j.setContentDescription(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(int i) {
        setNavigationIcon(C0057a.m46b(getContext(), i));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m4140p();
            if (this.f5336j.getParent() == null) {
                m4121a((View) this.f5336j);
                m4136e(this.f5336j);
            }
        } else if (this.f5336j != null && this.f5336j.getParent() != null) {
            removeView(this.f5336j);
        }
        if (this.f5336j != null) {
            this.f5336j.setImageDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public Drawable getNavigationIcon() {
        if (this.f5336j != null) {
            return this.f5336j.getDrawable();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m4140p();
        this.f5336j.setOnClickListener(onClickListener);
    }

    /* renamed from: o */
    private void m4139o() {
        if (this.f5333g == null) {
            this.f5333g = new ColorActionMenuViewV6(getContext());
            this.f5333g.setPopupTheme(this.f5342p);
            this.f5333g.setOnMenuItemClickListener(this.f5312J);
            this.f5333g.m562a(this.f5314L, this.f5315M);
            C1263ac m4137m = m4137m();
            if (this.f5318P) {
                m4137m.width = -1;
            } else {
                m4137m.width = -2;
            }
            m4137m.f285a = 8388613 | (this.f5345s & 112);
            this.f5333g.setLayoutParams(m4137m);
            m4121a((View) this.f5333g);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setOnMenuItemClickListener(InterfaceC0282dt interfaceC0282dt) {
        this.f5311I = interfaceC0282dt;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: a */
    public final void mo652a(int i, int i2) {
        this.f5351y.m4068a(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public int getContentInsetStart() {
        return this.f5351y.m4072c();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public int getContentInsetEnd() {
        return this.f5351y.m4073d();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public int getContentInsetLeft() {
        return this.f5351y.m4067a();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public int getContentInsetRight() {
        return this.f5351y.m4070b();
    }

    /* renamed from: p */
    private void m4140p() {
        if (this.f5336j == null) {
            this.f5336j = new ImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1263ac m4137m = m4137m();
            m4137m.f285a = 8388611 | (this.f5345s & 112);
            this.f5336j.setLayoutParams(m4137m);
            this.f5336j.setBackgroundResource(R.drawable.color_toolbar_menu_bg);
        }
    }

    /* renamed from: a */
    private void m4121a(View view) {
        C1263ac c1263ac;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c1263ac = m4137m();
        } else if (!checkLayoutParams(layoutParams)) {
            c1263ac = m4129b(layoutParams);
        } else {
            c1263ac = (C1263ac) layoutParams;
        }
        c1263ac.f5358c = 1;
        addView(view, c1263ac);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5325W);
    }

    /* renamed from: a */
    private void m4122a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private int m4118a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        int childMeasureSpec;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z = false;
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        if ((marginLayoutParams instanceof C1263ac) && ((C1263ac) marginLayoutParams).f5359d && this.f5332f) {
            z = true;
        }
        if (z) {
            childMeasureSpec = getChildMeasureSpec(i, getContentInsetStart() + max + getContentInsetStart(), marginLayoutParams.width);
        } else {
            childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width);
        }
        view.measure(childMeasureSpec, getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return z ? max : view.getMeasuredWidth() + max;
    }

    /* renamed from: q */
    private boolean m4141q() {
        if (!this.f5316N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m4131b(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char c3;
        char c4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        char c5;
        char c6;
        int i19;
        int i20;
        boolean z = C0538w.m1878h(this) == 1;
        if (this.f5318P) {
            int[] iArr = this.f5310H;
            if (C0295ef.m987a(this)) {
                c4 = 1;
                c3 = 0;
            } else {
                c3 = 1;
                c4 = 0;
            }
            int contentInsetStart = getContentInsetStart();
            int max = Math.max(contentInsetStart, 0) + 0;
            iArr[c4] = Math.max(0, contentInsetStart - 0);
            if (m4131b((View) this.f5333g)) {
                m4123a((C0168o) this.f5333g.getMenu(), z);
                m4122a(this.f5333g, i, 0, i2, this.f5346t);
                i12 = this.f5333g.getMeasuredWidth() + m4132c(this.f5333g);
                i14 = Math.max(0, this.f5333g.getMeasuredHeight() + m4134d((View) this.f5333g));
                i13 = View.combineMeasuredStates(0, C0538w.m1881j(this.f5333g));
            } else {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            int contentInsetEnd = getContentInsetEnd();
            int max2 = max + Math.max(contentInsetEnd, i12);
            iArr[c3] = Math.max(0, contentInsetEnd - i12);
            if (m4131b(this.f5331e)) {
                max2 += m4118a(this.f5331e, i, max2, i2, 0, iArr);
                i14 = Math.max(i14, this.f5331e.getMeasuredHeight() + m4134d(this.f5331e));
                i13 = View.combineMeasuredStates(i13, C0538w.m1881j(this.f5331e));
            }
            int childCount = getChildCount();
            int i21 = i14;
            int i22 = max2;
            int i23 = i13;
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt = getChildAt(i24);
                if (((C1263ac) childAt.getLayoutParams()).f5358c == 0 && m4131b(childAt)) {
                    i22 += m4118a(childAt, i, i22, i2, 0, iArr);
                    i21 = Math.max(i21, childAt.getMeasuredHeight() + m4134d(childAt));
                    i23 = View.combineMeasuredStates(i23, C0538w.m1881j(childAt));
                } else {
                    i21 = i21;
                }
            }
            int i25 = i21;
            int i26 = this.f5349w + this.f5350x;
            if (m4131b((View) this.f5334h)) {
                this.f5334h.getLayoutParams().width = -2;
                this.f5334h.setTextSize(0, this.f5321S);
                m4118a(this.f5334h, i, 0, i2, i26, iArr);
                int measuredWidth = this.f5334h.getMeasuredWidth() + m4132c(this.f5334h);
                i15 = this.f5334h.getMeasuredHeight() + m4134d((View) this.f5334h);
                i16 = View.combineMeasuredStates(i23, C0538w.m1881j(this.f5334h));
                i17 = measuredWidth;
            } else {
                i15 = 0;
                i16 = i23;
                i17 = 0;
            }
            if (m4131b((View) this.f5335i)) {
                this.f5335i.getLayoutParams().width = -2;
                i18 = i15;
                i17 = Math.max(i17, m4118a(this.f5335i, i, 0, i2, i15 + i26, iArr));
                i16 = View.combineMeasuredStates(i16, C0538w.m1881j(this.f5335i));
            } else {
                i18 = i15;
            }
            int max3 = Math.max(i25, i18);
            int paddingLeft = i22 + i17 + getPaddingLeft() + getPaddingRight();
            int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
            int m1835a = C0538w.m1835a(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i16);
            int m1835a2 = C0538w.m1835a(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i16 << 16);
            if (this.f5329ad) {
                m1835a2 += this.f5330ae.m3939b();
            }
            int i27 = m1835a2;
            if (m4141q()) {
                i27 = 0;
            }
            setMeasuredDimension(m1835a, i27);
            int[] iArr2 = this.f5320R;
            boolean z2 = C0538w.m1878h(this) == 1;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.color_actionbar_menuitemview_item_spacing);
            iArr2[0] = Math.max(this.f5351y.m4067a(), getPaddingLeft());
            iArr2[1] = getMeasuredWidth() - Math.max(this.f5351y.m4070b(), getPaddingRight());
            if (!m4131b((View) this.f5333g) || this.f5333g.getChildCount() == 0) {
                c5 = 1;
                c6 = 0;
            } else {
                if (this.f5333g.getChildCount() == 1) {
                    i20 = 0;
                    i19 = this.f5333g.getChildAt(0).getMeasuredWidth() + dimensionPixelSize + 0;
                } else {
                    int measuredWidth2 = this.f5333g.getChildAt(0).getMeasuredWidth() + dimensionPixelSize + 0;
                    int i28 = 0;
                    for (int i29 = 1; i29 < this.f5333g.getChildCount(); i29++) {
                        i28 += this.f5333g.getChildAt(i29).getMeasuredWidth() + dimensionPixelSize;
                    }
                    i19 = i28;
                    i20 = measuredWidth2;
                }
                if (z2) {
                    c6 = 0;
                    iArr2[0] = iArr2[0] + i19;
                    c5 = 1;
                    iArr2[1] = iArr2[1] - i20;
                } else {
                    c6 = 0;
                    c5 = 1;
                    iArr2[0] = iArr2[0] + i20;
                    iArr2[1] = iArr2[1] - i19;
                }
            }
            int i30 = this.f5320R[c5] - this.f5320R[c6];
            if (m4131b((View) this.f5334h) && this.f5334h.getMeasuredWidth() > this.f5320R[c5] - this.f5320R[c6]) {
                m4118a(this.f5334h, View.MeasureSpec.makeMeasureSpec(i30, RecyclerView.UNDEFINED_DURATION), 0, i2, i26, iArr);
            }
            if (!m4131b((View) this.f5335i) || this.f5335i.getMeasuredWidth() <= this.f5320R[1] - this.f5320R[0]) {
                return;
            }
            m4118a(this.f5335i, View.MeasureSpec.makeMeasureSpec(i30, RecyclerView.UNDEFINED_DURATION), 0, i2, i18 + i26, iArr);
            return;
        }
        int[] iArr3 = this.f5310H;
        if (C0295ef.m987a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (m4131b((View) this.f5336j)) {
            m4122a(this.f5336j, i, 0, i2, this.f5346t);
            i3 = this.f5336j.getMeasuredWidth() + m4132c(this.f5336j);
            i4 = Math.max(0, this.f5336j.getMeasuredHeight() + m4134d((View) this.f5336j));
            i5 = View.combineMeasuredStates(0, C0538w.m1881j(this.f5336j));
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m4131b((View) this.f5340n)) {
            m4122a(this.f5340n, i, 0, i2, this.f5346t);
            i3 = this.f5340n.getMeasuredWidth() + m4132c(this.f5340n);
            i4 = Math.max(i4, this.f5340n.getMeasuredHeight() + m4134d((View) this.f5340n));
            i5 = View.combineMeasuredStates(i5, C0538w.m1881j(this.f5340n));
        }
        int contentInsetStart2 = getContentInsetStart();
        int max4 = Math.max(contentInsetStart2, i3) + 0;
        iArr3[c2] = Math.max(0, contentInsetStart2 - i3);
        if (m4131b((View) this.f5333g)) {
            m4123a((C0168o) this.f5333g.getMenu(), z);
            m4122a(this.f5333g, i, max4, i2, this.f5346t);
            i6 = this.f5333g.getMeasuredWidth() + m4132c(this.f5333g);
            i4 = Math.max(i4, this.f5333g.getMeasuredHeight() + m4134d((View) this.f5333g));
            i5 = View.combineMeasuredStates(i5, C0538w.m1881j(this.f5333g));
        } else {
            i6 = 0;
        }
        int contentInsetEnd2 = getContentInsetEnd();
        int max5 = max4 + Math.max(contentInsetEnd2, i6);
        iArr3[c] = Math.max(0, contentInsetEnd2 - i6);
        if (m4131b(this.f5331e)) {
            max5 += m4118a(this.f5331e, i, max5, i2, 0, iArr3);
            i4 = Math.max(i4, this.f5331e.getMeasuredHeight() + m4134d(this.f5331e));
            i5 = View.combineMeasuredStates(i5, C0538w.m1881j(this.f5331e));
        }
        if (m4131b((View) this.f5337k)) {
            max5 += m4118a(this.f5337k, i, max5, i2, 0, iArr3);
            i4 = Math.max(i4, this.f5337k.getMeasuredHeight() + m4134d((View) this.f5337k));
            i5 = View.combineMeasuredStates(i5, C0538w.m1881j(this.f5337k));
        }
        int childCount2 = getChildCount();
        for (int i31 = 0; i31 < childCount2; i31++) {
            View childAt2 = getChildAt(i31);
            if (((C1263ac) childAt2.getLayoutParams()).f5358c == 0 && m4131b(childAt2)) {
                max5 += m4118a(childAt2, i, max5, i2, 0, iArr3);
                i4 = Math.max(i4, childAt2.getMeasuredHeight() + m4134d(childAt2));
                i5 = View.combineMeasuredStates(i5, C0538w.m1881j(childAt2));
            }
        }
        int i32 = this.f5349w + this.f5350x;
        int i33 = this.f5347u + this.f5348v;
        if (m4131b((View) this.f5334h)) {
            this.f5334h.getLayoutParams().width = -1;
            this.f5334h.setTextSize(0, this.f5321S);
            i8 = 0;
            i7 = -1;
            m4118a(this.f5334h, i, max5 + i33, i2, i32, iArr3);
            int measuredWidth3 = this.f5334h.getMeasuredWidth() + m4132c(this.f5334h);
            i11 = this.f5334h.getMeasuredHeight() + m4134d((View) this.f5334h);
            i9 = View.combineMeasuredStates(i5, C0538w.m1881j(this.f5334h));
            i10 = measuredWidth3;
        } else {
            i7 = -1;
            i8 = 0;
            i9 = i5;
            i10 = 0;
            i11 = 0;
        }
        if (m4131b((View) this.f5335i)) {
            this.f5335i.getLayoutParams().width = i7;
            i10 = Math.max(i10, m4118a(this.f5335i, i, max5 + i33, i2, i11 + i32, iArr3));
            i11 += this.f5335i.getMeasuredHeight() + m4134d((View) this.f5335i);
            i9 = View.combineMeasuredStates(i9, C0538w.m1881j(this.f5335i));
        }
        int max6 = Math.max(i4, i11);
        int paddingLeft2 = max5 + i10 + getPaddingLeft() + getPaddingRight();
        int paddingTop2 = max6 + getPaddingTop() + getPaddingBottom();
        int m1835a3 = C0538w.m1835a(Math.max(paddingLeft2, getSuggestedMinimumWidth()), i, (-16777216) & i9);
        int m1835a4 = C0538w.m1835a(Math.max(paddingTop2, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.f5329ad) {
            m1835a4 += this.f5330ae.m3939b();
        }
        int i34 = m1835a4;
        if (m4141q()) {
            i34 = i8;
        }
        setMeasuredDimension(m1835a3, i34);
    }

    /* renamed from: a */
    private void m4123a(C0168o c0168o, boolean z) {
        if (c0168o == null) {
            return;
        }
        if (c0168o.m471o().isEmpty()) {
            setPadding(this.f5322T, getPaddingTop(), this.f5322T, getPaddingBottom());
        } else if (z) {
            setPadding(this.f5323U, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        } else {
            setPadding(getPaddingLeft(), getPaddingTop(), this.f5323U, getPaddingBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0451 A[LOOP:2: B:74:0x044f->B:75:0x0451, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04a1 A[LOOP:3: B:83:0x049f->B:84:0x04a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: color.support.p043v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: a */
    private int m4119a(View view, int i, int[] iArr, int i2) {
        C1263ac c1263ac = (C1263ac) view.getLayoutParams();
        int i3 = c1263ac.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int m4117a = m4117a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m4117a, max + measuredWidth, view.getMeasuredHeight() + m4117a);
        return max + measuredWidth + c1263ac.rightMargin;
    }

    /* renamed from: b */
    private int m4127b(View view, int i, int[] iArr, int i2) {
        C1263ac c1263ac = (C1263ac) view.getLayoutParams();
        int i3 = c1263ac.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m4117a = m4117a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m4117a, max, view.getMeasuredHeight() + m4117a);
        return max - (measuredWidth + c1263ac.leftMargin);
    }

    /* renamed from: a */
    private int m4117a(View view, int i) {
        C1263ac c1263ac = (C1263ac) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int m4116a = m4116a(c1263ac.f285a);
        if (m4116a == 48) {
            return getPaddingTop() - i2;
        }
        if (m4116a == 80) {
            return ((((getHeight() - (this.f5329ad ? this.f5330ae.m3939b() : 0)) - getPaddingBottom()) - measuredHeight) - c1263ac.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight() - (this.f5329ad ? this.f5330ae.m3939b() : 0);
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < c1263ac.topMargin) {
            i3 = c1263ac.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < c1263ac.bottomMargin) {
                i3 = Math.max(0, i3 - (c1263ac.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m4116a(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f5352z & 112;
    }

    /* renamed from: a */
    private void m4125a(List<View> list, int i) {
        boolean z = C0538w.m1878h(this) == 1;
        int childCount = getChildCount();
        int m1777a = C0521f.m1777a(i, C0538w.m1878h(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1263ac c1263ac = (C1263ac) childAt.getLayoutParams();
                if (c1263ac.f5358c == 0 && m4131b(childAt) && m4126b(c1263ac.f285a) == m1777a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C1263ac c1263ac2 = (C1263ac) childAt2.getLayoutParams();
            if (c1263ac2.f5358c == 0 && m4131b(childAt2) && m4126b(c1263ac2.f285a) == m1777a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int m4126b(int i) {
        int m1878h = C0538w.m1878h(this);
        int m1777a = C0521f.m1777a(i, m1878h) & 7;
        return (m1777a == 1 || m1777a == 3 || m1777a == 5) ? m1777a : m1878h == 1 ? 5 : 3;
    }

    /* renamed from: b */
    private boolean m4131b(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: c */
    private static int m4132c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0525j.m1785a(marginLayoutParams) + C0525j.m1787b(marginLayoutParams);
    }

    /* renamed from: d */
    private static int m4134d(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C1263ac generateLayoutParams(AttributeSet attributeSet) {
        return new C1263ac(getContext(), attributeSet);
    }

    /* renamed from: b */
    private static C1263ac m4129b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1263ac) {
            return new C1263ac((C1263ac) layoutParams);
        }
        if (layoutParams instanceof C0086b) {
            return new C1263ac((C0086b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1263ac((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1263ac(layoutParams);
    }

    /* renamed from: m */
    public static C1263ac m4137m() {
        return new C1263ac(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1263ac);
    }

    public void setChildVisibilityForExpandedActionView(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((C1263ac) childAt.getLayoutParams()).f5358c != 2 && childAt != this.f5333g) {
                childAt.setVisibility(z ? 8 : 0);
            }
        }
    }

    /* renamed from: e */
    private void m4136e(View view) {
        if (((C1263ac) view.getLayoutParams()).f5358c == 2 || view == this.f5333g) {
            return;
        }
        view.setVisibility(this.f5331e != null ? 8 : 0);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setCollapsible(boolean z) {
        this.f5316N = z;
        requestLayout();
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: a */
    public final void mo654a(InterfaceC0145ae interfaceC0145ae, InterfaceC0169p interfaceC0169p) {
        this.f5314L = interfaceC0145ae;
        this.f5315M = interfaceC0169p;
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f5317O = i;
        super.setMinimumHeight(i);
    }

    private int getMinimumHeightCompat() {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0538w.m1886o(this);
        }
        return this.f5317O;
    }

    public void setIsTitleCenterStyle(boolean z) {
        m4139o();
        this.f5318P = z;
        C1263ac c1263ac = (C1263ac) this.f5333g.getLayoutParams();
        if (this.f5318P) {
            c1263ac.width = -1;
        } else {
            c1263ac.width = -2;
        }
        this.f5333g.setLayoutParams(c1263ac);
        requestLayout();
    }

    public boolean getIsTitleCenterStyle() {
        return this.f5318P;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5330ae != null) {
            this.f5330ae.m3938a(this.f5329ad);
        }
    }

    public int getTotalScaleRange() {
        if (this.f5326aa < 0) {
            this.f5326aa = getMeasuredHeight() - C0538w.m1886o(this);
            if (this.f5329ad) {
                this.f5326aa -= this.f5330ae.m3935a();
            }
        }
        return this.f5326aa;
    }

    public void setMinTitleTextSize(float f) {
        if (f > this.f5327ab) {
            f = this.f5327ab;
        }
        this.f5328ac = f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f5329ad) {
            this.f5330ae.m3937a(canvas);
        }
    }

    public int getBottomDividerHeight() {
        if (this.f5329ad) {
            return this.f5330ae.m3939b();
        }
        return 0;
    }

    public void setBottomDividerHeight(int i) {
        this.f5330ae.m3944f(i);
        postInvalidate();
    }

    public void setBottomDividerBackground(int i) {
        this.f5330ae.m3940b(i);
        postInvalidate();
    }

    public void setDividerColor(int i) {
        this.f5330ae.m3936a(i);
        postInvalidate();
    }

    public void setDividerMaxHeight(int i) {
        this.f5330ae.m3941c(i);
        postInvalidate();
    }

    public void setDividerMinHeight(int i) {
        this.f5330ae.m3942d(i);
        postInvalidate();
    }

    public void setDividerMargin(int i) {
        this.f5330ae.m3943e(i);
        postInvalidate();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public Menu getMenu() {
        m4139o();
        if (this.f5333g.m565c() == null) {
            C0168o c0168o = (C0168o) this.f5333g.getMenu();
            if (this.f5313K == null) {
                this.f5313K = new C1262ab(this, (byte) 0);
            }
            this.f5333g.setExpandedActionViewsExclusive(true);
            c0168o.m451a(this.f5313K, this.f5341o);
        }
        return this.f5333g.getMenu();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5307E = false;
        }
        if (!this.f5307E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f5307E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5307E = false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5308F = false;
        }
        if (!this.f5308F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f5308F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5308F = false;
        }
        return true;
    }

    /* renamed from: b */
    public static /* synthetic */ void m4130b(Toolbar toolbar) {
        if (toolbar.f5340n == null) {
            toolbar.f5340n = new ImageButton(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.f5340n.setImageDrawable(toolbar.f5338l);
            toolbar.f5340n.setContentDescription(toolbar.f5339m);
            C1263ac m4137m = m4137m();
            m4137m.f285a = 8388611 | (toolbar.f5345s & 112);
            m4137m.f5358c = 2;
            toolbar.f5340n.setLayoutParams(m4137m);
            toolbar.f5340n.setOnClickListener(new ViewOnClickListenerC1261aa(toolbar));
        }
    }
}
