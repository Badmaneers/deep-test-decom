package color.support.p043v7.internal.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.u */
/* loaded from: classes.dex */
public final class RunnableC1254u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ColorSpinner f5278a;

    public RunnableC1254u(ColorSpinner colorSpinner) {
        this.f5278a = colorSpinner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5278a.requestLayout();
    }
}
