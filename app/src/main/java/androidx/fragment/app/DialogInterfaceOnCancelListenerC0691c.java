package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: DialogFragment.java */
/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0691c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: ae */
    private Handler f2943ae;

    /* renamed from: f */
    Dialog f2949f;

    /* renamed from: g */
    boolean f2950g;

    /* renamed from: h */
    boolean f2951h;

    /* renamed from: i */
    boolean f2952i;

    /* renamed from: af */
    private Runnable f2944af = new RunnableC0692d(this);

    /* renamed from: a */
    int f2942a = 0;

    /* renamed from: b */
    int f2945b = 0;

    /* renamed from: c */
    boolean f2946c = true;

    /* renamed from: d */
    boolean f2947d = true;

    /* renamed from: e */
    int f2948e = -1;

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    /* renamed from: c */
    public final void m2428c() {
        m2427a(false, false);
    }

    /* renamed from: a */
    private void m2427a(boolean z, boolean z2) {
        if (this.f2951h) {
            return;
        }
        this.f2951h = true;
        this.f2952i = false;
        if (this.f2949f != null) {
            this.f2949f.setOnDismissListener(null);
            this.f2949f.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f2943ae.getLooper()) {
                    onDismiss(this.f2949f);
                } else {
                    this.f2943ae.post(this.f2944af);
                }
            }
        }
        this.f2950g = true;
        if (this.f2948e >= 0) {
            m2318s().mo2474a(this.f2948e);
            this.f2948e = -1;
            return;
        }
        AbstractC0671ao mo2473a = m2318s().mo2473a();
        mo2473a.mo2336a(this);
        if (z) {
            mo2473a.mo2351c();
        } else {
            mo2473a.mo2347b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public final void mo2278a(Context context) {
        super.mo2278a(context);
        if (this.f2952i) {
            return;
        }
        this.f2951h = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: f */
    public final void mo2303f() {
        super.mo2303f();
        if (this.f2952i || this.f2951h) {
            return;
        }
        this.f2951h = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a */
    public void mo2280a(Bundle bundle) {
        super.mo2280a(bundle);
        this.f2943ae = new Handler();
        this.f2947d = this.f2739F == 0;
        if (bundle != null) {
            this.f2942a = bundle.getInt("android:style", 0);
            this.f2945b = bundle.getInt("android:theme", 0);
            this.f2946c = bundle.getBoolean("android:cancelable", true);
            this.f2947d = bundle.getBoolean("android:showsDialog", this.f2947d);
            this.f2948e = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b */
    public final LayoutInflater mo2290b(Bundle bundle) {
        if (!this.f2947d) {
            return super.mo2290b(bundle);
        }
        this.f2949f = mo2430g();
        if (this.f2949f != null) {
            Dialog dialog = this.f2949f;
            switch (this.f2942a) {
                case 3:
                    dialog.getWindow().addFlags(24);
                case 1:
                case 2:
                    dialog.requestWindowFeature(1);
                    break;
            }
            return (LayoutInflater) this.f2949f.getContext().getSystemService("layout_inflater");
        }
        return (LayoutInflater) this.f2735B.m2470k().getSystemService("layout_inflater");
    }

    /* renamed from: g */
    public Dialog mo2430g() {
        return new Dialog(m2314o(), this.f2945b);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2950g) {
            return;
        }
        m2427a(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: c */
    public final void mo2297c(Bundle bundle) {
        Bundle bundle2;
        super.mo2297c(bundle);
        if (this.f2947d) {
            View view = this.f2748O;
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f2949f.setContentView(view);
            }
            FragmentActivity p = m2315p();
            if (p != null) {
                this.f2949f.setOwnerActivity(p);
            }
            this.f2949f.setCancelable(this.f2946c);
            this.f2949f.setOnCancelListener(this);
            this.f2949f.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f2949f.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: h */
    public void mo2305h() {
        super.mo2305h();
        if (this.f2949f != null) {
            this.f2950g = false;
            this.f2949f.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: d */
    public void mo2299d(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.mo2299d(bundle);
        if (this.f2949f != null && (onSaveInstanceState = this.f2949f.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        if (this.f2942a != 0) {
            bundle.putInt("android:style", this.f2942a);
        }
        if (this.f2945b != 0) {
            bundle.putInt("android:theme", this.f2945b);
        }
        if (!this.f2946c) {
            bundle.putBoolean("android:cancelable", this.f2946c);
        }
        if (!this.f2947d) {
            bundle.putBoolean("android:showsDialog", this.f2947d);
        }
        if (this.f2948e != -1) {
            bundle.putInt("android:backStackId", this.f2948e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: i */
    public void mo2307i() {
        super.mo2307i();
        if (this.f2949f != null) {
            this.f2949f.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: j */
    public final void mo2309j() {
        super.mo2309j();
        if (this.f2949f != null) {
            this.f2950g = true;
            this.f2949f.setOnDismissListener(null);
            this.f2949f.dismiss();
            if (!this.f2951h) {
                onDismiss(this.f2949f);
            }
            this.f2949f = null;
        }
    }

    /* renamed from: e */
    public final Dialog m2429e() {
        Dialog dialog = this.f2949f;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }
}
