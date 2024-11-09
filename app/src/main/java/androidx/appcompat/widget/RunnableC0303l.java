package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.C0168o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionMenuPresenter.java */
/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes.dex */
public final class RunnableC0303l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f1426a;

    /* renamed from: b */
    private C0305n f1427b;

    public RunnableC0303l(ActionMenuPresenter actionMenuPresenter, C0305n c0305n) {
        this.f1426a = actionMenuPresenter;
        this.f1427b = c0305n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0168o c0168o;
        Object obj;
        C0168o c0168o2;
        c0168o = this.f1426a.f610c;
        if (c0168o != null) {
            c0168o2 = this.f1426a.f610c;
            c0168o2.m463g();
        }
        obj = this.f1426a.f613f;
        View view = (View) obj;
        if (view != null && view.getWindowToken() != null && this.f1427b.m380d()) {
            this.f1426a.f801h = this.f1427b;
        }
        this.f1426a.f803j = null;
    }
}
