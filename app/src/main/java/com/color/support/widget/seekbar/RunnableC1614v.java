package com.color.support.widget.seekbar;

import android.os.Build;

/* compiled from: ColorSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.v */
/* loaded from: classes.dex */
final class RunnableC1614v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ColorSeekBar f7728a;

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        if (Build.VERSION.SDK_INT >= 16) {
            ColorSeekBar colorSeekBar = this.f7728a;
            StringBuilder sb = new StringBuilder();
            i = this.f7728a.f7685e;
            sb.append(i);
            colorSeekBar.announceForAccessibility(sb.toString());
        }
    }
}
