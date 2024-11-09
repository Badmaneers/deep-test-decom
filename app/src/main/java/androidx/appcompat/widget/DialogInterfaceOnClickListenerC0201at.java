package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.C0102q;
import androidx.appcompat.app.DialogInterfaceC0101p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatSpinner.java */
/* renamed from: androidx.appcompat.widget.at */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0201at implements DialogInterface.OnClickListener, InterfaceC0209ba {

    /* renamed from: a */
    DialogInterfaceC0101p f1144a;

    /* renamed from: b */
    final /* synthetic */ AppCompatSpinner f1145b;

    /* renamed from: c */
    private ListAdapter f1146c;

    /* renamed from: d */
    private CharSequence f1147d;

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: b */
    public final Drawable mo747b() {
        return null;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: c */
    public final int mo749c() {
        return 0;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: f */
    public final int mo753f() {
        return 0;
    }

    public DialogInterfaceOnClickListenerC0201at(AppCompatSpinner appCompatSpinner) {
        this.f1145b = appCompatSpinner;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: d */
    public final void mo751d() {
        if (this.f1144a != null) {
            this.f1144a.dismiss();
            this.f1144a = null;
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: e */
    public final boolean mo752e() {
        if (this.f1144a != null) {
            return this.f1144a.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: a */
    public final void mo745a(ListAdapter listAdapter) {
        this.f1146c = listAdapter;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: a */
    public final void mo746a(CharSequence charSequence) {
        this.f1147d = charSequence;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: a */
    public final CharSequence mo741a() {
        return this.f1147d;
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: a */
    public final void mo743a(int i, int i2) {
        if (this.f1146c == null) {
            return;
        }
        C0102q c0102q = new C0102q(this.f1145b.getPopupContext());
        if (this.f1147d != null) {
            c0102q.mo242a(this.f1147d);
        }
        this.f1144a = c0102q.mo240a(this.f1146c, this.f1145b.getSelectedItemPosition(), this).mo243b();
        ListView mo233a = this.f1144a.mo233a();
        if (Build.VERSION.SDK_INT >= 17) {
            mo233a.setTextDirection(i);
            mo233a.setTextAlignment(i2);
        }
        this.f1144a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1145b.setSelection(i);
        if (this.f1145b.getOnItemClickListener() != null) {
            this.f1145b.performItemClick(null, i, this.f1146c.getItemId(i));
        }
        mo751d();
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: a */
    public final void mo744a(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: a */
    public final void mo742a(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: b */
    public final void mo748b(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.InterfaceC0209ba
    /* renamed from: c */
    public final void mo750c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
