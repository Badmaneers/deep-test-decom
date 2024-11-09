package com.coloros.deeptesting.activity;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import com.coloros.deeptesting.R;
import com.coloros.deeptesting.p064a.C1842h;

/* compiled from: MainActivity.java */
/* renamed from: com.coloros.deeptesting.activity.g */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1851g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MainActivity f8603a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1851g(MainActivity mainActivity) {
        this.f8603a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        Handler handler;
        i = this.f8603a.f8582j;
        switch (i) {
            case -2:
                this.f8603a.f8583k = 12;
                MainActivity mainActivity = this.f8603a;
                String string = this.f8603a.getString(R.string.dialog_exittest);
                String string2 = this.f8603a.getString(R.string.dialog_locktext);
                handler = this.f8603a.f8587o;
                C1842h.m5958a(mainActivity, string, string2, handler);
                return;
            case -1:
                this.f8603a.startActivity(new Intent(this.f8603a, (Class<?>) ApplyActivity.class));
                return;
            case 0:
                C1842h.m5958a(this.f8603a, this.f8603a.getString(R.string.dialog_exittest), this.f8603a.getString(R.string.dialog_unlocktext), null);
                return;
            default:
                this.f8603a.m5981i();
                return;
        }
    }
}
