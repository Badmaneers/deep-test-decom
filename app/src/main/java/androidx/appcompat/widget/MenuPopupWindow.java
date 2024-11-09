package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0167n;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class MenuPopupWindow extends C0228bt implements InterfaceC0237cb {

    /* renamed from: a */
    private static Method f922a;

    /* renamed from: b */
    private InterfaceC0237cb f923b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f922a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // androidx.appcompat.widget.C0228bt
    /* renamed from: a */
    final C0219bk mo590a(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    /* renamed from: h */
    public final void m592h() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1247g.setEnterTransition(null);
        }
    }

    /* renamed from: w */
    public final void m593w() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1247g.setExitTransition(null);
        }
    }

    /* renamed from: a */
    public final void m591a(InterfaceC0237cb interfaceC0237cb) {
        this.f923b = interfaceC0237cb;
    }

    /* renamed from: x */
    public final void m594x() {
        if (Build.VERSION.SDK_INT <= 28) {
            if (f922a != null) {
                try {
                    f922a.invoke(this.f1247g, Boolean.FALSE);
                    return;
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.f1247g.setTouchModal(false);
    }

    @Override // androidx.appcompat.widget.InterfaceC0237cb
    /* renamed from: b */
    public final void mo427b(C0168o c0168o, MenuItem menuItem) {
        if (this.f923b != null) {
            this.f923b.mo427b(c0168o, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0237cb
    /* renamed from: a */
    public final void mo426a(C0168o c0168o, MenuItem menuItem) {
        if (this.f923b != null) {
            this.f923b.mo426a(c0168o, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public class MenuDropDownListView extends C0219bk {

        /* renamed from: b */
        final int f924b;

        /* renamed from: c */
        final int f925c;

        /* renamed from: d */
        private InterfaceC0237cb f926d;

        /* renamed from: e */
        private MenuItem f927e;

        @Override // androidx.appcompat.widget.C0219bk
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo595a(int i, int i2, int i3, int i4, int i5) {
            return super.mo595a(i, i2, i3, i4, i5);
        }

        @Override // androidx.appcompat.widget.C0219bk
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo596a(MotionEvent motionEvent, int i) {
            return super.mo596a(motionEvent, i);
        }

        @Override // androidx.appcompat.widget.C0219bk, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C0219bk, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C0219bk, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C0219bk, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C0219bk, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.C0219bk, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.f924b = 21;
                this.f925c = 22;
            } else {
                this.f924b = 22;
                this.f925c = 21;
            }
        }

        public void setHoverListener(InterfaceC0237cb interfaceC0237cb) {
            this.f926d = interfaceC0237cb;
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f924b) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && i == this.f925c) {
                setSelection(-1);
                ((C0167n) getAdapter()).m433a().m452a(false);
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }

        @Override // androidx.appcompat.widget.C0219bk, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0167n c0167n;
            int pointToPosition;
            int i2;
            if (this.f926d != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    c0167n = (C0167n) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    c0167n = (C0167n) adapter;
                }
                C0172s c0172s = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0167n.getCount()) {
                    c0172s = c0167n.getItem(i2);
                }
                MenuItem menuItem = this.f927e;
                if (menuItem != c0172s) {
                    C0168o m433a = c0167n.m433a();
                    if (menuItem != null) {
                        this.f926d.mo426a(m433a, menuItem);
                    }
                    this.f927e = c0172s;
                    if (c0172s != null) {
                        this.f926d.mo427b(m433a, c0172s);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }
}
