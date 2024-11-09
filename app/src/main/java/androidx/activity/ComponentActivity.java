package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0728h;
import androidx.lifecycle.C0720ae;
import androidx.lifecycle.C0734n;
import androidx.lifecycle.EnumC0729i;
import androidx.lifecycle.EnumC0730j;
import androidx.lifecycle.FragmentC0745y;
import androidx.lifecycle.InterfaceC0721af;
import androidx.lifecycle.InterfaceC0731k;
import androidx.lifecycle.InterfaceC0733m;
import androidx.savedstate.C0970a;
import androidx.savedstate.C0973d;
import androidx.savedstate.InterfaceC0974e;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC0056f, InterfaceC0721af, InterfaceC0733m, InterfaceC0974e {

    /* renamed from: a */
    private final C0734n f33a;

    /* renamed from: b */
    private final C0973d f34b;

    /* renamed from: c */
    private C0720ae f35c;

    /* renamed from: d */
    private final OnBackPressedDispatcher f36d;

    /* renamed from: e */
    private int f37e;

    public ComponentActivity() {
        this.f33a = new C0734n(this);
        this.f34b = C0973d.m3421a(this);
        this.f36d = new OnBackPressedDispatcher(new RunnableC0052b(this));
        if (this.f33a == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f33a.mo2609a(new InterfaceC0731k() { // from class: androidx.activity.ComponentActivity.2
                @Override // androidx.lifecycle.InterfaceC0731k
                /* renamed from: a */
                public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
                    if (enumC0729i == EnumC0729i.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        this.f33a.mo2609a(new InterfaceC0731k() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.InterfaceC0731k
            /* renamed from: a */
            public final void mo35a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i) {
                if (enumC0729i != EnumC0729i.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.mo32b().m2603a();
            }
        });
        if (19 > Build.VERSION.SDK_INT || Build.VERSION.SDK_INT > 23) {
            return;
        }
        this.f33a.mo2609a(new ImmLeaksCleaner(this));
    }

    public ComponentActivity(int i) {
        this();
        this.f37e = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34b.m3423a(bundle);
        FragmentC0745y.m2639a(this);
        if (this.f37e != 0) {
            setContentView(this.f37e);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0053c c0053c;
        C0720ae c0720ae = this.f35c;
        if (c0720ae == null && (c0053c = (C0053c) getLastNonConfigurationInstance()) != null) {
            c0720ae = c0053c.f53b;
        }
        if (c0720ae == null) {
            return null;
        }
        C0053c c0053c2 = new C0053c();
        c0053c2.f52a = null;
        c0053c2.f53b = c0720ae;
        return c0053c2;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.InterfaceC0733m
    /* renamed from: a */
    public final AbstractC0728h mo31a() {
        return this.f33a;
    }

    @Override // androidx.lifecycle.InterfaceC0721af
    /* renamed from: b */
    public final C0720ae mo32b() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f35c == null) {
            C0053c c0053c = (C0053c) getLastNonConfigurationInstance();
            if (c0053c != null) {
                this.f35c = c0053c.f53b;
            }
            if (this.f35c == null) {
                this.f35c = new C0720ae();
            }
        }
        return this.f35c;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f36d.m36a();
    }

    @Override // androidx.activity.InterfaceC0056f
    /* renamed from: c */
    public final OnBackPressedDispatcher mo33c() {
        return this.f36d;
    }

    @Override // androidx.savedstate.InterfaceC0974e
    /* renamed from: d */
    public final C0970a mo34d() {
        return this.f34b.m3422a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0734n c0734n = this.f33a;
        if (c0734n instanceof C0734n) {
            c0734n.m2624a(EnumC0730j.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f34b.m3424b(bundle);
    }
}
