package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.core.p024g.C0521f;
import androidx.core.p024g.C0538w;

/* compiled from: MenuPopupHelper.java */
/* renamed from: androidx.appcompat.view.menu.ab */
/* loaded from: classes.dex */
public class C0142ab {

    /* renamed from: a */
    private final Context f567a;

    /* renamed from: b */
    private final C0168o f568b;

    /* renamed from: c */
    private final boolean f569c;

    /* renamed from: d */
    private final int f570d;

    /* renamed from: e */
    private final int f571e;

    /* renamed from: f */
    private View f572f;

    /* renamed from: g */
    private int f573g;

    /* renamed from: h */
    private boolean f574h;

    /* renamed from: i */
    private InterfaceC0145ae f575i;

    /* renamed from: j */
    private AbstractC0141aa f576j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f577k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f578l;

    public C0142ab(Context context, C0168o c0168o, View view, boolean z, int i) {
        this(context, c0168o, view, z, i, 0);
    }

    public C0142ab(Context context, C0168o c0168o, View view, boolean z, int i, int i2) {
        this.f573g = 8388611;
        this.f578l = new C0143ac(this);
        this.f567a = context;
        this.f568b = c0168o;
        this.f572f = view;
        this.f569c = z;
        this.f570d = i;
        this.f571e = i2;
    }

    /* renamed from: a */
    public final void m374a(PopupWindow.OnDismissListener onDismissListener) {
        this.f577k = onDismissListener;
    }

    /* renamed from: a */
    public final void m373a(View view) {
        this.f572f = view;
    }

    /* renamed from: a */
    public final void m376a(boolean z) {
        this.f574h = z;
        if (this.f576j != null) {
            this.f576j.mo363b(z);
        }
    }

    /* renamed from: a */
    public final void m372a() {
        this.f573g = 8388613;
    }

    /* renamed from: b */
    public final void m378b() {
        if (!m380d()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: c */
    public final AbstractC0141aa m379c() {
        AbstractC0141aa viewOnKeyListenerC0150aj;
        if (this.f576j == null) {
            Display defaultDisplay = ((WindowManager) this.f567a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            if (Math.min(point.x, point.y) >= this.f567a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0150aj = new ViewOnKeyListenerC0159f(this.f567a, this.f572f, this.f570d, this.f571e, this.f569c);
            } else {
                viewOnKeyListenerC0150aj = new ViewOnKeyListenerC0150aj(this.f567a, this.f568b, this.f572f, this.f570d, this.f571e, this.f569c);
            }
            viewOnKeyListenerC0150aj.mo361a(this.f568b);
            viewOnKeyListenerC0150aj.mo360a(this.f578l);
            viewOnKeyListenerC0150aj.mo359a(this.f572f);
            viewOnKeyListenerC0150aj.mo385a(this.f575i);
            viewOnKeyListenerC0150aj.mo363b(this.f574h);
            viewOnKeyListenerC0150aj.mo356a(this.f573g);
            this.f576j = viewOnKeyListenerC0150aj;
        }
        return this.f576j;
    }

    /* renamed from: d */
    public final boolean m380d() {
        if (m383g()) {
            return true;
        }
        if (this.f572f == null) {
            return false;
        }
        m371a(0, 0, false, false);
        return true;
    }

    /* renamed from: a */
    public final boolean m377a(int i, int i2) {
        if (m383g()) {
            return true;
        }
        if (this.f572f == null) {
            return false;
        }
        m371a(i, i2, true, true);
        return true;
    }

    /* renamed from: a */
    private void m371a(int i, int i2, boolean z, boolean z2) {
        AbstractC0141aa m379c = m379c();
        m379c.mo367c(z2);
        if (z) {
            if ((C0521f.m1777a(this.f573g, C0538w.m1878h(this.f572f)) & 7) == 5) {
                i -= this.f572f.getWidth();
            }
            m379c.mo362b(i);
            m379c.mo366c(i2);
            int i3 = (int) ((this.f567a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m379c.m358a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        m379c.mo391a_();
    }

    /* renamed from: e */
    public final void m381e() {
        if (m383g()) {
            this.f576j.mo392d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void mo382f() {
        this.f576j = null;
        if (this.f577k != null) {
            this.f577k.onDismiss();
        }
    }

    /* renamed from: g */
    public final boolean m383g() {
        return this.f576j != null && this.f576j.mo393e();
    }

    /* renamed from: a */
    public final void m375a(InterfaceC0145ae interfaceC0145ae) {
        this.f575i = interfaceC0145ae;
        if (this.f576j != null) {
            this.f576j.mo385a(interfaceC0145ae);
        }
    }
}
