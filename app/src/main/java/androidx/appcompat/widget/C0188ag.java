package androidx.appcompat.widget;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;

/* compiled from: ActivityChooserView.java */
/* renamed from: androidx.appcompat.widget.ag */
/* loaded from: classes.dex */
public final class C0188ag extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1098a;

    /* renamed from: b */
    private C0313v f1099b;

    /* renamed from: c */
    private int f1100c = 4;

    /* renamed from: d */
    private boolean f1101d;

    /* renamed from: e */
    private boolean f1102e;

    /* renamed from: f */
    private boolean f1103f;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }

    public C0188ag(ActivityChooserView activityChooserView) {
        this.f1098a = activityChooserView;
    }

    /* renamed from: a */
    public final void m679a(C0313v c0313v) {
        C0313v c0313v2 = this.f1098a.f835a.f1099b;
        if (c0313v2 != null && this.f1098a.isShown()) {
            c0313v2.unregisterObserver(this.f1098a.f839e);
        }
        this.f1099b = c0313v;
        if (c0313v != null && this.f1098a.isShown()) {
            c0313v.registerObserver(this.f1098a.f839e);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return (this.f1103f && i == getCount() - 1) ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int m998a = this.f1099b.m998a();
        if (!this.f1101d && this.f1099b.m1002b() != null) {
            m998a--;
        }
        int min = Math.min(m998a, this.f1100c);
        return this.f1103f ? min + 1 : min;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        switch (getItemViewType(i)) {
            case 0:
                if (!this.f1101d && this.f1099b.m1002b() != null) {
                    i++;
                }
                return this.f1099b.m1000a(i);
            case 1:
                return null;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        switch (getItemViewType(i)) {
            case 0:
                if (view == null || view.getId() != R.id.list_item) {
                    view = LayoutInflater.from(this.f1098a.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = this.f1098a.getContext().getPackageManager();
                ImageView imageView = (ImageView) view.findViewById(R.id.icon);
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
                if (this.f1101d && i == 0 && this.f1102e) {
                    view.setActivated(true);
                } else {
                    view.setActivated(false);
                }
                return view;
            case 1:
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View inflate = LayoutInflater.from(this.f1098a.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(R.id.title)).setText(this.f1098a.getContext().getString(R.string.abc_activity_chooser_view_see_all));
                return inflate;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final int m677a() {
        int i = this.f1100c;
        this.f1100c = Integer.MAX_VALUE;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = getCount();
        int i2 = 0;
        View view = null;
        for (int i3 = 0; i3 < count; i3++) {
            view = getView(i3, view, null);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        this.f1100c = i;
        return i2;
    }

    /* renamed from: a */
    public final void m678a(int i) {
        if (this.f1100c != i) {
            this.f1100c = i;
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final ResolveInfo m682b() {
        return this.f1099b.m1002b();
    }

    /* renamed from: a */
    public final void m680a(boolean z) {
        if (this.f1103f != z) {
            this.f1103f = z;
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public final int m683c() {
        return this.f1099b.m998a();
    }

    /* renamed from: d */
    public final int m684d() {
        return this.f1099b.m1003c();
    }

    /* renamed from: e */
    public final C0313v m685e() {
        return this.f1099b;
    }

    /* renamed from: a */
    public final void m681a(boolean z, boolean z2) {
        if (this.f1101d == z && this.f1102e == z2) {
            return;
        }
        this.f1101d = z;
        this.f1102e = z2;
        notifyDataSetChanged();
    }

    /* renamed from: f */
    public final boolean m686f() {
        return this.f1101d;
    }
}
