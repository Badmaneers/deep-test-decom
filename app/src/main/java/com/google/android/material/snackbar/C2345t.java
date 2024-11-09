package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnackbarManager.java */
/* renamed from: com.google.android.material.snackbar.t */
/* loaded from: classes.dex */
public final class C2345t {

    /* renamed from: a */
    private static C2345t f10324a;

    /* renamed from: b */
    private final Object f10325b = new Object();

    /* renamed from: c */
    private final Handler f10326c = new Handler(Looper.getMainLooper(), new C2346u(this));

    /* renamed from: d */
    private C2348w f10327d;

    /* renamed from: e */
    private C2348w f10328e;

    /* renamed from: a */
    public static C2345t m7457a() {
        if (f10324a == null) {
            f10324a = new C2345t();
        }
        return f10324a;
    }

    private C2345t() {
    }

    /* renamed from: a */
    public final void m7462a(InterfaceC2347v interfaceC2347v) {
        synchronized (this.f10325b) {
            if (m7460g(interfaceC2347v)) {
                m7458b(this.f10327d);
            } else if (m7461h(interfaceC2347v)) {
                m7458b(this.f10328e);
            }
        }
    }

    /* renamed from: b */
    public final void m7464b(InterfaceC2347v interfaceC2347v) {
        synchronized (this.f10325b) {
            if (m7460g(interfaceC2347v)) {
                this.f10327d = null;
                if (this.f10328e != null && this.f10328e != null) {
                    this.f10327d = this.f10328e;
                    this.f10328e = null;
                    if (this.f10327d.f10330a.get() == null) {
                        this.f10327d = null;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m7465c(InterfaceC2347v interfaceC2347v) {
        synchronized (this.f10325b) {
            if (m7460g(interfaceC2347v)) {
                m7459c(this.f10327d);
            }
        }
    }

    /* renamed from: d */
    public final void m7466d(InterfaceC2347v interfaceC2347v) {
        synchronized (this.f10325b) {
            if (m7460g(interfaceC2347v) && !this.f10327d.f10332c) {
                this.f10327d.f10332c = true;
                this.f10326c.removeCallbacksAndMessages(this.f10327d);
            }
        }
    }

    /* renamed from: e */
    public final void m7467e(InterfaceC2347v interfaceC2347v) {
        synchronized (this.f10325b) {
            if (m7460g(interfaceC2347v) && this.f10327d.f10332c) {
                this.f10327d.f10332c = false;
                m7459c(this.f10327d);
            }
        }
    }

    /* renamed from: f */
    public final boolean m7468f(InterfaceC2347v interfaceC2347v) {
        boolean z;
        synchronized (this.f10325b) {
            z = m7460g(interfaceC2347v) || m7461h(interfaceC2347v);
        }
        return z;
    }

    /* renamed from: b */
    private boolean m7458b(C2348w c2348w) {
        if (c2348w.f10330a.get() == null) {
            return false;
        }
        this.f10326c.removeCallbacksAndMessages(c2348w);
        return true;
    }

    /* renamed from: g */
    private boolean m7460g(InterfaceC2347v interfaceC2347v) {
        return this.f10327d != null && this.f10327d.m7469a(interfaceC2347v);
    }

    /* renamed from: h */
    private boolean m7461h(InterfaceC2347v interfaceC2347v) {
        return this.f10328e != null && this.f10328e.m7469a(interfaceC2347v);
    }

    /* renamed from: c */
    private void m7459c(C2348w c2348w) {
        if (c2348w.f10331b == -2) {
            return;
        }
        int i = 2750;
        if (c2348w.f10331b > 0) {
            i = c2348w.f10331b;
        } else if (c2348w.f10331b == -1) {
            i = 1500;
        }
        this.f10326c.removeCallbacksAndMessages(c2348w);
        this.f10326c.sendMessageDelayed(Message.obtain(this.f10326c, 0, c2348w), i);
    }

    /* renamed from: a */
    public final void m7463a(C2348w c2348w) {
        synchronized (this.f10325b) {
            if (this.f10327d == c2348w || this.f10328e == c2348w) {
                m7458b(c2348w);
            }
        }
    }
}
