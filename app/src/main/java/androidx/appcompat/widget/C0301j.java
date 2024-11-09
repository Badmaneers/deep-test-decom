package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.C0142ab;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.SubMenuC0153am;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionMenuPresenter.java */
/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public final class C0301j extends C0142ab {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f1424a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0301j(ActionMenuPresenter actionMenuPresenter, Context context, SubMenuC0153am subMenuC0153am, View view) {
        super(context, subMenuC0153am, view, false, R.attr.actionOverflowMenuStyle);
        View view2;
        Object obj;
        this.f1424a = actionMenuPresenter;
        if (!((C0172s) subMenuC0153am.getItem()).m492g()) {
            if (actionMenuPresenter.f800g == null) {
                obj = actionMenuPresenter.f613f;
                view2 = (View) obj;
            } else {
                view2 = actionMenuPresenter.f800g;
            }
            m373a(view2);
        }
        m375a(actionMenuPresenter.f804k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.C0142ab
    /* renamed from: f */
    public final void mo382f() {
        this.f1424a.f802i = null;
        this.f1424a.f805l = 0;
        super.mo382f();
    }
}
