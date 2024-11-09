package color.support.p043v7.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import color.support.p043v7.app.AlertController;

/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.f */
/* loaded from: classes.dex */
public class C1196f {

    /* renamed from: A */
    public DialogInterface.OnClickListener f4928A;

    /* renamed from: B */
    public int f4929B;

    /* renamed from: C */
    public View f4930C;

    /* renamed from: D */
    public int f4931D;

    /* renamed from: E */
    public int f4932E;

    /* renamed from: F */
    public int f4933F;

    /* renamed from: G */
    public int f4934G;

    /* renamed from: I */
    public boolean[] f4936I;

    /* renamed from: J */
    public boolean f4937J;

    /* renamed from: K */
    public boolean f4938K;

    /* renamed from: M */
    public DialogInterface.OnMultiChoiceClickListener f4940M;

    /* renamed from: N */
    public Cursor f4941N;

    /* renamed from: O */
    public String f4942O;

    /* renamed from: P */
    public String f4943P;

    /* renamed from: Q */
    public AdapterView.OnItemSelectedListener f4944Q;

    /* renamed from: S */
    public int f4946S;

    /* renamed from: a */
    public final Context f4947a;

    /* renamed from: b */
    public final LayoutInflater f4948b;

    /* renamed from: d */
    public Drawable f4950d;

    /* renamed from: f */
    public CharSequence f4952f;

    /* renamed from: g */
    public View f4953g;

    /* renamed from: h */
    public CharSequence f4954h;

    /* renamed from: i */
    public CharSequence f4955i;

    /* renamed from: j */
    public Drawable f4956j;

    /* renamed from: k */
    public DialogInterface.OnClickListener f4957k;

    /* renamed from: l */
    public CharSequence f4958l;

    /* renamed from: m */
    public Drawable f4959m;

    /* renamed from: n */
    public DialogInterface.OnClickListener f4960n;

    /* renamed from: o */
    public CharSequence f4961o;

    /* renamed from: p */
    public Drawable f4962p;

    /* renamed from: q */
    public DialogInterface.OnClickListener f4963q;

    /* renamed from: s */
    public boolean f4965s;

    /* renamed from: t */
    public DialogInterface.OnCancelListener f4966t;

    /* renamed from: u */
    public DialogInterface.OnDismissListener f4967u;

    /* renamed from: v */
    public DialogInterface.OnKeyListener f4968v;

    /* renamed from: w */
    public CharSequence[] f4969w;

    /* renamed from: x */
    public CharSequence[] f4970x;

    /* renamed from: y */
    public boolean f4971y;

    /* renamed from: z */
    public ListAdapter f4972z;

    /* renamed from: c */
    public int f4949c = 0;

    /* renamed from: e */
    public int f4951e = 0;

    /* renamed from: H */
    public boolean f4935H = false;

    /* renamed from: L */
    public int f4939L = -1;

    /* renamed from: R */
    public boolean f4945R = true;

    /* renamed from: r */
    public boolean f4964r = true;

    public C1196f(Context context) {
        this.f4947a = context;
        this.f4948b = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public void mo3999a(AlertController alertController) {
        ListAdapter c1191aa;
        if (this.f4953g != null) {
            alertController.m3956a(this.f4953g);
        } else {
            if (this.f4952f != null) {
                alertController.m3959a(this.f4952f);
            }
            if (this.f4950d != null) {
                alertController.m3955a(this.f4950d);
            }
            if (this.f4949c != 0) {
                alertController.m3961b(this.f4949c);
            }
            if (this.f4951e != 0) {
                alertController.m3961b(alertController.m3965c(this.f4951e));
            }
        }
        alertController.f4892x = this.f4971y;
        if (this.f4954h != null) {
            alertController.m3964b(this.f4954h);
        }
        if (this.f4955i != null || this.f4956j != null) {
            alertController.m3954a(-1, this.f4955i, this.f4957k, (Message) null, this.f4956j);
        }
        if (this.f4958l != null || this.f4959m != null) {
            alertController.m3954a(-2, this.f4958l, this.f4960n, (Message) null, this.f4959m);
        }
        if (this.f4961o != null || this.f4962p != null) {
            alertController.m3954a(-3, this.f4961o, this.f4963q, (Message) null, this.f4962p);
        }
        if (this.f4969w != null || this.f4941N != null || this.f4972z != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) this.f4948b.inflate(alertController.f4887s, (ViewGroup) null);
            if (this.f4937J) {
                if (this.f4941N == null) {
                    c1191aa = new C1197g(this, this.f4947a, alertController.f4888t, this.f4969w, recycleListView);
                } else {
                    c1191aa = new C1198h(this, this.f4947a, this.f4941N, recycleListView, alertController);
                }
            } else if (this.f4938K) {
                int i = alertController.f4889u;
                if (this.f4941N != null) {
                    c1191aa = new SimpleCursorAdapter(this.f4947a, i, this.f4941N, new String[]{this.f4942O}, new int[]{R.id.text1});
                } else {
                    if (this.f4972z == null) {
                        c1191aa = new C1202l(this.f4947a, i, this.f4969w);
                    }
                    c1191aa = this.f4972z;
                }
            } else {
                if (this.f4972z == null) {
                    c1191aa = new C1191aa(this.f4947a, !TextUtils.isEmpty(this.f4952f), !TextUtils.isEmpty(this.f4954h), this.f4969w, this.f4970x);
                }
                c1191aa = this.f4972z;
            }
            alertController.f4884p = c1191aa;
            alertController.f4885q = this.f4939L;
            if (this.f4928A != null) {
                recycleListView.setOnItemClickListener(new C1199i(this, alertController));
            } else if (this.f4940M != null) {
                recycleListView.setOnItemClickListener(new C1200j(this, recycleListView, alertController));
            }
            if (this.f4944Q != null) {
                recycleListView.setOnItemSelectedListener(this.f4944Q);
            }
            if (this.f4938K) {
                recycleListView.setSelector(color.support.p043v7.appcompat.R.drawable.color_alert_dialog_item_background);
                recycleListView.setItemsCanFocus(false);
                recycleListView.setChoiceMode(1);
            } else if (this.f4937J) {
                recycleListView.setSelector(color.support.p043v7.appcompat.R.drawable.color_alert_dialog_item_background);
                recycleListView.setItemsCanFocus(false);
                recycleListView.setChoiceMode(2);
            }
            alertController.f4873e = recycleListView;
        }
        if (this.f4930C != null) {
            if (this.f4935H) {
                alertController.m3957a(this.f4930C, this.f4931D, this.f4932E, this.f4933F, this.f4934G);
            } else {
                alertController.m3962b(this.f4930C);
            }
        } else if (this.f4929B != 0) {
            alertController.m3953a(this.f4929B);
        }
        alertController.m3968d(this.f4946S);
        alertController.f4893y = this.f4938K;
        alertController.f4894z = this.f4937J;
        alertController.f4845A = this.f4965s;
    }
}
