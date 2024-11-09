package color.support.p043v7.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import color.support.p043v7.app.AlertController;

/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.h */
/* loaded from: classes.dex */
final class C1198h extends CursorAdapter {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f4975a;

    /* renamed from: b */
    final /* synthetic */ AlertController f4976b;

    /* renamed from: c */
    final /* synthetic */ C1196f f4977c;

    /* renamed from: d */
    private final int f4978d;

    /* renamed from: e */
    private final int f4979e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198h(C1196f c1196f, Context context, Cursor cursor, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, false);
        this.f4977c = c1196f;
        this.f4975a = recycleListView;
        this.f4976b = alertController;
        Cursor cursor2 = getCursor();
        this.f4978d = cursor2.getColumnIndexOrThrow(this.f4977c.f4942O);
        this.f4979e = cursor2.getColumnIndexOrThrow(this.f4977c.f4943P);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f4978d));
        this.f4975a.setItemChecked(cursor.getPosition(), cursor.getInt(this.f4979e) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4977c.f4948b.inflate(this.f4976b.f4888t, viewGroup, false);
    }
}
