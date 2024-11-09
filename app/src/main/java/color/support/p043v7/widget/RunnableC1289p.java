package color.support.p043v7.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBaseListPopupWindow.java */
/* renamed from: color.support.v7.widget.p */
/* loaded from: classes.dex */
public final class RunnableC1289p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1277d f5461a;

    private RunnableC1289p(C1277d c1277d) {
        this.f5461a = c1277d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC1289p(C1277d c1277d, byte b) {
        this(c1277d);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C1277d.m4199a(this.f5461a) == null || C1277d.m4199a(this.f5461a).getCount() <= C1277d.m4199a(this.f5461a).getChildCount() || C1277d.m4199a(this.f5461a).getChildCount() > this.f5461a.f5413d) {
            return;
        }
        this.f5461a.f5412c.setInputMethodMode(2);
        this.f5461a.mo4108h();
    }
}
