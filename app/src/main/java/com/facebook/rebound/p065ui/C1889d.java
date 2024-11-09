package com.facebook.rebound.p065ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpringConfiguratorView.java */
/* renamed from: com.facebook.rebound.ui.d */
/* loaded from: classes.dex */
public final class C1889d extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ SpringConfiguratorView f8687a;

    /* renamed from: b */
    private final Context f8688b;

    /* renamed from: c */
    private final List<String> f8689c = new ArrayList();

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C1889d(SpringConfiguratorView springConfiguratorView, Context context) {
        this.f8687a = springConfiguratorView;
        this.f8688b = context;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f8689c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f8689c.get(i);
    }

    /* renamed from: a */
    public final void m6047a(String str) {
        this.f8689c.add(str);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void m6046a() {
        this.f8689c.clear();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        int i2;
        if (view == null) {
            textView = new TextView(this.f8688b);
            textView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            int m6048a = AbstractC1891f.m6048a(12.0f, this.f8687a.getResources());
            textView.setPadding(m6048a, m6048a, m6048a, m6048a);
            i2 = this.f8687a.f8677h;
            textView.setTextColor(i2);
        } else {
            textView = (TextView) view;
        }
        textView.setText(this.f8689c.get(i));
        return textView;
    }
}
