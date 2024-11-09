package androidx.p012c.p013a;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import com.coloros.neton.BuildConfig;

/* compiled from: CursorAdapter.java */
/* renamed from: androidx.c.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0330a extends BaseAdapter implements Filterable, InterfaceC0334e {

    /* renamed from: a */
    protected boolean f1515a;

    /* renamed from: b */
    protected boolean f1516b;

    /* renamed from: c */
    protected Cursor f1517c;

    /* renamed from: d */
    protected Context f1518d;

    /* renamed from: e */
    protected int f1519e;

    /* renamed from: f */
    protected C0331b f1520f;

    /* renamed from: g */
    protected DataSetObserver f1521g;

    /* renamed from: h */
    protected C0333d f1522h;

    /* renamed from: i */
    protected FilterQueryProvider f1523i;

    /* renamed from: a */
    public abstract View mo932a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo935a(View view, Context context, Cursor cursor);

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Deprecated
    public AbstractC0330a(Context context, Cursor cursor) {
        m1076a(context, cursor);
    }

    public AbstractC0330a(Context context) {
        m1076a(context, null);
    }

    /* renamed from: a */
    private void m1076a(Context context, Cursor cursor) {
        this.f1516b = true;
        boolean z = cursor != null;
        this.f1517c = cursor;
        this.f1515a = z;
        this.f1518d = context;
        this.f1519e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        this.f1520f = new C0331b(this);
        this.f1521g = new C0332c(this);
        if (z) {
            if (this.f1520f != null) {
                cursor.registerContentObserver(this.f1520f);
            }
            if (this.f1521g != null) {
                cursor.registerDataSetObserver(this.f1521g);
            }
        }
    }

    @Override // androidx.p012c.p013a.InterfaceC0334e
    /* renamed from: a */
    public final Cursor mo1077a() {
        return this.f1517c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (!this.f1515a || this.f1517c == null) {
            return 0;
        }
        return this.f1517c.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (!this.f1515a || this.f1517c == null) {
            return null;
        }
        this.f1517c.moveToPosition(i);
        return this.f1517c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        if (this.f1515a && this.f1517c != null && this.f1517c.moveToPosition(i)) {
            return this.f1517c.getLong(this.f1519e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1515a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1517c.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position ".concat(String.valueOf(i)));
        }
        if (view == null) {
            view = mo932a(this.f1518d, this.f1517c, viewGroup);
        }
        mo935a(view, this.f1518d, this.f1517c);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1515a) {
            return null;
        }
        this.f1517c.moveToPosition(i);
        if (view == null) {
            view = mo1078b(this.f1518d, this.f1517c, viewGroup);
        }
        mo935a(view, this.f1518d, this.f1517c);
        return view;
    }

    /* renamed from: b */
    public View mo1078b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo932a(context, cursor, viewGroup);
    }

    /* renamed from: b */
    public CharSequence mo936b(Cursor cursor) {
        return cursor == null ? BuildConfig.FLAVOR : cursor.toString();
    }

    /* renamed from: a */
    public Cursor mo931a(CharSequence charSequence) {
        if (this.f1523i != null) {
            return this.f1523i.runQuery(charSequence);
        }
        return this.f1517c;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1522h == null) {
            this.f1522h = new C0333d(this);
        }
        return this.f1522h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m1079b() {
        if (!this.f1516b || this.f1517c == null || this.f1517c.isClosed()) {
            return;
        }
        this.f1515a = this.f1517c.requery();
    }

    /* renamed from: a */
    public void mo934a(Cursor cursor) {
        Cursor cursor2;
        if (cursor == this.f1517c) {
            cursor2 = null;
        } else {
            Cursor cursor3 = this.f1517c;
            if (cursor3 != null) {
                if (this.f1520f != null) {
                    cursor3.unregisterContentObserver(this.f1520f);
                }
                if (this.f1521g != null) {
                    cursor3.unregisterDataSetObserver(this.f1521g);
                }
            }
            this.f1517c = cursor;
            if (cursor != null) {
                if (this.f1520f != null) {
                    cursor.registerContentObserver(this.f1520f);
                }
                if (this.f1521g != null) {
                    cursor.registerDataSetObserver(this.f1521g);
                }
                this.f1519e = cursor.getColumnIndexOrThrow("_id");
                this.f1515a = true;
                notifyDataSetChanged();
            } else {
                this.f1519e = -1;
                this.f1515a = false;
                notifyDataSetInvalidated();
            }
            cursor2 = cursor3;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }
}
