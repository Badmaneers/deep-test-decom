package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertDialog.java */
/* renamed from: androidx.appcompat.app.q */
/* loaded from: classes.dex */
public class C0102q {

    /* renamed from: a */
    private final C0094i f359a;

    /* renamed from: b */
    private final int f360b;

    public C0102q(Context context) {
        this(context, DialogInterfaceC0101p.m232a(context, 0));
    }

    public C0102q(Context context, int i) {
        this.f359a = new C0094i(new ContextThemeWrapper(context, DialogInterfaceC0101p.m232a(context, i)));
        this.f360b = i;
    }

    /* renamed from: a */
    public Context mo236a() {
        return this.f359a.f319a;
    }

    /* renamed from: a */
    public C0102q mo242a(CharSequence charSequence) {
        this.f359a.f324f = charSequence;
        return this;
    }

    /* renamed from: a */
    public C0102q mo239a(View view) {
        this.f359a.f325g = view;
        return this;
    }

    /* renamed from: a */
    public C0102q mo238a(Drawable drawable) {
        this.f359a.f322d = drawable;
        return this;
    }

    /* renamed from: a */
    public C0102q mo237a(DialogInterface.OnKeyListener onKeyListener) {
        this.f359a.f339u = onKeyListener;
        return this;
    }

    /* renamed from: a */
    public C0102q mo241a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        this.f359a.f341w = listAdapter;
        this.f359a.f342x = onClickListener;
        return this;
    }

    /* renamed from: a */
    public C0102q mo240a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        this.f359a.f341w = listAdapter;
        this.f359a.f342x = onClickListener;
        this.f359a.f312I = i;
        this.f359a.f311H = true;
        return this;
    }

    /* renamed from: b */
    public DialogInterfaceC0101p mo243b() {
        int i;
        ListAdapter c0100o;
        DialogInterfaceC0101p dialogInterfaceC0101p = new DialogInterfaceC0101p(this.f359a.f319a, this.f360b);
        C0094i c0094i = this.f359a;
        AlertController alertController = dialogInterfaceC0101p.f358a;
        if (c0094i.f325g != null) {
            alertController.m57a(c0094i.f325g);
        } else {
            if (c0094i.f324f != null) {
                alertController.m59a(c0094i.f324f);
            }
            if (c0094i.f322d != null) {
                alertController.m56a(c0094i.f322d);
            }
            if (c0094i.f321c != 0) {
                alertController.m60b(c0094i.f321c);
            }
            if (c0094i.f323e != 0) {
                alertController.m60b(alertController.m63c(c0094i.f323e));
            }
        }
        if (c0094i.f326h != null) {
            alertController.m62b(c0094i.f326h);
        }
        if (c0094i.f327i != null || c0094i.f328j != null) {
            alertController.m55a(-1, c0094i.f327i, c0094i.f329k, (Message) null, c0094i.f328j);
        }
        if (c0094i.f330l != null || c0094i.f331m != null) {
            alertController.m55a(-2, c0094i.f330l, c0094i.f332n, (Message) null, c0094i.f331m);
        }
        if (c0094i.f333o != null || c0094i.f334p != null) {
            alertController.m55a(-3, c0094i.f333o, c0094i.f335q, (Message) null, c0094i.f334p);
        }
        if (c0094i.f340v != null || c0094i.f314K != null || c0094i.f341w != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) c0094i.f320b.inflate(alertController.f95l, (ViewGroup) null);
            if (c0094i.f310G) {
                if (c0094i.f314K == null) {
                    c0100o = new C0095j(c0094i, c0094i.f319a, alertController.f96m, c0094i.f340v, recycleListView);
                } else {
                    c0100o = new C0096k(c0094i, c0094i.f319a, c0094i.f314K, recycleListView, alertController);
                }
            } else {
                if (c0094i.f311H) {
                    i = alertController.f97n;
                } else {
                    i = alertController.f98o;
                }
                int i2 = i;
                if (c0094i.f314K != null) {
                    c0100o = new SimpleCursorAdapter(c0094i.f319a, i2, c0094i.f314K, new String[]{c0094i.f315L}, new int[]{R.id.text1});
                } else if (c0094i.f341w != null) {
                    c0100o = c0094i.f341w;
                } else {
                    c0100o = new C0100o(c0094i.f319a, i2, c0094i.f340v);
                }
            }
            alertController.f93j = c0100o;
            alertController.f94k = c0094i.f312I;
            if (c0094i.f342x != null) {
                recycleListView.setOnItemClickListener(new C0097l(c0094i, alertController));
            } else if (c0094i.f313J != null) {
                recycleListView.setOnItemClickListener(new C0098m(c0094i, recycleListView, alertController));
            }
            if (c0094i.f317N != null) {
                recycleListView.setOnItemSelectedListener(c0094i.f317N);
            }
            if (c0094i.f311H) {
                recycleListView.setChoiceMode(1);
            } else if (c0094i.f310G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f85b = recycleListView;
        }
        if (c0094i.f344z != null) {
            if (c0094i.f308E) {
                alertController.m58a(c0094i.f344z, c0094i.f304A, c0094i.f305B, c0094i.f306C, c0094i.f307D);
            } else {
                alertController.m61b(c0094i.f344z);
            }
        } else if (c0094i.f343y != 0) {
            alertController.m54a(c0094i.f343y);
        }
        dialogInterfaceC0101p.setCancelable(this.f359a.f336r);
        if (this.f359a.f336r) {
            dialogInterfaceC0101p.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC0101p.setOnCancelListener(this.f359a.f337s);
        dialogInterfaceC0101p.setOnDismissListener(this.f359a.f338t);
        if (this.f359a.f339u != null) {
            dialogInterfaceC0101p.setOnKeyListener(this.f359a.f339u);
        }
        return dialogInterfaceC0101p;
    }
}
