package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.R;
import androidx.appcompat.p006a.p007a.C0057a;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.appcompat.view.menu.InterfaceC0169p;
import androidx.core.p024g.C0507ah;
import androidx.core.p024g.C0538w;

/* compiled from: ToolbarWidgetWrapper.java */
/* renamed from: androidx.appcompat.widget.dv */
/* loaded from: classes.dex */
public final class C0284dv implements InterfaceC0217bi {

    /* renamed from: a */
    Toolbar f1376a;

    /* renamed from: b */
    CharSequence f1377b;

    /* renamed from: c */
    Window.Callback f1378c;

    /* renamed from: d */
    boolean f1379d;

    /* renamed from: e */
    private int f1380e;

    /* renamed from: f */
    private View f1381f;

    /* renamed from: g */
    private View f1382g;

    /* renamed from: h */
    private Drawable f1383h;

    /* renamed from: i */
    private Drawable f1384i;

    /* renamed from: j */
    private Drawable f1385j;

    /* renamed from: k */
    private boolean f1386k;

    /* renamed from: l */
    private CharSequence f1387l;

    /* renamed from: m */
    private CharSequence f1388m;

    /* renamed from: n */
    private ActionMenuPresenter f1389n;

    /* renamed from: o */
    private int f1390o;

    /* renamed from: p */
    private int f1391p;

    /* renamed from: q */
    private Drawable f1392q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0284dv(androidx.appcompat.widget.Toolbar r3) {
        /*
            r2 = this;
            int r0 = androidx.appcompat.R.string.abc_action_bar_up_description
            int r1 = androidx.appcompat.R.drawable.abc_ic_ab_back_material
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0284dv.<init>(androidx.appcompat.widget.Toolbar):void");
    }

    private C0284dv(Toolbar toolbar, int i) {
        this.f1390o = 0;
        this.f1391p = 0;
        this.f1376a = toolbar;
        this.f1377b = toolbar.getTitle();
        this.f1387l = toolbar.getSubtitle();
        this.f1386k = this.f1377b != null;
        this.f1385j = toolbar.getNavigationIcon();
        C0276dn m944a = C0276dn.m944a(toolbar.getContext(), null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        this.f1392q = m944a.m948a(R.styleable.ActionBar_homeAsUpIndicator);
        CharSequence m954c = m944a.m954c(R.styleable.ActionBar_title);
        if (!TextUtils.isEmpty(m954c)) {
            this.f1386k = true;
            m969b(m954c);
        }
        CharSequence m954c2 = m944a.m954c(R.styleable.ActionBar_subtitle);
        if (!TextUtils.isEmpty(m954c2)) {
            this.f1387l = m954c2;
            if ((this.f1380e & 8) != 0) {
                this.f1376a.setSubtitle(m954c2);
            }
        }
        Drawable m948a = m944a.m948a(R.styleable.ActionBar_logo);
        if (m948a != null) {
            m968b(m948a);
        }
        Drawable m948a2 = m944a.m948a(R.styleable.ActionBar_icon);
        if (m948a2 != null) {
            mo820a(m948a2);
        }
        if (this.f1385j == null && this.f1392q != null) {
            this.f1385j = this.f1392q;
            m971s();
        }
        mo829c(m944a.m946a(R.styleable.ActionBar_displayOptions, 0));
        int m962g = m944a.m962g(R.styleable.ActionBar_customNavigationLayout, 0);
        if (m962g != 0) {
            View inflate = LayoutInflater.from(this.f1376a.getContext()).inflate(m962g, (ViewGroup) this.f1376a, false);
            if (this.f1382g != null && (this.f1380e & 16) != 0) {
                this.f1376a.removeView(this.f1382g);
            }
            this.f1382g = inflate;
            if (inflate != null && (this.f1380e & 16) != 0) {
                this.f1376a.addView(this.f1382g);
            }
            mo829c(this.f1380e | 16);
        }
        int m959f = m944a.m959f(R.styleable.ActionBar_height, 0);
        if (m959f > 0) {
            ViewGroup.LayoutParams layoutParams = this.f1376a.getLayoutParams();
            layoutParams.height = m959f;
            this.f1376a.setLayoutParams(layoutParams);
        }
        int m955d = m944a.m955d(R.styleable.ActionBar_contentInsetStart, -1);
        int m955d2 = m944a.m955d(R.styleable.ActionBar_contentInsetEnd, -1);
        if (m955d >= 0 || m955d2 >= 0) {
            this.f1376a.mo652a(Math.max(m955d, 0), Math.max(m955d2, 0));
        }
        int m962g2 = m944a.m962g(R.styleable.ActionBar_titleTextStyle, 0);
        if (m962g2 != 0) {
            this.f1376a.mo653a(this.f1376a.getContext(), m962g2);
        }
        int m962g3 = m944a.m962g(R.styleable.ActionBar_subtitleTextStyle, 0);
        if (m962g3 != 0) {
            this.f1376a.mo657b(this.f1376a.getContext(), m962g3);
        }
        int m962g4 = m944a.m962g(R.styleable.ActionBar_popupTheme, 0);
        if (m962g4 != 0) {
            this.f1376a.setPopupTheme(m962g4);
        }
        m944a.m952b();
        if (i != this.f1391p) {
            this.f1391p = i;
            if (TextUtils.isEmpty(this.f1376a.getNavigationContentDescription())) {
                int i2 = this.f1391p;
                this.f1388m = i2 != 0 ? this.f1376a.getContext().getString(i2) : null;
                m972t();
            }
        }
        this.f1388m = this.f1376a.getNavigationContentDescription();
        this.f1376a.setNavigationOnClickListener(new ViewOnClickListenerC0285dw(this));
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: a */
    public final ViewGroup mo817a() {
        return this.f1376a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: b */
    public final Context mo827b() {
        return this.f1376a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: c */
    public final boolean mo830c() {
        return this.f1376a.m663g();
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: d */
    public final void mo831d() {
        this.f1376a.mo664h();
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: a */
    public final void mo822a(Window.Callback callback) {
        this.f1378c = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: a */
    public final void mo825a(CharSequence charSequence) {
        if (this.f1386k) {
            return;
        }
        m969b(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: e */
    public final CharSequence mo833e() {
        return this.f1376a.getTitle();
    }

    /* renamed from: b */
    private void m969b(CharSequence charSequence) {
        this.f1377b = charSequence;
        if ((this.f1380e & 8) != 0) {
            this.f1376a.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: f */
    public final void mo834f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: g */
    public final void mo835g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: a */
    public final void mo820a(Drawable drawable) {
        this.f1383h = drawable;
        m970r();
    }

    /* renamed from: b */
    private void m968b(Drawable drawable) {
        this.f1384i = drawable;
        m970r();
    }

    /* renamed from: r */
    private void m970r() {
        Drawable drawable;
        if ((this.f1380e & 2) == 0) {
            drawable = null;
        } else if ((this.f1380e & 1) != 0) {
            drawable = this.f1384i != null ? this.f1384i : this.f1383h;
        } else {
            drawable = this.f1383h;
        }
        this.f1376a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: h */
    public final boolean mo836h() {
        return this.f1376a.m656a();
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: i */
    public final boolean mo837i() {
        return this.f1376a.m658b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: j */
    public final boolean mo838j() {
        return this.f1376a.m659c();
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: k */
    public final boolean mo839k() {
        return this.f1376a.m660d();
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: l */
    public final boolean mo840l() {
        return this.f1376a.m661e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: m */
    public final void mo841m() {
        this.f1379d = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: a */
    public final void mo821a(Menu menu, InterfaceC0145ae interfaceC0145ae) {
        if (this.f1389n == null) {
            this.f1389n = new ActionMenuPresenter(this.f1376a.getContext());
            this.f1389n.m411a(R.id.action_menu_presenter);
        }
        this.f1389n.mo385a(interfaceC0145ae);
        this.f1376a.m655a((C0168o) menu, this.f1389n);
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: n */
    public final void mo842n() {
        this.f1376a.mo662f();
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: o */
    public final int mo843o() {
        return this.f1380e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: c */
    public final void mo829c(int i) {
        int i2 = this.f1380e ^ i;
        this.f1380e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m972t();
                }
                m971s();
            }
            if ((i2 & 3) != 0) {
                m970r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1376a.setTitle(this.f1377b);
                    this.f1376a.setSubtitle(this.f1387l);
                } else {
                    this.f1376a.setTitle((CharSequence) null);
                    this.f1376a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || this.f1382g == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f1376a.addView(this.f1382g);
            } else {
                this.f1376a.removeView(this.f1382g);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: a */
    public final void mo824a(ScrollingTabContainerView scrollingTabContainerView) {
        if (this.f1381f != null && this.f1381f.getParent() == this.f1376a) {
            this.f1376a.removeView(this.f1381f);
        }
        this.f1381f = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.f1390o != 2) {
            return;
        }
        this.f1376a.addView(this.f1381f, 0);
        C0281ds c0281ds = (C0281ds) this.f1381f.getLayoutParams();
        c0281ds.width = -2;
        c0281ds.height = -2;
        c0281ds.f285a = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: a */
    public final void mo826a(boolean z) {
        this.f1376a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: p */
    public final int mo844p() {
        return this.f1390o;
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: a */
    public final C0507ah mo818a(int i, long j) {
        return C0538w.m1887p(this.f1376a).m1753a(i == 0 ? 1.0f : 0.0f).m1754a(j).m1756a(new C0286dx(this, i));
    }

    /* renamed from: s */
    private void m971s() {
        if ((this.f1380e & 4) != 0) {
            this.f1376a.setNavigationIcon(this.f1385j != null ? this.f1385j : this.f1392q);
        } else {
            this.f1376a.setNavigationIcon((Drawable) null);
        }
    }

    /* renamed from: t */
    private void m972t() {
        if ((this.f1380e & 4) != 0) {
            if (TextUtils.isEmpty(this.f1388m)) {
                this.f1376a.setNavigationContentDescription(this.f1391p);
            } else {
                this.f1376a.setNavigationContentDescription(this.f1388m);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: d */
    public final void mo832d(int i) {
        this.f1376a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: a */
    public final void mo823a(InterfaceC0145ae interfaceC0145ae, InterfaceC0169p interfaceC0169p) {
        this.f1376a.mo654a(interfaceC0145ae, interfaceC0169p);
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: q */
    public final Menu mo845q() {
        return this.f1376a.getMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: a */
    public final void mo819a(int i) {
        mo820a(i != 0 ? C0057a.m46b(this.f1376a.getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0217bi
    /* renamed from: b */
    public final void mo828b(int i) {
        m968b(i != 0 ? C0057a.m46b(this.f1376a.getContext(), i) : null);
    }
}
