package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchView.java */
/* renamed from: androidx.appcompat.widget.cu */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0256cu implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f1310a;

    public ViewOnClickListenerC0256cu(SearchView searchView) {
        this.f1310a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f1310a.f966b) {
            this.f1310a.m623f();
            return;
        }
        if (view == this.f1310a.f968d) {
            this.f1310a.m622e();
            return;
        }
        if (view == this.f1310a.f967c) {
            this.f1310a.m621d();
        } else if (view == this.f1310a.f969e) {
            this.f1310a.m624g();
        } else if (view == this.f1310a.f963a) {
            this.f1310a.m627k();
        }
    }
}
