package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes.dex */
final class C0096k extends CursorAdapter {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f347a;

    /* renamed from: b */
    final /* synthetic */ AlertController f348b;

    /* renamed from: c */
    final /* synthetic */ C0094i f349c;

    /* renamed from: d */
    private final int f350d;

    /* renamed from: e */
    private final int f351e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0096k(C0094i c0094i, Context context, Cursor cursor, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, false);
        this.f349c = c0094i;
        this.f347a = recycleListView;
        this.f348b = alertController;
        Cursor cursor2 = getCursor();
        this.f350d = cursor2.getColumnIndexOrThrow(this.f349c.f315L);
        this.f351e = cursor2.getColumnIndexOrThrow(this.f349c.f316M);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f350d));
        this.f347a.setItemChecked(cursor.getPosition(), cursor.getInt(this.f351e) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f349c.f320b.inflate(this.f348b.f96m, viewGroup, false);
    }
}
