package com.color.support.widget.slideselect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import color.support.p043v7.appcompat.R;
import java.util.ArrayList;

/* compiled from: SlideSelectorAdapter.java */
/* renamed from: com.color.support.widget.slideselect.h */
/* loaded from: classes.dex */
public final class C1625h extends ArrayAdapter<String> {

    /* renamed from: a */
    private ArrayList<String> f7772a;

    /* renamed from: b */
    private Context f7773b;

    /* renamed from: c */
    private int f7774c;

    /* renamed from: d */
    private int f7775d;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public C1625h(Context context, int i, ArrayList<String> arrayList, Integer num, Integer num2) {
        super(context, i, arrayList);
        this.f7772a = arrayList;
        this.f7773b = context;
        this.f7774c = num.intValue();
        this.f7775d = num2.intValue();
    }

    /* renamed from: a */
    public final void m5437a(Integer num) {
        this.f7774c = num.intValue();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.f7772a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1626i c1626i;
        if (view == null) {
            view = ((LayoutInflater) this.f7773b.getSystemService("layout_inflater")).inflate(R.layout.secletor_list_item, viewGroup, false);
            c1626i = new C1626i(this, (byte) 0);
            c1626i.f7776a = (TextView) view.findViewById(R.id.selection_item);
            view.setTag(c1626i);
        } else {
            c1626i = (C1626i) view.getTag();
        }
        if (c1626i != null) {
            c1626i.f7776a.setText(this.f7772a.get(i));
            if (this.f7774c > 0) {
                view.setMinimumHeight(this.f7774c);
            }
            if (this.f7775d > 0) {
                c1626i.f7776a.setTextSize(this.f7775d);
            }
        }
        return view;
    }
}
