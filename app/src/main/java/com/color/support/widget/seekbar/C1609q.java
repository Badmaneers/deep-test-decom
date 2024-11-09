package com.color.support.widget.seekbar;

import com.facebook.rebound.C1879j;
import com.facebook.rebound.InterfaceC1883n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.q */
/* loaded from: classes.dex */
public final class C1609q implements InterfaceC1883n {

    /* renamed from: a */
    final /* synthetic */ ColorSeekBar f7723a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1609q(ColorSeekBar colorSeekBar) {
        this.f7723a = colorSeekBar;
    }

    @Override // com.facebook.rebound.InterfaceC1883n
    /* renamed from: a */
    public final void mo3804a(C1879j c1879j) {
        float f;
        f = this.f7723a.f7676O;
        if (f != c1879j.m6022d()) {
            this.f7723a.f7676O = (float) c1879j.m6021c();
            this.f7723a.invalidate();
        }
    }
}
