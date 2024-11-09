package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.p024g.C0522g;
import androidx.core.p024g.InterfaceC0523h;
import androidx.lifecycle.AbstractC0728h;
import androidx.lifecycle.C0734n;
import androidx.lifecycle.EnumC0730j;
import androidx.lifecycle.FragmentC0745y;
import androidx.lifecycle.InterfaceC0733m;
import androidx.p011b.C0328n;

/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements InterfaceC0523h, InterfaceC0733m {

    /* renamed from: a */
    private C0328n<Class<? extends C0412j>, C0412j> f2105a = new C0328n<>();

    /* renamed from: b */
    private C0734n f2106b = new C0734n(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    /* renamed from: a */
    public final void m1449a(C0412j c0412j) {
        this.f2105a.put(c0412j.getClass(), c0412j);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0745y.m2639a(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f2106b.m2624a(EnumC0730j.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    /* renamed from: a */
    public final <T extends C0412j> T m1448a(Class<T> cls) {
        return (T) this.f2105a.get(cls);
    }

    /* renamed from: a */
    public AbstractC0728h mo31a() {
        return this.f2106b;
    }

    @Override // androidx.core.p024g.InterfaceC0523h
    /* renamed from: a */
    public final boolean mo187a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0522g.m1781a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0522g.m1781a(decorView, keyEvent)) {
            return C0522g.m1782a(this, decorView, this, keyEvent);
        }
        return true;
    }
}
