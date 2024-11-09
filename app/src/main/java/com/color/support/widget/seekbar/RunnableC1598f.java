package com.color.support.widget.seekbar;

import android.os.Build;

/* compiled from: ColorAbsorbSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.f */
/* loaded from: classes.dex */
final class RunnableC1598f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ColorAbsorbSeekBar f7712a;

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        if (Build.VERSION.SDK_INT >= 16) {
            ColorAbsorbSeekBar colorAbsorbSeekBar = this.f7712a;
            StringBuilder sb = new StringBuilder();
            i = this.f7712a.f7598e;
            sb.append(i);
            colorAbsorbSeekBar.announceForAccessibility(sb.toString());
        }
    }
}
