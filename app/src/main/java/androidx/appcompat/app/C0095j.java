package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* renamed from: androidx.appcompat.app.j */
/* loaded from: classes.dex */
final class C0095j extends ArrayAdapter<CharSequence> {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f345a;

    /* renamed from: b */
    final /* synthetic */ C0094i f346b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0095j(C0094i c0094i, Context context, int i, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, R.id.text1, charSequenceArr);
        this.f346b = c0094i;
        this.f345a = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (this.f346b.f309F != null && this.f346b.f309F[i]) {
            this.f345a.setItemChecked(i, true);
        }
        return view2;
    }
}
