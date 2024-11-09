package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.app.C0086b;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.view.C0135i;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.appcompat.view.menu.InterfaceC0169p;
import androidx.core.p024g.C0521f;
import androidx.core.p024g.C0525j;
import androidx.core.p024g.C0538w;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private ColorStateList f1036A;

    /* renamed from: B */
    private ColorStateList f1037B;

    /* renamed from: C */
    private boolean f1038C;

    /* renamed from: D */
    private boolean f1039D;

    /* renamed from: E */
    private final ArrayList<View> f1040E;

    /* renamed from: F */
    private final ArrayList<View> f1041F;

    /* renamed from: G */
    private final int[] f1042G;

    /* renamed from: H */
    private final InterfaceC0312u f1043H;

    /* renamed from: I */
    private C0284dv f1044I;

    /* renamed from: J */
    private ActionMenuPresenter f1045J;

    /* renamed from: K */
    private C0280dr f1046K;

    /* renamed from: L */
    private InterfaceC0145ae f1047L;

    /* renamed from: M */
    private InterfaceC0169p f1048M;

    /* renamed from: N */
    private boolean f1049N;

    /* renamed from: O */
    private final Runnable f1050O;

    /* renamed from: a */
    ImageButton f1051a;

    /* renamed from: b */
    View f1052b;

    /* renamed from: c */
    int f1053c;

    /* renamed from: d */
    InterfaceC0282dt f1054d;

    /* renamed from: e */
    private ActionMenuView f1055e;

    /* renamed from: f */
    private TextView f1056f;

    /* renamed from: g */
    private TextView f1057g;

    /* renamed from: h */
    private ImageButton f1058h;

    /* renamed from: i */
    private ImageView f1059i;

    /* renamed from: j */
    private Drawable f1060j;

    /* renamed from: k */
    private CharSequence f1061k;

    /* renamed from: l */
    private Context f1062l;

    /* renamed from: m */
    private int f1063m;

    /* renamed from: n */
    private int f1064n;

    /* renamed from: o */
    private int f1065o;

    /* renamed from: p */
    private int f1066p;

    /* renamed from: q */
    private int f1067q;

    /* renamed from: r */
    private int f1068r;

    /* renamed from: s */
    private int f1069s;

    /* renamed from: t */
    private int f1070t;

    /* renamed from: u */
    private C0246ck f1071u;

    /* renamed from: v */
    private int f1072v;

    /* renamed from: w */
    private int f1073w;

    /* renamed from: x */
    private int f1074x;

    /* renamed from: y */
    private CharSequence f1075y;

    /* renamed from: z */
    private CharSequence f1076z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1074x = 8388627;
        this.f1040E = new ArrayList<>();
        this.f1041F = new ArrayList<>();
        this.f1042G = new int[2];
        this.f1043H = new C0277do(this);
        this.f1050O = new RunnableC0278dp(this);
        C0276dn m944a = C0276dn.m944a(getContext(), attributeSet, R.styleable.Toolbar, i, 0);
        this.f1064n = m944a.m962g(R.styleable.Toolbar_titleTextAppearance, 0);
        this.f1065o = m944a.m962g(R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.f1074x = m944a.m953c(R.styleable.Toolbar_android_gravity, this.f1074x);
        this.f1053c = m944a.m953c(R.styleable.Toolbar_buttonGravity, 48);
        int m955d = m944a.m955d(R.styleable.Toolbar_titleMargin, 0);
        m955d = m944a.m964i(R.styleable.Toolbar_titleMargins) ? m944a.m955d(R.styleable.Toolbar_titleMargins, m955d) : m955d;
        this.f1070t = m955d;
        this.f1069s = m955d;
        this.f1068r = m955d;
        this.f1067q = m955d;
        int m955d2 = m944a.m955d(R.styleable.Toolbar_titleMarginStart, -1);
        if (m955d2 >= 0) {
            this.f1067q = m955d2;
        }
        int m955d3 = m944a.m955d(R.styleable.Toolbar_titleMarginEnd, -1);
        if (m955d3 >= 0) {
            this.f1068r = m955d3;
        }
        int m955d4 = m944a.m955d(R.styleable.Toolbar_titleMarginTop, -1);
        if (m955d4 >= 0) {
            this.f1069s = m955d4;
        }
        int m955d5 = m944a.m955d(R.styleable.Toolbar_titleMarginBottom, -1);
        if (m955d5 >= 0) {
            this.f1070t = m955d5;
        }
        this.f1066p = m944a.m958e(R.styleable.Toolbar_maxButtonHeight, -1);
        int m955d6 = m944a.m955d(R.styleable.Toolbar_contentInsetStart, RecyclerView.UNDEFINED_DURATION);
        int m955d7 = m944a.m955d(R.styleable.Toolbar_contentInsetEnd, RecyclerView.UNDEFINED_DURATION);
        int m958e = m944a.m958e(R.styleable.Toolbar_contentInsetLeft, 0);
        int m958e2 = m944a.m958e(R.styleable.Toolbar_contentInsetRight, 0);
        m649q();
        this.f1071u.m906b(m958e, m958e2);
        if (m955d6 != Integer.MIN_VALUE || m955d7 != Integer.MIN_VALUE) {
            this.f1071u.m903a(m955d6, m955d7);
        }
        this.f1072v = m944a.m955d(R.styleable.Toolbar_contentInsetStartWithNavigation, RecyclerView.UNDEFINED_DURATION);
        this.f1073w = m944a.m955d(R.styleable.Toolbar_contentInsetEndWithActions, RecyclerView.UNDEFINED_DURATION);
        this.f1060j = m944a.m948a(R.styleable.Toolbar_collapseIcon);
        this.f1061k = m944a.m954c(R.styleable.Toolbar_collapseContentDescription);
        CharSequence m954c = m944a.m954c(R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(m954c)) {
            setTitle(m954c);
        }
        CharSequence m954c2 = m944a.m954c(R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m954c2)) {
            setSubtitle(m954c2);
        }
        this.f1062l = getContext();
        setPopupTheme(m944a.m962g(R.styleable.Toolbar_popupTheme, 0));
        Drawable m948a = m944a.m948a(R.styleable.Toolbar_navigationIcon);
        if (m948a != null) {
            setNavigationIcon(m948a);
        }
        CharSequence m954c3 = m944a.m954c(R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m954c3)) {
            setNavigationContentDescription(m954c3);
        }
        Drawable m948a2 = m944a.m948a(R.styleable.Toolbar_logo);
        if (m948a2 != null) {
            setLogo(m948a2);
        }
        CharSequence m954c4 = m944a.m954c(R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m954c4)) {
            setLogoDescription(m954c4);
        }
        if (m944a.m964i(R.styleable.Toolbar_titleTextColor)) {
            setTitleTextColor(m944a.m960f(R.styleable.Toolbar_titleTextColor));
        }
        if (m944a.m964i(R.styleable.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(m944a.m960f(R.styleable.Toolbar_subtitleTextColor));
        }
        if (m944a.m964i(R.styleable.Toolbar_menu)) {
            getMenuInflater().inflate(m944a.m962g(R.styleable.Toolbar_menu, 0), getMenu());
        }
        m944a.m952b();
    }

    public void setPopupTheme(int i) {
        if (this.f1063m != i) {
            this.f1063m = i;
            if (i == 0) {
                this.f1062l = getContext();
            } else {
                this.f1062l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f1063m;
    }

    public int getTitleMarginStart() {
        return this.f1067q;
    }

    public void setTitleMarginStart(int i) {
        this.f1067q = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.f1069s;
    }

    public void setTitleMarginTop(int i) {
        this.f1069s = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.f1068r;
    }

    public void setTitleMarginEnd(int i) {
        this.f1068r = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.f1070t;
    }

    public void setTitleMarginBottom(int i) {
        this.f1070t = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m649q();
        this.f1071u.m904a(i == 1);
    }

    public void setLogo(int i) {
        setLogo(C0057a.m46b(getContext(), i));
    }

    /* renamed from: a */
    public final boolean m656a() {
        return getVisibility() == 0 && this.f1055e != null && this.f1055e.m563a();
    }

    /* renamed from: b */
    public final boolean m658b() {
        return this.f1055e != null && this.f1055e.m568f();
    }

    /* renamed from: c */
    public final boolean m659c() {
        return this.f1055e != null && this.f1055e.m569g();
    }

    /* renamed from: d */
    public final boolean m660d() {
        return this.f1055e != null && this.f1055e.m566d();
    }

    /* renamed from: e */
    public final boolean m661e() {
        return this.f1055e != null && this.f1055e.m567e();
    }

    /* renamed from: a */
    public final void m655a(C0168o c0168o, ActionMenuPresenter actionMenuPresenter) {
        if (c0168o == null && this.f1055e == null) {
            return;
        }
        m647o();
        C0168o m565c = this.f1055e.m565c();
        if (m565c == c0168o) {
            return;
        }
        if (m565c != null) {
            m565c.m457b(this.f1045J);
            m565c.m457b(this.f1046K);
        }
        if (this.f1046K == null) {
            this.f1046K = new C0280dr(this);
        }
        actionMenuPresenter.m545b(true);
        if (c0168o != null) {
            c0168o.m451a(actionMenuPresenter, this.f1062l);
            c0168o.m451a(this.f1046K, this.f1062l);
        } else {
            actionMenuPresenter.mo357a(this.f1062l, (C0168o) null);
            this.f1046K.mo357a(this.f1062l, (C0168o) null);
            actionMenuPresenter.mo387a(true);
            this.f1046K.mo387a(true);
        }
        this.f1055e.setPopupTheme(this.f1063m);
        this.f1055e.setPresenter(actionMenuPresenter);
        this.f1045J = actionMenuPresenter;
    }

    /* renamed from: f */
    public void mo662f() {
        if (this.f1055e != null) {
            this.f1055e.m570h();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m645m();
            if (!m644d(this.f1059i)) {
                m637a((View) this.f1059i, true);
            }
        } else if (this.f1059i != null && m644d(this.f1059i)) {
            removeView(this.f1059i);
            this.f1041F.remove(this.f1059i);
        }
        if (this.f1059i != null) {
            this.f1059i.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        if (this.f1059i != null) {
            return this.f1059i.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m645m();
        }
        if (this.f1059i != null) {
            this.f1059i.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        if (this.f1059i != null) {
            return this.f1059i.getContentDescription();
        }
        return null;
    }

    /* renamed from: m */
    private void m645m() {
        if (this.f1059i == null) {
            this.f1059i = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: g */
    public final boolean m663g() {
        return (this.f1046K == null || this.f1046K.f1373b == null) ? false : true;
    }

    /* renamed from: h */
    public void mo664h() {
        C0172s c0172s = this.f1046K == null ? null : this.f1046K.f1373b;
        if (c0172s != null) {
            c0172s.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.f1075y;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1056f == null) {
                Context context = getContext();
                this.f1056f = new AppCompatTextView(context);
                this.f1056f.setSingleLine();
                this.f1056f.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f1064n != 0) {
                    this.f1056f.setTextAppearance(context, this.f1064n);
                }
                if (this.f1036A != null) {
                    this.f1056f.setTextColor(this.f1036A);
                }
            }
            if (!m644d(this.f1056f)) {
                m637a((View) this.f1056f, true);
            }
        } else if (this.f1056f != null && m644d(this.f1056f)) {
            removeView(this.f1056f);
            this.f1041F.remove(this.f1056f);
        }
        if (this.f1056f != null) {
            this.f1056f.setText(charSequence);
        }
        this.f1075y = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.f1076z;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1057g == null) {
                Context context = getContext();
                this.f1057g = new AppCompatTextView(context);
                this.f1057g.setSingleLine();
                this.f1057g.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f1065o != 0) {
                    this.f1057g.setTextAppearance(context, this.f1065o);
                }
                if (this.f1037B != null) {
                    this.f1057g.setTextColor(this.f1037B);
                }
            }
            if (!m644d(this.f1057g)) {
                m637a((View) this.f1057g, true);
            }
        } else if (this.f1057g != null && m644d(this.f1057g)) {
            removeView(this.f1057g);
            this.f1041F.remove(this.f1057g);
        }
        if (this.f1057g != null) {
            this.f1057g.setText(charSequence);
        }
        this.f1076z = charSequence;
    }

    /* renamed from: a */
    public void mo653a(Context context, int i) {
        this.f1064n = i;
        if (this.f1056f != null) {
            this.f1056f.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public void mo657b(Context context, int i) {
        this.f1065o = i;
        if (this.f1057g != null) {
            this.f1057g.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1036A = colorStateList;
        if (this.f1056f != null) {
            this.f1056f.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1037B = colorStateList;
        if (this.f1057g != null) {
            this.f1057g.setTextColor(colorStateList);
        }
    }

    public CharSequence getNavigationContentDescription() {
        if (this.f1058h != null) {
            return this.f1058h.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m648p();
        }
        if (this.f1058h != null) {
            this.f1058h.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0057a.m46b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m648p();
            if (!m644d(this.f1058h)) {
                m637a((View) this.f1058h, true);
            }
        } else if (this.f1058h != null && m644d(this.f1058h)) {
            removeView(this.f1058h);
            this.f1041F.remove(this.f1058h);
        }
        if (this.f1058h != null) {
            this.f1058h.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        if (this.f1058h != null) {
            return this.f1058h.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m648p();
        this.f1058h.setOnClickListener(onClickListener);
    }

    public CharSequence getCollapseContentDescription() {
        if (this.f1051a != null) {
            return this.f1051a.getContentDescription();
        }
        return null;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m665i();
        }
        if (this.f1051a != null) {
            this.f1051a.setContentDescription(charSequence);
        }
    }

    public Drawable getCollapseIcon() {
        if (this.f1051a != null) {
            return this.f1051a.getDrawable();
        }
        return null;
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C0057a.m46b(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m665i();
            this.f1051a.setImageDrawable(drawable);
        } else if (this.f1051a != null) {
            this.f1051a.setImageDrawable(this.f1060j);
        }
    }

    public Menu getMenu() {
        m646n();
        return this.f1055e.getMenu();
    }

    public void setOverflowIcon(Drawable drawable) {
        m646n();
        this.f1055e.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        m646n();
        return this.f1055e.getOverflowIcon();
    }

    /* renamed from: n */
    private void m646n() {
        m647o();
        if (this.f1055e.m565c() == null) {
            C0168o c0168o = (C0168o) this.f1055e.getMenu();
            if (this.f1046K == null) {
                this.f1046K = new C0280dr(this);
            }
            this.f1055e.setExpandedActionViewsExclusive(true);
            c0168o.m451a(this.f1046K, this.f1062l);
        }
    }

    /* renamed from: o */
    private void m647o() {
        if (this.f1055e == null) {
            this.f1055e = new ActionMenuView(getContext());
            this.f1055e.setPopupTheme(this.f1063m);
            this.f1055e.setOnMenuItemClickListener(this.f1043H);
            this.f1055e.m562a(this.f1047L, this.f1048M);
            C0281ds generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f285a = 8388613 | (this.f1053c & 112);
            this.f1055e.setLayoutParams(generateDefaultLayoutParams);
            m637a((View) this.f1055e, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new C0135i(getContext());
    }

    public void setOnMenuItemClickListener(InterfaceC0282dt interfaceC0282dt) {
        this.f1054d = interfaceC0282dt;
    }

    /* renamed from: a */
    public void mo652a(int i, int i2) {
        m649q();
        this.f1071u.m903a(i, i2);
    }

    public int getContentInsetStart() {
        if (this.f1071u != null) {
            return this.f1071u.m907c();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        if (this.f1071u != null) {
            return this.f1071u.m908d();
        }
        return 0;
    }

    public int getContentInsetLeft() {
        if (this.f1071u != null) {
            return this.f1071u.m902a();
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.f1071u != null) {
            return this.f1071u.m905b();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.f1072v != Integer.MIN_VALUE ? this.f1072v : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f1072v) {
            this.f1072v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        return this.f1073w != Integer.MIN_VALUE ? this.f1073w : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f1073w) {
            this.f1073w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1072v, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0168o m565c;
        if ((this.f1055e == null || (m565c = this.f1055e.m565c()) == null || !m565c.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1073w, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (C0538w.m1878h(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C0538w.m1878h(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    /* renamed from: p */
    private void m648p() {
        if (this.f1058h == null) {
            this.f1058h = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C0281ds generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f285a = 8388611 | (this.f1053c & 112);
            this.f1058h.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: i */
    public final void m665i() {
        if (this.f1051a == null) {
            this.f1051a = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1051a.setImageDrawable(this.f1060j);
            this.f1051a.setContentDescription(this.f1061k);
            C0281ds generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f285a = 8388611 | (this.f1053c & 112);
            generateDefaultLayoutParams.f1375b = 2;
            this.f1051a.setLayoutParams(generateDefaultLayoutParams);
            this.f1051a.setOnClickListener(new ViewOnClickListenerC0279dq(this));
        }
    }

    /* renamed from: a */
    private void m637a(View view, boolean z) {
        C0281ds c0281ds;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0281ds = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            c0281ds = generateLayoutParams(layoutParams);
        } else {
            c0281ds = (C0281ds) layoutParams;
        }
        c0281ds.f1375b = 1;
        if (z && this.f1052b != null) {
            view.setLayoutParams(c0281ds);
            this.f1041F.add(view);
        } else {
            addView(view, c0281ds);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f1046K != null && this.f1046K.f1373b != null) {
            savedState.f1077a = this.f1046K.f1373b.getItemId();
        }
        savedState.f1078b = m658b();
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2149a());
        C0168o m565c = this.f1055e != null ? this.f1055e.m565c() : null;
        if (savedState.f1077a != 0 && this.f1046K != null && m565c != null && (findItem = m565c.findItem(savedState.f1077a)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f1078b) {
            removeCallbacks(this.f1050O);
            post(this.f1050O);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1050O);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1038C = false;
        }
        if (!this.f1038C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1038C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1038C = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1039D = false;
        }
        if (!this.f1039D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1039D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1039D = false;
        }
        return true;
    }

    /* renamed from: a */
    private void m636a(View view, int i, int i2, int i3, int i4) {
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
    private int m634a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0290  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ab A[LOOP:0: B:40:0x02a9->B:41:0x02ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02cd A[LOOP:1: B:44:0x02cb->B:45:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02f2 A[LOOP:2: B:48:0x02f0->B:49:0x02f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0342 A[LOOP:3: B:57:0x0340->B:58:0x0342, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: a */
    private int m635a(View view, int i, int[] iArr, int i2) {
        C0281ds c0281ds = (C0281ds) view.getLayoutParams();
        int i3 = c0281ds.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int m633a = m633a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m633a, max + measuredWidth, view.getMeasuredHeight() + m633a);
        return max + measuredWidth + c0281ds.rightMargin;
    }

    /* renamed from: b */
    private int m642b(View view, int i, int[] iArr, int i2) {
        C0281ds c0281ds = (C0281ds) view.getLayoutParams();
        int i3 = c0281ds.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m633a = m633a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m633a, max, view.getMeasuredHeight() + m633a);
        return max - (measuredWidth + c0281ds.leftMargin);
    }

    /* renamed from: a */
    private int m633a(View view, int i) {
        C0281ds c0281ds = (C0281ds) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int m632a = m632a(c0281ds.f285a);
        if (m632a == 48) {
            return getPaddingTop() - i2;
        }
        if (m632a == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - c0281ds.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < c0281ds.topMargin) {
            i3 = c0281ds.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < c0281ds.bottomMargin) {
                i3 = Math.max(0, i3 - (c0281ds.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m632a(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1074x & 112;
    }

    /* renamed from: a */
    private void m638a(List<View> list, int i) {
        boolean z = C0538w.m1878h(this) == 1;
        int childCount = getChildCount();
        int m1777a = C0521f.m1777a(i, C0538w.m1878h(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0281ds c0281ds = (C0281ds) childAt.getLayoutParams();
                if (c0281ds.f1375b == 0 && m639a(childAt) && m640b(c0281ds.f285a) == m1777a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0281ds c0281ds2 = (C0281ds) childAt2.getLayoutParams();
            if (c0281ds2.f1375b == 0 && m639a(childAt2) && m640b(c0281ds2.f285a) == m1777a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int m640b(int i) {
        int m1878h = C0538w.m1878h(this);
        int m1777a = C0521f.m1777a(i, m1878h) & 7;
        return (m1777a == 1 || m1777a == 3 || m1777a == 5) ? m1777a : m1878h == 1 ? 5 : 3;
    }

    /* renamed from: a */
    private boolean m639a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private static int m641b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0525j.m1785a(marginLayoutParams) + C0525j.m1787b(marginLayoutParams);
    }

    /* renamed from: c */
    private static int m643c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public C0281ds generateLayoutParams(AttributeSet attributeSet) {
        return new C0281ds(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public C0281ds generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0281ds) {
            return new C0281ds((C0281ds) layoutParams);
        }
        if (layoutParams instanceof C0086b) {
            return new C0281ds((C0086b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0281ds((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0281ds(layoutParams);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public C0281ds generateDefaultLayoutParams() {
        return new C0281ds(-2, -2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0281ds);
    }

    public InterfaceC0217bi getWrapper() {
        if (this.f1044I == null) {
            this.f1044I = new C0284dv(this);
        }
        return this.f1044I;
    }

    /* renamed from: k */
    public final void m667k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0281ds) childAt.getLayoutParams()).f1375b != 2 && childAt != this.f1055e) {
                removeViewAt(childCount);
                this.f1041F.add(childAt);
            }
        }
    }

    /* renamed from: l */
    public final void m668l() {
        for (int size = this.f1041F.size() - 1; size >= 0; size--) {
            addView(this.f1041F.get(size));
        }
        this.f1041F.clear();
    }

    /* renamed from: d */
    private boolean m644d(View view) {
        return view.getParent() == this || this.f1041F.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.f1049N = z;
        requestLayout();
    }

    /* renamed from: a */
    public void mo654a(InterfaceC0145ae interfaceC0145ae, InterfaceC0169p interfaceC0169p) {
        this.f1047L = interfaceC0145ae;
        this.f1048M = interfaceC0169p;
        if (this.f1055e != null) {
            this.f1055e.m562a(interfaceC0145ae, interfaceC0169p);
        }
    }

    /* renamed from: q */
    private void m649q() {
        if (this.f1071u == null) {
            this.f1071u = new C0246ck();
        }
    }

    final TextView getTitleTextView() {
        return this.f1056f;
    }

    final TextView getSubtitleTextView() {
        return this.f1057g;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1045J;
    }

    Context getPopupContext() {
        return this.f1062l;
    }

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0283du();

        /* renamed from: a */
        int f1077a;

        /* renamed from: b */
        boolean f1078b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1077a = parcel.readInt();
            this.f1078b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1077a);
            parcel.writeInt(this.f1078b ? 1 : 0);
        }
    }
}
