package androidx.appcompat.widget;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

/* compiled from: ActivityChooserView.java */
/* renamed from: androidx.appcompat.widget.ah */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0189ah implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1104a;

    public ViewOnClickListenerC0189ah(ActivityChooserView activityChooserView) {
        this.f1104a = activityChooserView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        switch (((C0188ag) adapterView.getAdapter()).getItemViewType(i)) {
            case 0:
                this.f1104a.m574b();
                if (this.f1104a.f841g) {
                    if (i > 0) {
                        this.f1104a.f835a.m685e().m1004c(i);
                        return;
                    }
                    return;
                }
                if (!this.f1104a.f835a.m686f()) {
                    i++;
                }
                Intent m1001b = this.f1104a.f835a.m685e().m1001b(i);
                if (m1001b != null) {
                    m1001b.addFlags(524288);
                    this.f1104a.getContext().startActivity(m1001b);
                    return;
                }
                return;
            case 1:
                this.f1104a.m572a(Integer.MAX_VALUE);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f1104a.f837c) {
            this.f1104a.m574b();
            Intent m1001b = this.f1104a.f835a.m685e().m1001b(this.f1104a.f835a.m685e().m999a(this.f1104a.f835a.m682b()));
            if (m1001b != null) {
                m1001b.addFlags(524288);
                this.f1104a.getContext().startActivity(m1001b);
                return;
            }
            return;
        }
        if (view == this.f1104a.f836b) {
            this.f1104a.f841g = false;
            this.f1104a.m572a(this.f1104a.f842h);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view == this.f1104a.f837c) {
            if (this.f1104a.f835a.getCount() > 0) {
                this.f1104a.f841g = true;
                this.f1104a.m572a(this.f1104a.f842h);
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        if (this.f1104a.f840f != null) {
            this.f1104a.f840f.onDismiss();
        }
        if (this.f1104a.f838d != null) {
            this.f1104a.f838d.m1775a(false);
        }
    }
}
