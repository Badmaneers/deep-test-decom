package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.C0140a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ToolbarWidgetWrapper.java */
/* renamed from: androidx.appcompat.widget.dw */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0285dw implements View.OnClickListener {

    /* renamed from: a */
    final C0140a f1393a;

    /* renamed from: b */
    final /* synthetic */ C0284dv f1394b;

    public ViewOnClickListenerC0285dw(C0284dv c0284dv) {
        this.f1394b = c0284dv;
        this.f1393a = new C0140a(this.f1394b.f1376a.getContext(), this.f1394b.f1377b);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f1394b.f1378c == null || !this.f1394b.f1379d) {
            return;
        }
        this.f1394b.f1378c.onMenuItemSelected(0, this.f1393a);
    }
}
