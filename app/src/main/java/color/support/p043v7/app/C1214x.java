package color.support.p043v7.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ColorAlertController.java */
/* renamed from: color.support.v7.app.x */
/* loaded from: classes.dex */
public final class C1214x extends C1205o {

    /* renamed from: a */
    final /* synthetic */ AlertController f5022a;

    /* renamed from: b */
    final /* synthetic */ C1213w f5023b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1214x(C1213w c1213w, Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, boolean[] zArr, AlertController alertController) {
        super(context, i, charSequenceArr, charSequenceArr2, zArr, true);
        this.f5023b = c1213w;
        this.f5022a = alertController;
    }

    @Override // color.support.p043v7.app.C1205o, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (this.f5023b.f4936I != null && this.f5023b.f4936I[i]) {
            this.f5022a.f4873e.setItemChecked(i, true);
        }
        return view2;
    }
}
