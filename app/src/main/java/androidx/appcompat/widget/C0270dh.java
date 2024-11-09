package androidx.appcompat.widget;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: SuggestionsAdapter.java */
/* renamed from: androidx.appcompat.widget.dh */
/* loaded from: classes.dex */
final class C0270dh {

    /* renamed from: a */
    public final TextView f1342a;

    /* renamed from: b */
    public final TextView f1343b;

    /* renamed from: c */
    public final ImageView f1344c;

    /* renamed from: d */
    public final ImageView f1345d;

    /* renamed from: e */
    public final ImageView f1346e;

    public C0270dh(View view) {
        this.f1342a = (TextView) view.findViewById(R.id.text1);
        this.f1343b = (TextView) view.findViewById(R.id.text2);
        this.f1344c = (ImageView) view.findViewById(R.id.icon1);
        this.f1345d = (ImageView) view.findViewById(R.id.icon2);
        this.f1346e = (ImageView) view.findViewById(androidx.appcompat.R.id.edit_query);
    }
}
