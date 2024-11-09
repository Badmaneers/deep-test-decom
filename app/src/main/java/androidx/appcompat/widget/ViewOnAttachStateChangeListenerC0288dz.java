package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.p024g.C0505af;
import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TooltipCompatHandler.java */
/* renamed from: androidx.appcompat.widget.dz */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0288dz implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {

    /* renamed from: j */
    private static ViewOnAttachStateChangeListenerC0288dz f1398j;

    /* renamed from: k */
    private static ViewOnAttachStateChangeListenerC0288dz f1399k;

    /* renamed from: a */
    private final View f1400a;

    /* renamed from: b */
    private final CharSequence f1401b;

    /* renamed from: c */
    private final int f1402c;

    /* renamed from: d */
    private final Runnable f1403d = new RunnableC0290ea(this);

    /* renamed from: e */
    private final Runnable f1404e = new RunnableC0291eb(this);

    /* renamed from: f */
    private int f1405f;

    /* renamed from: g */
    private int f1406g;

    /* renamed from: h */
    private C0292ec f1407h;

    /* renamed from: i */
    private boolean f1408i;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* renamed from: a */
    public static void m974a(View view, CharSequence charSequence) {
        if (f1398j != null && f1398j.f1400a == view) {
            m975a((ViewOnAttachStateChangeListenerC0288dz) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (f1399k != null && f1399k.f1400a == view) {
                f1399k.m979a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnAttachStateChangeListenerC0288dz(view, charSequence);
    }

    private ViewOnAttachStateChangeListenerC0288dz(View view, CharSequence charSequence) {
        this.f1400a = view;
        this.f1401b = charSequence;
        this.f1402c = C0505af.m1739a(ViewConfiguration.get(this.f1400a.getContext()));
        m978d();
        this.f1400a.setOnLongClickListener(this);
        this.f1400a.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f1405f = view.getWidth() / 2;
        this.f1406g = view.getHeight() / 2;
        m980a(true);
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f1407h != null && this.f1408i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1400a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m978d();
                m979a();
            }
        } else if (this.f1400a.isEnabled() && this.f1407h == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f1405f) > this.f1402c || Math.abs(y - this.f1406g) > this.f1402c) {
                this.f1405f = x;
                this.f1406g = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m975a(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m979a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m980a(boolean z) {
        long longPressTimeout;
        if (C0538w.m1822F(this.f1400a)) {
            m975a((ViewOnAttachStateChangeListenerC0288dz) null);
            if (f1399k != null) {
                f1399k.m979a();
            }
            f1399k = this;
            this.f1408i = z;
            this.f1407h = new C0292ec(this.f1400a.getContext());
            this.f1407h.m983a(this.f1400a, this.f1405f, this.f1406g, this.f1408i, this.f1401b);
            this.f1400a.addOnAttachStateChangeListener(this);
            if (this.f1408i) {
                longPressTimeout = 2500;
            } else if ((C0538w.m1891t(this.f1400a) & 1) == 1) {
                longPressTimeout = 3000 - ViewConfiguration.getLongPressTimeout();
            } else {
                longPressTimeout = 15000 - ViewConfiguration.getLongPressTimeout();
            }
            this.f1400a.removeCallbacks(this.f1404e);
            this.f1400a.postDelayed(this.f1404e, longPressTimeout);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m979a() {
        if (f1399k == this) {
            f1399k = null;
            if (this.f1407h != null) {
                this.f1407h.m982a();
                this.f1407h = null;
                m978d();
                this.f1400a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1398j == this) {
            m975a((ViewOnAttachStateChangeListenerC0288dz) null);
        }
        this.f1400a.removeCallbacks(this.f1404e);
    }

    /* renamed from: a */
    private static void m975a(ViewOnAttachStateChangeListenerC0288dz viewOnAttachStateChangeListenerC0288dz) {
        if (f1398j != null) {
            f1398j.m977c();
        }
        f1398j = viewOnAttachStateChangeListenerC0288dz;
        if (viewOnAttachStateChangeListenerC0288dz != null) {
            f1398j.m976b();
        }
    }

    /* renamed from: b */
    private void m976b() {
        this.f1400a.postDelayed(this.f1403d, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: c */
    private void m977c() {
        this.f1400a.removeCallbacks(this.f1403d);
    }

    /* renamed from: d */
    private void m978d() {
        this.f1405f = Integer.MAX_VALUE;
        this.f1406g = Integer.MAX_VALUE;
    }
}
