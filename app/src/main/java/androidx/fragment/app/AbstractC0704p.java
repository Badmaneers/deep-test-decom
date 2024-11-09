package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.p023f.C0478i;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public abstract class AbstractC0704p<E> extends AbstractC0701m {

    /* renamed from: a */
    private final Activity f2979a;

    /* renamed from: b */
    final LayoutInflaterFactory2C0707s f2980b;

    /* renamed from: c */
    private final Context f2981c;

    /* renamed from: d */
    private final Handler f2982d;

    /* renamed from: e */
    private final int f2983e;

    @Override // androidx.fragment.app.AbstractC0701m
    /* renamed from: a */
    public View mo2431a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo2433a(String str, PrintWriter printWriter, String[] strArr) {
    }

    @Override // androidx.fragment.app.AbstractC0701m
    /* renamed from: b_ */
    public boolean mo2432b_() {
        return true;
    }

    /* renamed from: d */
    public boolean mo2434d() {
        return true;
    }

    /* renamed from: f */
    public void mo2436f() {
    }

    /* renamed from: g */
    public boolean mo2437g() {
        return true;
    }

    /* renamed from: i */
    public abstract E mo2439i();

    public AbstractC0704p(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler());
    }

    private AbstractC0704p(Activity activity, Context context, Handler handler) {
        this.f2980b = new LayoutInflaterFactory2C0707s();
        this.f2979a = activity;
        this.f2981c = (Context) C0478i.m1621a(context, "context == null");
        this.f2982d = (Handler) C0478i.m1621a(handler, "handler == null");
        this.f2983e = 0;
    }

    /* renamed from: e */
    public LayoutInflater mo2435e() {
        return LayoutInflater.from(this.f2981c);
    }

    /* renamed from: h */
    public int mo2438h() {
        return this.f2983e;
    }

    /* renamed from: j */
    public final Activity m2469j() {
        return this.f2979a;
    }

    /* renamed from: k */
    public final Context m2470k() {
        return this.f2981c;
    }

    /* renamed from: l */
    public final Handler m2471l() {
        return this.f2982d;
    }
}
