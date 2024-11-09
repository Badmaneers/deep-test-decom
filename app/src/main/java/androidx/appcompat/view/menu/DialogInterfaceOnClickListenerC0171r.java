package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.R;
import androidx.appcompat.app.C0102q;
import androidx.appcompat.app.DialogInterfaceC0101p;

/* compiled from: MenuDialogHelper.java */
/* renamed from: androidx.appcompat.view.menu.r */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0171r implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, InterfaceC0145ae {

    /* renamed from: a */
    C0165l f703a;

    /* renamed from: b */
    private C0168o f704b;

    /* renamed from: c */
    private DialogInterfaceC0101p f705c;

    /* renamed from: d */
    private InterfaceC0145ae f706d;

    public DialogInterfaceOnClickListenerC0171r(C0168o c0168o) {
        this.f704b = c0168o;
    }

    /* renamed from: a */
    public final void m474a() {
        C0168o c0168o = this.f704b;
        C0102q c0102q = new C0102q(c0168o.m462f());
        this.f703a = new C0165l(c0102q.mo236a(), R.layout.abc_list_menu_item_layout);
        this.f703a.mo385a(this);
        this.f704b.m450a(this.f703a);
        c0102q.mo241a(this.f703a.m428a(), this);
        View view = c0168o.f680c;
        if (view != null) {
            c0102q.mo239a(view);
        } else {
            c0102q.mo238a(c0168o.f679b).mo242a(c0168o.f678a);
        }
        c0102q.mo237a(this);
        this.f705c = c0102q.mo243b();
        this.f705c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f705c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        this.f705c.show();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f705c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f705c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f704b.m452a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f704b.performShortcut(i, keyEvent, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f703a.mo386a(this.f704b, true);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0145ae
    /* renamed from: a */
    public final void mo171a(C0168o c0168o, boolean z) {
        if ((z || c0168o == this.f704b) && this.f705c != null) {
            this.f705c.dismiss();
        }
        if (this.f706d != null) {
            this.f706d.mo171a(c0168o, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0145ae
    /* renamed from: a */
    public final boolean mo172a(C0168o c0168o) {
        if (this.f706d != null) {
            return this.f706d.mo172a(c0168o);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f704b.m453a((C0172s) this.f703a.m428a().getItem(i), 0);
    }
}
