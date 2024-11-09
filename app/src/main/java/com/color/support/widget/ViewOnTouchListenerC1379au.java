package com.color.support.widget;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorInstallLoadProgress.java */
/* renamed from: com.color.support.widget.au */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1379au implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ ColorInstallLoadProgress f6940a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnTouchListenerC1379au(ColorInstallLoadProgress colorInstallLoadProgress) {
        this.f6940a = colorInstallLoadProgress;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    ColorInstallLoadProgress.m4507c(this.f6940a);
                    break;
                case 1:
                    ColorInstallLoadProgress.m4499a(this.f6940a, true);
                    break;
            }
        } else {
            ColorInstallLoadProgress.m4499a(this.f6940a, false);
        }
        return true;
    }
}
