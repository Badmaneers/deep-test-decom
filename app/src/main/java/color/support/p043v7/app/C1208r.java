package color.support.p043v7.app;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorAlertController.java */
/* renamed from: color.support.v7.app.r */
/* loaded from: classes.dex */
public final class C1208r extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ ColorAlertController f5014a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208r(ColorAlertController colorAlertController, Handler handler) {
        super(handler);
        this.f5014a = colorAlertController;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Context context;
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        context = this.f5014a.f4900C;
        if (Settings.Secure.getInt(context.getContentResolver(), "manual_hide_navigationbar", -1) == 0) {
            handler3 = this.f5014a.f4901D;
            handler4 = this.f5014a.f4901D;
            handler3.sendMessage(Message.obtain(handler4, 1, this.f5014a));
        } else {
            handler = this.f5014a.f4901D;
            handler2 = this.f5014a.f4901D;
            handler.sendMessage(Message.obtain(handler2, 2, this.f5014a));
        }
    }
}
