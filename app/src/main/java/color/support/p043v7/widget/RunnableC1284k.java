package color.support.p043v7.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBaseListPopupWindow.java */
/* renamed from: color.support.v7.widget.k */
/* loaded from: classes.dex */
public final class RunnableC1284k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractViewOnTouchListenerC1282i f5456a;

    private RunnableC1284k(AbstractViewOnTouchListenerC1282i abstractViewOnTouchListenerC1282i) {
        this.f5456a = abstractViewOnTouchListenerC1282i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC1284k(AbstractViewOnTouchListenerC1282i abstractViewOnTouchListenerC1282i, byte b) {
        this(abstractViewOnTouchListenerC1282i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractViewOnTouchListenerC1282i.m4232b(this.f5456a);
    }
}
