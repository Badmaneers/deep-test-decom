package com.color.support.widget;

import android.graphics.Rect;
import com.color.support.p048c.p049a.InterfaceC1311b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLoadingView.java */
/* renamed from: com.color.support.widget.bh */
/* loaded from: classes.dex */
public final class C1393bh implements InterfaceC1311b {

    /* renamed from: a */
    final /* synthetic */ ColorLoadingView f6957a;

    /* renamed from: b */
    private int f6958b = -1;

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final int mo4291a() {
        return -1;
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final void mo4293a(int i) {
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: b */
    public final int mo4295b() {
        return 1;
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: c */
    public final CharSequence mo4297c() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1393bh(ColorLoadingView colorLoadingView) {
        this.f6957a = colorLoadingView;
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final void mo4294a(int i, Rect rect) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = this.f6957a.f6172e;
            i3 = this.f6957a.f6173f;
            rect.set(0, 0, i2, i3);
        }
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: a */
    public final int mo4292a(float f, float f2) {
        int i;
        int i2;
        if (f < 0.0f) {
            return -1;
        }
        i = this.f6957a.f6172e;
        if (f > i || f2 < 0.0f) {
            return -1;
        }
        i2 = this.f6957a.f6173f;
        return f2 <= ((float) i2) ? 0 : -1;
    }

    @Override // com.color.support.p048c.p049a.InterfaceC1311b
    /* renamed from: b */
    public final CharSequence mo4296b(int i) {
        String str;
        String str2;
        str = this.f6957a.f6186s;
        if (str != null) {
            str2 = this.f6957a.f6186s;
            return str2;
        }
        return getClass().getSimpleName();
    }
}
