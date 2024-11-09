package com.color.support.widget.popupwindow;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import color.support.p043v7.appcompat.R;
import com.color.support.util.C1336a;
import java.util.List;

/* compiled from: DefaultAdapter.java */
/* renamed from: com.color.support.widget.popupwindow.c */
/* loaded from: classes.dex */
public final class C1587c extends BaseAdapter {

    /* renamed from: a */
    private Context f7553a;

    /* renamed from: b */
    private List<C1589e> f7554b;

    /* renamed from: c */
    private int f7555c;

    /* renamed from: d */
    private int f7556d;

    /* renamed from: e */
    private int f7557e;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C1587c(Context context, List<C1589e> list) {
        this.f7553a = context;
        this.f7554b = list;
        Resources resources = context.getResources();
        this.f7555c = resources.getDimensionPixelSize(R.dimen.color_popup_list_padding_vertical);
        this.f7556d = resources.getDimensionPixelSize(R.dimen.color_popup_list_window_item_padding_top_and_bottom);
        this.f7557e = resources.getDimensionPixelSize(R.dimen.color_popup_list_window_item_min_height);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f7554b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f7554b.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1588d c1588d;
        Drawable m5333b;
        if (view == null) {
            C1588d c1588d2 = new C1588d();
            View inflate = LayoutInflater.from(this.f7553a).inflate(R.layout.color_popup_list_window_item, viewGroup, false);
            c1588d2.f7558a = (ImageView) inflate.findViewById(R.id.popup_list_window_item_icon);
            c1588d2.f7559b = (TextView) inflate.findViewById(R.id.popup_list_window_item_title);
            inflate.setTag(c1588d2);
            c1588d = c1588d2;
            view = inflate;
        } else {
            c1588d = (C1588d) view.getTag();
        }
        if (getCount() == 1) {
            view.setMinimumHeight(this.f7557e + (this.f7555c * 2));
            view.setPadding(0, this.f7556d + this.f7555c, 0, this.f7556d + this.f7555c);
        } else if (i == 0) {
            view.setMinimumHeight(this.f7557e + this.f7555c);
            view.setPadding(0, this.f7556d + this.f7555c, 0, this.f7556d);
        } else if (i == getCount() - 1) {
            view.setMinimumHeight(this.f7557e + this.f7555c);
            view.setPadding(0, this.f7556d, 0, this.f7556d + this.f7555c);
        } else {
            view.setMinimumHeight(this.f7557e);
            view.setPadding(0, this.f7556d, 0, this.f7556d);
        }
        boolean m5335d = this.f7554b.get(i).m5335d();
        view.setEnabled(m5335d);
        ImageView imageView = c1588d.f7558a;
        TextView textView = c1588d.f7559b;
        C1589e c1589e = this.f7554b.get(i);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (c1589e.m5332a() == 0 && c1589e.m5333b() == null) {
            imageView.setVisibility(8);
            layoutParams.leftMargin = this.f7553a.getResources().getDimensionPixelSize(R.dimen.color_popup_list_window_item_title_margin_with_no_icon);
            layoutParams.rightMargin = this.f7553a.getResources().getDimensionPixelSize(R.dimen.color_popup_list_window_item_title_margin_with_no_icon);
        } else {
            imageView.setVisibility(0);
            layoutParams.leftMargin = this.f7553a.getResources().getDimensionPixelSize(R.dimen.color_popup_list_window_item_title_margin_left);
            layoutParams.rightMargin = this.f7553a.getResources().getDimensionPixelSize(R.dimen.color_popup_list_window_item_title_margin_right);
            imageView.setEnabled(m5335d);
            if (c1589e.m5333b() == null) {
                m5333b = this.f7553a.getResources().getDrawable(c1589e.m5332a());
            } else {
                m5333b = c1589e.m5333b();
            }
            imageView.setImageDrawable(m5333b);
        }
        TextView textView2 = c1588d.f7559b;
        C1589e c1589e2 = this.f7554b.get(i);
        textView2.setEnabled(m5335d);
        textView2.setText(c1589e2.m5334c());
        textView2.setTextColor(this.f7553a.getResources().getColorStateList(R.color.color_popup_list_window_text_color_selector));
        textView2.setTextSize(0, C1336a.m4370a(this.f7553a.getResources().getDimensionPixelSize(R.dimen.color_popup_list_window_item_title_text_size), this.f7553a.getResources().getConfiguration().fontScale, 5));
        return view;
    }
}
