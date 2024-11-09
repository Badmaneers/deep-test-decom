package color.support.p043v7.app;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.color.support.widget.OppoCheckBox;
import java.util.HashSet;

/* compiled from: ChoiceListAdapter.java */
/* renamed from: color.support.v7.app.o */
/* loaded from: classes.dex */
class C1205o extends BaseAdapter {

    /* renamed from: a */
    private Context f4995a;

    /* renamed from: b */
    private CharSequence[] f4996b;

    /* renamed from: c */
    private CharSequence[] f4997c;

    /* renamed from: d */
    private int f4998d;

    /* renamed from: e */
    private boolean f4999e;

    /* renamed from: f */
    private HashSet<Integer> f5000f;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public C1205o(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, boolean[] zArr, boolean z) {
        this.f4999e = false;
        this.f4995a = context;
        this.f4998d = i;
        this.f4996b = charSequenceArr;
        this.f4997c = charSequenceArr2;
        this.f4999e = z;
        this.f5000f = new HashSet<>();
        if (zArr != null) {
            m4007a(zArr);
        }
    }

    public C1205o(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this(context, i, charSequenceArr, charSequenceArr2, null, false);
    }

    /* renamed from: a */
    private void m4007a(boolean[] zArr) {
        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i]) {
                this.f5000f.add(Integer.valueOf(i));
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f4996b == null) {
            return 0;
        }
        return this.f4996b.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public CharSequence getItem(int i) {
        if (this.f4996b == null) {
            return null;
        }
        return this.f4996b[i];
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C1206p c1206p;
        if (view == null) {
            c1206p = new C1206p();
            view2 = LayoutInflater.from(this.f4995a).inflate(this.f4998d, viewGroup, false);
            c1206p.f5002b = (TextView) view2.findViewById(R.id.text1);
            c1206p.f5001a = (TextView) view2.findViewById(color.support.p043v7.appcompat.R.id.summary_text2);
            if (this.f4999e) {
                c1206p.f5003c = (OppoCheckBox) view2.findViewById(color.support.p043v7.appcompat.R.id.checkbox);
            } else {
                c1206p.f5004d = (RadioButton) view2.findViewById(color.support.p043v7.appcompat.R.id.radio_button);
            }
            view2.setTag(c1206p);
        } else {
            view2 = view;
            c1206p = (C1206p) view.getTag();
        }
        if (this.f4999e) {
            c1206p.f5003c.setState(this.f5000f.contains(Integer.valueOf(i)) ? 2 : 0);
        }
        CharSequence item = getItem(i);
        CharSequence charSequence = null;
        if (this.f4997c != null && i < this.f4997c.length) {
            charSequence = this.f4997c[i];
        }
        c1206p.f5002b.setText(item);
        if (TextUtils.isEmpty(charSequence)) {
            c1206p.f5001a.setVisibility(8);
        } else {
            c1206p.f5001a.setVisibility(0);
            c1206p.f5001a.setText(charSequence);
        }
        return view2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4008a(int i, int i2, ListView listView) {
        int firstVisiblePosition = i2 - listView.getFirstVisiblePosition();
        if (firstVisiblePosition >= 0) {
            ((C1206p) listView.getChildAt(firstVisiblePosition).getTag()).f5003c.setState(i);
            if (i == 2) {
                this.f5000f.add(Integer.valueOf(i2));
            } else {
                this.f5000f.remove(Integer.valueOf(i2));
            }
        }
    }
}
