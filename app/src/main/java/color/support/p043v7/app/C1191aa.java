package color.support.p043v7.app;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import color.support.p043v7.appcompat.R;

/* compiled from: SummaryAdapter.java */
/* renamed from: color.support.v7.app.aa */
/* loaded from: classes.dex */
public final class C1191aa extends BaseAdapter {

    /* renamed from: a */
    private static final int f4910a = R.layout.color_alert_dialog_summary_item;

    /* renamed from: b */
    private boolean f4911b;

    /* renamed from: c */
    private boolean f4912c;

    /* renamed from: d */
    private Context f4913d;

    /* renamed from: e */
    private CharSequence[] f4914e;

    /* renamed from: f */
    private CharSequence[] f4915f;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public C1191aa(Context context, boolean z, boolean z2, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this.f4911b = z;
        this.f4912c = z2;
        this.f4913d = context;
        this.f4914e = charSequenceArr;
        this.f4915f = charSequenceArr2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f4913d).inflate(f4910a, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(android.R.id.text1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.summary_text2);
        CharSequence item = getItem(i);
        CharSequence charSequence = null;
        if (this.f4915f != null && i < this.f4915f.length) {
            charSequence = this.f4915f[i];
        }
        textView.setText(item);
        if (TextUtils.isEmpty(charSequence)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(charSequence);
        }
        int dimensionPixelSize = this.f4913d.getResources().getDimensionPixelSize(R.dimen.alert_dialog_item_padding_offset);
        int paddingTop = inflate.getPaddingTop();
        int paddingLeft = inflate.getPaddingLeft();
        int paddingBottom = inflate.getPaddingBottom();
        int paddingRight = inflate.getPaddingRight();
        if (getCount() > 1) {
            if (i != getCount() - 1) {
                if (!this.f4911b && !this.f4912c) {
                    if (i == 0) {
                        inflate.setPadding(paddingLeft, paddingTop + dimensionPixelSize, paddingRight, paddingBottom);
                        inflate.setMinimumHeight(inflate.getMinimumHeight() + dimensionPixelSize);
                    } else {
                        inflate.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                    }
                }
            }
            inflate.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom + dimensionPixelSize);
            inflate.setMinimumHeight(inflate.getMinimumHeight() + dimensionPixelSize);
        } else if (getCount() == 1) {
            if (!this.f4911b && !this.f4912c) {
                inflate.setPadding(paddingLeft, paddingTop + dimensionPixelSize, paddingRight, paddingBottom + dimensionPixelSize);
                inflate.setMinimumHeight(inflate.getMinimumHeight() + (dimensionPixelSize * 2));
            }
            inflate.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom + dimensionPixelSize);
            inflate.setMinimumHeight(inflate.getMinimumHeight() + dimensionPixelSize);
        }
        return inflate;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f4914e == null) {
            return 0;
        }
        return this.f4914e.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public CharSequence getItem(int i) {
        if (this.f4914e == null) {
            return null;
        }
        return this.f4914e[i];
    }
}
