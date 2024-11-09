package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.AbstractC0128b;
import androidx.appcompat.view.C0131e;
import androidx.appcompat.view.C0132f;
import androidx.appcompat.view.C0135i;
import androidx.appcompat.view.InterfaceC0129c;
import androidx.appcompat.view.menu.C0165l;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.appcompat.view.menu.InterfaceC0146af;
import androidx.appcompat.view.menu.InterfaceC0169p;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0192ak;
import androidx.appcompat.widget.C0276dn;
import androidx.appcompat.widget.C0293ed;
import androidx.appcompat.widget.C0295ef;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0216bh;
import androidx.appcompat.widget.InterfaceC0222bn;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.app.C0403a;
import androidx.core.app.C0414l;
import androidx.core.p024g.C0507ah;
import androidx.core.p024g.C0524i;
import androidx.core.p024g.C0538w;
import androidx.core.widget.C0576n;
import androidx.lifecycle.EnumC0730j;
import androidx.lifecycle.InterfaceC0733m;
import androidx.p011b.C0318a;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class AppCompatDelegateImpl extends AbstractC0104s implements LayoutInflater.Factory2, InterfaceC0169p {

    /* renamed from: t */
    private static final Map<Class<?>, Integer> f114t = new C0318a();

    /* renamed from: u */
    private static final boolean f115u;

    /* renamed from: v */
    private static final int[] f116v;

    /* renamed from: w */
    private static boolean f117w;

    /* renamed from: x */
    private static final boolean f118x;

    /* renamed from: A */
    private InterfaceC0216bh f119A;

    /* renamed from: B */
    private C0061ab f120B;

    /* renamed from: C */
    private C0071al f121C;

    /* renamed from: D */
    private boolean f122D;

    /* renamed from: E */
    private boolean f123E;

    /* renamed from: F */
    private ViewGroup f124F;

    /* renamed from: G */
    private TextView f125G;

    /* renamed from: H */
    private View f126H;

    /* renamed from: I */
    private boolean f127I;

    /* renamed from: J */
    private boolean f128J;

    /* renamed from: K */
    private boolean f129K;

    /* renamed from: L */
    private PanelFeatureState[] f130L;

    /* renamed from: M */
    private PanelFeatureState f131M;

    /* renamed from: N */
    private boolean f132N;

    /* renamed from: O */
    private boolean f133O;

    /* renamed from: P */
    private boolean f134P;

    /* renamed from: Q */
    private boolean f135Q;

    /* renamed from: R */
    private int f136R;

    /* renamed from: S */
    private int f137S;

    /* renamed from: T */
    private boolean f138T;

    /* renamed from: U */
    private boolean f139U;

    /* renamed from: V */
    private AbstractC0066ag f140V;

    /* renamed from: W */
    private AbstractC0066ag f141W;

    /* renamed from: X */
    private final Runnable f142X;

    /* renamed from: Y */
    private boolean f143Y;

    /* renamed from: Z */
    private Rect f144Z;

    /* renamed from: a */
    final Object f145a;

    /* renamed from: aa */
    private Rect f146aa;

    /* renamed from: ab */
    private AppCompatViewInflater f147ab;

    /* renamed from: b */
    final Context f148b;

    /* renamed from: c */
    Window f149c;

    /* renamed from: d */
    final InterfaceC0103r f150d;

    /* renamed from: e */
    AbstractC0059a f151e;

    /* renamed from: f */
    MenuInflater f152f;

    /* renamed from: g */
    AbstractC0128b f153g;

    /* renamed from: h */
    ActionBarContextView f154h;

    /* renamed from: i */
    PopupWindow f155i;

    /* renamed from: j */
    Runnable f156j;

    /* renamed from: k */
    C0507ah f157k;

    /* renamed from: l */
    boolean f158l;

    /* renamed from: m */
    boolean f159m;

    /* renamed from: n */
    boolean f160n;

    /* renamed from: o */
    boolean f161o;

    /* renamed from: p */
    boolean f162p;

    /* renamed from: q */
    boolean f163q;

    /* renamed from: r */
    boolean f164r;

    /* renamed from: s */
    int f165s;

    /* renamed from: y */
    private C0064ae f166y;

    /* renamed from: z */
    private CharSequence f167z;

    static {
        boolean z = false;
        f115u = Build.VERSION.SDK_INT < 21;
        f116v = new int[]{R.attr.windowBackground};
        if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 25) {
            z = true;
        }
        f118x = z;
        if (!f115u || f117w) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C0105t(Thread.getDefaultUncaughtExceptionHandler()));
        f117w = true;
    }

    public AppCompatDelegateImpl(Activity activity, InterfaceC0103r interfaceC0103r) {
        this(activity, null, interfaceC0103r, activity);
    }

    public AppCompatDelegateImpl(Dialog dialog, InterfaceC0103r interfaceC0103r) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC0103r, dialog);
    }

    private AppCompatDelegateImpl(Context context, Window window, InterfaceC0103r interfaceC0103r, Object obj) {
        Integer num;
        AppCompatActivity appCompatActivity = null;
        this.f157k = null;
        this.f122D = true;
        this.f136R = -100;
        this.f142X = new RunnableC0106u(this);
        this.f148b = context;
        this.f150d = interfaceC0103r;
        this.f145a = obj;
        if (this.f136R == -100 && (this.f145a instanceof Dialog)) {
            Object obj2 = this.f148b;
            while (true) {
                if (obj2 != null) {
                    if (obj2 instanceof AppCompatActivity) {
                        appCompatActivity = (AppCompatActivity) obj2;
                        break;
                    } else if (!(obj2 instanceof ContextWrapper)) {
                        break;
                    } else {
                        obj2 = ((ContextWrapper) obj2).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.f136R = appCompatActivity.m68g().mo131m();
            }
        }
        if (this.f136R == -100 && (num = f114t.get(this.f145a.getClass())) != null) {
            this.f136R = num.intValue();
            f114t.remove(this.f145a.getClass());
        }
        if (window != null) {
            m77a(window);
        }
        C0192ak.m707a();
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: h */
    public final void mo124h() {
        m83a(false);
        this.f133O = true;
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: c */
    public final void mo114c() {
        this.f133O = true;
        m83a(false);
        m93x();
        if (this.f145a instanceof Activity) {
            String str = null;
            try {
                str = C0414l.m1471b((Activity) this.f145a);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0059a abstractC0059a = this.f151e;
                if (abstractC0059a == null) {
                    this.f143Y = true;
                } else {
                    abstractC0059a.mo157a(true);
                }
            }
        }
        this.f134P = true;
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: d */
    public final void mo116d() {
        m94y();
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: a */
    public final AbstractC0059a mo97a() {
        m90u();
        return this.f151e;
    }

    /* renamed from: u */
    private void m90u() {
        m94y();
        if (this.f158l && this.f151e == null) {
            if (this.f145a instanceof Activity) {
                this.f151e = new C0082aw((Activity) this.f145a, this.f159m);
            } else if (this.f145a instanceof Dialog) {
                this.f151e = new C0082aw((Dialog) this.f145a);
            }
            if (this.f151e != null) {
                this.f151e.mo157a(this.f143Y);
            }
        }
    }

    /* renamed from: v */
    private Context m91v() {
        AbstractC0059a mo97a = mo97a();
        Context mo160b = mo97a != null ? mo97a.mo160b() : null;
        return mo160b == null ? this.f148b : mo160b;
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: b */
    public final MenuInflater mo110b() {
        if (this.f152f == null) {
            m90u();
            this.f152f = new C0135i(this.f151e != null ? this.f151e.mo160b() : this.f148b);
        }
        return this.f152f;
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: b */
    public final <T extends View> T mo111b(int i) {
        m94y();
        return (T) this.f149c.findViewById(i);
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: a */
    public final void mo101a(Configuration configuration) {
        AbstractC0059a mo97a;
        if (this.f158l && this.f123E && (mo97a = mo97a()) != null) {
            mo97a.mo155a(configuration);
        }
        C0192ak.m709b().m712a(this.f148b);
        m83a(false);
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: e */
    public final void mo118e() {
        this.f135Q = true;
        m83a(true);
        m246a(this);
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: f */
    public final void mo120f() {
        this.f135Q = false;
        m247b(this);
        AbstractC0059a mo97a = mo97a();
        if (mo97a != null) {
            mo97a.mo161b(false);
        }
        if (this.f145a instanceof Dialog) {
            m92w();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: g */
    public final void mo123g() {
        AbstractC0059a mo97a = mo97a();
        if (mo97a != null) {
            mo97a.mo161b(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: a */
    public final void mo102a(View view) {
        m94y();
        ViewGroup viewGroup = (ViewGroup) this.f124F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f166y.m506a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: c */
    public final void mo115c(int i) {
        m94y();
        ViewGroup viewGroup = (ViewGroup) this.f124F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f148b).inflate(i, viewGroup);
        this.f166y.m506a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: a */
    public final void mo103a(View view, ViewGroup.LayoutParams layoutParams) {
        m94y();
        ViewGroup viewGroup = (ViewGroup) this.f124F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f166y.m506a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: b */
    public final void mo112b(View view, ViewGroup.LayoutParams layoutParams) {
        m94y();
        ((ViewGroup) this.f124F.findViewById(R.id.content)).addView(view, layoutParams);
        this.f166y.m506a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: l */
    public final void mo130l() {
        if (this.f136R != -100) {
            f114t.put(this.f145a.getClass(), Integer.valueOf(this.f136R));
        }
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: j */
    public final void mo128j() {
        m247b(this);
        if (this.f164r) {
            this.f149c.getDecorView().removeCallbacks(this.f142X);
        }
        this.f135Q = false;
        this.f163q = true;
        if (this.f151e != null) {
            this.f151e.mo168h();
        }
        m92w();
    }

    /* renamed from: w */
    private void m92w() {
        if (this.f140V != null) {
            this.f140V.m182e();
        }
        if (this.f141W != null) {
            this.f141W.m182e();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: a */
    public final void mo99a(int i) {
        this.f137S = i;
    }

    /* renamed from: x */
    private void m93x() {
        if (this.f149c == null && (this.f145a instanceof Activity)) {
            m77a(((Activity) this.f145a).getWindow());
        }
        if (this.f149c == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: a */
    private void m77a(Window window) {
        if (this.f149c != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C0064ae) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f166y = new C0064ae(this, callback);
        window.setCallback(this.f166y);
        C0276dn m943a = C0276dn.m943a(this.f148b, (AttributeSet) null, f116v);
        Drawable m951b = m943a.m951b(0);
        if (m951b != null) {
            window.setBackgroundDrawable(m951b);
        }
        m943a.m952b();
        this.f149c = window;
    }

    /* renamed from: y */
    private void m94y() {
        if (this.f123E) {
            return;
        }
        this.f124F = m95z();
        CharSequence m70B = m70B();
        if (!TextUtils.isEmpty(m70B)) {
            if (this.f119A != null) {
                this.f119A.setWindowTitle(m70B);
            } else if (this.f151e != null) {
                this.f151e.mo156a(m70B);
            } else if (this.f125G != null) {
                this.f125G.setText(m70B);
            }
        }
        m69A();
        this.f123E = true;
        PanelFeatureState m122g = m122g(0);
        if (this.f163q) {
            return;
        }
        if (m122g == null || m122g.f177j == null) {
            m87j(108);
        }
    }

    /* renamed from: z */
    private ViewGroup m95z() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f148b.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            mo117d(1);
        } else if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar, false)) {
            mo117d(108);
        }
        if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            mo117d(109);
        }
        if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            mo117d(10);
        }
        this.f161o = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        m93x();
        this.f149c.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f148b);
        if (!this.f162p) {
            if (this.f161o) {
                viewGroup = (ViewGroup) from.inflate(androidx.appcompat.R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.f159m = false;
                this.f158l = false;
            } else if (this.f158l) {
                TypedValue typedValue = new TypedValue();
                this.f148b.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C0131e(this.f148b, typedValue.resourceId);
                } else {
                    context = this.f148b;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(androidx.appcompat.R.layout.abc_screen_toolbar, (ViewGroup) null);
                this.f119A = (InterfaceC0216bh) viewGroup.findViewById(androidx.appcompat.R.id.decor_content_parent);
                this.f119A.setWindowCallback(this.f149c.getCallback());
                if (this.f159m) {
                    this.f119A.mo520a(109);
                }
                if (this.f127I) {
                    this.f119A.mo520a(2);
                }
                if (this.f128J) {
                    this.f119A.mo520a(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            if (this.f160n) {
                viewGroup = (ViewGroup) from.inflate(androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
            } else {
                viewGroup = (ViewGroup) from.inflate(androidx.appcompat.R.layout.abc_screen_simple, (ViewGroup) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                C0538w.m1850a(viewGroup, new C0107v(this));
            } else {
                ((InterfaceC0222bn) viewGroup).setOnFitSystemWindowsListener(new C0108w(this));
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f158l + ", windowActionBarOverlay: " + this.f159m + ", android:windowIsFloating: " + this.f161o + ", windowActionModeOverlay: " + this.f160n + ", windowNoTitle: " + this.f162p + " }");
        }
        if (this.f119A == null) {
            this.f125G = (TextView) viewGroup.findViewById(androidx.appcompat.R.id.title);
        }
        C0295ef.m988b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(androidx.appcompat.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f149c.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f149c.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0109x(this));
        return viewGroup;
    }

    /* renamed from: A */
    private void m69A() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f124F.findViewById(R.id.content);
        View decorView = this.f149c.getDecorView();
        contentFrameLayout.m581a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f148b.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: d */
    public final boolean mo117d(int i) {
        int m88k = m88k(i);
        if (this.f162p && m88k == 108) {
            return false;
        }
        if (this.f158l && m88k == 1) {
            this.f158l = false;
        }
        switch (m88k) {
            case 1:
                m71C();
                this.f162p = true;
                return true;
            case 2:
                m71C();
                this.f127I = true;
                return true;
            case 5:
                m71C();
                this.f128J = true;
                return true;
            case 10:
                m71C();
                this.f160n = true;
                return true;
            case 108:
                m71C();
                this.f158l = true;
                return true;
            case 109:
                m71C();
                this.f159m = true;
                return true;
            default:
                return this.f149c.requestFeature(m88k);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: a */
    public final void mo106a(CharSequence charSequence) {
        this.f167z = charSequence;
        if (this.f119A != null) {
            this.f119A.setWindowTitle(charSequence);
        } else if (this.f151e != null) {
            this.f151e.mo156a(charSequence);
        } else if (this.f125G != null) {
            this.f125G.setText(charSequence);
        }
    }

    /* renamed from: B */
    private CharSequence m70B() {
        if (this.f145a instanceof Activity) {
            return ((Activity) this.f145a).getTitle();
        }
        return this.f167z;
    }

    /* renamed from: e */
    public final void m119e(int i) {
        if (i == 108) {
            AbstractC0059a mo97a = mo97a();
            if (mo97a != null) {
                mo97a.mo163c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            PanelFeatureState m122g = m122g(i);
            if (m122g.f182o) {
                m104a(m122g, false);
            }
        }
    }

    /* renamed from: f */
    public final void m121f(int i) {
        AbstractC0059a mo97a;
        if (i != 108 || (mo97a = mo97a()) == null) {
            return;
        }
        mo97a.mo163c(true);
    }

    /* renamed from: a */
    public final AbstractC0128b m98a(InterfaceC0129c interfaceC0129c) {
        Context context;
        if (this.f153g != null) {
            this.f153g.mo220c();
        }
        C0062ac c0062ac = new C0062ac(this, interfaceC0129c);
        AbstractC0059a mo97a = mo97a();
        if (mo97a != null) {
            this.f153g = mo97a.mo153a(c0062ac);
        }
        if (this.f153g == null) {
            m134q();
            if (this.f153g != null) {
                this.f153g.mo220c();
            }
            if (this.f154h == null) {
                if (this.f161o) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f148b.getTheme();
                    theme.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = this.f148b.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new C0131e(this.f148b, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = this.f148b;
                    }
                    this.f154h = new ActionBarContextView(context);
                    this.f155i = new PopupWindow(context, (AttributeSet) null, androidx.appcompat.R.attr.actionModePopupWindowStyle);
                    C0576n.m2041a(this.f155i, 2);
                    this.f155i.setContentView(this.f154h);
                    this.f155i.setWidth(-1);
                    context.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarSize, typedValue, true);
                    this.f154h.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    this.f155i.setHeight(-2);
                    this.f156j = new RunnableC0110y(this);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f124F.findViewById(androidx.appcompat.R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m91v()));
                        this.f154h = (ActionBarContextView) viewStubCompat.m669a();
                    }
                }
            }
            if (this.f154h != null) {
                m134q();
                this.f154h.m514c();
                C0132f c0132f = new C0132f(this.f154h.getContext(), this.f154h, c0062ac, this.f155i == null);
                if (c0062ac.mo174a(c0132f, c0132f.mo217b())) {
                    c0132f.mo221d();
                    this.f154h.m511a(c0132f);
                    this.f153g = c0132f;
                    if (m132o()) {
                        this.f154h.setAlpha(0.0f);
                        this.f157k = C0538w.m1887p(this.f154h).m1753a(1.0f);
                        this.f157k.m1756a(new C0060aa(this));
                    } else {
                        this.f154h.setAlpha(1.0f);
                        this.f154h.setVisibility(0);
                        this.f154h.sendAccessibilityEvent(32);
                        if (this.f154h.getParent() instanceof View) {
                            C0538w.m1892u((View) this.f154h.getParent());
                        }
                    }
                    if (this.f155i != null) {
                        this.f149c.getDecorView().post(this.f156j);
                    }
                } else {
                    this.f153g = null;
                }
            }
            this.f153g = this.f153g;
        }
        return this.f153g;
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: i */
    public final void mo127i() {
        AbstractC0059a mo97a = mo97a();
        if (mo97a == null || !mo97a.mo166f()) {
            m87j(0);
        }
    }

    /* renamed from: o */
    public final boolean m132o() {
        return this.f123E && this.f124F != null && C0538w.m1819C(this.f124F);
    }

    /* renamed from: p */
    public final boolean m133p() {
        return this.f122D;
    }

    /* renamed from: q */
    public final void m134q() {
        if (this.f157k != null) {
            this.f157k.m1761c();
        }
    }

    /* renamed from: a */
    public final boolean m107a(int i, KeyEvent keyEvent) {
        AbstractC0059a mo97a = mo97a();
        if (mo97a != null && mo97a.mo158a(i, keyEvent)) {
            return true;
        }
        if (this.f131M != null && m82a(this.f131M, keyEvent.getKeyCode(), keyEvent)) {
            if (this.f131M != null) {
                this.f131M.f181n = true;
            }
            return true;
        }
        if (this.f131M == null) {
            PanelFeatureState m122g = m122g(0);
            m85b(m122g, keyEvent);
            boolean m82a = m82a(m122g, keyEvent.getKeyCode(), keyEvent);
            m122g.f180m = false;
            if (m82a) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011c A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m108a(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m108a(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private View m76a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z = false;
        if (this.f147ab == null) {
            String string = this.f148b.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme).getString(androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f147ab = new AppCompatViewInflater();
            } else {
                try {
                    this.f147ab = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f147ab = new AppCompatViewInflater();
                }
            }
        }
        if (f115u) {
            if (attributeSet instanceof XmlPullParser) {
                if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z = true;
                }
            } else {
                z = m80a((ViewParent) view);
            }
        }
        return this.f147ab.m146a(view, str, context, attributeSet, z, f115u, C0293ed.m984a());
    }

    /* renamed from: a */
    private boolean m80a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f149c.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0538w.m1822F((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: k */
    public final void mo129k() {
        LayoutInflater from = LayoutInflater.from(this.f148b);
        if (from.getFactory() == null) {
            C0524i.m1783a(from, this);
        } else {
            if (from.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m76a(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: a */
    private void m78a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f182o || this.f163q) {
            return;
        }
        if (panelFeatureState.f168a == 0) {
            if ((this.f148b.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callback = this.f149c.getCallback();
        if (callback != null && !callback.onMenuOpened(panelFeatureState.f168a, panelFeatureState.f177j)) {
            m104a(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f148b.getSystemService("window");
        if (windowManager != null && m85b(panelFeatureState, keyEvent)) {
            if (panelFeatureState.f174g == null || panelFeatureState.f184q) {
                if (panelFeatureState.f174g == null) {
                    m81a(panelFeatureState);
                    if (panelFeatureState.f174g == null) {
                        return;
                    }
                } else if (panelFeatureState.f184q && panelFeatureState.f174g.getChildCount() > 0) {
                    panelFeatureState.f174g.removeAllViews();
                }
                if (!m86c(panelFeatureState) || !panelFeatureState.m141a()) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f175h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                panelFeatureState.f174g.setBackgroundResource(panelFeatureState.f169b);
                ViewParent parent = panelFeatureState.f175h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(panelFeatureState.f175h);
                }
                panelFeatureState.f174g.addView(panelFeatureState.f175h, layoutParams2);
                if (!panelFeatureState.f175h.hasFocus()) {
                    panelFeatureState.f175h.requestFocus();
                }
            } else if (panelFeatureState.f176i != null && (layoutParams = panelFeatureState.f176i.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
                panelFeatureState.f181n = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f171d, panelFeatureState.f172e, 1002, 8519680, -3);
                layoutParams3.gravity = panelFeatureState.f170c;
                layoutParams3.windowAnimations = panelFeatureState.f173f;
                windowManager.addView(panelFeatureState.f174g, layoutParams3);
                panelFeatureState.f182o = true;
            }
            i = -2;
            panelFeatureState.f181n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f171d, panelFeatureState.f172e, 1002, 8519680, -3);
            layoutParams32.gravity = panelFeatureState.f170c;
            layoutParams32.windowAnimations = panelFeatureState.f173f;
            windowManager.addView(panelFeatureState.f174g, layoutParams32);
            panelFeatureState.f182o = true;
        }
    }

    /* renamed from: a */
    private boolean m81a(PanelFeatureState panelFeatureState) {
        panelFeatureState.m139a(m91v());
        panelFeatureState.f174g = new C0069aj(this, panelFeatureState.f179l);
        panelFeatureState.f170c = 81;
        return true;
    }

    /* renamed from: b */
    private boolean m84b(PanelFeatureState panelFeatureState) {
        Context context = this.f148b;
        if ((panelFeatureState.f168a == 0 || panelFeatureState.f168a == 108) && this.f119A != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0131e c0131e = new C0131e(context, 0);
                c0131e.getTheme().setTo(theme2);
                context = c0131e;
            }
        }
        C0168o c0168o = new C0168o(context);
        c0168o.mo395a(this);
        panelFeatureState.m140a(c0168o);
        return true;
    }

    /* renamed from: c */
    private boolean m86c(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.f176i != null) {
            panelFeatureState.f175h = panelFeatureState.f176i;
            return true;
        }
        if (panelFeatureState.f177j == null) {
            return false;
        }
        if (this.f121C == null) {
            this.f121C = new C0071al(this);
        }
        panelFeatureState.f175h = (View) panelFeatureState.m138a(this.f121C);
        return panelFeatureState.f175h != null;
    }

    /* renamed from: b */
    private boolean m85b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (this.f163q) {
            return false;
        }
        if (panelFeatureState.f180m) {
            return true;
        }
        if (this.f131M != null && this.f131M != panelFeatureState) {
            m104a(this.f131M, false);
        }
        Window.Callback callback = this.f149c.getCallback();
        if (callback != null) {
            panelFeatureState.f176i = callback.onCreatePanelView(panelFeatureState.f168a);
        }
        boolean z = panelFeatureState.f168a == 0 || panelFeatureState.f168a == 108;
        if (z && this.f119A != null) {
            this.f119A.mo535h();
        }
        if (panelFeatureState.f176i == null && (!z || !(this.f151e instanceof C0076aq))) {
            if (panelFeatureState.f177j == null || panelFeatureState.f185r) {
                if (panelFeatureState.f177j == null) {
                    m84b(panelFeatureState);
                    if (panelFeatureState.f177j == null) {
                        return false;
                    }
                }
                if (z && this.f119A != null) {
                    if (this.f120B == null) {
                        this.f120B = new C0061ab(this);
                    }
                    this.f119A.mo521a(panelFeatureState.f177j, this.f120B);
                }
                panelFeatureState.f177j.m464h();
                if (!callback.onCreatePanelMenu(panelFeatureState.f168a, panelFeatureState.f177j)) {
                    panelFeatureState.m140a((C0168o) null);
                    if (z && this.f119A != null) {
                        this.f119A.mo521a(null, this.f120B);
                    }
                    return false;
                }
                panelFeatureState.f185r = false;
            }
            panelFeatureState.f177j.m464h();
            if (panelFeatureState.f186s != null) {
                panelFeatureState.f177j.m461d(panelFeatureState.f186s);
                panelFeatureState.f186s = null;
            }
            if (!callback.onPreparePanel(0, panelFeatureState.f176i, panelFeatureState.f177j)) {
                if (z && this.f119A != null) {
                    this.f119A.mo521a(null, this.f120B);
                }
                panelFeatureState.f177j.m465i();
                return false;
            }
            panelFeatureState.f183p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f177j.setQwertyMode(panelFeatureState.f183p);
            panelFeatureState.f177j.m465i();
        }
        panelFeatureState.f180m = true;
        panelFeatureState.f181n = false;
        this.f131M = panelFeatureState;
        return true;
    }

    /* renamed from: b */
    public final void m113b(C0168o c0168o) {
        if (this.f129K) {
            return;
        }
        this.f129K = true;
        this.f119A.mo536i();
        Window.Callback callback = this.f149c.getCallback();
        if (callback != null && !this.f163q) {
            callback.onPanelClosed(108, c0168o);
        }
        this.f129K = false;
    }

    /* renamed from: r */
    public final void m135r() {
        m104a(m122g(0), true);
    }

    /* renamed from: a */
    public final void m104a(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.f168a == 0 && this.f119A != null && this.f119A.mo531d()) {
            m113b(panelFeatureState.f177j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f148b.getSystemService("window");
        if (windowManager != null && panelFeatureState.f182o && panelFeatureState.f174g != null) {
            windowManager.removeView(panelFeatureState.f174g);
            if (z) {
                m100a(panelFeatureState.f168a, panelFeatureState, (Menu) null);
            }
        }
        panelFeatureState.f180m = false;
        panelFeatureState.f181n = false;
        panelFeatureState.f182o = false;
        panelFeatureState.f175h = null;
        panelFeatureState.f184q = true;
        if (this.f131M == panelFeatureState) {
            this.f131M = null;
        }
    }

    /* renamed from: a */
    public final void m100a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.f130L.length) {
                panelFeatureState = this.f130L[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f177j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f182o) && !this.f163q) {
            this.f166y.m506a().onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    public final PanelFeatureState m96a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f130L;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f177j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final PanelFeatureState m122g(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.f130L;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f130L = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: a */
    private boolean m82a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f180m || m85b(panelFeatureState, keyEvent)) && panelFeatureState.f177j != null) {
            return panelFeatureState.f177j.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: j */
    private void m87j(int i) {
        this.f165s = (1 << i) | this.f165s;
        if (this.f164r) {
            return;
        }
        C0538w.m1852a(this.f149c.getDecorView(), this.f142X);
        this.f164r = true;
    }

    /* renamed from: h */
    public final void m125h(int i) {
        PanelFeatureState m122g;
        PanelFeatureState m122g2 = m122g(i);
        if (m122g2.f177j != null) {
            Bundle bundle = new Bundle();
            m122g2.f177j.m459c(bundle);
            if (bundle.size() > 0) {
                m122g2.f186s = bundle;
            }
            m122g2.f177j.m464h();
            m122g2.f177j.clear();
        }
        m122g2.f185r = true;
        m122g2.f184q = true;
        if ((i != 108 && i != 0) || this.f119A == null || (m122g = m122g(0)) == null) {
            return;
        }
        m122g.f180m = false;
        m85b(m122g, (KeyEvent) null);
    }

    /* renamed from: i */
    public final int m126i(int i) {
        boolean z;
        boolean z2;
        if (this.f154h == null || !(this.f154h.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f154h.getLayoutParams();
            if (this.f154h.isShown()) {
                if (this.f144Z == null) {
                    this.f144Z = new Rect();
                    this.f146aa = new Rect();
                }
                Rect rect = this.f144Z;
                Rect rect2 = this.f146aa;
                rect.set(0, i, 0, 0);
                C0295ef.m986a(this.f124F, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f126H == null) {
                        this.f126H = new View(this.f148b);
                        this.f126H.setBackgroundColor(this.f148b.getResources().getColor(androidx.appcompat.R.color.abc_input_method_navigation_guard));
                        this.f124F.addView(this.f126H, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.f126H.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f126H.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = this.f126H != null;
                if (!this.f160n && z) {
                    i = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = true;
                z = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z2) {
                this.f154h.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.f126H != null) {
            this.f126H.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    /* renamed from: C */
    private void m71C() {
        if (this.f123E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: k */
    private static int m88k(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i != 9) {
            return i;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    /* renamed from: s */
    public final void m136s() {
        if (this.f119A != null) {
            this.f119A.mo536i();
        }
        if (this.f155i != null) {
            this.f149c.getDecorView().removeCallbacks(this.f156j);
            if (this.f155i.isShowing()) {
                try {
                    this.f155i.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f155i = null;
        }
        m134q();
        PanelFeatureState m122g = m122g(0);
        if (m122g == null || m122g.f177j == null) {
            return;
        }
        m122g.f177j.close();
    }

    /* renamed from: t */
    public final boolean m137t() {
        return m83a(true);
    }

    /* renamed from: a */
    private boolean m83a(boolean z) {
        if (this.f163q) {
            return false;
        }
        int m72D = m72D();
        boolean m79a = m79a(m89l(m72D), z);
        if (m72D == 0) {
            m73E().m181d();
        } else if (this.f140V != null) {
            this.f140V.m182e();
        }
        if (m72D == 3) {
            m74F().m181d();
        } else if (this.f141W != null) {
            this.f141W.m182e();
        }
        return m79a;
    }

    @Override // androidx.appcompat.app.AbstractC0104s
    /* renamed from: m */
    public final int mo131m() {
        return this.f136R;
    }

    /* renamed from: l */
    private int m89l(int i) {
        if (i == -100) {
            return -1;
        }
        switch (i) {
            case -1:
            case 1:
            case 2:
                return i;
            case 0:
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) this.f148b.getSystemService(UiModeManager.class)).getNightMode() != 0) {
                    return m73E().mo178a();
                }
                return -1;
            case 3:
                return m74F().mo178a();
            default:
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        }
    }

    /* renamed from: D */
    private int m72D() {
        return this.f136R != -100 ? this.f136R : m249n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private boolean m79a(int i, boolean z) {
        int i2;
        int i3 = this.f148b.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        switch (i) {
            case 1:
                i2 = 16;
                break;
            case 2:
                i2 = 32;
                break;
            default:
                i2 = i3;
                break;
        }
        boolean m75G = m75G();
        boolean z2 = false;
        if ((f118x || i2 != i3) && !m75G && Build.VERSION.SDK_INT >= 17 && !this.f133O && (this.f145a instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i2;
            try {
                ((ContextThemeWrapper) this.f145a).applyOverrideConfiguration(configuration);
                z2 = true;
            } catch (IllegalStateException e) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e);
            }
        }
        int i4 = this.f148b.getResources().getConfiguration().uiMode & 48;
        if (!z2 && i4 != i2 && z && !m75G && this.f133O && ((Build.VERSION.SDK_INT >= 17 || this.f134P) && (this.f145a instanceof Activity))) {
            C0403a.m1453b((Activity) this.f145a);
            z2 = true;
        }
        if (z2 || i4 == i2) {
            return z2;
        }
        Resources resources = this.f148b.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            C0075ap.m188a(resources);
        }
        if (this.f137S != 0) {
            this.f148b.setTheme(this.f137S);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f148b.getTheme().applyStyle(this.f137S, true);
            }
        }
        if (m75G && (this.f145a instanceof Activity)) {
            Activity activity = (Activity) this.f145a;
            if (activity instanceof InterfaceC0733m) {
                if (((InterfaceC0733m) activity).mo31a().mo2608a().m2611a(EnumC0730j.STARTED)) {
                    activity.onConfigurationChanged(configuration2);
                }
            } else if (this.f135Q) {
                activity.onConfigurationChanged(configuration2);
            }
        }
        return true;
    }

    /* renamed from: E */
    private AbstractC0066ag m73E() {
        if (this.f140V == null) {
            this.f140V = new C0068ai(this, C0080au.m193a(this.f148b));
        }
        return this.f140V;
    }

    /* renamed from: F */
    private AbstractC0066ag m74F() {
        if (this.f141W == null) {
            this.f141W = new C0065af(this, this.f148b);
        }
        return this.f141W;
    }

    /* renamed from: G */
    private boolean m75G() {
        if (!this.f139U && (this.f145a instanceof Activity)) {
            PackageManager packageManager = this.f148b.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f148b, this.f145a.getClass()), 0);
                this.f138T = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f138T = false;
            }
        }
        this.f139U = true;
        return this.f138T;
    }

    /* loaded from: classes.dex */
    public final class PanelFeatureState {

        /* renamed from: a */
        int f168a;

        /* renamed from: b */
        int f169b;

        /* renamed from: c */
        int f170c;

        /* renamed from: d */
        int f171d;

        /* renamed from: e */
        int f172e;

        /* renamed from: f */
        int f173f;

        /* renamed from: g */
        ViewGroup f174g;

        /* renamed from: h */
        View f175h;

        /* renamed from: i */
        View f176i;

        /* renamed from: j */
        C0168o f177j;

        /* renamed from: k */
        C0165l f178k;

        /* renamed from: l */
        Context f179l;

        /* renamed from: m */
        boolean f180m;

        /* renamed from: n */
        boolean f181n;

        /* renamed from: o */
        boolean f182o;

        /* renamed from: p */
        public boolean f183p;

        /* renamed from: q */
        boolean f184q = false;

        /* renamed from: r */
        boolean f185r;

        /* renamed from: s */
        Bundle f186s;

        PanelFeatureState(int i) {
            this.f168a = i;
        }

        /* renamed from: a */
        public final boolean m141a() {
            if (this.f175h == null) {
                return false;
            }
            return this.f176i != null || this.f178k.m428a().getCount() > 0;
        }

        /* renamed from: a */
        final void m139a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(androidx.appcompat.R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(androidx.appcompat.R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(androidx.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
            }
            C0131e c0131e = new C0131e(context, 0);
            c0131e.getTheme().setTo(newTheme);
            this.f179l = c0131e;
            TypedArray obtainStyledAttributes = c0131e.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
            this.f169b = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
            this.f173f = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        final void m140a(C0168o c0168o) {
            if (c0168o == this.f177j) {
                return;
            }
            if (this.f177j != null) {
                this.f177j.m457b(this.f178k);
            }
            this.f177j = c0168o;
            if (c0168o == null || this.f178k == null) {
                return;
            }
            c0168o.m450a(this.f178k);
        }

        /* renamed from: a */
        final InterfaceC0146af m138a(InterfaceC0145ae interfaceC0145ae) {
            if (this.f177j == null) {
                return null;
            }
            if (this.f178k == null) {
                this.f178k = new C0165l(this.f179l, androidx.appcompat.R.layout.abc_list_menu_item_layout);
                this.f178k.mo385a(interfaceC0145ae);
                this.f177j.m450a(this.f178k);
            }
            return this.f178k.m429a(this.f174g);
        }

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0070ak();

            /* renamed from: a */
            int f187a;

            /* renamed from: b */
            boolean f188b;

            /* renamed from: c */
            Bundle f189c;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            SavedState() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f187a);
                parcel.writeInt(this.f188b ? 1 : 0);
                if (this.f188b) {
                    parcel.writeBundle(this.f189c);
                }
            }

            /* renamed from: a */
            public static SavedState m142a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f187a = parcel.readInt();
                savedState.f188b = parcel.readInt() == 1;
                if (savedState.f188b) {
                    savedState.f189c = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final boolean mo109a(C0168o c0168o, MenuItem menuItem) {
        PanelFeatureState m96a;
        Window.Callback callback = this.f149c.getCallback();
        if (callback == null || this.f163q || (m96a = m96a((Menu) c0168o.mo403p())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(m96a.f168a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final void mo105a(C0168o c0168o) {
        if (this.f119A == null || !this.f119A.mo530c() || (ViewConfiguration.get(this.f148b).hasPermanentMenuKey() && !this.f119A.mo532e())) {
            PanelFeatureState m122g = m122g(0);
            m122g.f184q = true;
            m104a(m122g, false);
            m78a(m122g, (KeyEvent) null);
            return;
        }
        Window.Callback callback = this.f149c.getCallback();
        if (!this.f119A.mo531d()) {
            if (callback == null || this.f163q) {
                return;
            }
            if (this.f164r && (1 & this.f165s) != 0) {
                this.f149c.getDecorView().removeCallbacks(this.f142X);
                this.f142X.run();
            }
            PanelFeatureState m122g2 = m122g(0);
            if (m122g2.f177j == null || m122g2.f185r || !callback.onPreparePanel(0, m122g2.f176i, m122g2.f177j)) {
                return;
            }
            callback.onMenuOpened(108, m122g2.f177j);
            this.f119A.mo533f();
            return;
        }
        this.f119A.mo534g();
        if (this.f163q) {
            return;
        }
        callback.onPanelClosed(108, m122g(0).f177j);
    }
}
