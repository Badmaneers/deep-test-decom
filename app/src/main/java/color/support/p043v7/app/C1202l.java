package color.support.p043v7.app;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.l */
/* loaded from: classes.dex */
final class C1202l extends ArrayAdapter<CharSequence> {

    /* renamed from: a */
    private int f4986a;

    /* renamed from: b */
    private int f4987b;

    /* renamed from: c */
    private int f4988c;

    /* renamed from: d */
    private int f4989d;

    /* renamed from: e */
    private int f4990e;

    /* renamed from: f */
    private int f4991f;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public C1202l(Context context, int i, CharSequence[] charSequenceArr) {
        super(context, i, R.id.text1, charSequenceArr);
        this.f4986a = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.alert_dialog_single_list_padding_left);
        this.f4987b = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.alert_dialog_single_list_padding_right);
        this.f4989d = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.alert_dialog_single_list_padding_vertical);
        this.f4990e = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.alert_dialog_item_padding_offset);
        this.f4988c = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.alert_dialog_single_list_padding_vertical);
        this.f4991f = context.getResources().getDimensionPixelOffset(color.support.p043v7.appcompat.R.dimen.alert_dialog_list_item_min_height);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        view2.setMinimumHeight(this.f4991f);
        view2.setPaddingRelative(this.f4986a, this.f4988c, this.f4987b, this.f4989d);
        return view2;
    }
}
