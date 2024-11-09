package androidx.appcompat.app;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.AbstractC0128b;
import androidx.appcompat.view.C0134h;
import androidx.appcompat.view.WindowCallbackC0180n;
import androidx.appcompat.view.menu.C0168o;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.ae */
/* loaded from: classes.dex */
public final class C0064ae extends WindowCallbackC0180n {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f200a;

    @Override // androidx.appcompat.view.WindowCallbackC0180n, android.view.Window.Callback
    public final void onContentChanged() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064ae(AppCompatDelegateImpl appCompatDelegateImpl, Window.Callback callback) {
        super(callback);
        this.f200a = appCompatDelegateImpl;
    }

    @Override // androidx.appcompat.view.WindowCallbackC0180n, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f200a.m108a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.view.WindowCallbackC0180n, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.f200a.m107a(keyEvent.getKeyCode(), keyEvent);
    }

    @Override // androidx.appcompat.view.WindowCallbackC0180n, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C0168o)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // androidx.appcompat.view.WindowCallbackC0180n, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C0168o c0168o = menu instanceof C0168o ? (C0168o) menu : null;
        if (i == 0 && c0168o == null) {
            return false;
        }
        if (c0168o != null) {
            c0168o.m460c(true);
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (c0168o != null) {
            c0168o.m460c(false);
        }
        return onPreparePanel;
    }

    @Override // androidx.appcompat.view.WindowCallbackC0180n, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        this.f200a.m121f(i);
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackC0180n, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        this.f200a.m119e(i);
    }

    @Override // androidx.appcompat.view.WindowCallbackC0180n, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.f200a.m133p()) {
            return m177a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    /* renamed from: a */
    private ActionMode m177a(ActionMode.Callback callback) {
        C0134h c0134h = new C0134h(this.f200a.f148b, callback);
        AbstractC0128b m98a = this.f200a.m98a(c0134h);
        if (m98a != null) {
            return c0134h.m316b(m98a);
        }
        return null;
    }

    @Override // androidx.appcompat.view.WindowCallbackC0180n, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.f200a.m133p() && i == 0) {
            return m177a(callback);
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    @Override // androidx.appcompat.view.WindowCallbackC0180n, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        AppCompatDelegateImpl.PanelFeatureState m122g = this.f200a.m122g(0);
        if (m122g != null && m122g.f177j != null) {
            super.onProvideKeyboardShortcuts(list, m122g.f177j, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }
}
