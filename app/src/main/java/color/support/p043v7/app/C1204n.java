package color.support.p043v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.C0102q;

/* compiled from: AlertDialog.java */
/* renamed from: color.support.v7.app.n */
/* loaded from: classes.dex */
public final class C1204n extends C0102q {

    /* renamed from: a */
    private final C1213w f4993a;

    /* renamed from: b */
    private final int f4994b;

    public C1204n(Context context) {
        this(context, DialogInterfaceC1203m.m4000b(context, 0));
    }

    private C1204n(Context context, int i) {
        super(context, i);
        this.f4993a = new C1213w(new ContextThemeWrapper(context, DialogInterfaceC1203m.m4000b(context, i)));
        this.f4994b = i;
    }

    @Override // androidx.appcompat.app.C0102q
    /* renamed from: a */
    public final Context mo236a() {
        return this.f4993a.f4947a;
    }

    @Override // androidx.appcompat.app.C0102q
    /* renamed from: b */
    public final C1204n mo242a(CharSequence charSequence) {
        this.f4993a.f4952f = charSequence;
        return this;
    }

    /* renamed from: a */
    public final C1204n m4001a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f4993a.f4955i = charSequence;
        this.f4993a.f4957k = onClickListener;
        return this;
    }

    /* renamed from: b */
    public final C1204n m4004b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f4993a.f4958l = charSequence;
        this.f4993a.f4960n = onClickListener;
        return this;
    }

    /* renamed from: b */
    public final C1204n m4002b(View view) {
        this.f4993a.f4930C = view;
        this.f4993a.f4929B = 0;
        this.f4993a.f4935H = false;
        return this;
    }

    @Override // androidx.appcompat.app.C0102q
    /* renamed from: c */
    public final DialogInterfaceC1203m mo243b() {
        DialogInterfaceC1203m dialogInterfaceC1203m = new DialogInterfaceC1203m(this.f4993a.f4947a, this.f4994b);
        this.f4993a.mo3999a(dialogInterfaceC1203m.f4992b);
        dialogInterfaceC1203m.setCancelable(this.f4993a.f4964r);
        if (this.f4993a.f4964r) {
            dialogInterfaceC1203m.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC1203m.setOnCancelListener(this.f4993a.f4966t);
        dialogInterfaceC1203m.setOnDismissListener(this.f4993a.f4967u);
        if (this.f4993a.f4968v != null) {
            dialogInterfaceC1203m.setOnKeyListener(this.f4993a.f4968v);
        }
        return dialogInterfaceC1203m;
    }

    @Override // androidx.appcompat.app.C0102q
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0102q mo240a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        this.f4993a.f4972z = listAdapter;
        this.f4993a.f4928A = onClickListener;
        this.f4993a.f4939L = i;
        this.f4993a.f4938K = true;
        return this;
    }

    @Override // androidx.appcompat.app.C0102q
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0102q mo241a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        this.f4993a.f4972z = listAdapter;
        this.f4993a.f4928A = onClickListener;
        return this;
    }

    @Override // androidx.appcompat.app.C0102q
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0102q mo237a(DialogInterface.OnKeyListener onKeyListener) {
        this.f4993a.f4968v = onKeyListener;
        return this;
    }

    @Override // androidx.appcompat.app.C0102q
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0102q mo238a(Drawable drawable) {
        this.f4993a.f4950d = drawable;
        return this;
    }

    @Override // androidx.appcompat.app.C0102q
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0102q mo239a(View view) {
        this.f4993a.f4953g = view;
        return this;
    }
}
