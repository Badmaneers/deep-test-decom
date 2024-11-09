package androidx.core.p024g;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: KeyEventDispatcher.java */
/* renamed from: androidx.core.g.g */
/* loaded from: classes.dex */
public final class C0522g {

    /* renamed from: a */
    private static boolean f2364a = false;

    /* renamed from: b */
    private static Method f2365b = null;

    /* renamed from: c */
    private static boolean f2366c = false;

    /* renamed from: d */
    private static Field f2367d;

    /* renamed from: a */
    public static boolean m1781a(View view, KeyEvent keyEvent) {
        return C0538w.m1857a(view, keyEvent);
    }

    /* renamed from: a */
    public static boolean m1782a(InterfaceC0523h interfaceC0523h, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (interfaceC0523h == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0523h.mo187a(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null && m1780a(actionBar, keyEvent)) {
                    return true;
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (C0538w.m1865b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && C0538w.m1865b(view, keyEvent)) || interfaceC0523h.mo187a(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        DialogInterface.OnKeyListener m1779a = m1779a(dialog);
        if (m1779a != null && m1779a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (C0538w.m1865b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: a */
    private static boolean m1780a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2364a) {
            try {
                f2365b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f2364a = true;
        }
        if (f2365b != null) {
            try {
                return ((Boolean) f2365b.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static DialogInterface.OnKeyListener m1779a(Dialog dialog) {
        if (!f2366c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2367d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2366c = true;
        }
        if (f2367d == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) f2367d.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
