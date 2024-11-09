package color.support.p043v7.app;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import color.support.p043v7.app.AlertController;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.g */
/* loaded from: classes.dex */
public final class C1197g extends ArrayAdapter<CharSequence> {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f4973a;

    /* renamed from: b */
    final /* synthetic */ C1196f f4974b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1197g(C1196f c1196f, Context context, int i, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, R.id.text1, charSequenceArr);
        this.f4974b = c1196f;
        this.f4973a = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (this.f4974b.f4936I != null && this.f4974b.f4936I[i]) {
            this.f4973a.setItemChecked(i, true);
        }
        return view2;
    }
}
