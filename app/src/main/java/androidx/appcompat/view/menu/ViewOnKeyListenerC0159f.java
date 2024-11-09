package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.InterfaceC0237cb;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.p024g.C0521f;
import androidx.core.p024g.C0538w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CascadingMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0159f extends AbstractC0141aa implements View.OnKeyListener, PopupWindow.OnDismissListener, InterfaceC0144ad {

    /* renamed from: g */
    private static final int f621g = R.layout.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private PopupWindow.OnDismissListener f622A;

    /* renamed from: a */
    final Handler f623a;

    /* renamed from: d */
    View f626d;

    /* renamed from: e */
    ViewTreeObserver f627e;

    /* renamed from: f */
    boolean f628f;

    /* renamed from: h */
    private final Context f629h;

    /* renamed from: i */
    private final int f630i;

    /* renamed from: j */
    private final int f631j;

    /* renamed from: k */
    private final int f632k;

    /* renamed from: l */
    private final boolean f633l;

    /* renamed from: r */
    private View f639r;

    /* renamed from: t */
    private boolean f641t;

    /* renamed from: u */
    private boolean f642u;

    /* renamed from: v */
    private int f643v;

    /* renamed from: w */
    private int f644w;

    /* renamed from: y */
    private boolean f646y;

    /* renamed from: z */
    private InterfaceC0145ae f647z;

    /* renamed from: m */
    private final List<C0168o> f634m = new ArrayList();

    /* renamed from: b */
    final List<C0164k> f624b = new ArrayList();

    /* renamed from: c */
    final ViewTreeObserver.OnGlobalLayoutListener f625c = new ViewTreeObserverOnGlobalLayoutListenerC0160g(this);

    /* renamed from: n */
    private final View.OnAttachStateChangeListener f635n = new ViewOnAttachStateChangeListenerC0161h(this);

    /* renamed from: o */
    private final InterfaceC0237cb f636o = new C0162i(this);

    /* renamed from: p */
    private int f637p = 0;

    /* renamed from: q */
    private int f638q = 0;

    /* renamed from: x */
    private boolean f645x = false;

    /* renamed from: s */
    private int f640s = m425k();

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo384a(Parcelable parcelable) {
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

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: h */
    protected final boolean mo369h() {
        return false;
    }

    public ViewOnKeyListenerC0159f(Context context, View view, int i, int i2, boolean z) {
        this.f629h = context;
        this.f639r = view;
        this.f631j = i;
        this.f632k = i2;
        this.f633l = z;
        Resources resources = context.getResources();
        this.f630i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f623a = new Handler();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: b */
    public final void mo363b(boolean z) {
        this.f645x = z;
    }

    /* renamed from: j */
    private MenuPopupWindow m424j() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f629h, this.f631j, this.f632k);
        menuPopupWindow.m591a(this.f636o);
        menuPopupWindow.m858a((AdapterView.OnItemClickListener) this);
        menuPopupWindow.m859a((PopupWindow.OnDismissListener) this);
        menuPopupWindow.m862b(this.f639r);
        menuPopupWindow.m864d(this.f638q);
        menuPopupWindow.m868j();
        menuPopupWindow.m873o();
        return menuPopupWindow;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: a_ */
    public final void mo391a_() {
        if (mo393e()) {
            return;
        }
        Iterator<C0168o> it = this.f634m.iterator();
        while (it.hasNext()) {
            m422c(it.next());
        }
        this.f634m.clear();
        this.f626d = this.f639r;
        if (this.f626d != null) {
            boolean z = this.f627e == null;
            this.f627e = this.f626d.getViewTreeObserver();
            if (z) {
                this.f627e.addOnGlobalLayoutListener(this.f625c);
            }
            this.f626d.addOnAttachStateChangeListener(this.f635n);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: d */
    public final void mo392d() {
        int size = this.f624b.size();
        if (size > 0) {
            C0164k[] c0164kArr = (C0164k[]) this.f624b.toArray(new C0164k[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0164k c0164k = c0164kArr[i];
                if (c0164k.f655a.mo393e()) {
                    c0164k.f655a.mo392d();
                }
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo392d();
        return true;
    }

    /* renamed from: k */
    private int m425k() {
        return C0538w.m1878h(this.f639r) == 1 ? 0 : 1;
    }

    /* renamed from: d */
    private int m423d(int i) {
        ListView g = this.f624b.get(this.f624b.size() - 1).f655a.mo394g();
        int[] iArr = new int[2];
        g.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f626d.getWindowVisibleDisplayFrame(rect);
        return this.f640s == 1 ? (iArr[0] + g.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: a */
    public final void mo361a(C0168o c0168o) {
        c0168o.m451a(this, this.f629h);
        if (mo393e()) {
            m422c(c0168o);
        } else {
            this.f634m.add(c0168o);
        }
    }

    /* renamed from: c */
    private void m422c(C0168o c0168o) {
        C0164k c0164k;
        View view;
        int i;
        int i2;
        int width;
        LayoutInflater from = LayoutInflater.from(this.f629h);
        C0167n c0167n = new C0167n(c0168o, from, this.f633l, f621g);
        if (!mo393e() && this.f645x) {
            c0167n.m435a(true);
        } else if (mo393e()) {
            c0167n.m435a(AbstractC0141aa.m355b(c0168o));
        }
        int a2 = m353a(c0167n, null, this.f629h, this.f630i);
        MenuPopupWindow m424j = m424j();
        m424j.mo745a(c0167n);
        m424j.m865e(a2);
        m424j.m864d(this.f638q);
        if (this.f624b.size() > 0) {
            c0164k = this.f624b.get(this.f624b.size() - 1);
            view = m421a(c0164k, c0168o);
        } else {
            c0164k = null;
            view = null;
        }
        if (view != null) {
            m424j.m594x();
            m424j.m592h();
            int m423d = m423d(a2);
            boolean z = m423d == 1;
            this.f640s = m423d;
            if (Build.VERSION.SDK_INT >= 26) {
                m424j.m862b(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f639r.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f638q & 7) == 5) {
                    iArr[0] = iArr[0] + this.f639r.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f638q & 5) == 5) {
                width = z ? i + a2 : i - view.getWidth();
            } else {
                width = z ? i + view.getWidth() : i - a2;
            }
            m424j.m861b(width);
            m424j.m880v();
            m424j.m855a(i2);
        } else {
            if (this.f641t) {
                m424j.m861b(this.f643v);
            }
            if (this.f642u) {
                m424j.m855a(this.f644w);
            }
            m424j.m856a(m370i());
        }
        this.f624b.add(new C0164k(m424j, c0168o, this.f640s));
        m424j.mo391a_();
        ListView g = m424j.mo394g();
        g.setOnKeyListener(this);
        if (c0164k == null && this.f646y && c0168o.f678a != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) g, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0168o.f678a);
            g.addHeaderView(frameLayout, null, false);
            m424j.mo391a_();
        }
    }

    /* renamed from: a */
    private static MenuItem m420a(C0168o c0168o, C0168o c0168o2) {
        int size = c0168o.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0168o.getItem(i);
            if (item.hasSubMenu() && c0168o2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static View m421a(C0164k c0164k, C0168o c0168o) {
        C0167n c0167n;
        int i;
        int firstVisiblePosition;
        MenuItem m420a = m420a(c0164k.f656b, c0168o);
        if (m420a == null) {
            return null;
        }
        ListView g = c0164k.f655a.mo394g();
        ListAdapter adapter = g.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            c0167n = (C0167n) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0167n = (C0167n) adapter;
            i = 0;
        }
        int count = c0167n.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (m420a == c0167n.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - g.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < g.getChildCount()) {
            return g.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: e */
    public final boolean mo393e() {
        return this.f624b.size() > 0 && this.f624b.get(0).f655a.mo393e();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0164k c0164k;
        int size = this.f624b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0164k = null;
                break;
            }
            c0164k = this.f624b.get(i);
            if (!c0164k.f655a.mo393e()) {
                break;
            } else {
                i++;
            }
        }
        if (c0164k != null) {
            c0164k.f656b.m452a(false);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo387a(boolean z) {
        Iterator<C0164k> it = this.f624b.iterator();
        while (it.hasNext()) {
            m354a(it.next().f655a.mo394g().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo385a(InterfaceC0145ae interfaceC0145ae) {
        this.f647z = interfaceC0145ae;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final boolean mo388a(SubMenuC0153am subMenuC0153am) {
        for (C0164k c0164k : this.f624b) {
            if (subMenuC0153am == c0164k.f656b) {
                c0164k.f655a.mo394g().requestFocus();
                return true;
            }
        }
        if (!subMenuC0153am.hasVisibleItems()) {
            return false;
        }
        mo361a((C0168o) subMenuC0153am);
        if (this.f647z != null) {
            this.f647z.mo172a(subMenuC0153am);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: a */
    public final void mo356a(int i) {
        if (this.f637p != i) {
            this.f637p = i;
            this.f638q = C0521f.m1777a(i, C0538w.m1878h(this.f639r));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: a */
    public final void mo359a(View view) {
        if (this.f639r != view) {
            this.f639r = view;
            this.f638q = C0521f.m1777a(this.f637p, C0538w.m1878h(this.f639r));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: a */
    public final void mo360a(PopupWindow.OnDismissListener onDismissListener) {
        this.f622A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0149ai
    /* renamed from: g */
    public final ListView mo394g() {
        if (this.f624b.isEmpty()) {
            return null;
        }
        return this.f624b.get(this.f624b.size() - 1).f655a.mo394g();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: b */
    public final void mo362b(int i) {
        this.f641t = true;
        this.f643v = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: c */
    public final void mo366c(int i) {
        this.f642u = true;
        this.f644w = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0141aa
    /* renamed from: c */
    public final void mo367c(boolean z) {
        this.f646y = z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo386a(C0168o c0168o, boolean z) {
        int size = this.f624b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c0168o == this.f624b.get(i).f656b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.f624b.size()) {
            this.f624b.get(i2).f656b.m452a(false);
        }
        C0164k remove = this.f624b.remove(i);
        remove.f656b.m457b(this);
        if (this.f628f) {
            remove.f655a.m593w();
            remove.f655a.m870l();
        }
        remove.f655a.mo392d();
        int size2 = this.f624b.size();
        if (size2 > 0) {
            this.f640s = this.f624b.get(size2 - 1).f657c;
        } else {
            this.f640s = m425k();
        }
        if (size2 != 0) {
            if (z) {
                this.f624b.get(0).f656b.m452a(false);
                return;
            }
            return;
        }
        mo392d();
        if (this.f647z != null) {
            this.f647z.mo171a(c0168o, true);
        }
        if (this.f627e != null) {
            if (this.f627e.isAlive()) {
                this.f627e.removeGlobalOnLayoutListener(this.f625c);
            }
            this.f627e = null;
        }
        this.f626d.removeOnAttachStateChangeListener(this.f635n);
        this.f622A.onDismiss();
    }
}
