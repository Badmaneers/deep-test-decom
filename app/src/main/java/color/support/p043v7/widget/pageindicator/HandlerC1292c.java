package color.support.p043v7.widget.pageindicator;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorPageIndicator.java */
/* renamed from: color.support.v7.widget.pageindicator.c */
/* loaded from: classes.dex */
public final class HandlerC1292c extends Handler {

    /* renamed from: a */
    final /* synthetic */ ColorPageIndicator f5495a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC1292c(ColorPageIndicator colorPageIndicator) {
        this.f5495a = colorPageIndicator;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 17) {
            ColorPageIndicator.m4252l(this.f5495a);
        }
        super.handleMessage(message);
    }
}
