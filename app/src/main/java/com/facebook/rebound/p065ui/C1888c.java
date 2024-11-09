package com.facebook.rebound.p065ui;

import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.rebound.C1877h;
import com.facebook.rebound.C1881l;
import java.text.DecimalFormat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpringConfiguratorView.java */
/* renamed from: com.facebook.rebound.ui.c */
/* loaded from: classes.dex */
public final class C1888c implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ SpringConfiguratorView f8686a;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    private C1888c(SpringConfiguratorView springConfiguratorView) {
        this.f8686a = springConfiguratorView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1888c(SpringConfiguratorView springConfiguratorView, byte b) {
        this(springConfiguratorView);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar seekBar2;
        SeekBar seekBar3;
        C1881l c1881l;
        DecimalFormat decimalFormat;
        TextView textView;
        C1881l c1881l2;
        DecimalFormat decimalFormat2;
        TextView textView2;
        seekBar2 = this.f8686a.f8678i;
        if (seekBar == seekBar2) {
            c1881l2 = this.f8686a.f8683n;
            double d = ((i * 200.0f) / 100000.0f) + 0.0f;
            c1881l2.f8666b = C1877h.m6012a(d);
            decimalFormat2 = SpringConfiguratorView.f8670a;
            String format = decimalFormat2.format(d);
            textView2 = this.f8686a.f8682m;
            textView2.setText("T:".concat(String.valueOf(format)));
        }
        seekBar3 = this.f8686a.f8679j;
        if (seekBar == seekBar3) {
            float f = ((i * 50.0f) / 100000.0f) + 0.0f;
            c1881l = this.f8686a.f8683n;
            double d2 = f;
            c1881l.f8665a = C1877h.m6013b(d2);
            decimalFormat = SpringConfiguratorView.f8670a;
            String format2 = decimalFormat.format(d2);
            textView = this.f8686a.f8681l;
            textView.setText("F:".concat(String.valueOf(format2)));
        }
    }
}
