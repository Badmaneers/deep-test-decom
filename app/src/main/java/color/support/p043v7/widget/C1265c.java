package color.support.p043v7.widget;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.C0168o;

/* compiled from: ColorActionMenuViewV6.java */
/* renamed from: color.support.v7.widget.c */
/* loaded from: classes.dex */
final class C1265c implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnClickListenerC1264b f5362a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1265c(ViewOnClickListenerC1264b viewOnClickListenerC1264b) {
        this.f5362a = viewOnClickListenerC1264b;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0168o c0168o;
        C0168o c0168o2;
        c0168o = this.f5362a.f5361b.f5294d;
        c0168o2 = this.f5362a.f5361b.f5294d;
        c0168o.m453a(c0168o2.m471o().get(i), 0);
        this.f5362a.f5361b.f5293c.dismiss();
    }
}
