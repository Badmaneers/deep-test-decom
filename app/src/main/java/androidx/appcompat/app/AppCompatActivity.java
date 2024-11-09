package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0293ed;
import androidx.core.app.C0403a;
import androidx.core.app.C0414l;
import androidx.core.app.C0416n;
import androidx.core.app.InterfaceC0417o;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC0103r, InterfaceC0417o {

    /* renamed from: j */
    private AbstractC0104s f112j;

    /* renamed from: k */
    private Resources f113k;

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    public AppCompatActivity() {
    }

    public AppCompatActivity(int i) {
        super(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        m68g().mo124h();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC0104s m68g = m68g();
        m68g.mo129k();
        m68g.mo114c();
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        m68g().mo99a(i);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m68g().mo116d();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m68g().mo110b();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m68g().mo115c(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m68g().mo102a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m68g().mo103a(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m68g().mo112b(view, layoutParams);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f113k != null) {
            this.f113k.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m68g().mo101a(configuration);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m68g().mo123g();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        m68g().mo118e();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        m68g().mo120f();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m68g().mo111b(i);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0059a mo97a = m68g().mo97a();
        if (menuItem.getItemId() != 16908332 || mo97a == null || (mo97a.mo152a() & 4) == 0) {
            return false;
        }
        return m65h();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m68g().mo128j();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m68g().mo106a(charSequence);
    }

    @Override // androidx.fragment.app.FragmentActivity
    /* renamed from: e */
    public final void mo66e() {
        m68g().mo127i();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m68g().mo127i();
    }

    @Override // androidx.core.app.InterfaceC0417o
    /* renamed from: f */
    public final Intent mo67f() {
        return C0414l.m1469a(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m68g().mo130l();
    }

    /* renamed from: g */
    public final AbstractC0104s m68g() {
        if (this.f112j == null) {
            this.f112j = AbstractC0104s.m244a(this, this);
        }
        return this.f112j;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0059a mo97a = m68g().mo97a();
        if (keyCode == 82 && mo97a != null && mo97a.mo159a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f113k == null && C0293ed.m984a()) {
            this.f113k = new C0293ed(this, super.getResources());
        }
        return this.f113k == null ? super.getResources() : this.f113k;
    }

    /* renamed from: h */
    private boolean m65h() {
        Intent m1469a = C0414l.m1469a(this);
        boolean z = false;
        if (m1469a == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            z = shouldUpRecreateTask(m1469a);
        } else {
            String action = getIntent().getAction();
            if (action != null && !action.equals("android.intent.action.MAIN")) {
                z = true;
            }
        }
        if (z) {
            C0416n m1474a = C0416n.m1474a((Context) this);
            m1474a.m1475a((Activity) this);
            m1474a.m1476a();
            try {
                C0403a.m1452a((Activity) this);
            } catch (IllegalStateException unused) {
                finish();
            }
        } else if (Build.VERSION.SDK_INT >= 16) {
            navigateUpTo(m1469a);
        } else {
            m1469a.addFlags(67108864);
            startActivity(m1469a);
            finish();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0059a mo97a = m68g().mo97a();
        if (getWindow().hasFeature(0)) {
            if (mo97a == null || !mo97a.mo164d()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0059a mo97a = m68g().mo97a();
        if (getWindow().hasFeature(0)) {
            if (mo97a == null || !mo97a.mo165e()) {
                super.closeOptionsMenu();
            }
        }
    }
}
