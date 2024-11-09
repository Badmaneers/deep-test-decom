package color.support.p043v7.internal.widget;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import color.support.p041a.p042a.C1154b;

/* compiled from: ColorBaseSpinner.java */
/* renamed from: color.support.v7.internal.widget.k */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC1244k implements DialogInterface.OnClickListener, InterfaceC1251r {

    /* renamed from: a */
    final /* synthetic */ ColorBaseSpinner f5259a;

    /* renamed from: b */
    private AlertDialog f5260b;

    /* renamed from: c */
    private ListAdapter f5261c;

    /* renamed from: d */
    private CharSequence f5262d;

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: d */
    public final Drawable mo4089d() {
        return null;
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: e */
    public final int mo4090e() {
        return 0;
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: f */
    public final int mo4091f() {
        return 0;
    }

    private DialogInterfaceOnClickListenerC1244k(ColorBaseSpinner colorBaseSpinner) {
        this.f5259a = colorBaseSpinner;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ DialogInterfaceOnClickListenerC1244k(ColorBaseSpinner colorBaseSpinner, byte b) {
        this(colorBaseSpinner);
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: a */
    public final void mo4081a() {
        if (this.f5260b != null) {
            this.f5260b.dismiss();
            this.f5260b = null;
        }
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: b */
    public final boolean mo4087b() {
        if (this.f5260b != null) {
            return this.f5260b.isShowing();
        }
        return false;
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: a */
    public final void mo4084a(ListAdapter listAdapter) {
        this.f5261c = listAdapter;
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: a */
    public final void mo4085a(CharSequence charSequence) {
        this.f5262d = charSequence;
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: c */
    public final CharSequence mo4088c() {
        return this.f5262d;
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: a */
    public final void mo4083a(int i, int i2) {
        if (this.f5261c == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f5259a.getContext());
        if (this.f5262d != null) {
            builder.setTitle(this.f5262d);
        }
        this.f5260b = builder.setSingleChoiceItems(this.f5261c, this.f5259a.getSelectedItemPosition(), this).create();
        C1154b.m3810a(this.f5260b.getListView(), i2);
        this.f5260b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5259a.setSelection(i);
        if (this.f5259a.f5091s != null) {
            ColorBaseSpinner colorBaseSpinner = this.f5259a;
            this.f5261c.getItemId(i);
            colorBaseSpinner.m4019a((View) null);
        }
        mo4081a();
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: a */
    public final void mo4082a(int i) {
        Log.e("ColorBaseSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // color.support.p043v7.internal.widget.InterfaceC1251r
    /* renamed from: b */
    public final void mo4086b(int i) {
        Log.e("ColorBaseSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }
}
