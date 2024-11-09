package com.color.support.widget.seekbar;

import com.facebook.rebound.C1879j;
import com.facebook.rebound.InterfaceC1883n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorAbsorbSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.a */
/* loaded from: classes.dex */
public final class C1593a implements InterfaceC1883n {

    /* renamed from: a */
    final /* synthetic */ ColorAbsorbSeekBar f7707a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1593a(ColorAbsorbSeekBar colorAbsorbSeekBar) {
        this.f7707a = colorAbsorbSeekBar;
    }

    @Override // com.facebook.rebound.InterfaceC1883n
    /* renamed from: a */
    public final void mo3804a(C1879j c1879j) {
        float f;
        f = this.f7707a.f7583C;
        if (f != c1879j.m6022d()) {
            if (!this.f7707a.isEnabled()) {
                this.f7707a.f7583C = 0.0f;
                this.f7707a.invalidate();
            } else {
                this.f7707a.f7583C = (float) c1879j.m6021c();
                this.f7707a.invalidate();
            }
        }
    }
}
