package color.support.p043v7.widget;

/* compiled from: ColorBaseListPopupWindow.java */
/* renamed from: color.support.v7.widget.j */
/* loaded from: classes.dex */
final class RunnableC1283j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractViewOnTouchListenerC1282i f5455a;

    private RunnableC1283j(AbstractViewOnTouchListenerC1282i abstractViewOnTouchListenerC1282i) {
        this.f5455a = abstractViewOnTouchListenerC1282i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC1283j(AbstractViewOnTouchListenerC1282i abstractViewOnTouchListenerC1282i, byte b) {
        this(abstractViewOnTouchListenerC1282i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractViewOnTouchListenerC1282i.m4229a(this.f5455a).getParent().requestDisallowInterceptTouchEvent(true);
    }
}
