package color.support.p043v7.app;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: ColorAlertController.java */
/* renamed from: color.support.v7.app.u */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1211u implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ TextView f5018a;

    /* renamed from: b */
    final /* synthetic */ ColorAlertController f5019b;

    public ViewTreeObserverOnGlobalLayoutListenerC1211u(ColorAlertController colorAlertController, TextView textView) {
        this.f5019b = colorAlertController;
        this.f5018a = textView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.f5018a.getLineCount() > 1) {
            this.f5018a.setTextAlignment(2);
        } else {
            this.f5018a.setTextAlignment(4);
        }
        this.f5018a.setText(this.f5018a.getText());
        this.f5018a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
