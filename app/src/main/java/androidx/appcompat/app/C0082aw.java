package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.AbstractC0128b;
import androidx.appcompat.view.C0127a;
import androidx.appcompat.view.C0138l;
import androidx.appcompat.view.InterfaceC0129c;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.InterfaceC0217bi;
import androidx.appcompat.widget.InterfaceC0299h;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.p024g.C0507ah;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0511al;
import androidx.core.p024g.InterfaceC0513an;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar.java */
/* renamed from: androidx.appcompat.app.aw */
/* loaded from: classes.dex */
public class C0082aw extends AbstractC0059a implements InterfaceC0299h {

    /* renamed from: s */
    static final /* synthetic */ boolean f248s = !C0082aw.class.desiredAssertionStatus();

    /* renamed from: t */
    private static final Interpolator f249t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f250u = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f251A;

    /* renamed from: B */
    private boolean f252B;

    /* renamed from: D */
    private boolean f254D;

    /* renamed from: F */
    private boolean f256F;

    /* renamed from: H */
    private boolean f258H;

    /* renamed from: a */
    Context f259a;

    /* renamed from: b */
    ActionBarOverlayLayout f260b;

    /* renamed from: c */
    ActionBarContainer f261c;

    /* renamed from: d */
    InterfaceC0217bi f262d;

    /* renamed from: e */
    ActionBarContextView f263e;

    /* renamed from: f */
    View f264f;

    /* renamed from: g */
    ScrollingTabContainerView f265g;

    /* renamed from: h */
    C0087ba f266h;

    /* renamed from: i */
    AbstractC0128b f267i;

    /* renamed from: j */
    InterfaceC0129c f268j;

    /* renamed from: l */
    boolean f270l;

    /* renamed from: m */
    boolean f271m;

    /* renamed from: n */
    C0138l f272n;

    /* renamed from: o */
    boolean f273o;

    /* renamed from: v */
    private Context f277v;

    /* renamed from: w */
    private Activity f278w;

    /* renamed from: x */
    private Dialog f279x;

    /* renamed from: y */
    private ArrayList<Object> f280y = new ArrayList<>();

    /* renamed from: z */
    private int f281z = -1;

    /* renamed from: C */
    private ArrayList<Object> f253C = new ArrayList<>();

    /* renamed from: E */
    private int f255E = 0;

    /* renamed from: k */
    boolean f269k = true;

    /* renamed from: G */
    private boolean f257G = true;

    /* renamed from: p */
    final InterfaceC0511al f274p = new C0083ax(this);

    /* renamed from: q */
    final InterfaceC0511al f275q = new C0084ay(this);

    /* renamed from: r */
    final InterfaceC0513an f276r = new C0085az(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m196a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public C0082aw(Activity activity, boolean z) {
        this.f278w = activity;
        View decorView = activity.getWindow().getDecorView();
        m195a(decorView);
        if (z) {
            return;
        }
        this.f264f = decorView.findViewById(R.id.content);
    }

    public C0082aw(Dialog dialog) {
        this.f279x = dialog;
        m195a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m195a(View view) {
        this.f260b = (ActionBarOverlayLayout) view.findViewById(androidx.appcompat.R.id.decor_content_parent);
        if (this.f260b != null) {
            this.f260b.setActionBarVisibilityCallback(this);
        }
        this.f262d = m197b(view.findViewById(androidx.appcompat.R.id.action_bar));
        this.f263e = (ActionBarContextView) view.findViewById(androidx.appcompat.R.id.action_context_bar);
        this.f261c = (ActionBarContainer) view.findViewById(androidx.appcompat.R.id.action_bar_container);
        if (this.f262d == null || this.f263e == null || this.f261c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f259a = this.f262d.mo827b();
        if ((this.f262d.mo843o() & 4) != 0) {
            this.f251A = true;
        }
        C0127a m301a = C0127a.m301a(this.f259a);
        m301a.m307f();
        m198f(m301a.m305d());
        TypedArray obtainStyledAttributes = this.f259a.obtainStyledAttributes(null, androidx.appcompat.R.styleable.ActionBar, androidx.appcompat.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.ActionBar_hideOnContentScroll, false)) {
            mo162c();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo154a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static InterfaceC0217bi m197b(View view) {
        if (view instanceof InterfaceC0217bi) {
            return (InterfaceC0217bi) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final void mo154a(float f) {
        C0538w.m1839a(this.f261c, f);
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final void mo155a(Configuration configuration) {
        m198f(C0127a.m301a(this.f259a).m305d());
    }

    /* renamed from: f */
    private void m198f(boolean z) {
        this.f254D = z;
        if (!this.f254D) {
            this.f262d.mo824a((ScrollingTabContainerView) null);
            this.f261c.setTabContainer(this.f265g);
        } else {
            this.f261c.setTabContainer(null);
            this.f262d.mo824a(this.f265g);
        }
        boolean z2 = m202l() == 2;
        if (this.f265g != null) {
            if (z2) {
                this.f265g.setVisibility(0);
                if (this.f260b != null) {
                    C0538w.m1892u(this.f260b);
                }
            } else {
                this.f265g.setVisibility(8);
            }
        }
        this.f262d.mo826a(!this.f254D && z2);
        this.f260b.setHasNonEmbeddedTabs(!this.f254D && z2);
    }

    @Override // androidx.appcompat.widget.InterfaceC0299h
    /* renamed from: a */
    public final void mo205a(int i) {
        this.f255E = i;
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: b */
    public final void mo161b(boolean z) {
        this.f258H = z;
        if (z || this.f272n == null) {
            return;
        }
        this.f272n.m334c();
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: c */
    public final void mo163c(boolean z) {
        if (z == this.f252B) {
            return;
        }
        this.f252B = z;
        int size = this.f253C.size();
        for (int i = 0; i < size; i++) {
            this.f253C.get(i);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final void mo156a(CharSequence charSequence) {
        this.f262d.mo825a(charSequence);
    }

    /* renamed from: l */
    private int m202l() {
        return this.f262d.mo844p();
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final int mo152a() {
        return this.f262d.mo843o();
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final AbstractC0128b mo153a(InterfaceC0129c interfaceC0129c) {
        if (this.f266h != null) {
            this.f266h.mo220c();
        }
        this.f260b.setHideOnContentScrollEnabled(false);
        this.f263e.m514c();
        C0087ba c0087ba = new C0087ba(this, this.f263e.getContext(), interfaceC0129c);
        if (!c0087ba.m222e()) {
            return null;
        }
        this.f266h = c0087ba;
        c0087ba.mo221d();
        this.f263e.m511a(c0087ba);
        m207e(true);
        this.f263e.sendAccessibilityEvent(32);
        return c0087ba;
    }

    @Override // androidx.appcompat.widget.InterfaceC0299h
    /* renamed from: d */
    public final void mo206d(boolean z) {
        this.f269k = z;
    }

    /* renamed from: m */
    private void m203m() {
        if (this.f256F) {
            return;
        }
        this.f256F = true;
        if (this.f260b != null) {
            this.f260b.setShowingForActionMode(true);
        }
        m199g(false);
    }

    @Override // androidx.appcompat.widget.InterfaceC0299h
    /* renamed from: i */
    public final void mo208i() {
        if (this.f271m) {
            this.f271m = false;
            m199g(true);
        }
    }

    /* renamed from: n */
    private void m204n() {
        if (this.f256F) {
            this.f256F = false;
            if (this.f260b != null) {
                this.f260b.setShowingForActionMode(false);
            }
            m199g(false);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0299h
    /* renamed from: j */
    public final void mo209j() {
        if (this.f271m) {
            return;
        }
        this.f271m = true;
        m199g(true);
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: c */
    public final void mo162c() {
        if (!this.f260b.m526a()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f273o = true;
        this.f260b.setHideOnContentScrollEnabled(true);
    }

    /* renamed from: g */
    private void m199g(boolean z) {
        if (m196a(this.f270l, this.f271m, this.f256F)) {
            if (this.f257G) {
                return;
            }
            this.f257G = true;
            m200h(z);
            return;
        }
        if (this.f257G) {
            this.f257G = false;
            m201i(z);
        }
    }

    /* renamed from: h */
    private void m200h(boolean z) {
        if (this.f272n != null) {
            this.f272n.m334c();
        }
        this.f261c.setVisibility(0);
        if (this.f255E == 0 && (this.f258H || z)) {
            this.f261c.setTranslationY(0.0f);
            float f = -this.f261c.getHeight();
            if (z) {
                this.f261c.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.f261c.setTranslationY(f);
            C0138l c0138l = new C0138l();
            C0507ah m1759b = C0538w.m1887p(this.f261c).m1759b(0.0f);
            m1759b.m1757a(this.f276r);
            c0138l.m329a(m1759b);
            if (this.f269k && this.f264f != null) {
                this.f264f.setTranslationY(f);
                c0138l.m329a(C0538w.m1887p(this.f264f).m1759b(0.0f));
            }
            c0138l.m328a(f250u);
            c0138l.m335d();
            c0138l.m331a(this.f275q);
            this.f272n = c0138l;
            c0138l.m332a();
        } else {
            this.f261c.setAlpha(1.0f);
            this.f261c.setTranslationY(0.0f);
            if (this.f269k && this.f264f != null) {
                this.f264f.setTranslationY(0.0f);
            }
            this.f275q.mo170b(null);
        }
        if (this.f260b != null) {
            C0538w.m1892u(this.f260b);
        }
    }

    /* renamed from: i */
    private void m201i(boolean z) {
        if (this.f272n != null) {
            this.f272n.m334c();
        }
        if (this.f255E == 0 && (this.f258H || z)) {
            this.f261c.setAlpha(1.0f);
            this.f261c.setTransitioning(true);
            C0138l c0138l = new C0138l();
            float f = -this.f261c.getHeight();
            if (z) {
                this.f261c.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            C0507ah m1759b = C0538w.m1887p(this.f261c).m1759b(f);
            m1759b.m1757a(this.f276r);
            c0138l.m329a(m1759b);
            if (this.f269k && this.f264f != null) {
                c0138l.m329a(C0538w.m1887p(this.f264f).m1759b(f));
            }
            c0138l.m328a(f249t);
            c0138l.m335d();
            c0138l.m331a(this.f274p);
            this.f272n = c0138l;
            c0138l.m332a();
            return;
        }
        this.f274p.mo170b(null);
    }

    /* renamed from: e */
    public final void m207e(boolean z) {
        C0507ah mo818a;
        C0507ah mo510a;
        if (z) {
            m203m();
        } else {
            m204n();
        }
        if (!C0538w.m1819C(this.f261c)) {
            if (z) {
                this.f262d.mo832d(4);
                this.f263e.setVisibility(0);
                return;
            } else {
                this.f262d.mo832d(0);
                this.f263e.setVisibility(8);
                return;
            }
        }
        if (z) {
            C0507ah mo818a2 = this.f262d.mo818a(4, 100L);
            mo818a = this.f263e.mo510a(0, 200L);
            mo510a = mo818a2;
        } else {
            mo818a = this.f262d.mo818a(0, 200L);
            mo510a = this.f263e.mo510a(8, 100L);
        }
        C0138l c0138l = new C0138l();
        c0138l.m330a(mo510a, mo818a);
        c0138l.m332a();
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: b */
    public final Context mo160b() {
        if (this.f277v == null) {
            TypedValue typedValue = new TypedValue();
            this.f259a.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f277v = new ContextThemeWrapper(this.f259a, i);
            } else {
                this.f277v = this.f259a;
            }
        }
        return this.f277v;
    }

    @Override // androidx.appcompat.widget.InterfaceC0299h
    /* renamed from: k */
    public final void mo210k() {
        if (this.f272n != null) {
            this.f272n.m334c();
            this.f272n = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: g */
    public final boolean mo167g() {
        if (this.f262d == null || !this.f262d.mo830c()) {
            return false;
        }
        this.f262d.mo831d();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final void mo157a(boolean z) {
        if (this.f251A) {
            return;
        }
        int i = z ? 4 : 0;
        int mo843o = this.f262d.mo843o();
        this.f251A = true;
        this.f262d.mo829c((i & 4) | (mo843o & (-5)));
    }

    @Override // androidx.appcompat.app.AbstractC0059a
    /* renamed from: a */
    public final boolean mo158a(int i, KeyEvent keyEvent) {
        Menu mo217b;
        if (this.f266h == null || (mo217b = this.f266h.mo217b()) == null) {
            return false;
        }
        mo217b.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo217b.performShortcut(i, keyEvent, 0);
    }
}
