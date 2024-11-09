package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* compiled from: WindowCallbackWrapper.java */
/* renamed from: androidx.appcompat.view.n */
/* loaded from: classes.dex */
public class WindowCallbackC0180n implements Window.Callback {

    /* renamed from: b */
    final Window.Callback f750b;

    public WindowCallbackC0180n(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f750b = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f750b.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f750b.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f750b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f750b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f750b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f750b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.f750b.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f750b.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f750b.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.f750b.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f750b.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f750b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f750b.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.f750b.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f750b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f750b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f750b.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f750b.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f750b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f750b.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f750b.onWindowStartingActionMode(callback, i);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f750b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f750b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f750b.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        this.f750b.onPointerCaptureChanged(z);
    }

    /* renamed from: a */
    public final Window.Callback m506a() {
        return this.f750b;
    }
}
