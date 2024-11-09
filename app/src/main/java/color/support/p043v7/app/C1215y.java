package color.support.p043v7.app;

import android.content.Context;
import android.database.Cursor;
import android.view.View;

/* compiled from: ColorAlertController.java */
/* renamed from: color.support.v7.app.y */
/* loaded from: classes.dex */
public final class C1215y extends C1207q {

    /* renamed from: j */
    final /* synthetic */ AlertController f5024j;

    /* renamed from: k */
    final /* synthetic */ C1213w f5025k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1215y(C1213w c1213w, Context context, Cursor cursor, int i, String str, String str2, String str3, boolean z, AlertController alertController) {
        super(context, cursor, i, str, str2, str3, z);
        this.f5025k = c1213w;
        this.f5024j = alertController;
    }

    @Override // color.support.p043v7.app.C1207q, androidx.p012c.p013a.AbstractC0330a
    /* renamed from: a */
    public final void mo935a(View view, Context context, Cursor cursor) {
        super.mo935a(view, context, cursor);
        this.f5024j.f4873e.setItemChecked(cursor.getPosition(), cursor.getInt(cursor.getColumnIndexOrThrow(this.f5025k.f4943P)) == 1);
    }
}
