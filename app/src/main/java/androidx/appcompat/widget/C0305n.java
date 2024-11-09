package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.C0142ab;
import androidx.appcompat.view.menu.C0168o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionMenuPresenter.java */
/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes.dex */
public final class C0305n extends C0142ab {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f1430a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0305n(ActionMenuPresenter actionMenuPresenter, Context context, C0168o c0168o, View view) {
        super(context, c0168o, view, true, R.attr.actionOverflowMenuStyle);
        this.f1430a = actionMenuPresenter;
        m372a();
        m375a(actionMenuPresenter.f804k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.C0142ab
    /* renamed from: f */
    public final void mo382f() {
        C0168o c0168o;
        C0168o c0168o2;
        c0168o = this.f1430a.f610c;
        if (c0168o != null) {
            c0168o2 = this.f1430a.f610c;
            c0168o2.close();
        }
        this.f1430a.f801h = null;
        super.mo382f();
    }
}
