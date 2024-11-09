package androidx.p012c.p013a;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter.java */
/* renamed from: androidx.c.a.d */
/* loaded from: classes.dex */
final class C0333d extends Filter {

    /* renamed from: a */
    InterfaceC0334e f1526a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0333d(InterfaceC0334e interfaceC0334e) {
        this.f1526a = interfaceC0334e;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f1526a.mo936b((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo931a = this.f1526a.mo931a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo931a != null) {
            filterResults.count = mo931a.getCount();
            filterResults.values = mo931a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo1077a = this.f1526a.mo1077a();
        if (filterResults.values == null || filterResults.values == mo1077a) {
            return;
        }
        this.f1526a.mo934a((Cursor) filterResults.values);
    }
}
