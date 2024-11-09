package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StandardMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.aj */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0150aj extends AbstractC0141aa implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, InterfaceC0144ad {

    /* renamed from: e */
    private static final int f581e = R.layout.abc_popup_menu_item_layout;

    /* renamed from: a */
    final MenuPopupWindow f582a;

    /* renamed from: c */
    View f584c;

    /* renamed from: d */
    ViewTreeObserver f585d;

    /* renamed from: f */
    private final Context f586f;

    /* renamed from: g */
    private final C0168o f587g;

    /* renamed from: h */
    private final C0167n f588h;

    /* renamed from: i */
    private final boolean f589i;

    /* renamed from: j */
    private final int f590j;

    /* renamed from: k */
    private final int f591k;

    /* renamed from: l */
    private final int f592l;

    /* renamed from: n */
    private PopupWindow.OnDismissListener f594n;

    /* renamed from: o */
    private View f595o;

    /* renamed from: p */
    private InterfaceC0145ae f596p;

    /* renamed from: q */
    private boolean f597q;

    /* renamed from: r */
    private boolean f598r;

    /* renamed from: s */
    private int f599s;

    /* renamed from: u */
    private boolean f601u;

    /* renamed from: b */
    final ViewTreeObserver.OnGlobalLayoutListener f583b = new ViewTreeObserverOnGlobalLayoutListenerC0151ak(this);

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f593m = new ViewOnAttachStateChangeListenerC0152al(this);

    /* renamed from: t */
    private int f600t = 0;

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo384a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: a */
    public final void mo361a(C0168o c0168o) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: b */
    public final boolean mo389b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: f */
    public final Parcelable mo390f() {
        return null;
    }

    public ViewOnKeyListenerC0150aj(Context context, C0168o c0168o, View view, int i, int i2, boolean z) {
        this.f586f = context;
        this.f587g = c0168o;
        this.f589i = z;
        this.f588h = new C0167n(c0168o, LayoutInflater.from(context), this.f589i, f581e);
        this.f591k = i;
        this.f592l = i2;
        Resources resources = context.getResources();
        this.f590j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f595o = view;
        this.f582a = new MenuPopupWindow(this.f586f, this.f591k, this.f592l);
        c0168o.m451a(this, context);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: b */
    public final void mo363b(boolean z) {
        this.f588h.m435a(z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: a */
    public final void mo356a(int i) {
        this.f600t = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: d */
    public final void mo392d() {
        if (mo393e()) {
            this.f582a.mo392d();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: e */
    public final boolean mo393e() {
        return !this.f597q && this.f582a.mo393e();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f597q = true;
        this.f587g.close();
        if (this.f585d != null) {
            if (!this.f585d.isAlive()) {
                this.f585d = this.f584c.getViewTreeObserver();
            }
            this.f585d.removeGlobalOnLayoutListener(this.f583b);
            this.f585d = null;
        }
        this.f584c.removeOnAttachStateChangeListener(this.f593m);
        if (this.f594n != null) {
            this.f594n.onDismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo387a(boolean z) {
        this.f598r = false;
        if (this.f588h != null) {
            this.f588h.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo385a(InterfaceC0145ae interfaceC0145ae) {
        this.f596p = interfaceC0145ae;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final boolean mo388a(SubMenuC0153am subMenuC0153am) {
        if (subMenuC0153am.hasVisibleItems()) {
            C0142ab c0142ab = new C0142ab(this.f586f, subMenuC0153am, this.f584c, this.f589i, this.f591k, this.f592l);
            c0142ab.m375a(this.f596p);
            c0142ab.m376a(AbstractC0141aa.m355b(subMenuC0153am));
            c0142ab.m374a(this.f594n);
            this.f594n = null;
            this.f587g.m452a(false);
            int f = this.f582a.m866f();
            int c = this.f582a.m863c();
            if ((Gravity.getAbsoluteGravity(this.f600t, C0538w.m1878h(this.f595o)) & 7) == 5) {
                f += this.f595o.getWidth();
            }
            if (c0142ab.m377a(f, c)) {
                if (this.f596p == null) {
                    return true;
                }
                this.f596p.mo172a(subMenuC0153am);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo386a(C0168o c0168o, boolean z) {
        if (c0168o != this.f587g) {
            return;
        }
        mo392d();
        if (this.f596p != null) {
            this.f596p.mo171a(c0168o, z);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: a */
    public final void mo359a(View view) {
        this.f595o = view;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo392d();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: a */
    public final void mo360a(PopupWindow.OnDismissListener onDismissListener) {
        this.f594n = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: g */
    public final ListView mo394g() {
        return this.f582a.mo394g();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: b */
    public final void mo362b(int i) {
        this.f582a.m861b(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: c */
    public final void mo366c(int i) {
        this.f582a.m855a(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: c */
    public final void mo367c(boolean z) {
        this.f601u = z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: a_ */
    public final void mo391a_() {
        boolean z = true;
        if (!mo393e()) {
            if (this.f597q || this.f595o == null) {
                z = false;
            } else {
                this.f584c = this.f595o;
                this.f582a.m859a((PopupWindow.OnDismissListener) this);
                this.f582a.m858a((AdapterView.OnItemClickListener) this);
                this.f582a.m868j();
                View view = this.f584c;
                boolean z2 = this.f585d == null;
                this.f585d = view.getViewTreeObserver();
                if (z2) {
                    this.f585d.addOnGlobalLayoutListener(this.f583b);
                }
                view.addOnAttachStateChangeListener(this.f593m);
                this.f582a.m862b(view);
                this.f582a.m864d(this.f600t);
                if (!this.f598r) {
                    this.f599s = m353a(this.f588h, null, this.f586f, this.f590j);
                    this.f598r = true;
                }
                this.f582a.m865e(this.f599s);
                this.f582a.m873o();
                this.f582a.m856a(m370i());
                this.f582a.mo391a_();
                ListView g = this.f582a.mo394g();
                g.setOnKeyListener(this);
                if (this.f601u && this.f587g.f678a != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f586f).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) g, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(this.f587g.f678a);
                    }
                    frameLayout.setEnabled(false);
                    g.addHeaderView(frameLayout, null, false);
                }
                this.f582a.mo745a(this.f588h);
                this.f582a.mo391a_();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
