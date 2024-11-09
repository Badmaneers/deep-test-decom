package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;

/* compiled from: AlertController.java */
/* renamed from: androidx.appcompat.app.o */
/* loaded from: classes.dex */
final class C0100o extends ArrayAdapter<CharSequence> {
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public C0100o(Context context, int i, CharSequence[] charSequenceArr) {
        super(context, i, R.id.text1, charSequenceArr);
    }
}
