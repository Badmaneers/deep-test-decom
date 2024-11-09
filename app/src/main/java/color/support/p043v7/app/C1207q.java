package color.support.p043v7.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.p012c.p013a.AbstractC0330a;
import com.color.support.widget.OppoCheckBox;
import java.util.HashSet;

/* compiled from: ChoiceListCursorAdapter.java */
/* renamed from: color.support.v7.app.q */
/* loaded from: classes.dex */
class C1207q extends AbstractC0330a {

    /* renamed from: j */
    private int f5005j;

    /* renamed from: k */
    private boolean f5006k;

    /* renamed from: l */
    private HashSet<Integer> f5007l;

    /* renamed from: m */
    private int f5008m;

    /* renamed from: n */
    private int f5009n;

    /* renamed from: o */
    private int f5010o;

    /* renamed from: p */
    private String f5011p;

    /* renamed from: q */
    private String f5012q;

    /* renamed from: r */
    private String f5013r;

    public C1207q(Context context, Cursor cursor, int i, String str, String str2) {
        this(context, cursor, i, str, null, str2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:            if (r2.getInt(r0.f5009n) != 1) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:            r0.f5007l.add(java.lang.Integer.valueOf(r2.getPosition()));     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:            if (r2.moveToNext() != false) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:            if (r2.moveToFirst() != false) goto L10;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1207q(android.content.Context r1, android.database.Cursor r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f5006k = r7
            r0.f5011p = r4
            r0.f5013r = r6
            r0.f5012q = r5
            r0.f5005j = r3
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.f5007l = r1
            java.lang.String r1 = r0.f5011p
            int r1 = r2.getColumnIndexOrThrow(r1)
            r0.f5008m = r1
            java.lang.String r1 = r0.f5013r
            if (r1 == 0) goto L28
            java.lang.String r1 = r0.f5013r
            int r1 = r2.getColumnIndexOrThrow(r1)
            r0.f5010o = r1
        L28:
            if (r7 == 0) goto L59
            java.lang.String r1 = r0.f5012q
            int r1 = r2.getColumnIndexOrThrow(r1)
            r0.f5009n = r1
            if (r2 == 0) goto L56
            boolean r1 = r2.moveToFirst()
            if (r1 == 0) goto L56
        L3a:
            int r1 = r0.f5009n
            int r1 = r2.getInt(r1)
            r3 = 1
            if (r1 != r3) goto L50
            java.util.HashSet<java.lang.Integer> r1 = r0.f5007l
            int r3 = r2.getPosition()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
        L50:
            boolean r1 = r2.moveToNext()
            if (r1 != 0) goto L3a
        L56:
            r2.moveToFirst()
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: color.support.p043v7.app.C1207q.<init>(android.content.Context, android.database.Cursor, int, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    private C1207q(Context context, Cursor cursor) {
        super(context, cursor);
        this.f5006k = false;
        this.f5009n = 0;
    }

    @Override // androidx.p012c.p013a.AbstractC0330a
    /* renamed from: a */
    public final View mo932a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f5005j, viewGroup, false);
    }

    @Override // androidx.p012c.p013a.AbstractC0330a
    /* renamed from: a */
    public void mo935a(View view, Context context, Cursor cursor) {
        TextView textView = (TextView) view.findViewById(R.id.text1);
        TextView textView2 = (TextView) view.findViewById(color.support.p043v7.appcompat.R.id.summary_text2);
        int i = this.f5007l.contains(Integer.valueOf(cursor.getPosition())) ? 2 : 0;
        if (this.f5006k) {
            ((OppoCheckBox) view.findViewById(color.support.p043v7.appcompat.R.id.checkbox)).setState(i);
        }
        textView.setText(cursor.getString(this.f5008m));
        if (this.f5013r == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(cursor.getString(this.f5010o));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4009a(int i, int i2, ListView listView) {
        int firstVisiblePosition = i2 - listView.getFirstVisiblePosition();
        if (firstVisiblePosition >= 0) {
            ((OppoCheckBox) listView.getChildAt(firstVisiblePosition).findViewById(color.support.p043v7.appcompat.R.id.checkbox)).setState(i);
            if (i == 2) {
                this.f5007l.add(Integer.valueOf(i2));
            } else {
                this.f5007l.remove(Integer.valueOf(i2));
            }
        }
    }
}
