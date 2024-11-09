package com.google.android.material.slider;

/* compiled from: Slider.java */
/* renamed from: com.google.android.material.slider.b */
/* loaded from: classes.dex */
public final class RunnableC2321b implements Runnable {

    /* renamed from: a */
    int f10266a;

    /* renamed from: b */
    final /* synthetic */ Slider f10267b;

    private RunnableC2321b(Slider slider) {
        this.f10267b = slider;
        this.f10266a = -1;
    }

    public /* synthetic */ RunnableC2321b(Slider slider, byte b) {
        this(slider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2322c c2322c;
        c2322c = this.f10267b.f10240i;
        c2322c.m2079a(this.f10266a, 4);
    }
}
