package color.support.p043v7.widget.pageindicator;

import android.view.View;

/* compiled from: ColorPageIndicator.java */
/* renamed from: color.support.v7.widget.pageindicator.e */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1294e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f5497a;

    /* renamed from: b */
    final /* synthetic */ ColorPageIndicator f5498b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1294e(ColorPageIndicator colorPageIndicator, int i) {
        this.f5498b = colorPageIndicator;
        this.f5497a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1295f interfaceC1295f;
        InterfaceC1295f unused;
        interfaceC1295f = this.f5498b.f5466E;
        if (interfaceC1295f != null) {
            this.f5498b.f5488v = true;
            this.f5498b.f5484r = false;
            this.f5498b.m4256a();
            unused = this.f5498b.f5466E;
        }
    }
}
